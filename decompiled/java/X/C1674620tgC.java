package X;

import com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM;

/* JADX INFO: renamed from: X.0tgC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM", f = "StoryHighlightsCreationVM.kt", l = {284, 299}, m = "createCollection")
public final class C1674620tgC extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ StoryHighlightsCreationVM LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1674620tgC(StoryHighlightsCreationVM storyHighlightsCreationVM, InterfaceC1364105Vn<? super C1674620tgC> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = storyHighlightsCreationVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) throws Throwable {
        C1C7U.LIZ("StoryHighlightsCreationVM@6e8.createCollection$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILLL.vQ2(null, this);
        C1C7U.LIZIZ("StoryHighlightsCreationVM@6e8.createCollection$1");
        return objVQ2;
    }
}
