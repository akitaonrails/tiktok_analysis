package X;

import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse;
import com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsMyDataManager;

/* JADX INFO: renamed from: X.06TK, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsMyDataManager", f = "StoryHighlightsMyDataManager.kt", l = {278, 286}, m = "createCollection")
public final class C06TK extends AbstractC23140094w {
    public StoryHighlightCreateOrUpdateResponse LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ StoryHighlightsMyDataManager LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06TK(StoryHighlightsMyDataManager storyHighlightsMyDataManager, InterfaceC1364105Vn<? super C06TK> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = storyHighlightsMyDataManager;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("StoryHighlightsMyDataManager@3b8f.createCollection$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJIII = this.LLILLL.LJJIII(null, null, null, null, null, null, this);
        C1C7U.LIZIZ("StoryHighlightsMyDataManager@3b8f.createCollection$1");
        return objLJJIII;
    }
}
