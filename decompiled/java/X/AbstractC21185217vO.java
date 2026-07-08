package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.ur.psp.api.center.IPSPCenter;
import com.tiktok.strategycenterengine.manager.TTMStrategyCenterManager;
import com.tiktok.ttm.TTMParamData;
import java.util.Map;

/* JADX INFO: renamed from: X.17vO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public abstract class AbstractC21185217vO {
    public abstract void LIZIZ(C21185017vM c21185017vM);

    public static void LIZ(C21185017vM c21185017vM) {
        String str;
        IPSPCenter iPSPCenter;
        InterfaceC830890Wid interfaceC830890WidLIZIZ;
        IPSPCenter iPSPCenter2;
        String str2 = c21185017vM.LIZJ;
        if (str2 != null && str2.length() > 0) {
            Map mapLJIIL = null;
            if (1 != 0 && (str = c21185017vM.LIZLLL) != null && str.length() > 0 && (iPSPCenter = (IPSPCenter) PluggableExtentionKt.pluggableSpi$default(IPSPCenter.class, false, false, false, 14, null)) != null && (interfaceC830890WidLIZIZ = iPSPCenter.LIZIZ(str2)) != null) {
                Map<String, Object> map = c21185017vM.LJ;
                if (map != null) {
                    mapLJIIL = C2097608Jq.LJIIL(map, C2097608Jq.LJ());
                }
                InterfaceC805220ViK interfaceC805220ViKRunScene = TTMStrategyCenterManager.runScene(interfaceC830890WidLIZIZ, str, new TTMParamData((Map<String, Object>) mapLJIIL));
                if (interfaceC805220ViKRunScene != null && (iPSPCenter2 = (IPSPCenter) PluggableExtentionKt.pluggableSpi$default(IPSPCenter.class, false, false, false, 14, null)) != null) {
                    iPSPCenter2.LIZLLL(interfaceC805220ViKRunScene, interfaceC830890WidLIZIZ);
                }
            }
        }
    }
}
