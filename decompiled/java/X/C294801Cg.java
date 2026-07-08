package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;
import kotlin.text.u;

/* JADX INFO: renamed from: X.01Cg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C294801Cg {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZIZ(String str) {
        boolean z;
        Uri uri;
        String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6 = true;
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return str;
        }
        if (!u.LJJIIJZLJL(str, "http://", false) && !u.LJJIIJZLJL(str, "https://", false) && !u.LJJIIJZLJL(str, "local_file://", false)) {
            if (!u.LJJIIJZLJL(str, "lynxview://", false) && !u.LJJIIJZLJL(str, "aweme://", false) && !u.LJJIIJZLJL(str, "sslocal://", false) && !u.LJJIIJZLJL(str, "hybrid://", false)) {
                return str;
            }
            try {
                uri = UriProtector.parse(str);
                strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "surl");
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter == null) {
                    strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "url");
                }
                if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter.length() != 0) {
                    z2 = false;
                } else {
                    z2 = true;
                }
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (!z2) {
                return LIZIZ(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter);
            }
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "channel");
            String strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, "bundle");
            StringBuilder sb = new StringBuilder();
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2 != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2.length() != 0) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (!z3) {
                sb.append("channel=");
                sb.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter2);
            }
            if (strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3 != null && strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3.length() != 0) {
                z4 = false;
            } else {
                z4 = true;
            }
            if (!z4) {
                if (sb.length() > 0) {
                    z5 = true;
                } else {
                    z5 = false;
                }
                if (z5) {
                    sb.append("&");
                }
                sb.append("bundle=");
                sb.append(strCom_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter3);
            }
            if (sb.length() <= 0) {
                z6 = false;
            }
            if (z6) {
                return sb.toString();
            }
            return str;
        }
        try {
            String path = UriProtector.parse(str).getPath();
            if (path != null) {
                return path;
            }
            return str;
        } catch (Exception e2) {
            TryCatchGuardChecker.doCheck(e2);
            return str;
        }
    }

    public static Number LIZ(Number number, Number number2) {
        if (number == null) {
            if (number2 == null) {
                return -3;
            }
            return -1;
        }
        if (number2 == null) {
            return -2;
        }
        double dDoubleValue = number.doubleValue();
        double dDoubleValue2 = number2.doubleValue();
        if (dDoubleValue > dDoubleValue2) {
            return -4;
        }
        return Double.valueOf(dDoubleValue2 - dDoubleValue);
    }

    public static Map LIZJ(String str, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (Map.Entry entry : map.entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            if (u.LJIIZILJ(str2, "Start", false)) {
                String strLJJJLL = a0.LJJJLL("Start", str2);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append(strLJJJLL);
                sbLIZ.append("End");
                LJ(linkedHashSet, map, linkedHashMap, str, strLJJJLL, str2, C2188811AlT.LIZIZ(sbLIZ));
            } else if (u.LJIIZILJ(str2, "End", false)) {
                String strLJJJLL2 = a0.LJJJLL("End", str2);
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(strLJJJLL2);
                sbLIZ2.append("Start");
                LJ(linkedHashSet, map, linkedHashMap, str, strLJJJLL2, C2188811AlT.LIZIZ(sbLIZ2), str2);
            } else if (value instanceof Map) {
                Map map2 = (Map) value;
                if (map2 != null) {
                    Object obj = map2.get("duration");
                    Object obj2 = map2.get("name");
                    if (obj != null && (obj2 instanceof String) && Intrinsics.LJFF(obj2, str2)) {
                        linkedHashMap.put(str2, obj);
                    } else {
                        linkedHashMap.putAll(LIZJ(str2, map2));
                    }
                } else {
                    linkedHashMap.put(LIZLLL(str, str2), value);
                }
            } else {
                linkedHashMap.put(LIZLLL(str, str2), value);
            }
        }
        return linkedHashMap;
    }

    public static final String LIZLLL(String str, String str2) {
        String str3;
        if (str != null) {
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            if (str2.length() > 0) {
                str3 = ((Object) String.valueOf(str2.charAt(0)).toUpperCase(Locale.ROOT)) + str2.substring(1);
            } else {
                str3 = str2;
            }
            sb.append(str3);
            String string = sb.toString();
            if (string != null) {
                return string;
            }
        }
        return str2;
    }

    public static final void LJ(Set<String> set, Map<String, ? extends Object> map, Map<String, Object> map2, String str, String str2, String str3, String str4) {
        Number number;
        if (set.contains(str2)) {
            return;
        }
        set.add(str2);
        String strLIZLLL = LIZLLL(str, str2);
        Object obj = map.get(str3);
        Number number2 = null;
        if (obj instanceof Number) {
            number = (Number) obj;
        } else {
            number = null;
        }
        Object obj2 = map.get(str4);
        if (obj2 instanceof Number) {
            number2 = (Number) obj2;
        }
        map2.put(strLIZLLL, LIZ(number, number2));
    }
}
