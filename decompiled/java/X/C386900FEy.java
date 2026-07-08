package X;

import android.graphics.RectF;

/* JADX INFO: renamed from: X.0FEy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes6.dex */
public final class C386900FEy {
    public final RectF LIZ;
    public float LIZIZ;
    public float LIZJ;
    public float LIZLLL;
    public float LJ;
    public float LJFF;
    public float LJI;
    public boolean LJII;

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("translationX = ");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(" \ntranslationY = ");
        sbLIZ.append(this.LJI);
        sbLIZ.append(" \npivotY = ");
        sbLIZ.append(this.LJ);
        sbLIZ.append(" \npivotX = ");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(" \nscale = ");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(" \nrotationDegrees = ");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append("\n mirrorX = ");
        sbLIZ.append(this.LJII);
        sbLIZ.append(" \n");
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C386900FEy(RectF rectF) {
        float fCenterX = rectF.centerX();
        float fCenterY = rectF.centerY();
        this.LIZ = rectF;
        this.LIZIZ = 0.0f;
        this.LIZJ = 1.0f;
        this.LIZLLL = fCenterX;
        this.LJ = fCenterY;
        this.LJFF = 0.0f;
        this.LJI = 0.0f;
        this.LJII = false;
    }
}
