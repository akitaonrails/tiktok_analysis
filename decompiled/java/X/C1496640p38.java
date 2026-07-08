package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.EOFException;
import java.io.IOException;
import java.util.zip.DataFormatException;
import java.util.zip.Inflater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0p38, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1496640p38 implements InterfaceC842570X3n {
    public int LL;
    public boolean LLILLJJLI;
    public final InterfaceC1496620p36 LLILLL;
    public final Inflater LLILZ;

    @Override // X.InterfaceC842570X3n, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.LLILLJJLI) {
            return;
        }
        this.LLILZ.end();
        this.LLILLJJLI = true;
        this.LLILLL.close();
    }

    @Override // X.InterfaceC842570X3n
    public final C1496250p2V timeout() {
        return this.LLILLL.timeout();
    }

    public C1496640p38(C1496670p3B c1496670p3B, Inflater inflater) {
        this.LLILLL = c1496670p3B;
        this.LLILZ = inflater;
    }

    @Override // X.InterfaceC842570X3n
    public final long read(C1496690p3D c1496690p3D, long j) throws IOException {
        boolean z;
        if (j >= 0) {
            if (!this.LLILLJJLI) {
                if (j == 0) {
                    return 0L;
                }
                do {
                    if (this.LLILZ.needsInput()) {
                        int i = this.LL;
                        if (i != 0) {
                            int remaining = i - this.LLILZ.getRemaining();
                            this.LL -= remaining;
                            this.LLILLL.skip(remaining);
                        }
                        if (this.LLILZ.getRemaining() == 0) {
                            if (this.LLILLL.LJJJJLL()) {
                                z = true;
                            } else {
                                C1496750p3J c1496750p3J = this.LLILLL.LJIIIZ().LL;
                                if (c1496750p3J == null) {
                                    Intrinsics.LJIIL();
                                }
                                int i2 = c1496750p3J.LIZJ;
                                int i3 = c1496750p3J.LIZIZ;
                                int i4 = i2 - i3;
                                this.LL = i4;
                                this.LLILZ.setInput(c1496750p3J.LIZ, i3, i4);
                                z = false;
                            }
                        } else {
                            "?".toString();
                            throw new IllegalStateException("?");
                        }
                    } else {
                        z = false;
                    }
                    try {
                        C1496750p3J c1496750p3JLJJJJJL = c1496690p3D.LJJJJJL(1);
                        int iInflate = this.LLILZ.inflate(c1496750p3JLJJJJJL.LIZ, c1496750p3JLJJJJJL.LIZJ, (int) Math.min(j, 8192 - c1496750p3JLJJJJJL.LIZJ));
                        if (iInflate > 0) {
                            c1496750p3JLJJJJJL.LIZJ += iInflate;
                            long j2 = iInflate;
                            c1496690p3D.LLILLJJLI += j2;
                            return j2;
                        }
                        if (this.LLILZ.finished() || this.LLILZ.needsDictionary()) {
                            int i5 = this.LL;
                            if (i5 != 0) {
                                int remaining2 = i5 - this.LLILZ.getRemaining();
                                this.LL -= remaining2;
                                this.LLILLL.skip(remaining2);
                            }
                            if (c1496750p3JLJJJJJL.LIZIZ == c1496750p3JLJJJJJL.LIZJ) {
                                c1496690p3D.LL = c1496750p3JLJJJJJL.LIZ();
                                C1496800p3O.LIZ(c1496750p3JLJJJJJL);
                                return -1L;
                            }
                            return -1L;
                        }
                    } catch (DataFormatException e) {
                        TryCatchGuardChecker.doCheck(e);
                        throw new IOException(e);
                    }
                } while (!z);
                throw new EOFException("source exhausted prematurely");
            }
            "closed".toString();
            throw new IllegalStateException("closed");
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("byteCount < 0: ");
        sbLIZ.append(j);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        strLIZIZ.toString();
        throw new IllegalArgumentException(strLIZIZ);
    }
}
