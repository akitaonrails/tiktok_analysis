package X;

import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightAwemePreview;

/* JADX INFO: renamed from: X.0tg6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM", f = "StoryHighlightsCreationVM.kt", l = {197, 227}, m = "loadCollectionDetail")
public final class C1674560tg6 extends AbstractC23140094w {
    public Object LL;
    public StoryHighlightCollection LLILLJJLI;
    public StoryHighlightAwemePreview LLILLL;
    public C1674510tg1 LLILZ;
    public EnumC1674300tfg LLILZIL;
    public Object LLILZLL;
    public StoryHighlightCollection.CoverType LLIZ;
    public C2252321DDq LLIZLLLIL;
    public /* synthetic */ Object LLJ;
    public final /* synthetic */ StoryHighlightsCreationVM LLJI;
    public int LLJIJIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1674560tg6(StoryHighlightsCreationVM storyHighlightsCreationVM, InterfaceC1364105Vn<? super C1674560tg6> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLJI = storyHighlightsCreationVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("StoryHighlightsCreationVM@6e8.loadCollectionDetail$1");
        this.LLJ = obj;
        this.LLJIJIL |= Integer.MIN_VALUE;
        Object objBQ2 = this.LLJI.BQ2(null, null, this);
        C1C7U.LIZIZ("StoryHighlightsCreationVM@6e8.loadCollectionDetail$1");
        return objBQ2;
    }
}
