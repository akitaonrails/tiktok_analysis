package X;

/* JADX INFO: renamed from: X.0dKP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public class C1046070dKP {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;
    public final String LJ;

    public final int LIZ() {
        return (this.LIZLLL - this.LIZIZ) * (this.LIZJ - this.LIZ);
    }

    public final C1046070dKP LIZIZ(C1046070dKP c1046070dKP) {
        return new C1046070dKP(Math.max(this.LIZ, c1046070dKP.LIZ), Math.max(this.LIZIZ, c1046070dKP.LIZIZ), Math.min(this.LIZJ, c1046070dKP.LIZJ), Math.min(this.LIZLLL, c1046070dKP.LIZLLL), c1046070dKP.LJ);
    }

    public C1046070dKP(int i, int i2, int i3, int i4, String str) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = str;
    }
}
