package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryViewerListViewModel;

/* JADX INFO: renamed from: X.0SkP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryViewerListViewModel", f = "StoryViewerListViewModel.kt", l = {215}, m = "handleViewerList")
public final class C730070SkP extends AbstractC23140094w {
    public long LL;
    public InterfaceC330550CxZ LLILLJJLI;
    public Aweme LLILLL;
    public InterfaceC330550CxZ LLILZ;
    public /* synthetic */ Object LLILZIL;
    public final /* synthetic */ StoryViewerListViewModel LLILZLL;
    public int LLIZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C730070SkP(StoryViewerListViewModel storyViewerListViewModel, InterfaceC1364105Vn<? super C730070SkP> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZLL = storyViewerListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryViewerListViewModel@bfb5.handleViewerList$1");
        this.LLILZIL = obj;
        this.LLIZ |= Integer.MIN_VALUE;
        Object objYQ2 = this.LLILZLL.yQ2(0L, null, null, this);
        C1C7U.LIZIZ("StoryViewerListViewModel@bfb5.handleViewerList$1");
        return objYQ2;
    }
}
