package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import java.util.LinkedHashMap;
import java.util.Map;
import webcast.data.multi_guest_play.TextHeaderPlayContent;

/* JADX INFO: loaded from: classes.dex */
public final class GetMemoryInfoResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("failed_memory_map")
        public Map<String, String> failedMemoryMap = new LinkedHashMap();

        @C09CT("memory_info")
        public MemoryInfo memoryInfo;

        public static final class MemoryInfo {

            @C09CT("text_header")
            public TextHeaderPlayContent textHeader;
        }
    }
}
