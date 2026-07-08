package com.bytedance.android.live.base.model.user;

import X.C1142340fpg;
import X.C1142350fph;
import X.InterfaceC1132110fZB;

/* JADX INFO: loaded from: classes18.dex */
public final class _NumberConfig_ProtoEncoder implements InterfaceC1132110fZB<NumberConfig> {
    public static int LIZIZ(NumberConfig numberConfig) {
        return C1142340fpg.LJIIL(1, numberConfig.number) + _FontStyle_ProtoEncoder.LJ(2, numberConfig.fontStyle) + _CombineBadgeBackground_ProtoEncoder.LJ(3, numberConfig.background);
    }

    @Override // X.InterfaceC1132110fZB
    public final void LIZ(C1142350fph c1142350fph, NumberConfig numberConfig) {
        NumberConfig numberConfig2 = numberConfig;
        long j = numberConfig2.number;
        c1142350fph.LIZLLL(1, 0);
        c1142350fph.LJFF(j);
        _FontStyle_ProtoEncoder.LIZJ(c1142350fph, 2, numberConfig2.fontStyle);
        _CombineBadgeBackground_ProtoEncoder.LIZJ(c1142350fph, 3, numberConfig2.background);
    }
}
