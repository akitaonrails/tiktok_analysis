package X;

import android.graphics.Insets;

/* JADX INFO: renamed from: X.14Jj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20244914Jj {
    public static final C20244914Jj LJ = new C20244914Jj(0, 0, 0, 0);
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final Insets LIZLLL() {
        return C14K6.LIZ(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Insets{left=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", top=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", right=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", bottom=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append('}');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static C20244914Jj LIZJ(Insets insets) {
        return LIZIZ(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20244914Jj.class != obj.getClass()) {
            return false;
        }
        C20244914Jj c20244914Jj = (C20244914Jj) obj;
        if (this.LIZLLL == c20244914Jj.LIZLLL && this.LIZ == c20244914Jj.LIZ && this.LIZJ == c20244914Jj.LIZJ && this.LIZIZ == c20244914Jj.LIZIZ) {
            return true;
        }
        return false;
    }

    public static C20244914Jj LIZ(C20244914Jj c20244914Jj, C20244914Jj c20244914Jj2) {
        return LIZIZ(Math.max(c20244914Jj.LIZ, c20244914Jj2.LIZ), Math.max(c20244914Jj.LIZIZ, c20244914Jj2.LIZIZ), Math.max(c20244914Jj.LIZJ, c20244914Jj2.LIZJ), Math.max(c20244914Jj.LIZLLL, c20244914Jj2.LIZLLL));
    }

    public C20244914Jj(int i, int i2, int i3, int i4) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
    }

    public static C20244914Jj LIZIZ(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return LJ;
        }
        return new C20244914Jj(i, i2, i3, i4);
    }
}
