package com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.guest;

import X.C01ZI;
import X.C01ZJ;
import com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.common.BaseTopGuestGamePlayViewModel;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: loaded from: classes.dex */
public final class TopGuestGamePlayGuestViewModel extends BaseTopGuestGamePlayViewModel {
    public final C01ZJ LLILZ;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.common.BaseTopGuestGamePlayViewModel
    public final String wQ2() {
        return "TopGuestGamePlayGuestViewModel";
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.play.topguest.common.BaseTopGuestGamePlayViewModel
    public final /* bridge */ /* synthetic */ C01ZI vQ2() {
        return this.LLILZ;
    }

    public TopGuestGamePlayGuestViewModel(DataChannel dataChannel) {
        this.LLILZ = new C01ZJ(dataChannel);
    }
}
