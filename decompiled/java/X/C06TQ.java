package X;

import com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsMyDataManager;

/* JADX INFO: renamed from: X.06TQ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsMyDataManager", f = "StoryHighlightsMyDataManager.kt", l = {440}, m = "closeOnboardingBanner")
public final class C06TQ extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ StoryHighlightsMyDataManager LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06TQ(StoryHighlightsMyDataManager storyHighlightsMyDataManager, InterfaceC1364105Vn<? super C06TQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = storyHighlightsMyDataManager;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryHighlightsMyDataManager@3b8f.closeOnboardingBanner$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJIIZ = this.LLILLJJLI.LJJIIZ(this);
        C1C7U.LIZIZ("StoryHighlightsMyDataManager@3b8f.closeOnboardingBanner$1");
        return objLJJIIZ;
    }
}
