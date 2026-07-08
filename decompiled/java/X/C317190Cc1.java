package X;

import com.ss.android.ugc.aweme.story.userpanel.vm.StoryUserListViewModel;

/* JADX INFO: renamed from: X.0Cc1, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.userpanel.vm.StoryUserListViewModel", f = "StoryUserListViewModel.kt", l = {387}, m = "performMixSearchRefresh")
public final class C317190Cc1 extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ StoryUserListViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C317190Cc1(StoryUserListViewModel storyUserListViewModel, InterfaceC1364105Vn<? super C317190Cc1> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = storyUserListViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("StoryUserListViewModel@f7dd.performMixSearchRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objYQ2 = this.LLILLJJLI.yQ2(this);
        C1C7U.LIZIZ("StoryUserListViewModel@f7dd.performMixSearchRefresh$1");
        return objYQ2;
    }
}
