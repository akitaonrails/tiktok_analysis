package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0NQJ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0NQJ {
    public final List<Function1<InterfaceC1364105Vn<? super Unit>, Object>> LIZ = new ArrayList();

    public final void LIZ(Function1<? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function1) {
        try {
            synchronized (this) {
                try {
                    ((ArrayList) this.LIZ).add(function1);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1AF0.LJ(e);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0024  */
    /* JADX WARN: Type inference failed for: r0v6, types: [T, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object LIZIZ(X.InterfaceC1364105Vn<? super kotlin.Unit> r7) {
        /*
            r6 = this;
            boolean r0 = r7 instanceof X.C0NQK
            if (r0 == 0) goto L24
            r5 = r7
            X.0NQK r5 = (X.C0NQK) r5
            int r2 = r5.LLILZ
            r1 = -2147483648(0xffffffff80000000, float:-0.0)
            r0 = r2 & r1
            if (r0 == 0) goto L24
            int r2 = r2 - r1
            r5.LLILZ = r2
        L12:
            java.lang.Object r4 = r5.LLILLJJLI
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r5.LLILZ
            r2 = 1
            if (r0 == 0) goto L32
            if (r0 != r2) goto L2a
            java.lang.Object r1 = r5.LL
            java.util.Iterator r1 = (java.util.Iterator) r1
            goto L54
        L24:
            X.0NQK r5 = new X.0NQK
            r5.<init>(r6, r7)
            goto L12
        L2a:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L32:
            X.C155000ia.LIZIZ(r4)
            X.00zU r1 = new X.00zU     // Catch: java.lang.Exception -> L74
            r1.<init>()     // Catch: java.lang.Exception -> L74
            monitor-enter(r6)     // Catch: java.lang.Exception -> L74
            java.util.List<kotlin.jvm.functions.Function1<X.05Vn<? super kotlin.Unit>, java.lang.Object>> r0 = r6.LIZ     // Catch: java.lang.Throwable -> L6e
            java.util.List r0 = X.C13LP.LLIIII(r0)     // Catch: java.lang.Throwable -> L6e
            r1.element = r0     // Catch: java.lang.Throwable -> L6e
            java.util.List<kotlin.jvm.functions.Function1<X.05Vn<? super kotlin.Unit>, java.lang.Object>> r0 = r6.LIZ     // Catch: java.lang.Throwable -> L6e
            java.util.ArrayList r0 = (java.util.ArrayList) r0     // Catch: java.lang.Throwable -> L6e
            r0.clear()     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r6)     // Catch: java.lang.Exception -> L74
            T r0 = r1.element     // Catch: java.lang.Exception -> L74
            java.util.List r0 = (java.util.List) r0     // Catch: java.lang.Exception -> L74
            java.util.Iterator r1 = r0.iterator()     // Catch: java.lang.Exception -> L74
            goto L57
        L54:
            X.C155000ia.LIZIZ(r4)     // Catch: java.lang.Exception -> L74
        L57:
            boolean r0 = r1.hasNext()     // Catch: java.lang.Exception -> L74
            if (r0 == 0) goto L7b
            java.lang.Object r0 = r1.next()     // Catch: java.lang.Exception -> L74
            kotlin.jvm.functions.Function1 r0 = (kotlin.jvm.functions.Function1) r0     // Catch: java.lang.Exception -> L74
            r5.LL = r1     // Catch: java.lang.Exception -> L74
            r5.LLILZ = r2     // Catch: java.lang.Exception -> L74
            java.lang.Object r0 = r0.invoke(r5)     // Catch: java.lang.Exception -> L74
            if (r0 != r3) goto L57
            return r3
        L6e:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L6e
            monitor-exit(r6)     // Catch: java.lang.Exception -> L74
            throw r0     // Catch: java.lang.Exception -> L74
        L74:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.C1AF0.LJ(r0)
        L7b:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0NQJ.LIZIZ(X.05Vn):java.lang.Object");
    }
}
