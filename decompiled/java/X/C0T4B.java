package X;

import android.app.Activity;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelAuthEdmAndSmsGuideV3;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelsAuthPushAddNewScenes;
import com.ss.android.ugc.aweme.unifiedauthapi.experiment.ChannelsAuthRefactorExp;
import com.ss.android.ugc.aweme.unifiedauthapi.model.NewUserFilters;
import com.ss.android.ugc.aweme.unifiedauthapi.model.PopupInstanceConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.model.UnifiedAuthPopupConfig;
import com.ss.android.ugc.aweme.unifiedauthapi.push.IUniAuthGuidePopupApi;
import com.ss.android.ugc.awemepushapi.IPushPermissionApi;
import java.util.List;

/* JADX INFO: renamed from: X.0T4B, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0T4B {
    public static final C0T4B LIZ = new C0T4B();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C0T4C());
    public static int LIZJ;
    public static volatile boolean LIZLLL;

    public static final void LIZ(Activity activity) {
        PopupInstanceConfig popupInstanceConfig;
        if (LIZLLL) {
            return;
        }
        LIZJ++;
        int i = C2187451AjH.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[FypVVMonitor]vvCountIncrement(");
        sbLIZ.append(LIZJ);
        sbLIZ.append('/');
        LIZ.getClass();
        C01GW c01gw = LIZIZ;
        sbLIZ.append(((Number) c01gw.getValue()).intValue());
        sbLIZ.append(')');
        C2188811AlT.LIZIZ(sbLIZ);
        int i2 = 0;
        if (LIZJ == ((Number) c01gw.getValue()).intValue()) {
            if (!ChannelsAuthRefactorExp.INSTANCE.enabled() && !ChannelAuthEdmAndSmsGuideV3.INSTANCE.enabled()) {
                ((IPushPermissionApi) ServiceManager.get().getService(IPushPermissionApi.class)).LJIIJ(activity, "feed_vv_enough", new InterfaceC1914010zuJ() { // from class: X.0T4D
                    @Override // X.InterfaceC1914010zuJ
                    public final void LIZ() {
                        int i3 = C2187451AjH.LIZ;
                    }

                    @Override // X.InterfaceC1914010zuJ
                    public final void LIZIZ() {
                        int i3 = C2187451AjH.LIZ;
                    }
                });
            } else {
                UnifiedAuthPopupConfig unifiedAuthPopupConfigLIZJ = ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZJ("feed_vv_enough");
                unifiedAuthPopupConfigLIZJ.setSceneId("feed_vv_enough");
                unifiedAuthPopupConfigLIZJ.setSysPage("feed_vv_enough");
                C19EG c19egLIZIZ = C1388190mED.LIZIZ(activity);
                if (c19egLIZIZ != null) {
                    String strLJ = ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LJ(c19egLIZIZ);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("TabName: ");
                    sbLIZ2.append(strLJ);
                    C2188811AlT.LIZIZ(sbLIZ2);
                    C211000rc.LIZ("[Push]");
                    unifiedAuthPopupConfigLIZJ.setSubSceneId(strLJ);
                }
                unifiedAuthPopupConfigLIZJ.setEnterFrom("homepage_hot");
                List<PopupInstanceConfig> list = unifiedAuthPopupConfigLIZJ.popupInstances;
                if (list != null && (!list.isEmpty()) && (popupInstanceConfig = (PopupInstanceConfig) ListProtector.get(list, 0)) != null) {
                    if (!ChannelsAuthPushAddNewScenes.INSTANCE.add16VV()) {
                        i2 = 2;
                    }
                    popupInstanceConfig.setPopupCombinationType(i2);
                    popupInstanceConfig.popupFiltersConfig.setNewUserFilter(new NewUserFilters(7.0d, 0.0d));
                }
                ((IUniAuthGuidePopupApi) ServiceManager.get().getService(IUniAuthGuidePopupApi.class)).LIZLLL(activity, null, unifiedAuthPopupConfigLIZJ);
            }
        }
        if (LIZJ >= ((Number) c01gw.getValue()).intValue()) {
            LIZLLL = true;
        }
    }
}
