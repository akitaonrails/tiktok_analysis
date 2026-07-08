package X;

/* JADX INFO: renamed from: X.1AZ2, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AZ2 {
    public final double LIZ;
    public final double LIZIZ;
    public final double LIZJ;
    public final double LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1AZ2)) {
            return false;
        }
        C1AZ2 c1az2 = (C1AZ2) obj;
        return Double.compare(this.LIZ, c1az2.LIZ) == 0 && Double.compare(this.LIZIZ, c1az2.LIZIZ) == 0 && Double.compare(this.LIZJ, c1az2.LIZJ) == 0 && Double.compare(this.LIZLLL, c1az2.LIZLLL) == 0;
    }

    public final C2232771CaB LIZ() {
        return new C2232771CaB(Double.valueOf(this.LIZ), Double.valueOf(this.LIZIZ), Double.valueOf(this.LIZJ), Double.valueOf(this.LIZLLL));
    }

    public C1AZ2(double d, double d2, double d3, double d4) {
        this.LIZ = d;
        this.LIZIZ = d2;
        this.LIZJ = d3;
        this.LIZLLL = d4;
    }
}
