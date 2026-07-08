package com.bytedance.android.live.base.model.user;

import X.C1142350fph;
import X.InterfaceC1132110fZB;
import com.bytedance.android.live.base.model._ImageModel_ProtoEncoder;

/* JADX INFO: loaded from: classes18.dex */
public final class _IconConfig_ProtoEncoder implements InterfaceC1132110fZB<IconConfig> {
    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, IconConfig iconConfig) {
        IconConfig iconConfig2 = iconConfig;
        _ImageModel_ProtoEncoder.LIZJ(c1142350fph, 1, iconConfig2.icon);
        _CombineBadgeBackground_ProtoEncoder.LIZJ(c1142350fph, 2, iconConfig2.background);
    }
}
