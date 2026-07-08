package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.im.sdk.psp.IMPSPManager;
import com.tiktok.ttm.ttmparam.ITTMParamData;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: renamed from: X.168v, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractC207271168v extends AbstractC830880Wic {
    public volatile InterfaceC830890Wid LIZ;

    public ITTMParamData LIZLLL(Object obj) {
        return null;
    }

    public abstract String LJ();

    @Override // X.AbstractC830880Wic
    public final void LIZ(InterfaceC805220ViK interfaceC805220ViK, InterfaceC830890Wid interfaceC830890Wid) {
        String sceneKey;
        String message;
        String sceneKey2;
        List list;
        Map map;
        String str;
        Map map2;
        String str2;
        String str3;
        Map map3;
        Exception errorMessage = interfaceC805220ViK.getErrorMessage();
        C830490Whz c830490Whz = new C830490Whz();
        if (interfaceC830890Wid != null) {
            sceneKey = interfaceC830890Wid.getSceneKey();
        } else {
            sceneKey = null;
        }
        c830490Whz.put(Scene.SCENE_SERVICE, sceneKey);
        c830490Whz.put("strategy", interfaceC805220ViK.LIZLLL().LIZIZ);
        c830490Whz.put("status_code", interfaceC805220ViK.LIZIZ().name());
        if (errorMessage == null || (message = errorMessage.getMessage()) == null) {
            message = "";
        }
        c830490Whz.put("error_msg", message);
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("im_psp_action_result", c830490Whz);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("actionResult: scene ");
        if (interfaceC830890Wid != null) {
            sceneKey2 = interfaceC830890Wid.getSceneKey();
        } else {
            sceneKey2 = null;
        }
        sbLIZ.append(sceneKey2);
        sbLIZ.append(" strategy ");
        sbLIZ.append(interfaceC805220ViK.LIZLLL().LIZIZ);
        sbLIZ.append(" stateCode ");
        sbLIZ.append(interfaceC805220ViK.LIZIZ().name());
        sbLIZ.append(" errorMsg ");
        sbLIZ.append(interfaceC805220ViK.getErrorMessage());
        sbLIZ.append(" resultValue ");
        sbLIZ.append(interfaceC805220ViK.LIZJ());
        C2188811AlT.LIZIZ(sbLIZ);
        C169O.LIZ();
        if (interfaceC805220ViK.LIZIZ() != EnumC1910390zoT.CelResult) {
            return;
        }
        Object objLIZJ = interfaceC805220ViK.LIZJ();
        ArrayList arrayList = new ArrayList();
        if ((objLIZJ instanceof List) && (list = (List) objLIZJ) != null) {
            for (Object obj : list) {
                if ((obj instanceof Map) && (map = (Map) obj) != null) {
                    Object obj2 = map.get("action_name");
                    if ((obj2 instanceof String) && (str = (String) obj2) != null) {
                        Object obj3 = map.get("params");
                        if ((obj3 instanceof Map) && (map2 = (Map) obj3) != null) {
                            Object obj4 = map.get("next_scene_name");
                            if (obj4 instanceof String) {
                                str2 = (String) obj4;
                            } else {
                                str2 = null;
                            }
                            Object obj5 = map.get("next_strategy_name");
                            if (obj5 instanceof String) {
                                str3 = (String) obj5;
                            } else {
                                str3 = null;
                            }
                            Object obj6 = map.get("next_strategy_params");
                            if (obj6 instanceof Map) {
                                map3 = (Map) obj6;
                            } else {
                                map3 = null;
                            }
                            arrayList.add(new C207274168y(str, str2, str3, map2, map3));
                        }
                    }
                }
            }
            List<C207274168y> list2 = new C207275168z(arrayList).LIZ;
            if (list2 != null) {
                for (C207274168y c207274168y : list2) {
                    IMPSPManager iMPSPManager = IMPSPManager.LIZ;
                    String str4 = c207274168y.LIZ;
                    iMPSPManager.getClass();
                    AbstractC207272168w abstractC207272168w = (AbstractC207272168w) ((ConcurrentHashMap) IMPSPManager.LIZJ).get(str4);
                    if (abstractC207272168w != null) {
                        abstractC207272168w.LIZIZ(c207274168y, interfaceC805220ViK);
                    }
                }
            }
        }
    }

    @Override // X.AbstractC830880Wic
    public void LIZJ(InterfaceC830890Wid interfaceC830890Wid, EnumC2213771Bkd enumC2213771Bkd) {
        String sceneKey;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(LJ());
        sbLIZ.append(": registerSceneResult stateCode ");
        sbLIZ.append(enumC2213771Bkd.name());
        C2188811AlT.LIZIZ(sbLIZ);
        C169O.LIZ();
        this.LIZ = interfaceC830890Wid;
        C830490Whz c830490Whz = new C830490Whz();
        if (interfaceC830890Wid != null) {
            sceneKey = interfaceC830890Wid.getSceneKey();
        } else {
            sceneKey = null;
        }
        c830490Whz.put(Scene.SCENE_SERVICE, sceneKey);
        c830490Whz.put("status_code", enumC2213771Bkd.name());
        C0I0B.LJFF.LIZIZ();
        C20684815ws.LJIILLIIL("im_psp_register_result", c830490Whz);
    }
}
