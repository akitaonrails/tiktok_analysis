package X;

import com.ss.android.ugc.aweme.pns.consent.collector.api.CollectConsentParam;
import com.ss.android.ugc.bytex.pthread.base.BuildConfig;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0zwA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1915160zwA {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZIZ(CollectConsentParam collectConsentParam, Object obj) {
        Map<String, String> mapLJIIJ = C2097608Jq.LJIIJ(new Pair("sdk_name", "pns_consent_collector"), new Pair("sdk_version", BuildConfig.VERSION_NAME), new Pair("event_name", "collect"), new Pair("consent_key", collectConsentParam.consentKey), new Pair("collection_flow", collectConsentParam.flow));
        if (obj != null) {
            mapLJIIJ.put("dynamic_id", obj.toString());
        }
        C100C c100c = C100C.LIZ;
        c100c.LIZJ().LIZJ("pns_consent_collector_event", null, mapLJIIJ, null);
        c100c.LIZJ().LIZ("pns_consent_collector_event", mapLJIIJ);
    }

    public static void LIZJ(String str, CollectConsentParam collectConsentParam) {
        Map<String, String> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("sdk_name", "pns_consent_collector"), new Pair("sdk_version", BuildConfig.VERSION_NAME), new Pair("event_name", "error"), new Pair("error_code", str), new Pair("consent_key", collectConsentParam.consentKey), new Pair("collection_flow", collectConsentParam.flow));
        C100C c100c = C100C.LIZ;
        c100c.LIZJ().LIZJ("pns_consent_collector_event", null, mapLJIIIIZZ, null);
        c100c.LIZJ().LIZ("pns_consent_collector_event", mapLJIIIIZZ);
    }

    public static void LIZ(String str, CollectConsentParam collectConsentParam, Map map) {
        Map<String, String> mapLJIIIIZZ = C2097608Jq.LJIIIIZZ(new Pair("reason", str), new Pair("consent_key", collectConsentParam.consentKey), new Pair("flow", collectConsentParam.flow), new Pair("scenario", collectConsentParam.scenario));
        C100C c100c = C100C.LIZ;
        c100c.LIZJ().LIZJ("pns_consent_collector_exception", null, mapLJIIIIZZ, map);
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapLJIIIIZZ);
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        c100c.LIZJ().LIZ("pns_consent_collector_exception", linkedHashMap);
    }
}
