package X;

import android.content.Context;
import android.view.View;
import com.bytedance.android.btm.api.BtmSDK;
import com.bytedance.android.btm.api.model.PageFinder;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.zhiliaoapp.musically.R;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS392S0200000_26;
import kotlin.jvm.internal.AwS570S0100000_26;

/* JADX INFO: renamed from: X.0vf6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1750820vf6 {
    public static final C1750820vf6 LIZ = new C1750820vf6();

    public static void LIZJ(View view) {
        if (view == null) {
            return;
        }
        try {
            C1389880mGw c1389880mGw = new C1389880mGw(view);
            c1389880mGw.LIZ(true);
            c1389880mGw.LJIIIZ(view.getContext().getString(2131833086));
            c1389880mGw.LJIIJ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
    }

    public static void LIZLLL(View view, String str) {
        if (view == null) {
            return;
        }
        C1389880mGw c1389880mGw = new C1389880mGw(view);
        c1389880mGw.LIZ(true);
        c1389880mGw.LJIIIZ(str);
        c1389880mGw.LJ(R.raw.icon_exclamation_mark_circle);
        c1389880mGw.LJI(R.attr.a1h);
        c1389880mGw.LJIIJ();
    }

    public static void LJ(View view, boolean z, String str, Map map) {
        String str2;
        Object obj;
        if (view == null) {
            return;
        }
        C1389880mGw c1389880mGw = new C1389880mGw(view);
        c1389880mGw.LIZ(true);
        if (z) {
            c1389880mGw.LJ(R.raw.icon_tick);
            c1389880mGw.LJFF(C960203pA.LIZ(R.attr.ee, view.getContext()));
        }
        c1389880mGw.LJIIIZ(str);
        c1389880mGw.LJIIJ();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        if (map != null && (obj = map.get("previous_page")) != null) {
            linkedHashMap.put("page_name", obj);
        }
        linkedHashMap.put("previous_page", "");
        if (z) {
            str2 = "added_to_cart";
        } else {
            str2 = "add_to_cart_fail";
        }
        linkedHashMap.put("toast_name", str2);
        C1018703yb.LIZIZ("tiktokec_toast_show", linkedHashMap);
    }

    public static void LIZ(final View view, final boolean z, int i, String str, String str2, final String str3, final Map map, final int i2, Integer num, Function0 function0, final Function0 function02) {
        final boolean z2;
        String str4;
        int i3;
        Object obj;
        String str5;
        int i4 = 2;
        if (num != null && num.intValue() == 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && !z2) {
            if (i2 == 1) {
                str5 = "livesdk_tiktokec_cart_entrance_show";
            } else {
                str5 = "tiktokec_cart_entrance_show";
            }
            C1018703yb.LIZLLL(str5, new AwS392S0200000_26(map, (Map<String, ? extends Object>) BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "c47336.d16982", PageFinder.via(view), null, 4, null), (Map<String, ? extends Object>) 99));
        }
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        if (map != null && (obj = map.get("previous_page")) != null) {
            linkedHashMap.put("page_name", obj);
        }
        String str6 = "";
        linkedHashMap.put("previous_page", "");
        if (z2) {
            str4 = "go_to_checkout";
        } else {
            str4 = "added_to_cart";
        }
        if (!z) {
            str4 = "add_to_cart_fail";
        }
        linkedHashMap.put("toast_name", str4);
        C1018703yb.LIZIZ("tiktokec_toast_show", linkedHashMap);
        C1389910mGz c1389910mGz = new C1389910mGz(view);
        c1389910mGz.LIZ.LJIIIZ = view.getRootView();
        c1389910mGz.LJI(R.style.y0);
        if (z) {
            i3 = 0;
        } else {
            i3 = 3;
        }
        c1389910mGz.LIZ.LIZIZ = i3;
        c1389910mGz.LJIIJ(str);
        if (!z) {
            i4 = 3;
        }
        C1360890lWB c1360890lWB = c1389910mGz.LIZ;
        c1360890lWB.LIZLLL = i4;
        if (z) {
            str6 = str2;
        }
        c1360890lWB.LJI = str6;
        c1360890lWB.LJIIIIZZ = new View.OnClickListener() { // from class: X.0vf7
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                Object obj2;
                String str7;
                String str8;
                if (z2) {
                    C1018703yb.LIZIZ("tiktokec_toast_click", linkedHashMap);
                    Function0<Unit> function03 = function02;
                    if (function03 != null) {
                        function03.invoke();
                        return;
                    }
                    return;
                }
                C1750820vf6 c1750820vf6 = C1750820vf6.LIZ;
                View view3 = view;
                boolean z3 = z;
                String str9 = str3;
                int i5 = i2;
                Map<String, Object> map2 = map;
                Map<String, Object> map3 = linkedHashMap;
                c1750820vf6.getClass();
                if (str9 == null) {
                    return;
                }
                C1018703yb.LIZIZ("tiktokec_toast_click", map3);
                C1025203ze c1025203ze = C1025203ze.LIZ;
                Context context = view3.getContext();
                HashMap map4 = null;
                if (map2 != null) {
                    obj2 = map2.get("previous_page");
                } else {
                    obj2 = null;
                }
                if (obj2 instanceof String) {
                    str7 = (String) obj2;
                } else {
                    str7 = null;
                }
                String strLIZIZ = C1733740vDY.LIZIZ(view3, "c47336.d16982");
                c1025203ze.getClass();
                if (map2 != null) {
                    map4 = new HashMap(map2);
                }
                C1025203ze.LIZJ(context, map4, null, null, str7, str9, false, strLIZIZ);
                if (!z3) {
                    return;
                }
                if (i5 == 1) {
                    str8 = "livesdk_tiktokec_cart_entrance_click";
                } else {
                    str8 = "tiktokec_cart_entrance_click";
                }
                C1018703yb.LIZLLL(str8, new AwS392S0200000_26(map2, (Map<String, ? extends Object>) BtmSDK.createReportParams$default(BtmSDK.INSTANCE, "c47336.d16982", PageFinder.via(view3), null, 4, null), (Map<String, ? extends Object>) 98));
            }
        };
        c1389910mGz.LIZIZ(i);
        c1389910mGz.LJ(4000L);
        c1389910mGz.LIZ(false);
        c1389910mGz.LIZLLL(new AwS570S0100000_26(function0, 1241));
        c1389910mGz.LJIIJJI();
    }
}
