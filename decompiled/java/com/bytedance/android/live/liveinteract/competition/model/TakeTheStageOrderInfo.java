package com.bytedance.android.live.liveinteract.competition.model;

import X.C09CT;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public final class TakeTheStageOrderInfo {

    @C09CT("anchors")
    public List<AnchorInfo> anchors = new ArrayList();

    @C09CT("initiator")
    public CompetitionUserBase initiator;

    @C09CT("switch_turn_reason")
    public int switchTurnReason;

    public static final class AnchorInfo {

        @C09CT("default_order")
        public long defaultOrder;

        @C09CT("user_id")
        public long userId;
    }
}
