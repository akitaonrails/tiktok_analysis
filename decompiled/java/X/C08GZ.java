package X;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Pair;
import com.bytedance.frameworks.encryptor.EncryptorUtil;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: renamed from: X.08GZ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08GZ {
    public static InterfaceC2088208Ga LIZ;

    public static String LIZIZ(String str) {
        try {
            return URLEncoder.encode(str, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            TryCatchGuardChecker.doCheck(e);
            throw new IllegalArgumentException(e);
        }
    }

    public static String LIZJ(boolean z, List list) {
        StringBuilder sb = new StringBuilder();
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            Pair pair = (Pair) it2.next();
            String strLIZIZ = (String) pair.first;
            if (z) {
                strLIZIZ = LIZIZ(strLIZIZ);
            }
            List<String> list2 = (List) pair.second;
            if (list2 != null && list2.size() > 0) {
                for (String strLIZIZ2 : list2) {
                    if (z) {
                        if (strLIZIZ2 != null) {
                            strLIZIZ2 = LIZIZ(strLIZIZ2);
                        } else {
                            strLIZIZ2 = "";
                        }
                    }
                    if (sb.length() > 0) {
                        sb.append("&");
                    }
                    sb.append(strLIZIZ);
                    sb.append("=");
                    sb.append(strLIZIZ2);
                }
            }
        }
        return sb.toString();
    }

    public static void LIZLLL(Uri uri, Map<String, List<String>> map) throws IOException {
        if (uri != null) {
            try {
                String encodedQuery = uri.getEncodedQuery();
                if (encodedQuery != null) {
                    for (String str : encodedQuery.split("&")) {
                        int iIndexOf = str.indexOf("=");
                        if (iIndexOf >= 0) {
                            String strDecode = URLDecoder.decode(str.substring(0, iIndexOf), "UTF-8");
                            List<String> linkedList = (List) ((LinkedHashMap) map).get(strDecode);
                            if (linkedList == null) {
                                linkedList = new LinkedList<>();
                            }
                            linkedList.add(URLDecoder.decode(str.substring(iIndexOf + 1), "UTF-8"));
                            map.put(strDecode, linkedList);
                        } else {
                            String strDecode2 = URLDecoder.decode(str, "UTF-8");
                            List<String> linkedList2 = (List) ((LinkedHashMap) map).get(strDecode2);
                            if (linkedList2 == null) {
                                linkedList2 = new LinkedList<>();
                            }
                            linkedList2.add("");
                            map.put(strDecode2, linkedList2);
                        }
                    }
                    return;
                }
                return;
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw new IOException("parseUrl url is null !!!");
            }
        }
        throw new IOException("parseUrl url is null !!!");
    }

    public static String LJFF(String str, List<Pair<String, String>> list) {
        if (TextUtils.isEmpty(str) || LIZ == null) {
            return str;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        try {
            Uri uri = UriProtector.parse(str);
            LIZLLL(uri, linkedHashMap);
            LinkedList linkedList = new LinkedList();
            LJ("device_id", linkedList, linkedHashMap);
            LJ("device_type", linkedList, linkedHashMap);
            LJ("device_brand", linkedList, linkedHashMap);
            LJ("uuid", linkedList, linkedHashMap);
            LJ("openudid", linkedList, linkedHashMap);
            String strLIZJ = LIZJ(false, linkedList);
            if (TextUtils.isEmpty(strLIZJ)) {
                return str;
            }
            byte[] bytes = strLIZJ.getBytes();
            byte[] bArrLIZ = EncryptorUtil.LIZ(bytes.length, bytes);
            if (bArrLIZ == null) {
                return str;
            }
            String strEncodeToString = Base64.encodeToString(bArrLIZ, 2);
            LinkedList linkedList2 = new LinkedList();
            if (LIZ.LJI()) {
                LinkedList linkedList3 = new LinkedList();
                linkedList3.add(strEncodeToString);
                linkedList2.add(new Pair("ss_queries", linkedList3));
            }
            if (LIZ.LIZIZ()) {
                ((LinkedList) list).add(new Pair("X-SS-QUERIES", LIZIZ(strEncodeToString)));
            }
            if (!linkedHashMap.isEmpty()) {
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    if (entry != null) {
                        linkedList2.add(new Pair(entry.getKey(), entry.getValue()));
                    }
                }
            }
            String strLIZJ2 = LIZJ(true, linkedList2);
            return LIZ(uri.getPort(), uri.getScheme(), uri.getHost(), uri.getPath(), strLIZJ2, uri.getFragment()).toString();
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            return str;
        }
    }

    public static void LJ(String str, List list, Map map) {
        if (!TextUtils.isEmpty(str) && map.containsKey(str)) {
            ((LinkedList) list).add(new Pair(str, ((LinkedHashMap) map).get(str)));
            if (!LIZ.LJII()) {
                map.remove(str);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static android.net.Uri LIZ(int r2, java.lang.String r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            if (r4 == 0) goto L1e
            if (r3 == 0) goto L11
            r1.append(r3)
            java.lang.String r0 = "://"
            r1.append(r0)
        L11:
            r1.append(r4)
            if (r2 <= 0) goto L1e
            r0 = 58
            r1.append(r0)
            r1.append(r2)
        L1e:
            if (r5 == 0) goto L28
            java.lang.String r0 = "/"
            boolean r0 = r5.startsWith(r0)
            if (r0 != 0) goto L2f
        L28:
            r0 = 47
            r1.append(r0)
            if (r5 == 0) goto L32
        L2f:
            r1.append(r5)
        L32:
            if (r6 == 0) goto L3c
            r0 = 63
            r1.append(r0)
            r1.append(r6)
        L3c:
            if (r7 == 0) goto L46
            r0 = 35
            r1.append(r0)
            r1.append(r7)
        L46:
            java.lang.String r0 = r1.toString()
            android.net.Uri r0 = com.bytedance.mt.protector.impl.UriProtector.parse(r0)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C08GZ.LIZ(int, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String):android.net.Uri");
    }
}
