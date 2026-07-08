package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.13IB, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13IB extends C13IF<float[]> {
    public float[] LIZ;
    public int LIZIZ;

    @Override // X.C13IF
    public final float[] LIZ() {
        return Arrays.copyOf(this.LIZ, this.LIZIZ);
    }

    @Override // X.C13IF
    public final int LIZLLL() {
        return this.LIZIZ;
    }

    public C13IB(float[] fArr) {
        this.LIZ = fArr;
        this.LIZIZ = fArr.length;
        LIZIZ(10);
    }

    @Override // X.C13IF
    public final void LIZIZ(int i) {
        float[] fArr = this.LIZ;
        if (fArr.length < i) {
            int length = fArr.length * 2;
            if (i < length) {
                i = length;
            }
            this.LIZ = Arrays.copyOf(fArr, i);
        }
    }
}
