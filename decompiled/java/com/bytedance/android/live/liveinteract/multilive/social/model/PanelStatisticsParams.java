package com.bytedance.android.live.liveinteract.multilive.social.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes16.dex */
public final class PanelStatisticsParams {

    @C09CT("data")
    public List<ReqParam> data = new ArrayList();

    @C09CT("room_id")
    public long roomId;

    public static final class ReqParam {

        @C09CT("user_id")
        public long userId;
    }
}
