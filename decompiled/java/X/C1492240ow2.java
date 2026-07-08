package X;

import com.bytedance.bpea.transmit.delegate.BPEAThread;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: renamed from: X.0ow2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1492240ow2 {
    public static int LIZJ;
    public static BPEAThread LJ;
    public static RunnableC1492230ow1 LJFF;
    public static long LIZ = -1;
    public static long LIZIZ = -1;
    public static final AtomicBoolean LIZLLL = new AtomicBoolean(true);

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        if (r1 > r12.frequencyLimit) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LIZ(long r10, com.ss.android.ugc.network.observer.bean.DetectorParam r12, X.C1492280ow6 r13, kotlin.jvm.functions.Function2 r14, kotlin.jvm.functions.Function1 r15) {
        /*
            com.bytedance.bpea.transmit.delegate.BPEAThread r0 = X.C1492240ow2.LJ
            r3 = 1
            r2 = 0
            if (r0 == 0) goto L24
            boolean r0 = com.ss.android.ugc.bytex.pthread.base.convergence.hook.ThreadMethodProxy.isAlive(r0)
            if (r0 == 0) goto L24
        Lc:
            X.0ow1 r2 = X.C1492240ow2.LJFF
            if (r2 == 0) goto L23
            java.util.concurrent.CopyOnWriteArrayList<kotlin.Pair<kotlin.jvm.functions.Function2<X.0ow7, java.util.HashMap<java.lang.String, java.util.HashMap<java.lang.String, java.lang.Object>>, kotlin.Unit>, kotlin.jvm.functions.Function1<java.util.HashMap<java.lang.String, java.lang.Object>, kotlin.Unit>>> r1 = r2.LLILZ
            kotlin.Pair r0 = new kotlin.Pair
            r0.<init>(r14, r15)
            r1.add(r0)
            java.util.concurrent.CopyOnWriteArrayList<java.lang.Long> r1 = r2.LLILZIL
            java.lang.Long r0 = java.lang.Long.valueOf(r10)
            r1.add(r0)
        L23:
            return
        L24:
            long r8 = java.lang.System.currentTimeMillis()
            long r0 = X.C1492240ow2.LIZ
            long r5 = r8 - r0
            int r0 = r12.blackTimeout
            long r0 = (long) r0
            int r4 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r4 <= 0) goto L65
            long r0 = X.C1492240ow2.LIZIZ
            long r6 = r8 - r0
            r4 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r0 <= 0) goto L5b
            X.C1492240ow2.LIZIZ = r8
            X.C1492240ow2.LIZJ = r3
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C1492240ow2.LIZLLL
            r0.set(r3)
        L47:
            X.0ow1 r0 = new X.0ow1
            r0.<init>(r12, r13)
            X.C1492240ow2.LJFF = r0
            com.bytedance.bpea.transmit.delegate.BPEAThread r1 = new com.bytedance.bpea.transmit.delegate.BPEAThread
            X.0ow1 r0 = X.C1492240ow2.LJFF
            r1.<init>(r0)
            X.C1492240ow2.LJ = r1
            r1.start()
            goto Lc
        L5b:
            int r0 = X.C1492240ow2.LIZJ
            int r1 = r0 + 1
            X.C1492240ow2.LIZJ = r1
            int r0 = r12.frequencyLimit
            if (r1 <= r0) goto L47
        L65:
            X.0ow7 r1 = X.EnumC1492290ow7.UNKNOWN_STATUS
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r14.invoke(r1, r0)
            java.util.concurrent.atomic.AtomicBoolean r0 = X.C1492240ow2.LIZLLL
            boolean r0 = r0.compareAndSet(r3, r2)
            if (r0 == 0) goto La1
            java.util.HashMap r3 = new java.util.HashMap
            r3.<init>()
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            int r0 = r1.ordinal()
            java.lang.String r1 = java.lang.String.valueOf(r0)
            java.lang.String r0 = "network_status"
            r3.put(r0, r1)
            java.lang.String r0 = "1"
            java.util.HashMap r1 = X.C1492270ow5.LIZ(r0, r13)
            java.lang.String r0 = "extra_info"
            r2.put(r0, r1)
            java.lang.String r0 = "network_status_detail"
            r3.put(r0, r2)
            r15.invoke(r3)
        La1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1492240ow2.LIZ(long, com.ss.android.ugc.network.observer.bean.DetectorParam, X.0ow6, kotlin.jvm.functions.Function2, kotlin.jvm.functions.Function1):void");
    }
}
