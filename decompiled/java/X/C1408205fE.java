package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsImmersiveActionServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05fE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsImmersiveActionServiceImpl$showStoryHighlightsImmersiveFeedActionSheet$actionSheet$3$1$1", f = "StoryHighlightsImmersiveActionServiceImpl.kt", l = {121, 125}, m = "invokeSuspend")
public final class C1408205fE extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ StoryHighlightsImmersiveActionServiceImpl LLILLL;
    public final /* synthetic */ Fragment LLILZ;
    public final /* synthetic */ Function0<Unit> LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1408205fE(String str, StoryHighlightsImmersiveActionServiceImpl storyHighlightsImmersiveActionServiceImpl, Fragment fragment, Function0<Unit> function0, InterfaceC1364105Vn<? super C1408205fE> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = storyHighlightsImmersiveActionServiceImpl;
        this.LLILZ = fragment;
        this.LLILZIL = function0;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1408205fE(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r13) {
        /*
            r12 = this;
            r7 = r13
            java.lang.String r5 = "StoryHighlightsImmersiveActionServiceImpl@27f9.showStoryHighlightsImmersiveFeedActionSheet$actionSheet$3$1$1"
            X.C1C7U.LIZ(r5)
            java.lang.Object r1 = X.C099R.LJFF()
            int r0 = r12.LL
            r2 = 2
            r4 = 1
            if (r0 == 0) goto L1d
            if (r0 == r4) goto L44
            if (r0 != r2) goto L65
            X.C155000ia.LIZIZ(r7)
        L17:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r5)
            return r0
        L1d:
            X.C155000ia.LIZIZ(r7)
            java.lang.Class<com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager> r6 = com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager.class
            r7 = 0
            r10 = 14
            r11 = 0
            r8 = r7
            r9 = r7
            java.lang.Object r3 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r6, r7, r8, r9, r10, r11)
            com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager r3 = (com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager) r3
            if (r3 == 0) goto L42
            java.lang.String r0 = r12.LLILLJJLI
            if (r0 != 0) goto L36
            java.lang.String r0 = ""
        L36:
            r12.LL = r4
            java.lang.Object r7 = r3.LJJIJLIJ(r0, r12)
            if (r7 != r1) goto L47
            X.C1C7U.LIZIZ(r5)
            return r1
        L42:
            r7 = 0
            goto L49
        L44:
            X.C155000ia.LIZIZ(r7)
        L47:
            com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightDeleteResponse r7 = (com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightDeleteResponse) r7
        L49:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.05fF r6 = new X.05fF
            com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsImmersiveActionServiceImpl r8 = r12.LLILLL
            androidx.fragment.app.Fragment r9 = r12.LLILZ
            kotlin.jvm.functions.Function0<kotlin.Unit> r10 = r12.LLILZIL
            r11 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            r12.LL = r2
            java.lang.Object r0 = X.C23250099c.LJI(r12, r0, r6)
            if (r0 != r1) goto L17
            X.C1C7U.LIZIZ(r5)
            return r1
        L65:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1408205fE.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
