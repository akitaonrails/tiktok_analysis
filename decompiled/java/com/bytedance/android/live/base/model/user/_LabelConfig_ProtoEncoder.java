package com.bytedance.android.live.base.model.user;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _LabelConfig_ProtoEncoder implements InterfaceC1132110fZB<LabelConfig> {
    public static int LIZIZ(LabelConfig labelConfig) {
        return C1142340fpg.LJIILL(1, labelConfig.label) + _FontStyle_ProtoEncoder.LJ(2, labelConfig.fontStyle) + _CombineBadgeBackground_ProtoEncoder.LJ(3, labelConfig.background);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, LabelConfig labelConfig) {
        LabelConfig labelConfig2 = labelConfig;
        C1142340fpg.LJFF(c1142350fph, 1, labelConfig2.label);
        _FontStyle_ProtoEncoder.LIZJ(c1142350fph, 2, labelConfig2.fontStyle);
        _CombineBadgeBackground_ProtoEncoder.LIZJ(c1142350fph, 3, labelConfig2.background);
    }
}
