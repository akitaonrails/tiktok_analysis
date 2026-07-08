package X;

import com.ss.android.ugc.aweme.tako.ccl.model.api.TakoSug;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0Cox, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C325210Cox {
    public static final C325210Cox LIZ = new C325210Cox();
    public static final ConcurrentHashMap<String, TakoSug> LIZIZ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, C1863800ybK> LIZJ = new ConcurrentHashMap<>();
    public static final ConcurrentHashMap<String, Function1<TakoSug, Unit>> LIZLLL = new ConcurrentHashMap<>();

    public static boolean LIZ(String str) {
        C1863800ybK c1863800ybK;
        if (str != null) {
            c1863800ybK = LIZJ.get(str);
        } else {
            c1863800ybK = null;
        }
        C1863800ybK c1863800ybK2 = (C1863800ybK) C13LP.LJJJLL(C1697810uHb.LJIIL(c1863800ybK));
        if (c1863800ybK2 != null && c1863800ybK2.LJ != null) {
            return true;
        }
        return false;
    }

    public static void LIZIZ(String str) {
        C1863800ybK c1863800ybKRemove;
        if (str != null && (c1863800ybKRemove = LIZJ.remove(str)) != null) {
            C23250099c.LIZLLL(C2296808zG.LIZ(C0PEM.LIZJ), null, null, new C1863780ybI(c1863800ybKRemove, null), 3);
        }
    }

    public static void LIZJ(String str, Function1 function1) {
        C1863800ybK c1863800ybKPutIfAbsent;
        if (str != null && str.length() != 0) {
            ConcurrentHashMap<String, C1863800ybK> concurrentHashMap = LIZJ;
            C1863800ybK c1863800ybK = concurrentHashMap.get(str);
            if (c1863800ybK == null && (c1863800ybKPutIfAbsent = concurrentHashMap.putIfAbsent(str, (c1863800ybK = new C1863800ybK(0)))) != null) {
                c1863800ybK = c1863800ybKPutIfAbsent;
            }
            function1.invoke(c1863800ybK);
        }
    }
}
