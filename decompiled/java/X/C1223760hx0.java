package X;

import com.ss.android.ugc.aweme.publicgroup.data.model.GroupInviteListResponse;

/* JADX INFO: renamed from: X.0hx0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
@C09DV(c = "com.ss.android.ugc.aweme.selector.invitepeople.LiveInviteCTDSProtocol", f = "LiveInviteCTDSProtocol.kt", l = {155, 158}, m = "fetchGroupInviteList")
public final class C1223760hx0 extends AbstractC23140094w {
    public GroupInviteListResponse LL;
    public /* synthetic */ Object LLILLJJLI;
    public final /* synthetic */ C1227470i2z LLILLL;
    public int LLILZ;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1223760hx0(C1227470i2z c1227470i2z, InterfaceC1364105Vn<? super C1223760hx0> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILLL = c1227470i2z;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("LiveInviteCTDSProtocol@84a8.fetchGroupInviteList$1");
        this.LLILLJJLI = obj;
        this.LLILZ |= Integer.MIN_VALUE;
        Object objLJJJJIZL = this.LLILLL.LJJJJIZL(0, this);
        C1C7U.LIZIZ("LiveInviteCTDSProtocol@84a8.fetchGroupInviteList$1");
        return objLJJJJIZL;
    }
}
