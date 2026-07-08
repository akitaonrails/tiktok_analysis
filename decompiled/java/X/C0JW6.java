package X;

import com.bytedance.android.live.annotation.ScopeValue;
import com.bytedance.android.live_settings.LiveSettingModel;
import com.google.gson.q;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0JW6, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JW6 {
    public final HashMap<String, LiveSettingModel> LIZ = new HashMap<>(2);
    public final HashMap<String, ScopeValue> LIZIZ = new HashMap<>(2);

    public final HashMap<String, LiveSettingModel> LIZ() {
        if (this.LIZ.size() > 0) {
            return this.LIZ;
        }
        this.LIZ.put("com.bytedance.android.livesdk.comp.impl.subscription.business.perks.subwave.emote.SubscriptionAnchorEmotesSettingItemPolicy", new LiveSettingModel("subscription_anchor_emotes_setting_item_policy", "java.lang.String", new q("https://sf19-draftcdn-sg.ibytedtos.com/obj/ies-hotsoon-draft-sg/tiktok-live/634e6d93-67b9-4e98-b706-b87accc60611_en.html")));
        this.LIZ.put("com.bytedance.android.livesdk.comp.impl.subscription.payment.setting.LiveSubTplListPrefetchOptSetting", new LiveSettingModel("sub_tpl_list_prefetch_opt", "boolean", new q(Boolean.FALSE)));
        return this.LIZ;
    }
}
