package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.Video;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.AFwS187S0000000_2;

/* JADX INFO: renamed from: X.05eR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1403305eR {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS187S0000000_2.get$arr$(1373));

    public static boolean LIZ(Aweme aweme) {
        Video video;
        C01GW c01gw = C1403405eS.LIZ;
        if (((Number) c01gw.getValue()).floatValue() > 0.0f) {
            if (((Number) c01gw.getValue()).floatValue() > 0.0f) {
                if (aweme == null) {
                    return false;
                }
                if (!AwemeExtKt.isPhotoMode(aweme) && ((video = aweme.getVideo()) == null || video.getDuration() > ((Number) c01gw.getValue()).floatValue() * 60 * LSPassThroughRecordSizeConfig.DEFAULT)) {
                    return false;
                }
            }
            return true;
        }
        C01GW c01gw2 = LIZ;
        if (((Number) c01gw2.getValue()).intValue() <= 0) {
            return true;
        }
        if (aweme == null) {
            return false;
        }
        if (AwemeExtKt.isPhotoMode(aweme)) {
            return true;
        }
        Video video2 = aweme.getVideo();
        if (video2 == null || video2.getDuration() > ((Number) c01gw2.getValue()).intValue() * 60 * LSPassThroughRecordSizeConfig.DEFAULT) {
            return false;
        }
        return true;
    }
}
