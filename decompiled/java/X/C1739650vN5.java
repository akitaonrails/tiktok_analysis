package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.ecommercelive.common.infra.data.PdpTopBubble;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0vN5, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1739650vN5 {
    public static final C1739650vN5 LIZ = new C1739650vN5();
    public static final HashMap<String, Object> LIZIZ = new HashMap<>();

    public final void LIZ() {
        synchronized (this) {
            try {
                LIZIZ.clear();
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }

    public final void LIZIZ(PdpTopBubble pdpTopBubble) {
        synchronized (this) {
            try {
                LIZIZ.put("cache_key_live_pin_card_portable_view", pdpTopBubble);
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
    }
}
