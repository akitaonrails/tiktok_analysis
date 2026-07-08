package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0Wxn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C840290Wxn {
    public static List LIZ(C840300Wxo c840300Wxo) {
        URL url;
        String protocol;
        String host;
        String path;
        String str;
        boolean z;
        List<String> list;
        List<String> list2;
        Object objLJJJLZIJ;
        List<String> list3;
        Object objLJJJLZIJ2;
        String str2 = c840300Wxo.LIZ;
        HashMap map = null;
        if (str2 != null) {
            try {
                url = new URL(str2);
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
                url = null;
            }
        } else {
            url = null;
        }
        Pair[] pairArr = new Pair[2];
        pairArr[0] = new Pair("trigger_id", "10820");
        String str3 = c840300Wxo.LJ;
        if (str3 == null) {
            str3 = c840300Wxo.LIZLLL;
        }
        pairArr[1] = new Pair("ttnet_task_id", str3);
        Map mapLJIIJ = C2097608Jq.LJIIJ(pairArr);
        Map<String, List<String>> map2 = c840300Wxo.LIZIZ;
        if (map2 != null && (list3 = map2.get("x-tt-logid")) != null && (objLJJJLZIJ2 = C13LP.LJJJLZIJ(0, list3)) != null) {
            mapLJIIJ.put("x_tt_logid", objLJJJLZIJ2);
        }
        Map<String, List<String>> map3 = c840300Wxo.LIZIZ;
        if (map3 != null && (list2 = map3.get("x-tt-traceflag")) != null && (objLJJJLZIJ = C13LP.LJJJLZIJ(0, list2)) != null) {
            mapLJIIJ.put("x_tt_traceflag", objLJJJLZIJ);
        }
        Pair[] pairArr2 = new Pair[10];
        pairArr2[0] = new Pair("url", c840300Wxo.LIZ);
        if (url != null) {
            protocol = url.getProtocol();
        } else {
            protocol = null;
        }
        pairArr2[1] = new Pair("scheme", protocol);
        if (url != null) {
            host = url.getHost();
        } else {
            host = null;
        }
        pairArr2[2] = new Pair("domain_after_tnc", host);
        if (url != null) {
            path = url.getPath();
        } else {
            path = null;
        }
        pairArr2[3] = new Pair("path", path);
        pairArr2[4] = new Pair("event_type", "ttnet");
        pairArr2[5] = new Pair("resp_header", c840300Wxo.LIZIZ);
        Map<String, List<String>> map4 = c840300Wxo.LIZIZ;
        if (map4 != null && (list = map4.get("set-cookie")) != null) {
            str = (String) C13LP.LJJJLZIJ(0, list);
        } else {
            str = null;
        }
        C2086108Ff.LIZ.getClass();
        if (str != null && str.length() != 0) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            map = new HashMap();
            Map<String, String> map5 = C2086108Ff.LIZLLL.get(str);
            if (map5 != null) {
                map.putAll(map5);
            } else {
                List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(str, new String[]{";"}, 0, 6);
                HashMap map6 = new HashMap();
                Iterator it2 = listLJJLIIIJILLIZJL.iterator();
                while (it2.hasNext()) {
                    String[] strArr = (String[]) a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{"="}, 0, 6).toArray(new String[0]);
                    if (strArr.length > 1) {
                        map6.put(strArr[0], strArr[1]);
                    }
                }
                C2086108Ff.LIZLLL.put(str, map6);
                map.putAll(map6);
            }
        }
        pairArr2[6] = new Pair("resp_cookie", map);
        pairArr2[7] = new Pair("function_sig_name", "10820");
        pairArr2[8] = new Pair("response_code", Integer.valueOf(c840300Wxo.LIZJ));
        pairArr2[9] = new Pair("PumbaaPerf", c840300Wxo.LJFF);
        return Collections.singletonList(new C1254404vW(C2097608Jq.LJIIIIZZ(pairArr2), mapLJIIJ));
    }
}
