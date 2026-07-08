package X;

import android.graphics.Rect;

/* JADX INFO: renamed from: X.15Ah, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class C20476115Ah {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public float LJ;
    public final float LJFF;
    public final float LJI;
    public float LJII;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20476115Ah)) {
            return false;
        }
        C20476115Ah c20476115Ah = (C20476115Ah) obj;
        return this.LIZ == c20476115Ah.LIZ && this.LIZIZ == c20476115Ah.LIZIZ && this.LIZJ == c20476115Ah.LIZJ && this.LIZLLL == c20476115Ah.LIZLLL && Float.compare(this.LJ, c20476115Ah.LJ) == 0 && Float.compare(this.LJFF, c20476115Ah.LJFF) == 0 && Float.compare(this.LJI, c20476115Ah.LJI) == 0 && Float.compare(this.LJII, c20476115Ah.LJII) == 0;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Location(x=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", y=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", width=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", height=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", alpha=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", scaleX=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", scaleY=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", zorder=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final C20476115Ah LIZ() {
        return new C20476115Ah(this.LIZ, this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII);
    }

    public final Rect LIZIZ() {
        int i = this.LIZ;
        int i2 = this.LIZIZ;
        int i3 = this.LIZJ;
        return new Rect(i, i2, i + i3, i3 + i2);
    }

    public final int hashCode() {
        return (((((((((((((this.LIZ * 31) + this.LIZIZ) * 31) + this.LIZJ) * 31) + this.LIZLLL) * 31) + Float.floatToIntBits(this.LJ)) * 31) + Float.floatToIntBits(this.LJFF)) * 31) + Float.floatToIntBits(this.LJI)) * 31) + Float.floatToIntBits(this.LJII);
    }

    public C20476115Ah(int i, int i2, int i3, int i4, float f, float f2, float f3, float f4) {
        this.LIZ = i;
        this.LIZIZ = i2;
        this.LIZJ = i3;
        this.LIZLLL = i4;
        this.LJ = f;
        this.LJFF = f2;
        this.LJI = f3;
        this.LJII = f4;
    }

    public /* synthetic */ C20476115Ah(int i, int i2, int i3, int i4, float f, float f2, float f3, float f4, int i5) {
        this(i, i2, i3, i4, (i5 & 16) != 0 ? 1.0f : f, (i5 & 32) != 0 ? 1.0f : f2, (i5 & 64) != 0 ? 1.0f : f3, (i5 & 128) != 0 ? 0.0f : f4);
    }
}
