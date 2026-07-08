package X;

import com.bytedance.hybrid.spark.third.container.SparkThirdWebViewInner;
import com.ss.android.ugc.aweme.framework.services.PluggableExtentionKt;
import com.ss.android.ugc.aweme.hybridkit.bridge.support.SparkJsbNetworkApiImpl;
import com.ss.android.ugc.aweme.spark.ISparkThirdJsBridgeConfigurator;

/* JADX INFO: renamed from: X.1BHf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2202291BHf {
    public C2203501BLw LIZ;

    public final void LIZIZ() {
        ISparkThirdJsBridgeConfigurator iSparkThirdJsBridgeConfigurator;
        C2203501BLw c2203501BLw = this.LIZ;
        if (c2203501BLw != null && (iSparkThirdJsBridgeConfigurator = (ISparkThirdJsBridgeConfigurator) PluggableExtentionKt.pluggableSpi$default(ISparkThirdJsBridgeConfigurator.class, false, false, false, 14, null)) != null) {
            iSparkThirdJsBridgeConfigurator.LJJJJJ(c2203501BLw);
        }
        this.LIZ = null;
    }

    public final void LIZ(SparkThirdWebViewInner sparkThirdWebViewInner) {
        C2203501BLw c2203501BLwLLIZLLLIL;
        SparkJsbNetworkApiImpl sparkJsbNetworkApiImpl = new SparkJsbNetworkApiImpl();
        ISparkThirdJsBridgeConfigurator iSparkThirdJsBridgeConfigurator = (ISparkThirdJsBridgeConfigurator) PluggableExtentionKt.pluggableSpi$default(ISparkThirdJsBridgeConfigurator.class, false, false, false, 14, null);
        if (iSparkThirdJsBridgeConfigurator != null) {
            c2203501BLwLLIZLLLIL = iSparkThirdJsBridgeConfigurator.LLIZLLLIL(sparkThirdWebViewInner, sparkJsbNetworkApiImpl);
        } else {
            c2203501BLwLLIZLLLIL = null;
        }
        this.LIZ = c2203501BLwLLIZLLLIL;
    }
}
