/*
 * Copyright 2018-2019 Baoyi Chen
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.moilioncircle.redis.rdb.cli.ext.datatype;

import com.moilioncircle.redis.replicator.rdb.datatype.KeyValuePair;

/**
 * @author Baoyi Chen
 */
public class DummyKeyValuePair extends KeyValuePair<byte[], Long> {
    private static final long serialVersionUID = 1L;
    
    private long max;
    
    private long length;
    
    private boolean contains;
    
    public long getMax() {
        return max;
    }
    
    public void setMax(long max) {
        this.max = max;
    }
    
    public long getLength() {
        return length;
    }
    
    public void setLength(long length) {
        this.length = length;
    }
    
    public boolean isContains() {
        return contains;
    }
    
    public void setContains(boolean contains) {
        this.contains = contains;
    }
    
}
