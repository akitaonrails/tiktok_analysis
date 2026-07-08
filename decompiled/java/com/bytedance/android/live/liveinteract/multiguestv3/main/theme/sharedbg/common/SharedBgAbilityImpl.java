package com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common;

import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.anchor.MultiGuestSharedBgAnchorViewModel;
import com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.guest.MultiGuestSharedBgGuestViewModel;

/* JADX INFO: loaded from: classes16.dex */
public final class SharedBgAbilityImpl implements ISharedBgAbility {
    public final MultiGuestSharedBgAnchorViewModel LL;
    public final MultiGuestSharedBgGuestViewModel LLILLJJLI;

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility
    public final MultiGuestSharedBgAnchorViewModel GL0() {
        return this.LL;
    }

    @Override // com.bytedance.android.live.liveinteract.multiguestv3.main.theme.sharedbg.common.ISharedBgAbility
    public final MultiGuestSharedBgGuestViewModel Go2() {
        return this.LLILLJJLI;
    }

    public SharedBgAbilityImpl(MultiGuestSharedBgAnchorViewModel multiGuestSharedBgAnchorViewModel, MultiGuestSharedBgGuestViewModel multiGuestSharedBgGuestViewModel) {
        this.LL = multiGuestSharedBgAnchorViewModel;
        this.LLILLJJLI = multiGuestSharedBgGuestViewModel;
    }
}
