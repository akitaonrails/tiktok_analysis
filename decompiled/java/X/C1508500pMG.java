package X;

import com.ss.android.ugc.aweme.ecommerce.monitor.ECSDKTracker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0pMG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1508500pMG extends C09AY implements Function0<Integer> {
    public C1508500pMG() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        Integer num = ECSDKTracker.INSTANCE.getConfigData().maxStore;
        return Integer.valueOf(num != null ? num.intValue() : 20);
    }
}
