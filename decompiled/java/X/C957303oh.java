package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ecommerce.core.ab.OrderConfig;

/* JADX INFO: renamed from: X.03oh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C957303oh {
    public static final OrderConfig LIZ;

    static {
        new C957303oh();
        LIZ = new OrderConfig(C1697810uHb.LJIILJJIL("entrance_form", "rec_content_id", "rec_content_type", "source_page_type", "enter_from_info", "action_type", "enter_from_merge", "source_content_id", "source_page_type", "search_id", "search_result_id"), C1697810uHb.LJIILJJIL("entrance_form", "rec_content_id", "rec_content_type", "source_page_type", "enter_from_info", "action_type", "enter_from_merge", "source_content_id", "source_page_type", "search_id", "search_result_id", "author_id"), true);
    }

    public static final OrderConfig LIZ() {
        SettingsManager settingsManagerLIZLLL = SettingsManager.LIZLLL();
        OrderConfig orderConfig = LIZ;
        OrderConfig orderConfig2 = (OrderConfig) settingsManagerLIZLLL.LJIIIIZZ("ecom_order_config", OrderConfig.class, orderConfig);
        return orderConfig2 != null ? orderConfig2 : orderConfig;
    }
}
