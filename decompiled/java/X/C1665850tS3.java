package X;

/* JADX INFO: renamed from: X.0tS3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1665850tS3 {
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1665850tS3)) {
            return false;
        }
        C1665850tS3 c1665850tS3 = (C1665850tS3) obj;
        return C1668650tWZ.LIZJ(this.LIZ, c1665850tS3.LIZ) && C1668650tWZ.LIZJ(this.LIZIZ, c1665850tS3.LIZIZ) && C1668650tWZ.LIZJ(this.LIZJ, c1665850tS3.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShootButtonSizes(innerRadius=");
        sbLIZ.append((Object) C1668650tWZ.LJFF(this.LIZ));
        sbLIZ.append(", outerRadius=");
        sbLIZ.append((Object) C1668650tWZ.LJFF(this.LIZIZ));
        sbLIZ.append(", strokeWidth=");
        sbLIZ.append((Object) C1668650tWZ.LJFF(this.LIZJ));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ);
    }

    public C1665850tS3(float f, float f2, float f3) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
    }
}
