package X;

import Y.ARunnableS92S0000000_13;
import android.os.HandlerThread;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.socialbase.downloader.downloader.Downloader;
import com.ss.android.socialbase.downloader.model.DownloadInfo;
import com.ss.android.socialbase.downloader.model.HttpHeader;
import java.util.HashMap;
import java.util.List;

/* JADX INFO: renamed from: X.1B7m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2199761B7m {
    public static final HandlerThread LIZ;
    public static final BPEAHandler LIZIZ;
    public static C1B87 LIZJ;
    public static long LIZLLL;
    public static long LJ;

    static {
        HandlerThread handlerThread = new HandlerThread("Downloader-preconnecter");
        LIZ = handlerThread;
        C2199751B7l c2199751B7l = C2199751B7l.LJFF;
        LIZLLL = c2199751B7l.LJIIJ("preconnect_connection_outdate_time", 300000L);
        LJ = c2199751B7l.LJIIJ("preconnect_head_info_outdate_time", 300000L);
        C2199901B8a.LIZ.LIZJ = c2199751B7l.LJIIIIZZ("preconnect_max_cache_size", 3);
        handlerThread.start();
        BPEAHandler bPEAHandler = new BPEAHandler(C786410Ut5.W2(handlerThread));
        LIZIZ = bPEAHandler;
        C786410Ut5.LJJZZIII(bPEAHandler, new ARunnableS92S0000000_13(49));
    }

    public static void LIZIZ(long j, String str, List list) {
        C2199851B7v c2199851B7v = C2199901B8a.LIZ;
        if (c2199851B7v.LIZIZ(str)) {
            return;
        }
        C2199841B7u c2199841B7u = new C2199841B7u(str, list);
        synchronized (c2199851B7v.LIZ) {
            try {
                ((HashMap) c2199851B7v.LIZ).put(str, c2199841B7u);
            } finally {
            }
        }
        try {
            try {
                c2199841B7u.LIZJ();
            } catch (Exception th) {
            }
            try {
                c2199841B7u.cancel();
            } catch (Throwable th2) {
            }
        } catch (Throwable th22) {
            try {
                c2199841B7u.cancel();
                throw th22;
            } finally {
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0065  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(int r7, long r8, java.lang.String r10, java.util.List r11) {
        /*
            X.1B7v r4 = X.C2199901B8a.LIZ
            java.util.Map<java.lang.String, X.1B7z> r0 = r4.LIZIZ
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0
            java.lang.Object r3 = r0.get(r10)
            X.1B7z r3 = (X.C2199891B7z) r3
            if (r3 == 0) goto L26
            boolean r0 = r3.LJ
            if (r0 != 0) goto L25
            long r5 = java.lang.System.currentTimeMillis()
            long r0 = r3.LJFF
            long r5 = r5 - r0
            long r1 = X.C2199761B7m.LIZLLL
            int r0 = (r5 > r1 ? 1 : (r5 == r1 ? 0 : -1))
            if (r0 >= 0) goto L26
            boolean r0 = r3.LIZLLL()
            if (r0 == 0) goto L26
        L25:
            return
        L26:
            X.1B7z r2 = new X.1B7z
            r2.<init>(r7, r10, r11)
            java.util.Map<java.lang.String, X.1B7z> r3 = r4.LIZIZ
            monitor-enter(r3)
            java.util.Map<java.lang.String, X.1B7z> r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L7b
            int r1 = r0.size()     // Catch: java.lang.Throwable -> L7b
            int r0 = r4.LIZJ     // Catch: java.lang.Throwable -> L7b
            if (r1 != r0) goto L65
            java.util.Map<java.lang.String, X.1B7z> r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L7b
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> L7b
            java.util.Set r0 = r0.entrySet()     // Catch: java.lang.Throwable -> L7b
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Throwable -> L7b
            boolean r0 = r1.hasNext()     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L65
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Throwable -> L7b
            java.util.Map$Entry r0 = (java.util.Map.Entry) r0     // Catch: java.lang.Throwable -> L7b
            if (r0 == 0) goto L65
            java.util.Map<java.lang.String, X.1B7z> r1 = r4.LIZIZ     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r0 = r0.getKey()     // Catch: java.lang.Throwable -> L7b
            java.lang.Object r1 = r1.remove(r0)     // Catch: java.lang.Throwable -> L7b
            X.1B7z r1 = (X.C2199891B7z) r1     // Catch: java.lang.Throwable -> L7b
        L5e:
            java.util.Map<java.lang.String, X.1B7z> r0 = r4.LIZIZ     // Catch: java.lang.Throwable -> L7b
            r0.put(r10, r2)     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7b
            goto L67
        L65:
            r1 = 0
            goto L5e
        L67:
            if (r1 == 0) goto L71
            r1.end()     // Catch: java.lang.Throwable -> L6d
            goto L71
        L6d:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L71:
            r2.LIZJ()     // Catch: java.lang.Exception -> L75
            goto L7a
        L75:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            return
        L7a:
            return
        L7b:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L7b
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2199761B7m.LIZ(int, long, java.lang.String, java.util.List):void");
    }

    public static void LIZJ(final int i, final String str, String str2, List<HttpHeader> list, final boolean z, final boolean z2) {
        final long curBytes;
        String str3;
        DownloadInfo downloadInfo = Downloader.com_ss_android_socialbase_downloader_downloader_Downloader_com_ss_android_ugc_aweme_utils_InitializeLancet_getInstance(C2199681B7e.LJFF()).getDownloadInfo(str, str2);
        if (downloadInfo != null) {
            if (!downloadInfo.isDownloadingStatus() && !downloadInfo.isDownloaded() && downloadInfo.getChunkCount() <= 1) {
                String str4 = C2199661B7c.LIZ;
                curBytes = downloadInfo.getCurBytes();
                str3 = downloadInfo.geteTag();
            } else {
                return;
            }
        } else {
            curBytes = 0;
            str3 = null;
        }
        final List listLIZ = C2199661B7c.LIZ(curBytes, 0L, str3, list);
        C786410Ut5.LJJZZIII(LIZIZ, new Runnable() { // from class: X.1B85
            /* JADX WARN: Type inference failed for: r1v0, types: [X.1B87] */
            public final void LIZ() {
                try {
                    if (z2) {
                        C2199761B7m.LIZIZ(curBytes, str, listLIZ);
                    }
                    if (z) {
                        C2199761B7m.LIZ(i, curBytes, str, listLIZ);
                        C2199761B7m.LIZJ = new Runnable(str) { // from class: X.1B87
                            public final String LL;

                            public final void LIZ() {
                                C2199891B7z c2199891B7zRemove;
                                try {
                                    C2199851B7v c2199851B7v = C2199901B8a.LIZ;
                                    String str5 = this.LL;
                                    synchronized (c2199851B7v.LIZIZ) {
                                        try {
                                            c2199891B7zRemove = c2199851B7v.LIZIZ.remove(str5);
                                        } finally {
                                            TryCatchGuardChecker.doCheck(th);
                                        }
                                    }
                                    if (c2199891B7zRemove != null) {
                                        try {
                                            c2199891B7zRemove.end();
                                        } catch (Throwable th) {
                                        }
                                    }
                                } catch (Throwable th2) {
                                }
                            }

                            @Override // java.lang.Runnable
                            public final void run() {
                                boolean zLIZ;
                                C1C7U.LIZ("DownloadPreconnecterImpl$CancelRunnable@adb3.run");
                                try {
                                    LIZ();
                                } finally {
                                    if (!zLIZ) {
                                    }
                                }
                                C1C7U.LIZIZ("DownloadPreconnecterImpl$CancelRunnable@adb3.run");
                            }

                            {
                                this.LL = str;
                            }
                        };
                        C786410Ut5.LJLIIL(C2199761B7m.LIZLLL, C2199761B7m.LIZIZ, C2199761B7m.LIZJ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("DownloadPreconnecterImpl@82ba.asyncPreconnect$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("DownloadPreconnecterImpl@82ba.asyncPreconnect$1");
            }
        });
    }
}
