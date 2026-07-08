package X;

import com.bytedance.touchpoint.api.model.CoinBottomTab;
import com.bytedance.touchpoint.api.model.DynamicDialog;
import com.bytedance.touchpoint.api.model.ProfileActivityIcon;
import com.bytedance.touchpoint.api.model.ReferralFeedBanner;
import com.bytedance.touchpoint.api.model.TaskEvent;
import com.bytedance.touchpoint.api.model.TouchPoint;
import com.bytedance.touchpoint.api.touchpoint.ITouchPointModuleService;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AwS111S1000000_27;
import kotlin.jvm.internal.AwS143S0101000_3;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zOY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1894320zOY {
    public static final C1894320zOY LIZ = new C1894320zOY();

    public static void LIZLLL() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "feed");
        linkedHashMap.put("is_login", C1894310zOX.LIZIZ() ? "1" : CardStruct.IStatusCode.DEFAULT);
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZ("age_pop_show", linkedHashMap);
        }
    }

    public static TouchPoint LIZ(int i) {
        C1893670zNV c1893670zNVLIZ = C1874850yt9.LIZ(i, CoinBottomTab.class);
        if (c1893670zNVLIZ != null) {
            int i2 = c1893670zNVLIZ.LIZ;
            String str = c1893670zNVLIZ.LIZIZ;
            String str2 = "";
            if (str == null) {
                str = "";
            }
            Integer num = c1893670zNVLIZ.LIZJ;
            Map<String, String> map = c1893670zNVLIZ.LJ;
            String str3 = c1893670zNVLIZ.LIZLLL;
            String str4 = c1893670zNVLIZ.LJFF;
            if (str4 != null) {
                str2 = str4;
            }
            return new TouchPoint(i2, str, num, map, null, str3, "", str2, c1893670zNVLIZ.LJI, null, null, false);
        }
        return null;
    }

    public static void LIZJ(boolean z) {
        Object obj;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("enter_from", "feed");
        String str = "1";
        if (z) {
            obj = "1";
        } else {
            obj = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_adult", obj);
        if (!C1894310zOX.LIZIZ()) {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_login", str);
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZ("age_pop_click", linkedHashMap);
        }
    }

    public static void LJ(String str) {
        C01U6.LIZJ(new AwS111S1000000_27(str, 1));
    }

    public static void LJIJI(TouchPoint touchPoint) {
        String strLJIJJ;
        String str;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("touch_point_id", String.valueOf(touchPoint.touchPointId));
        linkedHashMap.put("touch_point_name", touchPoint.touchPointName);
        linkedHashMap.put("launch_plan_id", String.valueOf(touchPoint.launchPlanId));
        linkedHashMap.put("touch_point_ab_versions", String.valueOf(touchPoint.abVersions));
        C1619720sFe c1619720sFe = C1619720sFe.LIZ;
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
        String strLJIJJ2 = null;
        if (abstractC1896090zRP != null) {
            strLJIJJ = abstractC1896090zRP.LJIJJ();
        } else {
            strLJIJJ = null;
        }
        linkedHashMap.put("region", strLJIJJ);
        linkedHashMap.put("cold_start_cnt", String.valueOf(C1895930zR9.LIZJ));
        if (C1894310zOX.LIZIZ()) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_login", str);
        Map<String, String> map = touchPoint.customEventParams;
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = c1619720sFe.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZ("touch_point_receive", linkedHashMap);
        }
        C1893680zNW.LIZ.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            AbstractC1896090zRP abstractC1896090zRP2 = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
            if (abstractC1896090zRP2 != null) {
                strLJIJJ2 = abstractC1896090zRP2.LJIJJ();
            }
            jSONObject.put("region", strLJIJJ2);
            jSONObject.put("touch_point_id", touchPoint.touchPointId);
            jSONObject.put("launch_plan_id", touchPoint.launchPlanId);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ2 = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ2 != null) {
            interfaceC1897260zTILIZIZ2.LIZIZ("touchpoint_receive_monitor", jSONObject);
        }
    }

    public final void LJI(ReferralFeedBanner referralFeedBanner) {
        int i = referralFeedBanner.LIZ;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("click_position", "confirm");
        linkedHashMap.put("sub_type", "-1");
        getClass();
        LJIILJJIL(i, linkedHashMap, null, null, null);
    }

    public final void LJIIJJI(ProfileActivityIcon profileActivityIcon) {
        if (profileActivityIcon != null && profileActivityIcon.LIZIZ != null && profileActivityIcon.LIZIZ.length() > 0) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("click_position", "ok");
            int i = profileActivityIcon.LIZ;
            getClass();
            LJIILJJIL(i, linkedHashMap, null, null, null);
        }
    }

    public static void LJIIIZ(TaskEvent taskEvent, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("action_type", taskEvent.userActionType);
        Map<String, String> map2 = taskEvent.customEventParams;
        if (map2 != null) {
            linkedHashMap.putAll(map2);
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZ("incentive_task_event_report", linkedHashMap);
        }
    }

    public static void LJIIL(DynamicDialog dynamicDialog, boolean z) {
        String str;
        String str2;
        Map<String, String> map;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("position", "feed");
        linkedHashMap.put("module_form", "pop");
        if (dynamicDialog != null) {
            str = dynamicDialog.name;
        } else {
            str = null;
        }
        linkedHashMap.put("module_name", str);
        linkedHashMap.put("button_name", "ok");
        if (z) {
            str2 = "loggedIn";
        } else {
            str2 = "cancelled";
        }
        linkedHashMap.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str2);
        if (dynamicDialog != null && (map = dynamicDialog.LJ) != null) {
            linkedHashMap.putAll(map);
        }
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZ("incentive_module_interact_receipt", linkedHashMap);
        }
    }

    public static void LJIILIIL(int i, Map map) {
        TouchPoint touchPointLIZJ;
        String str;
        String strLJIJJ = null;
        if (i == 29) {
            touchPointLIZJ = LIZ(i);
        } else {
            C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
            touchPointLIZJ = C2178808gE.LIZ().LIZJ(i, null);
        }
        if (touchPointLIZJ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("touch_point_id", String.valueOf(touchPointLIZJ.touchPointId));
            linkedHashMap.put("touch_point_name", touchPointLIZJ.touchPointName);
            linkedHashMap.put("launch_plan_id", String.valueOf(touchPointLIZJ.launchPlanId));
            linkedHashMap.put("touch_point_ab_versions", String.valueOf(touchPointLIZJ.abVersions));
            C1619720sFe c1619720sFe = C1619720sFe.LIZ;
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
            if (abstractC1896090zRP != null) {
                strLJIJJ = abstractC1896090zRP.LJIJJ();
            }
            linkedHashMap.put("region", strLJIJJ);
            linkedHashMap.put("cold_start_cnt", String.valueOf(C1895930zR9.LIZJ));
            if (C1894310zOX.LIZIZ()) {
                str = "1";
            } else {
                str = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_login", str);
            Map<String, String> map2 = touchPointLIZJ.customEventParams;
            if (map2 != null) {
                linkedHashMap.putAll(map2);
            }
            linkedHashMap.putAll(map);
            if (i == 4) {
                linkedHashMap.put("vv_cnt_total", String.valueOf(C1895930zR9.LIZLLL));
            } else if (i == 2) {
                ITouchPointModuleService iTouchPointModuleService = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null);
                if (iTouchPointModuleService != null) {
                    iTouchPointModuleService.LJIILLIIL();
                }
                linkedHashMap.put("task_status", "");
            }
            InterfaceC1897260zTI interfaceC1897260zTILIZIZ = c1619720sFe.LIZIZ();
            if (interfaceC1897260zTILIZIZ != null) {
                interfaceC1897260zTILIZIZ.LIZ("touch_point_block", linkedHashMap);
            }
        }
    }

    public static void LJIL(C1894320zOY c1894320zOY, C1893670zNV c1893670zNV, Map map) {
        String strLJIJJ;
        String str;
        c1894320zOY.getClass();
        if (c1893670zNV != null) {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("touch_point_id", String.valueOf(c1893670zNV.LIZ));
                linkedHashMap.put("touch_point_name", c1893670zNV.LIZIZ);
                linkedHashMap.put("launch_plan_id", String.valueOf(c1893670zNV.LIZJ));
                linkedHashMap.put("touch_point_ab_versions", String.valueOf(c1893670zNV.LIZLLL));
                C1619720sFe c1619720sFe = C1619720sFe.LIZ;
                AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
                if (abstractC1896090zRP != null) {
                    strLJIJJ = abstractC1896090zRP.LJIJJ();
                } else {
                    strLJIJJ = null;
                }
                linkedHashMap.put("region", strLJIJJ);
                linkedHashMap.put("cold_start_cnt", String.valueOf(C1895930zR9.LIZJ));
                if (C1894310zOX.LIZIZ()) {
                    str = "1";
                } else {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("is_login", str);
                if ("".length() > 0) {
                    linkedHashMap.put("sub_type", "");
                }
                Map<String, String> map2 = c1893670zNV.LJ;
                if (map2 != null) {
                    linkedHashMap.putAll(map2);
                }
                linkedHashMap.putAll(map);
                if (c1893670zNV.LIZ == 4) {
                    linkedHashMap.putAll(C1893790zNh.LIZJ(C1893790zNh.LIZ));
                    linkedHashMap.put("vv_cnt_total", String.valueOf(C1895930zR9.LIZLLL));
                }
                if (c1893670zNV.LIZ == 2) {
                    ITouchPointModuleService iTouchPointModuleService = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null);
                    if (iTouchPointModuleService != null) {
                        iTouchPointModuleService.LJIILLIIL();
                    }
                    linkedHashMap.put("task_status", "");
                }
                InterfaceC1897260zTI interfaceC1897260zTILIZIZ = c1619720sFe.LIZIZ();
                if (interfaceC1897260zTILIZIZ != null) {
                    interfaceC1897260zTILIZIZ.LIZ("touch_point_show", linkedHashMap);
                }
                C1893680zNW.LIZ.getClass();
                C1893680zNW.LJIIIZ(c1893670zNV);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                return;
            }
        }
        ITouchPointModuleService iTouchPointModuleService2 = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null);
        if (iTouchPointModuleService2 != null) {
            iTouchPointModuleService2.LJIIJ();
        }
    }

    public static Map LIZIZ(String str, String str2, String str3, String str4) {
        Map<String, String> map;
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        C1893670zNV c1893670zNVLJ = C2178808gE.LIZ().LJ(33);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
        String strLJIJJ = null;
        if (abstractC1896090zRP != null) {
            strLJIJJ = abstractC1896090zRP.LJIJJ();
        }
        linkedHashMap.put("region", strLJIJJ);
        linkedHashMap.put("enter_from", str2);
        linkedHashMap.put("position", str4);
        linkedHashMap.put("page_enter_from", str3);
        linkedHashMap.put("group_id", str);
        if (c1893670zNVLJ != null && (map = c1893670zNVLJ.LJ) != null) {
            linkedHashMap.putAll(map);
        }
        return linkedHashMap;
    }

    public static void LJII(int i, String str, String str2, String str3) {
        String strLJIJJ;
        C1619720sFe c1619720sFe = C1619720sFe.LIZ;
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = c1619720sFe.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("type", String.valueOf(i));
            linkedHashMap.put("name", str);
            linkedHashMap.put("task_id", str2);
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
            if (abstractC1896090zRP != null) {
                strLJIJJ = abstractC1896090zRP.LJIJJ();
            } else {
                strLJIJJ = null;
            }
            linkedHashMap.put("region", strLJIJJ);
            linkedHashMap.put("result", str3);
            interfaceC1897260zTILIZIZ.LIZ("inapp_push_filtered_reason", linkedHashMap);
        }
    }

    public static void LJIIIIZZ(C1894320zOY c1894320zOY, String str, boolean z, String str2, String str3) {
        String strLJIJJ;
        String str4;
        c1894320zOY.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        C1619720sFe c1619720sFe = C1619720sFe.LIZ;
        AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
        if (abstractC1896090zRP != null) {
            strLJIJJ = abstractC1896090zRP.LJIJJ();
        } else {
            strLJIJJ = null;
        }
        linkedHashMap.put("region", strLJIJJ);
        linkedHashMap.put("campaign", "coin");
        linkedHashMap.put("enter_from", str);
        linkedHashMap.put("gameplay", null);
        linkedHashMap.put("position", "incentive_ads_page");
        linkedHashMap.put("module_name", "incentive_ads_exit_pop");
        linkedHashMap.put("module_form", null);
        linkedHashMap.put("page_enter_from", str3);
        if (z) {
            str4 = "1";
        } else {
            str4 = CardStruct.IStatusCode.DEFAULT;
        }
        linkedHashMap.put("is_not_show_again", str4);
        linkedHashMap.put("button_name", str2);
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = c1619720sFe.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZ("incentive_module_click", linkedHashMap);
        }
    }

    public static void LJIIJ(int i, String str, String str2, String str3, Map map) {
        String str4 = "close";
        if (Intrinsics.LJFF(str, "close")) {
            C01U6.LIZIZ(new AwS143S0101000_3(EnumC2178908gF.CLOSE, 0));
        } else if (Intrinsics.LJFF(str, "widget")) {
            C01U6.LIZIZ(new AwS143S0101000_3(EnumC2178908gF.CLICK, 0));
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (!Intrinsics.LJFF(str, "close")) {
            str4 = "widget";
        }
        linkedHashMap.put("click_position", str4);
        ITouchPointModuleService iTouchPointModuleService = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null);
        if (iTouchPointModuleService != null) {
            iTouchPointModuleService.LJIIIZ();
        }
        linkedHashMap.put("task_key", "");
        linkedHashMap.put("sub_type", str3);
        linkedHashMap.putAll(map);
        LJIILJJIL(1, linkedHashMap, null, Integer.valueOf(i), str2);
    }

    public static void LJIILJJIL(int i, Map map, Integer num, Integer num2, String str) {
        TouchPoint touchPointLIZJ;
        String strLJIJJ;
        Object obj;
        String str2;
        Object obj2;
        Object obj3;
        ITouchPointModuleService iTouchPointModuleService;
        if (i == 29) {
            touchPointLIZJ = LIZ(i);
        } else {
            C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
            touchPointLIZJ = C2178808gE.LIZ().LIZJ(i, num);
        }
        if (touchPointLIZJ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("touch_point_id", String.valueOf(touchPointLIZJ.touchPointId));
            linkedHashMap.put("touch_point_name", touchPointLIZJ.touchPointName);
            linkedHashMap.put("launch_plan_id", String.valueOf(touchPointLIZJ.launchPlanId));
            linkedHashMap.put("touch_point_ab_versions", String.valueOf(touchPointLIZJ.abVersions));
            C1619720sFe c1619720sFe = C1619720sFe.LIZ;
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
            if (abstractC1896090zRP != null) {
                strLJIJJ = abstractC1896090zRP.LJIJJ();
            } else {
                strLJIJJ = null;
            }
            linkedHashMap.put("region", strLJIJJ);
            linkedHashMap.put("cold_start_cnt", String.valueOf(C1895930zR9.LIZJ));
            String str3 = "1";
            if (C1894310zOX.LIZIZ()) {
                obj = "1";
            } else {
                obj = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_login", obj);
            if (num2 != null) {
                linkedHashMap.put("vv_cnt", num2.toString());
            }
            if (str != null) {
                linkedHashMap.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
            }
            if (i == 29 && (iTouchPointModuleService = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null)) != null && iTouchPointModuleService.LJ()) {
                str2 = "embedded";
            } else {
                str2 = "full_screen";
            }
            linkedHashMap.put("page_type", str2);
            Map<String, String> map2 = touchPointLIZJ.customEventParams;
            if (map2 != null) {
                linkedHashMap.putAll(map2);
            }
            if (C1064720doU.LIZ()) {
                obj2 = "1";
            } else {
                obj2 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("webview_has_warm_up", obj2);
            C1893370zN1 c1893370zN1 = (C1893370zN1) c1619720sFe.LIZ(1003);
            if (c1893370zN1 != null && c1893370zN1.LJIIJ()) {
                obj3 = "1";
            } else {
                obj3 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("webview_start_chromium_task_finished", obj3);
            C1893370zN1 c1893370zN12 = (C1893370zN1) c1619720sFe.LIZ(1003);
            if (c1893370zN12 == null || !c1893370zN12.LJIIJJI()) {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("webview_warm_up_task_finished", str3);
            linkedHashMap.putAll(map);
            if (i == 4) {
                linkedHashMap.putAll(C1893790zNh.LIZJ(C1893790zNh.LIZ));
                linkedHashMap.put("vv_cnt_total", String.valueOf(C1895930zR9.LIZLLL));
            } else if (i == 2) {
                ITouchPointModuleService iTouchPointModuleService2 = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null);
                if (iTouchPointModuleService2 != null) {
                    iTouchPointModuleService2.LJIILLIIL();
                }
                linkedHashMap.put("task_status", "");
            }
            InterfaceC1897260zTI interfaceC1897260zTILIZIZ = c1619720sFe.LIZIZ();
            if (interfaceC1897260zTILIZIZ != null) {
                interfaceC1897260zTILIZIZ.LIZ("touch_point_click", linkedHashMap);
            }
            C1893680zNW c1893680zNW = C1893680zNW.LIZ;
            String strValueOf = String.valueOf(map.get("click_position"));
            c1893680zNW.getClass();
            C1893680zNW.LJ(touchPointLIZJ, strValueOf);
        }
    }

    public static void LJIILLIIL(C1894320zOY c1894320zOY, C1893670zNV c1893670zNV, Map map, Integer num, int i) {
        Object obj;
        Object obj2;
        Object obj3;
        String strLJIJJ = null;
        if ((i & 8) != 0) {
            num = null;
        }
        c1894320zOY.getClass();
        if (c1893670zNV != null) {
            try {
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                linkedHashMap.put("touch_point_id", String.valueOf(c1893670zNV.LIZ));
                linkedHashMap.put("touch_point_name", c1893670zNV.LIZIZ);
                linkedHashMap.put("launch_plan_id", String.valueOf(c1893670zNV.LIZJ));
                linkedHashMap.put("touch_point_ab_versions", String.valueOf(c1893670zNV.LIZLLL));
                C1619720sFe c1619720sFe = C1619720sFe.LIZ;
                AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
                if (abstractC1896090zRP != null) {
                    strLJIJJ = abstractC1896090zRP.LJIJJ();
                }
                linkedHashMap.put("region", strLJIJJ);
                linkedHashMap.put("cold_start_cnt", String.valueOf(C1895930zR9.LIZJ));
                String str = "1";
                if (C1894310zOX.LIZIZ()) {
                    obj = "1";
                } else {
                    obj = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("is_login", obj);
                if (num != null) {
                    linkedHashMap.put("vv_cnt", num.toString());
                }
                Map<String, String> map2 = c1893670zNV.LJ;
                if (map2 != null) {
                    linkedHashMap.putAll(map2);
                }
                if (C1064720doU.LIZ()) {
                    obj2 = "1";
                } else {
                    obj2 = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("webview_has_warm_up", obj2);
                C1893370zN1 c1893370zN1 = (C1893370zN1) c1619720sFe.LIZ(1003);
                if (c1893370zN1 != null && c1893370zN1.LJIIJ()) {
                    obj3 = "1";
                } else {
                    obj3 = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("webview_start_chromium_task_finished", obj3);
                C1893370zN1 c1893370zN12 = (C1893370zN1) c1619720sFe.LIZ(1003);
                if (c1893370zN12 == null || !c1893370zN12.LJIIJJI()) {
                    str = CardStruct.IStatusCode.DEFAULT;
                }
                linkedHashMap.put("webview_warm_up_task_finished", str);
                linkedHashMap.putAll(map);
                if (c1893670zNV.LIZ == 4) {
                    linkedHashMap.putAll(C1893790zNh.LIZJ(C1893790zNh.LIZ));
                    linkedHashMap.put("vv_cnt_total", String.valueOf(C1895930zR9.LIZLLL));
                }
                if (c1893670zNV.LIZ == 2) {
                    ITouchPointModuleService iTouchPointModuleService = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null);
                    if (iTouchPointModuleService != null) {
                        iTouchPointModuleService.LJIILLIIL();
                    }
                    linkedHashMap.put("task_status", "");
                }
                InterfaceC1897260zTI interfaceC1897260zTILIZIZ = c1619720sFe.LIZIZ();
                if (interfaceC1897260zTILIZIZ != null) {
                    interfaceC1897260zTILIZIZ.LIZ("touch_point_click", linkedHashMap);
                }
                C1893680zNW c1893680zNW = C1893680zNW.LIZ;
                String strValueOf = String.valueOf(((LinkedHashMap) map).get("click_position"));
                c1893680zNW.getClass();
                C1893680zNW.LJFF(c1893670zNV, strValueOf);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public static void LJIIZILJ(int i, Map map, Integer num, Integer num2, String str) {
        String strLJIJJ;
        String str2;
        C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
        TouchPoint touchPointLIZJ = C2178808gE.LIZ().LIZJ(i, num);
        if (touchPointLIZJ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("touch_point_id", String.valueOf(touchPointLIZJ.touchPointId));
            linkedHashMap.put("touch_point_name", touchPointLIZJ.touchPointName);
            linkedHashMap.put("launch_plan_id", String.valueOf(touchPointLIZJ.launchPlanId));
            linkedHashMap.put("touch_point_ab_versions", String.valueOf(touchPointLIZJ.abVersions));
            C1619720sFe c1619720sFe = C1619720sFe.LIZ;
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
            if (abstractC1896090zRP != null) {
                strLJIJJ = abstractC1896090zRP.LJIJJ();
            } else {
                strLJIJJ = null;
            }
            linkedHashMap.put("region", strLJIJJ);
            linkedHashMap.put("cold_start_cnt", String.valueOf(C1895930zR9.LIZJ));
            if (C1894310zOX.LIZIZ()) {
                str2 = "1";
            } else {
                str2 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_login", str2);
            if (num2 != null) {
                linkedHashMap.put("vv_cnt", num2.toString());
            }
            if (str != null) {
                linkedHashMap.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
            }
            Map<String, String> map2 = touchPointLIZJ.customEventParams;
            if (map2 != null) {
                linkedHashMap.putAll(map2);
            }
            linkedHashMap.putAll(map);
            InterfaceC1897260zTI interfaceC1897260zTILIZIZ = c1619720sFe.LIZIZ();
            if (interfaceC1897260zTILIZIZ != null) {
                interfaceC1897260zTILIZIZ.LIZ("touch_point_dismiss", linkedHashMap);
            }
        }
    }

    public static void LJIJ(String str, String str2, String str3, String str4, String str5) {
        String str6;
        ITouchPointModuleService iTouchPointModuleService;
        if (Intrinsics.LJFF(str, "29") && (iTouchPointModuleService = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null)) != null && iTouchPointModuleService.LJ()) {
            str6 = "embedded";
        } else {
            str6 = "full_screen";
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("touch_point_id", str);
        linkedHashMap.put("url", str2);
        linkedHashMap.put("router_url", str3);
        linkedHashMap.put("event_params", str5);
        linkedHashMap.put("launch_plan_id", str4);
        linkedHashMap.put("page_type", str6);
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZ("touch_point_jump", linkedHashMap);
        }
    }

    public static void LJIJJ(int i, Map map, Integer num, Integer num2, String str, String str2) {
        TouchPoint touchPointLIZJ;
        String strLJIJJ;
        String str3;
        if (i == 29) {
            touchPointLIZJ = LIZ(i);
        } else {
            C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
            touchPointLIZJ = C2178808gE.LIZ().LIZJ(i, num);
        }
        if (touchPointLIZJ != null) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("touch_point_id", String.valueOf(touchPointLIZJ.touchPointId));
            linkedHashMap.put("touch_point_name", touchPointLIZJ.touchPointName);
            linkedHashMap.put("launch_plan_id", String.valueOf(touchPointLIZJ.launchPlanId));
            linkedHashMap.put("touch_point_ab_versions", String.valueOf(touchPointLIZJ.abVersions));
            C1619720sFe c1619720sFe = C1619720sFe.LIZ;
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
            if (abstractC1896090zRP != null) {
                strLJIJJ = abstractC1896090zRP.LJIJJ();
            } else {
                strLJIJJ = null;
            }
            linkedHashMap.put("region", strLJIJJ);
            linkedHashMap.put("cold_start_cnt", String.valueOf(C1895930zR9.LIZJ));
            if (C1894310zOX.LIZIZ()) {
                str3 = "1";
            } else {
                str3 = CardStruct.IStatusCode.DEFAULT;
            }
            linkedHashMap.put("is_login", str3);
            if (str2.length() > 0) {
                linkedHashMap.put("sub_type", str2);
            }
            if (num2 != null) {
                linkedHashMap.put("vv_cnt", num2.toString());
            }
            if (str != null) {
                linkedHashMap.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, str);
            }
            Map<String, String> map2 = touchPointLIZJ.customEventParams;
            if (map2 != null) {
                linkedHashMap.putAll(map2);
            }
            linkedHashMap.putAll(map);
            if (i == 4) {
                linkedHashMap.putAll(C1893790zNh.LIZJ(C1893790zNh.LIZ));
                linkedHashMap.put("vv_cnt_total", String.valueOf(C1895930zR9.LIZLLL));
            } else if (i == 2) {
                ITouchPointModuleService iTouchPointModuleService = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null);
                if (iTouchPointModuleService != null) {
                    iTouchPointModuleService.LJIILLIIL();
                }
                linkedHashMap.put("task_status", "");
            }
            InterfaceC1897260zTI interfaceC1897260zTILIZIZ = c1619720sFe.LIZIZ();
            if (interfaceC1897260zTILIZIZ != null) {
                interfaceC1897260zTILIZIZ.LIZ("touch_point_show", linkedHashMap);
            }
            C1893680zNW.LIZ.getClass();
            C1893680zNW.LJIIIIZZ(touchPointLIZJ);
        }
        ITouchPointModuleService iTouchPointModuleService2 = (ITouchPointModuleService) PluggableExtentionKt.pluggableSpi$default(ITouchPointModuleService.class, false, false, false, 14, null);
        if (iTouchPointModuleService2 != null) {
            iTouchPointModuleService2.LJIIJ();
        }
    }

    public static void LJFF(C1894320zOY c1894320zOY, int i, String str, int i2, String str2, String str3, Integer num, String str4, Map map, int i3) {
        if ((i3 & 32) != 0) {
            str3 = null;
        }
        if ((i3 & 64) != 0) {
            num = null;
        }
        if ((i3 & 128) != 0) {
            str4 = null;
        }
        if ((i3 & 256) != 0) {
            map = null;
        }
        c1894320zOY.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("click_position", "timer_widget");
        linkedHashMap.put("task_key", str);
        linkedHashMap.put("sub_type", "");
        linkedHashMap.put("task_status", str3);
        linkedHashMap.put("single_status", str4);
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        LJIILJJIL(i, linkedHashMap, num, Integer.valueOf(i2), str2);
    }
}
