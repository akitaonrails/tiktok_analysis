package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.tiktok.security.settings.BostonRouterGatewayModel;
import com.ss.android.ugc.tiktok.security.settings.BostonVirtualRouterModel;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: renamed from: X.19Fk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21508619Fk {
    public static final BostonRouterGatewayModel LIZ = new BostonRouterGatewayModel(false, false, false, null, 0, null, 0, null, null, null, null, null, 4095, null);

    public static final BostonRouterGatewayModel LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        BostonRouterGatewayModel bostonRouterGatewayModel = LIZ;
        BostonRouterGatewayModel bostonRouterGatewayModel2 = (BostonRouterGatewayModel) settingsManagerLIZLLL.LJIIIIZZ("boston_router_gateway", BostonRouterGatewayModel.class, bostonRouterGatewayModel);
        if (bostonRouterGatewayModel2 != null) {
            bostonRouterGatewayModel = bostonRouterGatewayModel2;
        }
        List<BostonVirtualRouterModel> list = bostonRouterGatewayModel.virtualRouters;
        if (list != null) {
            int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(list, 10));
            if (iLIZIZ < 16) {
                iLIZIZ = 16;
            }
            LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
            for (BostonVirtualRouterModel bostonVirtualRouterModel : list) {
                linkedHashMap.put(bostonVirtualRouterModel.name, bostonVirtualRouterModel);
            }
            bostonRouterGatewayModel.LIZ = linkedHashMap;
        }
        return bostonRouterGatewayModel;
    }
}
