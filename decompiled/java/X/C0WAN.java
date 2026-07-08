package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.LinkedHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: renamed from: X.0WAN, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0WAN {
    public static C0WAS LIZJ(int i) {
        ArrayList arrayList = new ArrayList();
        C0WAK c0wakLIZJ = C0WAI.LIZJ(i, arrayList);
        return new C0WAS(System.currentTimeMillis(), System.nanoTime(), c0wakLIZJ.LIZ, c0wakLIZJ.LIZIZ, arrayList);
    }

    public static String LIZLLL(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr != null && stackTraceElementArr.length != 0) {
            int iMin = Math.min(stackTraceElementArr.length, 64);
            StringBuilder sb = new StringBuilder(Math.min((iMin * 80) + 32, 12000));
            for (int i = 0; i < iMin; i++) {
                sb.append("  at ");
                sb.append(stackTraceElementArr[i].toString());
                sb.append('\n');
            }
            if (stackTraceElementArr.length > iMin) {
                sb.append("  ... ");
                sb.append(stackTraceElementArr.length - iMin);
                sb.append(" more\n");
            }
            String string = sb.toString();
            if (string.length() > 12000) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(string.substring(0, 12000));
                sbLIZ.append("\n  ...<truncated>\n");
                return C2188811AlT.LIZIZ(sbLIZ);
            }
            return string;
        }
        return "  <empty stack>\n";
    }

    public static C0WAT LIZ(final int i, final long j, final Thread thread) {
        final LinkedHashMap linkedHashMap;
        if (j > 0) {
            C0WAS c0wasLIZJ = LIZJ(i);
            final EnumMap enumMap = new EnumMap(C0WAR.class);
            if (thread != null) {
                linkedHashMap = new LinkedHashMap();
            } else {
                linkedHashMap = null;
            }
            final AtomicLong atomicLong = new AtomicLong(0L);
            final AtomicBoolean atomicBoolean = new AtomicBoolean(true);
            BPEAThread bPEAThread = new BPEAThread(new Runnable() { // from class: X.0WAO
                /* JADX WARN: Removed duplicated region for block: B:17:0x0058 A[Catch: Exception -> 0x009e, TRY_LEAVE, TryCatch #0 {Exception -> 0x009e, blocks: (B:8:0x0022, B:15:0x0050, B:17:0x0058, B:37:0x009d, B:14:0x003c, B:13:0x0039, B:12:0x0035, B:6:0x001c, B:18:0x0059, B:20:0x0061, B:21:0x0068, B:23:0x006c, B:32:0x0096, B:29:0x0083, B:31:0x0093, B:26:0x0071), top: B:45:0x0022, inners: #1, #2, #3 }] */
                @Override // java.lang.Runnable
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final void run() {
                    /*
                        r16 = this;
                        r2 = r16
                        int r7 = r1
                        long r0 = r2
                        java.util.concurrent.atomic.AtomicBoolean r6 = r4
                        java.util.EnumMap r5 = r5
                        java.lang.Thread r11 = r6
                        java.util.LinkedHashMap r12 = r7
                        java.util.concurrent.atomic.AtomicLong r13 = r8
                        java.lang.String r2 = "ThreadIoProfiler@3d1c.begin$1L"
                        X.C1C7U.LIZ(r2)
                    L15:
                        boolean r2 = r6.get()
                        if (r2 == 0) goto Lb2
                        r8 = 1
                        int r2 = android.os.Process.myTid()     // Catch: java.lang.Throwable -> L34
                        if (r7 != r2) goto L3c
                        X.0VSJ r3 = new X.0VSJ     // Catch: java.io.IOException -> L32 java.lang.Exception -> L9e
                        java.lang.String r2 = "/proc/thread-self/wchan"
                        r3.<init>(r2)     // Catch: java.io.IOException -> L32 java.lang.Exception -> L9e
                        java.lang.String r2 = X.C0WAI.LIZLLL(r3)     // Catch: java.io.IOException -> L32 java.lang.Exception -> L9e
                        java.lang.String r2 = r2.trim()     // Catch: java.io.IOException -> L32 java.lang.Exception -> L9e
                        goto L50
                    L32:
                        r2 = move-exception
                        goto L39
                    L34:
                        r2 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)     // Catch: java.lang.Exception -> L9e
                        goto L3c
                    L39:
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)     // Catch: java.lang.Exception -> L9e
                    L3c:
                        X.0VSJ r4 = new X.0VSJ     // Catch: java.lang.Exception -> L9e
                        java.lang.String r3 = X.C0WAI.LIZIZ(r7)     // Catch: java.lang.Exception -> L9e
                        java.lang.String r2 = "wchan"
                        r4.<init>(r3, r2)     // Catch: java.lang.Exception -> L9e
                        java.lang.String r2 = X.C0WAI.LIZLLL(r4)     // Catch: java.lang.Exception -> L9e
                        java.lang.String r2 = r2.trim()     // Catch: java.lang.Exception -> L9e
                    L50:
                        X.0WAR r10 = X.C0WAQ.LIZ(r2)     // Catch: java.lang.Exception -> L9e
                        X.0WAR r2 = X.C0WAR.OTHER     // Catch: java.lang.Exception -> L9e
                        if (r10 == r2) goto La2
                        monitor-enter(r5)     // Catch: java.lang.Exception -> L9e
                        java.lang.Object r2 = r5.get(r10)     // Catch: java.lang.Throwable -> L98
                        java.lang.Integer r2 = (java.lang.Integer) r2     // Catch: java.lang.Throwable -> L98
                        if (r2 != 0) goto L71
                        java.lang.Integer r2 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L98
                        r5.put(r10, r2)     // Catch: java.lang.Throwable -> L98
                    L68:
                        X.0WAR r2 = X.C0WAR.FUTEX_WAIT     // Catch: java.lang.Throwable -> L98
                        if (r10 == r2) goto L7f
                        X.0WAR r2 = X.C0WAR.POLL_WAIT     // Catch: java.lang.Throwable -> L98
                        if (r10 != r2) goto L96
                        goto L7f
                    L71:
                        int r2 = r2.intValue()     // Catch: java.lang.Throwable -> L98
                        int r2 = r2 + 1
                        java.lang.Integer r2 = java.lang.Integer.valueOf(r2)     // Catch: java.lang.Throwable -> L98
                        r5.put(r10, r2)     // Catch: java.lang.Throwable -> L98
                        goto L68
                    L7f:
                        if (r11 == 0) goto L96
                        if (r12 == 0) goto L96
                        long r14 = java.lang.System.currentTimeMillis()     // Catch: java.lang.Throwable -> L98
                        long r2 = r13.get()     // Catch: java.lang.Throwable -> L98
                        long r8 = r14 - r2
                        r3 = 200(0xc8, double:9.9E-322)
                        int r2 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
                        if (r2 < 0) goto L96
                        X.C0WAN.LIZIZ(r10, r11, r12, r13, r14)     // Catch: java.lang.Throwable -> L98
                    L96:
                        monitor-exit(r5)     // Catch: java.lang.Throwable -> L98
                        goto La2
                    L98:
                        r2 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)     // Catch: java.lang.Throwable -> L98
                        monitor-exit(r5)     // Catch: java.lang.Throwable -> L98
                        throw r2     // Catch: java.lang.Exception -> L9e
                    L9e:
                        r2 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r2)
                    La2:
                        java.lang.Thread.sleep(r0)     // Catch: java.lang.InterruptedException -> La7
                        goto L15
                    La7:
                        r0 = move-exception
                        com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
                        java.lang.Thread r0 = X.C786410Ut5.u3()
                        r0.interrupt()
                    Lb2:
                        java.lang.String r0 = "ThreadIoProfiler@3d1c.begin$1L"
                        X.C1C7U.LIZIZ(r0)
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: X.C0WAO.run():void");
                }
            }, "thread-io-profiler-wchan");
            bPEAThread.setDaemon(true);
            bPEAThread.start();
            return new C0WAT(i, c0wasLIZJ, j, atomicBoolean, bPEAThread, enumMap, linkedHashMap);
        }
        throw new IllegalArgumentException("sampleIntervalMillis must be > 0 when wchan is enabled");
    }

    public static void LIZIZ(C0WAR c0war, Thread thread, LinkedHashMap<C0WAP, Integer> linkedHashMap, AtomicLong atomicLong, long j) {
        try {
            C0WAP c0wap = new C0WAP(c0war, LIZLLL(ThreadMethodProxy.getStackTrace(thread)));
            int iIntValue = 1;
            if (linkedHashMap.containsKey(c0wap)) {
                Integer num = linkedHashMap.get(c0wap);
                if (num != null) {
                    iIntValue = 1 + num.intValue();
                }
                linkedHashMap.put(c0wap, Integer.valueOf(iIntValue));
                atomicLong.set(j);
                return;
            }
            if (linkedHashMap.size() < 32) {
                linkedHashMap.put(c0wap, 1);
                atomicLong.set(j);
            } else {
                atomicLong.set(j);
            }
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
    }
}
