package X;

import com.ss.android.ugc.aweme.story.archive.StoryArchListViewModel;

/* JADX INFO: renamed from: X.0Sfv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.archive.StoryArchListViewModel", f = "StoryArchListViewModel.kt", l = {43}, m = "fetchStoryList")
public final class C727290Sfv extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ StoryArchListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C727290Sfv(StoryArchListViewModel storyArchListViewModel, InterfaceC1364105Vn<? super C727290Sfv> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = storyArchListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryArchListViewModel@1e63.fetchStoryList$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objBQ2 = this.LLILLJJLI.BQ2(0L, this);
        C1C7U.LIZIZ("StoryArchListViewModel@1e63.fetchStoryList$1");
        return objBQ2;
    }
}
