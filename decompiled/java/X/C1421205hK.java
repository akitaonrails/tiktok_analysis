package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05hK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$busyReceive$2", f = "MouseWheelScrollable.kt", l = {170}, m = "invokeSuspend")
public final class C1421205hK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super C20074813gg>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C095E<C20074813gg> LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1421205hK(C095E<C20074813gg> c095e, InterfaceC1364105Vn<? super C1421205hK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = c095e;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C1421205hK c1421205hK = new C1421205hK(this.LLILLL, interfaceC1364105Vn);
        c1421205hK.LLILLJJLI = obj;
        return c1421205hK;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:18:0x0042
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // njp.a
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r6.LL
            r4 = 1
            r3 = 0
            if (r0 == 0) goto L19
            if (r0 != r4) goto L11
            java.lang.Object r1 = r6.LLILLJJLI
            X.09AE r1 = (X.C09AE) r1
            goto L37
        L11:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L19:
            X.C155000ia.LIZIZ(r7)
            java.lang.Object r2 = r6.LLILLJJLI
            X.01wk r2 = (X.InterfaceC497601wk) r2
            X.05hL r1 = new X.05hL
            r1.<init>(r3)
            r0 = 3
            X.0956 r1 = X.C23250099c.LIZLLL(r2, r3, r3, r1, r0)
            X.095E<X.13gg> r0 = r6.LLILLL     // Catch: java.lang.Throwable -> L42
            r6.LLILLJJLI = r1     // Catch: java.lang.Throwable -> L42
            r6.LL = r4     // Catch: java.lang.Throwable -> L42
            java.lang.Object r7 = r0.LJIILIIL(r6)     // Catch: java.lang.Throwable -> L42
            if (r7 != r5) goto L3a
            return r5
        L37:
            X.C155000ia.LIZIZ(r7)     // Catch: java.lang.Throwable -> L40
        L3a:
            X.13gg r7 = (X.C20074813gg) r7     // Catch: java.lang.Throwable -> L40
            r1.LIZIZ(r3)
            return r7
        L40:
            r0 = move-exception
            goto L43
        L42:
            r0 = move-exception
        L43:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> L42
            r1.LIZIZ(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1421205hK.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super C20074813gg> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
