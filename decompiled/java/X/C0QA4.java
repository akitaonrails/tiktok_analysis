package X;

import com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock;
import com.ss.android.ugc.aweme.search.pages.result.topsearch.visualinspiration.vm.SearchVisualInspirationSharedVM;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.0QA4, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
@C09DV(c = "com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.communicate.GetSearchReviewAggregationShareDataMethodIDL$handle$4$2", f = "GetSearchReviewAggregationShareDataMethodIDL.kt", l = {200}, m = "invokeSuspend")
public final class C0QA4 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ AnonymousClass0957<C0QA6> LLILLL;
    public final /* synthetic */ C665840Q9u LLILZ;
    public final /* synthetic */ CompletionBlock<InterfaceC665890Q9z> LLILZIL;
    public final /* synthetic */ SearchVisualInspirationSharedVM LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0QA4(AnonymousClass0957<C0QA6> anonymousClass0957, C665840Q9u c665840Q9u, CompletionBlock<InterfaceC665890Q9z> completionBlock, SearchVisualInspirationSharedVM searchVisualInspirationSharedVM, InterfaceC1364105Vn<? super C0QA4> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = anonymousClass0957;
        this.LLILZ = c665840Q9u;
        this.LLILZIL = completionBlock;
        this.LLILZLL = searchVisualInspirationSharedVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C0QA4 c0qa4 = new C0QA4(this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, interfaceC1364105Vn);
        c0qa4.LLILLJJLI = obj;
        return c0qa4;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008c  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r11) {
        /*
            r10 = this;
            java.lang.String r9 = "GetSearchReviewAggregationShareDataMethodIDL@6af1.handle$4$2"
            X.C1C7U.LIZ(r9)
            java.lang.Object r2 = X.C099R.LJFF()
            int r0 = r10.LL
            r6 = 1
            r5 = 0
            if (r0 == 0) goto L8e
            if (r0 != r6) goto La9
            X.C155000ia.LIZIZ(r11)
        L14:
            X.0QA6 r11 = (X.C0QA6) r11
            if (r11 == 0) goto La6
            com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchLoadMoreV2Response r0 = r11.LIZ
            if (r0 == 0) goto La6
            com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.SearchLoadMoreDataStruct r0 = r0.data
            if (r0 == 0) goto La6
            com.ss.android.ugc.aweme.search.pages.result.topsearch.reviewaggregation.repo.ImageLoadMoreData r7 = r0.imageLoadMoreData
        L22:
            r3 = 0
            if (r7 == 0) goto L77
            java.util.List<? extends java.util.Map<?, ?>> r8 = r7.validImageListRawData
            if (r8 == 0) goto L77
            boolean r0 = r8.isEmpty()
            r0 = r0 ^ 1
            if (r0 == 0) goto L77
            X.0Q9u r0 = r10.LLILZ
            com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock<X.0Q9z> r4 = r10.LLILZIL
            com.ss.android.ugc.aweme.search.pages.result.topsearch.visualinspiration.vm.SearchVisualInspirationSharedVM r2 = r10.LLILZLL
            java.lang.Class<X.0Q9z> r1 = X.InterfaceC665890Q9z.class
            X.0OvC r0 = r0.IBridgeSdkContext
            if (r0 == 0) goto L41
            java.lang.String r5 = r0.getContainerID()
        L41:
            com.bytedance.sdk.xbridge.registry.core.model.idl.XBaseModel r1 = X.C1909107dp.LIZJ(r1, r5)
            X.0Q9z r1 = (X.InterfaceC665890Q9z) r1
            java.lang.Integer r0 = X.C2286608xc.LJ(r3)
            r1.setStatusCode(r0)
            r1.setItems(r8)
            boolean r0 = X.C301510Brp.LIZ()
            if (r0 == 0) goto L5c
            java.lang.Integer r0 = r7.cursor
            r1.setCursor(r0)
        L5c:
            boolean r0 = r2.LJIIJJI()
            if (r0 == 0) goto L72
            java.lang.Integer r0 = X.C2286608xc.LJ(r6)
        L66:
            r1.setHasMore(r0)
            X.C2382909Vj.LIZIZ(r4, r1)
        L6c:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r9)
            return r0
        L72:
            java.lang.Integer r0 = X.C2286608xc.LJ(r3)
            goto L66
        L77:
            com.bytedance.sdk.xbridge.registry.core.model.idl.CompletionBlock<X.0Q9z> r2 = r10.LLILZIL
            if (r11 == 0) goto L8c
            java.lang.Exception r0 = r11.LIZIZ
            if (r0 == 0) goto L8c
            java.lang.String r0 = r0.getMessage()
        L83:
            java.lang.String r1 = java.lang.String.valueOf(r0)
            r0 = 4
            X.C2382909Vj.LIZ(r2, r3, r1, r5, r0)
            goto L6c
        L8c:
            r0 = r5
            goto L83
        L8e:
            X.C155000ia.LIZIZ(r11)
            java.lang.Object r1 = r10.LLILLJJLI
            X.0957<X.0QA6> r0 = r10.LLILLL
            if (r0 == 0) goto La5
            r10.LLILLJJLI = r1
            r10.LL = r6
            java.lang.Object r11 = r0.LJLIIIL(r10)
            if (r11 != r2) goto L14
            X.C1C7U.LIZIZ(r9)
            return r2
        La5:
            r11 = r5
        La6:
            r7 = r5
            goto L22
        La9:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0QA4.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
