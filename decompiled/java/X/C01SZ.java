package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;

/* JADX INFO: renamed from: X.01SZ, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C01SZ {
    public static final C01SZ LIZ = new C01SZ();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AnonymousClass0206.get$arr$(316));
    public static final C054G LIZJ = C2296808zG.LIZ(C09A1.LIZLLL(C2296908zH.LIZ(), C0PEM.LIZJ));

    public static Map LIZ(Set set, Set set2, Set set3) {
        return C2097608Jq.LJII(new Pair("missing_nodes", C13LP.LJJLIIIJ(C13LP.LJLLJ(set), ",", null, null, 0, null, null, 62)), new Pair("missing_count", String.valueOf(set.size())), new Pair("claimed_missing", C13LP.LJJLIIIJ(C13LP.LJLLJ(set2), ",", null, null, 0, null, null, 62)), new Pair("claimed_count", String.valueOf(set2.size())), new Pair("unclaimed_missing", C13LP.LJJLIIIJ(C13LP.LJLLJ(set3), ",", null, null, 0, null, null, 62)), new Pair("unclaimed_count", String.valueOf(set3.size())));
    }

    public final void LIZIZ(Set set, C08CX c08cx, Set set2) {
        if (!((Boolean) LIZIZ.getValue()).booleanValue()) {
            return;
        }
        try {
            C189200o6.m2constructorimpl(C23250099c.LIZLLL(LIZJ, null, null, new C01SY(this, set, c08cx, set2, null), 3));
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
    }
}
