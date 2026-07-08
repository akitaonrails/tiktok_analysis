package X;

import com.ss.android.ugc.profile.business.story.highlights.StoryHighlightsOtherProfileVM;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05N5, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.story.highlights.StoryHighlightsOtherProfileVM$tryRequestCache$2", f = "StoryHighlightsOtherProfileVM.kt", l = {59}, m = "invokeSuspend")
public final class C05N5 extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ List<String> LLILLL;
    public final /* synthetic */ StoryHighlightsOtherProfileVM LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C05N5(List<String> list, StoryHighlightsOtherProfileVM storyHighlightsOtherProfileVM, InterfaceC1364105Vn<? super C05N5> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLL = list;
        this.LLILZ = storyHighlightsOtherProfileVM;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        C05N5 c05n5 = new C05N5(this.LLILLL, this.LLILZ, interfaceC1364105Vn);
        c05n5.LLILLJJLI = obj;
        return c05n5;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.String r6 = "StoryHighlightsOtherProfileVM@6f17.tryRequestCache$2"
            X.C1C7U.LIZ(r6)
            java.lang.Object r3 = X.C099R.LJFF()
            int r0 = r13.LL
            r2 = 1
            r5 = 0
            if (r0 == 0) goto L1a
            if (r0 != r2) goto L12
            goto L49
        L12:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        L1a:
            X.C155000ia.LIZIZ(r14)
            com.ss.android.ugc.aweme.utils.GsonProvider r0 = X.C05N6.LIZ()
            com.google.gson.Gson r1 = r0.getGson()
            java.util.List<java.lang.String> r0 = r13.LLILLL
            java.lang.String r1 = com.bytedance.mt.protector.impl.GsonProtectorUtils.toJson(r1, r0)
            java.lang.Class<com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsService> r7 = com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsService.class
            r8 = 0
            r11 = 14
            r12 = 0
            r9 = r8
            r10 = r8
            java.lang.Object r0 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Throwable -> L52
            com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsService r0 = (com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsService) r0     // Catch: java.lang.Throwable -> L52
            if (r0 == 0) goto L47
            r13.LL = r2     // Catch: java.lang.Throwable -> L52
            java.lang.Object r14 = r0.LIZJ(r1, r13)     // Catch: java.lang.Throwable -> L52
            if (r14 != r3) goto L4c
            X.C1C7U.LIZIZ(r6)
            return r3
        L47:
            r14 = r5
            goto L4e
        L49:
            X.C155000ia.LIZIZ(r14)     // Catch: java.lang.Throwable -> L52
        L4c:
            com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightsCollectionCacheResponse r14 = (com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightsCollectionCacheResponse) r14     // Catch: java.lang.Throwable -> L52
        L4e:
            X.C189200o6.m2constructorimpl(r14)     // Catch: java.lang.Throwable -> L52
            goto L5e
        L52:
            r0 = move-exception
            com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker.doCheck(r0)
            X.00Yq r14 = new X.00Yq
            r14.<init>(r0)
            X.C189200o6.m2constructorimpl(r14)
        L5e:
            boolean r0 = X.C189200o6.m7isFailureimpl(r14)
            if (r0 == 0) goto L65
            r14 = r5
        L65:
            com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightsCollectionCacheResponse r14 = (com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightsCollectionCacheResponse) r14
            com.ss.android.ugc.profile.business.story.highlights.StoryHighlightsOtherProfileVM r0 = r13.LLILZ
            X.01wk r4 = androidx.lifecycle.ViewModelKt.getViewModelScope(r0)
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r3 = X.C2107308Nj.LIZ
            X.05N7 r2 = new X.05N7
            com.ss.android.ugc.profile.business.story.highlights.StoryHighlightsOtherProfileVM r1 = r13.LLILZ
            java.util.List<java.lang.String> r0 = r13.LLILLL
            r2.<init>(r1, r14, r0, r5)
            r0 = 2
            X.C23250099c.LIZLLL(r4, r3, r5, r2, r0)
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r6)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C05N5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
