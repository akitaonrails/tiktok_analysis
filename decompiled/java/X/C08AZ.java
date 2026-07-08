package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.08AZ, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C08AZ extends C09AY implements Function0<Map<Aweme, Integer>> {
    public C08AZ() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Map<Aweme, Integer> invoke() {
        boolean zLJIIIZ = false;
        try {
            zLJIIIZ = C0C64.LJIILLIIL().LJIIIZ(31744, "feed_ad_async_log", true, false);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C1AF0.LJ(th);
        }
        return zLJIIIZ ? Collections.synchronizedMap(new WeakHashMap()) : new WeakHashMap();
    }
}
