package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* JADX INFO: renamed from: X.07P6, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C07P6 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(List list) {
        Object c098200Yq;
        Iterator it2 = list.iterator();
        while (it2.hasNext()) {
            try {
                ((C08ZZ) it2.next()).run();
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            C189200o6.m5exceptionOrNullimpl(c098200Yq);
        }
    }
}
