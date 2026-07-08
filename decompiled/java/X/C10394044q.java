package X;

/* JADX INFO: renamed from: X.044q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C10394044q {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;

    public C10394044q(int i, int i2, int i3) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
    }

    public static C10394044q LIZ(C10394044q c10394044q, int i, int i2, int i3, int i4) {
        if ((i4 & 1) != 0) {
            i = c10394044q.LIZ;
        }
        if ((i4 & 2) != 0) {
            i2 = c10394044q.LIZIZ;
        }
        if ((i4 & 4) != 0) {
            i3 = c10394044q.LIZJ;
        }
        c10394044q.getClass();
        return new C10394044q(i, i2, i3);
    }
}
