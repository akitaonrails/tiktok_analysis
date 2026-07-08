package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Set;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0809, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class AnonymousClass0809 {
    public static volatile Set<String> LIZ = C08CX.INSTANCE;
    public static volatile double LIZIZ;
    public static volatile boolean LIZJ;

    public static void LIZ(final String str) {
        if (!LIZJ || !LIZ.contains(str) || !C080N.LIZ(LIZIZ, "signal_trigger")) {
            return;
        }
        final double d = LIZIZ;
        C080N.LIZ.getClass();
        if (((Boolean) C080N.LIZJ.getValue()).booleanValue()) {
            d = 1.0d;
        }
        C20684815ws.LJFF().execute(new Runnable() { // from class: X.0808
            public final void LIZ() {
                Object c098200Yq;
                try {
                    c098200Yq = C786410Ut5.J3(new JSONObject().put("event_name", str));
                    C189200o6.m2constructorimpl(c098200Yq);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    c098200Yq = new C098200Yq(th);
                    C189200o6.m2constructorimpl(c098200Yq);
                }
                if (C189200o6.m7isFailureimpl(c098200Yq)) {
                    c098200Yq = null;
                }
                C20684815ws.LJFF().execute(new C080L(d, "signal_trigger", null, null, null, (String) c098200Yq));
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("OutreachSignalTriggerMonitor@f46e.report$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("OutreachSignalTriggerMonitor@f46e.report$1");
            }
        });
    }
}
