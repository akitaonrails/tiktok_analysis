package X;

import com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsMyDataManager;

/* JADX INFO: renamed from: X.06TO, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsMyDataManager", f = "StoryHighlightsMyDataManager.kt", l = {419, 424}, m = "reorderCollections")
public final class C06TO extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ StoryHighlightsMyDataManager LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06TO(StoryHighlightsMyDataManager storyHighlightsMyDataManager, InterfaceC1364105Vn<? super C06TO> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = storyHighlightsMyDataManager;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("StoryHighlightsMyDataManager@3b8f.reorderCollections$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJIILJJIL = this.LLILZ.LJIILJJIL(null, null, this);
        C1C7U.LIZIZ("StoryHighlightsMyDataManager@3b8f.reorderCollections$1");
        return objLJIILJJIL;
    }
}
