package X;

import android.util.LruCache;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.08Ff, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2086108Ff {
    public static final C2086108Ff LIZ = new C2086108Ff();
    public static final LruCache<String, Map<String, List<String>>> LIZIZ = new LruCache<>(100);
    public static final LruCache<String, Map<String, String>> LIZJ = new LruCache<>(100);
    public static final LruCache<String, Map<String, String>> LIZLLL = new LruCache<>(100);

    public static Map LIZ(String str) throws UnsupportedEncodingException {
        if (str.length() == 0) {
            return C2097608Jq.LJ();
        }
        Map<String, List<String>> map = LIZIZ.get(str);
        if (map != null) {
            return map;
        }
        HashMap map2 = new HashMap();
        Iterator it2 = a0.LJJLIIIJ(str, new char[]{'&'}, false, 0, 6).iterator();
        while (it2.hasNext()) {
            List listLJJLIIIJ = a0.LJJLIIIJ((String) it2.next(), new char[]{'='}, false, 2, 2);
            if (listLJJLIIIJ.size() == 2) {
                String strDecode = URLDecoder.decode((String) ListProtector.get(listLJJLIIIJ, 0), StandardCharsets.UTF_8.name());
                String strDecode2 = URLDecoder.decode((String) ListProtector.get(listLJJLIIIJ, 1), StandardCharsets.UTF_8.name());
                if (!map2.containsKey(strDecode)) {
                    map2.put(strDecode, C1697810uHb.LJIILJJIL(strDecode2));
                } else {
                    List list = (List) map2.get(strDecode);
                    if (list != null) {
                        list.add(strDecode2);
                    }
                }
            }
        }
        LIZIZ.put(str, map2);
        return map2;
    }

    public static void LIZIZ(int i) {
        Object c098200Yq;
        try {
            LIZIZ.resize(i);
            LIZJ.resize(i);
            LIZLLL.resize(i);
            c098200Yq = Unit.LIZ;
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (thM5exceptionOrNullimpl != null) {
            C823280WRi.LIZLLL(thM5exceptionOrNullimpl);
        }
    }

    public static URL LIZJ(URL url, Map map) throws URISyntaxException {
        URI uri = url.toURI();
        String rawQuery = uri.getRawQuery();
        if (rawQuery == null) {
            rawQuery = "";
        }
        List listLJJLIIIJILLIZJL = a0.LJJLIIIJILLIZJL(rawQuery, new String[]{"&"}, 0, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listLJJLIIIJILLIZJL) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(arrayList);
        int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(arrayList2, 10));
        if (iLIZIZ < 16) {
            iLIZIZ = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iLIZIZ);
        Iterator it2 = arrayList2.iterator();
        while (it2.hasNext()) {
            List listLJJLIIIJILLIZJL2 = a0.LJJLIIIJILLIZJL((String) it2.next(), new String[]{"="}, 0, 6);
            Pair pair = new Pair(ListProtector.get(listLJJLIIIJILLIZJL2, 0), ListProtector.get(listLJJLIIIJILLIZJL2, 1));
            linkedHashMap.put(pair.getFirst(), pair.getSecond());
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value == null) {
                linkedHashMap2.remove(key);
            } else {
                linkedHashMap2.put(key, value);
            }
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(linkedHashMap2.entrySet(), "&", null, null, 0, null, new C2086208Fg(), 30);
        StringBuilder sb = new StringBuilder();
        sb.append(uri.getScheme());
        sb.append(":");
        if (uri.getAuthority() != null) {
            sb.append("//");
            sb.append(uri.getAuthority());
        }
        if (uri.getPath() != null) {
            sb.append(uri.getPath());
        }
        if (strLJJLIIIJ.length() > 0) {
            sb.append("?");
            sb.append(strLJJLIIIJ);
        }
        if (uri.getRawFragment() != null) {
            sb.append("#");
            sb.append(uri.getRawFragment());
        }
        return new URL(sb.toString());
    }
}
