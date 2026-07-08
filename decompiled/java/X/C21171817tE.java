package X;

import com.ss.android.ugc.aweme.fangroup.invite.FanGroupInviteListProviderImpl;

/* JADX INFO: renamed from: X.17tE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.fangroup.invite.FanGroupInviteListProviderImpl", f = "FanGroupInviteListProviderImpl.kt", l = {37}, m = "fetchInviteGroupList")
public final class C21171817tE extends AbstractC23140094w {
    public long LL;
    public long LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ FanGroupInviteListProviderImpl LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21171817tE(FanGroupInviteListProviderImpl fanGroupInviteListProviderImpl, InterfaceC1364105Vn<? super C21171817tE> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = fanGroupInviteListProviderImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("FanGroupInviteListProviderImpl@fa9b.fetchInviteGroupList$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLIZ = this.LLILZ.LIZ(0L, 0L, this);
        C1C7U.LIZIZ("FanGroupInviteListProviderImpl@fa9b.fetchInviteGroupList$1");
        return objLIZ;
    }
}
