package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DQJ, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DQJ {
    public static C1DQK LIZ(String str) {
        for (C1DQK c1dqk : C1DQK.values()) {
            if (Intrinsics.LJFF(str, c1dqk.getVALUE())) {
                return c1dqk;
            }
        }
        Integer numLJIIJJI = C2095008Iq.LJIIJJI(str);
        if (numLJIIJJI != null) {
            int iIntValue = numLJIIJJI.intValue();
            C1DQK.Companion.getClass();
            for (C1DQK c1dqk2 : C1DQK.values()) {
                if (iIntValue == c1dqk2.getVALUE_INT()) {
                    return c1dqk2;
                }
            }
        }
        return null;
    }
}
