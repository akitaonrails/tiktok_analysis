package X;

import android.os.Process;
import com.bytedance.ies.ugc.aweme.network.config.NetDispatchConfig;
import com.bytedance.ies.ugc.aweme.network.config.ThreadPoolConfig;
import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.TimeUnit;
import kotlin.Unit;

/* JADX INFO: renamed from: X.0ot4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1490400ot4 {
    public static final C1490400ot4 LIZ = new C1490400ot4();
    public static final ConcurrentHashMap<Integer, Integer> LIZIZ = new ConcurrentHashMap<>();
    public static C1490410ot5 LIZJ;
    public static C1490410ot5 LIZLLL;

    public static void LIZ() {
        C310440CEw.LIZ.getClass();
        NetDispatchConfig netDispatchConfigLIZ = C310440CEw.LIZ();
        if (netDispatchConfigLIZ.enable && netDispatchConfigLIZ.enableThreadConfig) {
            C1490580otM c1490580otM = new C1490580otM();
            ThreadPoolConfig threadPoolConfig = netDispatchConfigLIZ.immediateApiThreadConfig;
            int i = threadPoolConfig.corePoolSize;
            int i2 = threadPoolConfig.maximumPoolSize;
            long j = threadPoolConfig.keepAliveTime;
            TimeUnit timeUnit = TimeUnit.SECONDS;
            C822650WOx c822650WOx = new C822650WOx(i, i2, j, timeUnit, new SynchronousQueue(), new AnonymousClass0865("NetImmediate", netDispatchConfigLIZ.immediateApiThreadConfig.threadPriority));
            ThreadPoolConfig threadPoolConfig2 = netDispatchConfigLIZ.normalApiThreadConfig;
            C822650WOx c822650WOx2 = new C822650WOx(threadPoolConfig2.corePoolSize, threadPoolConfig2.maximumPoolSize, threadPoolConfig2.keepAliveTime, timeUnit, new PriorityBlockingQueue(), new AnonymousClass0865("NetNormal", netDispatchConfigLIZ.normalApiThreadConfig.threadPriority));
            c822650WOx2.allowCoreThreadTimeOut(true);
            ThreadPoolConfig threadPoolConfig3 = netDispatchConfigLIZ.lowerApiThreadConfig;
            C822650WOx c822650WOx3 = new C822650WOx(threadPoolConfig3.corePoolSize, threadPoolConfig3.maximumPoolSize, threadPoolConfig3.keepAliveTime, timeUnit, new PriorityBlockingQueue(), new AnonymousClass0865("NetLower", netDispatchConfigLIZ.lowerApiThreadConfig.threadPriority));
            ThreadPoolConfig threadPoolConfig4 = netDispatchConfigLIZ.downloadThreadConfig;
            C822650WOx c822650WOx4 = new C822650WOx(threadPoolConfig4.corePoolSize, threadPoolConfig4.maximumPoolSize, threadPoolConfig4.keepAliveTime, timeUnit, new PriorityBlockingQueue(), new AnonymousClass0865("NetDownload", netDispatchConfigLIZ.downloadThreadConfig.threadPriority));
            c822650WOx4.allowCoreThreadTimeOut(true);
            c1490580otM.LIZ = c822650WOx;
            c1490580otM.LIZIZ = c822650WOx2;
            c1490580otM.LIZLLL = c822650WOx3;
            c1490580otM.LIZJ = c822650WOx4;
            C1490600otO c1490600otO = new C1490600otO(c1490580otM);
            synchronized (C1490590otN.class) {
                C1490590otN.LIZIZ = c1490600otO;
                C1490590otN.LIZIZ.LJIIJJI = C1490590otN.LIZ;
            }
        }
    }

    public static boolean LIZIZ(Request request) {
        if (request.getMetrics().LJIL > 0) {
            return true;
        }
        return false;
    }

    public static void LIZJ(Request request) {
        Object c098200Yq;
        C1490410ot5 c1490410ot5;
        C1490410ot5 c1490410ot52;
        try {
            C310440CEw.LIZ.getClass();
            NetDispatchConfig netDispatchConfigLIZ = C310440CEw.LIZ();
            if (netDispatchConfigLIZ.enable) {
                if (!LIZIZ(request)) {
                    return;
                }
                if (request.getPriorityLevel() == -1) {
                    if ((netDispatchConfigLIZ.concurrentLimitForSync & 1) != 0 && (c1490410ot52 = LIZJ) != null) {
                        c1490410ot52.LIZ.release();
                    }
                } else if (request.getPriorityLevel() == 1 && (netDispatchConfigLIZ.concurrentLimitForSync & 2) != 0 && (c1490410ot5 = LIZLLL) != null) {
                    c1490410ot5.LIZ.release();
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    public static void LIZLLL(Request request) {
        Object c098200Yq;
        try {
            C310440CEw.LIZ.getClass();
            NetDispatchConfig netDispatchConfigLIZ = C310440CEw.LIZ();
            if (netDispatchConfigLIZ.enable) {
                if (!LIZIZ(request)) {
                    return;
                }
                if (request.getPriorityLevel() == -1) {
                    if ((netDispatchConfigLIZ.concurrentLimitForSync & 1) != 0) {
                        if (LIZJ == null) {
                            LIZJ = new C1490410ot5(netDispatchConfigLIZ.lowerApiThreadConfig.maximumPoolSize);
                        }
                        C1490410ot5 c1490410ot5 = LIZJ;
                        if (c1490410ot5 != null) {
                            c1490410ot5.LIZ.acquire();
                        }
                    }
                } else if (request.getPriorityLevel() == 1 && (netDispatchConfigLIZ.concurrentLimitForSync & 2) != 0) {
                    if (LIZLLL == null) {
                        LIZLLL = new C1490410ot5(netDispatchConfigLIZ.normalApiThreadConfig.maximumPoolSize);
                    }
                    C1490410ot5 c1490410ot52 = LIZLLL;
                    if (c1490410ot52 != null) {
                        c1490410ot52.LIZ.acquire();
                    }
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    public static void LJ(int i, Request request) {
        Object c098200Yq;
        try {
            C310440CEw.LIZ.getClass();
            NetDispatchConfig netDispatchConfigLIZ = C310440CEw.LIZ();
            if (netDispatchConfigLIZ.enable && netDispatchConfigLIZ.enableThreadConfig && netDispatchConfigLIZ.enableThreadConfigForSync) {
                if (!LIZIZ(request)) {
                    return;
                }
                Integer num = LIZIZ.get(Integer.valueOf(i));
                if (num != null) {
                    int iIntValue = num.intValue();
                    Process.setThreadPriority(i, iIntValue);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("reSetPriority [");
                    sbLIZ.append(C786410Ut5.u3().getName());
                    sbLIZ.append(" nice: ");
                    sbLIZ.append(iIntValue);
                    sbLIZ.append("] ");
                    sbLIZ.append(request.getPath());
                    sbLIZ.append(": ");
                    sbLIZ.append(request.getPriorityLevel());
                    C2188811AlT.LIZIZ(sbLIZ);
                }
            }
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0058 A[Catch: all -> 0x006c, TryCatch #0 {all -> 0x006c, blocks: (B:2:0x0000, B:4:0x000d, B:6:0x0011, B:8:0x0015, B:11:0x001c, B:14:0x0026, B:17:0x0034, B:19:0x003e, B:26:0x004c, B:28:0x0058, B:29:0x0063, B:16:0x0030, B:15:0x002b, B:30:0x0066), top: B:35:0x0000 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(int r6, com.bytedance.retrofit2.client.Request r7) {
        /*
            X.0CEw r0 = X.C310440CEw.LIZ     // Catch: java.lang.Throwable -> L6c
            r0.getClass()     // Catch: java.lang.Throwable -> L6c
            com.bytedance.ies.ugc.aweme.network.config.NetDispatchConfig r5 = X.C310440CEw.LIZ()     // Catch: java.lang.Throwable -> L6c
            boolean r0 = r5.enable     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L66
            boolean r0 = r5.enableThreadConfig     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L66
            boolean r0 = r5.enableThreadConfigForSync     // Catch: java.lang.Throwable -> L6c
            if (r0 == 0) goto L66
            boolean r0 = LIZIZ(r7)     // Catch: java.lang.Throwable -> L6c
            if (r0 != 0) goto L1c
            return
        L1c:
            int r2 = r7.getPriorityLevel()     // Catch: java.lang.Throwable -> L6c
            r0 = -1
            r1 = 3
            if (r2 == r0) goto L2b
            if (r2 == r1) goto L30
            com.bytedance.ies.ugc.aweme.network.config.ThreadPoolConfig r0 = r5.normalApiThreadConfig     // Catch: java.lang.Throwable -> L6c
            int r4 = r0.threadPriority     // Catch: java.lang.Throwable -> L6c
            goto L34
        L2b:
            com.bytedance.ies.ugc.aweme.network.config.ThreadPoolConfig r0 = r5.lowerApiThreadConfig     // Catch: java.lang.Throwable -> L6c
            int r4 = r0.threadPriority     // Catch: java.lang.Throwable -> L6c
            goto L34
        L30:
            com.bytedance.ies.ugc.aweme.network.config.ThreadPoolConfig r0 = r5.immediateApiThreadConfig     // Catch: java.lang.Throwable -> L6c
            int r4 = r0.threadPriority     // Catch: java.lang.Throwable -> L6c
        L34:
            int r3 = android.os.Process.getThreadPriority(r6)     // Catch: java.lang.Throwable -> L6c
            int r0 = r7.getPriorityLevel()     // Catch: java.lang.Throwable -> L6c
            if (r0 != r1) goto L4a
            int r0 = r5.threadPriorityConfig     // Catch: java.lang.Throwable -> L6c
            r0 = r0 & 4
            if (r0 == 0) goto L47
            if (r3 <= r4) goto L66
            goto L4c
        L47:
            if (r3 >= r4) goto L66
            goto L4c
        L4a:
            if (r3 >= r4) goto L66
        L4c:
            java.util.concurrent.ConcurrentHashMap<java.lang.Integer, java.lang.Integer> r2 = X.C1490400ot4.LIZIZ     // Catch: java.lang.Throwable -> L6c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L6c
            java.lang.Object r0 = r2.get(r0)     // Catch: java.lang.Throwable -> L6c
            if (r0 != 0) goto L63
            java.lang.Integer r1 = java.lang.Integer.valueOf(r6)     // Catch: java.lang.Throwable -> L6c
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)     // Catch: java.lang.Throwable -> L6c
            r2.put(r1, r0)     // Catch: java.lang.Throwable -> L6c
        L63:
            android.os.Process.setThreadPriority(r6, r4)     // Catch: java.lang.Throwable -> L6c
        L66:
            kotlin.Unit r0 = kotlin.Unit.LIZ     // Catch: java.lang.Throwable -> L6c
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L6c
            goto L78
        L6c:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
        L78:
            X.C189200o6.m5exceptionOrNullimpl(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1490400ot4.LJFF(int, com.bytedance.retrofit2.client.Request):void");
    }
}
