package X;

import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.feed.LiveCardComponentReversalConfigSetting;
import com.ss.android.ugc.aweme.feed.adapter.widget.ShowInfoWidget;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.ss.android.ugc.aweme.feed.model.live.TopFrameSummary;

/* JADX INFO: renamed from: X.0c76, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C999380c76 {
    public static boolean LIZ(C1ACA c1aca) {
        String title;
        LiveRoomStruct liveRoomStruct;
        Aweme aweme;
        LiveRoomStruct newLiveRoomDataExt;
        TopFrameSummary topFrameSummary;
        if (c1aca != null && C1ABT.LJIILIIL(c1aca) && (!LiveCardComponentReversalConfigSetting.reversalComponent(ShowInfoWidget.LLJIJIL.getComponentName().getValue())) && c1aca != null) {
            if (TextUtils.equals(c1aca.LIZLLL, "homepage_hot") || TextUtils.equals(c1aca.LIZLLL, "homepage_follow")) {
                String str = null;
                if (c1aca != null && (aweme = c1aca.LIZIZ) != null && (newLiveRoomDataExt = AwemeExtKt.getNewLiveRoomDataExt(aweme)) != null && (topFrameSummary = newLiveRoomDataExt.topFrameSummary) != null) {
                    title = topFrameSummary.getTitle();
                } else {
                    title = null;
                }
                if (TextUtils.isEmpty(title)) {
                    if (c1aca != null && (liveRoomStruct = c1aca.LIZJ) != null) {
                        str = liveRoomStruct.title;
                    }
                    if (TextUtils.isEmpty(str)) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return false;
    }
}
