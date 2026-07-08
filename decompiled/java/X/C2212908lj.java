package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.08lj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.gamora.editorpro.aiediting.aigc.panel.base.EPAIGCPanelRootScene$prefetchModelIcons$1", f = "EPAIGCPanelRootScene.kt", l = {283}, m = "invokeSuspend")
public final class C2212908lj extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public Object LL;
    public int LLILLJJLI;
    public final /* synthetic */ boolean LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2212908lj(boolean z, InterfaceC1364105Vn<? super C2212908lj> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = z;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2212908lj(this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0090  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0075 -> B:12:0x005c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxRuntimeException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't find top splitter block for handler:B:19:0x007d
        	at jadx.core.utils.BlockUtils.getTopSplitterForHandler(BlockUtils.java:1182)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.collectHandlerRegions(ExcHandlersRegionMaker.java:53)
        	at jadx.core.dex.visitors.regions.maker.ExcHandlersRegionMaker.process(ExcHandlersRegionMaker.java:38)
        	at jadx.core.dex.visitors.regions.RegionMakerVisitor.visit(RegionMakerVisitor.java:27)
        */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.String r5 = "EPAIGCPanelRootScene@e8d5.prefetchModelIcons$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r6.LLILLJJLI
            r2 = 1
            if (r0 == 0) goto L28
            if (r0 != r2) goto L20
            java.lang.Object r4 = r6.LL
            java.util.Iterator r4 = (java.util.Iterator) r4
            X.C155000ia.LIZIZ(r7)     // Catch: java.lang.Throwable -> L1e
            X.00o6 r7 = (X.C189200o6) r7     // Catch: java.lang.Throwable -> L1e
            java.lang.Object r0 = r7.m10unboximpl()     // Catch: java.lang.Throwable -> L1e
            goto L75
        L1e:
            r1 = move-exception
            goto L80
        L20:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L28:
            X.C155000ia.LIZIZ(r7)
            boolean r0 = r6.LLILLL
            java.util.List r1 = X.C307470C3l.LIZ(r0)
            boolean r0 = r6.LLILLL
            java.util.List r0 = X.C307470C3l.LIZJ(r0)
            java.util.List r0 = X.C13LP.LJLIL(r0, r1)
            X.07ik r1 = new X.07ik
            r1.<init>(r0)
            r0 = 108(0x6c, float:1.51E-43)
            kotlin.jvm.internal.AFwS231S0000000_3 r0 = kotlin.jvm.internal.AFwS231S0000000_3.get$arr$(r0)
            X.08QU r1 = X.C09RB.LJIJI(r1, r0)
            r0 = 109(0x6d, float:1.53E-43)
            kotlin.jvm.internal.AFwS231S0000000_3 r0 = kotlin.jvm.internal.AFwS231S0000000_3.get$arr$(r0)
            X.08QU r0 = X.C09RB.LJIIIZ(r1, r0)
            X.08QP r0 = X.C09RB.LJI(r0)
            java.util.Iterator r4 = r0.iterator()
        L5c:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L90
            java.lang.Object r1 = r4.next()
            java.lang.String r1 = (java.lang.String) r1
            X.08qU r0 = X.C2242408qU.LIZ     // Catch: java.lang.Throwable -> L7d
            r6.LL = r4     // Catch: java.lang.Throwable -> L7d
            r6.LLILLJJLI = r2     // Catch: java.lang.Throwable -> L7d
            java.lang.Object r0 = r0.LJFF(r1, r6)     // Catch: java.lang.Throwable -> L7d
            if (r0 != r3) goto L75
            goto L8c
        L75:
            X.00o6 r0 = X.C189200o6.m1boximpl(r0)     // Catch: java.lang.Throwable -> L7f
            X.C189200o6.m2constructorimpl(r0)     // Catch: java.lang.Throwable -> L7f
            goto L5c
        L7d:
            r1 = move-exception
            goto L80
        L7f:
            r1 = move-exception
        L80:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r1)
            X.00Yq r0 = new X.00Yq
            r0.<init>(r1)
            X.C189200o6.m2constructorimpl(r0)
            goto L5c
        L8c:
            X.C1C7U.LIZIZ(r5)
            return r3
        L90:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2212908lj.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
