package X;

import com.bytedance.bpea.basics.Cert;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.tiktok.location_api.service.Config;
import com.ss.android.ugc.tiktok.location_api.service.PopupSceneV2;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0hWW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1207340hWW {
    public static final C1207340hWW LIZ = new C1207340hWW();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(new C1207460hWi());

    public static Config[] LIZJ() {
        try {
            return (Config[]) SettingsManager.LIZLLL().LJIIIIZZ("location_popup_config", Config[].class, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public static List LIZ() {
        String str;
        ArrayList arrayList = new ArrayList();
        Config[] configArrLIZJ = LIZJ();
        if (configArrLIZJ != null) {
            for (Config config : configArrLIZJ) {
                List<PopupSceneV2> list = config.popupSceneV2;
                if (list != null) {
                    Iterator<PopupSceneV2> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        if (Intrinsics.LJFF(it2.next().scene, "fyp")) {
                            LIZ.getClass();
                            if (!LJIILIIL(config) && (str = config.business) != null) {
                                arrayList.add(str);
                            }
                        }
                    }
                }
            }
        }
        return arrayList;
    }

    public static C1207210hWJ LIZLLL() {
        return (C1207210hWJ) LIZIZ.getValue();
    }

    public static List LJFF() {
        List<PopupSceneV2> list;
        Config configLIZIZ = LIZIZ("poi");
        ArrayList arrayList = new ArrayList();
        if (configLIZIZ != null && (list = configLIZIZ.popupSceneV2) != null) {
            Iterator<PopupSceneV2> it2 = list.iterator();
            while (it2.hasNext()) {
                String str = it2.next().scene;
                if (str != null) {
                    arrayList.add(str);
                }
            }
        }
        return arrayList;
    }

    public static boolean LJIIJJI() {
        if (!C291220BbE.LIZ()) {
            return LJIIL();
        }
        boolean zLJIILLIIL = LIZLLL().LJIILLIIL();
        LIZLLL().LIZJ("", "", "isScenesEmpty", zLJIILLIIL, LJIIL());
        return zLJIILLIIL;
    }

    public static boolean LJIIL() {
        Config[] configArrLIZJ = LIZJ();
        if (configArrLIZJ == null) {
            return true;
        }
        boolean z = true;
        for (Config config : configArrLIZJ) {
            if (config.popupSceneV2 != null && (!r0.isEmpty())) {
                LIZ.getClass();
                if (!LJIILIIL(config)) {
                    z = false;
                }
            }
        }
        return z;
    }

    public static Config LIZIZ(String str) {
        Config[] configArrLIZJ = LIZJ();
        if (configArrLIZJ != null) {
            for (Config config : configArrLIZJ) {
                if (Intrinsics.LJFF(config.business, str)) {
                    LIZ.getClass();
                    if (!LJIILIIL(config)) {
                        return config;
                    }
                }
            }
            return null;
        }
        return null;
    }

    public static boolean LJIIIZ(Cert cert) {
        return LIZLLL().LJIIL(cert);
    }

    public static boolean LJIIJ(Cert cert) {
        return LIZLLL().LJIILIIL(cert);
    }

    public static boolean LJIILIIL(Config config) {
        System.currentTimeMillis();
        String str = config.regionSource;
        if (str != null) {
            if (Intrinsics.LJFF(str, "did")) {
                return ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin();
            }
            if (!((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().isLogin()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static String LJ(String str, String str2) {
        List<PopupSceneV2> list;
        PopupSceneV2 popupSceneV2LIZ;
        Config configLIZIZ = LIZIZ(str);
        if (configLIZIZ != null && (list = configLIZIZ.popupSceneV2) != null && (popupSceneV2LIZ = C1207350hWX.LIZ(str2, list)) != null) {
            return popupSceneV2LIZ.popupText;
        }
        return null;
    }

    @InterfaceC1294060jmO
    public static boolean LJI(String str, String str2) {
        if (C291220BbE.LIZ()) {
            boolean zLJIIIZ = LIZLLL().LJIIIZ(str, str2);
            LIZLLL().LIZJ(str, str2, "isEnabled", LJIIIIZZ(str, str2), zLJIIIZ);
            return zLJIIIZ;
        }
        return LJIIIIZZ(str, str2);
    }

    public static boolean LJII(String str, String str2) {
        List<PopupSceneV2> list;
        PopupSceneV2 popupSceneV2LIZ;
        PopupSceneV2 popupSceneV2LIZ2;
        Config configLIZIZ = LIZIZ(str);
        if (configLIZIZ == null) {
            return false;
        }
        LIZ.getClass();
        if (LJIILIIL(configLIZIZ)) {
            return false;
        }
        List<PopupSceneV2> list2 = configLIZIZ.popupSceneV2;
        if ((list2 == null || (popupSceneV2LIZ2 = C1207350hWX.LIZ(str2, list2)) == null || popupSceneV2LIZ2.showPreInstruction != 1) && ((list = configLIZIZ.popupSceneV2) == null || (popupSceneV2LIZ = C1207350hWX.LIZ(str2, list)) == null || popupSceneV2LIZ.popupUIType != EnumC1153630g7t.PRE.getType())) {
            return false;
        }
        return true;
    }

    public static boolean LJIIIIZZ(String str, String str2) {
        List<PopupSceneV2> list;
        Config configLIZIZ = LIZIZ(str);
        if (configLIZIZ == null || (list = configLIZIZ.popupSceneV2) == null) {
            return false;
        }
        Iterator<PopupSceneV2> it2 = list.iterator();
        while (it2.hasNext()) {
            if (Intrinsics.LJFF(it2.next().scene, str2)) {
                LIZ.getClass();
                if (LJIILIIL(configLIZIZ)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
}
