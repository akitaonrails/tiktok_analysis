package com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.guest;

import X.C158B;
import X.C299601Ec;
import com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseCountdownViewModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;

/* JADX INFO: loaded from: classes.dex */
public final class CountdownGuestViewModel extends BaseCountdownViewModel {
    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseCountdownViewModel
    public final String getTag() {
        return "CountdownGuestViewModel";
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.countdown.base.BaseCountdownViewModel
    public final long xQ2(C299601Ec c299601Ec) {
        long jLIZ = C158B.LIZ() - c299601Ec.LJFF;
        long j = c299601Ec.LJ;
        long j2 = LSPassThroughRecordSizeConfig.DEFAULT;
        return Math.max((30000 - (jLIZ - (j * j2))) / j2, 0L);
    }
}
