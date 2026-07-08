package X;

import android.os.Handler;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0CJA, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0CJA extends C09AY implements Function0<Unit> {
    public final /* synthetic */ C0CJE LL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0CJA(C0CJE c0cje) {
        super(0);
        this.LL = c0cje;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        Handler handlerLIZIZ = C799570VYd.LIZIZ();
        final C0CJE c0cje = this.LL;
        C786410Ut5.LJJZZIII(handlerLIZIZ, new Runnable() { // from class: X.0CJ9
            public final void LIZ() {
                C0CJE c0cje2 = c0cje;
                try {
                    ConcurrentHashMap<String, Object> concurrentHashMap = c0cje2.LIZ.get(c0cje2.LIZIZ());
                    if (concurrentHashMap != null && (!concurrentHashMap.isEmpty())) {
                        JSONObject jSONObject = new JSONObject();
                        for (Map.Entry<String, Object> entry : concurrentHashMap.entrySet()) {
                            jSONObject.put(entry.getKey(), entry.getValue());
                        }
                        C20684815ws.LJIJ(c0cje2.LIZIZ(), jSONObject);
                    }
                    c0cje2.LIZ.remove(c0cje2.LIZIZ());
                    c0cje2.LIZJ = true;
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("AbsPerformanceTracker@dd9e.report$1$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("AbsPerformanceTracker@dd9e.report$1$1");
            }
        });
        return Unit.LIZ;
    }
}
