package X;

import com.ss.android.ugc.aweme.story.userpanel.vm.StoryUserListViewModel;

/* JADX INFO: renamed from: X.0Cbz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.userpanel.vm.StoryUserListViewModel", f = "StoryUserListViewModel.kt", l = {183, 193}, m = "onRefresh")
public final class C317170Cbz extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ StoryUserListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C317170Cbz(StoryUserListViewModel storyUserListViewModel, InterfaceC1364105Vn<? super C317170Cbz> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = storyUserListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryUserListViewModel@f7dd.onRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLJJLI.onRefresh(this);
        C1C7U.LIZIZ("StoryUserListViewModel@f7dd.onRefresh$1");
        return objOnRefresh;
    }
}
