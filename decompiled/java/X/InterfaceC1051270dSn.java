package X;

import android.content.Context;
import android.os.Bundle;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.commercialize.hybrid.api.web.context.AdSparkHybridContext;

/* JADX INFO: renamed from: X.0dSn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public interface InterfaceC1051270dSn {
    AdSparkHybridContext createAdSparkContext(Context context, String str, String str2, Bundle bundle, InterfaceC1020440cf4 interfaceC1020440cf4, String str3, C1051340dSu c1051340dSu);

    InterfaceC1051160dSc createSparkMixture(Context context, String str, Bundle bundle, String str2, AbstractC1542100qES abstractC1542100qES, InterfaceC1020440cf4 interfaceC1020440cf4, String str3, C1051340dSu c1051340dSu);

    InterfaceC1051160dSc createSparkMixture(SparkContext sparkContext, InterfaceC1540940qCa interfaceC1540940qCa);

    C1051630dTN getPrerenderConfig(C1051290dSp c1051290dSp);

    String getTag();

    boolean isPreloadViewLoadSuccess(InterfaceC1540940qCa interfaceC1540940qCa);
}
