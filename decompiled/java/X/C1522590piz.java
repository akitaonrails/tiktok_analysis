package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS231S0000000_3;
import kotlin.jvm.internal.AFwS263S0000000_23;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0piz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1522590piz {
    public static final C1522590piz LIZ = new C1522590piz();
    public static final Map<String, String> LIZIZ = C2097908Jt.LIZJ(new Pair("res_loader_name", "forestX"));
    public static final Set<EnumC1533980q1M> LIZJ = C13LQ.LJLIIL(new EnumC1533980q1M[]{EnumC1533980q1M.LYNX_TEMPLATE, EnumC1533980q1M.WEB_MAIN_DOCUMENT, EnumC1533980q1M.MYNA_TEMPLATE});
    public static final AFwS231S0000000_3 LIZLLL = AFwS231S0000000_3.get$arr$(189);
    public static final LinkedHashSet<Function1<C443120HZe<String, String, ? extends JSONObject>, Unit>> LJ = new LinkedHashSet<>();

    public final synchronized void LIZ(AFwS263S0000000_23 aFwS263S0000000_23) {
        while (true) {
            try {
                LJ.add(aFwS263S0000000_23);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                C189200o6.m2constructorimpl(new C098200Yq(th));
            }
        }
    }
}
