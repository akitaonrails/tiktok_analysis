package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.04sl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1237304sl extends C09AY implements Function0<List<String>> {
    public C1237304sl() {
        super(0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.util.List<java.lang.String>] */
    /* JADX WARN: Type inference failed for: r1v4 */
    @Override // kotlin.jvm.functions.Function0
    public final List<String> invoke() {
        Object obj;
        try {
            List list = (List) C0C64.LJIILLIIL().LJJII(List.class, C1237404sm.LIZ, "search_lynx_events_enable_pass_through", true);
            C189200o6.m2constructorimpl(list);
            obj = list;
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C098200Yq c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
            obj = c098200Yq;
        }
        boolean zM7isFailureimpl = C189200o6.m7isFailureimpl(obj);
        ?? r1 = obj;
        if (zM7isFailureimpl) {
            r1 = 0;
        }
        return r1 == 0 ? C1237404sm.LIZ : r1;
    }
}
