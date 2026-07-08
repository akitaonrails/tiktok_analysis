package X;

/* JADX INFO: renamed from: X.18an, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21312318an {
    public final long LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final int LJ;

    public C21312318an() {
        this(0);
    }

    public /* synthetic */ C21312318an(int i) {
        this(-1L, 0, 0, 0, 0);
    }

    public C21312318an(long j, int i, int i2, int i3, int i4) {
        this.LIZ = j;
        this.LIZIZ = i;
        this.LIZJ = i2;
        this.LIZLLL = i3;
        this.LJ = i4;
    }

    public static C21312318an LIZ(C21312318an c21312318an, long j, int i, int i2, int i3) {
        int i4;
        int i5;
        int i6 = i2;
        int i7 = i;
        long j2 = j;
        if ((i3 & 1) != 0) {
            j2 = c21312318an.LIZ;
        }
        if ((i3 & 2) != 0) {
            i7 = c21312318an.LIZIZ;
        }
        if ((i3 & 4) != 0) {
            i6 = c21312318an.LIZJ;
        }
        if ((i3 & 8) != 0) {
            i4 = c21312318an.LIZLLL;
        } else {
            i4 = 0;
        }
        if ((i3 & 16) != 0) {
            i5 = c21312318an.LJ;
        } else {
            i5 = 0;
        }
        c21312318an.getClass();
        return new C21312318an(j2, i7, i6, i4, i5);
    }
}
