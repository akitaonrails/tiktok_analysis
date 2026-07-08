package X;

import android.graphics.PointF;

/* JADX INFO: renamed from: X.0jEf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1273150jEf {
    public static final C1273150jEf LJFF = new C1273150jEf();
    public final PointF LIZ;
    public final PointF LIZIZ;
    public final PointF LIZJ;
    public final PointF LIZLLL;
    public final float[] LJ;

    public final float[] LIZ() {
        PointF pointF = this.LIZ;
        PointF pointF2 = this.LIZIZ;
        PointF pointF3 = this.LIZJ;
        PointF pointF4 = this.LIZLLL;
        return new float[]{pointF.x, pointF.y, 0.0f, pointF2.x, pointF2.y, 0.0f, pointF3.x, pointF3.y, 0.0f, pointF4.x, pointF4.y, 0.0f};
    }

    public C1273150jEf() {
        this.LIZ = new PointF(-1.0f, -1.0f);
        this.LIZIZ = new PointF(-1.0f, 1.0f);
        this.LIZJ = new PointF(1.0f, -1.0f);
        this.LIZLLL = new PointF(1.0f, 1.0f);
        this.LJ = LIZ();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GL2DVertex(leftBottom=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", leftTop=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", rightBottom=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", rightTop=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1273150jEf(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        this.LIZ = new PointF(-1.0f, -1.0f);
        this.LIZIZ = new PointF(-1.0f, 1.0f);
        this.LIZJ = new PointF(1.0f, -1.0f);
        this.LIZLLL = new PointF(1.0f, 1.0f);
        this.LJ = LIZ();
        this.LIZ = pointF;
        this.LIZIZ = pointF2;
        this.LIZJ = pointF3;
        this.LIZLLL = pointF4;
        this.LJ = LIZ();
    }
}
