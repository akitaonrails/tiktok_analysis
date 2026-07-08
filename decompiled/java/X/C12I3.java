package X;

/* JADX INFO: renamed from: X.12I3, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12I3 {
    public static final /* synthetic */ int LIZ = 0;

    public static float LIZ(C12I4 c12i4) {
        float f;
        int i;
        if (c12i4.LIZ) {
            int i2 = c12i4.LJFF;
            if (i2 >= 0) {
                f = i2 / 50.0f;
                i = c12i4.LIZJ;
            } else {
                f = i2 / (-50.0f);
                i = c12i4.LIZLLL;
            }
            return f * i;
        }
        int i3 = c12i4.LIZJ;
        return (((i3 - r2) / 100.0f) * c12i4.LJFF) + c12i4.LIZLLL;
    }

    public static C12I4 LIZIZ(C12I4 c12i4) {
        boolean z = false;
        C12I4 c12i42 = new C12I4(false, 0, 0, 0.0f, 0, 0.0f, 2047);
        if (c12i4.LIZ) {
            c12i42.LIZIZ = 50;
            float f = c12i4.LJ;
            if (f >= 0.0f) {
                c12i42.LJFF = (int) (((f / c12i4.LIZJ) * 50.0f) + 0.5f);
            } else {
                c12i42.LJFF = -((int) (((f / c12i4.LIZLLL) * 50.0f) + 0.5f));
            }
            if (c12i42.LJFF == 0) {
                z = true;
            }
            c12i42.LJI = z;
            return c12i42;
        }
        c12i42.LIZIZ = 100;
        int i = (int) ((((c12i4.LJ - c12i4.LIZLLL) / (c12i4.LIZJ - r1)) * 100.0f) + 0.5f);
        c12i42.LJFF = i;
        if (i == 0) {
            z = true;
        }
        c12i42.LJI = z;
        return c12i42;
    }
}
