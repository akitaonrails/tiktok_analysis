package X;

/* JADX INFO: renamed from: X.0rDv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1580210rDv {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final C1580210rDv LIZ(C1580210rDv c1580210rDv) {
        if (c1580210rDv == null) {
            return this;
        }
        return new C1580210rDv(this.LIZ + c1580210rDv.LIZ, this.LIZIZ + c1580210rDv.LIZIZ, this.LIZJ + c1580210rDv.LIZJ, this.LIZLLL + c1580210rDv.LIZLLL);
    }

    public C1580210rDv(int i, int i2, int i3, int i4) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
    }

    public /* synthetic */ C1580210rDv(int i, int i2, int i3, int i4, int i5) {
        this((i5 & 1) != 0 ? 0 : i, (i5 & 2) != 0 ? 0 : i2, (i5 & 4) != 0 ? 0 : i3, (i5 & 8) != 0 ? 0 : i4);
    }
}
