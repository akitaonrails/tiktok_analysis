package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.ab.PipoEcCcdcRulesConfigModel;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Regex;

/* JADX INFO: renamed from: X.00pD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C196100pD {
    public static final C196100pD LIZ = new C196100pD();
    public static final PipoEcCcdcRulesConfigModel LIZIZ = new PipoEcCcdcRulesConfigModel(Collections.singletonList("^pm_pi_ccdc_(?:hsafsa_all|[A-Za-z]+hsafsa_c_d)$"), Collections.singletonList("^pm_pi_ccdc_(?:hsafsa_all|[A-Za-z]+hsafsa_c_d)$"));
    public static final ConcurrentHashMap<String, Regex> LIZJ = new ConcurrentHashMap<>();

    public static boolean LIZ(String str, String str2) {
        Object c098200Yq;
        Regex regex = LIZJ.get(str);
        if (regex == null) {
            try {
                c098200Yq = new Regex(str);
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            if (C189200o6.m7isFailureimpl(c098200Yq)) {
                c098200Yq = null;
            }
            regex = (Regex) c098200Yq;
            if (regex != null) {
                LIZJ.put(str, regex);
            } else {
                return false;
            }
        }
        return regex.matches(str2);
    }
}
