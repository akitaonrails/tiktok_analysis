package X;

import com.ss.android.ugc.aweme.notice.repo.list.bean.BaseNotice;

/* JADX INFO: renamed from: X.0hzT, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.selector.inviteguest.LiveInviteGuestConvSearchDataSourceProtocol", f = "LiveInviteGuestConvSearchDataSourceProtocol.kt", l = {BaseNotice.RECOMMEND_LIVE}, m = "onSearch")
public final class C1225290hzT extends AbstractC23140094w {
    public /* synthetic */ Object LL;
    public final /* synthetic */ C1225300hzU LLILLJJLI;
    public int LLILLL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1225290hzT(C1225300hzU c1225300hzU, InterfaceC1364105Vn<? super C1225290hzT> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLJJLI = c1225300hzU;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveInviteGuestConvSearchDataSourceProtocol@e633.onSearch$1");
        this.LL = obj;
        this.LLILLL |= Integer.MIN_VALUE;
        Object objLJJIIZ = this.LLILLJJLI.LJJIIZ(null, this);
        C1C7U.LIZIZ("LiveInviteGuestConvSearchDataSourceProtocol@e633.onSearch$1");
        return objLJJIIZ;
    }
}
