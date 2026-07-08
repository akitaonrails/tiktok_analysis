package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.visualinspiration.vm.SearchVisualInspirationSharedVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QA5, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.communicate.GetSearchReviewAggregationShareDataMethodIDL$handle$4$1", f = "GetSearchReviewAggregationShareDataMethodIDL.kt", l = {155}, m = "invokeSuspend")
public final class C0QA5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AnonymousClass0957<C0QA6> LLILLL;
    public final /* synthetic */ C665840Q9u LLILZ;
    public final /* synthetic */ CompletionBlock<InterfaceC665890Q9z> LLILZIL;
    public final /* synthetic */ SearchVisualInspirationSharedVM LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0QA5(AnonymousClass0957<C0QA6> anonymousClass0957, C665840Q9u c665840Q9u, CompletionBlock<InterfaceC665890Q9z> completionBlock, SearchVisualInspirationSharedVM searchVisualInspirationSharedVM, InterfaceC1364105Vn<? super C0QA5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = anonymousClass0957;
        this.LLILZ = c665840Q9u;
        this.LLILZIL = completionBlock;
        this.LLILZLL = searchVisualInspirationSharedVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0QA5 c0qa5 = new C0QA5(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c0qa5.LLILLJJLI = obj;
        return c0qa5;
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0086  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "GetSearchReviewAggregationShareDataMethodIDL@6af1.handle$4$1"
            X.C1C7U.LIZ(r9)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r10.LL
            r6 = 1
            r5 = 0
            if (r0 == 0) goto L88
            if (r0 != r6) goto La2
            X.C155000ia.LIZIZ(r11)
        L14:
            X.0QA6 r11 = (X.C0QA6) r11
            if (r11 == 0) goto La0
            com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchLoadMoreV2Response r0 = r11.LIZ
            if (r0 == 0) goto La0
            com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchLoadMoreDataStruct r0 = r0.data
            if (r0 == 0) goto La0
            com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.ImageLoadMoreData r8 = r0.imageLoadMoreData
        L22:
            r4 = 0
            if (r8 == 0) goto L71
            java.util.List<? extends java.util.Map<?, ?>> r7 = r8.validImageListRawData
            if (r7 == 0) goto L71
            boolean r0 = r7.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L71
            X.0Q9u r0 = r10.LLILZ
            com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock<X.0Q9z> r3 = r10.LLILZIL
            com.ss.android.ugc.aweme.search.pages.result.topsearch.visualinspiration.vm.SearchVisualInspirationSharedVM r2 = r10.LLILZLL
            java.lang.Class<X.0Q9z> r1 = X.InterfaceC665890Q9z.class
            X.0OvC r0 = r0.IBridgeSdkContext
            if (r0 == 0) goto L41
            java.lang.String r5 = r0.getContainerID()
        L41:
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel r1 = X.C1909107dp.LIZJ(r1, r5)
            X.0Q9z r1 = (X.InterfaceC665890Q9z) r1
            java.lang.Integer r0 = X.C2286608xc.LJ(r4)
            r1.setStatusCode(r0)
            r1.setItems(r7)
            java.lang.Integer r0 = r8.cursor
            r1.setCursor(r0)
            boolean r0 = r2.LJIIJJI()
            if (r0 == 0) goto L6c
            java.lang.Integer r0 = X.C2286608xc.LJ(r6)
        L60:
            r1.setHasMore(r0)
            X.C2382909Vj.LIZIZ(r3, r1)
        L66:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L6c:
            java.lang.Integer r0 = X.C2286608xc.LJ(r4)
            goto L60
        L71:
            com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock<X.0Q9z> r2 = r10.LLILZIL
            if (r11 == 0) goto L86
            java.lang.Exception r0 = r11.LIZIZ
            if (r0 == 0) goto L86
            java.lang.String r0 = r0.getMessage()
        L7d:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 4
            X.C2382909Vj.LIZ(r2, r4, r1, r5, r0)
            goto L66
        L86:
            r0 = r5
            goto L7d
        L88:
            X.C155000ia.LIZIZ(r11)
            java.lang.Object r1 = r10.LLILLJJLI
            X.0957<X.0QA6> r0 = r10.LLILLL
            if (r0 == 0) goto L9f
            r10.LLILLJJLI = r1
            r10.LL = r6
            java.lang.Object r11 = r0.LJLIIIL(r10)
            if (r11 != r2) goto L14
            X.C1C7U.LIZIZ(r9)
            return r2
        L9f:
            r11 = r5
        La0:
            r8 = r5
            goto L22
        La2:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QA5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
