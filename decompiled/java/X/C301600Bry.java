package X;

import kotlin.jvm.internal.AFwS190S0000000_4;

/* JADX INFO: renamed from: X.0Bry, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C301600Bry {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS190S0000000_4.get$arr$(2169));

    public static int LIZJ() {
        return ((Number) LIZ.getValue()).intValue();
    }

    public static boolean LIZ() {
        return LIZJ() == 3 || LIZJ() == 4;
    }

    public static boolean LIZIZ() {
        return LIZJ() == 2 || LIZ() || LIZJ() == 4;
    }

    public static boolean LIZLLL() {
        return LIZJ() == 1 || LIZIZ() || LIZ() || LIZJ() == 4;
    }
}
