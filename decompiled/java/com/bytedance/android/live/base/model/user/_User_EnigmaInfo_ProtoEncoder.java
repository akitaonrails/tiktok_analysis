package com.bytedance.android.live.base.model.user;

import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model.user.User;

/* JADX INFO: loaded from: classes18.dex */
public final class _User_EnigmaInfo_ProtoEncoder implements InterfaceC1132110fZB<User.EnigmaInfo> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, User.EnigmaInfo enigmaInfo) {
        boolean z = enigmaInfo.isEnigmaMaskOn;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJ(z ? 1 : 0);
    }
}
