package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.mall.customdot.state.ReachCfgDataForMall;
import java.util.Arrays;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0w5o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1767380w5o {
    public static final JSONObject LIZ(String str) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("mall_homepage_visited_type", EnumC587230N1l.CLICK_TO_SHOP.getValue());
        Object[] objArr = new Object[1];
        if (str == null) {
            str = "";
        }
        objArr[0] = str;
        jSONObject.put("mall_out_source", C786410Ut5.j4("%s.in_app", Arrays.copyOf(objArr, 1)));
        return jSONObject;
    }

    public static final String LIZIZ(ReachCfgDataForMall reachCfgDataForMall, String str) {
        String string;
        String string2;
        String string3;
        String string4;
        String string5;
        String string6;
        Map<String, ? extends Object> map;
        String string7;
        String string8;
        String string9;
        String string10;
        String string11;
        String string12 = null;
        if (C7879035x.LIZLLL()) {
            if (reachCfgDataForMall == null || (map = reachCfgDataForMall.tabUiTrackParams) == null) {
                return null;
            }
            Object obj = map.get("bubble_type");
            Object obj2 = map.get("bubble_text_type");
            Object obj3 = map.get("bubble_aware_type");
            Object obj4 = map.get("effect_name");
            Object obj5 = map.get("red_dot_type");
            Object obj6 = map.get("show_type");
            if (obj != null) {
                string7 = obj.toString();
            } else {
                string7 = null;
            }
            if (obj2 != null) {
                string8 = obj2.toString();
            } else {
                string8 = null;
            }
            if (obj3 != null) {
                string9 = obj3.toString();
            } else {
                string9 = null;
            }
            if (obj4 != null) {
                string10 = obj4.toString();
            } else {
                string10 = null;
            }
            if (obj5 != null) {
                string11 = obj5.toString();
            } else {
                string11 = null;
            }
            if (obj6 != null) {
                string12 = obj6.toString();
            }
            return LIZLLL(str, string7, string8, string10, string11, Boolean.FALSE, string12, string9);
        }
        if (reachCfgDataForMall != null) {
            try {
                Map<String, ? extends Object> map2 = reachCfgDataForMall.tabUiTrackParams;
                if (map2 != null) {
                    Object obj7 = map2.get("bubble_type");
                    Object obj8 = map2.get("bubble_text_type");
                    Object obj9 = map2.get("bubble_aware_type");
                    Object obj10 = map2.get("effect_name");
                    Object obj11 = map2.get("red_dot_type");
                    Object obj12 = map2.get("show_type");
                    if (obj7 != null) {
                        string = obj7.toString();
                    } else {
                        string = null;
                    }
                    if (obj8 != null) {
                        string2 = obj8.toString();
                    } else {
                        string2 = null;
                    }
                    if (obj9 != null) {
                        string3 = obj9.toString();
                    } else {
                        string3 = null;
                    }
                    if (obj10 != null) {
                        string4 = obj10.toString();
                    } else {
                        string4 = null;
                    }
                    if (obj11 != null) {
                        string5 = obj11.toString();
                    } else {
                        string5 = null;
                    }
                    if (obj12 == null) {
                        string6 = null;
                    } else {
                        string6 = obj12.toString();
                    }
                    return LIZLLL(str, string, string2, string4, string5, Boolean.FALSE, string6, string3);
                }
            } catch (CancellationException e) {
                TryCatchGuardChecker.doCheck(e);
                throw e;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C1AF0.LJ(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
                return null;
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00f5  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final org.json.JSONObject LIZJ(com.ss.android.ugc.aweme.ecommerce.mall.customdot.state.ReachCfgDataForMall r6, java.lang.String r7, java.util.Map r8) throws org.json.JSONException {
        /*
            Method dump skipped, instruction units count: 263
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1767380w5o.LIZJ(com.ss.android.ugc.aweme.ecommerce.mall.customdot.state.ReachCfgDataForMall, java.lang.String, java.util.Map):org.json.JSONObject");
    }

    public static final String LIZLLL(String str, String str2, String str3, String str4, String str5, Boolean bool, String str6, String str7) {
        String str8;
        if (str2 != null) {
            if (Intrinsics.LJFF(str5, EnumC1754390vkr.NONE.getValue())) {
                return C786410Ut5.j4("%s.bubble.%s_%s.in_app", Arrays.copyOf(new Object[]{str, str3, str2}, 3));
            }
            if (!Intrinsics.LJFF(str5, EnumC1754390vkr.NONE.getValue())) {
                if (Intrinsics.LJFF(str7, "strong")) {
                    str8 = "_bubble_aware_strong";
                } else if (Intrinsics.LJFF(str7, "weak")) {
                    str8 = "_bubble_aware_weak";
                } else {
                    str8 = "";
                }
                if (Intrinsics.LJFF(bool, Boolean.TRUE)) {
                    str8 = "_next_session";
                }
                return C786410Ut5.j4("%s.%s_red_dot.%s_%s_%s%s.in_app", Arrays.copyOf(new Object[]{str, str5, str6, str3, str2, str8}, 6));
            }
        }
        if (str4 != null) {
            if (Intrinsics.LJFF(str5, EnumC1754390vkr.NONE.getValue())) {
                return C786410Ut5.j4("%s.special_red_dot.%s.in_app", Arrays.copyOf(new Object[]{str, str4}, 2));
            }
            if (!Intrinsics.LJFF(str5, EnumC1754390vkr.NONE.getValue())) {
                return C786410Ut5.j4("%s.%s_red_dot.special_red_dot_%s.in_app", Arrays.copyOf(new Object[]{str, str5, str4}, 3));
            }
        }
        if (str2 == null && str4 == null && !Intrinsics.LJFF(str5, EnumC1754390vkr.NONE.getValue()) && str6 != null) {
            if (a0.LJJIIZI(str6, "icon", false)) {
                return C786410Ut5.j4("%s.%s_red_dot.special_red_dot.in_app", Arrays.copyOf(new Object[]{str, str5}, 2));
            }
            return C786410Ut5.j4("%s.%s_red_dot.%s.in_app", Arrays.copyOf(new Object[]{str, str5, str6}, 3));
        }
        return null;
    }
}
