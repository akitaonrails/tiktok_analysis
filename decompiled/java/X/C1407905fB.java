package X;

import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsImmersiveActionServiceImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import njp.a;

/* JADX INFO: renamed from: X.05fB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsImmersiveActionServiceImpl$showStoryHighlightsImmersiveFeedActionSheet$actionSheet$3$2$1", f = "StoryHighlightsImmersiveActionServiceImpl.kt", l = {157, 161}, m = "invokeSuspend")
public final class C1407905fB extends C09AX implements Function2<InterfaceC497601wk, InterfaceC1364105Vn<? super Unit>, Object> {
    public int LL;
    public final /* synthetic */ String LLILLJJLI;
    public final /* synthetic */ Aweme LLILLL;
    public final /* synthetic */ Function1<String, Unit> LLILZ;
    public final /* synthetic */ Fragment LLILZIL;
    public final /* synthetic */ StoryHighlightsImmersiveActionServiceImpl LLILZLL;
    public final /* synthetic */ String LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public C1407905fB(String str, Aweme aweme, Function1<? super String, Unit> function1, Fragment fragment, StoryHighlightsImmersiveActionServiceImpl storyHighlightsImmersiveActionServiceImpl, String str2, InterfaceC1364105Vn<? super C1407905fB> interfaceC1364105Vn) {
        super(2, interfaceC1364105Vn);
        this.LLILLJJLI = str;
        this.LLILLL = aweme;
        this.LLILZ = function1;
        this.LLILZIL = fragment;
        this.LLILZLL = storyHighlightsImmersiveActionServiceImpl;
        this.LLIZ = str2;
    }

    @Override // njp.a
    public final InterfaceC1364105Vn<Unit> create(Object obj, InterfaceC1364105Vn<?> interfaceC1364105Vn) {
        return new C1407905fB(this.LLILLJJLI, this.LLILLL, this.LLILZ, this.LLILZIL, this.LLILZLL, this.LLIZ, interfaceC1364105Vn);
    }

    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    @Override // njp.a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r18) {
        /*
            r17 = this;
            r10 = r18
            java.lang.String r8 = "StoryHighlightsImmersiveActionServiceImpl@27f9.showStoryHighlightsImmersiveFeedActionSheet$actionSheet$3$2$1"
            X.C1C7U.LIZ(r8)
            java.lang.Object r2 = X.C099R.LJFF()
            r3 = r17
            int r0 = r3.LL
            r1 = 2
            r7 = 1
            if (r0 == 0) goto L20
            if (r0 == r7) goto L53
            if (r0 != r1) goto L79
            X.C155000ia.LIZIZ(r10)
        L1a:
            kotlin.Unit r0 = kotlin.Unit.LIZ
            X.C1C7U.LIZIZ(r8)
            return r0
        L20:
            X.C155000ia.LIZIZ(r10)
            java.lang.Class<com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager> r9 = com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager.class
            r10 = 0
            r13 = 14
            r14 = 0
            r11 = r10
            r12 = r10
            java.lang.Object r6 = com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt.pluggableSpi$default(r9, r10, r11, r12, r13, r14)
            com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager r6 = (com.ss.android.ugc.aweme.story.highlights.service.IStoryHighlightsMyDataManager) r6
            if (r6 == 0) goto L51
            java.lang.String r5 = r3.LLILLJJLI
            java.lang.String r4 = ""
            if (r5 != 0) goto L3a
            r5 = r4
        L3a:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.LLILLL
            if (r0 == 0) goto L45
            java.lang.String r0 = r0.getAid()
            if (r0 == 0) goto L45
            r4 = r0
        L45:
            r3.LL = r7
            java.lang.Object r10 = r6.LJFF(r5, r4, r3)
            if (r10 != r2) goto L56
            X.C1C7U.LIZIZ(r8)
            return r2
        L51:
            r10 = 0
            goto L58
        L53:
            X.C155000ia.LIZIZ(r10)
        L56:
            com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse r10 = (com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse) r10
        L58:
            X.1DFH r0 = X.C0PEM.LIZ
            X.08pq r0 = X.C2107308Nj.LIZ
            X.05fC r9 = new X.05fC
            kotlin.jvm.functions.Function1<java.lang.String, kotlin.Unit> r11 = r3.LLILZ
            com.ss.android.ugc.aweme.feed.model.Aweme r12 = r3.LLILLL
            androidx.fragment.app.Fragment r13 = r3.LLILZIL
            com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsImmersiveActionServiceImpl r14 = r3.LLILZLL
            java.lang.String r15 = r3.LLIZ
            r16 = 0
            r9.<init>(r10, r11, r12, r13, r14, r15, r16)
            r3.LL = r1
            java.lang.Object r0 = X.C23250099c.LJI(r3, r0, r9)
            if (r0 != r2) goto L1a
            X.C1C7U.LIZIZ(r8)
            return r2
        L79:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1407905fB.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC497601wk interfaceC497601wk, InterfaceC1364105Vn<? super Unit> interfaceC1364105Vn) {
        return ((a) create(interfaceC497601wk, interfaceC1364105Vn)).invokeSuspend(Unit.LIZ);
    }
}
