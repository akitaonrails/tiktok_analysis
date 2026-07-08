package X;

import com.ss.android.ugc.aweme.creative.model.photomode.airewrite.AIRewriteModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0MpQ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C580300MpQ {
    public static final void LIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        int i;
        AIRewriteModel aIRewriteModel = videoPublishEditModel.creativeModel.imagePublishBackSaveModel.aiRewriteModel;
        if (!aIRewriteModel.isLastUsedAIRewrite && !aIRewriteModel.isCurUsedAIRewrite) {
            i = 0;
        } else {
            i = 1;
        }
        c0lab.LIZ(i, "is_used_ai_rewrite");
    }
}
