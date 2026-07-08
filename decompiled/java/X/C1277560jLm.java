package X;

import android.graphics.Matrix;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: renamed from: X.0jLm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public class C1277560jLm {
    public static final C1272080jCw LJIILL = new C1272080jCw();
    public EnumC1277900jMK LIZ;
    public EnumC1277710jM1 LIZIZ;
    public EnumC1277730jM3 LIZJ;
    public int LIZLLL;
    public int LJ;
    public long LJFF;
    public long LJI;
    public long LJII;
    public int LJIIIIZZ;
    public long LJIIIZ;
    public Matrix LJIIJ;
    public ByteBuffer LJIIJJI;
    public byte[] LJIIL;
    public Runnable LJIILIIL;
    public final AtomicInteger LJIILJJIL;

    public synchronized void LIZJ() {
        int iDecrementAndGet = this.LJIILJJIL.decrementAndGet();
        if (iDecrementAndGet == 0) {
            Runnable runnable = this.LJIILIIL;
            if (runnable != null) {
                runnable.run();
            }
        } else if (iDecrementAndGet < 0) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ref count should not be a negative ");
            sbLIZ.append(iDecrementAndGet);
            C2188811AlT.LIZIZ(sbLIZ);
        }
    }

    public final int LIZ() {
        EnumC1277730jM3 enumC1277730jM3 = this.LIZJ;
        return (enumC1277730jM3 == EnumC1277730jM3.Rotation90 || enumC1277730jM3 == EnumC1277730jM3.Rotation270) ? this.LIZLLL : this.LJ;
    }

    public final int LIZIZ() {
        EnumC1277730jM3 enumC1277730jM3 = this.LIZJ;
        return (enumC1277730jM3 == EnumC1277730jM3.Rotation90 || enumC1277730jM3 == EnumC1277730jM3.Rotation270) ? this.LJ : this.LIZLLL;
    }

    public void LIZLLL() {
        this.LJIILJJIL.incrementAndGet();
    }

    public C1277560jLm(long j, int i, int i2) {
        EnumC1277730jM3 enumC1277730jM3 = EnumC1277730jM3.Rotation0;
        this.LIZJ = enumC1277730jM3;
        this.LJFF = System.currentTimeMillis() * 1000;
        this.LJIILJJIL = new AtomicInteger(1);
        EnumC1277900jMK enumC1277900jMK = EnumC1277900jMK.ByteBuffer;
        EnumC1277710jM1 enumC1277710jM1 = EnumC1277710jM1.I420;
        this.LIZ = enumC1277900jMK;
        this.LIZIZ = enumC1277710jM1;
        this.LIZJ = enumC1277730jM3;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = j;
        this.LJIIIIZZ = 0;
        this.LJIIJ = null;
        this.LJIIJJI = null;
        this.LJIIL = null;
    }

    public C1277560jLm(int i, int i2, long j, int i3, boolean z, Matrix matrix) {
        EnumC1277710jM1 enumC1277710jM1;
        EnumC1277730jM3 enumC1277730jM3 = EnumC1277730jM3.Rotation0;
        this.LIZJ = enumC1277730jM3;
        this.LJFF = System.currentTimeMillis() * 1000;
        this.LJIILJJIL = new AtomicInteger(1);
        if (z) {
            enumC1277710jM1 = EnumC1277710jM1.TextureOes;
        } else {
            enumC1277710jM1 = EnumC1277710jM1.Texture2D;
        }
        matrix = matrix == null ? new Matrix() : matrix;
        this.LIZ = EnumC1277900jMK.Texture;
        this.LIZIZ = enumC1277710jM1;
        this.LIZJ = enumC1277730jM3;
        this.LIZLLL = i;
        this.LJ = i2;
        this.LJFF = j;
        this.LJIIIIZZ = i3;
        this.LJIIJ = matrix;
        this.LJIIJJI = null;
        this.LJIIL = null;
    }
}
