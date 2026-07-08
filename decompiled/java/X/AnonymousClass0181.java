package X;

import android.net.Uri;
import com.bytedance.mt.protector.impl.UriProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0181, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class AnonymousClass0181 {
    public Uri LIZ;
    public Uri LIZIZ;
    public Uri LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(294));

    public final String LIZ() {
        Uri.Builder builderClearQuery;
        Uri.Builder builderBuildUpon;
        Uri.Builder builderClearQuery2;
        Uri.Builder builderBuildUpon2;
        Uri.Builder builderClearQuery3;
        Uri uri = this.LIZIZ;
        if (uri != null && (builderBuildUpon2 = uri.buildUpon()) != null && (builderClearQuery3 = builderBuildUpon2.clearQuery()) != null) {
            String str = LIZIZ().containsKey("url") ? "url" : "surl";
            Map<String, String> map = LIZIZ().get(str);
            if (map != null) {
                for (Map.Entry<String, String> entry : map.entrySet()) {
                    builderClearQuery3.appendQueryParameter(entry.getKey(), entry.getValue());
                }
            }
            Map<String, String> map2 = LIZIZ().get("default");
            if (map2 != null) {
                map2.put(str, builderClearQuery3.build().toString());
            }
        }
        Uri uri2 = this.LIZJ;
        if (uri2 != null && (builderBuildUpon = uri2.buildUpon()) != null && (builderClearQuery2 = builderBuildUpon.clearQuery()) != null) {
            Map<String, String> map3 = LIZIZ().get("fallback_url");
            if (map3 != null) {
                for (Map.Entry<String, String> entry2 : map3.entrySet()) {
                    builderClearQuery2.appendQueryParameter(entry2.getKey(), entry2.getValue());
                }
            }
            Map<String, String> map4 = LIZIZ().get("default");
            if (map4 != null) {
                map4.put("fallback_url", builderClearQuery2.build().toString());
            }
        }
        Uri uri3 = this.LIZ;
        Uri uriBuild = null;
        if (uri3 == null) {
            uri3 = null;
        }
        Uri.Builder builderBuildUpon3 = uri3.buildUpon();
        if (builderBuildUpon3 != null && (builderClearQuery = builderBuildUpon3.clearQuery()) != null) {
            Map<String, String> map5 = LIZIZ().get("default");
            if (map5 != null) {
                for (Map.Entry<String, String> entry3 : map5.entrySet()) {
                    builderClearQuery.appendQueryParameter(entry3.getKey(), entry3.getValue());
                }
            }
            uriBuild = builderClearQuery.build();
        }
        return String.valueOf(uriBuild);
    }

    public final Map<String, Map<String, String>> LIZIZ() {
        return (Map) this.LIZLLL.getValue();
    }

    public AnonymousClass0181(String str) {
        boolean z;
        String str2;
        String str3;
        Uri uri = UriProtector.parse(str);
        LIZIZ().put("default", new LinkedHashMap());
        for (String str4 : UriProtector.getQueryParameterNames(uri)) {
            Map<String, String> map = LIZIZ().get("default");
            if (map != null) {
                map.put(str4, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri, str4));
            }
        }
        this.LIZ = uri;
        Map<String, String> map2 = LIZIZ().get("default");
        if (map2 != null && map2.containsKey("url")) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            Map<String, String> map3 = LIZIZ().get("default");
            if (map3 != null) {
                str3 = map3.get("url");
            } else {
                str3 = null;
            }
            Uri uri2 = UriProtector.parse(str3);
            LIZIZ().put("url", new LinkedHashMap());
            for (String str5 : UriProtector.getQueryParameterNames(uri2)) {
                Map<String, String> map4 = LIZIZ().get("url");
                if (map4 != null) {
                    map4.put(str5, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri2, str5));
                }
            }
            this.LIZIZ = uri2;
        }
        Map<String, String> map5 = LIZIZ().get("default");
        if (map5 != null && map5.containsKey("surl")) {
            Map<String, String> map6 = LIZIZ().get("default");
            if (map6 != null) {
                str2 = map6.get("surl");
            } else {
                str2 = null;
            }
            Uri uri3 = UriProtector.parse(str2);
            LIZIZ().put("surl", new LinkedHashMap());
            for (String str6 : UriProtector.getQueryParameterNames(uri3)) {
                Map<String, String> map7 = LIZIZ().get("surl");
                if (map7 != null) {
                    map7.put(str6, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri3, str6));
                }
            }
            this.LIZIZ = uri3;
        }
        Map<String, String> map8 = LIZIZ().get("default");
        if (map8 != null && map8.containsKey("fallback_url")) {
            Map<String, String> map9 = LIZIZ().get("default");
            Uri uri4 = UriProtector.parse(map9 != null ? map9.get("fallback_url") : null);
            LIZIZ().put("fallback_url", new LinkedHashMap());
            for (String str7 : UriProtector.getQueryParameterNames(uri4)) {
                Map<String, String> map10 = LIZIZ().get("fallback_url");
                if (map10 != null) {
                    map10.put(str7, UriProtector.com_bytedance_mt_protector_impl_UriProtector_com_ss_android_ugc_aweme_lancet_UriLancet_getQueryParameter(uri4, str7));
                }
            }
            this.LIZJ = uri4;
        }
    }

    public static String LIZJ(AnonymousClass0181 anonymousClass0181, String str) {
        anonymousClass0181.getClass();
        try {
            Iterator it2 = C13LP.LJLLLL(new C512401z8(25), anonymousClass0181.LIZIZ().keySet()).iterator();
            if (it2.hasNext()) {
                Map<String, String> map = anonymousClass0181.LIZIZ().get((String) it2.next());
                if (map != null) {
                    return map.get(str);
                }
                return null;
            }
            return null;
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    public final void LJFF(int i, Map map) {
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            Iterator<Map.Entry<String, Map<String, String>>> it2 = LIZIZ().entrySet().iterator();
            boolean z = false;
            while (it2.hasNext()) {
                if (it2.next().getValue().containsKey(key)) {
                    z = true;
                }
            }
            if (z) {
                if ((i & 2) == 2) {
                    for (Map.Entry<String, Map<String, String>> entry2 : LIZIZ().entrySet()) {
                        if (entry2.getValue().containsKey(key)) {
                            entry2.getValue().put(key, value);
                        }
                    }
                }
            } else if ((i & 1) == 1) {
                Map<String, Map<String, String>> mapLIZIZ = LIZIZ();
                LinkedHashMap linkedHashMap = new LinkedHashMap();
                for (Map.Entry<String, Map<String, String>> entry3 : mapLIZIZ.entrySet()) {
                    if (LIZIZ().size() <= 1 || !Intrinsics.LJFF("default", entry3.getKey())) {
                        linkedHashMap.put(entry3.getKey(), entry3.getValue());
                    }
                }
                Iterator it3 = linkedHashMap.entrySet().iterator();
                while (it3.hasNext()) {
                    ((Map) ((Map.Entry) it3.next()).getValue()).put(key, value);
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZLLL(int i, int i2, Map map) throws JSONException {
        HashMap<String, Object> mapLJIIJ;
        Iterator<Map.Entry<String, Map<String, String>>> it2 = LIZIZ().entrySet().iterator();
        boolean z = false;
        while (it2.hasNext()) {
            if (it2.next().getValue().containsKey("trackParams")) {
                z = true;
            }
        }
        if (z) {
            if ((i & 2) == 2) {
                for (Map.Entry<String, Map<String, String>> entry : LIZIZ().entrySet()) {
                    if (entry.getValue().containsKey("trackParams") && (mapLJIIJ = C1741890vQh.LJIIJ(entry.getValue().get("trackParams"))) != 0) {
                        for (Map.Entry entry2 : map.entrySet()) {
                            if ((!mapLJIIJ.containsKey(entry2.getKey()) && (i2 & 1) == 1) || (mapLJIIJ.containsKey(entry2.getKey()) && (i2 & 2) == 2)) {
                                mapLJIIJ.put(entry2.getKey(), entry2.getValue());
                            }
                        }
                        String strLJIIIIZZ = C1741890vQh.LJIIIIZZ(mapLJIIJ);
                        if (strLJIIIIZZ != null) {
                            entry.getValue().put("trackParams", strLJIIIIZZ);
                        }
                    }
                }
                return;
            }
            return;
        }
        if ((i & 1) == 1) {
            Map<String, Map<String, String>> mapLIZIZ = LIZIZ();
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, Map<String, String>> entry3 : mapLIZIZ.entrySet()) {
                if (LIZIZ().size() <= 1 || !Intrinsics.LJFF("default", entry3.getKey())) {
                    linkedHashMap.put(entry3.getKey(), entry3.getValue());
                }
            }
            Iterator it3 = linkedHashMap.entrySet().iterator();
            while (it3.hasNext()) {
                Map map2 = (Map) ((Map.Entry) it3.next()).getValue();
                JSONObject jSONObject = new JSONObject();
                for (Map.Entry entry4 : map.entrySet()) {
                    jSONObject.put((String) entry4.getKey(), entry4.getValue());
                }
                map2.put("trackParams", C786410Ut5.J3(jSONObject));
            }
        }
    }

    public final void LJ(int i, String str, String str2) {
        LJFF(i, C2097908Jt.LIZJ(new Pair(str, str2)));
    }
}
