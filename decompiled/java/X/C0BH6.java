package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0BH6, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0BH6 extends C09AY implements Function0<Integer> {
    public C0BH6() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        int iLJI = 0;
        try {
            iLJI = C0C59.LJ().LJI("search_coin_task_feed_bubble", 0, true);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
        }
        return Integer.valueOf(iLJI);
    }
}
