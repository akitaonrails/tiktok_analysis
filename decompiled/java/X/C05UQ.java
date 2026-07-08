package X;

/* JADX INFO: renamed from: X.05UQ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C05UQ {
    public static final /* synthetic */ int LJ = 0;
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C05UQ)) {
            return false;
        }
        C05UQ c05uq = (C05UQ) obj;
        return Float.compare(this.LIZ, c05uq.LIZ) == 0 && Float.compare(this.LIZIZ, c05uq.LIZIZ) == 0 && Float.compare(this.LIZJ, c05uq.LIZJ) == 0 && Float.compare(this.LIZLLL, c05uq.LIZLLL) == 0;
    }

    public C05UQ(float f, float f2, float f3, float f4) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
    }
}
