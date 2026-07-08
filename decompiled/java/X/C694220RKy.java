package X;

import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0RKy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C694220RKy {
    public static final void LIZ(VideoItemParams videoItemParams) {
        videoItemParams.getAweme();
        String str = videoItemParams.mFrom;
        String str2 = videoItemParams.mEventType;
        if ((Intrinsics.LJFF(str, "from_profile_self") || Intrinsics.LJFF(str, "from_profile_other")) && !Intrinsics.LJFF(str2, "others_homepage")) {
            Intrinsics.LJFF(str2, "personal_homepage");
        }
    }
}
