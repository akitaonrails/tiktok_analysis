package X;

/* JADX INFO: renamed from: X.1DWr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public class C2257271DWr {
    public int LIZIZ;
    public int LIZLLL;
    public byte[] LIZ = new byte[8];
    public float[] LIZJ = new float[16];

    public final void LIZ(byte b) {
        int i = this.LIZIZ;
        byte[] bArr = this.LIZ;
        if (i == bArr.length) {
            byte[] bArr2 = new byte[bArr.length * 2];
            System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
            this.LIZ = bArr2;
        }
        byte[] bArr3 = this.LIZ;
        int i2 = this.LIZIZ;
        this.LIZIZ = i2 + 1;
        bArr3[i2] = b;
    }

    public final void LIZIZ(int i) {
        float[] fArr = this.LIZJ;
        if (fArr.length < this.LIZLLL + i) {
            float[] fArr2 = new float[fArr.length * 2];
            System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
            this.LIZJ = fArr2;
        }
    }

    public final void LIZLLL(float f, float f2) {
        LIZ((byte) 1);
        LIZIZ(2);
        float[] fArr = this.LIZJ;
        int i = this.LIZLLL;
        int i2 = i + 1;
        fArr[i] = f;
        this.LIZLLL = i2 + 1;
        fArr[i2] = f2;
    }

    public final void LJ(float f, float f2, float f3, float f4) {
        LIZ((byte) 3);
        LIZIZ(4);
        float[] fArr = this.LIZJ;
        int i = this.LIZLLL;
        int i2 = i + 1;
        fArr[i] = f;
        int i3 = i2 + 1;
        fArr[i2] = f2;
        int i4 = i3 + 1;
        fArr[i3] = f3;
        this.LIZLLL = i4 + 1;
        fArr[i4] = f4;
    }

    public final void LIZJ(float f, float f2, float f3, float f4, float f5, float f6) {
        LIZ((byte) 2);
        LIZIZ(6);
        float[] fArr = this.LIZJ;
        int i = this.LIZLLL;
        int i2 = i + 1;
        fArr[i] = f;
        int i3 = i2 + 1;
        fArr[i2] = f2;
        int i4 = i3 + 1;
        fArr[i3] = f3;
        int i5 = i4 + 1;
        fArr[i4] = f4;
        int i6 = i5 + 1;
        fArr[i5] = f5;
        this.LIZLLL = i6 + 1;
        fArr[i6] = f6;
    }
}
