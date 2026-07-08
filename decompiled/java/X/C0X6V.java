package X;

import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.spark.ISparkHostApi;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0X6V, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0X6V extends C09AY implements Function0<Boolean> {
    public C0X6V() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        ISparkHostApi iSparkHostApi = (ISparkHostApi) PluggableExtentionKt.pluggableSpi$default(ISparkHostApi.class, false, false, false, 14, null);
        return Boolean.valueOf((iSparkHostApi != null && iSparkHostApi.LJLILLLLZI()) || C2213981Bky.LIZIZ.isRegressionTest());
    }
}
