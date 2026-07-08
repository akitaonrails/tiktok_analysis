package X;

import java.io.Closeable;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0p3K, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1496760p3K implements Closeable {
    public C1496690p3D LL;
    public boolean LLILLJJLI;
    public C1496750p3J LLILLL;
    public byte[] LLILZIL;
    public long LLILZ = -1;
    public int LLILZLL = -1;
    public int LLIZ = -1;

    public final int LIZ() {
        long j = this.LLILZ;
        C1496690p3D c1496690p3D = this.LL;
        if (c1496690p3D == null) {
            Intrinsics.LJIIL();
        }
        if (j != c1496690p3D.LLILLJJLI) {
            long j2 = this.LLILZ;
            return LIZIZ(j2 == -1 ? 0L : j2 + ((long) (this.LLIZ - this.LLILZLL)));
        }
        "no more bytes".toString();
        throw new IllegalStateException("no more bytes");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.LL == null) {
            "not attached to a buffer".toString();
            throw new IllegalStateException("not attached to a buffer");
        }
        this.LL = null;
        this.LLILLL = null;
        this.LLILZ = -1L;
        this.LLILZIL = null;
        this.LLILZLL = -1;
        this.LLIZ = -1;
    }

    public final int LIZIZ(long j) {
        C1496690p3D c1496690p3D = this.LL;
        if (c1496690p3D != null) {
            if (j >= -1) {
                long j2 = c1496690p3D.LLILLJJLI;
                if (j <= j2) {
                    if (j != -1 && j != j2) {
                        C1496750p3J c1496750p3J = c1496690p3D.LL;
                        C1496750p3J c1496750p3J2 = this.LLILLL;
                        long j3 = 0;
                        if (c1496750p3J2 != null) {
                            long j4 = this.LLILZ - ((long) (this.LLILZLL - c1496750p3J2.LIZIZ));
                            if (j4 > j) {
                                j2 = j4;
                            } else {
                                j3 = j4;
                                c1496750p3J2 = c1496750p3J;
                                c1496750p3J = c1496750p3J2;
                            }
                        } else {
                            c1496750p3J2 = c1496750p3J;
                        }
                        if (j2 - j > j - j3) {
                            while (true) {
                                if (c1496750p3J == null) {
                                    Intrinsics.LJIIL();
                                }
                                long j5 = ((long) (c1496750p3J.LIZJ - c1496750p3J.LIZIZ)) + j3;
                                if (j < j5) {
                                    break;
                                }
                                c1496750p3J = c1496750p3J.LJFF;
                                j3 = j5;
                            }
                        } else {
                            while (j2 > j) {
                                if (c1496750p3J2 == null) {
                                    Intrinsics.LJIIL();
                                }
                                c1496750p3J2 = c1496750p3J2.LJI;
                                if (c1496750p3J2 == null) {
                                    Intrinsics.LJIIL();
                                }
                                j2 -= (long) (c1496750p3J2.LIZJ - c1496750p3J2.LIZIZ);
                            }
                            j3 = j2;
                            c1496750p3J = c1496750p3J2;
                        }
                        if (this.LLILLJJLI) {
                            if (c1496750p3J == null) {
                                Intrinsics.LJIIL();
                            }
                            if (c1496750p3J.LIZLLL) {
                                byte[] bArr = c1496750p3J.LIZ;
                                C1496750p3J c1496750p3J3 = new C1496750p3J(Arrays.copyOf(bArr, bArr.length), c1496750p3J.LIZIZ, c1496750p3J.LIZJ, false, true);
                                if (c1496690p3D.LL == c1496750p3J) {
                                    c1496690p3D.LL = c1496750p3J3;
                                }
                                c1496750p3J.LIZIZ(c1496750p3J3);
                                C1496750p3J c1496750p3J4 = c1496750p3J3.LJI;
                                if (c1496750p3J4 == null) {
                                    Intrinsics.LJIIL();
                                }
                                c1496750p3J4.LIZ();
                                c1496750p3J = c1496750p3J3;
                            }
                        }
                        this.LLILLL = c1496750p3J;
                        this.LLILZ = j;
                        if (c1496750p3J == null) {
                            Intrinsics.LJIIL();
                        }
                        this.LLILZIL = c1496750p3J.LIZ;
                        int i = c1496750p3J.LIZIZ + ((int) (j - j3));
                        this.LLILZLL = i;
                        int i2 = c1496750p3J.LIZJ;
                        this.LLIZ = i2;
                        return i2 - i;
                    }
                    this.LLILLL = null;
                    this.LLILZ = j;
                    this.LLILZIL = null;
                    this.LLILZLL = -1;
                    this.LLIZ = -1;
                    return -1;
                }
            }
            throw new ArrayIndexOutOfBoundsException(C786410Ut5.j4("offset=%s > size=%s", Arrays.copyOf(new Object[]{Long.valueOf(j), Long.valueOf(c1496690p3D.LLILLJJLI)}, 2)));
        }
        "not attached to a buffer".toString();
        throw new IllegalStateException("not attached to a buffer");
    }
}
