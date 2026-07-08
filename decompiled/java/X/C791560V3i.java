package X;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Process;
import android.util.Pair;
import com.bytedance.android.bytehook.ByteHook;
import com.bytedance.apm.core.ActivityLifeObserver;
import com.bytedance.monitor.collector.BinderMonitor;
import com.bytedance.monitor.collector.MonitorJni;
import com.bytedance.monitor.collector.c;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0V3i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C791560V3i {
    public static volatile boolean LJIIJJI;
    public static volatile C791560V3i LJIIL;
    public final List<c> LIZ;
    public volatile boolean LIZIZ;
    public volatile boolean LIZJ;
    public volatile boolean LIZLLL;
    public boolean LJ;
    public BinderMonitor LJFF;
    public C791630V3p LJI;
    public C0V3T LJII;
    public C0V3R LJIIIIZZ;
    public C791550V3h LJIIIZ;
    public int LJIIJ;

    public static long LIZJ() throws Throwable {
        BufferedReader bufferedReader;
        int i = C08OX.LIZ;
        if (i == 0) {
            i = 128;
        }
        long j = -1;
        for (int i2 = 0; i2 < i; i2++) {
            BufferedReader bufferedReader2 = null;
            try {
                try {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("/sys/devices/system/cpu/cpu");
                    sbLIZ.append(i2);
                    sbLIZ.append("/cpufreq/stats/time_in_state");
                    bufferedReader = new BufferedReader(new C0VSF(C2188811AlT.LIZIZ(sbLIZ)), 50);
                    while (true) {
                        try {
                            try {
                                String line = bufferedReader.readLine();
                                if (line == null || line.isEmpty()) {
                                    break;
                                }
                                String[] strArrSplit = line.split("\\s+");
                                if (strArrSplit.length == 2) {
                                    j += Long.parseLong(strArrSplit[1]);
                                }
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader2 = bufferedReader;
                                TryCatchGuardChecker.doCheck(th);
                                C2105408Mq.LIZIZ(bufferedReader2);
                                throw th;
                            }
                        } catch (FileNotFoundException e) {
                            e = e;
                            bufferedReader2 = bufferedReader;
                            TryCatchGuardChecker.doCheck(e);
                            C08OX.LIZ = i2;
                            C2105408Mq.LIZIZ(bufferedReader2);
                            return j;
                        } catch (IOException e2) {
                            e = e2;
                            TryCatchGuardChecker.doCheck(e);
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (FileNotFoundException e3) {
                e = e3;
            } catch (IOException e4) {
                e = e4;
                bufferedReader = null;
            }
            C2105408Mq.LIZIZ(bufferedReader);
        }
        return j;
    }

    public static C791560V3i LIZLLL() {
        if (LJIIL == null) {
            synchronized (C791560V3i.class) {
                try {
                    if (LJIIL == null) {
                        LJIIL = new C791560V3i();
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return LJIIL;
    }

    public final JSONObject LIZ() {
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < ((CopyOnWriteArrayList) this.LIZ).size(); i++) {
            try {
                Pair<String, ?> pairLIZ = ((c) ((CopyOnWriteArrayList) this.LIZ).get(i)).LIZ();
                if (pairLIZ != null) {
                    jSONObject.put((String) pairLIZ.first, pairLIZ.second);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return jSONObject;
    }

    public final C0V35 LJ() {
        C0V3S c0v3s;
        C0V35 c0v35LIZIZ;
        C0V3R c0v3r = this.LJIIIIZZ;
        if (c0v3r == null || (c0v3s = c0v3r.LJIIIZ) == null || !c0v3r.LJIJ || (c0v35LIZIZ = c0v3s.LIZIZ()) == null || c0v35LIZIZ.LIZLLL != 8) {
            return null;
        }
        return c0v3r.LJIIIZ.LIZIZ();
    }

    public C791560V3i() {
        new Runnable() { // from class: X.0T4e
            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("PerfMonitorManager@44cb.<field>$1");
                try {
                    this.LL.getClass();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("PerfMonitorManager@44cb.<field>$1");
            }
        };
        this.LJIIJ = 0;
        this.LIZ = new CopyOnWriteArrayList();
        ActivityLifeObserver.getInstance().register(new InterfaceC792700V7s() { // from class: X.0V3l
            @Override // X.InterfaceC792700V7s
            public final void LJ() {
            }

            @Override // X.InterfaceC792700V7s
            public final void LJIIIIZZ() {
            }

            @Override // X.InterfaceC792700V7s
            public final void LJIIJ(Activity activity) {
            }

            @Override // X.InterfaceC792700V7s
            public final void onActivityCreated(Activity activity, Bundle bundle) {
            }

            @Override // X.InterfaceC792700V7s
            public final void onActivityStarted(Activity activity) {
            }

            @Override // X.InterfaceC792700V7s
            public final void LIZLLL(Activity activity) {
                this.LL.getClass();
            }

            @Override // X.InterfaceC792700V7s
            public final void LJII(Activity activity) {
                this.LL.getClass();
            }
        });
    }

    public static synchronized boolean LJFF(Context context) {
        String str;
        if (!LJIIJJI) {
            LJIIJJI = C08OG.LIZJ(context, C2105308Mp.LIZIZ(Process.myPid()));
            if (C792400V6o.LJIIIIZZ()) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("Load Result: ");
                if (LJIIJJI) {
                    str = "Succeed";
                } else {
                    str = "Failed";
                }
                sbLIZ.append(str);
                C2188811AlT.LIZIZ(sbLIZ);
            }
            C0V4J c0v4j = new C0V4J();
            c0v4j.LIZIZ = C792400V6o.LJIIIIZZ();
            c0v4j.LIZ = C0V9A.AUTOMATIC.value;
            ByteHook.init(c0v4j.LIZ());
        }
        return LJIIJJI;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0016 A[Catch: all -> 0x009c, TryCatch #3 {, blocks: (B:3:0x0001, B:10:0x0016, B:14:0x001c, B:16:0x0020, B:17:0x0029, B:19:0x002d, B:21:0x0031, B:22:0x003a, B:23:0x0042, B:25:0x0046, B:27:0x004a, B:28:0x0053, B:34:0x0068, B:36:0x006c, B:41:0x007a, B:33:0x0065, B:42:0x007d, B:44:0x0088, B:46:0x008c, B:9:0x0013, B:5:0x0009, B:7:0x000d, B:29:0x005a, B:31:0x005e, B:37:0x0071, B:39:0x0075), top: B:58:0x0001, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001a A[DONT_GENERATE] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001c A[Catch: all -> 0x009c, TRY_ENTER, TryCatch #3 {, blocks: (B:3:0x0001, B:10:0x0016, B:14:0x001c, B:16:0x0020, B:17:0x0029, B:19:0x002d, B:21:0x0031, B:22:0x003a, B:23:0x0042, B:25:0x0046, B:27:0x004a, B:28:0x0053, B:34:0x0068, B:36:0x006c, B:41:0x007a, B:33:0x0065, B:42:0x007d, B:44:0x0088, B:46:0x008c, B:9:0x0013, B:5:0x0009, B:7:0x000d, B:29:0x005a, B:31:0x005e, B:37:0x0071, B:39:0x0075), top: B:58:0x0001, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x006c A[Catch: all -> 0x009c, TRY_LEAVE, TryCatch #3 {, blocks: (B:3:0x0001, B:10:0x0016, B:14:0x001c, B:16:0x0020, B:17:0x0029, B:19:0x002d, B:21:0x0031, B:22:0x003a, B:23:0x0042, B:25:0x0046, B:27:0x004a, B:28:0x0053, B:34:0x0068, B:36:0x006c, B:41:0x007a, B:33:0x0065, B:42:0x007d, B:44:0x0088, B:46:0x008c, B:9:0x0013, B:5:0x0009, B:7:0x000d, B:29:0x005a, B:31:0x005e, B:37:0x0071, B:39:0x0075), top: B:58:0x0001, inners: #0, #1, #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x007d A[Catch: all -> 0x009c, TryCatch #3 {, blocks: (B:3:0x0001, B:10:0x0016, B:14:0x001c, B:16:0x0020, B:17:0x0029, B:19:0x002d, B:21:0x0031, B:22:0x003a, B:23:0x0042, B:25:0x0046, B:27:0x004a, B:28:0x0053, B:34:0x0068, B:36:0x006c, B:41:0x007a, B:33:0x0065, B:42:0x007d, B:44:0x0088, B:46:0x008c, B:9:0x0013, B:5:0x0009, B:7:0x000d, B:29:0x005a, B:31:0x005e, B:37:0x0071, B:39:0x0075), top: B:58:0x0001, inners: #0, #1, #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized void LJI(X.C791550V3h r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            r4.LJIIIZ = r5     // Catch: java.lang.Throwable -> L9c
            boolean r0 = X.C792400V6o.LJIIIIZZ()     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L16
            boolean r0 = X.C791560V3i.LJIIJJI     // Catch: java.lang.Throwable -> L12
            if (r0 == 0) goto L16
            r0 = 1
            com.bytedance.monitor.collector.MonitorJni.doSetDebugMode(r0)     // Catch: java.lang.Throwable -> L12
            goto L16
        L12:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L9c
        L16:
            boolean r0 = X.C791560V3i.LJIIJJI     // Catch: java.lang.Throwable -> L9c
            if (r0 != 0) goto L1c
            monitor-exit(r4)
            return
        L1c:
            X.0V3p r0 = r4.LJI     // Catch: java.lang.Throwable -> L9c
            if (r0 != 0) goto L29
            X.0V3p r1 = new X.0V3p     // Catch: java.lang.Throwable -> L9c
            int r0 = r5.LJI     // Catch: java.lang.Throwable -> L9c
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L9c
            r4.LJI = r1     // Catch: java.lang.Throwable -> L9c
        L29:
            boolean r0 = r5.LIZIZ     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L42
            com.bytedance.monitor.collector.BinderMonitor r0 = r4.LJFF     // Catch: java.lang.Throwable -> L9c
            if (r0 != 0) goto L3a
            com.bytedance.monitor.collector.BinderMonitor r1 = new com.bytedance.monitor.collector.BinderMonitor     // Catch: java.lang.Throwable -> L9c
            int r0 = r5.LJI     // Catch: java.lang.Throwable -> L9c
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L9c
            r4.LJFF = r1     // Catch: java.lang.Throwable -> L9c
        L3a:
            com.bytedance.monitor.collector.BinderMonitor r0 = r4.LJFF     // Catch: java.lang.Throwable -> L9c
            r0.getClass()     // Catch: java.lang.Throwable -> L9c
            com.bytedance.monitor.collector.MonitorJni.enableBinderHook()     // Catch: java.lang.Throwable -> L9c
        L42:
            boolean r0 = r5.LIZ     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L7d
            X.0V3T r0 = r4.LJII     // Catch: java.lang.Throwable -> L9c
            if (r0 != 0) goto L53
            X.0V3T r1 = new X.0V3T     // Catch: java.lang.Throwable -> L9c
            int r0 = r5.LJI     // Catch: java.lang.Throwable -> L9c
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L9c
            r4.LJII = r1     // Catch: java.lang.Throwable -> L9c
        L53:
            X.0V3T r3 = r4.LJII     // Catch: java.lang.Throwable -> L9c
            long r1 = r5.LJFF     // Catch: java.lang.Throwable -> L9c
            r3.getClass()     // Catch: java.lang.Throwable -> L9c
            boolean r0 = X.C791560V3i.LJIIJJI     // Catch: java.lang.Throwable -> L64
            if (r0 == 0) goto L68
            int r0 = r3.LIZJ     // Catch: java.lang.Throwable -> L64
            com.bytedance.monitor.collector.MonitorJni.doEnableAtrace(r0, r1)     // Catch: java.lang.Throwable -> L64
            goto L68
        L64:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L9c
        L68:
            boolean r0 = r5.LIZJ     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L7d
            X.0V3T r0 = r4.LJII     // Catch: java.lang.Throwable -> L9c
            r0.getClass()     // Catch: java.lang.Throwable -> L9c
            boolean r0 = X.C791560V3i.LJIIJJI     // Catch: java.lang.Throwable -> L79
            if (r0 == 0) goto L7d
            com.bytedance.monitor.collector.MonitorJni.doEnableLock()     // Catch: java.lang.Throwable -> L79
            goto L7d
        L79:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L9c
        L7d:
            int r0 = r5.LJII     // Catch: java.lang.Throwable -> L9c
            r4.LJII(r0)     // Catch: java.lang.Throwable -> L9c
            android.content.Context r0 = X.C792400V6o.LIZ     // Catch: java.lang.Throwable -> L9c
            boolean r0 = r5.LIZLLL     // Catch: java.lang.Throwable -> L9c
            if (r0 == 0) goto L9a
            X.0V3R r0 = r4.LJIIIIZZ     // Catch: java.lang.Throwable -> L9c
            if (r0 != 0) goto L9a
            X.0V2r r0 = X.C791390V2r.LJJIII     // Catch: java.lang.Throwable -> L9c
            r0.LJIIL()     // Catch: java.lang.Throwable -> L9c
            X.0V3R r1 = new X.0V3R     // Catch: java.lang.Throwable -> L9c
            int r0 = r5.LJI     // Catch: java.lang.Throwable -> L9c
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L9c
            r4.LJIIIIZZ = r1     // Catch: java.lang.Throwable -> L9c
        L9a:
            monitor-exit(r4)
            return
        L9c:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C791560V3i.LJI(X.0V3h):void");
    }

    public final void LJII(int i) {
        if (this.LJIIJ == i) {
            return;
        }
        this.LJIIJ = i;
        if (C792400V6o.LJIIIIZZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("updateSocketHookMode=");
            sbLIZ.append(i);
            sbLIZ.append("-soLoad=");
            sbLIZ.append(LJIIJJI);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (LJIIJJI) {
            if (i > 0) {
                MonitorJni.enableSocketHook(i);
            } else {
                MonitorJni.disableSocketHook();
            }
        }
    }

    public final JSONObject LIZIZ(long j, long j2) {
        JSONObject jSONObject = new JSONObject();
        for (int i = 0; i < ((CopyOnWriteArrayList) this.LIZ).size(); i++) {
            try {
                Pair<String, ?> pairLIZIZ = ((c) ((CopyOnWriteArrayList) this.LIZ).get(i)).LIZIZ(j, j2);
                if (pairLIZIZ != null) {
                    jSONObject.put((String) pairLIZIZ.first, pairLIZIZ.second);
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        return jSONObject;
    }
}
