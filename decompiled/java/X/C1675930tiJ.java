package X;

/* JADX INFO: renamed from: X.0tiJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1675930tiJ {
    public static final float LIZLLL;
    public static final float LJFF;
    public final float LIZ;
    public final float LIZIZ;
    public final float LIZJ;
    public static final float LJ = 92;
    public static final float LJI = 60;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1675930tiJ)) {
            return false;
        }
        C1675930tiJ c1675930tiJ = (C1675930tiJ) obj;
        return C1668650tWZ.LIZJ(this.LIZ, c1675930tiJ.LIZ) && C1668650tWZ.LIZJ(this.LIZIZ, c1675930tiJ.LIZIZ) && C1668650tWZ.LIZJ(this.LIZJ, c1675930tiJ.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CustomizeStyleTileSize(width=");
        sbLIZ.append((Object) C1668650tWZ.LJFF(this.LIZ));
        sbLIZ.append(", height=");
        sbLIZ.append((Object) C1668650tWZ.LJFF(this.LIZIZ));
        sbLIZ.append(", cornerRadius=");
        sbLIZ.append((Object) C1668650tWZ.LJFF(this.LIZJ));
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        float f = 80;
        LIZLLL = f;
        LJFF = f;
    }

    public final int hashCode() {
        return (((Float.floatToIntBits(this.LIZ) * 31) + Float.floatToIntBits(this.LIZIZ)) * 31) + Float.floatToIntBits(this.LIZJ);
    }

    public C1675930tiJ(float f, float f2, float f3) {
        this.LIZ = f;
        this.LIZIZ = f2;
        this.LIZJ = f3;
    }
}
