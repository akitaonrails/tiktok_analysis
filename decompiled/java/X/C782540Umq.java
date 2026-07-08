package X;

import com.bytedance.android.livesdk.performance.memory.BroadcastMemoryCleanersEnableSetting;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Umq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C782540Umq {
    public static void LIZ() {
        C20441214yg.LIZIZ("BroadcastMemoryCleaners", "schedulePreloadOnIdle: execute preloadIfNeeded");
        if (BroadcastMemoryCleanersEnableSetting.isPreloadAfterLiveEnabled()) {
            CopyOnWriteArrayList<Function0<Unit>> copyOnWriteArrayList = C782550Umr.LIZLLL;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            for (Function0<Unit> function0 : copyOnWriteArrayList) {
                CopyOnWriteArrayList<Function0<Unit>> copyOnWriteArrayList2 = C782550Umr.LIZLLL;
                try {
                    function0.invoke();
                    C189200o6.m2constructorimpl(Unit.LIZ);
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    C189200o6.m2constructorimpl(new C098200Yq(th));
                }
            }
            C782550Umr.LIZLLL.clear();
        }
    }
}
