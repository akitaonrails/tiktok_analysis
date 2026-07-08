package X;

import java.io.IOException;
import java.util.Random;
import okio.ByteString;

/* JADX INFO: renamed from: X.0p4Q, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1497440p4Q {
    public final boolean LIZ;
    public final Random LIZIZ;
    public final InterfaceC1496780p3M LIZJ;
    public final C1496690p3D LIZLLL;
    public boolean LJ;
    public final C1496690p3D LJFF = new C1496690p3D();
    public final C1497480p4U LJI = new C1497480p4U(this);
    public boolean LJII;
    public final byte[] LJIIIIZZ;
    public final C1496760p3K LJIIIZ;

    public final void LIZ(ByteString byteString, int i) throws IOException {
        if (!this.LJ) {
            int size = byteString.size();
            if (size <= 125) {
                this.LIZLLL.LJJJZ(i | 128);
                if (this.LIZ) {
                    this.LIZLLL.LJJJZ(size | 128);
                    this.LIZIZ.nextBytes(this.LJIIIIZZ);
                    this.LIZLLL.m52write(this.LJIIIIZZ);
                    if (size > 0) {
                        C1496690p3D c1496690p3D = this.LIZLLL;
                        long j = c1496690p3D.LLILLJJLI;
                        byteString.write$jvm(c1496690p3D);
                        this.LIZLLL.LJIILLIIL(this.LJIIIZ);
                        this.LJIIIZ.LIZIZ(j);
                        C1497500p4W.LIZIZ(this.LJIIIZ, this.LJIIIIZZ);
                        this.LJIIIZ.close();
                    }
                } else {
                    this.LIZLLL.LJJJZ(size);
                    C1496690p3D c1496690p3D2 = this.LIZLLL;
                    c1496690p3D2.getClass();
                    byteString.write$jvm(c1496690p3D2);
                }
                this.LIZJ.flush();
                return;
            }
            throw new IllegalArgumentException("Payload size must be less than or equal to 125");
        }
        throw new IOException("closed");
    }

    public C1497440p4Q(boolean z, InterfaceC1496780p3M interfaceC1496780p3M, Random random) {
        byte[] bArr;
        if (interfaceC1496780p3M != null) {
            if (random != null) {
                this.LIZ = z;
                this.LIZJ = interfaceC1496780p3M;
                this.LIZLLL = interfaceC1496780p3M.buffer();
                this.LIZIZ = random;
                if (z) {
                    bArr = new byte[4];
                } else {
                    bArr = null;
                }
                this.LJIIIIZZ = bArr;
                this.LJIIIZ = z ? new C1496760p3K() : null;
                return;
            }
            throw new NullPointerException("random == null");
        }
        throw new NullPointerException("sink == null");
    }

    public final void LIZIZ(int i, long j, boolean z, boolean z2) {
        if (!this.LJ) {
            int i2 = 0;
            if (!z) {
                i = 0;
            }
            if (z2) {
                i |= 128;
            }
            this.LIZLLL.LJJJZ(i);
            if (this.LIZ) {
                i2 = 128;
            }
            if (j <= 125) {
                this.LIZLLL.LJJJZ(((int) j) | i2);
            } else if (j <= 65535) {
                this.LIZLLL.LJJJZ(i2 | 126);
                this.LIZLLL.LJL((int) j);
            } else {
                this.LIZLLL.LJJJZ(i2 | 127);
                this.LIZLLL.LJJLL(j);
            }
            if (this.LIZ) {
                this.LIZIZ.nextBytes(this.LJIIIIZZ);
                this.LIZLLL.m52write(this.LJIIIIZZ);
                if (j > 0) {
                    C1496690p3D c1496690p3D = this.LIZLLL;
                    long j2 = c1496690p3D.LLILLJJLI;
                    c1496690p3D.LLFF(this.LJFF, j);
                    this.LIZLLL.LJIILLIIL(this.LJIIIZ);
                    this.LJIIIZ.LIZIZ(j2);
                    C1497500p4W.LIZIZ(this.LJIIIZ, this.LJIIIIZZ);
                    this.LJIIIZ.close();
                }
            } else {
                this.LIZLLL.LLFF(this.LJFF, j);
            }
            this.LIZJ.LLFII();
            return;
        }
        throw new IOException("closed");
    }
}
