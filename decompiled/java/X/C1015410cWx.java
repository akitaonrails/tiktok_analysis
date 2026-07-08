package X;

import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.ss.android.ugc.aweme.commercialize.model.AnoleComponentModel;
import com.ss.android.ugc.aweme.commercialize.router.api.model.CRouterCoreModel;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0cWx, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C1015410cWx {
    public static final void LIZJ(final C1015550cXB c1015550cXB, JSONObject jSONObject) {
        boolean z;
        FrameLayout frameLayout;
        JSONObject ugenData;
        JSONObject jSONObjectPut;
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("carousel_extra_data");
        if (jSONObjectOptJSONObject != null && jSONObjectOptJSONObject.optInt("image_load_status") == 1) {
            z = true;
        } else {
            z = false;
        }
        if (C691740RBk.LIZ()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("tryRerender: carouselUpdateInfo -> ");
            sbLIZ.append(jSONObject);
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (z) {
            if (c1015550cXB.LL.getShouldRerenderWhenSizeChanged() && (ugenData = c1015550cXB.LL.getUgenData()) != null && (jSONObjectPut = ugenData.put("carouselUpdateInfo", jSONObject)) != null) {
                c1015550cXB.LJJIII(C1014970cWF.LIZ);
                C1015640cXK.LIZ(c1015550cXB, false, jSONObjectPut, new InterfaceC1015680cXO() { // from class: X.0cWz
                    @Override // X.InterfaceC1015680cXO
                    public final void LIZ(View view) {
                        if (view != null) {
                            C1015550cXB c1015550cXB2 = c1015550cXB;
                            C1014320cVC.LIZLLL(view);
                            ViewGroup viewGroup = c1015550cXB2.LLJJIII;
                            if (viewGroup != null) {
                                C786410Ut5.LJJJJI(viewGroup);
                            }
                            ViewGroup viewGroup2 = c1015550cXB2.LLJJIII;
                            if (viewGroup2 != null) {
                                viewGroup2.addView(view);
                            }
                        }
                    }
                });
            }
            C1015530cX9 c1015530cX9 = c1015550cXB.LLJLL;
            if (c1015530cX9 != null) {
                ViewGroup viewGroup = c1015550cXB.LLJJIII;
                if (viewGroup instanceof FrameLayout) {
                    frameLayout = (FrameLayout) viewGroup;
                } else {
                    frameLayout = null;
                }
                c1015530cX9.LIZJ(frameLayout, jSONObject);
            }
        }
    }

    public static final void LIZ(C1015420cWy c1015420cWy, C1050000dQk c1050000dQk, boolean z, int i) {
        Object obj;
        Object obj2;
        Boolean boolValueOf;
        Object obj3;
        Object obj4;
        Map<String, Object> map;
        String str;
        Map<String, Object> map2;
        Object c098200Yq;
        Map<String, Object> map3;
        Map<String, Object> map4;
        Double pdpScreenOpenType;
        String str2;
        boolean z2;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onClickHandle() , cRouter status = ");
        sbLIZ.append(z);
        C2188811AlT.LIZIZ(sbLIZ);
        String openUrl = c1015420cWy.LIZIZ.LIZLLL.getOpenUrl();
        Object obj5 = 0;
        if (openUrl != null && (pdpScreenOpenType = c1015420cWy.LIZ.getPdpScreenOpenType()) != null) {
            int iDoubleValue = (int) pdpScreenOpenType.doubleValue();
            if (iDoubleValue != 1) {
                if (iDoubleValue != 2) {
                    str2 = "";
                } else {
                    str2 = "false";
                }
            } else {
                str2 = "true";
            }
            if (str2.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2 && a0.LJJJ(openUrl, "fullScreen", 0, false, 6) == -1) {
                String strLJJLIIIJ = C13LP.LJJLIIIJ(a0.LJJLIIIJILLIZJL(openUrl, new String[]{"pdp?"}, 0, 6), "pdp?fullScreen=true&", null, null, 0, null, null, 62);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append("fullScreen=");
                sbLIZ2.append(str2);
                openUrl = u.LJJIFFI(strLJJLIIIJ, "fullScreen=true", C2188811AlT.LIZIZ(sbLIZ2), false);
            } else if (str2.length() > 0) {
                StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                sbLIZ3.append("fullScreen=");
                sbLIZ3.append(str2);
                openUrl = u.LJJIFFI(openUrl, "fullScreen=true", C2188811AlT.LIZIZ(sbLIZ3), false);
            }
            c1015420cWy.LIZIZ.LIZLLL.setUgenPdpUrl(openUrl);
        }
        InterfaceC1014270cV7 interfaceC1014270cV7 = c1015420cWy.LIZJ;
        Map mapLJIIJ = C2097608Jq.LJIIJ(new Pair(EnumC1005330cGh.ENTER_FROM.getRName(), Integer.valueOf(i)));
        String rName = EnumC1005330cGh.REFER.getRName();
        C1015450cX1 c1015450cX1 = C1015450cX1.LIZ;
        Object obj6 = c1015420cWy.LJFF;
        c1015450cX1.getClass();
        if (c1050000dQk != null && (map4 = c1050000dQk.LJ) != null) {
            obj = ((HashMap) map4).get("refer");
        } else {
            obj = null;
        }
        if ((obj instanceof String) && obj != null) {
            obj6 = obj;
        }
        mapLJIIJ.put(rName, obj6);
        String rName2 = EnumC1005330cGh.TAG.getRName();
        Object obj7 = c1015420cWy.LJ;
        if (c1050000dQk != null && (map3 = c1050000dQk.LJ) != null) {
            obj2 = ((HashMap) map3).get("tag");
        } else {
            obj2 = null;
        }
        if ((obj2 instanceof String) && obj2 != null) {
            obj7 = obj2;
        }
        mapLJIIJ.put(rName2, obj7);
        if (Intrinsics.LJFF(c1015420cWy.LIZ.type, EnumC1008920cMU.CAROUSEL_MULTI_PICS_UGEN.getType())) {
            mapLJIIJ.put(EnumC1005330cGh.COMPONENT_TYPE.getRName(), c1015420cWy.LIZ.type);
            C1015550cXB c1015550cXB = c1015420cWy.LIZLLL;
            Iterator<InterfaceC1015560cXC> it2 = c1015550cXB.LJJ().iterator();
            while (it2.hasNext()) {
                it2.next().LIZJ(c1015550cXB, c1050000dQk);
            }
        }
        String rName3 = EnumC1005330cGh.AD_EXTRA_DATA.getRName();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1015450cX1.LIZ.getClass();
        Map mapLJIIIIZZ = C1015450cX1.LJIIIIZZ(c1050000dQk);
        if (mapLJIIIIZZ != null) {
            linkedHashMap.putAll(mapLJIIIIZZ);
        }
        Map mapLJII = C1015450cX1.LJII(c1015420cWy.LIZ, "realtime_click");
        if (mapLJII != null) {
            linkedHashMap.putAll(mapLJII);
        }
        linkedHashMap.putAll(C1015450cX1.LIZ(c1015420cWy.LIZIZ, c1015420cWy.LIZ));
        C1015550cXB c1015550cXB2 = c1015420cWy.LIZLLL;
        c1015550cXB2.getClass();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        String str3 = c1015550cXB2.LLJZ;
        if (str3 != null) {
            linkedHashMap2.put("ugen_widget_id", str3);
        }
        String str4 = c1015550cXB2.LLJZIJLIL;
        if (str4 != null) {
            linkedHashMap2.put("ugen_widget_name", str4);
        }
        Float f = c1015550cXB2.LLL;
        if (f != null) {
            linkedHashMap2.put("ugen_widget_down_x", Float.valueOf(f.floatValue()));
        }
        Float f2 = c1015550cXB2.LLLF;
        if (f2 != null) {
            linkedHashMap2.put("ugen_widget_down_y", Float.valueOf(f2.floatValue()));
        }
        Float f3 = c1015550cXB2.LLLFF;
        if (f3 != null) {
            linkedHashMap2.put("ugen_widget_up_x", Float.valueOf(f3.floatValue()));
        }
        Float f4 = c1015550cXB2.LLLFFI;
        if (f4 != null) {
            linkedHashMap2.put("ugen_widget_up_y", Float.valueOf(f4.floatValue()));
        }
        Float f5 = c1015550cXB2.LLLFZ;
        if (f5 != null) {
            linkedHashMap2.put("ugen_component_width", Float.valueOf(f5.floatValue()));
        }
        Float f6 = c1015550cXB2.LLLI;
        if (f6 != null) {
            linkedHashMap2.put("ugen_component_height", Float.valueOf(f6.floatValue()));
        }
        Pair[] pairArr = new Pair[8];
        pairArr[0] = new Pair("x", obj5);
        pairArr[1] = new Pair("y", obj5);
        pairArr[2] = new Pair("top", obj5);
        pairArr[3] = new Pair("left", obj5);
        Object obj8 = c1015550cXB2.LLLI;
        if (obj8 == null) {
            obj8 = obj5;
        }
        pairArr[4] = new Pair("bottom", obj8);
        Object obj9 = c1015550cXB2.LLLFZ;
        if (obj9 == null) {
            obj9 = obj5;
        }
        pairArr[5] = new Pair("right", obj9);
        Object obj10 = c1015550cXB2.LLLFZ;
        if (obj10 == null) {
            obj10 = obj5;
        }
        pairArr[6] = new Pair("width", obj10);
        Object obj11 = c1015550cXB2.LLLI;
        if (obj11 == null) {
            obj11 = obj5;
        }
        pairArr[7] = new Pair("height", obj11);
        linkedHashMap2.put("card_rect", C2097608Jq.LJIIIIZZ(pairArr));
        Object obj12 = c1015550cXB2.LLL;
        if (obj12 == null) {
            obj12 = obj5;
        }
        linkedHashMap2.put("click_position_x", obj12);
        Float f7 = c1015550cXB2.LLLF;
        if (f7 != null) {
            obj5 = f7;
        }
        linkedHashMap2.put("click_position_y", obj5);
        Iterator<InterfaceC1015560cXC> it3 = c1015550cXB2.LJJ().iterator();
        while (it3.hasNext()) {
            Map<String, Object> mapLIZLLL = it3.next().LIZLLL("realtime_click");
            LinkedHashMap linkedHashMap3 = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : mapLIZLLL.entrySet()) {
                if (entry.getValue() != null) {
                    linkedHashMap3.put(entry.getKey(), entry.getValue());
                }
            }
            linkedHashMap2.putAll(linkedHashMap3);
        }
        linkedHashMap.putAll(linkedHashMap2);
        mapLJIIJ.put(rName3, linkedHashMap);
        mapLJIIJ.put(EnumC1005330cGh.C_ROUTER_ENABLE.getRName(), Boolean.valueOf(z));
        if (!Intrinsics.LJFF(c1015420cWy.LIZ.type, EnumC1008920cMU.CAROUSEL_MULTI_PICS_UGEN.getType()) && c1015420cWy.LIZ.getUgenJumpModel() != null) {
            try {
                Gson gson = C7740030o.LIZ().getGson();
                if (gson != null) {
                    c098200Yq = (CRouterCoreModel) gson.LJII(String.valueOf(c1015420cWy.LIZ.getUgenJumpModel()), CRouterCoreModel.class);
                } else {
                    c098200Yq = null;
                }
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m8isSuccessimpl(c098200Yq);
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                sbLIZ4.append("getUgenJumpModel() parse failed ,reason = ");
                sbLIZ4.append(thM5exceptionOrNullimpl.getMessage());
                C2188811AlT.LIZIZ(sbLIZ4);
            }
            if (!C189200o6.m7isFailureimpl(c098200Yq) && c098200Yq != null) {
                mapLJIIJ.put(EnumC1005330cGh.CROUTER_JUMP_MODEL.getRName(), c098200Yq);
            }
        }
        interfaceC1014270cV7.LJIJ(new C991670buf(mapLJIIJ), c1015420cWy.LIZLLL);
        List<String> requiringReportScenes = c1015420cWy.LIZ.getRequiringReportScenes();
        if (requiringReportScenes != null) {
            boolValueOf = Boolean.valueOf(requiringReportScenes.contains("tiktok_video_anchor_click"));
        } else {
            boolValueOf = null;
        }
        if (Intrinsics.LJFF(boolValueOf, Boolean.TRUE)) {
            C1015450cX1 c1015450cX12 = C1015450cX1.LIZ;
            String str5 = c1015420cWy.LJ;
            c1015450cX12.getClass();
            if (c1050000dQk != null && (map2 = c1050000dQk.LJ) != null) {
                obj3 = ((HashMap) map2).get("tag");
            } else {
                obj3 = null;
            }
            if ((obj3 instanceof String) && (str = (String) obj3) != null) {
                str5 = str;
            }
            C1022820ciu c1022820ciuLIZLLL = C2184171Adz.LIZLLL(str5, "tiktok_video_anchor_click", c1015420cWy.LIZIZ.LIZLLL);
            Object obj13 = c1015420cWy.LJFF;
            if (c1050000dQk != null && (map = c1050000dQk.LJ) != null) {
                obj4 = ((HashMap) map).get("refer");
            } else {
                obj4 = null;
            }
            if ((obj4 instanceof String) && obj4 != null) {
                obj13 = obj4;
            }
            c1022820ciuLIZLLL.LIZJ(obj13, "refer");
            Map<String, Object> ttsLogInfo = c1015420cWy.LIZ.getTtsLogInfo();
            if (ttsLogInfo != null) {
                for (String str6 : ttsLogInfo.keySet()) {
                    Object obj14 = ttsLogInfo.get(str6);
                    if (obj14 != null) {
                        c1022820ciuLIZLLL.LIZJ(obj14, str6);
                    }
                }
            }
            c1022820ciuLIZLLL.LJII();
        }
    }

    public static void LIZIZ(C1015550cXB c1015550cXB, String str, String str2, String str3, String str4, String str5, Map map, int i) {
        String str6 = str5;
        String str7 = str4;
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str7 = null;
        }
        if ((i & 16) != 0) {
            str6 = null;
        }
        if ((i & 32) != 0) {
            map = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1015450cX1 c1015450cX1 = C1015450cX1.LIZ;
        AnoleComponentModel anoleComponentModel = c1015550cXB.LL;
        c1015450cX1.getClass();
        Map mapLJII = C1015450cX1.LJII(anoleComponentModel, str);
        if (mapLJII != null) {
            linkedHashMap.putAll(mapLJII);
        }
        if (map != null) {
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            for (Map.Entry entry : map.entrySet()) {
                if (entry.getValue() != null) {
                    linkedHashMap2.put(entry.getKey(), entry.getValue());
                }
            }
            linkedHashMap.putAll(linkedHashMap2);
        }
        if (str2 != null) {
            linkedHashMap.put("fail_reason", str2);
        }
        if (str3 != null) {
            linkedHashMap.put("failed_detail_reason", str3);
        }
        C1015450cX1 c1015450cX12 = C1015450cX1.LIZ;
        if (str7 == null) {
            str7 = (String) c1015550cXB.LLLIIIIL.getValue();
        }
        if (str6 == null) {
            str6 = (String) c1015550cXB.LLLIIIL.getValue();
        }
        AnoleComponentModel anoleComponentModel2 = c1015550cXB.LL;
        C1009340cNA c1009340cNA = c1015550cXB.LLILLJJLI;
        c1015450cX12.getClass();
        C1015450cX1.LJIIJ(str, str7, str6, anoleComponentModel2, c1009340cNA, linkedHashMap);
    }
}
