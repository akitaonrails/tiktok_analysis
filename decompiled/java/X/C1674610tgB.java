package X;

import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM;

/* JADX INFO: renamed from: X.0tgB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM", f = "StoryHighlightsCreationVM.kt", l = {352, 369}, m = "updateCollection")
public final class C1674610tgB extends AbstractC23140094w {
    public Object LL;
    public StoryHighlightCollection LLILLJJLI;
    public int LLILLL;
    public /* synthetic */ Object LLILZ;
    public final /* synthetic */ StoryHighlightsCreationVM LLILZIL;
    public int LLILZLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1674610tgB(StoryHighlightsCreationVM storyHighlightsCreationVM, InterfaceC1364105Vn<? super C1674610tgB> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZIL = storyHighlightsCreationVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("StoryHighlightsCreationVM@6e8.updateCollection$1");
        this.LLILZ = obj;
        this.LLILZLL |= Integer.MIN_VALUE;
        Object objIQ2 = this.LLILZIL.IQ2(null, this);
        C1C7U.LIZIZ("StoryHighlightsCreationVM@6e8.updateCollection$1");
        return objIQ2;
    }
}
