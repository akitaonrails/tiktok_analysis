package X;

import com.ss.android.ugc.aweme.aigc.invite.IMServiceImpl;

/* JADX INFO: renamed from: X.18gz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
@C09DV(c = "com.ss.android.ugc.aweme.aigc.invite.IMServiceImpl", f = "IMServiceImpl.kt", l = {339}, m = "getInviteTemplateByPeerUid")
public final class C21350718gz extends AbstractC23140094w {
    public Object LL;
    public Object LLILLJJLI;
    public /* synthetic */ Object LLILLL;
    public final /* synthetic */ IMServiceImpl LLILZ;
    public int LLILZIL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21350718gz(IMServiceImpl iMServiceImpl, InterfaceC1364105Vn<? super C21350718gz> interfaceC1364105Vn) {
        super(interfaceC1364105Vn);
        this.LLILZ = iMServiceImpl;
    }

    @Override // njp.a
    public final Object invokeSuspend(Object obj) {
        C1C7U.LIZ("IMServiceImpl@7354.getInviteTemplateByPeerUid$1");
        this.LLILLL = obj;
        this.LLILZIL |= Integer.MIN_VALUE;
        Object objLJI = this.LLILZ.LJI(null, null, null, this);
        C1C7U.LIZIZ("IMServiceImpl@7354.getInviteTemplateByPeerUid$1");
        return objLJI;
    }
}
