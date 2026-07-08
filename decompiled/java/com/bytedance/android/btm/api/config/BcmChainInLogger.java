package com.bytedance.android.btm.api.config;

import X.C09CT;
import X.C13BV;
import X.C15438062q;
import X.C1697810uHb;
import X.C1972007ny;
import com.ss.android.ugc.aweme.lazydata.LazyDataBase;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes33.dex */
public final class BcmChainInLogger extends LazyDataBase {

    @C09CT("btm_page_show_allowlist")
    public final List<String> allowlistPages;

    @C09CT("btm_page_show_blocklist")
    public final List<String> blocklistPages;

    @C09CT("btm_page_show_switch")
    public final int btmPageShowSwitch;

    @C09CT("chain_length")
    public final int chainLength;

    @C09CT("btm_page_show_default_send")
    public final int defaultSend;

    @C09CT("event_config")
    public final List<BcmChainEventConfig> eventConfig;

    @C09CT("event_default_allowlist")
    public final List<String> eventDefaultAllowlist;

    @C09CT("event_default_blocklist")
    public final List<String> eventDefaultBlocklist;

    @C09CT("logger_type")
    public final int loggerType;

    public final List<String> LIZ() {
        ArrayList arrayListLIZ = C1972007ny.LIZ(this, this.allowlistPages, String.class, "btm_page_show_allowlist");
        this.allowlistPages = arrayListLIZ;
        return arrayListLIZ;
    }

    public final List<String> LIZIZ() {
        ArrayList arrayListLIZ = C1972007ny.LIZ(this, this.blocklistPages, String.class, "btm_page_show_blocklist");
        this.blocklistPages = arrayListLIZ;
        return arrayListLIZ;
    }

    public final int LIZJ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "btm_page_show_switch", Integer.valueOf(this.btmPageShowSwitch));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.btmPageShowSwitch;
        this.btmPageShowSwitch = iIntValue;
        return iIntValue;
    }

    public final int LIZLLL() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "chain_length", Integer.valueOf(this.chainLength));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.chainLength;
        this.chainLength = iIntValue;
        return iIntValue;
    }

    public final int LJ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "btm_page_show_default_send", Integer.valueOf(this.defaultSend));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.defaultSend;
        this.defaultSend = iIntValue;
        return iIntValue;
    }

    public final List<BcmChainEventConfig> LJFF() {
        ArrayList arrayListLIZ = C1972007ny.LIZ(this, this.eventConfig, BcmChainEventConfig.class, "event_config");
        this.eventConfig = arrayListLIZ;
        return arrayListLIZ;
    }

    public final List<String> LJI() {
        ArrayList arrayListLIZ = C1972007ny.LIZ(this, this.eventDefaultAllowlist, String.class, "event_default_allowlist");
        this.eventDefaultAllowlist = arrayListLIZ;
        return arrayListLIZ;
    }

    public final List<String> LJII() {
        ArrayList arrayListLIZ = C1972007ny.LIZ(this, this.eventDefaultBlocklist, String.class, "event_default_blocklist");
        this.eventDefaultBlocklist = arrayListLIZ;
        return arrayListLIZ;
    }

    public final int LJIIIIZZ() {
        Object objLIZIZ = C1972007ny.LIZIZ(this, "logger_type", Integer.valueOf(this.loggerType));
        if (!(objLIZIZ instanceof Integer)) {
            objLIZIZ = null;
        }
        Integer num = (Integer) objLIZIZ;
        int iIntValue = num != null ? num.intValue() : this.loggerType;
        this.loggerType = iIntValue;
        return iIntValue;
    }

    public BcmChainInLogger() {
        C13BV c13bv = C13BV.INSTANCE;
        this.allowlistPages = c13bv;
        this.blocklistPages = c13bv;
        this.eventDefaultAllowlist = c13bv;
        this.eventDefaultBlocklist = c13bv;
        this.chainLength = 20;
        this.loggerType = 1;
        List<String> listLJIIJJI = C1697810uHb.LJIIJJI("tiktokec_enter_page", "tiktokec_enter_product_detail", "tiktokec_product_show", "tiktokec_product_click", "livesdk_tiktokec_product_click", "livesdk_tiktokec_product_show", "tiktok_video_anchor_click", "tiktok_video_anchor_view", "tiktokec_card_show", "tiktokec_card_click", "livesdk_tiktokec_card_show", "livesdk_tiktokec_card_click", "tiktokec_submit_order_result", "tiktokec_confirm_sku", "tiktokec_confirm_cart", "tiktokec_confirm_cart_result", "livesdk_tiktokec_product_entrance_show", "livesdk_tiktokec_product_entrance_click", "tiktokec_button_show", "tiktokec_button_click", "tiktokec_pay_order", "tiktokec_pay_success_show", "tiktokec_mall_entrance_show", "tiktokec_mall_entrance_click", "tiktokec_shop_entrance_click", "tiktokec_shop_entrance_show", "tiktokec_showcase_entrance_show", "tiktokec_showcase_entrance_click", "tiktokec_cart_entrance_click", "tiktokec_cart_entrance_show", "tiktokec_enter_shop", "tiktokec_enter_showwindow", "affiliate_page_show");
        ArrayList arrayList = new ArrayList(C15438062q.LJIJJ(listLJIIJJI, 10));
        for (String str : listLJIIJJI) {
            BcmChainEventConfig bcmChainEventConfig = new BcmChainEventConfig();
            bcmChainEventConfig.LJI(str);
            arrayList.add(bcmChainEventConfig);
        }
        this.eventConfig = arrayList;
    }
}
