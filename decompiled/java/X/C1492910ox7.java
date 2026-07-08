package X;

import com.bytedance.common.utility.Logger;
import com.bytedance.frameworks.baselib.network.http.cronet.ICronetAppProvider;
import com.bytedance.ttnet.tnc.TNCManager;
import m14.l;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0ox7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1492910ox7 implements InterfaceC1492920ox8 {
    public final /* synthetic */ ICronetAppProvider LIZ;

    public C1492910ox7(ICronetAppProvider iCronetAppProvider) {
        this.LIZ = iCronetAppProvider;
    }

    public static final boolean LIZ(String str, JSONObject jSONObject, String str2, boolean z) {
        boolean zLIZ;
        C1490200osk c1490200osk;
        TNCManager tNCManagerLJI = TNCManager.LJI();
        tNCManagerLJI.getClass();
        Logger.debug();
        if (jSONObject != null && (c1490200osk = tNCManagerLJI.LJIILIIL) != null) {
            c1490200osk.LIZLLL = "";
            l.LJ().LJIIJJI = "";
            zLIZ = tNCManagerLJI.LJIILIIL.LIZ(jSONObject, EnumC1492690owl.TTSERVER, str, System.currentTimeMillis());
            if (zLIZ) {
                C1493240oxe.LJI().LJIIIIZZ();
            }
        } else {
            zLIZ = false;
        }
        if (!z || zLIZ) {
            return false;
        }
        tNCManagerLJI.LJ(EnumC1492690owl.TTREGION, true);
        return true;
    }
}
