package com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.quickconnect;

/* JADX INFO: loaded from: classes16.dex */
public final class AnchorQuickConnectAbilityImpl implements IAnchorQuickConnectAbility {
    public final MultiGuestAnchorQuickConnectViewModel LL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.userinfo.anchor.quickconnect.IAnchorQuickConnectAbility
    public final MultiGuestAnchorQuickConnectViewModel getViewModel() {
        return this.LL;
    }

    public AnchorQuickConnectAbilityImpl(MultiGuestAnchorQuickConnectViewModel multiGuestAnchorQuickConnectViewModel) {
        this.LL = multiGuestAnchorQuickConnectViewModel;
    }
}
