package com.bytedance.android.live.effect;

import X.C0PEM;
import X.C0U8T;
import X.C0UA1;
import X.C0UD4;
import X.C1DFH;
import X.C2107308Nj;
import X.C2296808zG;
import X.C23250099c;
import X.C760510TsP;
import X.C760520TsQ;
import X.C760530TsR;
import X.C760540TsS;
import com.bytedance.android.livesdkapi.depend.model.LiveEffect;

/* JADX INFO: loaded from: classes13.dex */
public final class LiveEffectTestHelper {
    public static final LiveEffectTestHelper INSTANCE = new LiveEffectTestHelper();

    public static final void removeEffect() {
        C0UA1.LIZ().lr(C0UD4.LIZIZ);
    }

    public static final void removeFilter() {
        C0UA1.LIZ().lr("livefiltercomposer");
    }

    public static final void removeMakeUp() {
        for (LiveEffect liveEffect : C0UA1.LIZ().LJ(C0UD4.LJFF)) {
            if (liveEffect.LJIILIIL() && !liveEffect.LLLIIII()) {
                C0UA1.LIZ().LJIIJ(liveEffect, C0UD4.LJFF);
            }
        }
    }

    public static final boolean isUsingEffect(String str, String str2) {
        return C0U8T.LIZ.LJIIIIZZ(str, str2);
    }

    public static final void setEffect(String str, String str2) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C760520TsQ(str, str2, null), 3);
    }

    public static final void updateFilter(String str, int i) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C760540TsS(i, str, null), 3);
    }

    public static final void updateBeauty(String str, String str2, int i) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C760510TsP(i, str, str2, null), 3);
    }

    public static final void updateMakeUp(String str, String str2, int i) {
        C1DFH c1dfh = C0PEM.LIZ;
        C23250099c.LIZLLL(C2296808zG.LIZ(C2107308Nj.LIZ), null, null, new C760530TsR(i, str, str2, null), 3);
    }
}
