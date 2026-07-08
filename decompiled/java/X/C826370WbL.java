package X;

import com.bytedance.retrofit2.client.Request;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URI;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Pair;
import kotlin.jvm.internal.AwS98S1000000_13;

/* JADX INFO: renamed from: X.0WbL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class C826370WbL {
    public static final C0WSU LIZ(String str, C0X9S<?> c0x9s, String str2, C0WZW c0wzw) {
        LinkedHashMap linkedHashMap;
        String str3;
        String[] strArr;
        Request request = c0x9s.request();
        if (request == null) {
            return new C0WSU(false, null);
        }
        String url = request.getUrl();
        if (url == null) {
            return new C0WSU(false, null);
        }
        try {
            URI uri = new URI(url);
            List<C080U> headers = request.getHeaders();
            if (headers != null && !headers.isEmpty()) {
                int iLIZIZ = C2097908Jt.LIZIZ(C15438062q.LJIJJ(headers, 10));
                if (iLIZIZ < 16) {
                    iLIZIZ = 16;
                }
                linkedHashMap = new LinkedHashMap(iLIZIZ);
                for (C080U c080u : headers) {
                    Pair pair = new Pair(c080u.LIZ, c080u.LIZIZ);
                    linkedHashMap.put(pair.getFirst(), pair.getSecond());
                }
            } else {
                linkedHashMap = null;
            }
            String host = uri.getHost();
            String scheme = uri.getScheme();
            String method = request.getMethod();
            Map mapLIZIZ = C205000qe.LIZIZ(uri.getRawQuery());
            if (linkedHashMap != null) {
                str3 = (String) linkedHashMap.get("Cookie");
            } else {
                str3 = null;
            }
            Map mapLIZ = C205000qe.LIZ(str3);
            if (c0wzw != null) {
                strArr = c0wzw.LJ;
            } else {
                strArr = null;
            }
            C826260WbA.LIZIZ(new C826120Waw(c0x9s, str, url, host, scheme, method, linkedHashMap, mapLIZIZ, mapLIZ, strArr), C826260WbA.LIZ);
            return new C0WSU(false, null);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            CopyOnWriteArrayList<C0WSX> copyOnWriteArrayList = C0WSW.LIZ;
            C0WSW.LIZ(str2, new AwS98S1000000_13(url, 6), 3, null);
            return new C0WSU(false, null);
        }
    }
}
