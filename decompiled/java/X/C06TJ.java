package X;

import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse;
import com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsMyDataManager;

/* JADX INFO: renamed from: X.06TJ, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsMyDataManager", f = "StoryHighlightsMyDataManager.kt", l = {383, 389}, m = "removeAwemeFromCollection")
public final class C06TJ extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public StoryHighlightCreateOrUpdateResponse LLILLL;
    public StoryHighlightCreateOrUpdateResponse LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ StoryHighlightsMyDataManager LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06TJ(StoryHighlightsMyDataManager storyHighlightsMyDataManager, InterfaceC1364105Vn<? super C06TJ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = storyHighlightsMyDataManager;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("StoryHighlightsMyDataManager@3b8f.removeAwemeFromCollection$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJFF = this.LLILZLL.LJFF(null, null, this);
        C1C7U.LIZIZ("StoryHighlightsMyDataManager@3b8f.removeAwemeFromCollection$1");
        return objLJFF;
    }
}
