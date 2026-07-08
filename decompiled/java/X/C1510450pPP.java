package X;

import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.FeatureItem;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pPP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1510450pPP extends FeatureProducer {
    public static final C1510450pPP LIZIZ = new C1510450pPP();
    public static String LIZJ = "f_g_action";
    public static final Map<String, String> LIZLLL = C2097608Jq.LJIIIIZZ(new Pair("g_enter_homepage_familiar_cnt", "enter_homepage_familiar"), new Pair("g_enter_homepage_hot_cnt", "enter_homepage_hot"), new Pair("g_enter_homepage_message_cnt", "enter_homepage_message"), new Pair("g_enter_homepage_follow_cnt", "enter_homepage_follow"), new Pair("g_enter_homepage_fresh_cnt", "enter_homepage_fresh"), new Pair("g_enter_personal_homepage_cnt", "enter_personal_homepage"), new Pair("g_shoot_cnt", "shoot"));
    public static boolean LJ = true;

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final String getProducerName() {
        return LIZJ;
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void enableProducer(List<FeatureItem> list) {
        if (LJ) {
            LJ = false;
            FeatureServiceManager.Companion.getClass();
            C1510050pOl.LIZ().addAppLogListener(C1510460pPQ.LIZIZ);
        }
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final void setProducerName(String str) {
        LIZJ = str;
    }

    @Override // com.ss.ugc.clientai.core.api.FeatureProducer
    public final Object getFeatureInternal(String str, JSONObject jSONObject, String str2, ReturnCode returnCode) {
        int iIntValue;
        if (returnCode != null) {
            returnCode.code = 200;
        }
        if (Intrinsics.LJFF(str, "global_action")) {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            for (String str3 : C1510460pPQ.LIZJ) {
                AtomicInteger atomicInteger = C1510460pPQ.LIZLLL.get(str3);
                if (atomicInteger != null) {
                    iIntValue = atomicInteger.intValue();
                } else {
                    iIntValue = 0;
                }
                linkedHashMap.put(str3, Integer.valueOf(iIntValue));
            }
            return linkedHashMap;
        }
        String str4 = LIZLLL.get(str);
        if (str4 != null) {
            AtomicInteger atomicInteger2 = C1510460pPQ.LIZLLL.get(str4);
            if (atomicInteger2 != null) {
                return Integer.valueOf(atomicInteger2.intValue());
            }
            return 0;
        }
        if (returnCode != null) {
            returnCode.code = 1;
            return null;
        }
        return null;
    }
}
