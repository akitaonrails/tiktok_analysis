package X;

import com.ss.android.ugc.aweme.ecommerce.monitor.ECSDKTracker;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0pMF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class C1508490pMF extends C09AY implements Function0<Float> {
    public C1508490pMF() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Float invoke() {
        Float f = ECSDKTracker.INSTANCE.getConfigData().getServiceRate;
        return Float.valueOf(f != null ? f.floatValue() : 0.1f);
    }
}
