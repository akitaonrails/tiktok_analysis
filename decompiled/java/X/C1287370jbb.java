package X;

import android.opengl.GLES20;
import android.os.SystemClock;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;

/* JADX INFO: renamed from: X.0jbb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1287370jbb {
    public final boolean LIZ;
    public int LIZIZ;
    public int LIZJ;
    public final FloatBuffer LIZLLL;
    public final ShortBuffer LJ;
    public final int LJFF;
    public int LJI;
    public int LJII;
    public int LJIIIIZZ;
    public int LJIIIZ;
    public int LJIIJ;
    public int LJIIJJI;
    public int LJIIL;
    public int LJIILIIL;
    public int LJIILJJIL;
    public int LJIILL;
    public int LJIILLIIL;
    public int LJIIZILJ;
    public int LJIJ;
    public int LJIJI;
    public int LJIJJ;
    public int LJIJJLI;
    public int LJIL;
    public float[] LJJ;
    public short[] LJJI;
    public long LJJIFFI = SystemClock.elapsedRealtime();
    public float LJJII;
    public float LJJIII;

    public C1287370jbb(String str, String str2, boolean z) {
        float[] fArr;
        float[] fArr2;
        short[] sArr;
        short[] sArr2;
        short[] sArr3;
        short[] sArr4;
        short[] sArr5;
        this.LIZ = z;
        if (z) {
            this.LJJ = new float[]{-1.0f, 1.0f, 0.0f, -1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 0.0f, 1.0f, 1.0f, 0.0f};
        } else {
            this.LJJ = new float[30603];
            float f = 20.0f / 100;
            int i = 0;
            int i2 = 0;
            do {
                int i3 = 0;
                do {
                    float[] fArr3 = this.LJJ;
                    if (fArr3 == null) {
                        fArr = null;
                    } else {
                        fArr = fArr3;
                    }
                    int i4 = i2 + 1;
                    fArr[i2] = (i3 * f) - 1.0f;
                    if (fArr3 == null) {
                        fArr2 = null;
                    } else {
                        fArr2 = fArr3;
                    }
                    int i5 = i4 + 1;
                    fArr2[i4] = 1.0f - (i * f);
                    i2 = i5 + 1;
                    (fArr3 == null ? null : fArr3)[i5] = 0.0f;
                    i3++;
                } while (i3 < 101);
                i++;
            } while (i < 101);
        }
        if (this.LIZ) {
            this.LJJI = new short[]{0, 1, 2, 0, 2, 3};
        } else {
            this.LJJI = new short[C538540LAe.LLJJJIL];
            int i6 = 0;
            int i7 = 0;
            do {
                int i8 = 0;
                do {
                    int i9 = (i6 * 101) + i8;
                    int i10 = i9 + 1;
                    int i11 = ((i6 + 1) * 101) + i8;
                    int i12 = i11 + 1;
                    short[] sArr6 = this.LJJI;
                    if (sArr6 == null) {
                        sArr = null;
                    } else {
                        sArr = sArr6;
                    }
                    int i13 = i7 + 1;
                    sArr[i7] = (short) i9;
                    if (sArr6 == null) {
                        sArr2 = null;
                    } else {
                        sArr2 = sArr6;
                    }
                    int i14 = i13 + 1;
                    short s = (short) i11;
                    sArr2[i13] = s;
                    if (sArr6 == null) {
                        sArr3 = null;
                    } else {
                        sArr3 = sArr6;
                    }
                    int i15 = i14 + 1;
                    short s2 = (short) i10;
                    sArr3[i14] = s2;
                    if (sArr6 == null) {
                        sArr4 = null;
                    } else {
                        sArr4 = sArr6;
                    }
                    int i16 = i15 + 1;
                    sArr4[i15] = s2;
                    if (sArr6 == null) {
                        sArr5 = null;
                    } else {
                        sArr5 = sArr6;
                    }
                    int i17 = i16 + 1;
                    sArr5[i16] = s;
                    i7 = i17 + 1;
                    (sArr6 == null ? null : sArr6)[i17] = (short) i12;
                    i8++;
                } while (i8 < 100);
                i6++;
            } while (i6 < 100);
        }
        float[] fArr4 = this.LJJ;
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect((fArr4 == null ? null : fArr4).length * 4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        FloatBuffer floatBufferAsFloatBuffer = byteBufferAllocateDirect.asFloatBuffer();
        this.LIZLLL = floatBufferAsFloatBuffer;
        if (floatBufferAsFloatBuffer != null) {
            float[] fArr5 = this.LJJ;
            floatBufferAsFloatBuffer.put(fArr5 == null ? null : fArr5);
            floatBufferAsFloatBuffer.position(0);
        }
        short[] sArr7 = this.LJJI;
        ByteBuffer byteBufferAllocateDirect2 = ByteBuffer.allocateDirect((sArr7 == null ? null : sArr7).length * 2);
        byteBufferAllocateDirect2.order(ByteOrder.nativeOrder());
        ShortBuffer shortBufferAsShortBuffer = byteBufferAllocateDirect2.asShortBuffer();
        this.LJ = shortBufferAsShortBuffer;
        if (shortBufferAsShortBuffer != null) {
            short[] sArr8 = this.LJJI;
            shortBufferAsShortBuffer.put(sArr8 != null ? sArr8 : null);
            shortBufferAsShortBuffer.position(0);
        }
        int iGlCreateShader = GLES20.glCreateShader(35633);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int iGlCreateShader2 = GLES20.glCreateShader(35632);
        GLES20.glShaderSource(iGlCreateShader2, str2);
        GLES20.glCompileShader(iGlCreateShader2);
        GLES20.glGetShaderiv(iGlCreateShader, 35713, new int[1], 0);
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.LJFF = iGlCreateProgram;
        GLES20.glAttachShader(iGlCreateProgram, iGlCreateShader);
        GLES20.glAttachShader(iGlCreateProgram, iGlCreateShader2);
        GLES20.glLinkProgram(iGlCreateProgram);
    }
}
