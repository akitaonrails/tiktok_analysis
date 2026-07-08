package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushMessage;
import com.ss.android.ugc.aweme.innerpush.api.model.InnerPushUITemplate;

/* JADX INFO: renamed from: X.0LBy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C539000LBy implements InterfaceC19330810jy {
    public final int[] LL = {2382};
    public final C01GW LLILLJJLI = C452501pT.LIZIZ(new C538850LBj());

    @Override // X.InterfaceC19330810jy
    public final boolean LIZ(int i, InnerPushMessage innerPushMessage) {
        return false;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LIZLLL(InnerPushMessage innerPushMessage) {
        return false;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJFF(InnerPushMessage innerPushMessage) {
        return true;
    }

    @Override // X.InterfaceC19330810jy
    public final C20663815tU LJIIIZ(C20663515tR c20663515tR, InnerPushMessage innerPushMessage) {
        return null;
    }

    @Override // X.InterfaceC19330810jy
    public final int[] LIZJ() {
        return this.LL;
    }

    @Override // X.InterfaceC19330810jy
    public final boolean LJI(InnerPushMessage innerPushMessage) {
        String str;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "arch_preload_download_enabled", true, false) && innerPushMessage != null) {
            try {
                InnerPushUITemplate uiTemplate = innerPushMessage.getUiTemplate();
                if (uiTemplate != null && (str = uiTemplate.globalSchemaUrl) != null) {
                    C0LZK c0lzkLIZIZ = C0LEC.LIZIZ(UriProtector.parse(str));
                    if (c0lzkLIZIZ != null) {
                        C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C539010LBz(this, c0lzkLIZIZ, null), 3);
                        return true;
                    }
                }
            } catch (NullPointerException e) {
                TryCatchGuardChecker.doCheck(e);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("shouldAcceptMessage, parsePushMessage null,");
                sbLIZ.append(innerPushMessage);
                C201955140j.LJIIIIZZ(C0LC1.LIZIZ, "AIGCOfflinePushManager", C2188811AlT.LIZIZ(sbLIZ));
            }
        }
        return true;
    }
}
