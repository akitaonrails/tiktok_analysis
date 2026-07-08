package X;

import java.io.Closeable;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import okio.ByteString;
import xlp.c;

/* JADX INFO: renamed from: X.0p1y, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1495920p1y implements Closeable {
    public static final Logger LLIZ = Logger.getLogger(C1495990p25.class.getName());
    public final InterfaceC1496780p3M LL;
    public final boolean LLILLJJLI;
    public final C1496690p3D LLILLL;
    public int LLILZ;
    public boolean LLILZIL;
    public final C1495950p21 LLILZLL;

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        this.LLILZIL = true;
        this.LL.close();
    }

    public final synchronized void flush() {
        if (this.LLILZIL) {
            throw new IOException("closed");
        }
        this.LL.flush();
    }

    public final synchronized void LIZ(C1496200p2Q c1496200p2Q) {
        int i;
        int i2;
        if (!this.LLILZIL) {
            int i3 = this.LLILZ;
            int i4 = c1496200p2Q.LIZ;
            if ((i4 & 32) != 0) {
                i3 = c1496200p2Q.LIZIZ[5];
            }
            this.LLILZ = i3;
            if ((i4 & 2) != 0) {
                i = c1496200p2Q.LIZIZ[1];
            } else {
                i = -1;
            }
            if (i != -1) {
                C1495950p21 c1495950p21 = this.LLILZLL;
                if ((i4 & 2) != 0) {
                    i2 = c1496200p2Q.LIZIZ[1];
                } else {
                    i2 = -1;
                }
                c1495950p21.getClass();
                int iMin = Math.min(i2, 16384);
                int i5 = c1495950p21.LIZLLL;
                if (i5 != iMin) {
                    if (iMin < i5) {
                        c1495950p21.LIZIZ = Math.min(c1495950p21.LIZIZ, iMin);
                    }
                    c1495950p21.LIZJ = true;
                    c1495950p21.LIZLLL = iMin;
                    int i6 = c1495950p21.LJII;
                    if (iMin < i6) {
                        if (iMin != 0) {
                            c1495950p21.LIZ(i6 - iMin);
                        } else {
                            Arrays.fill(c1495950p21.LJ, (Object) null);
                            c1495950p21.LJFF = c1495950p21.LJ.length - 1;
                            c1495950p21.LJI = 0;
                            c1495950p21.LJII = 0;
                        }
                    }
                }
            }
            LIZLLL(0, 0, (byte) 4, (byte) 1);
            this.LL.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void LJIILLIIL(C1496200p2Q c1496200p2Q) {
        int i;
        if (!this.LLILZIL) {
            LIZLLL(0, Integer.bitCount(c1496200p2Q.LIZ) * 6, (byte) 4, (byte) 0);
            int i2 = 0;
            do {
                if (((1 << i2) & c1496200p2Q.LIZ) != 0) {
                    if (i2 == 4) {
                        i = 3;
                    } else if (i2 == 7) {
                        i = 4;
                    } else {
                        i = i2;
                    }
                    this.LL.writeShort(i);
                    this.LL.writeInt(c1496200p2Q.LIZIZ[i2]);
                }
                i2++;
            } while (i2 < 10);
            this.LL.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public C1495920p1y(InterfaceC1496780p3M interfaceC1496780p3M, boolean z) {
        this.LL = interfaceC1496780p3M;
        this.LLILLJJLI = z;
        C1496690p3D c1496690p3D = new C1496690p3D();
        this.LLILLL = c1496690p3D;
        this.LLILZLL = new C1495950p21(c1496690p3D);
        this.LLILZ = 16384;
    }

    public final synchronized void LJIILL(int i, EnumC1496090p2F enumC1496090p2F) {
        if (!this.LLILZIL) {
            if (enumC1496090p2F.httpCode != -1) {
                LIZLLL(i, 4, (byte) 3, (byte) 0);
                this.LL.writeInt(enumC1496090p2F.httpCode);
                this.LL.flush();
            } else {
                throw new IllegalArgumentException();
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void LJIJJ(int i, long j) {
        if (!this.LLILZIL) {
            if (j != 0 && j <= 2147483647L) {
                LIZLLL(i, 4, (byte) 8, (byte) 0);
                this.LL.writeInt((int) j);
                this.LL.flush();
            } else {
                Object[] objArr = {Long.valueOf(j)};
                ByteString byteString = C1495990p25.LIZ;
                throw new IllegalArgumentException(c.LJIIJJI("windowSizeIncrement == 0 || windowSizeIncrement > 0x7fffffffL: %s", objArr));
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void LJIJJLI(int i, long j) {
        byte b;
        while (j > 0) {
            int iMin = (int) Math.min(this.LLILZ, j);
            long j2 = iMin;
            j -= j2;
            if (j == 0) {
                b = 4;
            } else {
                b = 0;
            }
            LIZLLL(i, iMin, (byte) 9, b);
            this.LL.LLFF(this.LLILLL, j2);
        }
    }

    public final synchronized void LJFF(int i, EnumC1496090p2F enumC1496090p2F, byte[] bArr) {
        if (!this.LLILZIL) {
            if (enumC1496090p2F.httpCode != -1) {
                LIZLLL(0, bArr.length + 8, (byte) 7, (byte) 0);
                this.LL.writeInt(i);
                this.LL.writeInt(enumC1496090p2F.httpCode);
                if (bArr.length > 0) {
                    this.LL.write(bArr);
                }
                this.LL.flush();
            } else {
                ByteString byteString = C1495990p25.LIZ;
                throw new IllegalArgumentException(c.LJIIJJI("errorCode.httpCode == -1", new Object[0]));
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void LJI(int i, boolean z, List list) throws IOException {
        byte b;
        if (!this.LLILZIL) {
            this.LLILZLL.LIZLLL(list);
            long j = this.LLILLL.LLILLJJLI;
            int iMin = (int) Math.min(this.LLILZ, j);
            long j2 = iMin;
            if (j == j2) {
                b = 4;
            } else {
                b = 0;
            }
            if (z) {
                b = (byte) (b | 1);
            }
            LIZLLL(i, iMin, (byte) 1, b);
            this.LL.LLFF(this.LLILLL, j2);
            if (j > j2) {
                LJIJJLI(i, j - j2);
                return;
            }
            return;
        }
        throw new IOException("closed");
    }

    public final synchronized void LJII(int i, int i2, boolean z) {
        byte b;
        if (!this.LLILZIL) {
            if (z) {
                b = 1;
            } else {
                b = 0;
            }
            LIZLLL(0, 8, (byte) 6, b);
            this.LL.writeInt(i);
            this.LL.writeInt(i2);
            this.LL.flush();
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void LJIIZILJ(int i, boolean z, List list) {
        if (!this.LLILZIL) {
            LJI(i, z, list);
        } else {
            throw new IOException("closed");
        }
    }

    public final synchronized void LIZIZ(boolean z, int i, C1496690p3D c1496690p3D, int i2) {
        byte b;
        if (!this.LLILZIL) {
            if (z) {
                b = (byte) 1;
            } else {
                b = 0;
            }
            LIZLLL(i, i2, (byte) 0, b);
            if (i2 > 0) {
                this.LL.LLFF(c1496690p3D, i2);
            }
        } else {
            throw new IOException("closed");
        }
    }

    public final void LIZLLL(int i, int i2, byte b, byte b2) {
        Logger logger = LLIZ;
        if (logger.isLoggable(Level.FINE)) {
            logger.fine(C1495990p25.LIZ(false, i, i2, b, b2));
        }
        int i3 = this.LLILZ;
        if (i2 <= i3) {
            if ((Integer.MIN_VALUE & i) == 0) {
                InterfaceC1496780p3M interfaceC1496780p3M = this.LL;
                interfaceC1496780p3M.writeByte((i2 >>> 16) & 255);
                interfaceC1496780p3M.writeByte((i2 >>> 8) & 255);
                interfaceC1496780p3M.writeByte(i2 & 255);
                this.LL.writeByte(b & 255);
                this.LL.writeByte(b2 & 255);
                this.LL.writeInt(i & Integer.MAX_VALUE);
                return;
            }
            Object[] objArr = {Integer.valueOf(i)};
            ByteString byteString = C1495990p25.LIZ;
            throw new IllegalArgumentException(c.LJIIJJI("reserved bit set: %s", objArr));
        }
        Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(i2)};
        ByteString byteString2 = C1495990p25.LIZ;
        throw new IllegalArgumentException(c.LJIIJJI("FRAME_SIZE_ERROR length > %d: %d", objArr2));
    }
}
