package X;

import com.ss.android.ugc.aweme.story.group.GroupChatWithStoryShareViewModel;

/* JADX INFO: renamed from: X.0Sjj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
@C09DV(c = "com.ss.android.ugc.aweme.story.group.GroupChatWithStoryShareViewModel", f = "GroupChatWithStoryShareViewModel.kt", l = {105}, m = "onRefresh")
public final class C729650Sjj extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ GroupChatWithStoryShareViewModel LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C729650Sjj(GroupChatWithStoryShareViewModel groupChatWithStoryShareViewModel, InterfaceC1364105Vn<? super C729650Sjj> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = groupChatWithStoryShareViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("GroupChatWithStoryShareViewModel@b696.onRefresh$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objOnRefresh = this.LLILLJJLI.onRefresh(this);
        C1C7U.LIZIZ("GroupChatWithStoryShareViewModel@b696.onRefresh$1");
        return objOnRefresh;
    }
}
