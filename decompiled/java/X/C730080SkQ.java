package X;

import com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryViewerListViewModel;

/* JADX INFO: renamed from: X.0SkQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.feed.immersive.gallery.StoryViewerListViewModel", f = "StoryViewerListViewModel.kt", l = {283}, m = "fetchViewerList")
public final class C730080SkQ extends AbstractC23140094w {
    public long LL;
    public InterfaceC330550CxZ LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ StoryViewerListViewModel LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C730080SkQ(StoryViewerListViewModel storyViewerListViewModel, InterfaceC1364105Vn<? super C730080SkQ> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = storyViewerListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryViewerListViewModel@bfb5.fetchViewerList$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objVQ2 = this.LLILZ.vQ2(0L, 0L, this);
        C1C7U.LIZIZ("StoryViewerListViewModel@bfb5.fetchViewerList$1");
        return objVQ2;
    }
}
