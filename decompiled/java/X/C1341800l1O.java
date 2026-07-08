package X;

import com.ss.android.ugc.aweme.comment.model.CommentCommonModel;
import com.ss.android.ugc.aweme.comment.model.CommentContextSource;
import com.ss.android.ugc.aweme.comment.services.CommentService;
import com.ss.android.ugc.aweme.compliance.api.ComplianceServiceProvider;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.AwemeExtKt;

/* JADX INFO: renamed from: X.0l1O, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes22.dex */
public final class C1341800l1O {
    public static EnumC1341660l1A LIZ(CommentContextSource commentContextSource, Aweme aweme) {
        Boolean boolValueOf;
        CommentCommonModel commonModel;
        CommentCommonModel commonModel2;
        if (commentContextSource != null && (commonModel2 = commentContextSource.getCommonModel()) != null && commonModel2.isNoPermissionVideoFromCommentHistory()) {
            return EnumC1341660l1A.HISTORY_NO_PERMISSION;
        }
        if (C729510SjV.LJJI(aweme)) {
            return EnumC1341660l1A.STORY_EXPIRED;
        }
        if ((commentContextSource == null || (commonModel = commentContextSource.getCommonModel()) == null || commonModel.enableComment) && !C1017070cZd.LJJLIL(aweme)) {
            Boolean boolValueOf2 = null;
            if (aweme != null) {
                boolValueOf = Boolean.valueOf(aweme.isCmtSwt());
            } else {
                boolValueOf = null;
            }
            if (!C1346420l8q.LIZ(boolValueOf)) {
                CommentService.LIZ.getClass();
                if (!C523420Kfs.LIZ().LJIILLIIL(aweme)) {
                    if (aweme != null) {
                        boolValueOf2 = Boolean.valueOf(AwemeExtKt.isProhibited(aweme));
                    }
                    if (!C1346420l8q.LIZ(boolValueOf2) && !C1348690lCV.LIZJ(aweme)) {
                        C1342970l3H c1342970l3H = C1342970l3H.LIZ;
                        if (!C1342970l3H.LIZIZ.LJIIIIZZ()) {
                            if (ComplianceServiceProvider.LJFF().LJFF()) {
                                return EnumC1341660l1A.AU16_COMMENT_BAN;
                            }
                            if (ComplianceServiceProvider.LJFF().LIZJ(3)) {
                                return EnumC1341660l1A.FUNCTION_BAN;
                            }
                            if (!C1348690lCV.LIZ(aweme)) {
                                return EnumC1341660l1A.COMMENT_LIMIT;
                            }
                            return EnumC1341660l1A.AVAILABLE;
                        }
                    }
                }
                return EnumC1341660l1A.COMMENT_CLOSE;
            }
        }
        return EnumC1341660l1A.COMMENT_CLOSE;
    }

    public static String LIZIZ(Aweme aweme, EnumC1346360l8k enumC1346360l8k) {
        if (aweme == null) {
            return "";
        }
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(aweme.getAid());
        sbLIZ.append('_');
        sbLIZ.append(enumC1346360l8k);
        return C2188811AlT.LIZIZ(sbLIZ);
    }
}
