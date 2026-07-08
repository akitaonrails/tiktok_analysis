package com.bytedance.android.live.liveinteract.multilive.model;

import X.C09CT;
import java.util.List;
import tikcast.linkmic.common.PosIdentity;

/* JADX INFO: loaded from: classes.dex */
public final class EnlargeScreenManageResponse {

    @C09CT("data")
    public ResponseData data;

    @C09CT("extra")
    public Extra extra;

    @C09CT("linked_user_ui_positions")
    public List<String> linkedUserUiPositions;

    public static final class Extra {

        @C09CT("now")
        public long now;
    }

    public static final class ResponseData {

        @C09CT("enlarge_linkmic_id")
        public String enlargeLinkmicId = "";

        @C09CT("enlarge_position")
        public String enlargePosition = "";

        @C09CT("enlarged_multi_pos")
        public List<PosIdentity> enlargedMultiPos;
    }
}
