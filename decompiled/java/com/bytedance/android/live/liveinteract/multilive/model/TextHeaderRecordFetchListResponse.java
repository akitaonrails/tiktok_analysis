package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import webcast.data.multi_guest_play.TextHeaderRecordInfo;
import webcast.data.multi_guest_play.TextHeaderTemplateExt;

/* JADX INFO: loaded from: classes.dex */
public final class TextHeaderRecordFetchListResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("text_header_record_list")
        public List<TextHeaderRecordInfo> textHeaderRecordList = new ArrayList();

        @C09CT("template_record_list")
        public List<TextHeaderRecordInfo> templateRecordList = new ArrayList();

        @C09CT("template_exts")
        public Map<Long, TextHeaderTemplateExt> templateExts = new LinkedHashMap();
    }
}
