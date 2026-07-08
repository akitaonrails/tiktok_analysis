package X;

import com.ss.android.ugc.aweme.feed.model.story.highlights.StoryHighlightCollection;
import com.ss.android.ugc.aweme.story.highlights.model.StoryHighlightAwemePreview;

/* JADX INFO: renamed from: X.0tg3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.highlights.creation.StoryHighlightsCreationNavigator", f = "StoryHighlightsCreationNavigator.kt", l = {51}, m = "previewToCreationForNew")
public final class C1674530tg3 extends AbstractC23140094w {
    public InterfaceC332260D0u LL;
    public Object LLILLJJLI;
    public StoryHighlightAwemePreview LLILLL;
    public StoryHighlightCollection.CoverType LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ C1674480tfy LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1674530tg3(C1674480tfy c1674480tfy, InterfaceC1364105Vn<? super C1674530tg3> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = c1674480tfy;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryHighlightsCreationNavigator@4ee8.previewToCreationForNew$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objLJ = this.LLILZLL.LJ(null, this);
        C1C7U.LIZIZ("StoryHighlightsCreationNavigator@4ee8.previewToCreationForNew$1");
        return objLJ;
    }
}
