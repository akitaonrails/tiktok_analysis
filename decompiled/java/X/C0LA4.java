package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0LA4, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
@C09DV(c = "com.ss.android.ugc.aweme.shortvideo.autocut.view.TemplateTabsContainer$getLottieView$1$result$1", f = "TemplateTabsContainer.kt", l = {}, m = "invokeSuspend")
public final class C0LA4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C1292000jj4<C1294720jnS>>, Object> {
    public final /* synthetic */ String LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0LA4(String str, InterfaceC1364105Vn<? super C0LA4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = str;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C0LA4(this.LL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0059  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            java.lang.String r4 = "TemplateTabsContainer@15d.getLottieView$1$result$1"
            X.C1C7U.LIZ(r4)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r6)
            X.0L62 r2 = X.C0L62.LIZ
            X.0L66 r1 = X.C0L66.LIZ
            java.lang.String r0 = r5.LL
            r2.getClass()
            java.util.concurrent.locks.ReentrantLock r0 = X.C0L62.LJI(r1, r0)
            r0.lock()
            java.lang.String r0 = r5.LL     // Catch: java.lang.Throwable -> L70
            r3 = 0
            X.0VSP r2 = new X.0VSP     // Catch: java.lang.Throwable -> L47
            java.lang.String r0 = X.C0L62.LJII(r1, r0)     // Catch: java.lang.Throwable -> L47
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L47
            X.0jj4 r1 = X.C1294250jmh.LJFF(r2, r3)     // Catch: java.lang.Throwable -> L32
            X.C2107108Nh.LIZ(r2, r3)     // Catch: java.lang.Throwable -> L47
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L47
            goto L53
        L32:
            r1 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)     // Catch: java.lang.Throwable -> L39
            throw r1     // Catch: java.lang.Throwable -> L37
        L37:
            r0 = move-exception
            goto L3b
        L39:
            r0 = move-exception
            r1 = r3
        L3b:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L3f
            goto L41
        L3f:
            r0 = move-exception
            goto L3b
        L41:
            X.C2107108Nh.LIZ(r2, r1)     // Catch: java.lang.Throwable -> L45
            throw r0     // Catch: java.lang.Throwable -> L45
        L45:
            r0 = move-exception
            goto L48
        L47:
            r0 = move-exception
        L48:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L75
            X.00Yq r1 = new X.00Yq     // Catch: java.lang.Throwable -> L75
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L75
            X.C189200o6.m2constructorimpl(r1)     // Catch: java.lang.Throwable -> L75
        L53:
            boolean r0 = X.C189200o6.m7isFailureimpl(r1)     // Catch: java.lang.Throwable -> L75
            if (r0 != 0) goto L5a
            r3 = r1
        L5a:
            X.0jj4 r3 = (X.C1292000jj4) r3     // Catch: java.lang.Throwable -> L75
            X.0L62 r2 = X.C0L62.LIZ
            X.0L66 r1 = X.C0L66.LIZ
            java.lang.String r0 = r5.LL
            r2.getClass()
            java.util.concurrent.locks.ReentrantLock r0 = X.C0L62.LJI(r1, r0)
            r0.unlock()
            X.C1C7U.LIZIZ(r4)
            return r3
        L70:
            r3 = move-exception
        L71:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r3)     // Catch: java.lang.Throwable -> L75
            goto L77
        L75:
            r3 = move-exception
            goto L71
        L77:
            X.0L62 r2 = X.C0L62.LIZ
            X.0L66 r1 = X.C0L66.LIZ
            java.lang.String r0 = r5.LL
            r2.getClass()
            java.util.concurrent.locks.ReentrantLock r0 = X.C0L62.LJI(r1, r0)
            r0.unlock()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0LA4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C1292000jj4<C1294720jnS>> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
