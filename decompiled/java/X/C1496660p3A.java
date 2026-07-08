package X;

import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;
import java.util.zip.CRC32;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0p3A, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1496660p3A implements InterfaceC842570X3n {
    public byte LL;
    public final C1496670p3B LLILLJJLI;
    public final Inflater LLILLL;
    public final C1496640p38 LLILZ;
    public final CRC32 LLILZIL;

    @Override // X.InterfaceC842570X3n, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LLILZ.close();
    }

    @Override // X.InterfaceC842570X3n
    public final C1496250p2V timeout() {
        return this.LLILLJJLI.timeout();
    }

    public C1496660p3A(InterfaceC842570X3n interfaceC842570X3n) {
        C1496670p3B c1496670p3B = new C1496670p3B(interfaceC842570X3n);
        this.LLILLJJLI = c1496670p3B;
        Inflater inflater = new Inflater(true);
        this.LLILLL = inflater;
        this.LLILZ = new C1496640p38(c1496670p3B, inflater);
        this.LLILZIL = new CRC32();
    }

    @Override // X.InterfaceC842570X3n
    public final long read(C1496690p3D c1496690p3D, long j) throws IOException {
        byte b;
        boolean z;
        boolean z2;
        boolean z3;
        long j2;
        if (j >= 0) {
            if (j == 0) {
                return 0L;
            }
            if (this.LL == 0) {
                this.LLILLJJLI.LLIIII(10L);
                byte bLJI = this.LLILLJJLI.LL.LJI(3L);
                if (((bLJI >> 1) & 1) == 1) {
                    z = true;
                    LIZIZ(this.LLILLJJLI.LL, 0L, 10L);
                } else {
                    z = false;
                }
                LIZ(8075, this.LLILLJJLI.readShort(), "ID1ID2");
                this.LLILLJJLI.skip(8L);
                if (((bLJI >> 2) & 1) == 1) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    this.LLILLJJLI.LLIIII(2L);
                    if (z) {
                        LIZIZ(this.LLILLJJLI.LL, 0L, 2L);
                    }
                    int i = this.LLILLJJLI.LL.readShort() & 65535;
                    long j3 = (short) (((i & 255) << 8) | ((i & 65280) >>> 8));
                    this.LLILLJJLI.LLIIII(j3);
                    if (z) {
                        LIZIZ(this.LLILLJJLI.LL, 0L, j3);
                    }
                    this.LLILLJJLI.skip(j3);
                }
                if (((bLJI >> 3) & 1) == 1) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (z3) {
                    long jLIZ = this.LLILLJJLI.LIZ(0L, Long.MAX_VALUE, (byte) 0);
                    if (jLIZ != -1) {
                        if (z) {
                            LIZIZ(this.LLILLJJLI.LL, 0L, jLIZ + 1);
                        }
                        this.LLILLJJLI.skip(jLIZ + 1);
                    } else {
                        throw new EOFException();
                    }
                }
                if (((bLJI >> 4) & 1) == 1) {
                    long jLIZ2 = this.LLILLJJLI.LIZ(0L, Long.MAX_VALUE, (byte) 0);
                    if (jLIZ2 != -1) {
                        if (z) {
                            b = 1;
                            j2 = 2;
                            LIZIZ(this.LLILLJJLI.LL, 0L, jLIZ2 + 1);
                        } else {
                            b = 1;
                            j2 = 2;
                        }
                        this.LLILLJJLI.skip(jLIZ2 + 1);
                    } else {
                        throw new EOFException();
                    }
                } else {
                    b = 1;
                    j2 = 2;
                }
                if (z) {
                    C1496670p3B c1496670p3B = this.LLILLJJLI;
                    c1496670p3B.LLIIII(j2);
                    int i2 = c1496670p3B.LL.readShort() & 65535;
                    LIZ((short) (((i2 & 255) << 8) | ((i2 & 65280) >>> 8)), (short) this.LLILZIL.getValue(), "FHCRC");
                    this.LLILZIL.reset();
                }
                this.LL = b;
            } else {
                b = 1;
            }
            if (this.LL == b) {
                long j4 = c1496690p3D.LLILLJJLI;
                long j5 = this.LLILZ.read(c1496690p3D, j);
                if (j5 != -1) {
                    LIZIZ(c1496690p3D, j4, j5);
                    return j5;
                }
                this.LL = (byte) 2;
            }
            if (this.LL == 2) {
                LIZ(this.LLILLJJLI.LJJIFFI(), (int) this.LLILZIL.getValue(), "CRC");
                LIZ(this.LLILLJJLI.LJJIFFI(), (int) this.LLILLL.getBytesWritten(), "ISIZE");
                this.LL = (byte) 3;
                if (!this.LLILLJJLI.LJJJJLL()) {
                    throw new IOException("gzip finished without exhausting source");
                }
            }
            return -1L;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("byteCount < 0: ");
        sbLIZ.append(j);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }

    public static void LIZ(int i, int i2, String str) throws IOException {
        if (i2 == i) {
        } else {
            throw new IOException(C786410Ut5.j4("%s: actual 0x%08x != expected 0x%08x", Arrays.copyOf(new Object[]{str, Integer.valueOf(i2), Integer.valueOf(i)}, 3)));
        }
    }

    public final void LIZIZ(C1496690p3D c1496690p3D, long j, long j2) {
        C1496750p3J c1496750p3J = c1496690p3D.LL;
        if (c1496750p3J == null) {
            Intrinsics.LJIIL();
        }
        while (true) {
            int i = c1496750p3J.LIZJ;
            int i2 = c1496750p3J.LIZIZ;
            if (j < i - i2) {
                break;
            }
            j -= (long) (i - i2);
            c1496750p3J = c1496750p3J.LJFF;
            if (c1496750p3J == null) {
                Intrinsics.LJIIL();
            }
        }
        while (j2 > 0) {
            int i3 = (int) (((long) c1496750p3J.LIZIZ) + j);
            int iMin = (int) Math.min(c1496750p3J.LIZJ - i3, j2);
            this.LLILZIL.update(c1496750p3J.LIZ, i3, iMin);
            j2 -= (long) iMin;
            c1496750p3J = c1496750p3J.LJFF;
            if (c1496750p3J == null) {
                Intrinsics.LJIIL();
            }
            j = 0;
        }
    }
}
