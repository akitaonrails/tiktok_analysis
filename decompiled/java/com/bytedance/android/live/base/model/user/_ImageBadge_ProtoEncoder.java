package com.bytedance.android.live.base.model.user;

import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;

/* JADX INFO: loaded from: classes18.dex */
public final class _ImageBadge_ProtoEncoder implements InterfaceC1132110fZB<ImageBadge> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, ImageBadge imageBadge) {
        ImageBadge imageBadge2 = imageBadge;
        int i = imageBadge2.badgeDisplayType;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LIZJ(i);
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 2, imageBadge2.imageModel);
    }
}
