package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS609S0100000_30;
import kotlin.jvm.internal.AwS644S0100000_30;

/* JADX INFO: renamed from: X.13Yj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20029113Yj {
    public final Function1<Function0<Unit>, Unit> LIZ;
    public boolean LIZJ;
    public C13Y8 LJII;
    public boolean LJIIIIZZ;
    public C20029013Yi LJIIIZ;
    public final AtomicReference<Object> LIZIZ = new AtomicReference<>(null);
    public final AwS644S0100000_30 LIZLLL = new AwS644S0100000_30(this, 43);
    public final AwS609S0100000_30 LJ = new AwS609S0100000_30(this, 261);
    public final C19968013Aw<C20029013Yi> LJFF = new C19968013Aw<>(new C20029013Yi[16]);
    public final Object LJI = new Object();
    public long LJIIJ = -1;

    public final void LIZIZ() {
        synchronized (this.LJI) {
            try {
                C19968013Aw<C20029013Yi> c19968013Aw = this.LJFF;
                C20029013Yi[] c20029013YiArr = c19968013Aw.LL;
                int i = c19968013Aw.LLILLL;
                for (int i2 = 0; i2 < i; i2++) {
                    C20029013Yi c20029013Yi = c20029013YiArr[i2];
                    c20029013Yi.LJ.LJFF();
                    c20029013Yi.LJFF.LJFF();
                    c20029013Yi.LJIIJ.LJFF();
                    c20029013Yi.LJIIJJI.clear();
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C20029113Yj(Function1<? super Function0<Unit>, Unit> function1) {
        this.LIZ = function1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x0085, code lost:
    
        return r8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final boolean LIZ(X.C20029113Yj r9) {
        /*
            java.lang.Object r1 = r9.LJI
            monitor-enter(r1)
            boolean r0 = r9.LIZJ     // Catch: java.lang.Throwable -> L87
            monitor-exit(r1)
            r5 = 0
            if (r0 != 0) goto L86
            r8 = 0
        La:
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r0 = r9.LIZIZ
            java.lang.Object r7 = r0.get()
            r4 = 1
            r3 = 0
            if (r7 == 0) goto L85
            boolean r0 = r7 instanceof java.util.Set
            if (r0 == 0) goto L4c
            r6 = r7
            java.util.Set r6 = (java.util.Set) r6
        L1b:
            java.util.concurrent.atomic.AtomicReference<java.lang.Object> r1 = r9.LIZIZ
        L1d:
            boolean r0 = r1.compareAndSet(r7, r3)
            if (r0 == 0) goto L45
            if (r6 == 0) goto L85
            java.lang.Object r4 = r9.LJI
            monitor-enter(r4)
            X.13Aw<X.13Yi> r0 = r9.LJFF     // Catch: java.lang.Throwable -> L74
            T[] r3 = r0.LL     // Catch: java.lang.Throwable -> L74
            int r2 = r0.LLILLL     // Catch: java.lang.Throwable -> L74
            r1 = 0
        L2f:
            if (r1 >= r2) goto L43
            r0 = r3[r1]     // Catch: java.lang.Throwable -> L74
            X.13Yi r0 = (X.C20029013Yi) r0     // Catch: java.lang.Throwable -> L74
            boolean r0 = r0.LIZIZ(r6)     // Catch: java.lang.Throwable -> L74
            if (r0 != 0) goto L3f
            if (r8 != 0) goto L3f
            r8 = 0
            goto L40
        L3f:
            r8 = 1
        L40:
            int r1 = r1 + 1
            goto L2f
        L43:
            monitor-exit(r4)
            goto La
        L45:
            java.lang.Object r0 = r1.get()
            if (r0 == r7) goto L1d
            goto La
        L4c:
            boolean r0 = r7 instanceof java.util.List
            if (r0 == 0) goto L7a
            r2 = r7
            java.util.List r2 = (java.util.List) r2
            java.lang.Object r6 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r2, r5)
            java.util.Set r6 = (java.util.Set) r6
            int r0 = r2.size()
            r1 = 2
            if (r0 != r1) goto L65
            java.lang.Object r3 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r2, r4)
            goto L1b
        L65:
            int r0 = r2.size()
            if (r0 <= r1) goto L1b
            int r0 = r2.size()
            java.util.List r3 = r2.subList(r4, r0)
            goto L1b
        L74:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L74
            monitor-exit(r4)
            throw r0
        L7a:
            java.lang.String r0 = "Unexpected notification"
            androidx.compose.runtime.s.LIZLLL(r0)
            X.08jB r0 = new X.08jB
            r0.<init>()
            throw r0
        L85:
            return r8
        L86:
            return r5
        L87:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L87
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20029113Yj.LIZ(X.13Yj):boolean");
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0060  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZJ(java.lang.Object r22) {
        /*
            r21 = this;
            r0 = r21
            java.lang.Object r5 = r0.LJI
            monitor-enter(r5)
            X.13Aw<X.13Yi> r4 = r0.LJFF     // Catch: java.lang.Throwable -> L87
            int r3 = r4.LLILLL     // Catch: java.lang.Throwable -> L87
            r9 = 0
            r20 = 0
        Lc:
            if (r9 >= r3) goto L7b
            T[] r0 = r4.LL     // Catch: java.lang.Throwable -> L87
            r13 = r0[r9]     // Catch: java.lang.Throwable -> L87
            X.13Yi r13 = (X.C20029013Yi) r13     // Catch: java.lang.Throwable -> L87
            X.13Kb<java.lang.Object, X.13Yb<java.lang.Object>> r0 = r13.LJFF     // Catch: java.lang.Throwable -> L87
            r14 = r22
            java.lang.Object r0 = r0.LJIIIZ(r14)     // Catch: java.lang.Throwable -> L87
            X.13Yb r0 = (X.C20028313Yb) r0     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L65
            java.lang.Object[] r12 = r0.LIZIZ     // Catch: java.lang.Throwable -> L87
            long[] r11 = r0.LIZ     // Catch: java.lang.Throwable -> L87
            int r0 = r11.length     // Catch: java.lang.Throwable -> L87
            int r10 = r0 + (-2)
            if (r10 < 0) goto L65
            r8 = 0
        L2a:
            r1 = r11[r8]     // Catch: java.lang.Throwable -> L87
            long r6 = ~r1     // Catch: java.lang.Throwable -> L87
            r0 = 7
            long r6 = r6 << r0
            long r6 = r6 & r1
            r15 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r6 = r6 & r15
            int r0 = (r6 > r15 ? 1 : (r6 == r15 ? 0 : -1))
            if (r0 == 0) goto L60
            int r0 = r8 - r10
            int r0 = ~r0     // Catch: java.lang.Throwable -> L87
            int r0 = r0 >>> 31
            r15 = 8
            int r7 = 8 - r0
            r6 = 0
        L44:
            if (r6 >= r7) goto L5e
            r16 = 255(0xff, double:1.26E-321)
            long r18 = r1 & r16
            r16 = 128(0x80, double:6.3E-322)
            int r0 = (r18 > r16 ? 1 : (r18 == r16 ? 0 : -1))
            if (r0 >= 0) goto L5a
            int r0 = r8 << 3
            int r0 = r0 + r6
            r0 = r12[r0]     // Catch: java.lang.Throwable -> L87
            r13.LIZLLL(r14, r0)     // Catch: java.lang.Throwable -> L87
            r15 = 8
        L5a:
            long r1 = r1 >> r15
            int r6 = r6 + 1
            goto L44
        L5e:
            if (r7 != r15) goto L65
        L60:
            if (r8 == r10) goto L65
            int r8 = r8 + 1
            goto L2a
        L65:
            X.13Kb<java.lang.Object, X.13Yb<java.lang.Object>> r0 = r13.LJFF     // Catch: java.lang.Throwable -> L87
            int r0 = r0.LJ     // Catch: java.lang.Throwable -> L87
            if (r0 == 0) goto L76
            if (r20 <= 0) goto L78
            T[] r2 = r4.LL     // Catch: java.lang.Throwable -> L87
            int r1 = r9 - r20
            r0 = r2[r9]     // Catch: java.lang.Throwable -> L87
            r2[r1] = r0     // Catch: java.lang.Throwable -> L87
            goto L78
        L76:
            int r20 = r20 + 1
        L78:
            int r9 = r9 + 1
            goto Lc
        L7b:
            T[] r2 = r4.LL     // Catch: java.lang.Throwable -> L87
            int r1 = r3 - r20
            r0 = 0
            java.util.Arrays.fill(r2, r1, r3, r0)     // Catch: java.lang.Throwable -> L87
            r4.LLILLL = r1     // Catch: java.lang.Throwable -> L87
            monitor-exit(r5)
            return
        L87:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L87
            monitor-exit(r5)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20029113Yj.LIZJ(java.lang.Object):void");
    }

    public final void LIZLLL(Object obj, Function0 function0, Function1 function1) {
        C20029013Yi c20029013Yi;
        C20029013Yi c20029013Yi2;
        synchronized (this.LJI) {
            try {
                C19968013Aw<C20029013Yi> c19968013Aw = this.LJFF;
                C20029013Yi[] c20029013YiArr = c19968013Aw.LL;
                int i = c19968013Aw.LLILLL;
                int i2 = 0;
                while (true) {
                    if (i2 < i) {
                        c20029013Yi = c20029013YiArr[i2];
                        if (c20029013Yi.LIZ == function1) {
                            break;
                        } else {
                            i2++;
                        }
                    } else {
                        c20029013Yi = null;
                        break;
                    }
                }
                c20029013Yi2 = c20029013Yi;
                if (c20029013Yi2 == null) {
                    C19719512Dh.LJ(1, function1);
                    c20029013Yi2 = new C20029013Yi(function1);
                    this.LJFF.LIZLLL(c20029013Yi2);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        boolean z = this.LJIIIIZZ;
        C20029013Yi c20029013Yi3 = this.LJIIIZ;
        long j = this.LJIIJ;
        if (j != -1 && j != C13YX.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Detected multithreaded access to SnapshotStateObserver: previousThreadId=");
            sbLIZ.append(j);
            sbLIZ.append("), currentThread={id=");
            sbLIZ.append(C13YX.LIZ());
            sbLIZ.append(", name=");
            sbLIZ.append(C786410Ut5.u3().getName());
            sbLIZ.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
            C13D4.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        }
        try {
            this.LJIIIIZZ = false;
            this.LJIIIZ = c20029013Yi2;
            this.LJIIJ = C13YX.LIZ();
            c20029013Yi2.LIZ(obj, function0, this.LJ);
            this.LJIIIZ = c20029013Yi3;
            this.LJIIIIZZ = z;
            this.LJIIJ = j;
        } catch (Throwable th2) {
            TryCatchGuardChecker.doCheck(th2);
            this.LJIIIZ = c20029013Yi3;
            this.LJIIIIZZ = z;
            this.LJIIJ = j;
            throw th2;
        }
    }
}
