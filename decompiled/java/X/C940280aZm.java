package X;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestRankUSRuleUrlSetting;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0aZm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C940280aZm {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(Context context, DataChannel dataChannel) {
        String value = LiveSdkMultiGuestRankUSRuleUrlSetting.INSTANCE.getValue();
        if (TextUtils.isEmpty(value)) {
            value = "sslocal://webcast_webview?type=popup&url=https%3A%2F%2Flf16-web.tiktokcdn.com%2Fobj%2Fies-hotsoon-draft-sg%2Ftiktok-live-faq%2Fmulti_guest_top_viewers_faq_us.html&gravity=bottom";
        }
        C930540aK4.LJIJI(dataChannel, context, value, false, 24);
    }
}
