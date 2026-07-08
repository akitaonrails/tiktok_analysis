package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.035Q, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C035Q {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Function1 function1) {
        Object c098200Yq;
        SettingsManager.LIZLLL().getClass();
        if (!SettingsManager.LIZ("ecom_osp_global_plugin_fallback_settings", true)) {
            return;
        }
        Iterator it2 = ((List) C035P.LIZ.getValue()).iterator();
        while (it2.hasNext()) {
            try {
                function1.invoke(it2.next());
                c098200Yq = Unit.LIZ;
                C189200o6.m2constructorimpl(c098200Yq);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                c098200Yq = new C098200Yq(th);
                C189200o6.m2constructorimpl(c098200Yq);
            }
            Throwable thM5exceptionOrNullimpl = C189200o6.m5exceptionOrNullimpl(c098200Yq);
            if (thM5exceptionOrNullimpl != null) {
                C1AF0.LJ(thM5exceptionOrNullimpl);
            }
        }
    }
}
