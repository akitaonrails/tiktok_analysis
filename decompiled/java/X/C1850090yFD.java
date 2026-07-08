package X;

import android.graphics.Rect;

/* JADX INFO: renamed from: X.0yFD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1850090yFD {
    public final int LIZ;
    public final int LIZIZ;
    public final int LIZJ;
    public final int LIZLLL;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RectShot(l=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", t=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", r=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", b=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int hashCode() {
        return (((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL;
    }

    public final boolean LIZ(Rect rect) {
        if (this.LIZ == rect.left && this.LIZIZ == rect.top && this.LIZJ == rect.right && this.LIZLLL == rect.bottom) {
            return true;
        }
        return false;
    }

    public C1850090yFD(int i, int i2, int i3, int i4) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
    }
}
