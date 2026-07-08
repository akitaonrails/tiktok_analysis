package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0ONJ, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0ONJ implements InterfaceC736910SvR<C0OIU> {
    public final C01GW LL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1754));
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1753));
    public final C01GW LLILLL = C452501pT.LIZIZ(new AwS553S0100000_9(this, 1755));
    public final C0ONH LLILZ = new C0ONH(this);

    @Override // X.InterfaceC736910SvR
    public final void release() {
    }

    public static final Keva LIZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("BulletinBoardCreateDataRepository");
        sbLIZ.append(((IUserService) ServiceManager.get().getService(IUserService.class)).getCurrentUser().getUid());
        return Keva.getRepo(C2188811AlT.LIZIZ(sbLIZ));
    }

    @Override // X.InterfaceC736910SvR
    public final InterfaceC149400hg getOperator() {
        return this.LLILZ;
    }
}
