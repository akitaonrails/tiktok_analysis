package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.comment.exposedcmt.limit.ExposedCommentRemoveOnceData;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeStatistics;
import com.ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sjs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C729740Sjs {
    public static boolean LIZ(VideoItemParams videoItemParams) {
        AwemeStatistics statistics;
        ExposedCommentRemoveOnceData exposedCommentRemoveOnceData;
        Aweme aweme = videoItemParams.getAweme();
        String str = videoItemParams.mEventType;
        if (C1589640rT8.LIZIZ.t2(videoItemParams.fragment) && C1A1F.LIZ(str)) {
            CommentService.LIZ.getClass();
            if (!C523420Kfs.LIZ().LJIILLIIL(aweme) && C523420Kfs.LIZ().LJJIJIIJIL(aweme) && (statistics = aweme.getStatistics()) != null && statistics.getCommentCount() > 0 && !C729510SjV.LJJIJIL(aweme) && Intrinsics.LJFF(ComplianceServiceProvider.LJI().LJJIII().getValue(), Boolean.FALSE)) {
                C729770Sjv.LIZ.getClass();
                String curUserId = ((AbstractC848400XPy) C0XQ7.LJFF()).getCurUserId();
                C729770Sjv.LIZIZ();
                C729750Sjt c729750Sjt = (C729750Sjt) C729770Sjv.LIZLLL().get(curUserId);
                if (c729750Sjt == null || !c729750Sjt.LIZIZ) {
                    C729750Sjt c729750Sjt2 = (C729750Sjt) C729770Sjv.LIZLLL().get(curUserId);
                    if (c729750Sjt2 != null && (exposedCommentRemoveOnceData = c729750Sjt2.LIZ) != null) {
                        long j = 60;
                        if (System.currentTimeMillis() - exposedCommentRemoveOnceData.startLimitTime > ((long) exposedCommentRemoveOnceData.totalLimitDays) * 24 * j * j * ((long) LSPassThroughRecordSizeConfig.DEFAULT)) {
                            C729750Sjt c729750Sjt3 = (C729750Sjt) C729770Sjv.LIZLLL().get(curUserId);
                            if (c729750Sjt3 != null) {
                                c729750Sjt3.LIZ = null;
                            }
                            ((Keva) C729770Sjv.LIZJ.getValue()).erase(curUserId);
                            ((Keva) C729770Sjv.LJ.getValue()).erase(curUserId);
                            return true;
                        }
                    } else {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
