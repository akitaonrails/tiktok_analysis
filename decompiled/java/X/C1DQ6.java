package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1DQ6, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1DQ6 {
    public static C1DQ5 LIZ(String str) {
        for (C1DQ5 c1dq5 : C1DQ5.values()) {
            if (Intrinsics.LJFF(str, c1dq5.getVALUE())) {
                return c1dq5;
            }
        }
        Integer numLJIIJJI = C2095008Iq.LJIIJJI(str);
        if (numLJIIJJI != null) {
            int iIntValue = numLJIIJJI.intValue();
            C1DQ5.Companion.getClass();
            for (C1DQ5 c1dq52 : C1DQ5.values()) {
                if (iIntValue == c1dq52.getVALUE_INT()) {
                    return c1dq52;
                }
            }
        }
        return null;
    }
}
