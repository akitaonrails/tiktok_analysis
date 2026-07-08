package X;

import android.graphics.Matrix;

/* JADX INFO: renamed from: X.0jM5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1277750jM5 {
    public final float[] LJFF;
    public EnumC1277900jMK LIZIZ = EnumC1277900jMK.Unknown;
    public EnumC1277730jM3 LIZJ = EnumC1277730jM3.Rotation0;
    public Matrix LIZLLL = new Matrix();
    public final float[] LJ = new float[9];
    public final boolean LIZ = false;

    public C1277750jM5() {
        float[] fArr = new float[16];
        this.LJFF = fArr;
        fArr[2] = 0.0f;
        fArr[6] = 0.0f;
        fArr[8] = 0.0f;
        fArr[9] = 0.0f;
        fArr[10] = 1.0f;
        fArr[11] = 0.0f;
        fArr[14] = 0.0f;
    }
}
