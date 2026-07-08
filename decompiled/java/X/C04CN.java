package X;

import com.ss.android.ugc.aweme.ecommerce.base.pdp.sea.container.di.GroupManager;
import kotlin.jvm.internal.AwS545S0100000_1;

/* JADX INFO: renamed from: X.04CN, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C04CN extends C04EF {
    public final C01GW LLILZIL;
    public C04CP LLILZLL;

    public final void LJIIJ() {
        this.LLILLL = true;
        C04CP c04cp = this.LLILZLL;
        if (c04cp != null) {
            c04cp.LJIIJ();
        }
    }

    public C04CN(InterfaceC665370Q7z interfaceC665370Q7z, C04FM c04fm) {
        C04CP c04cp;
        super(interfaceC665370Q7z, c04fm);
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(new AwS545S0100000_1(interfaceC665370Q7z, 1531));
        this.LLILZIL = c01gwLIZIZ;
        GroupManager groupManager = (GroupManager) c01gwLIZIZ.getValue();
        if (groupManager != null) {
            String str = c04fm.LJIIIZ;
            c04cp = groupManager.LLILLJJLI.get(str);
            if (c04cp == null) {
                groupManager.LLILLJJLI.remove(str);
            }
        } else {
            c04cp = null;
        }
        this.LLILZLL = c04cp;
    }
}
