package X;

import java.io.IOException;

/* JADX INFO: renamed from: X.0p4U, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1497480p4U implements InterfaceC1495590p1R {
    public int LL;
    public long LLILLJJLI;
    public boolean LLILLL;
    public boolean LLILZ;
    public final /* synthetic */ C1497440p4Q LLILZIL;

    @Override // X.InterfaceC1495590p1R, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.LLILZ) {
            throw new IOException("closed");
        }
        C1497440p4Q c1497440p4Q = this.LLILZIL;
        c1497440p4Q.LIZIZ(this.LL, c1497440p4Q.LJFF.LLILLJJLI, this.LLILLL, true);
        this.LLILZ = true;
        this.LLILZIL.LJII = false;
    }

    @Override // X.InterfaceC1495590p1R, java.io.Flushable
    public final void flush() throws IOException {
        if (this.LLILZ) {
            throw new IOException("closed");
        }
        C1497440p4Q c1497440p4Q = this.LLILZIL;
        c1497440p4Q.LIZIZ(this.LL, c1497440p4Q.LJFF.LLILLJJLI, this.LLILLL, false);
        this.LLILLL = false;
    }

    @Override // X.InterfaceC1495590p1R
    public final C1496250p2V timeout() {
        return this.LLILZIL.LIZJ.timeout();
    }

    public C1497480p4U(C1497440p4Q c1497440p4Q) {
        this.LLILZIL = c1497440p4Q;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0042  */
    @Override // X.InterfaceC1495590p1R
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLFF(X.C1496690p3D r9, long r10) throws java.io.IOException {
        /*
            r8 = this;
            boolean r0 = r8.LLILZ
            if (r0 != 0) goto L44
            X.0p4Q r0 = r8.LLILZIL
            X.0p3D r0 = r0.LJFF
            r0.LLFF(r9, r10)
            boolean r0 = r8.LLILLL
            r7 = 0
            if (r0 == 0) goto L42
            long r4 = r8.LLILLJJLI
            r1 = -1
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 == 0) goto L42
            X.0p4Q r0 = r8.LLILZIL
            X.0p3D r0 = r0.LJFF
            long r2 = r0.LLILLJJLI
            r0 = 8192(0x2000, double:4.0474E-320)
            long r4 = r4 - r0
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 <= 0) goto L42
            r3 = 1
        L26:
            X.0p4Q r0 = r8.LLILZIL
            X.0p3D r0 = r0.LJFF
            long r4 = r0.LIZLLL()
            r1 = 0
            int r0 = (r4 > r1 ? 1 : (r4 == r1 ? 0 : -1))
            if (r0 <= 0) goto L41
            if (r3 != 0) goto L41
            X.0p4Q r2 = r8.LLILZIL
            int r3 = r8.LL
            boolean r6 = r8.LLILLL
            r2.LIZIZ(r3, r4, r6, r7)
            r8.LLILLL = r7
        L41:
            return
        L42:
            r3 = 0
            goto L26
        L44:
            java.io.IOException r1 = new java.io.IOException
            java.lang.String r0 = "closed"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1497480p4U.LLFF(X.0p3D, long):void");
    }
}
