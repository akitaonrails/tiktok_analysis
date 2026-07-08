package X;

import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightCreateOrUpdateResponse;
import com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsMyDataManager;

/* JADX INFO: renamed from: X.06TL, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.service.StoryHighlightsMyDataManager", f = "StoryHighlightsMyDataManager.kt", l = {364, 370}, m = "addAwemeToCollection")
public final class C06TL extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public StoryHighlightCreateOrUpdateResponse LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ StoryHighlightsMyDataManager LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C06TL(StoryHighlightsMyDataManager storyHighlightsMyDataManager, InterfaceC1364105Vn<? super C06TL> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = storyHighlightsMyDataManager;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("StoryHighlightsMyDataManager@3b8f.addAwemeToCollection$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objLJ = this.LLILZIL.LJ(null, null, this);
        C1C7U.LIZIZ("StoryHighlightsMyDataManager@3b8f.addAwemeToCollection$1");
        return objLJ;
    }
}
