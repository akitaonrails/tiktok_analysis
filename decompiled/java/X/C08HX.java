package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Charsets;
import kotlin.text.a0;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.08HX, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08HX {
    public static final C08HX LIZ = new C08HX();
    public static final char[] LIZIZ = "0123456789abcdef".toCharArray();

    public static final String LJIIIIZZ() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(System.currentTimeMillis());
        sbLIZ.append('-');
        sbLIZ.append(UUID.randomUUID());
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final String LIZIZ(String str) {
        Object c098200Yq;
        Object obj = null;
        try {
            String strLIZJ = C08HM.LIZJ(str);
            if (strLIZJ != null) {
                c098200Yq = C13LN.LJZL(8, strLIZJ);
            } else {
                c098200Yq = null;
            }
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        if (!C189200o6.m7isFailureimpl(c098200Yq)) {
            obj = c098200Yq;
        }
        String str2 = (String) obj;
        if (str2 == null) {
            return "00000000";
        }
        return str2;
    }

    public static final List<Object> LIZLLL(JSONArray jSONArray) throws JSONException {
        ArrayList arrayList = new ArrayList();
        if (jSONArray == null) {
            return arrayList;
        }
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                arrayList.add(LJ((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                arrayList.add(LIZLLL((JSONArray) obj));
            } else {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static final Map<String, Object> LJ(JSONObject jSONObject) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                linkedHashMap.put(next, LJ((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                linkedHashMap.put(next, LIZLLL((JSONArray) obj));
            } else {
                linkedHashMap.put(next, obj);
            }
        }
        return linkedHashMap;
    }

    public final String LJII(String str) {
        String strLIZIZ;
        Uri uri = UriProtector.parse(str);
        if (uri.isOpaque()) {
            return str;
        }
        String str2 = "";
        if (uri.getScheme() != null && uri.getAuthority() != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(uri.getScheme());
            sbLIZ.append("://");
            sbLIZ.append(uri.getAuthority());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        } else if (uri.getScheme() == null && uri.getAuthority() != null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append("//");
            sbLIZ2.append(uri.getAuthority());
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
        } else if (uri.getScheme() == null || uri.getAuthority() != null) {
            strLIZIZ = "";
        } else {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(uri.getScheme());
            sbLIZ3.append(':');
            strLIZIZ = C2188811AlT.LIZIZ(sbLIZ3);
        }
        StringBuilder sb = new StringBuilder();
        String path = uri.getPath();
        if (path != null) {
            str2 = path;
        }
        sb.append(str2);
        String query = uri.getQuery();
        if (query != null && query.length() > 0) {
            sb.append('?');
            sb.append(query);
        }
        String string = sb.toString();
        if (strLIZIZ.length() > 0) {
            StringBuilder sbLIZ4 = C2188811AlT.LIZ();
            sbLIZ4.append(strLIZIZ);
            sbLIZ4.append('/');
            sbLIZ4.append(LIZJ(this, string));
            return C2188811AlT.LIZIZ(sbLIZ4);
        }
        return LIZJ(this, string);
    }

    public static final String LIZ(String str, String str2) {
        Object c098200Yq;
        if (str == null) {
            return "";
        }
        try {
            c098200Yq = UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(UriProtector.parse(str), str2);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C1520960pgM.LIZIZ(thM5exceptionOrNullimpl);
        }
        if (C189200o6.m7isFailureimpl(c098200Yq)) {
            c098200Yq = null;
        }
        String str3 = (String) c098200Yq;
        if (str3 == null) {
            return "";
        }
        return str3;
    }

    public static String LIZJ(C08HX c08hx, String str) {
        c08hx.getClass();
        byte[] bArrDigest = MessageDigest.getInstance("SHA-256").digest(str.getBytes(Charsets.UTF_8));
        char[] cArr = new char[bArrDigest.length * 2];
        int i = 0;
        for (byte b : bArrDigest) {
            int i2 = b & 255;
            int i3 = i + 1;
            char[] cArr2 = LIZIZ;
            cArr[i] = cArr2[i2 >>> 4];
            i = i3 + 1;
            cArr[i3] = cArr2[i2 & 15];
        }
        return new String(cArr);
    }

    public static final <K, V> Map<K, V> LJFF(Map<K, ? extends V> map, K... kArr) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (K k : kArr) {
            if (map.containsKey(k)) {
                linkedHashMap.put(k, map.get(k));
            }
        }
        return linkedHashMap;
    }

    public static final String LJI(List<String> list, List<String> list2) {
        int i;
        boolean z;
        String string = "";
        loop0: for (String str : list) {
            for (String str2 : list2) {
                if (str != null && !a0.LJJJIL(str)) {
                    Matcher matcher = PatternProtector.compile(str2).matcher(str);
                    if (matcher.find()) {
                        String strGroup = matcher.group(1);
                        int length = strGroup.length() - 1;
                        int i2 = 0;
                        boolean z2 = false;
                        while (i2 <= length) {
                            if (!z2) {
                                i = i2;
                            } else {
                                i = length;
                            }
                            if (Intrinsics.LJI(strGroup.charAt(i), 32) <= 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z2) {
                                if (!z) {
                                    z2 = true;
                                } else {
                                    i2++;
                                }
                            } else {
                                if (!z) {
                                    break;
                                }
                                length--;
                            }
                        }
                        string = strGroup.subSequence(i2, length + 1).toString();
                    }
                    if (!a0.LJJJIL(string)) {
                        break loop0;
                    }
                }
            }
        }
        return string;
    }
}
