package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicFeedShowUniqueCardSetting;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0Zwb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C915990Zwb extends C09AY implements Function0<Integer> {
    public C915990Zwb() {
        super(0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue("multi_guest_feed_show_unique_card_client_control", LinkMicFeedShowUniqueCardSetting.DEFAULT));
    }
}
