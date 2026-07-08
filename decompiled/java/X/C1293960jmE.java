package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.InputStream;

/* JADX INFO: renamed from: X.0jmE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class C1293960jmE extends InputStream {
    public final String LL;
    public final long LLILLJJLI;
    public final InputStream LLILLL;
    public boolean LLILZ;
    public boolean LLILZIL;
    public long LLILZLL;
    public byte[] LLIZ;
    public String LLIZLLLIL;

    /* JADX WARN: Removed duplicated region for block: B:34:0x0047 A[Catch: all -> 0x005a, TryCatch #5 {all -> 0x005a, blocks: (B:32:0x0040, B:34:0x0047, B:35:0x004b, B:40:0x0053, B:41:0x0056, B:31:0x003d), top: B:57:0x003d, inners: #8 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized byte[] LIZ() throws java.lang.Throwable {
        /*
            r6 = this;
            monitor-enter(r6)
            byte[] r0 = r6.LLIZ     // Catch: java.lang.Throwable -> L57
            if (r0 == 0) goto L7
            monitor-exit(r6)
            return r0
        L7:
            boolean r0 = r6.LLILZIL     // Catch: java.lang.Throwable -> L57
            r5 = 0
            if (r0 == 0) goto L10
            byte[] r0 = new byte[r5]     // Catch: java.lang.Throwable -> L57
            monitor-exit(r6)
            return r0
        L10:
            java.io.ByteArrayOutputStream r4 = new java.io.ByteArrayOutputStream     // Catch: java.lang.Throwable -> L3b
            r4.<init>()     // Catch: java.lang.Throwable -> L3b
            r3 = 0
            X.C2106208My.LIZ(r6, r4)     // Catch: java.lang.Throwable -> L24
            byte[] r0 = r4.toByteArray()     // Catch: java.lang.Throwable -> L24
            X.C2107108Nh.LIZ(r4, r3)     // Catch: java.lang.Throwable -> L3b
            r6.LLIZ = r0     // Catch: java.lang.Throwable -> L3b
            r2 = r6
            goto L40
        L24:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L2d
            throw r1     // Catch: java.lang.Throwable -> L29
        L29:
            r0 = move-exception
            r2 = r6
            r3 = r1
            goto L2f
        L2d:
            r0 = move-exception
            r2 = r6
        L2f:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L33
            goto L35
        L33:
            r0 = move-exception
            goto L2f
        L35:
            X.C2107108Nh.LIZ(r4, r3)     // Catch: java.lang.Throwable -> L39
            throw r0     // Catch: java.lang.Throwable -> L39
        L39:
            r0 = move-exception
            goto L3d
        L3b:
            r0 = move-exception
            r2 = r6
        L3d:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L4f
        L40:
            r6.LIZIZ()     // Catch: java.lang.Throwable -> L5a
            byte[] r0 = r6.LLIZ     // Catch: java.lang.Throwable -> L5a
            if (r0 != 0) goto L4b
            byte[] r0 = new byte[r5]     // Catch: java.lang.Throwable -> L5a
            r6.LLIZ = r0     // Catch: java.lang.Throwable -> L5a
        L4b:
            byte[] r0 = r6.LLIZ     // Catch: java.lang.Throwable -> L5a
            monitor-exit(r2)
            return r0
        L4f:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L4f
            r6.LIZIZ()     // Catch: java.lang.Throwable -> L5a
            throw r0     // Catch: java.lang.Throwable -> L5a
        L57:
            r0 = move-exception
            r2 = r6
            goto L5b
        L5a:
            r0 = move-exception
        L5b:
            monitor-exit(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1293960jmE.LIZ():byte[]");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.LLILZIL = true;
        this.LLILLL.close();
    }

    @Override // java.io.InputStream
    public final int read() throws IOException {
        int i = this.LLILLL.read();
        if (i != -1) {
            this.LLILZLL++;
            return i;
        }
        this.LLILZ = true;
        return i;
    }

    public final String toString() {
        return "ResponseBody(contentType='" + this.LL + "', contentLength=" + this.LLILLJJLI + ", finished=" + this.LLILZ + ", closed=" + this.LLILZIL + ", readLength=" + this.LLILZLL + ")";
    }

    public final void LIZIZ() {
        try {
            close();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }

    public C1293960jmE(InputStream inputStream, long j, String str) {
        this.LL = str;
        this.LLILLJJLI = j;
        this.LLILLL = inputStream;
    }
}
