package X;

import com.bytedance.android.livesdk.livesetting.hybrid.SparkDynamicParam;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0eBI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1078860eBI {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZ(SparkContext sparkContext, String str, SparkDynamicParam[] sparkDynamicParamArr) {
        if (sparkDynamicParamArr != null) {
            for (SparkDynamicParam sparkDynamicParam : sparkDynamicParamArr) {
                for (String str2 : sparkDynamicParam.patternList) {
                    if (Intrinsics.LJFF(str2, "*") || a0.LJJIIZI(str, str2, false)) {
                        String str3 = sparkDynamicParam.paramKey;
                        String str4 = sparkDynamicParam.paramValue;
                        if (str3 != null && str3.length() != 0 && str4 != null && str4.length() != 0) {
                            sparkContext.LJJJZ(str3, str4);
                        }
                    }
                }
            }
        }
    }
}
