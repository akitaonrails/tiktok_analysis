package X;

/* JADX INFO: renamed from: X.0eLO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1085120eLO {
    public final int LIZ;
    public final boolean LIZIZ;
    public int LIZJ;

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1085120eLO)) {
            return false;
        }
        C1085120eLO c1085120eLO = (C1085120eLO) obj;
        if (c1085120eLO.LIZIZ != this.LIZIZ || c1085120eLO.LIZ != this.LIZ || c1085120eLO.LIZJ != this.LIZJ) {
            return false;
        }
        return true;
    }

    public C1085120eLO(int i, int i2, boolean z) {
        this.LIZ = i;
        this.LIZJ = i2;
        this.LIZIZ = z;
    }
}
