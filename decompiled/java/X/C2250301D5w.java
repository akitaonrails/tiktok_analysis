package X;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.1D5w, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.lynx.core.viewmodel.plugin.PluginManager$executeDependencyReadyLogic$1", f = "PluginManager.kt", l = {}, m = "invokeSuspend")
public final class C2250301D5w extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public final /* synthetic */ C2250281D5u LL;
    public final /* synthetic */ C2250321D5y LLILLJJLI;
    public final /* synthetic */ InterfaceC2250311D5x LLILLL;
    public final /* synthetic */ C13IQ<? extends InterfaceC2250311D5x> LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2250301D5w(C2250281D5u c2250281D5u, C2250321D5y c2250321D5y, InterfaceC2250311D5x interfaceC2250311D5x, C13IQ<? extends InterfaceC2250311D5x> c13iq, InterfaceC1364105Vn<? super C2250301D5w> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LL = c2250281D5u;
        this.LLILLJJLI = c2250321D5y;
        this.LLILLL = interfaceC2250311D5x;
        this.LLILZ = c13iq;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C2250301D5w(this.LL, this.LLILLJJLI, this.LLILLL, this.LLILZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006c A[Catch: all -> 0x0095, TryCatch #0 {all -> 0x0095, blocks: (B:3:0x000b, B:5:0x004a, B:7:0x004e, B:9:0x0052, B:10:0x0066, B:12:0x006c, B:14:0x007a, B:16:0x0086, B:20:0x008f, B:17:0x008a), top: B:25:0x000b }] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.String r7 = "PluginManager@a35a.executeDependencyReadyLogic$1"
            X.C1C7U.LIZ(r7)
            X.C099R.LJFF()
            X.C155000ia.LIZIZ(r9)
            X.1D5u r6 = r8.LL     // Catch: java.lang.Throwable -> L95
            X.1D5z r5 = new X.1D5z     // Catch: java.lang.Throwable -> L95
            X.1D61 r2 = r6.LIZJ     // Catch: java.lang.Throwable -> L95
            r1 = 14
            r0 = 0
            r5.<init>(r2, r0, r0, r1)     // Catch: java.lang.Throwable -> L95
            X.1D63 r4 = new X.1D63     // Catch: java.lang.Throwable -> L95
            X.1D66 r0 = r6.LIZ     // Catch: java.lang.Throwable -> L95
            android.content.Context r3 = r0.LIZ     // Catch: java.lang.Throwable -> L95
            com.bytedance.hybrid.spark.SparkContext r2 = r0.LJFF     // Catch: java.lang.Throwable -> L95
            kotlin.jvm.internal.AwS614S0100000_35 r1 = new kotlin.jvm.internal.AwS614S0100000_35     // Catch: java.lang.Throwable -> L95
            r0 = 147(0x93, float:2.06E-43)
            r1.<init>(r6, r0)     // Catch: java.lang.Throwable -> L95
            r4.<init>(r5, r3, r2, r1)     // Catch: java.lang.Throwable -> L95
            X.1D5y r1 = r8.LLILLJJLI     // Catch: java.lang.Throwable -> L95
            X.1D3K r0 = X.C1D3K.EXECUTING_DEPENDENCY_READY     // Catch: java.lang.Throwable -> L95
            r1.LJ = r0     // Catch: java.lang.Throwable -> L95
            X.1D5x r0 = r8.LLILLL     // Catch: java.lang.Throwable -> L95
            r0.executeDependencyReady(r4)     // Catch: java.lang.Throwable -> L95
            X.1D5y r1 = r8.LLILLJJLI     // Catch: java.lang.Throwable -> L95
            r0 = 1
            r1.LIZLLL = r0     // Catch: java.lang.Throwable -> L95
            X.1D5x r0 = r8.LLILLL     // Catch: java.lang.Throwable -> L95
            r1.getClass()     // Catch: java.lang.Throwable -> L95
            java.util.Set r0 = r0.getDependencies()     // Catch: java.lang.Throwable -> L95
            boolean r0 = r0.isEmpty()     // Catch: java.lang.Throwable -> L95
            r0 = r0 ^ 1
            if (r0 == 0) goto L8a
            boolean r0 = r1.LIZJ     // Catch: java.lang.Throwable -> L95
            if (r0 == 0) goto L8f
            boolean r0 = r1.LIZLLL     // Catch: java.lang.Throwable -> L95
            if (r0 == 0) goto L8f
        L52:
            X.1D5y r1 = r8.LLILLJJLI     // Catch: java.lang.Throwable -> L95
            X.1D3K r0 = X.C1D3K.COMPLETED     // Catch: java.lang.Throwable -> L95
            r1.LJ = r0     // Catch: java.lang.Throwable -> L95
            X.1D5x r0 = r8.LLILLL     // Catch: java.lang.Throwable -> L95
            java.util.Set r0 = r0.getLifecycleStages()     // Catch: java.lang.Throwable -> L95
            X.1D5y r4 = r8.LLILLJJLI     // Catch: java.lang.Throwable -> L95
            X.1D5u r3 = r8.LL     // Catch: java.lang.Throwable -> L95
            java.util.Iterator r2 = r0.iterator()     // Catch: java.lang.Throwable -> L95
        L66:
            boolean r0 = r2.hasNext()     // Catch: java.lang.Throwable -> L95
            if (r0 == 0) goto L8f
            java.lang.Object r1 = r2.next()     // Catch: java.lang.Throwable -> L95
            X.1D61 r1 = (X.C1D61) r1     // Catch: java.lang.Throwable -> L95
            java.util.Set<X.1D61> r0 = r4.LIZ     // Catch: java.lang.Throwable -> L95
            boolean r0 = r0.contains(r1)     // Catch: java.lang.Throwable -> L95
            if (r0 == 0) goto L66
            java.util.Map<X.1D61, java.util.concurrent.CountDownLatch> r0 = r3.LJFF     // Catch: java.lang.Throwable -> L95
            java.util.LinkedHashMap r0 = (java.util.LinkedHashMap) r0     // Catch: java.lang.Throwable -> L95
            java.lang.Object r0 = r0.get(r1)     // Catch: java.lang.Throwable -> L95
            java.util.concurrent.CountDownLatch r0 = (java.util.concurrent.CountDownLatch) r0     // Catch: java.lang.Throwable -> L95
            if (r0 == 0) goto L66
            r0.countDown()     // Catch: java.lang.Throwable -> L95
            goto L66
        L8a:
            boolean r0 = r1.LIZJ     // Catch: java.lang.Throwable -> L95
            if (r0 == 0) goto L8f
            goto L52
        L8f:
            X.1D5u r0 = r8.LL     // Catch: java.lang.Throwable -> L95
            r0.LIZJ()     // Catch: java.lang.Throwable -> L95
            goto La2
        L95:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.1D5y r1 = r8.LLILLJJLI
            r1.getClass()
            X.1D3K r0 = X.C1D3K.FAILED
            r1.LJ = r0
        La2:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C2250301D5w.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
