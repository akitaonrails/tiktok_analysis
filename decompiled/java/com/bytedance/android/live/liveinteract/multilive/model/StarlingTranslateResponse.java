package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class StarlingTranslateResponse {

    @C09CT("data")
    public ResponseData data;

    public static final class ResponseData {

        @C09CT("starling_translate_info")
        public List<StarlingTranslateInfo> starlingTranslateInfo = new ArrayList();
    }
}
