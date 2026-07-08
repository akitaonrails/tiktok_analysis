package X;

import android.graphics.Matrix;

/* JADX INFO: renamed from: X.0jLt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1277630jLt {
    public EnumC1277900jMK LIZ = EnumC1277900jMK.Unknown;
    public EnumC1277730jM3 LIZIZ = EnumC1277730jM3.Rotation0;
    public Matrix LIZJ = new Matrix();
    public final float[] LIZLLL = new float[9];
    public final float[] LJ;

    public C1277630jLt() {
        float[] fArr = new float[16];
        this.LJ = fArr;
        fArr[2] = 0.0f;
        fArr[6] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[14] = 0.0f;
    }

    public final float[] LIZ(C1277560jLm c1277560jLm) {
        this.LIZ = c1277560jLm.LIZ;
        this.LIZIZ = c1277560jLm.LIZJ;
        this.LIZJ = new Matrix();
        if (this.LIZ == EnumC1277900jMK.Texture) {
            this.LIZJ = c1277560jLm.LJIIJ;
        }
        Matrix matrix = new Matrix(this.LIZJ);
        if (this.LIZIZ != EnumC1277730jM3.Rotation0) {
            matrix.preTranslate(0.5f, 0.5f);
            matrix.preRotate(this.LIZIZ.getDegree());
            matrix.preScale(1.0f, 1.0f);
            matrix.preTranslate(-0.5f, -0.5f);
        }
        matrix.getValues(this.LIZLLL);
        float[] fArr = this.LJ;
        float[] fArr2 = this.LIZLLL;
        fArr[0] = fArr2[0];
        fArr[1] = fArr2[3];
        fArr[3] = fArr2[6];
        fArr[4] = fArr2[1];
        fArr[5] = fArr2[4];
        fArr[7] = fArr2[7];
        fArr[12] = fArr2[2];
        fArr[13] = fArr2[5];
        fArr[15] = fArr2[8];
        return fArr;
    }
}
