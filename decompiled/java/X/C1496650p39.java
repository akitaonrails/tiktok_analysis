package X;

import java.io.IOException;
import java.io.OutputStream;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0p39, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1496650p39 implements InterfaceC1495590p1R {
    public final OutputStream LL;
    public final C1496250p2V LLILLJJLI;

    @Override // X.InterfaceC1495590p1R, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.LL.close();
    }

    @Override // X.InterfaceC1495590p1R, java.io.Flushable
    public final void flush() throws IOException {
        this.LL.flush();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("sink(");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.InterfaceC1495590p1R
    public final C1496250p2V timeout() {
        return this.LLILLJJLI;
    }

    public C1496650p39(OutputStream outputStream, C1496250p2V c1496250p2V) {
        this.LL = outputStream;
        this.LLILLJJLI = c1496250p2V;
    }

    @Override // X.InterfaceC1495590p1R
    public final void LLFF(C1496690p3D c1496690p3D, long j) throws IOException {
        long j2 = j;
        C1496820p3Q.LIZIZ(c1496690p3D.LLILLJJLI, 0L, j2);
        while (j2 > 0) {
            this.LLILLJJLI.LJFF();
            C1496750p3J c1496750p3J = c1496690p3D.LL;
            if (c1496750p3J == null) {
                Intrinsics.LJIIL();
            }
            int iMin = (int) Math.min(j2, c1496750p3J.LIZJ - c1496750p3J.LIZIZ);
            this.LL.write(c1496750p3J.LIZ, c1496750p3J.LIZIZ, iMin);
            int i = c1496750p3J.LIZIZ + iMin;
            c1496750p3J.LIZIZ = i;
            long j3 = iMin;
            j2 -= j3;
            c1496690p3D.LLILLJJLI -= j3;
            if (i == c1496750p3J.LIZJ) {
                c1496690p3D.LL = c1496750p3J.LIZ();
                C1496800p3O.LIZ(c1496750p3J);
            }
        }
    }
}
