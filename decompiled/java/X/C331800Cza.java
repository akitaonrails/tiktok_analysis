package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0Cza, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.commercialize.ucp.impl.ui.components.recommend.RecommendSlotResolver$resolve$2$1$1", f = "RecommendSlotResolver.kt", l = {76, 43, 63}, m = "invokeSuspend")
public final class C331800Cza extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public InterfaceC1337805Lk LL;
    public Object LLILLJJLI;
    public Function2 LLILLL;
    public UcpRecommendationItem LLILZ;
    public Function2 LLILZIL;
    public int LLILZLL;
    public int LLIZ;
    public final /* synthetic */ InterfaceC1337805Lk LLIZLLLIL;
    public final /* synthetic */ List<AbstractC331870Czh> LLJ;
    public final /* synthetic */ int LLJI;
    public final /* synthetic */ Function2<List<? extends AbstractC331870Czh>, InterfaceC1364105Vn<? super Unit>, Object> LLJIJIL;
    public final /* synthetic */ UcpRecommendationItem LLJILJIL;
    public final /* synthetic */ Function2<UcpRecommendationItem, InterfaceC1364105Vn<? super C189200o6<UcpRecommendationItem>>, Object> LLJILJILJ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C331800Cza(InterfaceC1337805Lk interfaceC1337805Lk, List<AbstractC331870Czh> list, int i, Function2<? super List<? extends AbstractC331870Czh>, ? super InterfaceC1364105Vn<? super Unit>, ? extends Object> function2, UcpRecommendationItem ucpRecommendationItem, Function2<? super UcpRecommendationItem, ? super InterfaceC1364105Vn<? super C189200o6<UcpRecommendationItem>>, ? extends Object> function22, InterfaceC1364105Vn<? super C331800Cza> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLIZLLLIL = interfaceC1337805Lk;
        this.LLJ = list;
        this.LLJI = i;
        this.LLJIJIL = function2;
        this.LLJILJIL = ucpRecommendationItem;
        this.LLJILJILJ = function22;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C331800Cza(this.LLIZLLLIL, this.LLJ, this.LLJI, this.LLJIJIL, this.LLJILJIL, this.LLJILJILJ, interfaceC1364105Vn);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a3  */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [X.05Lk] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v5, types: [X.05Lk] */
    /* JADX WARN: Type inference failed for: r1v6, types: [X.05Lk] */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Throwable {
        /*
            r13 = this;
            java.lang.String r6 = "RecommendSlotResolver@e1d2.resolve$2$1$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r4 = X.C099R.LJFF()
            int r1 = r13.LLIZ
            r5 = 3
            r3 = 2
            r0 = 1
            r12 = 0
            if (r1 == 0) goto L43
            if (r1 == r0) goto L31
            if (r1 == r3) goto L26
            if (r1 != r5) goto L1e
            X.05Lk r1 = r13.LL
            X.C155000ia.LIZIZ(r14)     // Catch: java.lang.Throwable -> Lb5
            goto La7
        L1e:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L26:
            int r9 = r13.LLILZLL
            kotlin.jvm.functions.Function2 r2 = r13.LLILLL
            java.lang.Object r10 = r13.LLILLJJLI
            java.util.List r10 = (java.util.List) r10
            X.05Lk r1 = r13.LL
            goto L89
        L31:
            int r9 = r13.LLILZLL
            kotlin.jvm.functions.Function2 r11 = r13.LLILZIL
            com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem r8 = r13.LLILZ
            kotlin.jvm.functions.Function2 r2 = r13.LLILLL
            java.lang.Object r10 = r13.LLILLJJLI
            java.util.List r10 = (java.util.List) r10
            X.05Lk r1 = r13.LL
            X.C155000ia.LIZIZ(r14)
            goto L6a
        L43:
            X.C155000ia.LIZIZ(r14)
            X.05Lk r1 = r13.LLIZLLLIL
            java.util.List<X.0Czh> r10 = r13.LLJ
            int r9 = r13.LLJI
            kotlin.jvm.functions.Function2<java.util.List<? extends X.0Czh>, X.05Vn<? super kotlin.Unit>, java.lang.Object> r2 = r13.LLJIJIL
            com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem r8 = r13.LLJILJIL
            kotlin.jvm.functions.Function2<com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem, X.05Vn<? super X.00o6<com.ss.android.ugc.aweme.commercialize.ucp.impl.data.recommend.model.UcpRecommendationItem>>, java.lang.Object> r11 = r13.LLJILJILJ
            r13.LL = r1
            r13.LLILLJJLI = r10
            r13.LLILLL = r2
            r13.LLILZ = r8
            r13.LLILZIL = r11
            r13.LLILZLL = r9
            r13.LLIZ = r0
            java.lang.Object r0 = r1.LIZ(r13)
            if (r0 != r4) goto L6a
            X.C1C7U.LIZIZ(r6)
            return r4
        L6a:
            X.1DFB r0 = X.C0PEM.LIZJ     // Catch: java.lang.Throwable -> Lb0
            X.0CzZ r7 = new X.0CzZ     // Catch: java.lang.Throwable -> Lb0
            r7.<init>(r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> Lb0
            r13.LL = r1     // Catch: java.lang.Throwable -> Lb0
            r13.LLILLJJLI = r10     // Catch: java.lang.Throwable -> Lb0
            r13.LLILLL = r2     // Catch: java.lang.Throwable -> Lb0
            r13.LLILZ = r12     // Catch: java.lang.Throwable -> Lb0
            r13.LLILZIL = r12     // Catch: java.lang.Throwable -> Lb0
            r13.LLILZLL = r9     // Catch: java.lang.Throwable -> Lb0
            r13.LLIZ = r3     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r14 = X.C23250099c.LJI(r13, r0, r7)     // Catch: java.lang.Throwable -> Lb0
            if (r14 != r4) goto L8c
            X.C1C7U.LIZIZ(r6)
            return r4
        L89:
            X.C155000ia.LIZIZ(r14)     // Catch: java.lang.Throwable -> Lb0
        L8c:
            X.0Czh r14 = (X.AbstractC331870Czh) r14     // Catch: java.lang.Throwable -> Lb0
            r10.set(r9, r14)     // Catch: java.lang.Throwable -> Lb0
            java.util.List r0 = X.C13LP.LLIIII(r10)     // Catch: java.lang.Throwable -> Lb0
            r13.LL = r1     // Catch: java.lang.Throwable -> Lb0
            r13.LLILLJJLI = r12     // Catch: java.lang.Throwable -> Lb0
            r13.LLILLL = r12     // Catch: java.lang.Throwable -> Lb0
            r13.LLIZ = r5     // Catch: java.lang.Throwable -> Lb0
            java.lang.Object r0 = r2.invoke(r0, r13)     // Catch: java.lang.Throwable -> Lb0
            if (r0 != r4) goto La7
            X.C1C7U.LIZIZ(r6)
            return r4
        La7:
            r1.release()
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        Lb0:
            r0 = move-exception
        Lb1:
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)     // Catch: java.lang.Throwable -> Lb5
            goto Lb7
        Lb5:
            r0 = move-exception
            goto Lb1
        Lb7:
            r1.release()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C331800Cza.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
