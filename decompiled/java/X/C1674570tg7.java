package X;

import com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightAwemePreview;

/* JADX INFO: renamed from: X.0tg7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationVM", f = "StoryHighlightsCreationVM.kt", l = {505}, m = "unselectItemFromCreationPage")
public final class C1674570tg7 extends AbstractC23140094w {
    public Object LL;
    public StoryHighlightAwemePreview LLILLJJLI;
    public C1674510tg1 LLILLL;
    public C2252321DDq LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ StoryHighlightsCreationVM LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1674570tg7(StoryHighlightsCreationVM storyHighlightsCreationVM, InterfaceC1364105Vn<? super C1674570tg7> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = storyHighlightsCreationVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryHighlightsCreationVM@6e8.unselectItemFromCreationPage$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objHQ2 = this.LLILZLL.HQ2(null, null, this);
        C1C7U.LIZIZ("StoryHighlightsCreationVM@6e8.unselectItemFromCreationPage$1");
        return objHQ2;
    }
}
