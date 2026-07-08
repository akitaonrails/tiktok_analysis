package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.073r, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C18013073r extends C09AY implements Function0<Long> {
    public C18013073r() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Long invoke() {
        long jLJIJJLI;
        try {
            jLJIJJLI = C0C64.LJIILLIIL().LJIJJLI(31744, 3000L, "explore_fetch_topic_delay_duration_exp", true);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            jLJIJJLI = 3000;
        }
        return Long.valueOf(jLJIJJLI);
    }
}
