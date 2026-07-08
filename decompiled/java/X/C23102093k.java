package X;

import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import com.ss.android.ugc.aweme.experiment.newuser.WeakNetCountryGeckoNormalOptSettings;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.strategy.api.IStrategyApi;

/* JADX INFO: renamed from: X.093k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class C23102093k {
    public static final WeakNetCountryGeckoNormalOptSettings.GeckoxWeakCountryChannelWhitelistModel LIZ;

    static {
        LIZ = (WeakNetCountryGeckoNormalOptSettings.GeckoxWeakCountryChannelWhitelistModel) GsonProtectorUtils.fromJson(C7740030o.LIZ().getGson(), ((IStrategyApi) ServiceManager.get().getService(IStrategyApi.class)).getAppId() == 1233 ? "{\n  \"enable\": true,\n  \"unloadDays\": 14,\n  \"whiteList\": [\n    \"gecko_hybrid_prefetch_config\",\n    \"tiktok_live_link_mic\",\n    \"tiktok_live_lynx_goal_indicator_container\",\n    \"roma_schema_config\",\n    \"resso-tt-lynx_full_song\",\n    \"tt_messaging_mt_emoji_zip\",\n    \"fe_tiktok_lynx_search_transfer\"\n  ]\n}" : "{\n  \"enable\": true,\n  \"unloadDays\": 14,\n  \"whiteList\": [\n    \"gecko_hybrid_prefetch_config\",\n    \"tiktok_live_link_mic\",\n    \"tiktok_live_lynx_goal_indicator_container\",\n    \"wallet\",\n    \"roma_schema_config\",\n    \"tt_messaging_mt_emoji_zip\",\n    \"resso-tt-lynx_full_song\",\n    \"tiktok_live_ecommerce_voucher_short_touch\",\n    \"fe_tiktok_lynx_search_transfer\"\n  ]\n}", WeakNetCountryGeckoNormalOptSettings.GeckoxWeakCountryChannelWhitelistModel.class);
    }
}
