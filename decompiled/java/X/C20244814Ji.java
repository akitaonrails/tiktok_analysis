package X;

import android.graphics.Insets;
import android.graphics.Rect;

/* JADX INFO: renamed from: X.14Ji, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20244814Ji {
    public static final C20244814Ji LJ = new C20244814Ji(0, 0, 0, 0);
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final Insets LJ() {
        return Insets.of(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL);
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

    public static C20244814Ji LIZJ(Rect rect) {
        return LIZIZ(rect.left, rect.top, rect.right, rect.bottom);
    }

    public static C20244814Ji LIZLLL(Insets insets) {
        return LIZIZ(insets.left, insets.top, insets.right, insets.bottom);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C20244814Ji.class != obj.getClass()) {
            return false;
        }
        C20244814Ji c20244814Ji = (C20244814Ji) obj;
        if (this.LIZLLL == c20244814Ji.LIZLLL && this.LIZ == c20244814Ji.LIZ && this.LIZJ == c20244814Ji.LIZJ && this.LIZIZ == c20244814Ji.LIZIZ) {
            return true;
        }
        return false;
    }

    public static C20244814Ji LIZ(C20244814Ji c20244814Ji, C20244814Ji c20244814Ji2) {
        return LIZIZ(Math.max(c20244814Ji.LIZ, c20244814Ji2.LIZ), Math.max(c20244814Ji.LIZIZ, c20244814Ji2.LIZIZ), Math.max(c20244814Ji.LIZJ, c20244814Ji2.LIZJ), Math.max(c20244814Ji.LIZLLL, c20244814Ji2.LIZLLL));
    }

    public C20244814Ji(int i, int i2, int i3, int i4) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
    }

    public static C20244814Ji LIZIZ(int i, int i2, int i3, int i4) {
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            return LJ;
        }
        return new C20244814Ji(i, i2, i3, i4);
    }
}
