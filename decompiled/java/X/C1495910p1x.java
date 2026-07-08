package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.Closeable;
import java.io.IOException;
import java.net.Socket;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import xlp.c;

/* JADX INFO: renamed from: X.0p1x, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1495910p1x implements Closeable {
    public static final C822650WOx LLJJJJJIL;
    public final boolean LL;
    public final AbstractC1496150p2L LLILLJJLI;
    public final String LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public boolean LLIZ;
    public final C822660WOy LLIZLLLIL;
    public final C822650WOx LLJ;
    public final C1496230p2T LLJI;
    public long LLJJIII;
    public final C1496200p2Q LLJJIJI;
    public final C1496200p2Q LLJJIJIIJIL;
    public final Socket LLJJIJIL;
    public final C1495920p1y LLJJJ;
    public final C1496010p27 LLJJJIL;
    public final Set<Integer> LLJJJJ;
    public final Map<Integer, C1495890p1v> LLILLL = new LinkedHashMap();
    public long LLJIJIL = 0;
    public long LLJILJIL = 0;
    public long LLJILJILJ = 0;
    public long LLJILLL = 0;
    public long LLJJ = 0;
    public long LLJJI = 0;

    public final synchronized int LJFF() {
        C1496200p2Q c1496200p2Q;
        c1496200p2Q = this.LLJJIJIIJIL;
        return (c1496200p2Q.LIZ & 16) != 0 ? c1496200p2Q.LIZIZ[4] : Integer.MAX_VALUE;
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        SynchronousQueue synchronousQueue = new SynchronousQueue();
        byte[] bArr = c.LIZ;
        LLJJJJJIL = new C822650WOx(0, Integer.MAX_VALUE, 60L, timeUnit, synchronousQueue, new ThreadFactoryC1496300p2a("OkHttp Http2Connection", true));
    }

    public final void LIZIZ() {
        try {
            EnumC1496090p2F enumC1496090p2F = EnumC1496090p2F.PROTOCOL_ERROR;
            LIZ(enumC1496090p2F, enumC1496090p2F);
        } catch (IOException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        LIZ(EnumC1496090p2F.NO_ERROR, EnumC1496090p2F.CANCEL);
    }

    public final void flush() {
        this.LLJJJ.flush();
    }

    public C1495910p1x(C1495870p1t c1495870p1t) {
        int i;
        C1496200p2Q c1496200p2Q = new C1496200p2Q();
        this.LLJJIJI = c1496200p2Q;
        C1496200p2Q c1496200p2Q2 = new C1496200p2Q();
        this.LLJJIJIIJIL = c1496200p2Q2;
        this.LLJJJJ = new LinkedHashSet();
        this.LLJI = c1495870p1t.LJFF;
        boolean z = c1495870p1t.LJI;
        this.LL = z;
        this.LLILLJJLI = c1495870p1t.LJ;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        this.LLILZLL = i;
        if (z) {
            this.LLILZLL = i + 2;
        }
        if (z) {
            c1496200p2Q.LIZIZ(7, 16777216);
        }
        String str = c1495870p1t.LIZIZ;
        this.LLILZ = str;
        C822660WOy c822660WOy = new C822660WOy(1, new ThreadFactoryC1496300p2a(c.LJIIJJI("OkHttp %s Writer", str), false));
        this.LLIZLLLIL = c822660WOy;
        if (c1495870p1t.LJII != 0) {
            AbstractRunnableC846600XJa abstractRunnableC846600XJa = new AbstractRunnableC846600XJa() { // from class: X.0p29
                @Override // X.AbstractRunnableC846600XJa
                public final void LIZ() {
                    C1495910p1x c1495910p1x;
                    boolean z2;
                    if (C1490230osn.LIZIZ().LIZJ.get()) {
                        synchronized (this.LLILLJJLI) {
                            try {
                                c1495910p1x = this.LLILLJJLI;
                                long j = c1495910p1x.LLJILJIL;
                                long j2 = c1495910p1x.LLJIJIL;
                                if (j < j2) {
                                    z2 = true;
                                } else {
                                    c1495910p1x.LLJIJIL = j2 + 1;
                                    z2 = false;
                                }
                            } catch (Throwable th) {
                                TryCatchGuardChecker.doCheck(th);
                                throw th;
                            }
                        }
                        if (z2) {
                            c1495910p1x.LIZIZ();
                            return;
                        }
                        try {
                            c1495910p1x.LLJJJ.LJII(1, 0, false);
                        } catch (IOException e) {
                            TryCatchGuardChecker.doCheck(e);
                            c1495910p1x.LIZIZ();
                        }
                    }
                }

                {
                    super("OkHttp %s ping", this.LLILLJJLI.LLILZ);
                }
            };
            long j = c1495870p1t.LJII;
            c822660WOy.scheduleAtFixedRate(abstractRunnableC846600XJa, j, j, TimeUnit.MILLISECONDS);
        }
        this.LLJ = new C822650WOx(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new ThreadFactoryC1496300p2a(c.LJIIJJI("OkHttp %s Push Observer", str), true));
        c1496200p2Q2.LIZIZ(7, 65535);
        c1496200p2Q2.LIZIZ(5, 16384);
        this.LLJJIII = c1496200p2Q2.LIZ();
        this.LLJJIJIL = c1495870p1t.LIZ;
        this.LLJJJ = new C1495920p1y(c1495870p1t.LIZLLL, z);
        this.LLJJJIL = new C1496010p27(this, new C1495930p1z(c1495870p1t.LIZJ, z));
    }

    public final synchronized C1495890p1v LIZLLL(int i) {
        return (C1495890p1v) ((LinkedHashMap) this.LLILLL).get(Integer.valueOf(i));
    }

    public final synchronized void LJI(AbstractRunnableC846600XJa abstractRunnableC846600XJa) {
        if (!this.LLIZ) {
            this.LLJ.execute(abstractRunnableC846600XJa);
        }
    }

    public final synchronized C1495890p1v LJII(int i) {
        C1495890p1v c1495890p1vRemove;
        c1495890p1vRemove = this.LLILLL.remove(Integer.valueOf(i));
        notifyAll();
        return c1495890p1vRemove;
    }

    public final void LJIILL(EnumC1496090p2F enumC1496090p2F) {
        synchronized (this.LLJJJ) {
            try {
                synchronized (this) {
                    try {
                        if (this.LLIZ) {
                            return;
                        }
                        this.LLIZ = true;
                        this.LLJJJ.LJFF(this.LLILZIL, enumC1496090p2F, c.LIZ);
                    } finally {
                        TryCatchGuardChecker.doCheck(th);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized void LJIILLIIL(long j) {
        long j2 = this.LLJJI + j;
        this.LLJJI = j2;
        if (j2 >= this.LLJJIJI.LIZ() / 2) {
            LJIJJLI(0, this.LLJJI);
            this.LLJJI = 0L;
        }
    }

    public final void LIZ(EnumC1496090p2F enumC1496090p2F, EnumC1496090p2F enumC1496090p2F2) throws IOException {
        C1495890p1v[] c1495890p1vArr = null;
        try {
            LJIILL(enumC1496090p2F);
            e = null;
        } catch (IOException e) {
            e = e;
            TryCatchGuardChecker.doCheck(e);
        }
        synchronized (this) {
            try {
                if (!this.LLILLL.isEmpty()) {
                    c1495890p1vArr = (C1495890p1v[]) ((LinkedHashMap) this.LLILLL).values().toArray(new C1495890p1v[this.LLILLL.size()]);
                    ((LinkedHashMap) this.LLILLL).clear();
                }
            } finally {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        if (c1495890p1vArr != null) {
            for (C1495890p1v c1495890p1v : c1495890p1vArr) {
                try {
                    c1495890p1v.LIZJ(enumC1496090p2F2);
                } catch (IOException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    if (e != null) {
                        e = e2;
                    }
                }
            }
        }
        try {
            this.LLJJJ.close();
        } catch (IOException e3) {
            if (e == null) {
                e = e3;
            }
        }
        try {
            this.LLJJIJIL.close();
        } catch (IOException e4) {
            e3 = e4;
        }
        this.LLIZLLLIL.shutdown();
        this.LLJ.shutdown();
        if (e != null) {
            throw e;
        }
    }

    public final void LJIJJ(final int i, final EnumC1496090p2F enumC1496090p2F) {
        try {
            C822660WOy c822660WOy = this.LLIZLLLIL;
            final Object[] objArr = {this.LLILZ, Integer.valueOf(i)};
            c822660WOy.execute(new AbstractRunnableC846600XJa(objArr) { // from class: X.0p2D
                @Override // X.AbstractRunnableC846600XJa
                public final void LIZ() {
                    try {
                        C1495910p1x c1495910p1x = this.LLILZ;
                        c1495910p1x.LLJJJ.LJIILL(i, enumC1496090p2F);
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                        this.LLILZ.LIZIZ();
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public final void LJIJJLI(final int i, final long j) {
        try {
            C822660WOy c822660WOy = this.LLIZLLLIL;
            final Object[] objArr = {this.LLILZ, Integer.valueOf(i)};
            c822660WOy.execute(new AbstractRunnableC846600XJa(objArr) { // from class: X.0p2G
                @Override // X.AbstractRunnableC846600XJa
                public final void LIZ() {
                    try {
                        this.LLILZ.LLJJJ.LJIJJ(i, j);
                    } catch (IOException e) {
                        TryCatchGuardChecker.doCheck(e);
                        this.LLILZ.LIZIZ();
                    }
                }
            });
        } catch (RejectedExecutionException e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0028, code lost:
    
        r4 = java.lang.Math.min((int) java.lang.Math.min(r11, r0), r7.LLJJJ.LLILZ);
        r0 = r4;
        r7.LLJJIII -= r0;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIZILJ(int r8, boolean r9, X.C1496690p3D r10, long r11) {
        /*
            r7 = this;
            r5 = 0
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            r1 = 0
            if (r0 != 0) goto Ld
            X.0p1y r0 = r7.LLJJJ
            r0.LIZIZ(r9, r8, r10, r1)
            return
        Ld:
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 <= 0) goto L6b
            monitor-enter(r7)
        L12:
            long r0 = r7.LLJJIII     // Catch: java.lang.InterruptedException -> L54 java.lang.Throwable -> L65
            int r2 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r2 > 0) goto L28
            java.util.Map<java.lang.Integer, X.0p1v> r1 = r7.LLILLL     // Catch: java.lang.InterruptedException -> L54 java.lang.Throwable -> L65
            java.lang.Integer r0 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.InterruptedException -> L54 java.lang.Throwable -> L65
            boolean r0 = r1.containsKey(r0)     // Catch: java.lang.InterruptedException -> L54 java.lang.Throwable -> L65
            if (r0 == 0) goto L4c
            r7.wait()     // Catch: java.lang.InterruptedException -> L54 java.lang.Throwable -> L65
            goto L12
        L28:
            long r0 = java.lang.Math.min(r11, r0)     // Catch: java.lang.Throwable -> L65
            int r2 = (int) r0     // Catch: java.lang.Throwable -> L65
            X.0p1y r0 = r7.LLJJJ     // Catch: java.lang.Throwable -> L65
            int r0 = r0.LLILZ     // Catch: java.lang.Throwable -> L65
            int r4 = java.lang.Math.min(r2, r0)     // Catch: java.lang.Throwable -> L65
            long r2 = r7.LLJJIII     // Catch: java.lang.Throwable -> L65
            long r0 = (long) r4     // Catch: java.lang.Throwable -> L65
            long r2 = r2 - r0
            r7.LLJJIII = r2     // Catch: java.lang.Throwable -> L65
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L65
            long r11 = r11 - r0
            X.0p1y r1 = r7.LLJJJ
            if (r9 == 0) goto L4a
            int r0 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
            if (r0 != 0) goto L4a
            r0 = 1
        L46:
            r1.LIZIZ(r0, r8, r10, r4)
            goto Ld
        L4a:
            r0 = 0
            goto L46
        L4c:
            java.io.IOException r1 = new java.io.IOException     // Catch: java.lang.InterruptedException -> L54 java.lang.Throwable -> L65
            java.lang.String r0 = "stream closed"
            r1.<init>(r0)     // Catch: java.lang.InterruptedException -> L54 java.lang.Throwable -> L65
            throw r1     // Catch: java.lang.InterruptedException -> L54 java.lang.Throwable -> L65
        L54:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L65
            java.lang.Thread r0 = X.C786410Ut5.u3()     // Catch: java.lang.Throwable -> L65
            r0.interrupt()     // Catch: java.lang.Throwable -> L65
            java.io.InterruptedIOException r0 = new java.io.InterruptedIOException     // Catch: java.lang.Throwable -> L65
            r0.<init>()     // Catch: java.lang.Throwable -> L65
            throw r0     // Catch: java.lang.Throwable -> L65
        L65:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L65
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L65
            throw r0
        L6b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1495910p1x.LJIIZILJ(int, boolean, X.0p3D, long):void");
    }
}
