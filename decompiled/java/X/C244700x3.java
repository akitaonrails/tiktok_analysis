package X;

import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.u;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.00x3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C244700x3 {
    public static final Map<String, String> LIZ = C2097608Jq.LJIIIIZZ(new Pair("x-metasec-bypass-ttnet-features", "1"), new Pair("x-ttnet-bypass-cookie", CardStruct.IStatusCode.DEFAULT), new Pair("x-metasec-bypass-api-log", "1"), new Pair("x-metasec-network-zone", "2"));
    public static final List<String> LIZIZ = C1697810uHb.LJIIJJI("Referer", "User-Agent");
    public static volatile boolean LIZJ;

    public static JSONObject LIZ(JSONObject jSONObject) {
        boolean z;
        boolean z2;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator<String> itKeys = jSONObject.keys();
        while (itKeys.hasNext()) {
            String next = itKeys.next();
            try {
                linkedHashMap.put(next, jSONObject.get(next));
            } catch (JSONException e) {
                TryCatchGuardChecker.doCheck(e);
            }
        }
        LinkedHashMap linkedHashMap2 = new LinkedHashMap(linkedHashMap);
        Set setKeySet = linkedHashMap.keySet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : setKeySet) {
            String str = (String) obj;
            Set<String> setKeySet2 = LIZ.keySet();
            boolean z3 = true;
            if ((setKeySet2 instanceof Collection) && setKeySet2.isEmpty()) {
                z = false;
            } else {
                for (String str2 : setKeySet2) {
                    Locale locale = Locale.ROOT;
                    if (Intrinsics.LJFF(str2.toLowerCase(locale), str.toLowerCase(locale))) {
                        z = true;
                        break;
                    }
                }
                z = false;
            }
            List<String> list = LIZIZ;
            if ((list instanceof Collection) && list.isEmpty()) {
                z2 = false;
            } else {
                for (String str3 : list) {
                    Locale locale2 = Locale.ROOT;
                    if (Intrinsics.LJFF(str3.toLowerCase(locale2), str.toLowerCase(locale2))) {
                        z2 = true;
                        break;
                    }
                }
                z2 = false;
            }
            if (!z && !z2) {
                z3 = false;
            }
            if (z3) {
                arrayList.add(obj);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            linkedHashMap2.remove(it2.next());
        }
        LinkedHashMap linkedHashMap3 = new LinkedHashMap(linkedHashMap2);
        for (Map.Entry<String, String> entry : LIZ.entrySet()) {
            linkedHashMap3.put(entry.getKey(), entry.getValue());
        }
        JSONObject jSONObject2 = new JSONObject();
        for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
            try {
                jSONObject2.put((String) entry2.getKey(), entry2.getValue());
            } catch (JSONException e2) {
                TryCatchGuardChecker.doCheck(e2);
            }
        }
        return jSONObject2;
    }

    public static boolean LIZIZ(String str) {
        String host;
        if (!LIZJ || str.length() == 0) {
            return true;
        }
        try {
            host = UriProtector.parse(str).getHost();
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
        }
        if (host == null || !u.LJIJI(host, "api.tiktokv.com", true)) {
            return true;
        }
        return false;
    }
}
