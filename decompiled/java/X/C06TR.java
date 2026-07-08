package X;

import com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsMyDataManager;

/* JADX INFO: renamed from: X.06TR, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsMyDataManager", f = "StoryHighlightsMyDataManager.kt", l = {348}, m = "getCollectionsForAweme")
public final class C06TR extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ StoryHighlightsMyDataManager LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06TR(StoryHighlightsMyDataManager storyHighlightsMyDataManager, InterfaceC1364105Vn<? super C06TR> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = storyHighlightsMyDataManager;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryHighlightsMyDataManager@3b8f.getCollectionsForAweme$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJIJJLI = this.LLILLJJLI.LJIJJLI(null, this);
        C1C7U.LIZIZ("StoryHighlightsMyDataManager@3b8f.getCollectionsForAweme$1");
        return objLJIJJLI;
    }
}
