package X;

import android.net.Uri;
import android.util.Pair;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.retrofit2.mime.TypedByteArray;
import com.bytedance.sync.v4.ttnet.ISyncNetworkApi;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.08fl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2175908fl {
    public static Pair<String, String> LIZ(String str) {
        Uri uri = UriProtector.parse(str);
        StringBuilder sb = new StringBuilder();
        String scheme = uri.getScheme();
        String host = uri.getHost();
        int port = uri.getPort();
        if (host != null) {
            if (scheme != null) {
                sb.append(scheme);
                sb.append("://");
            }
            sb.append(host);
            if (port > 0) {
                sb.append(':');
                sb.append(port);
            }
        }
        String string = sb.toString();
        String path = uri.getPath();
        String query = uri.getQuery();
        if (query != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(path);
            sbLIZ.append("?");
            sbLIZ.append(query);
            path = C2188811AlT.LIZIZ(sbLIZ);
        }
        return new Pair<>(string, path);
    }

    public static C0X52 LIZIZ(String str, byte[] bArr, Map<String, String> map, C808790Vo5 c808790Vo5) throws C829590WgX {
        try {
            Pair<String, String> pairLIZ = LIZ(str);
            String str2 = (String) pairLIZ.first;
            String str3 = (String) pairLIZ.second;
            ISyncNetworkApi iSyncNetworkApi = (ISyncNetworkApi) C1515120pWw.LJIIIZ(ISyncNetworkApi.class, str2);
            String str4 = (String) ((LinkedHashMap) map).get("Content-Type");
            map.remove("Content-Type");
            ArrayList arrayList = new ArrayList();
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                arrayList.add(new C080U((String) entry.getKey(), (String) entry.getValue()));
            }
            return iSyncNetworkApi.postData(-1, str3, new TypedByteArray(str4, bArr, new String[0]), arrayList, c808790Vo5.LIZ).execute();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            if (e instanceof C1494430ozZ) {
                throw new C829590WgX(((C1494430ozZ) e).getStatusCode(), e.getMessage());
            }
            throw new C829590WgX(0, e.getMessage());
        }
    }
}
