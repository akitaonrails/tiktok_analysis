package X;

import android.content.Context;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.reflect.TypeToken;
import com.ss.android.ugc.aweme.compliance.api.services.communication.TTKUserCommunicationService;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.pns.usercommunication.api.NetworkUniversalPopupDispatchResponse;
import com.ss.android.ugc.aweme.pns.webcontainer.PNSWebContainerService;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.lang.reflect.Type;
import java.util.Map;
import kotlin.jvm.internal.AwS378S0200000_12;

/* JADX INFO: renamed from: X.0pdQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1519140pdQ implements InterfaceC1524005xu<String> {
    public final C01GW LIZ = C452501pT.LIZIZ(new C1519150pdR());

    @Override // X.InterfaceC1524005xu
    public final String LIZ() {
        return "PopupAPIProcessor";
    }

    @Override // X.InterfaceC1524005xu
    public final void LIZIZ(String str, Integer num, Map map) {
        String str2;
        String str3 = str;
        C1518550pcT c1518550pcTLJI = ((TTKUserCommunicationService) ServiceManager.get().getService(TTKUserCommunicationService.class)).LJI();
        if (str3 != null) {
            Type type = new TypeToken<Map<String, ? extends String>>() { // from class: X.04XY
            }.getType();
            try {
                C1227904rF.LIZ.getClass();
                Map map2 = (Map) C1227904rF.LIZLLL().LJIIIIZZ(str3, type);
                if (map2 != null && (str2 = (String) map2.get(FollowStatusChangeMethod.PARAM_UID)) != null) {
                    C1518550pcT.LIZ(c1518550pcTLJI, str2, new AwS378S0200000_12(this, (C1519140pdQ) map, (Map<String, ? extends Object>) 71));
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void LIZJ(NetworkUniversalPopupDispatchResponse networkUniversalPopupDispatchResponse, Context context, Map<String, ? extends Object> map) {
        Object obj;
        String strLIZIZ = C1519120pdO.LIZIZ(networkUniversalPopupDispatchResponse);
        InterfaceC1519250pdb interfaceC1519250pdb = null;
        if (strLIZIZ != null) {
            PNSWebContainerService pNSWebContainerService = (PNSWebContainerService) PluggableExtentionKt.pluggableSpi$default(PNSWebContainerService.class, false, false, false, 14, null);
            if (pNSWebContainerService != null) {
                pNSWebContainerService.LIZIZ(strLIZIZ, null);
                return;
            }
            return;
        }
        if (this.LIZ.getValue() != null) {
            C1914320zuo c1914320zuo = new C1914320zuo(networkUniversalPopupDispatchResponse, null);
            if (map != null) {
                obj = map.get("popup_provider");
            } else {
                obj = null;
            }
            if (obj instanceof InterfaceC1519250pdb) {
                interfaceC1519250pdb = (InterfaceC1519250pdb) obj;
            }
            C1914170zuZ.LIZJ(c1914320zuo, context, interfaceC1519250pdb);
        }
    }
}
