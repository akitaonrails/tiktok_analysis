package X;

import com.ss.android.ugc.aweme.vibefeed.clientai.IVibeClientAIService;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0P40, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0P40 {
    public static final ConcurrentHashMap<String, Map<String, String>> LIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Map<String, String>> LIZIZ = new ConcurrentHashMap<>();

    public static Map LIZ(String str) {
        boolean z;
        IVibeClientAIService iVibeClientAIService = (IVibeClientAIService) C1557990qe5.LJ.getValue();
        if (iVibeClientAIService == null) {
            return C2097608Jq.LJ();
        }
        if (C1575210r5r.LLILLJJLI.LIZIZ(str) == EnumC1575230r5t.STARTED) {
            z = true;
        } else {
            z = false;
        }
        C1576080r7G c1576080r7G = EnumC1576090r7H.Companion;
        Boolean boolValueOf = Boolean.valueOf(z);
        c1576080r7G.getClass();
        EnumC1576090r7H enumC1576090r7HLIZ = C1576080r7G.LIZ(boolValueOf);
        C1610940s1U c1610940s1ULIZJ = iVibeClientAIService.LIZJ(str, enumC1576090r7HLIZ);
        if (c1610940s1ULIZJ == null) {
            return C2097608Jq.LJ();
        }
        return C2097608Jq.LJIIIIZZ(new Pair("client_ai_intent_score", String.valueOf(c1610940s1ULIZJ.LIZJ)), new Pair("client_ai_intent_type", enumC1576090r7HLIZ.getTrackingName()));
    }
}
