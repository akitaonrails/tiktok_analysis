package X;

import com.ss.android.ugc.aweme.aigc.quality.mob.definitions.AIGC;
import com.ss.android.ugc.aweme.feed.model.AITheaterInfo;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.theater.service.IAITheaterFeatureService;

/* JADX INFO: renamed from: X.0M4d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C562450M4d {
    public static boolean LIZ() {
        InterfaceC558600LvW interfaceC558600LvWLIZIZ;
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        return (iAITheaterFeatureServiceLIZ == null || (interfaceC558600LvWLIZIZ = iAITheaterFeatureServiceLIZ.LIZIZ()) == null || !interfaceC558600LvWLIZIZ.LJJ()) ? false : true;
    }

    public static boolean LIZIZ(VideoItemParams videoItemParams) {
        boolean z;
        AITheaterInfo aITheaterInfo;
        Aweme aweme = videoItemParams.getAweme();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("can Assemble: ");
        sbLIZ.append(LIZ());
        sbLIZ.append(", aiTheaterInfo != null: ");
        if (aweme.aiTheaterInfo != null) {
            z = true;
        } else {
            z = false;
        }
        sbLIZ.append(z);
        sbLIZ.append(", allowAIRemix: ");
        sbLIZ.append(aweme.getAllowAIRemix());
        C2188811AlT.LIZIZ(sbLIZ);
        if (LIZ() && (aITheaterInfo = aweme.aiTheaterInfo) != null && aITheaterInfo.getCameoInfo() != null && aweme.getAllowAIRemix() == 1) {
            return true;
        }
        IAITheaterFeatureService.LIZ.getClass();
        IAITheaterFeatureService iAITheaterFeatureServiceLIZ = C549720LhC.LIZ();
        if (iAITheaterFeatureServiceLIZ == null) {
            return false;
        }
        C549760LhG.LIZ(iAITheaterFeatureServiceLIZ, AIGC.AICreationSceneName.REMIX_FEED_STORY.INSTANCE);
        return false;
    }
}
