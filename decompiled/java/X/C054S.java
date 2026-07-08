package X;

import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.im.frequencycontrol.api.IFrequencyControlService;

/* JADX INFO: renamed from: X.054S, reason: invalid class name */
/* JADX INFO: loaded from: classes3.dex */
public final class C054S implements InterfaceC896150ZDp {
    public static final C054S LL = new C054S();

    @Override // X.InterfaceC896150ZDp
    public final InterfaceC1411705fn LJJJJJ() {
        return ((IFrequencyControlService) ServiceManager.get().getService(IFrequencyControlService.class)).LIZIZ(new C053W(EnumC12931054f.UNIFY_LIKE.getKey(), new C12918053s(null, EnumC12928054c.UID, EnumC1502105uN.LIGHT_INTERACTION, EnumC12929054d.APP, 1), new C12912053m(1), C12915053p.LIZ));
    }

    @Override // X.InterfaceC896150ZDp
    public final String LJJIIJZLJL(String str, String str2) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(str);
        sbLIZ.append('_');
        sbLIZ.append(str2);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
