package com.bytedance.android.btm.api.config;

import X.C09CT;
import X.C13BV;
import X.C1972007ny;
import com.ss.android.ugc.aweme.lazydata.LazyDataBase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class LoggerBackupAddBtm extends LazyDataBase {

    /* JADX INFO: renamed from: switch, reason: not valid java name */
    @C09CT("switch")
    public final int f13switch = 1;

    @C09CT("event_config")
    public final List<BackupAddBtmEventConfig> eventConfig = C13BV.INSTANCE;

    @C09CT("event_list")
    public final String eventList = "livesdk_live_play,livesdk_tiktokec_button_click,livesdk_tiktokec_card_click,livesdk_tiktokec_card_show,livesdk_tiktokec_product_click,livesdk_tiktokec_product_show,tiktok_video_anchor_click,tiktok_video_anchor_view,tiktokec_bubble_show,tiktokec_button_click,tiktokec_button_show,tiktokec_card_click,tiktokec_card_show,tiktokec_cart_entrance_click,tiktokec_cart_entrance_show,tiktokec_confirm_cart,tiktokec_confirm_cart_result,tiktokec_confirm_sku,tiktokec_coupon_click,tiktokec_coupon_result,tiktokec_coupon_show,tiktokec_enter_list,tiktokec_enter_mall_result,tiktokec_enter_order_deatil,tiktokec_enter_product_detail,tiktokec_enter_shop,tiktokec_enter_showwindow,tiktokec_hover_pendant_click,tiktokec_hover_pendant_show,tiktokec_mall_entrance_click,tiktokec_mall_entrance_show,tiktokec_module_click,tiktokec_module_show,tiktokec_pay_order,tiktokec_pay_success_show,tiktokec_product_click,tiktokec_product_show,tiktokec_search_entrance_click,tiktokec_search_entrance_show,tiktokec_shop_entrance_click,tiktokec_shop_entrance_show,tiktokec_showcase_entrance_click,tiktokec_showcase_entrance_show,tiktokec_stay_product_detail";

    public final List<BackupAddBtmEventConfig> LIZ() {
        ArrayList arrayListLIZ = C1972007ny.LIZ(this, this.eventConfig, BackupAddBtmEventConfig.class, "event_config");
        this.eventConfig = arrayListLIZ;
        return arrayListLIZ;
    }

    public final String LIZIZ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "event_list", this.eventList);
        if (!(objLIZIZ instanceof String)) {
            objLIZIZ = null;
        }
        String str = (String) objLIZIZ;
        if (str == null) {
            str = this.eventList;
        }
        this.eventList = str;
        return str;
    }

    public final int LIZJ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "switch", Integer.valueOf(this.f13switch));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.f13switch;
        this.f13switch = iIntValue;
        return iIntValue;
    }
}
