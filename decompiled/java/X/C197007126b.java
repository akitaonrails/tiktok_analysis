package X;

import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.io.IOException;
import java.io.OutputStream;

/* JADX INFO: renamed from: X.126b, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C197007126b {
    public final byte[] LIZ;
    public final int LIZIZ;
    public int LIZJ;
    public int LIZLLL;
    public int LJ;
    public int LJFF;
    public int LJIIIIZZ;
    public boolean LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILLIIL;
    public final int[] LJI = new int[5003];
    public final int[] LJII = new int[5003];
    public final int[] LJIILL = {0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535};
    public final byte[] LJIIZILJ = new byte[256];

    public final void LIZ(OutputStream outputStream, int i) throws IOException {
        int i2 = this.LJIILIIL;
        int[] iArr = this.LJIILL;
        int i3 = this.LJIILJJIL;
        int i4 = i2 & iArr[i3];
        this.LJIILIIL = i4;
        if (i3 > 0) {
            this.LJIILIIL = i4 | (i << i3);
        } else {
            this.LJIILIIL = i;
        }
        this.LJIILJJIL = i3 + this.LJ;
        while (this.LJIILJJIL >= 8) {
            byte b = (byte) (this.LJIILIIL & 255);
            byte[] bArr = this.LJIIZILJ;
            int i5 = this.LJIILLIIL;
            int i6 = i5 + 1;
            this.LJIILLIIL = i6;
            bArr[i5] = b;
            if (i6 >= 254) {
                outputStream.write(i6);
                outputStream.write(this.LJIIZILJ, 0, this.LJIILLIIL);
                this.LJIILLIIL = 0;
            }
            this.LJIILIIL >>= 8;
            this.LJIILJJIL -= 8;
        }
        if (this.LJIIIIZZ > this.LJFF || this.LJIIIZ) {
            if (this.LJIIIZ) {
                int i7 = this.LJIIJ;
                this.LJ = i7;
                this.LJFF = (1 << i7) - 1;
                this.LJIIIZ = false;
            } else {
                int i8 = this.LJ + 1;
                this.LJ = i8;
                if (i8 == 12) {
                    this.LJFF = SpeechEngineDefines.TTS_WORK_MODE_BOTH;
                } else {
                    this.LJFF = (1 << i8) - 1;
                }
            }
        }
        if (i == this.LJIIL) {
            while (this.LJIILJJIL > 0) {
                byte b2 = (byte) (this.LJIILIIL & 255);
                byte[] bArr2 = this.LJIIZILJ;
                int i9 = this.LJIILLIIL;
                int i10 = i9 + 1;
                this.LJIILLIIL = i10;
                bArr2[i9] = b2;
                if (i10 >= 254) {
                    outputStream.write(i10);
                    outputStream.write(this.LJIIZILJ, 0, this.LJIILLIIL);
                    this.LJIILLIIL = 0;
                }
                this.LJIILIIL >>= 8;
                this.LJIILJJIL -= 8;
            }
            int i11 = this.LJIILLIIL;
            if (i11 > 0) {
                outputStream.write(i11);
                outputStream.write(this.LJIIZILJ, 0, this.LJIILLIIL);
                this.LJIILLIIL = 0;
            }
        }
    }

    public C197007126b(int i, byte[] bArr, int i2, int i3) {
        this.LIZ = bArr;
        this.LIZIZ = Math.max(2, i3);
    }
}
