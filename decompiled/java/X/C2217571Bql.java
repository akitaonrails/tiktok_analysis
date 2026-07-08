package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.CustomBizInfo;
import com.ss.android.ugc.aweme.feed.model.HighQualityBoostInfoV2;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1Bql, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class C2217571Bql {
    public static final HighQualityBoostInfoV2 LIZ(HighQualityBoostInfoV2 highQualityBoostInfoV2) {
        String str;
        String str2;
        if (!Intrinsics.LJFF(highQualityBoostInfoV2.isHqPhotoBoost(), Boolean.TRUE) || (str = highQualityBoostInfoV2.description) == null || str.length() == 0 || (str2 = highQualityBoostInfoV2.link) == null || str2.length() == 0) {
            return null;
        }
        return highQualityBoostInfoV2;
    }

    public static final HighQualityBoostInfoV2 LIZIZ(Aweme aweme) {
        CustomBizInfo customBizInfo;
        ContentModel contentModel = aweme.getContentModel();
        if (contentModel != null && (customBizInfo = contentModel.customBizInfo) != null) {
            return customBizInfo.highQualityBoostInfoV2;
        }
        return null;
    }

    public static final boolean LIZJ(Aweme aweme) {
        HighQualityBoostInfoV2 highQualityBoostInfoV2LIZIZ;
        String aid = aweme.getAid();
        if (aid == null) {
            return false;
        }
        HighQualityBoostInfoV2 highQualityBoostInfoV2LIZ = null;
        if (C0C64.LJIILLIIL().LJIIIZ(31744, "studio_after_creation_feedback_in_detail", true, false) && C729980SkG.LJIIIIZZ(aweme) && AwemeExtKt.isPhotoMode(aweme) && (highQualityBoostInfoV2LIZIZ = LIZIZ(aweme)) != null && LIZ(highQualityBoostInfoV2LIZIZ) != null) {
            C2217581Bqm c2217581BqmLIZIZ = C2217591Bqn.LIZIZ();
            String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
            c2217581BqmLIZIZ.LIZJ(curUserId);
            if (c2217581BqmLIZIZ.LIZ().getBoolean(C786410Ut5.j4("uid_%s_is_permanently_exited", Arrays.copyOf(new Object[]{curUserId}, 1)), false) || c2217581BqmLIZIZ.LIZ().getBoolean(C786410Ut5.j4("gid_%s_%s_is_exited", Arrays.copyOf(new Object[]{curUserId, aid}, 2)), false) || c2217581BqmLIZIZ.LIZ().getBoolean(C2217591Bqn.LIZLLL(curUserId, aid), false) || c2217581BqmLIZIZ.LIZ().getInt(C786410Ut5.j4("gid_%s_%s_daily_exposure_count", Arrays.copyOf(new Object[]{curUserId, aid}, 2)), 0) >= C2217591Bqn.LIZ().gidMaxExposureCount || c2217581BqmLIZIZ.LIZ().getInt(C2217591Bqn.LJI(curUserId), 0) >= c2217581BqmLIZIZ.LIZIZ(curUserId)) {
                return false;
            }
            return true;
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("photo mode source aweme.getHighQualityBoostInfoV2()?.checkValid() = ");
        HighQualityBoostInfoV2 highQualityBoostInfoV2LIZIZ2 = LIZIZ(aweme);
        if (highQualityBoostInfoV2LIZIZ2 != null) {
            highQualityBoostInfoV2LIZ = LIZ(highQualityBoostInfoV2LIZIZ2);
        }
        sbLIZ.append(highQualityBoostInfoV2LIZ);
        System.out.println((Object) C2188811AlT.LIZIZ(sbLIZ));
        return false;
    }
}
