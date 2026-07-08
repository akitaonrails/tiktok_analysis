package X;

import com.ss.android.ugc.profile.business.ur.following.ui.managefollow.ManageFollowCursor;
import com.ss.android.ugc.profile.business.ur.following.ui.managefollow.ManageFollowVM;

/* JADX INFO: renamed from: X.15jS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
@C09DV(c = "com.ss.android.ugc.profile.business.ur.following.ui.managefollow.ManageFollowVM", f = "ManageFollowVM.kt", l = {183}, m = "onLoadMore")
public final class C20601615jS extends AbstractC23140094w {
    public ManageFollowCursor LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ ManageFollowVM LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20601615jS(ManageFollowVM manageFollowVM, InterfaceC1364105Vn<? super C20601615jS> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = manageFollowVM;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("ManageFollowVM@5a85.onLoadMore$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objWQ2 = this.LLILLL.onLoadMore(null, this);
        C1C7U.LIZIZ("ManageFollowVM@5a85.onLoadMore$1");
        return objWQ2;
    }
}
