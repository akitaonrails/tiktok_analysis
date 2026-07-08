package X;

import com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsService;

/* JADX INFO: renamed from: X.06TX, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsService", f = "StoryHighlightsService.kt", l = {124}, m = "cacheCollections")
public final class C06TX extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ StoryHighlightsService LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06TX(StoryHighlightsService storyHighlightsService, InterfaceC1364105Vn<? super C06TX> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = storyHighlightsService;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryHighlightsService@b112.cacheCollections$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLIZJ = this.LLILLJJLI.LIZJ(null, this);
        C1C7U.LIZIZ("StoryHighlightsService@b112.cacheCollections$1");
        return objLIZJ;
    }
}
