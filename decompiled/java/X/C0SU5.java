package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;

/* JADX INFO: renamed from: X.0SU5, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SU5 {
    public static final C0SU5 LIZ = new C0SU5();
    public static int LIZIZ = 1;
    public static int LIZJ;
    public static Aweme LIZLLL;
    public static boolean LJ;
    public static int LJFF;

    public static C0SU5 LIZIZ(int i, Aweme aweme, int i2, int i3) {
        if ((i3 & 4) != 0) {
            i2 = 0;
        }
        C0SU5 c0su5 = LIZ;
        LIZIZ = i;
        LIZJ = i2;
        LIZLLL = aweme;
        LJ = false;
        LJFF = 0;
        return c0su5;
    }

    public static C0SU5 LIZ(int i, Aweme aweme, int i2, int i3, int i4) {
        if ((i4 & 4) != 0) {
            i2 = 0;
        }
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        C0SU5 c0su5 = LIZ;
        LIZIZ = i;
        LIZJ = i2;
        LIZLLL = aweme;
        LJ = true;
        LJFF = i3;
        return c0su5;
    }
}
