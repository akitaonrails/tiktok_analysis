package X;

import com.ss.android.ugc.aweme.feed.suggestfollowing.ProfileFollowingSuggestViewModel;

/* JADX INFO: renamed from: X.09iI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@C09DV(c = "com.ss.android.ugc.aweme.feed.suggestfollowing.ProfileFollowingSuggestViewModel", f = "ProfileFollowingSuggestViewModel.kt", l = {155}, m = "hideComponent")
public final class C2446409iI extends AbstractC23140094w {
    public Object LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ProfileFollowingSuggestViewModel LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2446409iI(ProfileFollowingSuggestViewModel profileFollowingSuggestViewModel, InterfaceC1364105Vn<? super C2446409iI> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = profileFollowingSuggestViewModel;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ProfileFollowingSuggestViewModel@1dfb.hideComponent$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objYQ2 = this.LLILLL.yQ2(null, null, this);
        C1C7U.LIZIZ("ProfileFollowingSuggestViewModel@1dfb.hideComponent$1");
        return objYQ2;
    }
}
