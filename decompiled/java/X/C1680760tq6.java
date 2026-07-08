package X;

/* JADX INFO: renamed from: X.0tq6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1680760tq6 {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public final float LIZLLL;
    public final long LJ;
    public final long LJFF;
    public final long LJI;
    public final long LJII;

    static {
        C1680750tq5.LIZ(0.0f, 0.0f, 0.0f, 0.0f, 0L);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1680760tq6)) {
            return false;
        }
        C1680760tq6 c1680760tq6 = (C1680760tq6) obj;
        return Float.compare(this.LIZ, c1680760tq6.LIZ) == 0 && Float.compare(this.LIZIZ, c1680760tq6.LIZIZ) == 0 && Float.compare(this.LIZJ, c1680760tq6.LIZJ) == 0 && Float.compare(this.LIZLLL, c1680760tq6.LIZLLL) == 0 && C1297300jrc.LIZ(this.LJ, c1680760tq6.LJ) && C1297300jrc.LIZ(this.LJFF, c1680760tq6.LJFF) && C1297300jrc.LIZ(this.LJI, c1680760tq6.LJI) && C1297300jrc.LIZ(this.LJII, c1680760tq6.LJII);
    }

    public final int hashCode() {
        return (((((((((((((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ)) * 31) + Float.floatToIntBits(this.LIZLLL)) * 31) + C786410Ut5.Y2(this.LJ)) * 31) + C786410Ut5.Y2(this.LJFF)) * 31) + C786410Ut5.Y2(this.LJI)) * 31) + C786410Ut5.Y2(this.LJII);
    }

    public final String toString() {
        long j = this.LJ;
        long j2 = this.LJFF;
        long j3 = this.LJI;
        long j4 = this.LJII;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C1297290jrb.LIZ(this.LIZ));
        sbLIZ.append(", ");
        sbLIZ.append(C1297290jrb.LIZ(this.LIZIZ));
        sbLIZ.append(", ");
        sbLIZ.append(C1297290jrb.LIZ(this.LIZJ));
        sbLIZ.append(", ");
        sbLIZ.append(C1297290jrb.LIZ(this.LIZLLL));
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        if (!C1297300jrc.LIZ(j, j2) || !C1297300jrc.LIZ(j2, j3) || !C1297300jrc.LIZ(j3, j4)) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("RoundRect(rect=");
            sbLIZ2.append(strLIZIZ);
            sbLIZ2.append(", topLeft=");
            sbLIZ2.append((Object) C1297300jrc.LIZIZ(j));
            sbLIZ2.append(", topRight=");
            sbLIZ2.append((Object) C1297300jrc.LIZIZ(j2));
            sbLIZ2.append(", bottomRight=");
            sbLIZ2.append((Object) C1297300jrc.LIZIZ(j3));
            sbLIZ2.append(", bottomLeft=");
            sbLIZ2.append((Object) C1297300jrc.LIZIZ(j4));
            sbLIZ2.append(')');
            return C2188811AlT.LIZIZ(sbLIZ2);
        }
        int i = (int) (j >> 32);
        int i2 = (int) (j & 4294967295L);
        if (Float.intBitsToFloat(i) == Float.intBitsToFloat(i2)) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append("RoundRect(rect=");
            sbLIZ3.append(strLIZIZ);
            sbLIZ3.append(", radius=");
            sbLIZ3.append(C1297290jrb.LIZ(Float.intBitsToFloat(i)));
            sbLIZ3.append(')');
            return C2188811AlT.LIZIZ(sbLIZ3);
        }
        StringBuilder sbLIZ4 = C2188811AlT.LIZ();
        sbLIZ4.append("RoundRect(rect=");
        sbLIZ4.append(strLIZIZ);
        sbLIZ4.append(", x=");
        sbLIZ4.append(C1297290jrb.LIZ(Float.intBitsToFloat(i)));
        sbLIZ4.append(", y=");
        sbLIZ4.append(C1297290jrb.LIZ(Float.intBitsToFloat(i2)));
        sbLIZ4.append(')');
        return C2188811AlT.LIZIZ(sbLIZ4);
    }

    public C1680760tq6(float f, float f2, float f3, float f4, long j, long j2, long j3, long j4) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
        this.LIZLLL = f4;
        this.LJ = j;
        this.LJFF = j2;
        this.LJI = j3;
        this.LJII = j4;
    }
}
