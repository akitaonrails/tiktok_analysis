package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.h;
import com.google.gson.k;
import com.google.gson.n;
import com.google.gson.q;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.07kw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C1953207kw {
    public static final C1227904rF LIZ = C1227904rF.LIZ;

    public static String LIZ(String str, List list) {
        String string;
        String str2 = (String) ListProtector.get(list, 0);
        LIZ.getClass();
        k kVar = (k) C1227904rF.LIZIZ(str, k.class);
        kVar.getClass();
        if (kVar instanceof n) {
            k kVarLJJIIZ = kVar.LJIILIIL().LJJIIZ(str2);
            if (kVarLJJIIZ == null || (string = kVarLJJIIZ.toString()) == null) {
                return "";
            }
            if (Intrinsics.LJFF(str2, "entrance_info")) {
                string = u.LJJIFFI(u.LJJIFFI(string, "\\\"", "\"", false), "\\\\", "\\", false);
                if (string.length() > 1) {
                    string = string.substring(1, string.length() - 1);
                }
            }
            if (list.size() != 1) {
                return LIZ(string, C13LP.LJJJJIZL(list, 1));
            }
            return string;
        }
        if (kVar instanceof h) {
            String string2 = kVar.LJIIL().LJJIIJZLJL(0).toString();
            if (list.size() != 1) {
                return LIZ(string2, list);
            }
            return string2;
        }
        if (!(kVar instanceof q)) {
            return "";
        }
        return kVar.LJIILJJIL().toString();
    }

    public static String LIZIZ(Uri uri, String str) throws UnsupportedEncodingException {
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str);
        if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
            strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = "";
        }
        String strDecode = URLDecoder.decode(PatternProtector.compile("%(?![0-9A-Fa-f]{2})").matcher(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter).replaceAll("%25"), "UTF-8");
        if (Intrinsics.LJFF(str, "entrance_info")) {
            String strLJJIFFI = u.LJJIFFI(u.LJJIFFI(strDecode, "\\\"", "\"", false), "\\\\", "\\", false);
            if (strLJJIFFI.length() <= 1) {
                return "";
            }
            return strLJJIFFI.substring(1, strLJJIFFI.length() - 1);
        }
        return strDecode;
    }

    public static String LIZJ(String str, String str2) {
        boolean z;
        try {
            Uri uri = UriProtector.parse(str);
            Map<String, List<String>> map = C1915807eu.LIZ().allowedList;
            List<String> list = map.get("*");
            if (list == null) {
                list = C13BV.INSTANCE;
            }
            List<String> list2 = list;
            List<String> list3 = map.get(str2);
            if (list3 == null) {
                list3 = C13BV.INSTANCE;
            }
            List listLJLIL = C13LP.LJLIL(list3, list2);
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str3 : (ArrayList) listLJLIL) {
                List listLJJLIIIJ = a0.LJJLIIIJ(str3, new char[]{'.'}, false, 0, 6);
                String strLIZIZ = LIZIZ(uri, (String) listLJJLIIIJ.get(0));
                if (strLIZIZ == null || strLIZIZ.length() == 0) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    if (listLJJLIIIJ.size() == 1) {
                        linkedHashMap.put(str3, strLIZIZ);
                    } else {
                        String strLIZ = LIZ(strLIZIZ, C13LP.LJJJJIZL(listLJJLIIIJ, 1));
                        if (C770702zh.LIZIZ(strLIZ)) {
                            linkedHashMap.put(str3, strLIZ);
                        }
                    }
                }
            }
            return linkedHashMap.toString();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            C1019103yf.LIZ(EnumC1014603xw.ERR89, e, C2097608Jq.LJIIJ(new Pair("url", str)));
            return "";
        }
    }
}
