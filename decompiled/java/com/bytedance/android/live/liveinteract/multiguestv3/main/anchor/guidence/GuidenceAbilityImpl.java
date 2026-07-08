package com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.guidence;

/* JADX INFO: loaded from: classes16.dex */
public final class GuidenceAbilityImpl implements IGuidenceAbility {
    public final MultiGuestGuidenceViewModel LL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.anchor.guidence.IGuidenceAbility
    public final MultiGuestGuidenceViewModel getViewModel() {
        return this.LL;
    }

    public GuidenceAbilityImpl(MultiGuestGuidenceViewModel multiGuestGuidenceViewModel) {
        this.LL = multiGuestGuidenceViewModel;
    }
}
