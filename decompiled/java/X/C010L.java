package X;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.010L, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C010L {
    public static String LIZ(String str, Map map) throws UnsupportedEncodingException {
        if (map.isEmpty()) {
            return str;
        }
        ArrayList arrayList = new ArrayList(map.size());
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            String str2 = (String) entry.getKey();
            Object value = entry.getValue();
            String strEncode = URLEncoder.encode(str2, "UTF-8");
            String strEncode2 = URLEncoder.encode(value.toString(), "UTF-8");
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append(strEncode);
            sbLIZ.append('=');
            sbLIZ.append(strEncode2);
            arrayList.add(C2188811AlT.LIZIZ(sbLIZ));
        }
        String strLJJLIIIJ = C13LP.LJJLIIIJ(arrayList, "&", null, null, 0, null, null, 62);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(a0.LJJJLL("/", a0.LJJJLL("?", str)));
        sbLIZ2.append('?');
        sbLIZ2.append(strLJJLIIIJ);
        return C2188811AlT.LIZIZ(sbLIZ2);
    }
}
