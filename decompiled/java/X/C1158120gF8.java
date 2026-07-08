package X;

import kotlin.jvm.internal.AFwS206S0000000_18;

/* JADX INFO: renamed from: X.0gF8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1158120gF8 {
    public static final C1158110gF7 LIZ = new C1158110gF7(2202009600L, 2411724800L, 2621440000L, 2831155200L);
    public static final C1158110gF7 LIZIZ = new C1158110gF7(3145728000L, 3355443200L, 3565158400L, 3774873600L);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS206S0000000_18.get$arr$(695));

    public static int LIZ(long j) {
        C01GW c01gw = LIZJ;
        if (j >= ((C1158110gF7) c01gw.getValue()).LIZLLL) {
            return C09Q3.EXTREME.ordinal();
        }
        if (j >= ((C1158110gF7) c01gw.getValue()).LIZJ) {
            return C09Q3.HIGH.ordinal();
        }
        if (j >= ((C1158110gF7) c01gw.getValue()).LIZIZ) {
            return C09Q3.MEDIUM.ordinal();
        }
        if (j >= ((C1158110gF7) c01gw.getValue()).LIZ) {
            return C09Q3.LOW.ordinal();
        }
        return C09Q3.UNKNOWN.ordinal();
    }
}
