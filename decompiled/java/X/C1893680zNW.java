package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.touchpoint.api.model.CoinBottomTab;
import com.bytedance.touchpoint.api.model.TouchPoint;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Unit;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0zNW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1893680zNW {
    public static final C1893680zNW LIZ = new C1893680zNW();

    public static void LJIIIIZZ(TouchPoint touchPoint) {
        String strLJIJJ;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("touch_point_id", touchPoint.touchPointId);
            jSONObject.put("launch_plan_id", touchPoint.launchPlanId);
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
            if (abstractC1896090zRP != null) {
                strLJIJJ = abstractC1896090zRP.LJIJJ();
            } else {
                strLJIJJ = null;
            }
            jSONObject.put("region", strLJIJJ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZIZ("touchpoint_show_monitor", jSONObject);
        }
    }

    public static void LJIIIZ(C1893670zNV c1893670zNV) {
        int iIntValue;
        String strLJIJJ;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("touch_point_id", c1893670zNV.LIZ);
            Integer num = c1893670zNV.LIZJ;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            jSONObject.put("launch_plan_id", iIntValue);
            C1619720sFe c1619720sFe = C1619720sFe.LIZ;
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
            if (abstractC1896090zRP != null) {
                strLJIJJ = abstractC1896090zRP.LJIJJ();
            } else {
                strLJIJJ = null;
            }
            jSONObject.put("region", strLJIJJ);
            InterfaceC1897260zTI interfaceC1897260zTILIZIZ = c1619720sFe.LIZIZ();
            if (interfaceC1897260zTILIZIZ != null) {
                interfaceC1897260zTILIZIZ.LIZIZ("touchpoint_show_monitor", jSONObject);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZJ(int i, String str) {
        String strLJIJJ;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", i);
            jSONObject.put("taskId", str);
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
            if (abstractC1896090zRP != null) {
                strLJIJJ = abstractC1896090zRP.LJIJJ();
            } else {
                strLJIJJ = null;
            }
            jSONObject.put("region", strLJIJJ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZIZ("campaign_task_finish_monitor", jSONObject);
        }
    }

    public static void LJ(TouchPoint touchPoint, String str) {
        String strLJIJJ;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("touch_point_id", touchPoint.touchPointId);
            jSONObject.put("launch_plan_id", touchPoint.launchPlanId);
            jSONObject.put("click_position", str);
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
            if (abstractC1896090zRP != null) {
                strLJIJJ = abstractC1896090zRP.LJIJJ();
            } else {
                strLJIJJ = null;
            }
            jSONObject.put("region", strLJIJJ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZIZ("touchpoint_click_monitor", jSONObject);
        }
    }

    public static void LJFF(C1893670zNV c1893670zNV, String str) {
        int iIntValue;
        String strLJIJJ;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("touch_point_id", c1893670zNV.LIZ);
            Integer num = c1893670zNV.LIZJ;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = -1;
            }
            jSONObject.put("launch_plan_id", iIntValue);
            jSONObject.put("click_position", str);
            C1619720sFe c1619720sFe = C1619720sFe.LIZ;
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) c1619720sFe.LIZ(0);
            if (abstractC1896090zRP != null) {
                strLJIJJ = abstractC1896090zRP.LJIJJ();
            } else {
                strLJIJJ = null;
            }
            jSONObject.put("region", strLJIJJ);
            InterfaceC1897260zTI interfaceC1897260zTILIZIZ = c1619720sFe.LIZIZ();
            if (interfaceC1897260zTILIZIZ != null) {
                interfaceC1897260zTILIZIZ.LIZIZ("touchpoint_click_monitor", jSONObject);
            }
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LJIIJ(C1893680zNW c1893680zNW, C1893670zNV c1893670zNV) {
        String strLJIJJ;
        Integer numValueOf;
        c1893680zNW.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
            Integer num = null;
            if (abstractC1896090zRP != null) {
                strLJIJJ = abstractC1896090zRP.LJIJJ();
            } else {
                strLJIJJ = null;
            }
            jSONObject.put("region", strLJIJJ);
            jSONObject.put("material_id", "");
            if (c1893670zNV != null) {
                numValueOf = Integer.valueOf(c1893670zNV.LIZ);
            } else {
                numValueOf = null;
            }
            jSONObject.put("touch_point_id", numValueOf);
            if (c1893670zNV != null) {
                num = c1893670zNV.LIZJ;
            }
            jSONObject.put("launch_plan_id", num);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZIZ("touchpoint_valid_failed_monitor", jSONObject);
        }
        InterfaceC1893690zNX interfaceC1893690zNX = (InterfaceC1893690zNX) PluggableExtentionKt.pluggableSpi$default(InterfaceC1893690zNX.class, false, false, false, 14, null);
        if (interfaceC1893690zNX != null) {
            interfaceC1893690zNX.LIZ();
        }
    }

    public static void LJIIJJI(int i, Integer num) {
        TouchPoint touchPointLIZJ;
        String strLJIJJ = null;
        if (i == 29) {
            C1893670zNV c1893670zNVLIZ = C1874850yt9.LIZ(i, CoinBottomTab.class);
            if (c1893670zNVLIZ != null) {
                int i2 = c1893670zNVLIZ.LIZ;
                String str = c1893670zNVLIZ.LIZIZ;
                String str2 = "";
                if (str == null) {
                    str = "";
                }
                Integer num2 = c1893670zNVLIZ.LIZJ;
                Map<String, String> map = c1893670zNVLIZ.LJ;
                String str3 = c1893670zNVLIZ.LIZLLL;
                String str4 = c1893670zNVLIZ.LJFF;
                if (str4 != null) {
                    str2 = str4;
                }
                touchPointLIZJ = new TouchPoint(i2, str, num2, map, null, str3, "", str2, c1893670zNVLIZ.LJI, null, null, false);
            } else {
                return;
            }
        } else {
            C01GW<C1894700zPA> c01gw = C1894700zPA.LJIJ;
            touchPointLIZJ = C2178808gE.LIZ().LIZJ(i, num);
            if (touchPointLIZJ == null) {
                return;
            }
        }
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("touch_point_id", touchPointLIZJ.touchPointId);
            jSONObject.put("launch_plan_id", touchPointLIZJ.launchPlanId);
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
            if (abstractC1896090zRP != null) {
                strLJIJJ = abstractC1896090zRP.LJIJJ();
            }
            jSONObject.put("region", strLJIJJ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZIZ("touchpoint_will_show_monitor", jSONObject);
        }
    }

    public static void LJII(int i, String str, String str2) {
        String strLJIJJ;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i);
            jSONObject.put("path", str);
            if (str2 == null) {
                str2 = "";
            }
            jSONObject.put("enter_from", str2);
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
            if (abstractC1896090zRP != null) {
                strLJIJJ = abstractC1896090zRP.LJIJJ();
            } else {
                strLJIJJ = null;
            }
            jSONObject.put("region", strLJIJJ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZIZ("touchpoint_router_monitor", jSONObject);
        }
    }

    public static void LIZ(final int i, final int i2, final int i3, final int i4, final String str) {
        C15O7.LIZJ(new Callable() { // from class: X.0yFH
            public final /* synthetic */ String LLILZ = "";

            @Override // java.util.concurrent.Callable
            public final Object call() {
                C1C7U.LIZ("ApmMonitorUtils@31c.monitorResourceLoad$1");
                JSONObject jSONObject = new JSONObject();
                Unit unit = null;
                try {
                    jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i);
                    jSONObject.put("touch_point_id", i2);
                    jSONObject.put("launch_plan_id", i3);
                    jSONObject.put("material_id", this.LLILZ);
                    jSONObject.put("error_msg", str);
                    AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
                    jSONObject.put("region", abstractC1896090zRP != null ? abstractC1896090zRP.LJIJJ() : null);
                    jSONObject.put("load_method", i4);
                } catch (JSONException e) {
                    TryCatchGuardChecker.doCheck(e);
                }
                InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
                if (interfaceC1897260zTILIZIZ != null) {
                    interfaceC1897260zTILIZIZ.LIZIZ("touchpoint_load_resource_monitor", jSONObject);
                    unit = Unit.LIZ;
                }
                C1C7U.LIZIZ("ApmMonitorUtils@31c.monitorResourceLoad$1");
                return unit;
            }
        });
    }

    public static void LIZLLL(int i, int i2, int i3, int i4, String str) {
        String strLJIJJ;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i);
            jSONObject.put("task_id", str);
            jSONObject.put("task_type", i2);
            jSONObject.put("task_time", i3);
            jSONObject.put("launch_method", i4);
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
            if (abstractC1896090zRP != null) {
                strLJIJJ = abstractC1896090zRP.LJIJJ();
            } else {
                strLJIJJ = null;
            }
            jSONObject.put("region", strLJIJJ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZIZ("campaign_task_start_monitor", jSONObject);
        }
    }

    public static void LJI(long j, String str, int i, String str2, Integer num) {
        String strLJIJJ;
        JSONObject jSONObject = new JSONObject();
        try {
            Uri uriLJ = C1946007jm.LJ(str);
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJ, "url");
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uriLJ, "surl")) == null) {
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "no_url";
            }
            String path = UriProtector.parse(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).getPath();
            if (path == null) {
                path = "no_path";
            }
            jSONObject.put(FollowStatusChangeMethod.PARAM_FOLLOW_STATUS, i);
            jSONObject.put("path", path);
            jSONObject.put("duration", j);
            if (num != null) {
                jSONObject.put("error_code", num.intValue());
            }
            if (str2 != null) {
                jSONObject.put("error_reason", str2);
                if (C1619720sFe.LIZ.LIZ(1003) != null) {
                    for (Map.Entry entry : C2097608Jq.LJ().entrySet()) {
                        jSONObject.put((String) entry.getKey(), entry.getValue());
                    }
                }
            }
            AbstractC1896090zRP abstractC1896090zRP = (AbstractC1896090zRP) C1619720sFe.LIZ.LIZ(0);
            if (abstractC1896090zRP != null) {
                strLJIJJ = abstractC1896090zRP.LJIJJ();
            } else {
                strLJIJJ = null;
            }
            jSONObject.put("region", strLJIJJ);
        } catch (JSONException e) {
            TryCatchGuardChecker.doCheck(e);
        }
        InterfaceC1897260zTI interfaceC1897260zTILIZIZ = C1619720sFe.LIZ.LIZIZ();
        if (interfaceC1897260zTILIZIZ != null) {
            interfaceC1897260zTILIZIZ.LIZIZ("touchpoint_load_spark_monitor", jSONObject);
        }
    }
}
