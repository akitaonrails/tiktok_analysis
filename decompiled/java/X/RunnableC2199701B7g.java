package X;

import android.text.TextUtils;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.exception.BaseException;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import com.ss.android.socialbase.downloader.segment.SegmentApplyException;
import com.ss.android.socialbase.downloader.segment.StreamClosedException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Future;

/* JADX INFO: renamed from: X.1B7g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class RunnableC2199701B7g implements Runnable {
    public final C2199711B7h LL;
    public final InterfaceC2200051B8p LLILLJJLI;
    public final DownloadInfo LLILLL;
    public final C2199751B7l LLILZ;
    public C1B8V LLILZIL;
    public C2199861B7w LLILZLL;
    public volatile C2199811B7r LLIZLLLIL;
    public C2199791B7p LLJ;
    public long LLJI;
    public volatile long LLJIJIL;
    public volatile long LLJILJIL;
    public volatile long LLJILLL;
    public Future LLJJ;
    public volatile boolean LLJJI;
    public volatile boolean LLJJIII;
    public volatile boolean LLJJIJI;
    public Thread LLJJIJIIJIL;
    public final int LLJJIJIL;
    public volatile boolean LLJJJ;
    public int LLJJJIL;
    public int LLJJJJ;
    public int LLJJJJJIL;
    public final C1490870otp LLJJJJLIIL;
    public final C1498750p6X LLJJL;
    public long LLJJLIIIJLLLLLLLZ;
    public int LLJL;
    public boolean LLJLIL;
    public BaseException LLJLILLLLZIIL;
    public boolean LLJLL;
    public C1B8H LLJLLIL;
    public volatile long LLJLLL;
    public volatile long LLJZ;
    public volatile long LLJZIJLIL;
    public volatile long LLL;
    public String LLLF;
    public String LLLFF;
    public String LLLFFI;
    public final List<C2199811B7r> LLIZ = new ArrayList();
    public volatile long LLJILJILJ = -1;

    public final void LIZIZ() {
        C1B8V c1b8v = this.LLILZIL;
        if (c1b8v != null) {
            try {
                if (C1490830otl.LIZ()) {
                    int id = this.LLILLL.getId();
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Thread: ");
                    sbLIZ.append(this.LLJJIJIL);
                    C1490830otl.LIZLLL(id, "SegmentReader", "closeConnection", C2188811AlT.LIZIZ(sbLIZ));
                }
                c1b8v.end();
                c1b8v.cancel();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(6:46|24|71|25|(3:27|28|84)(2:29|(2:31|81)(1:80))|38) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00ac, code lost:
    
        r7 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ad, code lost:
    
        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r7);
        r4 = r8.LLILLL.getId();
        r1 = X.C2188811AlT.LIZ();
        r1.append("SegmentApplyException, Exception = ");
        r1.append(r7);
        X.C1490830otl.LJ(r4, "SegmentReader", "run", X.C2188811AlT.LIZIZ(r1));
        r1 = r8.LLJJJIL;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00d1, code lost:
    
        if (r1 >= 50) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d3, code lost:
    
        r4 = r8.LLILLL.getId();
        r1 = X.C2188811AlT.LIZ();
        r1.append("Segment apply failed ");
        r1.append(r8.LLJJJIL);
        r1.append("times, thread_index = ");
        r1.append(r8.LLJJIJIL);
        X.C1490830otl.LJ(r4, "SegmentReader", "run", X.C2188811AlT.LIZIZ(r1));
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00fd, code lost:
    
        r8.LLJJJIL = r1 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0101, code lost:
    
        r8.LLIZLLLIL = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x010a, code lost:
    
        r8.LLIZLLLIL = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x010d, code lost:
    
        r8.LLIZLLLIL = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x012b, code lost:
    
        if (X.C1490830otl.LIZ() == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x012d, code lost:
    
        r4 = r8.LLILLL.getId();
        r1 = X.C2188811AlT.LIZ();
        r1.append("No more segment, thread_index: ");
        r1.append(r8.LLJJIJIL);
        X.C1490830otl.LIZLLL(r4, "SegmentReader", "run", X.C2188811AlT.LIZIZ(r1));
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005e A[Catch: all -> 0x0121, DONT_GENERATE, TryCatch #0 {all -> 0x0121, blocks: (B:14:0x0047, B:16:0x004d, B:18:0x0056, B:19:0x005b, B:21:0x005e), top: B:68:0x0047, outer: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ() {
        /*
            Method dump skipped, instruction units count: 384
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC2199701B7g.LIZJ():void");
    }

    public final long LJFF() {
        long jLJII;
        synchronized (this.LL) {
            try {
                jLJII = this.LLJILLL + LJII();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return jLJII;
    }

    public final long LJII() {
        synchronized (this.LL) {
            try {
                long j = this.LLJILJILJ;
                long j2 = this.LLJI;
                if (j2 < 0 || j <= j2) {
                    return 0L;
                }
                return j - j2;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LJIIL() {
        this.LLJJLIIIJLLLLLLLZ = this.LLJLLL;
        this.LLJLLL = -1L;
        this.LLJZ = -1L;
        this.LLJZIJLIL = -1L;
        this.LLL = -1L;
        LIZIZ();
    }

    public final void LJIILIIL() {
        this.LLJJJJ = this.LLJ.LIZLLL ? this.LLILLL.getRetryCount() : this.LLILLL.getBackUpUrlRetryCount();
        this.LLJJJJJIL = 0;
        this.LLJJJJLIIL.LIZLLL();
    }

    public final void LJIILJJIL() {
        C2199791B7p c2199791B7p = this.LLJ;
        try {
            synchronized (this.LL) {
                try {
                    long jLJII = LJII();
                    if (jLJII > 0) {
                        this.LLJILLL += jLJII;
                        c2199791B7p.LJIIIZ.addAndGet(jLJII);
                    }
                    this.LLJILJILJ = -1L;
                } finally {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
        } catch (Throwable th) {
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zLIZ;
        C1C7U.LIZ("SegmentReader@72ca.run");
        try {
            LIZJ();
        } finally {
            if (!zLIZ) {
            }
        }
        C1C7U.LIZIZ("SegmentReader@72ca.run");
    }

    public final void LIZ() {
        if (C1490830otl.LIZ()) {
            int id = this.LLILLL.getId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ThreadIndex: ");
            sbLIZ.append(this.LLJJIJIL);
            C1490830otl.LIZLLL(id, "SegmentReader", "close", C2188811AlT.LIZIZ(sbLIZ));
        }
        synchronized (this) {
            try {
                this.LLJJI = true;
                this.LLJJJ = true;
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        LIZIZ();
        Future future = this.LLJJ;
        if (future != null) {
            this.LLJJ = null;
            try {
                future.cancel(true);
            } catch (Throwable th) {
            }
        }
    }

    /* JADX WARN: Not initialized variable reg: 6, insn: 0x023b: IPUT (r0v3 ?? I:long), (r6 I:X.1B7g) (LINE:16777787) X.1B7g.LLJZ long, block:B:79:0x0237 */
    public final void LIZLLL(C2199811B7r c2199811B7r) {
        RunnableC2199701B7g runnableC2199701B7g;
        boolean z;
        try {
            try {
                try {
                    long jCurrentTimeMillis = System.currentTimeMillis();
                    this.LLJZ = 0L;
                    this.LLJLLL = jCurrentTimeMillis;
                    this.LLJI = c2199811B7r.LIZIZ();
                    this.LLJILJIL = c2199811B7r.LIZLLL;
                    if (this.LLJILJIL > 0 && this.LLJI > this.LLJILJIL) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("createConn, ");
                        sbLIZ.append(c2199811B7r);
                        throw new SegmentApplyException(6, C2188811AlT.LIZIZ(sbLIZ));
                    }
                    this.LLJLLIL = new C1B8H();
                    List<HttpHeader> extraHeaders = this.LLILLL.getExtraHeaders();
                    List<HttpHeader> listLIZ = C2199661B7c.LIZ(this.LLJI, this.LLJILJIL, this.LLILLL.geteTag(), extraHeaders);
                    ArrayList arrayList = (ArrayList) listLIZ;
                    arrayList.add(new HttpHeader("Segment-Index", String.valueOf(c2199811B7r.LJ)));
                    arrayList.add(new HttpHeader("Thread-Index", String.valueOf(this.LLJJIJIL)));
                    arrayList.add(new HttpHeader("extra_download_id", String.valueOf(this.LLILLL.getId())));
                    C2199661B7c.LIZJ(this.LLILLL, listLIZ);
                    long ttnetProtectTimeout = this.LLILLL.getTtnetProtectTimeout();
                    if (ttnetProtectTimeout > 300) {
                        ((ArrayList) listLIZ).add(new HttpHeader("extra_ttnet_protect_timeout", String.valueOf(ttnetProtectTimeout)));
                    }
                    Iterator it2 = ((ArrayList) this.LLJJL.LJIIJJI).iterator();
                    while (it2.hasNext()) {
                        ((InterfaceC1498780p6a) it2.next()).LIZ(listLIZ);
                    }
                    String strReplaceFirst = this.LLJ.LIZ;
                    if (this.LLJLIL && !TextUtils.isEmpty(strReplaceFirst) && strReplaceFirst.startsWith("https")) {
                        strReplaceFirst = strReplaceFirst.replaceFirst("https", "http");
                    }
                    String str = this.LLJ.LIZIZ;
                    if (C1490830otl.LIZ()) {
                        int id = this.LLILLL.getId();
                        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                        sbLIZ2.append("Url = ");
                        sbLIZ2.append(strReplaceFirst);
                        sbLIZ2.append(", ip = ");
                        sbLIZ2.append(str);
                        sbLIZ2.append(", segment = ");
                        sbLIZ2.append(c2199811B7r);
                        sbLIZ2.append(", threadIndex = ");
                        sbLIZ2.append(this.LLJJIJIL);
                        C1490830otl.LIZLLL(id, "SegmentReader", "createConnection", C2188811AlT.LIZIZ(sbLIZ2));
                    }
                    this.LLLF = strReplaceFirst;
                    this.LLLFF = str;
                    boolean zIsNeedDefaultHttpServiceBackUp = this.LLILLL.isNeedDefaultHttpServiceBackUp();
                    int maxBytes = this.LLILLL.getMaxBytes();
                    if (jCurrentTimeMillis - this.LLJJLIIIJLLLLLLLZ > 3000 && this.LLILZ.LJIIIIZZ("monitor_download_connect", 0) > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C1B8V c1b8vLIZIZ = C2199681B7e.LIZIZ(zIsNeedDefaultHttpServiceBackUp, maxBytes, strReplaceFirst, str, listLIZ, 0, z, this.LLILLL);
                    if (c1b8vLIZIZ != null) {
                        this.LLILZIL = c1b8vLIZIZ;
                        this.LLILZLL = new C2199861B7w(c1b8vLIZIZ, strReplaceFirst);
                        if (!this.LLJJI) {
                            if (c1b8vLIZIZ instanceof C1B8F) {
                                this.LLLFFI = ((C1B8F) c1b8vLIZIZ).LIZJ();
                            }
                            if (C1490830otl.LIZ()) {
                                int id2 = this.LLILLL.getId();
                                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                                sbLIZ3.append("Url = ");
                                sbLIZ3.append(strReplaceFirst);
                                sbLIZ3.append(", ip = ");
                                sbLIZ3.append(str);
                                sbLIZ3.append(", hostRealIp = ");
                                sbLIZ3.append(this.LLLFFI);
                                sbLIZ3.append(", threadIndex = ");
                                sbLIZ3.append(this.LLJJIJIL);
                                C1490830otl.LIZLLL(id2, "SegmentReader", "createConnection", C2188811AlT.LIZIZ(sbLIZ3));
                            }
                            this.LLJZ = System.currentTimeMillis();
                            C2199711B7h c2199711B7h = this.LL;
                            C2199791B7p c2199791B7p = this.LLJ;
                            C2199861B7w c2199861B7w = this.LLILZLL;
                            synchronized (c2199711B7h) {
                                try {
                                    if (!c2199711B7h.LJFF && !c2199711B7h.LJI) {
                                        c2199711B7h.LJII(this, c2199811B7r, c2199791B7p, c2199861B7w);
                                        this.LLJLL = false;
                                        if (c2199711B7h.LJIIL <= 0) {
                                            long totalBytes = c2199711B7h.LIZ.getTotalBytes();
                                            c2199711B7h.LJIIL = totalBytes;
                                            if (totalBytes <= 0) {
                                                c2199711B7h.LJIIL = c2199861B7w.LIZLLL();
                                            }
                                            c2199711B7h.LJIIJ();
                                        } else if (c2199711B7h.LIZIZ.LIZ.optInt("segment_mode", 1) == 0) {
                                            c2199711B7h.LJIIJ();
                                        }
                                    } else {
                                        throw new StreamClosedException("connected");
                                    }
                                } finally {
                                    TryCatchGuardChecker.doCheck(th);
                                }
                            }
                            this.LLJ.LIZJ();
                            return;
                        }
                        throw new StreamClosedException("createConn");
                    }
                    throw new BaseException(1022, new IOException("download can't continue, chunk connection is null"));
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C2199661B7c.LJIJJLI("createConn", th);
                    throw null;
                }
            } catch (BaseException th2) {
                throw th2;
            }
        } catch (Throwable th22) {
            runnableC2199701B7g.LLJZ = System.currentTimeMillis();
            throw th22;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:52:0x0083 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0087 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJ(X.C2199811B7r r8) {
        /*
            r7 = this;
            java.lang.String r2 = "download"
            r1 = 0
            r7.LLJLIL = r1
            r7.LJIILIIL()
        L8:
            r7.LIZLLL(r8)     // Catch: java.lang.Throwable -> Lf com.ss.android.socialbase.downloader.segment.SegmentApplyException -> L95
            r7.LJIIIZ(r8)     // Catch: java.lang.Throwable -> Lf com.ss.android.socialbase.downloader.segment.SegmentApplyException -> L95
            goto L8c
        Lf:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r6 = "SegmentReader"
            com.ss.android.socialbase.downloader.model.DownloadInfo r0 = r7.LLILLL     // Catch: java.lang.Throwable -> L9c
            int r5 = r0.getId()     // Catch: java.lang.Throwable -> L9c
            java.lang.StringBuilder r4 = X.C2188811AlT.LIZ()     // Catch: java.lang.Throwable -> L9c
            java.lang.String r0 = "e = "
            r4.append(r0)     // Catch: java.lang.Throwable -> L9c
            r4.append(r3)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r0 = ", threadIndex = "
            r4.append(r0)     // Catch: java.lang.Throwable -> L9c
            int r0 = r7.LLJJIJIL     // Catch: java.lang.Throwable -> L9c
            r4.append(r0)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r0 = ", reconnect = "
            r4.append(r0)     // Catch: java.lang.Throwable -> L9c
            boolean r0 = r7.LLJJIII     // Catch: java.lang.Throwable -> L9c
            r4.append(r0)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r0 = ", closed = "
            r4.append(r0)     // Catch: java.lang.Throwable -> L9c
            boolean r0 = r7.LLJJI     // Catch: java.lang.Throwable -> L9c
            r4.append(r0)     // Catch: java.lang.Throwable -> L9c
            java.lang.String r0 = X.C2188811AlT.LIZIZ(r4)     // Catch: java.lang.Throwable -> L9c
            X.C1490830otl.LJ(r5, r6, r2, r0)     // Catch: java.lang.Throwable -> L9c
            boolean r0 = r7.LLJJI     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L51
            goto L91
        L51:
            boolean r0 = r7.LLJJIII     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L6c
            r7.LLJJIII = r1     // Catch: java.lang.Throwable -> L9c
            java.lang.Thread.interrupted()     // Catch: java.lang.Throwable -> L5b
            goto L5f
        L5b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L9c
        L5f:
            boolean r0 = r7.LLJJIJI     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L87
            r7.LLJJIJI = r1     // Catch: java.lang.Throwable -> L9c
            com.ss.android.socialbase.downloader.segment.SegmentApplyException r1 = new com.ss.android.socialbase.downloader.segment.SegmentApplyException     // Catch: java.lang.Throwable -> L9c
            r0 = 5
            r1.<init>(r0, r2)     // Catch: java.lang.Throwable -> L9c
            throw r1     // Catch: java.lang.Throwable -> L9c
        L6c:
            boolean r0 = r3 instanceof com.ss.android.socialbase.downloader.exception.BaseException     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L77
            com.ss.android.socialbase.downloader.exception.BaseException r3 = (com.ss.android.socialbase.downloader.exception.BaseException) r3     // Catch: java.lang.Throwable -> L9c
        L72:
            boolean r0 = r7.LJIIIIZZ(r8, r3)     // Catch: java.lang.Throwable -> L9c
            goto L81
        L77:
            X.C2199661B7c.LJIJJLI(r2, r3)     // Catch: com.ss.android.socialbase.downloader.exception.BaseException -> L7c java.lang.Throwable -> L9c
            r0 = 0
            throw r0     // Catch: com.ss.android.socialbase.downloader.exception.BaseException -> L7c java.lang.Throwable -> L9c
        L7c:
            r3 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L9c
            goto L72
        L81:
            if (r0 != 0) goto L87
            r7.LJIIL()
            return r1
        L87:
            r7.LJIIL()
            goto L8
        L8c:
            r7.LJIIL()
            r0 = 1
            return r0
        L91:
            r7.LJIIL()
            return r1
        L95:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L9c
            r7.LLJLILLLLZIIL = r0     // Catch: java.lang.Throwable -> L9c
            throw r0     // Catch: java.lang.Throwable -> L9c
        L9c:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L9c
            r7.LJIIL()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC2199701B7g.LJ(X.1B7r):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:116:0x01a0, code lost:
    
        r10.LIZJ = r11;
        r0 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:117:0x01a4, code lost:
    
        r29.LLJILJILJ = r0;
        r7.LIZ(r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:118:0x01a9, code lost:
    
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01ad, code lost:
    
        if (X.C1490830otl.LIZ() == false) goto L122;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01af, code lost:
    
        r12 = r29.LLILLL.getId();
        r10 = X.C2188811AlT.LIZ();
        r10.append("BytesRead = ");
        r10.append(r0 - r17);
        r10.append(", url = ");
        r10.append(r29.LLJ.LIZ);
        X.C1490830otl.LIZLLL(r12, "SegmentReader", "loopAndRead", X.C2188811AlT.LIZIZ(r10));
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:166:0x02dd, code lost:
    
        r11 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:226:0x036b, code lost:
    
        r2 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x010a, code lost:
    
        r12 = r4 + 1;
        r10 = r0 - r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0110, code lost:
    
        if (r10 <= 0) goto L288;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x012d, code lost:
    
        r19 = r4 + 1;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0131, code lost:
    
        if (r0 <= r19) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x0133, code lost:
    
        r11 = (int) (r2 - (r0 - r19));
        r0 = r0;
        r0 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:0x0137, code lost:
    
        if (r11 <= 0) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0139, code lost:
    
        if (r11 >= r12) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0145, code lost:
    
        r19 = r29.LLILLL.getId();
        r3 = X.C2188811AlT.LIZ();
        r3.append("redundant: ");
        r3.append(r10);
        X.C1490830otl.LJ(r19, "SegmentReader", "loopAndRead", X.C2188811AlT.LIZIZ(r3));
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0168, code lost:
    
        r29.LLJILJILJ = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x016b, code lost:
    
        r0 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x016d, code lost:
    
        r2 = th;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:258:0x03ed  */
    /* JADX WARN: Removed duplicated region for block: B:335:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:337:0x010a A[EDGE_INSN: B:337:0x010a->B:59:0x010a BREAK  A[LOOP:0: B:318:0x00a6->B:76:0x013c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0101  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0127 A[Catch: all -> 0x02e6, BaseException -> 0x02e9, TryCatch #40 {BaseException -> 0x02e9, all -> 0x02e6, blocks: (B:65:0x011d, B:68:0x0127, B:70:0x012d, B:72:0x0133), top: B:331:0x011d }] */
    /* JADX WARN: Type inference failed for: r0v0, types: [long] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v29, types: [long] */
    /* JADX WARN: Type inference failed for: r0v3, types: [long] */
    /* JADX WARN: Type inference failed for: r0v30, types: [long] */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32, types: [long] */
    /* JADX WARN: Type inference failed for: r0v33, types: [long] */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35, types: [long] */
    /* JADX WARN: Type inference failed for: r0v38 */
    /* JADX WARN: Type inference failed for: r0v40, types: [long] */
    /* JADX WARN: Type inference failed for: r0v42 */
    /* JADX WARN: Type inference failed for: r0v45 */
    /* JADX WARN: Type inference failed for: r0v46 */
    /* JADX WARN: Type inference failed for: r0v47 */
    /* JADX WARN: Type inference failed for: r0v48 */
    /* JADX WARN: Type inference failed for: r0v49 */
    /* JADX WARN: Type inference failed for: r0v50 */
    /* JADX WARN: Type inference failed for: r0v51 */
    /* JADX WARN: Type inference failed for: r0v52 */
    /* JADX WARN: Type inference failed for: r0v53 */
    /* JADX WARN: Type inference failed for: r0v54 */
    /* JADX WARN: Type inference failed for: r0v55 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [X.1B8V] */
    /* JADX WARN: Type inference failed for: r17v0, types: [long] */
    /* JADX WARN: Type inference failed for: r17v1, types: [long] */
    /* JADX WARN: Type inference failed for: r17v3 */
    /* JADX WARN: Type inference failed for: r17v4 */
    /* JADX WARN: Type inference failed for: r17v5 */
    /* JADX WARN: Type inference failed for: r17v6 */
    /* JADX WARN: Type inference failed for: r17v7 */
    /* JADX WARN: Type inference failed for: r17v8 */
    /* JADX WARN: Type inference failed for: r17v9 */
    /* JADX WARN: Type update failed for variable: r17v3 ??, new type: long
    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 10851. Try increasing type updates limit count.
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:37)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:224)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:507)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:507)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:507)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:507)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:507)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:86)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:58)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:75)
     */
    /* JADX WARN: Type update failed for variable: r17v3 ??, new type: long
    jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 10851. Try increasing type updates limit count.
    	at jadx.core.dex.visitors.typeinference.TypeUpdateInfo.requestUpdate(TypeUpdateInfo.java:37)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:224)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:473)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:507)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.moveListener(TypeUpdate.java:454)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:507)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:513)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.suggestAllSameListener(TypeUpdate.java:507)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.arithListener(TypeUpdate.java:497)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:202)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.allSameListener(TypeUpdate.java:480)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.runListeners(TypeUpdate.java:241)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:225)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeForSsaVar(TypeUpdate.java:197)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.updateTypeChecked(TypeUpdate.java:119)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:86)
    	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:58)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.calculateFromBounds(TypeInferenceVisitor.java:147)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.setBestType(TypeInferenceVisitor.java:125)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.lambda$runTypePropagation$2(TypeInferenceVisitor.java:103)
    	at java.base/java.util.ArrayList.forEach(Unknown Source)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runTypePropagation(TypeInferenceVisitor.java:103)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryInsertAdditionalMove(FixTypesVisitor.java:678)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LJIIIZ(X.C2199811B7r r30) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1085
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC2199701B7g.LJIIIZ(X.1B7r):void");
    }

    public final void LJIIJJI(boolean z) {
        if (C1490830otl.LIZ()) {
            int id = this.LLILLL.getId();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("ThreadIndex: ");
            sbLIZ.append(this.LLJJIJIL);
            C1490830otl.LIZLLL(id, "SegmentReader", "reconnect", C2188811AlT.LIZIZ(sbLIZ));
        }
        synchronized (this) {
            try {
                this.LLJJIJI = z;
                this.LLJJIII = true;
                this.LLJJJ = true;
            } finally {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        LIZIZ();
        Thread thread = this.LLJJIJIIJIL;
        if (thread != null) {
            try {
                if (C1490830otl.LIZ()) {
                    int id2 = this.LLILLL.getId();
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Interrupt ThreadIndex: ");
                    sbLIZ2.append(this.LLJJIJIL);
                    C1490830otl.LIZLLL(id2, "SegmentReader", "reconnect", C2188811AlT.LIZIZ(sbLIZ2));
                }
                thread.interrupt();
            } catch (Throwable th) {
            }
        }
    }

    public static C1B8I LJIIJ(InterfaceC2200051B8p interfaceC2200051B8p, InputStream inputStream) throws Throwable {
        int i;
        C1B89 c1b89 = (C1B89) interfaceC2200051B8p;
        C1B8I c1b8iLIZJ = c1b89.LIZJ();
        try {
            i = inputStream.read(c1b8iLIZJ.LIZ);
            try {
                if (i != -1) {
                    c1b8iLIZJ.LIZJ = i;
                    if (i == -1) {
                        c1b89.LJ(c1b8iLIZJ);
                    }
                    return c1b8iLIZJ;
                }
                throw new BaseException(1073, "probe");
            } catch (Throwable th) {
                th = th;
                while (true) {
                    try {
                        TryCatchGuardChecker.doCheck(th);
                        break;
                    } catch (Throwable th2) {
                        th = th2;
                    }
                }
                if (i == -1) {
                    c1b89.LJ(c1b8iLIZJ);
                }
                throw th;
            }
        } catch (Throwable th3) {
            th = th3;
            i = -1;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x008a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean LJIIIIZZ(X.C2199811B7r r10, com.ss.android.socialbase.downloader.exception.BaseException r11) {
        /*
            Method dump skipped, instruction units count: 242
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.RunnableC2199701B7g.LJIIIIZZ(X.1B7r, com.ss.android.socialbase.downloader.exception.BaseException):boolean");
    }

    public RunnableC2199701B7g(DownloadInfo downloadInfo, C2199711B7h c2199711B7h, C1B89 c1b89, C2199791B7p c2199791B7p, int i) {
        this.LLILLL = downloadInfo;
        this.LL = c2199711B7h;
        this.LLILLJJLI = c1b89;
        this.LLILZ = C2199751B7l.LJFF(downloadInfo.getId(), null);
        this.LLJ = c2199791B7p;
        this.LLJJIJIL = i;
        this.LLJJJJLIIL = new C1490870otp(downloadInfo);
        this.LLJJL = new C1498750p6X(downloadInfo);
    }
}
