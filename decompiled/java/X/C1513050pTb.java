package X;

import android.os.SystemClock;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.ugc.clientai.core.api.FeatureProducer;
import com.ss.ugc.clientai.core.api.FeatureServiceManager;
import com.ss.ugc.clientai.core.api.meta.ReturnCode;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0pTb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1513050pTb {
    public static final C1513050pTb LIZ = new C1513050pTb();
    public static final AtomicInteger LIZIZ = new AtomicInteger(-1);
    public static final AtomicInteger LIZJ = new AtomicInteger(-1);

    public static int LIZ(String str) {
        Object c098200Yq;
        int iIntValue;
        SystemClock.elapsedRealtimeNanos();
        try {
            FeatureServiceManager.Companion.getClass();
            FeatureServiceManager featureServiceManagerLIZ = C1510050pOl.LIZ();
            FeatureProducer producer = featureServiceManagerLIZ.getProducer("ttm_search", 2);
            if (producer != null && featureServiceManagerLIZ.isFeatureRegisterAlready("ttm_search", str)) {
                Number numericFeature$default = FeatureProducer.getNumericFeature$default(producer, str, (JSONObject) null, "tako_user_activity_7d", (ReturnCode) null, 10, (Object) null);
                if (numericFeature$default == null) {
                    iIntValue = 0;
                } else {
                    iIntValue = numericFeature$default.intValue();
                }
            } else {
                iIntValue = -1;
            }
            c098200Yq = Integer.valueOf(iIntValue);
            C189200o6.m2constructorimpl(c098200Yq);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            c098200Yq = new C098200Yq(th);
            C189200o6.m2constructorimpl(c098200Yq);
        }
        C189200o6.m5exceptionOrNullimpl(c098200Yq);
        if (C189200o6.m5exceptionOrNullimpl(c098200Yq) != null) {
            c098200Yq = -1;
        }
        return ((Number) c098200Yq).intValue();
    }
}
