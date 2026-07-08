package X;

import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse;
import com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsMyDataManager;

/* JADX INFO: renamed from: X.06TI, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsMyDataManager", f = "StoryHighlightsMyDataManager.kt", l = {317, 328}, m = "updateCollection")
public final class C06TI extends AbstractC23140094w {
    public StoryHighlightCollection LL;
    public StoryHighlightCreateOrUpdateResponse LLILLJJLI;
    public StoryHighlightCreateOrUpdateResponse LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ StoryHighlightsMyDataManager LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06TI(StoryHighlightsMyDataManager storyHighlightsMyDataManager, InterfaceC1364105Vn<? super C06TI> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = storyHighlightsMyDataManager;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryHighlightsMyDataManager@3b8f.updateCollection$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJIJ = this.LLILZIL.LJIJ(null, null, null, null, null, null, null, null, this);
        C1C7U.LIZIZ("StoryHighlightsMyDataManager@3b8f.updateCollection$1");
        return objLJIJ;
    }
}
