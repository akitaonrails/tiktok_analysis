package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.zip.Deflater;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0p3I, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1496740p3I implements InterfaceC1495590p1R {
    public boolean LL;
    public final InterfaceC1496780p3M LLILLJJLI;
    public final Deflater LLILLL;

    @Override // X.InterfaceC1495590p1R, java.io.Flushable
    public final void flush() {
        LIZ(true);
        this.LLILLJJLI.flush();
    }

    @Override // X.InterfaceC1495590p1R, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws Throwable {
        if (this.LL) {
            return;
        }
        try {
            this.LLILLL.finish();
            LIZ(false);
            th = null;
        } catch (Throwable th) {
            th = th;
            TryCatchGuardChecker.doCheck(th);
        }
        try {
            this.LLILLL.end();
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.LLILLJJLI.close();
        } catch (Throwable th3) {
            TryCatchGuardChecker.doCheck(th3);
            if (th == null) {
                th = th3;
            }
        }
        this.LL = true;
        if (th != null) {
            throw th;
        }
    }

    @Override // X.InterfaceC1495590p1R
    public final C1496250p2V timeout() {
        return this.LLILLJJLI.timeout();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("DeflaterSink(");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final void LIZ(boolean z) {
        C1496750p3J c1496750p3JLJJJJJL;
        int iDeflate;
        C1496690p3D c1496690p3DLJIIIZ = this.LLILLJJLI.LJIIIZ();
        while (true) {
            c1496750p3JLJJJJJL = c1496690p3DLJIIIZ.LJJJJJL(1);
            if (z) {
                Deflater deflater = this.LLILLL;
                byte[] bArr = c1496750p3JLJJJJJL.LIZ;
                int i = c1496750p3JLJJJJJL.LIZJ;
                iDeflate = deflater.deflate(bArr, i, 8192 - i, 2);
            } else {
                Deflater deflater2 = this.LLILLL;
                byte[] bArr2 = c1496750p3JLJJJJJL.LIZ;
                int i2 = c1496750p3JLJJJJJL.LIZJ;
                iDeflate = deflater2.deflate(bArr2, i2, 8192 - i2);
            }
            if (iDeflate > 0) {
                c1496750p3JLJJJJJL.LIZJ += iDeflate;
                c1496690p3DLJIIIZ.LLILLJJLI += (long) iDeflate;
                this.LLILLJJLI.LJLJLJ();
            } else if (this.LLILLL.needsInput()) {
                break;
            }
        }
        if (c1496750p3JLJJJJJL.LIZIZ == c1496750p3JLJJJJJL.LIZJ) {
            c1496690p3DLJIIIZ.LL = c1496750p3JLJJJJJL.LIZ();
            C1496800p3O.LIZ(c1496750p3JLJJJJJL);
        }
    }

    public C1496740p3I(C1496710p3F c1496710p3F, Deflater deflater) {
        this.LLILLJJLI = c1496710p3F;
        this.LLILLL = deflater;
    }

    @Override // X.InterfaceC1495590p1R
    public final void LLFF(C1496690p3D c1496690p3D, long j) {
        long j2 = j;
        C1496820p3Q.LIZIZ(c1496690p3D.LLILLJJLI, 0L, j2);
        while (j2 > 0) {
            C1496750p3J c1496750p3J = c1496690p3D.LL;
            if (c1496750p3J == null) {
                Intrinsics.LJIIL();
            }
            int iMin = (int) Math.min(j2, c1496750p3J.LIZJ - c1496750p3J.LIZIZ);
            this.LLILLL.setInput(c1496750p3J.LIZ, c1496750p3J.LIZIZ, iMin);
            LIZ(false);
            long j3 = iMin;
            c1496690p3D.LLILLJJLI -= j3;
            int i = c1496750p3J.LIZIZ + iMin;
            c1496750p3J.LIZIZ = i;
            if (i == c1496750p3J.LIZJ) {
                c1496690p3D.LL = c1496750p3J.LIZ();
                C1496800p3O.LIZ(c1496750p3J);
            }
            j2 -= j3;
        }
    }
}
