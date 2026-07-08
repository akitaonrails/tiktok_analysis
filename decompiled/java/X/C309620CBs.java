package X;

import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0CBs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C309620CBs {
    public static final boolean LIZ;
    public static final boolean LIZIZ;
    public static final boolean LIZJ;
    public static final boolean LIZLLL;
    public static final boolean LJ;

    static {
        int iIntValue = ((Number) C1827607Du.LIZJ(C1785606z0.LIZ(), 14, AFwS190S0000000_4.get$arr$(1487))).intValue();
        if (C2187451AjH.LJIIJ() && iIntValue == 46) {
            iIntValue = 65535;
        }
        LIZ = (iIntValue & 2) != 0;
        LIZIZ = (iIntValue & 4) != 0;
        LIZJ = (iIntValue & 8) != 0;
        LIZLLL = (iIntValue & 16) != 0;
        LJ = (iIntValue & 32) != 0;
    }
}
