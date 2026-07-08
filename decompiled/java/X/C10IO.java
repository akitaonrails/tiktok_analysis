package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.AwemeStatus;

/* JADX INFO: renamed from: X.10IO, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10IO {
    public static final /* synthetic */ int LIZ = 0;

    public static InterfaceC625970Ogt LIZIZ() {
        return C2192401ArG.LIZ(C589170N8x.LIZ("editorPro"), "mute_strip_profile_banner_keva_repo_name");
    }

    public static String LIZ(Aweme aweme) {
        AwemeStatus statusSafety;
        AwemeStatus.VideoMuteInfo videoMuteInfo;
        AwemeStatus statusSafety2 = AwemeExtKt.getStatusSafety(aweme);
        if (statusSafety2 == null) {
            return "illegal";
        }
        if ((statusSafety2.getMappedMuteStripStatus() != AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_WAIT_FOR_TRIGGER && statusSafety2.getMappedMuteStripStatus() != AwemeStatus.MappedMuteStripStatus.MUTE_STRIP_STATUS_PENDING_FOR_CONFIRM) || (statusSafety = AwemeExtKt.getStatusSafety(aweme)) == null || (videoMuteInfo = statusSafety.getVideoMuteInfo()) == null || !videoMuteInfo.isMute()) {
            return "illegal";
        }
        return "mute";
    }
}
