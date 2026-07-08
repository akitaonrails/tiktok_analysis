package X;

/* JADX INFO: renamed from: X.0tRn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1665690tRn {
    public final float LIZ;
    public final float LIZIZ;
    public final int LIZJ = 250;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1665690tRn)) {
            return false;
        }
        C1665690tRn c1665690tRn = (C1665690tRn) obj;
        return Float.compare(this.LIZ, c1665690tRn.LIZ) == 0 && C1668650tWZ.LIZJ(this.LIZIZ, c1665690tRn.LIZIZ) && this.LIZJ == c1665690tRn.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShootButtonTransforms(scaleFactor=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", marginY=");
        sbLIZ.append((Object) C1668650tWZ.LJFF(this.LIZIZ));
        sbLIZ.append(", transitionDuration=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + this.LIZJ;
    }

    public C1665690tRn(float f, float f2) {
        this.LIZ = f;
        this.LIZIZ = f2;
    }
}
