package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.08mA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2215608mA {
    public static String LIZ(String str, String str2, String str3) {
        boolean z;
        try {
            try {
                URI uri = new URI(str);
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                String query = uri.getQuery();
                if (query == null) {
                    query = "";
                }
                for (String str4 : a0.LJJLIIIJILLIZJL(query, new String[]{"&"}, 0, 6)) {
                    if (str4.length() <= 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (z) {
                        int iLJJIZ = a0.LJJIZ(str4, '=', 0, false, 6);
                        if (iLJJIZ > -1) {
                            linkedHashMap.put(str4.substring(0, iLJJIZ), str4.substring(iLJJIZ + 1));
                        } else {
                            linkedHashMap.put(str4, "");
                        }
                    }
                }
                linkedHashMap.put(str2, str3);
                ArrayList arrayList = new ArrayList(linkedHashMap.size());
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append((String) entry.getKey());
                    sbLIZ.append('=');
                    sbLIZ.append((String) entry.getValue());
                    arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
                }
                str = new URI(uri.getScheme(), uri.getUserInfo(), uri.getHost(), uri.getPort(), uri.getPath(), C13LP.LJJLIIIJ(arrayList, "&", null, null, 0, null, null, 62), uri.getFragment()).toString();
                return str;
            } catch (URISyntaxException e) {
                e = e;
                TryCatchGuardChecker.doCheck(e);
                C1AF0.LJ(e);
                return str;
            }
        } catch (URISyntaxException e2) {
            e = e2;
        }
    }
}
