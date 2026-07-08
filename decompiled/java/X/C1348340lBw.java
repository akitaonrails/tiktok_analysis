package X;

import android.os.Build;

/* JADX INFO: renamed from: X.0lBw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1348340lBw {
    public static final int LIZIZ;
    public static final C01GW LIZLLL;
    public static final C01GW LJ;
    public static final C01GW LJFF;
    public static final C1348340lBw LIZ = new C1348340lBw();
    public static volatile boolean LIZJ = true;

    static {
        LIZIZ = 4;
        if (Build.VERSION.SDK_INT <= 28) {
            LIZIZ = 3;
        } else {
            LIZIZ = 4;
        }
        EnumC452301pR enumC452301pR = EnumC452301pR.PUBLICATION;
        LIZLLL = C452501pT.LIZ(enumC452301pR, new C1348350lBx());
        LJ = C452501pT.LIZ(enumC452301pR, new C1348370lBz());
        LJFF = C452501pT.LIZ(enumC452301pR, new C1348360lBy());
    }
}
