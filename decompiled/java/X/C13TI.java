package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.io.InputStream;
import java.nio.charset.Charset;

/* JADX INFO: renamed from: X.13TI, reason: invalid class name */
/* JADX INFO: loaded from: classes31.dex */
public final class C13TI implements Closeable {
    public final InputStream LL;
    public final Charset LLILLJJLI;
    public byte[] LLILLL;
    public int LLILZ;
    public int LLILZIL;

    /* JADX WARN: Removed duplicated region for block: B:23:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String LIZ() {
        /*
            r10 = this;
            java.io.InputStream r3 = r10.LL
            monitor-enter(r3)
            byte[] r2 = r10.LLILLL     // Catch: java.lang.Throwable -> Lae
            if (r2 == 0) goto La6
            int r1 = r10.LLILZ     // Catch: java.lang.Throwable -> Lae
            int r0 = r10.LLILZIL     // Catch: java.lang.Throwable -> Lae
            r8 = 0
            r7 = -1
            if (r1 < r0) goto L1c
            java.io.InputStream r1 = r10.LL     // Catch: java.lang.Throwable -> Lae
            int r0 = r2.length     // Catch: java.lang.Throwable -> Lae
            int r0 = r1.read(r2, r8, r0)     // Catch: java.lang.Throwable -> Lae
            if (r0 == r7) goto La0
            r10.LLILZ = r8     // Catch: java.lang.Throwable -> Lae
            r10.LLILZIL = r0     // Catch: java.lang.Throwable -> Lae
        L1c:
            int r9 = r10.LLILZ     // Catch: java.lang.Throwable -> Lae
        L1e:
            int r0 = r10.LLILZIL     // Catch: java.lang.Throwable -> Lae
            r6 = 10
            if (r9 == r0) goto L4e
            byte[] r5 = r10.LLILLL     // Catch: java.lang.Throwable -> Lae
            r0 = r5[r9]     // Catch: java.lang.Throwable -> Lae
            if (r0 != r6) goto L4a
            int r4 = r10.LLILZ     // Catch: java.lang.Throwable -> Lae
            if (r9 == r4) goto L48
            int r2 = r9 + (-1)
            r1 = r5[r2]     // Catch: java.lang.Throwable -> Lae
            r0 = 13
            if (r1 != r0) goto L48
        L36:
            java.lang.String r1 = new java.lang.String     // Catch: java.lang.Throwable -> Lae
            int r2 = r2 - r4
            java.nio.charset.Charset r0 = r10.LLILLJJLI     // Catch: java.lang.Throwable -> Lae
            java.lang.String r0 = r0.name()     // Catch: java.lang.Throwable -> Lae
            r1.<init>(r5, r4, r2, r0)     // Catch: java.lang.Throwable -> Lae
            int r0 = r9 + 1
            r10.LLILZ = r0     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lae
            goto L4d
        L48:
            r2 = r9
            goto L36
        L4a:
            int r9 = r9 + 1
            goto L1e
        L4d:
            return r1
        L4e:
            X.13TJ r5 = new X.13TJ     // Catch: java.lang.Throwable -> Lae
            int r1 = r10.LLILZIL     // Catch: java.lang.Throwable -> Lae
            int r0 = r10.LLILZ     // Catch: java.lang.Throwable -> Lae
            int r1 = r1 - r0
            int r0 = r1 + 80
            r5.<init>(r0)     // Catch: java.lang.Throwable -> Lae
        L5a:
            byte[] r2 = r10.LLILLL     // Catch: java.lang.Throwable -> Lae
            int r1 = r10.LLILZ     // Catch: java.lang.Throwable -> Lae
            int r0 = r10.LLILZIL     // Catch: java.lang.Throwable -> Lae
            int r0 = r0 - r1
            r5.write(r2, r1, r0)     // Catch: java.lang.Throwable -> Lae
            r10.LLILZIL = r7     // Catch: java.lang.Throwable -> Lae
            byte[] r2 = r10.LLILLL     // Catch: java.lang.Throwable -> Lae
            if (r2 == 0) goto L77
            java.io.InputStream r1 = r10.LL     // Catch: java.lang.Throwable -> Lae
            int r0 = r2.length     // Catch: java.lang.Throwable -> Lae
            int r0 = r1.read(r2, r8, r0)     // Catch: java.lang.Throwable -> Lae
            if (r0 == r7) goto L9a
            r10.LLILZ = r8     // Catch: java.lang.Throwable -> Lae
            r10.LLILZIL = r0     // Catch: java.lang.Throwable -> Lae
        L77:
            int r4 = r10.LLILZ     // Catch: java.lang.Throwable -> Lae
        L79:
            int r0 = r10.LLILZIL     // Catch: java.lang.Throwable -> Lae
            if (r4 == r0) goto L5a
            byte[] r2 = r10.LLILLL     // Catch: java.lang.Throwable -> Lae
            r0 = r2[r4]     // Catch: java.lang.Throwable -> Lae
            if (r0 != r6) goto L96
            int r1 = r10.LLILZ     // Catch: java.lang.Throwable -> Lae
            if (r4 == r1) goto L8c
            int r0 = r4 - r1
            r5.write(r2, r1, r0)     // Catch: java.lang.Throwable -> Lae
        L8c:
            int r0 = r4 + 1
            r10.LLILZ = r0     // Catch: java.lang.Throwable -> Lae
            java.lang.String r0 = r5.toString()     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lae
            goto L99
        L96:
            int r4 = r4 + 1
            goto L79
        L99:
            return r0
        L9a:
            java.io.EOFException r0 = new java.io.EOFException     // Catch: java.lang.Throwable -> Lae
            r0.<init>()     // Catch: java.lang.Throwable -> Lae
            throw r0     // Catch: java.lang.Throwable -> Lae
        La0:
            java.io.EOFException r0 = new java.io.EOFException     // Catch: java.lang.Throwable -> Lae
            r0.<init>()     // Catch: java.lang.Throwable -> Lae
            throw r0     // Catch: java.lang.Throwable -> Lae
        La6:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.Throwable -> Lae
            java.lang.String r0 = "LineReader is closed"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> Lae
            throw r1     // Catch: java.lang.Throwable -> Lae
        Lae:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lae
            monitor-exit(r3)     // Catch: java.lang.Throwable -> Lae
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C13TI.LIZ():java.lang.String");
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.LL) {
            try {
                if (this.LLILLL != null) {
                    this.LLILLL = null;
                    this.LL.close();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public C13TI(C0VSP c0vsp, Charset charset) {
        if (charset != null) {
            if (charset.equals(C08IH.LIZ)) {
                this.LL = c0vsp;
                this.LLILLJJLI = charset;
                this.LLILLL = new byte[8192];
                return;
            }
            throw new IllegalArgumentException("Unsupported encoding");
        }
        throw null;
    }
}
