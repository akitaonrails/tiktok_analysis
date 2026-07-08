package X;

import java.io.FileInputStream;

/* JADX INFO: renamed from: X.1BUF, reason: invalid class name */
/* JADX INFO: loaded from: classes35.dex */
public final class C1BUF {
    public final byte[] LIZ = new byte[512];
    public FileInputStream LIZIZ;
    public int LIZJ;
    public int LIZLLL;

    public final void LIZIZ() {
        if (this.LIZJ >= this.LIZLLL) {
            this.LIZLLL = this.LIZIZ.read(this.LIZ);
            this.LIZJ = 0;
        }
        while (true) {
            int i = this.LIZLLL;
            if (i == -1) {
                break;
            }
            byte[] bArr = this.LIZ;
            int i2 = this.LIZJ;
            if (bArr[i2] == 10) {
                break;
            }
            int i3 = i2 + 1;
            this.LIZJ = i3;
            if (i3 >= i) {
                this.LIZLLL = this.LIZIZ.read(bArr);
                this.LIZJ = 0;
            }
        }
        this.LIZJ++;
    }

    public final int LIZ(byte[] bArr) {
        int i;
        byte[] bArr2;
        int i2;
        byte b;
        if (this.LIZJ >= this.LIZLLL) {
            this.LIZLLL = this.LIZIZ.read(this.LIZ);
            this.LIZJ = 0;
        }
        int i3 = 0;
        while (true) {
            i = this.LIZLLL;
            if (i == -1 || i3 >= bArr.length || (b = (bArr2 = this.LIZ)[(i2 = this.LIZJ)]) == 10) {
                break;
            }
            bArr[i3] = b;
            int i4 = i2 + 1;
            this.LIZJ = i4;
            if (i4 >= i) {
                this.LIZLLL = this.LIZIZ.read(bArr2);
                this.LIZJ = 0;
            }
            i3++;
        }
        this.LIZJ++;
        if (i == -1) {
            return -1;
        }
        return i3;
    }
}
