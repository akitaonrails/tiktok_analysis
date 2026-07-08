package X;

import com.ss.android.ugc.aweme.feed.AIGCInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;

/* JADX INFO: renamed from: X.0RNA, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RNA {
    public static boolean LIZ(VideoItemParams videoItemParams) {
        Integer numValueOf;
        AIGCInfo aIGCInfo;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("canTrigger: label_type = ");
        Aweme aweme = videoItemParams.getAweme();
        Boolean boolValueOf = null;
        if (aweme != null && (aIGCInfo = aweme.aigcInfo) != null) {
            numValueOf = Integer.valueOf(aIGCInfo.getAIGCLabelType());
        } else {
            numValueOf = null;
        }
        sbLIZ.append(numValueOf);
        sbLIZ.append(", need auto = ");
        Aweme aweme2 = videoItemParams.getAweme();
        if (aweme2 != null) {
            boolValueOf = Boolean.valueOf(C0SD5.LIZJ(aweme2));
        }
        sbLIZ.append(boolValueOf);
        C2188811AlT.LIZIZ(sbLIZ);
        Aweme aweme3 = videoItemParams.getAweme();
        if (aweme3 != null && C0SD5.LIZIZ(aweme3)) {
            return true;
        }
        return false;
    }
}
