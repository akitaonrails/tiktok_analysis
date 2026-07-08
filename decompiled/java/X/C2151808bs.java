package X;

import Y.ARunnableS103S0100000_3;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;

/* JADX INFO: renamed from: X.08bs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2151808bs {
    public static volatile Choreographer choreographer;

    static {
        Object c098200Yq;
        try {
            c098200Yq = new C2238608ps(LIZ(Looper.getMainLooper()));
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m7isFailureimpl(c098200Yq);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0084  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:23:0x0081 -> B:24:0x0084). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.os.Handler LIZ(android.os.Looper r9) throws java.lang.Throwable {
        /*
            int r1 = android.os.Build.VERSION.SDK_INT
            r5 = 1
            r8 = 0
            r0 = 28
            r7 = 2
            r4 = 0
            if (r1 < r0) goto L92
            java.lang.Class<android.os.Handler> r2 = android.os.Handler.class
            java.lang.Class[] r1 = new java.lang.Class[r5]
            java.lang.Class<android.os.Looper> r0 = android.os.Looper.class
            r1[r8] = r0
            java.lang.String r0 = "createAsync"
            java.lang.reflect.Method r6 = r2.getDeclaredMethod(r0, r1)
            java.lang.Object[] r3 = new java.lang.Object[r5]
            r3[r8] = r9
            boolean r0 = X.C0WP5.LIZ
            if (r0 == 0) goto L28
            boolean r0 = X.C0WP5.LJIIIIZZ
            if (r0 == 0) goto L28
            r0 = 1
        L25:
            if (r0 == 0) goto L84
            goto L2a
        L28:
            r0 = 0
            goto L25
        L2a:
            java.lang.String r1 = r6.getName()     // Catch: java.lang.Throwable -> L80
            java.lang.String r0 = "createAsync"
            boolean r0 = java.util.Objects.equals(r1, r0)     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto L84
            java.lang.Class r1 = r6.getDeclaringClass()     // Catch: java.lang.Throwable -> L80
            java.lang.Class<android.os.Handler> r0 = android.os.Handler.class
            if (r1 != r0) goto L84
            java.lang.Class[] r2 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> L80
            java.lang.Class[] r1 = new java.lang.Class[r5]     // Catch: java.lang.Throwable -> L80
            java.lang.Class<android.os.Looper> r0 = android.os.Looper.class
            r1[r8] = r0     // Catch: java.lang.Throwable -> L80
            boolean r0 = java.util.Arrays.equals(r2, r1)     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto L5b
            r1 = r3[r8]     // Catch: java.lang.Throwable -> L80
            android.os.Looper r1 = (android.os.Looper) r1     // Catch: java.lang.Throwable -> L80
            com.bytedance.bpea.transmit.delegate.BPEAHandler r0 = new com.bytedance.bpea.transmit.delegate.BPEAHandler     // Catch: java.lang.Throwable -> L80
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L80
            r0.makeAsynchronous()     // Catch: java.lang.Throwable -> L80
            goto L8f
        L5b:
            java.lang.Class[] r2 = r6.getParameterTypes()     // Catch: java.lang.Throwable -> L80
            java.lang.Class[] r1 = new java.lang.Class[r7]     // Catch: java.lang.Throwable -> L80
            java.lang.Class<android.os.Looper> r0 = android.os.Looper.class
            r1[r8] = r0     // Catch: java.lang.Throwable -> L80
            java.lang.Class<android.os.Handler$Callback> r0 = android.os.Handler.Callback.class
            r1[r5] = r0     // Catch: java.lang.Throwable -> L80
            boolean r0 = java.util.Arrays.equals(r2, r1)     // Catch: java.lang.Throwable -> L80
            if (r0 == 0) goto L84
            r2 = r3[r8]     // Catch: java.lang.Throwable -> L80
            android.os.Looper r2 = (android.os.Looper) r2     // Catch: java.lang.Throwable -> L80
            r1 = r3[r5]     // Catch: java.lang.Throwable -> L80
            android.os.Handler$Callback r1 = (android.os.Handler.Callback) r1     // Catch: java.lang.Throwable -> L80
            com.bytedance.bpea.transmit.delegate.BPEAHandler r0 = new com.bytedance.bpea.transmit.delegate.BPEAHandler     // Catch: java.lang.Throwable -> L80
            r0.<init>(r2, r1)     // Catch: java.lang.Throwable -> L80
            r0.makeAsynchronous()     // Catch: java.lang.Throwable -> L80
            goto L8f
        L80:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
        L84:
            X.0WZX r1 = new X.0WZX
            java.lang.String r0 = "dzBzEgAjS8/YVFkiQFyGdpIIcJC4Jsdv3x8FiIRoXbL9gHrFtCzZzFaijj0="
            r1.<init>(r0, r4)
            java.lang.Object r0 = X.C2204961BRm.a0(r6, r4, r3, r1)
        L8f:
            android.os.Handler r0 = (android.os.Handler) r0
            return r0
        L92:
            java.lang.Class<android.os.Handler> r2 = android.os.Handler.class
            r3 = 3
            java.lang.Class[] r1 = new java.lang.Class[r3]     // Catch: java.lang.NoSuchMethodException -> Lb8
            java.lang.Class<android.os.Looper> r0 = android.os.Looper.class
            r1[r8] = r0     // Catch: java.lang.NoSuchMethodException -> Lb8
            java.lang.Class<android.os.Handler$Callback> r0 = android.os.Handler.Callback.class
            r1[r5] = r0     // Catch: java.lang.NoSuchMethodException -> Lb8
            java.lang.Class r0 = java.lang.Boolean.TYPE     // Catch: java.lang.NoSuchMethodException -> Lb8
            r1[r7] = r0     // Catch: java.lang.NoSuchMethodException -> Lb8
            java.lang.reflect.Constructor r2 = r2.getDeclaredConstructor(r1)     // Catch: java.lang.NoSuchMethodException -> Lb8
            java.lang.Object[] r1 = new java.lang.Object[r3]
            r1[r8] = r9
            r1[r5] = r4
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            r1[r7] = r0
            java.lang.Object r0 = X.AnonymousClass0851.LIZ(r2, r1)
            android.os.Handler r0 = (android.os.Handler) r0
            return r0
        Lb8:
            com.bytedance.bpea.transmit.delegate.BPEAHandler r0 = new com.bytedance.bpea.transmit.delegate.BPEAHandler
            r0.<init>(r9)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2151808bs.LIZ(android.os.Looper):android.os.Handler");
    }

    public static final Object LIZIZ(InterfaceC1364105Vn<? super Long> interfaceC1364105Vn) {
        Choreographer choreographer2 = choreographer;
        if (choreographer2 != null) {
            C2252611DEt c2252611DEt = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
            c2252611DEt.LJIJJ();
            choreographer2.postFrameCallback(new ChoreographerFrameCallbackC2151908bt(c2252611DEt));
            Object objLJIJ = c2252611DEt.LJIJ();
            if (objLJIJ == C099R.LJFF()) {
                C099Q.LIZJ(interfaceC1364105Vn);
            }
            return objLJIJ;
        }
        C2252611DEt c2252611DEt2 = new C2252611DEt(1, C099M.LIZLLL(interfaceC1364105Vn));
        c2252611DEt2.LJIJJ();
        if (Looper.myLooper() == Looper.getMainLooper()) {
            LIZLLL(c2252611DEt2);
        } else {
            C1DFH c1dfh = C0PEM.LIZ;
            C0WQQ.LIZ(C2107308Nj.LIZ, c2252611DEt2.LLILZIL, new ARunnableS103S0100000_3((Object) c2252611DEt2, 113));
        }
        Object objLJIJ2 = c2252611DEt2.LJIJ();
        if (objLJIJ2 == C099R.LJFF()) {
            C099Q.LIZJ(interfaceC1364105Vn);
        }
        return objLJIJ2;
    }

    public static final void LIZLLL(InterfaceC20236714Gf<? super Long> interfaceC20236714Gf) {
        Choreographer choreographerV2 = choreographer;
        if (choreographerV2 == null) {
            choreographerV2 = C786410Ut5.v2();
            choreographer = choreographerV2;
        }
        choreographerV2.postFrameCallback(new ChoreographerFrameCallbackC2151908bt(interfaceC20236714Gf));
    }

    public static final C2238608ps LIZJ(String str, Handler handler) {
        return new C2238608ps(handler, str, false);
    }
}
