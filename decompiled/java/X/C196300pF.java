package X;

import android.net.Uri;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: renamed from: X.00pF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C196300pF {
    public static final /* synthetic */ int LIZ = 0;

    public static Map LIZ(String str) {
        String strDecode = Uri.decode(str);
        try {
            if (strDecode != null) {
                Map map = (Map) new Gson().LJIIIIZZ(strDecode, new TypeToken<Map<String, ? extends String>>() { // from class: X.00pG
                }.getType());
                LinkedHashMap linkedHashMap = new LinkedHashMap(C2097908Jt.LIZIZ(map.size()));
                for (Object obj : map.entrySet()) {
                    Object key = ((Map.Entry) obj).getKey();
                    String str2 = (String) ((Map.Entry) obj).getValue();
                    if (str2 == null) {
                        str2 = "";
                    }
                    linkedHashMap.put(key, str2);
                }
                return linkedHashMap;
            }
            return C2097608Jq.LJ();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return C2097608Jq.LJ();
        }
    }
}
