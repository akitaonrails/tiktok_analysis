package X;

import kotlin.jvm.internal.AwS125S0101000_17;
import kotlin.jvm.internal.AwS51S0100100_17;

/* JADX INFO: renamed from: X.0fPm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1126280fPm {
    public static C1126370fPv LIZ;

    public static void LIZ(C0GSA c0gsa, int i, boolean z) {
        long j;
        C1126370fPv c1126370fPvLIZ;
        if (c0gsa == null) {
            return;
        }
        C1126370fPv c1126370fPv = LIZ;
        if (c1126370fPv != null) {
            if (c1126370fPv.LIZIZ()) {
                c1126370fPv.LIZ();
            }
            LIZ = null;
        }
        if (z) {
            if (i > 20) {
                c0gsa.setBorderAlpha1(64);
                return;
            } else {
                c1126370fPvLIZ = C1126360fPu.LIZ(new AwS125S0101000_17(c0gsa, i, 6));
                c1126370fPvLIZ.LIZJ();
            }
        } else {
            if (i >= 20) {
                j = 1000;
            } else {
                j = ((long) i) * 50;
            }
            c1126370fPvLIZ = C1126360fPu.LIZ(new AwS51S0100100_17(c0gsa, j, 2));
            c1126370fPvLIZ.LIZJ();
        }
        LIZ = c1126370fPvLIZ;
    }
}
