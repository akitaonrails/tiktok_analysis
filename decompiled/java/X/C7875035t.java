package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.core.ab.CreateOrderLimitData;
import java.util.Collections;

/* JADX INFO: renamed from: X.035t, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C7875035t {
    public static final CreateOrderLimitData LIZ = new CreateOrderLimitData(Boolean.FALSE, 3000L, 3, Collections.singletonList("48005003"), Collections.singletonList("429"));

    public static long LIZ() {
        Long l = LIZIZ().delayTime;
        if (l != null) {
            return l.longValue();
        }
        return 3000L;
    }

    public static final CreateOrderLimitData LIZIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        CreateOrderLimitData createOrderLimitData = LIZ;
        CreateOrderLimitData createOrderLimitData2 = (CreateOrderLimitData) settingsManagerLIZLLL.LJIIIIZZ("sku_order_limit_exception", CreateOrderLimitData.class, createOrderLimitData);
        return createOrderLimitData2 != null ? createOrderLimitData2 : createOrderLimitData;
    }

    public static int LIZJ() {
        Integer num = LIZIZ().maxRetryCount;
        if (num != null) {
            return num.intValue();
        }
        return 3;
    }
}
