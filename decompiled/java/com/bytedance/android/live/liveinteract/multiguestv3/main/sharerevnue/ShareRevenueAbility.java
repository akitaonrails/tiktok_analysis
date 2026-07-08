package com.bytedance.android.live.liveinteract.multiguestv3.main.sharerevnue;

/* JADX INFO: loaded from: classes16.dex */
public final class ShareRevenueAbility implements ISharedRevenueAbility {
    public final MultiGuestAnchorShareRevenueViewModel LL;
    public final MultiGuestGuestShareRevenueViewModel LLILLJJLI;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.sharerevnue.ISharedRevenueAbility
    public final MultiGuestAnchorShareRevenueViewModel Kn1() {
        return this.LL;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.sharerevnue.ISharedRevenueAbility
    public final MultiGuestGuestShareRevenueViewModel MB() {
        return this.LLILLJJLI;
    }

    public ShareRevenueAbility(MultiGuestAnchorShareRevenueViewModel multiGuestAnchorShareRevenueViewModel, MultiGuestGuestShareRevenueViewModel multiGuestGuestShareRevenueViewModel) {
        this.LL = multiGuestAnchorShareRevenueViewModel;
        this.LLILLJJLI = multiGuestGuestShareRevenueViewModel;
    }
}
