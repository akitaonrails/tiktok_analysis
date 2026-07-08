package com.bytedance.android.live.liveinteract.multiguestv3.main.play.playbook.playentity;

import X.C09CT;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.utils.setting.MultiGuestGuestShowdownConfigSetting;

/* JADX INFO: loaded from: classes.dex */
public final class GuestShowdownEntityConfig {

    @C09CT("duration")
    public long duration;

    @C09CT("loser_num")
    public int loserNum;

    @C09CT("winner_num")
    public int winnerNum;

    public GuestShowdownEntityConfig() {
        this(0L, 0, MultiGuestGuestShowdownConfigSetting.INSTANCE.getSettingValue().defaultWinnerNum);
    }

    public GuestShowdownEntityConfig(long j, int i, int i2) {
        this.duration = j;
        this.loserNum = i;
        this.winnerNum = i2;
    }
}
