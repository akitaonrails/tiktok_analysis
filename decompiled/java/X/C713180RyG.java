package X;

import com.ss.android.ugc.aweme.story.feed.guidecard.viewmodel.StoryGuideCardShareViewModel;

/* JADX INFO: renamed from: X.0RyG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.guidecard.viewmodel.StoryGuideCardShareViewModel", f = "StoryGuideCardShareViewModel.kt", l = {244}, m = "onLoadMore")
public final class C713180RyG extends AbstractC23140094w {
    public C013C LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ StoryGuideCardShareViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C713180RyG(StoryGuideCardShareViewModel storyGuideCardShareViewModel, InterfaceC1364105Vn<? super C713180RyG> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = storyGuideCardShareViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryGuideCardShareViewModel@79d.onLoadMore$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objOnLoadMore = this.LLILLL.onLoadMore(null, this);
        C1C7U.LIZIZ("StoryGuideCardShareViewModel@79d.onLoadMore$1");
        return objOnLoadMore;
    }
}
