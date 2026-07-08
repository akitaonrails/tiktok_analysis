package X;

/* JADX INFO: renamed from: X.0tpd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1680470tpd {
    public static final C1680470tpd LJ = new C1680470tpd(0, 0, 0, 0);
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1680470tpd)) {
            return false;
        }
        C1680470tpd c1680470tpd = (C1680470tpd) obj;
        return this.LIZ == c1680470tpd.LIZ && this.LIZIZ == c1680470tpd.LIZIZ && this.LIZJ == c1680470tpd.LIZJ && this.LIZLLL == c1680470tpd.LIZLLL;
    }

    public final long LIZ() {
        int i = this.LIZ;
        return (((long) this.LIZIZ) & 4294967295L) | (((long) i) << 32);
    }

    public C1680470tpd(int i, int i2, int i3, int i4) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
    }
}
