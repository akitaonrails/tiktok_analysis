package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.core.ab.CheckoutLimitData;
import com.ss.android.ugc.aweme.experiment.Mp4ScreenVideoLoadTimeout;
import java.util.Collections;

/* JADX INFO: renamed from: X.03Wh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C856503Wh {
    public static final CheckoutLimitData LIZ = new CheckoutLimitData(Boolean.TRUE, Long.valueOf(Mp4ScreenVideoLoadTimeout.CONTROL), 3, Collections.singletonList("48005003"), Collections.singletonList("429"));

    public static long LIZ() {
        Long l = LIZIZ().delayTime;
        return l != null ? l.longValue() : Mp4ScreenVideoLoadTimeout.CONTROL;
    }

    public static final CheckoutLimitData LIZIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        CheckoutLimitData checkoutLimitData = LIZ;
        CheckoutLimitData checkoutLimitData2 = (CheckoutLimitData) settingsManagerLIZLLL.LJIIIIZZ("sku_osp_limit_exception", CheckoutLimitData.class, checkoutLimitData);
        return checkoutLimitData2 != null ? checkoutLimitData2 : checkoutLimitData;
    }

    public static int LIZJ() {
        Integer num = LIZIZ().maxRetryCount;
        if (num != null) {
            return num.intValue();
        }
        return 3;
    }
}
