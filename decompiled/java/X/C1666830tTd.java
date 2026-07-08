package X;

/* JADX INFO: renamed from: X.0tTd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1666830tTd {
    public int LIZ;
    public int LIZIZ;
    public boolean LIZJ;

    public C1666830tTd() {
        this(0);
    }

    public C1666830tTd(int i) {
        this.LIZ = 0;
        this.LIZIZ = 0;
        this.LIZJ = false;
    }

    public final boolean equals(Object obj) {
        C1666830tTd c1666830tTd;
        if (obj instanceof C1666830tTd) {
            c1666830tTd = (C1666830tTd) obj;
        } else {
            c1666830tTd = null;
        }
        if (c1666830tTd == null || this.LIZ != c1666830tTd.LIZ || this.LIZIZ != c1666830tTd.LIZIZ || this.LIZJ != c1666830tTd.LIZJ) {
            return false;
        }
        return true;
    }
}
