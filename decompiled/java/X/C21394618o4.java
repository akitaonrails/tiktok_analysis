package X;

import android.net.Uri;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.AFwS223S0000000_32;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.18o4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21394618o4 {
    public static final C01GW<C21394618o4> LIZIZ = C452501pT.LIZIZ(AFwS223S0000000_32.get$arr$(186));
    public final Map<Object, C21394518o3> LIZ = new LinkedHashMap();

    public static JSONObject LIZIZ(String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return new JSONObject();
            }
            return new JSONObject(str);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return new JSONObject();
        }
    }

    public final void LIZ(int i, InterfaceC1541990qEH interfaceC1541990qEH, String str) {
        JSONObject jSONObjectLIZIZ;
        Iterator<String> itKeys;
        if (str != null) {
            try {
                Uri uri = UriProtector.parse(str);
                if (uri != null && Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "_enable_stay_time_report"), "1") && UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "_enter_from") != null) {
                    HashMap map = new HashMap();
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "_extra_query");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && (itKeys = (jSONObjectLIZIZ = LIZIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)).keys()) != null) {
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            map.put(next, jSONObjectLIZIZ.get(next));
                        }
                    }
                    UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "_project_name");
                    if (interfaceC1541990qEH != null && this.LIZ.containsKey(interfaceC1541990qEH)) {
                        if (i != 1) {
                            if (i == 2) {
                                this.LIZ.remove(interfaceC1541990qEH);
                            }
                        } else {
                            C21394518o3 c21394518o3 = (C21394518o3) ((LinkedHashMap) this.LIZ).get(interfaceC1541990qEH);
                            if (c21394518o3 != null) {
                                c21394518o3.LIZJ = true;
                                c21394518o3.LIZ();
                            }
                        }
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }

    public final void LIZJ(InterfaceC1541990qEH interfaceC1541990qEH, String str, EnumC1067640dtC enumC1067640dtC, int i) {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        C21394518o3 c21394518o3;
        JSONObject jSONObjectLIZIZ;
        Iterator<String> itKeys;
        if (str != null) {
            try {
                Uri uri = UriProtector.parse(str);
                if (uri != null && Intrinsics.LJFF(UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "_enable_stay_time_report"), "1") && (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "_enter_from")) != null) {
                    HashMap map = new HashMap();
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "_extra_query");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && (itKeys = (jSONObjectLIZIZ = LIZIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2)).keys()) != null) {
                        while (itKeys.hasNext()) {
                            String next = itKeys.next();
                            map.put(next, jSONObjectLIZIZ.get(next));
                        }
                    }
                    String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "_project_name");
                    if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 == null) {
                        strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = "unknown";
                    }
                    if (interfaceC1541990qEH != null) {
                        if (i != 1) {
                            if (i == 2) {
                                if (this.LIZ.containsKey(interfaceC1541990qEH)) {
                                    C21394518o3 c21394518o32 = (C21394518o3) ((LinkedHashMap) this.LIZ).get(interfaceC1541990qEH);
                                    if (c21394518o32 != null) {
                                        if (!Intrinsics.LJFF(c21394518o32.LIZ.LIZ, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3) || !Intrinsics.LJFF(c21394518o32.LIZ.LIZIZ, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter)) {
                                            c21394518o32.LIZ();
                                            this.LIZ.remove(interfaceC1541990qEH);
                                            Map<Object, C21394518o3> map2 = this.LIZ;
                                            C21394518o3 c21394518o33 = new C21394518o3(new C21394718o5(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, map, enumC1067640dtC));
                                            c21394518o33.LIZIZ();
                                            map2.put(interfaceC1541990qEH, c21394518o33);
                                            return;
                                        }
                                        return;
                                    }
                                    return;
                                }
                                Map<Object, C21394518o3> map3 = this.LIZ;
                                C21394518o3 c21394518o34 = new C21394518o3(new C21394718o5(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3, strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter, map, enumC1067640dtC));
                                c21394518o34.LIZIZ();
                                map3.put(interfaceC1541990qEH, c21394518o34);
                                return;
                            }
                            return;
                        }
                        if (this.LIZ.containsKey(interfaceC1541990qEH) && (c21394518o3 = (C21394518o3) ((LinkedHashMap) this.LIZ).get(interfaceC1541990qEH)) != null && c21394518o3.LIZJ) {
                            c21394518o3.LIZJ = false;
                            c21394518o3.LIZIZ();
                        }
                    }
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
    }
}
