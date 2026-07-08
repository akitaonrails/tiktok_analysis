package X;

/* JADX INFO: renamed from: X.0fgu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1136900fgu {
    public final int LIZ;
    public final long LIZIZ;
    public final long LIZJ;
    public final int LIZLLL;

    public C1136900fgu() {
        this(0L, 0, 15);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1136900fgu)) {
            return false;
        }
        C1136900fgu c1136900fgu = (C1136900fgu) obj;
        return this.LIZ == c1136900fgu.LIZ && this.LIZIZ == c1136900fgu.LIZIZ && this.LIZJ == c1136900fgu.LIZJ && this.LIZLLL == c1136900fgu.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + C786410Ut5.Y2(this.LIZIZ)) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + this.LIZLLL;
    }

    public /* synthetic */ C1136900fgu(long j, int i, int i2) {
        this(0, 0L, (i2 & 4) != 0 ? 0L : j, (i2 & 8) != 0 ? 0 : i);
    }

    public static C1136900fgu LIZ(C1136900fgu c1136900fgu, int i, int i2) {
        long j;
        int i3;
        int i4 = i;
        if ((i2 & 1) != 0) {
            i4 = c1136900fgu.LIZ;
        }
        long j2 = 0;
        if ((i2 & 2) != 0) {
            j = c1136900fgu.LIZIZ;
        } else {
            j = 0;
        }
        if ((i2 & 4) != 0) {
            j2 = c1136900fgu.LIZJ;
        }
        if ((i2 & 8) != 0) {
            i3 = c1136900fgu.LIZLLL;
        } else {
            i3 = 0;
        }
        c1136900fgu.getClass();
        return new C1136900fgu(i4, j, j2, i3);
    }

    public C1136900fgu(int i, long j, long j2, int i2) {
        this.LIZ = i;
        this.LIZIZ = j;
        this.LIZJ = j2;
        this.LIZLLL = i2;
    }
}
