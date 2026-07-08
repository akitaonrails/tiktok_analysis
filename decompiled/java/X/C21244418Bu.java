package X;

import com.bytedance.android.bcm.api.model.BcmParams;
import com.bytedance.android.bcm.impl.model.BcmPageInfo;
import com.bytedance.android.btm.api.util.LazyKt;
import com.bytedance.android.btm.api.util.LazyNonNull;
import com.bytedance.android.btm.impl.BtmServiceImpl;
import com.bytedance.android.btm.impl.page.model.PageInfo;
import com.bytedance.android.btm.impl.setting.FeatureModel;
import com.bytedance.scene.Scene;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;
import ttpobfuscated.e3;

/* JADX INFO: renamed from: X.18Bu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21244418Bu {
    public static final C21244418Bu LIZ;
    public static final /* synthetic */ InterfaceC2217461Bqa<Object>[] LIZIZ;
    public static final LazyNonNull LIZJ;

    static {
        C2217381BqS c2217381BqS = new C2217381BqS(C21244418Bu.class, "appenderList", "getAppenderList()Ljava/util/concurrent/CopyOnWriteArrayList;", 0);
        C13LE.LIZ.getClass();
        LIZIZ = new InterfaceC2217461Bqa[]{c2217381BqS};
        LIZ = new C21244418Bu();
        LIZJ = LazyKt.INSTANCE.lazyNonNull(new C18BO());
    }

    public static void LIZJ(JSONObject jSONObject, Map map) throws JSONException {
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            jSONObject.putOpt((String) entry.getKey(), entry.getValue());
        }
    }

    public final void LIZ(String str, JSONObject jSONObject) throws JSONException {
        if (jSONObject.has("btm_id")) {
            String strOptString = jSONObject.optString("btm_id");
            jSONObject.remove("btm_id");
            if (strOptString.length() == 0) {
                LIZLLL(jSONObject, str);
                return;
            }
            if (a0.LJJLIIIJILLIZJL(strOptString, new String[]{e3.d}, 0, 6).size() < 5) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("BtmEventParamFiller fillJSON, ");
                sbLIZ.append(str);
                sbLIZ.append(" btm_id is ");
                sbLIZ.append(strOptString);
                C18CE.LIZ.LJFF(1124, C2188811AlT.LIZIZ(sbLIZ), null, null, false);
            }
            LIZJ(jSONObject, LIZIZ(this, strOptString, 0, str, null, null, 24));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:112:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x0246  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x021e A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:128:0x01f6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:130:0x01dd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01af  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01b5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZLLL(org.json.JSONObject r12, java.lang.String r13) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 628
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C21244418Bu.LIZLLL(org.json.JSONObject, java.lang.String):void");
    }

    public static Map LIZIZ(C21244418Bu c21244418Bu, String str, int i, String str2, PageInfo pageInfo, Set set, int i2) {
        boolean zBooleanValue;
        Integer numValueOf;
        Boolean firstShow;
        Boolean boolValueOf;
        String scene;
        Long lValueOf;
        Map<String, ? extends BcmParams> map;
        Map<String, BcmParams> pageParams;
        BcmParams bcmParams;
        JSONObject jSONObject;
        String str3;
        if ((i2 & 2) != 0) {
            i = 0;
        }
        if ((i2 & 4) != 0) {
            str2 = null;
        }
        if ((i2 & 8) != 0) {
            pageInfo = null;
        }
        if ((i2 & 16) != 0) {
            set = C08CX.INSTANCE;
        }
        c21244418Bu.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (str != null && str.length() != 0) {
            if (i > 0) {
                linkedHashMap.put("btm_chain", BtmServiceImpl.INSTANCE.getChainRecorderExp().LIZ(i, str));
            }
            C21248618Dk c21248618Dk = C21248618Dk.LIZ;
            C21246818Cs c21246818CsLJFF = c21248618Dk.LJFF(str);
            if (c21246818CsLJFF != null) {
                linkedHashMap.put("btm_show_id", c21246818CsLJFF.LIZ);
                if (C18CS.LIZ.LIZLLL().LJIJJ() != 1) {
                    linkedHashMap.put("btm_instance_id", c21246818CsLJFF.LIZLLL);
                }
            }
            Iterator it2 = ((CopyOnWriteArrayList) LIZJ.getValue(c21244418Bu, LIZIZ[0])).iterator();
            while (it2.hasNext()) {
                ((InterfaceC1699630uKX) it2.next()).LIZ(str2, str, null, linkedHashMap);
            }
            String strLJ = C18C3.LJ(str);
            if (strLJ != null) {
                linkedHashMap.put("btm", strLJ);
                linkedHashMap.put("btm_unit_id", str);
                BtmServiceImpl btmServiceImpl = BtmServiceImpl.INSTANCE;
                String strLIZIZ = btmServiceImpl.getChainRecorderExp().LIZIZ(str);
                String strLJ2 = C18C3.LJ(strLIZIZ);
                if (strLJ2 != null && strLJ2.length() != 0) {
                    linkedHashMap.put("btm_pre", strLJ2);
                    if (C18CS.LIZ.LIZLLL().LJIJJ() != 1) {
                        linkedHashMap.put("btm_pre_unit_id", strLIZIZ);
                    }
                    C21246818Cs c21246818CsLJFF2 = c21248618Dk.LJFF(strLIZIZ);
                    if (c21246818CsLJFF2 != null) {
                        str3 = c21246818CsLJFF2.LIZ;
                    } else {
                        str3 = null;
                    }
                    linkedHashMap.put("btm_pre_show_id", str3);
                }
                String strLIZIZ2 = btmServiceImpl.getChainRecorderExp().LIZIZ(strLIZIZ);
                String strLJ3 = C18C3.LJ(strLIZIZ2);
                if (strLJ3 != null && strLJ3.length() != 0) {
                    linkedHashMap.put("btm_ppre", strLJ3);
                    if (C18CS.LIZ.LIZLLL().LJIJJ() != 1) {
                        linkedHashMap.put("btm_ppre_unit_id", strLIZIZ2);
                    }
                }
                FeatureModel featureModelLIZJ = C18CS.LIZ.LIZJ();
                featureModelLIZJ.getClass();
                Object objLIZIZ = C1972007ny.LIZIZ(featureModelLIZJ, "append_btm_page_params", Boolean.valueOf(featureModelLIZJ.appendBcmPageParams));
                if (!(objLIZIZ instanceof Boolean)) {
                    objLIZIZ = null;
                }
                Boolean bool = (Boolean) objLIZIZ;
                if (bool != null) {
                    zBooleanValue = bool.booleanValue();
                } else {
                    zBooleanValue = featureModelLIZJ.appendBcmPageParams;
                }
                featureModelLIZJ.appendBcmPageParams = zBooleanValue;
                if (zBooleanValue && pageInfo != null && (pageInfo instanceof BcmPageInfo) && (pageParams = ((BcmPageInfo) pageInfo).getPageParams()) != null && (bcmParams = pageParams.get("ecom_entrance")) != null && (jSONObject = bcmParams.toJSONObject()) != null && jSONObject.length() > 0) {
                    List<String> listLIZLLL = C18CS.LIZ.LIZJ().LIZLLL();
                    if (!listLIZLLL.isEmpty()) {
                        Iterator<String> it3 = listLIZLLL.iterator();
                        while (it3.hasNext()) {
                            jSONObject.remove(it3.next());
                        }
                    }
                    if (jSONObject.length() > 0) {
                        linkedHashMap.put("btm_page_params", jSONObject);
                    }
                }
                Iterator it4 = set.iterator();
                while (it4.hasNext()) {
                    switch (C20164713vB.LIZ[((EnumC20164613vA) it4.next()).ordinal()]) {
                        case 1:
                            if (pageInfo != null) {
                                numValueOf = Integer.valueOf(pageInfo.getStep());
                            } else {
                                numValueOf = null;
                            }
                            linkedHashMap.put("step", numValueOf);
                            break;
                        case 2:
                            if (pageInfo != null) {
                                firstShow = pageInfo.getFirstShow();
                            } else {
                                firstShow = null;
                            }
                            linkedHashMap.put("first_show", firstShow);
                            break;
                        case 3:
                            linkedHashMap.put("launch_id", BtmServiceImpl.INSTANCE.getLaunchIdExp());
                            break;
                        case 4:
                            if (pageInfo != null) {
                                boolValueOf = Boolean.valueOf(pageInfo.isFromBackground());
                            } else {
                                boolValueOf = null;
                            }
                            linkedHashMap.put("is_from_background", boolValueOf);
                            break;
                        case 5:
                            if (pageInfo != null) {
                                scene = pageInfo.getScene();
                            } else {
                                scene = null;
                            }
                            linkedHashMap.put(Scene.SCENE_SERVICE, scene);
                            break;
                        case 6:
                            if (pageInfo != null) {
                                lValueOf = Long.valueOf(pageInfo.getEnterTime());
                            } else {
                                lValueOf = null;
                            }
                            linkedHashMap.put("enter_time", lValueOf);
                            break;
                        case 7:
                            AnonymousClass1891 anonymousClass1891 = AnonymousClass1891.LIZ;
                            C212369188x c212369188xLIZJ = AnonymousClass1891.LIZJ(strLIZIZ);
                            BcmParams bcmParams2 = new BcmParams();
                            if (c212369188xLIZJ != null && (map = c212369188xLIZJ.LIZIZ) != null) {
                                for (Map.Entry<String, ? extends BcmParams> entry : map.entrySet()) {
                                    if (C18BT.LIZ.LIZ(entry.getKey())) {
                                        bcmParams2.merge(entry.getValue());
                                    }
                                }
                            }
                            linkedHashMap.put("btm_pre_unit_params", bcmParams2.toJSON());
                            break;
                    }
                }
            }
        }
        return linkedHashMap;
    }
}
