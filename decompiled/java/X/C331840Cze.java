package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cze, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.components.waterfall.WaterfallProgressiveSlotResolver$resolve$2$1$1", f = "WaterfallProgressiveSlotResolver.kt", l = {199, 60, 71}, m = "invokeSuspend")
public final class C331840Cze extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC1337805Lk LL;
    public C095E LLILLJJLI;
    public Function2 LLILLL;
    public UcpRecommendationItem LLILZ;
    public int LLILZIL;
    public int LLILZLL;
    public final /* synthetic */ InterfaceC1337805Lk LLIZ;
    public final /* synthetic */ C095E<C331850Czf> LLIZLLLIL;
    public final /* synthetic */ Function2<UcpRecommendationItem, InterfaceC1364105Vn<? super C189200o6<UcpRecommendationItem>>, Object> LLJ;
    public final /* synthetic */ UcpRecommendationItem LLJI;
    public final /* synthetic */ int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C331840Cze(InterfaceC1337805Lk interfaceC1337805Lk, C095E<C331850Czf> c095e, Function2<? super UcpRecommendationItem, ? super InterfaceC1364105Vn<? super C189200o6<UcpRecommendationItem>>, ? extends Object> function2, UcpRecommendationItem ucpRecommendationItem, int i, InterfaceC1364105Vn<? super C331840Cze> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZ = interfaceC1337805Lk;
        this.LLIZLLLIL = c095e;
        this.LLJ = function2;
        this.LLJI = ucpRecommendationItem;
        this.LLJIJIL = i;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C331840Cze(this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x008c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) throws java.lang.Throwable {
        /*
            r12 = this;
            java.lang.String r11 = "WaterfallProgressiveSlotResolver@5c7c.resolve$2$1$1"
            X.C1C7U.LIZ(r11)
            java.lang.Object r9 = X.C099R.LJFF()
            int r1 = r12.LLILZLL
            r10 = 3
            r8 = 2
            r0 = 1
            r7 = 0
            if (r1 == 0) goto L38
            if (r1 == r0) goto L2a
            if (r1 == r8) goto L25
            if (r1 != r10) goto L1d
            X.05Lk r5 = r12.LL
            X.C155000ia.LIZIZ(r13)     // Catch: java.lang.Throwable -> La0
            goto L90
        L1d:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L25:
            X.095E r4 = r12.LLILLJJLI
            X.05Lk r5 = r12.LL
            goto L76
        L2a:
            int r2 = r12.LLILZIL
            com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem r3 = r12.LLILZ
            kotlin.jvm.functions.Function2 r6 = r12.LLILLL
            X.095E r4 = r12.LLILLJJLI
            X.05Lk r5 = r12.LL
            X.C155000ia.LIZIZ(r13)
            goto L5b
        L38:
            X.C155000ia.LIZIZ(r13)
            X.05Lk r5 = r12.LLIZ
            X.095E<X.0Czf> r4 = r12.LLIZLLLIL
            kotlin.jvm.functions.Function2<com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem, X.05Vn<? super X.00o6<com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem>>, java.lang.Object> r6 = r12.LLJ
            com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem r3 = r12.LLJI
            int r2 = r12.LLJIJIL
            r12.LL = r5
            r12.LLILLJJLI = r4
            r12.LLILLL = r6
            r12.LLILZ = r3
            r12.LLILZIL = r2
            r12.LLILZLL = r0
            java.lang.Object r0 = r5.LIZ(r12)
            if (r0 != r9) goto L5b
            X.C1C7U.LIZIZ(r11)
            return r9
        L5b:
            X.1DFB r1 = X.C0PEM.LIZJ     // Catch: java.lang.Throwable -> L9b
            X.0Czd r0 = new X.0Czd     // Catch: java.lang.Throwable -> L9b
            r0.<init>(r6, r3, r2, r7)     // Catch: java.lang.Throwable -> L9b
            r12.LL = r5     // Catch: java.lang.Throwable -> L9b
            r12.LLILLJJLI = r4     // Catch: java.lang.Throwable -> L9b
            r12.LLILLL = r7     // Catch: java.lang.Throwable -> L9b
            r12.LLILZ = r7     // Catch: java.lang.Throwable -> L9b
            r12.LLILZLL = r8     // Catch: java.lang.Throwable -> L9b
            java.lang.Object r13 = X.C23250099c.LJI(r12, r1, r0)     // Catch: java.lang.Throwable -> L9b
            if (r13 != r9) goto L79
            X.C1C7U.LIZIZ(r11)
            return r9
        L76:
            X.C155000ia.LIZIZ(r13)     // Catch: java.lang.Throwable -> L99
        L79:
            X.0D0F r13 = (X.C0D0F) r13     // Catch: java.lang.Throwable -> L99
            X.0Czf r0 = new X.0Czf     // Catch: java.lang.Throwable -> L99
            r0.<init>(r13)     // Catch: java.lang.Throwable -> L99
            r12.LL = r5     // Catch: java.lang.Throwable -> L99
            r12.LLILLJJLI = r7     // Catch: java.lang.Throwable -> L99
            r12.LLILZLL = r10     // Catch: java.lang.Throwable -> L99
            java.lang.Object r0 = r4.LJIJI(r0, r12)     // Catch: java.lang.Throwable -> L99
            if (r0 != r9) goto L90
            X.C1C7U.LIZIZ(r11)
            return r9
        L90:
            r5.release()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r11)
            return r0
        L99:
            r0 = move-exception
            goto L9c
        L9b:
            r0 = move-exception
        L9c:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> La0
            goto La2
        La0:
            r0 = move-exception
            goto L9c
        La2:
            r5.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C331840Cze.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
