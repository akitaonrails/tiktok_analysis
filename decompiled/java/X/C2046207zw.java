package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.effectmanager.common.utils.JsonExtKt;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.07zw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C2046207zw {
    public static final C2046207zw LIZ = new C2046207zw();

    public static int LIZ(String str, List list) {
        int iIntValue;
        int iIntValue2;
        Integer num;
        int i = 0;
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Object> entry : JsonExtKt.toMap(new JSONObject(str)).entrySet()) {
                String lowerCase = entry.getKey().toLowerCase(Locale.ROOT);
                Object value = entry.getValue();
                if ((value instanceof Integer) && (num = (Integer) value) != null) {
                    iIntValue2 = num.intValue();
                } else {
                    iIntValue2 = 0;
                }
                linkedHashMap.put(lowerCase, Integer.valueOf(iIntValue2));
            }
            Iterator it2 = ((ArrayList) list).iterator();
            i = 0;
            while (it2.hasNext()) {
                try {
                    Integer num2 = (Integer) linkedHashMap.get(((String) it2.next()).toLowerCase(Locale.ROOT));
                    if (num2 != null) {
                        iIntValue = num2.intValue();
                    } else {
                        iIntValue = 0;
                    }
                    i += iIntValue;
                } catch (Exception e) {
                    e = e;
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        return i;
    }

    public static List LIZIZ(String str, String str2) {
        boolean z;
        ArrayList arrayList = new ArrayList();
        boolean z2 = true;
        if (str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            if (str2.length() != 0) {
                z2 = false;
            }
            if (!z2) {
                try {
                    C2046307zx c2046307zx = (C2046307zx) C7740030o.LIZ().getGson().LJII(str, C2046307zx.class);
                    c2046307zx.getClass();
                    return arrayList;
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                }
            }
        }
        return arrayList;
    }

    public static void LIZJ(Map map, Map map2) {
        HashMap map3;
        if (map2 != null) {
            for (Map.Entry entry : map2.entrySet()) {
                if (entry.getValue() instanceof HashMap) {
                    C2046207zw c2046207zw = LIZ;
                    Object value = entry.getValue();
                    if (value instanceof HashMap) {
                        map3 = (HashMap) value;
                    } else {
                        map3 = null;
                    }
                    c2046207zw.getClass();
                    LIZJ(map, map3);
                } else {
                    ((HashMap) map).put(entry.getKey(), entry.getValue());
                }
            }
        }
    }
}
