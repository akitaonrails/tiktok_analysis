package X;

import com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsMyDataManager;

/* JADX INFO: renamed from: X.06TP, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsMyDataManager", f = "StoryHighlightsMyDataManager.kt", l = {181}, m = "cacheCollections")
public final class C06TP extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ StoryHighlightsMyDataManager LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06TP(StoryHighlightsMyDataManager storyHighlightsMyDataManager, InterfaceC1364105Vn<? super C06TP> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = storyHighlightsMyDataManager;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryHighlightsMyDataManager@3b8f.cacheCollections$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJIJ = this.LLILLL.LJJIJ(null, this);
        C1C7U.LIZIZ("StoryHighlightsMyDataManager@3b8f.cacheCollections$1");
        return objLJJIJ;
    }
}
