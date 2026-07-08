package X;

import android.animation.TypeEvaluator;

/* JADX INFO: renamed from: X.194Y, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C194Y implements TypeEvaluator<float[]> {
    public final float[] LIZ;

    public C194Y(float[] fArr) {
        this.LIZ = fArr;
    }

    @Override // android.animation.TypeEvaluator
    public final float[] evaluate(float f, float[] fArr, float[] fArr2) {
        float[] fArr3 = fArr;
        float[] fArr4 = fArr2;
        float[] fArr5 = this.LIZ;
        if (fArr5 == null) {
            fArr5 = new float[fArr3.length];
        }
        int length = fArr5.length;
        for (int i = 0; i < length; i++) {
            float f2 = fArr3[i];
            fArr5[i] = f2 + ((fArr4[i] - f2) * f);
        }
        return fArr5;
    }
}
