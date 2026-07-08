package com.bytedance.android.live.base.model.roomcomponents;

import X.C09CT;

/* JADX INFO: loaded from: classes.dex */
public final class OnlineRankConfig {

    @C09CT("avatar_count")
    public int avatarNumber;

    @C09CT("show_avatar_list")
    public boolean avatarShow;

    @C09CT("can_panel_click")
    public boolean onlinePanelClick;

    @C09CT("show_online_panel")
    public boolean onlinePanelShow;

    @C09CT("show_score")
    public boolean scoreShow;

    public OnlineRankConfig() {
        this(true, true, true, 2, true);
    }

    public OnlineRankConfig(boolean z, boolean z2, boolean z3, int i, boolean z4) {
        this.onlinePanelShow = z;
        this.onlinePanelClick = z2;
        this.avatarShow = z3;
        this.avatarNumber = i;
        this.scoreShow = z4;
    }
}
