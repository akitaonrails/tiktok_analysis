package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;

/* JADX INFO: renamed from: X.0PtB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C659070PtB {
    public static final boolean LIZ(Aweme aweme) {
        AwemeStatus statusSafety;
        AwemeStatus.VideoMuteInfo videoMuteInfo;
        AwemeStatus statusSafety2;
        AwemeStatus.VideoMuteInfo videoMuteInfo2;
        if (aweme != null && (statusSafety = AwemeExtKt.getStatusSafety(aweme)) != null && (videoMuteInfo = statusSafety.getVideoMuteInfo()) != null && videoMuteInfo.isMute() && (statusSafety2 = AwemeExtKt.getStatusSafety(aweme)) != null && (videoMuteInfo2 = statusSafety2.getVideoMuteInfo()) != null && videoMuteInfo2.getIsCopyrightViolation()) {
            return true;
        }
        return false;
    }
}
