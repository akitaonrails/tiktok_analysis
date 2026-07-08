package X;

import com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.config.ProfileTabRegister;
import com.ss.android.ugc.profile.platform.framework.aweme.profile.tab.profiletab.base.ProfileTabBaseBusiness;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: renamed from: X.0ipg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class C1257660ipg {
    public static final void LIZ(ProfileTabRegister profileTabRegister, int i, int i2, boolean z, String str, boolean z2, ProfileTabBaseBusiness profileTabBaseBusiness) {
        ((ArrayList) profileTabRegister.LIZ).add(new C1257630ipd(i, str, i2, z, z2, profileTabBaseBusiness));
    }

    public static final void LIZJ(ProfileTabRegister profileTabRegister, int i, C1257530ipT c1257530ipT, int i2, boolean z, int i3, ProfileTabBaseBusiness profileTabBaseBusiness) {
        boolean z2;
        Iterator it2 = ((ArrayList) profileTabRegister.LIZ).iterator();
        while (true) {
            if (it2.hasNext()) {
                if (((C1257950iq9) it2.next()).LIZ == i) {
                    z2 = true;
                    break;
                }
            } else {
                z2 = false;
                break;
            }
        }
        ((ArrayList) profileTabRegister.LIZIZ).add(new C1257620ipc(i, c1257530ipT, i2, i3, z, z2, profileTabBaseBusiness));
    }
}
