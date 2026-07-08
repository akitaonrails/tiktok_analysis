package com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.guest;

import X.C01I4;
import X.C01IJ;
import X.C15B9;
import X.InterfaceC938550aWz;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes.dex */
public final class GuestShowdownGuestViewModel extends BaseGuestShowdownViewModel {
    public final DataChannel LLJ;
    public final C01IJ LLJI;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownViewModel
    public final String BQ2() {
        return "GuestShowdownGuestViewModel";
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownViewModel
    public final InterfaceC938550aWz vQ2() {
        C15B9 c15b9 = this.LLIZ;
        if (c15b9 != null) {
            return c15b9;
        }
        C15B9 c15b92 = new C15B9(this.LLJ);
        this.LLIZ = c15b92;
        c15b92.LJFF("onCreate");
        return c15b92;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.guestshowdown.common.BaseGuestShowdownViewModel
    public final /* bridge */ /* synthetic */ C01I4 xQ2() {
        return this.LLJI;
    }

    public GuestShowdownGuestViewModel(DataChannel dataChannel) {
        this.LLJ = dataChannel;
        this.LLJI = new C01IJ(dataChannel);
    }
}
