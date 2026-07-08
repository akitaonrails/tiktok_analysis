package X;

/* JADX INFO: renamed from: X.0Kz0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C535280Kz0 {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C535280Kz0)) {
            return false;
        }
        C535280Kz0 c535280Kz0 = (C535280Kz0) obj;
        return this.LIZ == c535280Kz0.LIZ && this.LIZIZ == c535280Kz0.LIZIZ && this.LIZJ == c535280Kz0.LIZJ && this.LIZLLL == c535280Kz0.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public static C535280Kz0 LIZ(C535280Kz0 c535280Kz0, int i) {
        int i2 = c535280Kz0.LIZ;
        int i3 = c535280Kz0.LIZJ;
        boolean z = c535280Kz0.LIZLLL;
        c535280Kz0.getClass();
        return new C535280Kz0(i2, i, i3, z);
    }

    public C535280Kz0(int i, int i2, int i3, boolean z) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = z;
    }
}
