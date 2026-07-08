package X;

import com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.libra.FeedEcCardEnhancedPreloadConfig;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0daD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
@C09DV(c = "com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.manager.FeedEcCardInitManager$doEnhancedGeckoPreload$1$1", f = "FeedEcCardInitManager.kt", l = {449}, m = "invokeSuspend")
public final class C1055870daD extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ long LLILLJJLI;
    public final /* synthetic */ FeedEcCardEnhancedPreloadConfig.EnhancedPreloadConfig LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1055870daD(long j, FeedEcCardEnhancedPreloadConfig.EnhancedPreloadConfig enhancedPreloadConfig, InterfaceC1364105Vn<? super C1055870daD> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = j;
        this.LLILLL = enhancedPreloadConfig;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1055870daD(this.LLILLJJLI, this.LLILLL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0040 A[Catch: all -> 0x0074, TryCatch #0 {all -> 0x0074, blocks: (B:13:0x0030, B:23:0x0049, B:25:0x005d, B:22:0x0040), top: B:36:0x0030 }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x003f A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x001d A[SYNTHETIC] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.String r6 = "FeedEcCardInitManager@4a87.doEnhancedGeckoPreload$1$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r7.LL
            r2 = 1
            if (r0 == 0) goto L79
            if (r0 != r2) goto L96
            X.C155000ia.LIZIZ(r8)
        L13:
            com.ss.android.ugc.aweme.ecommerce.ug.feedeccard.libra.FeedEcCardEnhancedPreloadConfig$EnhancedPreloadConfig r0 = r7.LLILLL
            java.util.List<java.lang.String> r0 = r0.preloadList
            if (r0 == 0) goto L8a
            java.util.Iterator r5 = r0.iterator()
        L1d:
            boolean r0 = r5.hasNext()
            if (r0 == 0) goto L8a
            java.lang.Object r1 = r5.next()
            java.lang.String r1 = (java.lang.String) r1
            X.0daG r0 = X.C1055900daG.LIZ
            r0.getClass()
            if (r1 == 0) goto L37
            boolean r0 = kotlin.text.a0.LJJJIL(r1)     // Catch: java.lang.Throwable -> L74
            if (r0 != 0) goto L37
            goto L39
        L37:
            r0 = 1
            goto L3a
        L39:
            r0 = 0
        L3a:
            if (r0 == 0) goto L40
            r0 = 1
        L3d:
            if (r0 != 0) goto L1d
            goto L49
        L40:
            java.lang.String r0 = X.C1553670qX7.LIZ()     // Catch: java.lang.Throwable -> L74
            boolean r0 = X.C1550600qSA.LIZ(r0, r1)     // Catch: java.lang.Throwable -> L74
            goto L3d
        L49:
            com.bytedance.geckox.OptionCheckUpdateParams r4 = new com.bytedance.geckox.OptionCheckUpdateParams     // Catch: java.lang.Throwable -> L74
            r4.<init>()     // Catch: java.lang.Throwable -> L74
            java.lang.String r3 = X.C1553670qX7.LIZ()     // Catch: java.lang.Throwable -> L74
            X.0q6J r0 = X.C1537050q6J.LIZ     // Catch: java.lang.Throwable -> L74
            r0.getClass()     // Catch: java.lang.Throwable -> L74
            X.0qUL r2 = X.C1537050q6J.LIZ(r3)     // Catch: java.lang.Throwable -> L74
            if (r2 == 0) goto L1d
            com.bytedance.geckox.model.CheckRequestBodyModel$TargetChannel r0 = new com.bytedance.geckox.model.CheckRequestBodyModel$TargetChannel     // Catch: java.lang.Throwable -> L74
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L74
            java.util.List r1 = java.util.Collections.singletonList(r0)     // Catch: java.lang.Throwable -> L74
            kotlin.Pair r0 = new kotlin.Pair     // Catch: java.lang.Throwable -> L74
            r0.<init>(r3, r1)     // Catch: java.lang.Throwable -> L74
            java.util.Map r1 = X.C2097908Jt.LIZJ(r0)     // Catch: java.lang.Throwable -> L74
            r0 = 0
            r2.LIZ(r0, r1, r4)     // Catch: java.lang.Throwable -> L74
            goto L1d
        L74:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            goto L1d
        L79:
            X.C155000ia.LIZIZ(r8)
            long r0 = r7.LLILLJJLI
            r7.LL = r2
            java.lang.Object r0 = X.AnonymousClass0958.LIZIZ(r0, r7)
            if (r0 != r3) goto L13
            X.C1C7U.LIZIZ(r6)
            return r3
        L8a:
            int r0 = X.C1055900daG.LJ
            int r0 = r0 + 1
            X.C1055900daG.LJ = r0
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        L96:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1055870daD.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
