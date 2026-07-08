package com.bytedance.android.live.base.model.user;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;

/* JADX INFO: loaded from: classes18.dex */
public final class _SubscribeBadge_ProtoEncoder implements InterfaceC1132110fZB<SubscribeBadge> {
    public static int LIZIZ(SubscribeBadge subscribeBadge) {
        return _ImageModel_ProtoEncoder.LJ(3, subscribeBadge.originImage) + _ImageModel_ProtoEncoder.LJ(4, subscribeBadge.previewImage) + C1142340fpg.LJI(5);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, SubscribeBadge subscribeBadge) {
        SubscribeBadge subscribeBadge2 = subscribeBadge;
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 3, subscribeBadge2.originImage);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 4, subscribeBadge2.previewImage);
        boolean z = subscribeBadge2.isCustomized;
        c1142350fph.LIZLLL(5, 0);
        c1142350fph.LJ(z ? 1 : 0);
    }
}
