package com.bytedance.android.live.liveinteract.multiguestv3.main.guest.guestinvite;

/* JADX INFO: loaded from: classes16.dex */
public final class GuestInviteAbilityImpl implements IGuestInviteAbility {
    public final GuestInviteViewModel LL;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.guest.guestinvite.IGuestInviteAbility
    public final GuestInviteViewModel getViewModel() {
        return this.LL;
    }

    public GuestInviteAbilityImpl(GuestInviteViewModel guestInviteViewModel) {
        this.LL = guestInviteViewModel;
    }
}
