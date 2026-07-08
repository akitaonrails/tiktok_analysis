package X;

import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightsAwemeDetailResponse;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05BK, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.im.service.impl.player.StoryIMHelper$enterHighlightStoryPlayer$1$response$1", f = "StoryIMHelper.kt", l = {117}, m = "invokeSuspend")
public final class C05BK extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super StoryHighlightsAwemeDetailResponse>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ String LLILLL;
    public final /* synthetic */ String LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05BK(String str, String str2, InterfaceC1364105Vn<? super C05BK> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = str;
        this.LLILZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05BK c05bk = new C05BK(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c05bk.LLILLJJLI = obj;
        return c05bk;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0063  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r6 = "StoryIMHelper@6be4.enterHighlightStoryPlayer$1$response$1"
            X.C1C7U.LIZ(r6)
            java.lang.Object r5 = X.C099R.LJFF()
            int r0 = r13.LL
            r12 = 0
            r4 = 1
            if (r0 == 0) goto L1a
            if (r0 != r4) goto L12
            goto L48
        L12:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1a:
            X.C155000ia.LIZIZ(r14)
            java.lang.String r3 = r13.LLILLL
            java.lang.String r2 = r13.LLILZ
            java.lang.Class<com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsService> r7 = com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsService.class
            r8 = 0
            r11 = 14
            r9 = r8
            r10 = r8
            java.lang.Object r1 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L51
            com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsService r1 = (com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsService) r1     // Catch: java.lang.Throwable -> L51
            if (r1 == 0) goto L46
            X.05BL r0 = X.C05BL.DM_CARD     // Catch: java.lang.Throwable -> L51
            int r0 = r0.getValue()     // Catch: java.lang.Throwable -> L51
            java.lang.Integer r0 = X.C2286608xc.LJ(r0)     // Catch: java.lang.Throwable -> L51
            r13.LL = r4     // Catch: java.lang.Throwable -> L51
            java.lang.Object r14 = r1.highlightAwemeDetail(r3, r2, r0, r13)     // Catch: java.lang.Throwable -> L51
            if (r14 != r5) goto L4b
            X.C1C7U.LIZIZ(r6)
            return r5
        L46:
            r14 = r12
            goto L4d
        L48:
            X.C155000ia.LIZIZ(r14)     // Catch: java.lang.Throwable -> L51
        L4b:
            com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightsAwemeDetailResponse r14 = (com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightsAwemeDetailResponse) r14     // Catch: java.lang.Throwable -> L51
        L4d:
            X.C189200o6.m2constructorimpl(r14)     // Catch: java.lang.Throwable -> L51
            goto L5d
        L51:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r14 = new X.00Yq
            r14.<init>(r0)
            X.C189200o6.m2constructorimpl(r14)
        L5d:
            boolean r0 = X.C189200o6.m7isFailureimpl(r14)
            if (r0 != 0) goto L64
            r12 = r14
        L64:
            X.C1C7U.LIZIZ(r6)
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05BK.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super StoryHighlightsAwemeDetailResponse> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
