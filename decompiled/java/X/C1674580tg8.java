package X;

import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM;

/* JADX INFO: renamed from: X.0tg8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM", f = "StoryHighlightsCreationVM.kt", l = {119, 121}, m = "initLoadCollectionDetail")
public final class C1674580tg8 extends AbstractC23140094w {
    public Object LL;
    public StoryHighlightCollection LLILLJJLI;
    public C2252321DDq LLILLL;
    public C1674510tg1 LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ StoryHighlightsCreationVM LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1674580tg8(StoryHighlightsCreationVM storyHighlightsCreationVM, InterfaceC1364105Vn<? super C1674580tg8> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = storyHighlightsCreationVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryHighlightsCreationVM@6e8.initLoadCollectionDetail$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objYQ2 = this.LLILZLL.yQ2(null, null, this);
        C1C7U.LIZIZ("StoryHighlightsCreationVM@6e8.initLoadCollectionDetail$1");
        return objYQ2;
    }
}
