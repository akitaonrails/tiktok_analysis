package X;

import com.ss.android.ugc.aweme.story.userpanel.vm.StoryUserListViewModel;

/* JADX INFO: renamed from: X.0Cc0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.userpanel.vm.StoryUserListViewModel", f = "StoryUserListViewModel.kt", l = {475}, m = "performMixSearchLoadMore")
public final class C317180Cc0 extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ StoryUserListViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C317180Cc0(StoryUserListViewModel storyUserListViewModel, InterfaceC1364105Vn<? super C317180Cc0> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = storyUserListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryUserListViewModel@f7dd.performMixSearchLoadMore$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objXQ2 = this.LLILLL.xQ2(this);
        C1C7U.LIZIZ("StoryUserListViewModel@f7dd.performMixSearchLoadMore$1");
        return objXQ2;
    }
}
