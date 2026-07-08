package com.bytedance.android.live.base.model.user;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _StringBadge_ProtoEncoder implements InterfaceC1132110fZB<StringBadge> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, StringBadge stringBadge) {
        StringBadge stringBadge2 = stringBadge;
        int i = stringBadge2.badgeDisplayType;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LIZJ(i);
        C1142340fpg.LJFF(c1142350fph, 2, stringBadge2.contentStr);
    }
}
