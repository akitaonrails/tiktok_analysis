package X;

import com.ss.android.ugc.aweme.ecommerce.mixmall.settings.ECMixMallFeedConfigModel;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.AFwS215S0000000_26;

/* JADX INFO: renamed from: X.0wEu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1773020wEu {
    public static final C1773020wEu LIZ = new C1773020wEu();
    public static final ECMixMallFeedConfigModel LIZIZ = new ECMixMallFeedConfigModel(7, LSPassThroughRecordSizeConfig.DEFAULT, 0, 0, 0);
    public static final C01GW LIZJ = C452501pT.LIZIZ(AFwS215S0000000_26.get$arr$(339));

    public static ECMixMallFeedConfigModel LIZIZ() {
        return (ECMixMallFeedConfigModel) LIZJ.getValue();
    }

    public static boolean LIZ() {
        Integer num;
        Integer num2 = LIZIZ().enableFeedDynamicHeight;
        return (num2 != null && num2.intValue() == 1) || ((num = LIZIZ().enableFeedDynamicHeight) != null && num.intValue() == 2);
    }
}
