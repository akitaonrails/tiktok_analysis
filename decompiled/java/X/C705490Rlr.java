package X;

import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.feed.model.CMPreviewInfo;
import com.ss.android.ugc.aweme.feed.model.ContentModel;
import com.ss.android.ugc.aweme.feed.model.StandardBusinessModel;

/* JADX INFO: renamed from: X.0Rlr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C705490Rlr {
    public static final /* synthetic */ int LIZ = 0;

    public static Float LIZ(Aweme aweme) {
        ContentModel contentModel;
        StandardBusinessModel standardBusinessModel;
        CMPreviewInfo cmPreviewInfo;
        Boolean shouldShowPreview;
        StandardBusinessModel standardBusinessModel2;
        CMPreviewInfo cmPreviewInfo2;
        Long generatedPreviewStartTime;
        if (aweme == null || (contentModel = aweme.getContentModel()) == null || (standardBusinessModel = contentModel.standardBusinessModel) == null || (cmPreviewInfo = standardBusinessModel.getCmPreviewInfo()) == null || (shouldShowPreview = cmPreviewInfo.getShouldShowPreview()) == null || !shouldShowPreview.booleanValue()) {
            return null;
        }
        shouldShowPreview.booleanValue();
        ContentModel contentModel2 = aweme.getContentModel();
        if (contentModel2 == null || (standardBusinessModel2 = contentModel2.standardBusinessModel) == null || (cmPreviewInfo2 = standardBusinessModel2.getCmPreviewInfo()) == null || (generatedPreviewStartTime = cmPreviewInfo2.getGeneratedPreviewStartTime()) == null) {
            return null;
        }
        long jLongValue = generatedPreviewStartTime.longValue();
        Long generatedPreviewDuration = cmPreviewInfo2.getGeneratedPreviewDuration();
        if (generatedPreviewDuration == null) {
            return null;
        }
        long jLongValue2 = generatedPreviewDuration.longValue();
        if (aweme.getVideo() == null) {
            return null;
        }
        return Float.valueOf((jLongValue + jLongValue2) / r0.getDuration());
    }

    public static Long LIZIZ(Aweme aweme) {
        ContentModel contentModel;
        StandardBusinessModel standardBusinessModel;
        CMPreviewInfo cmPreviewInfo;
        Boolean shouldShowPreview;
        StandardBusinessModel standardBusinessModel2;
        CMPreviewInfo cmPreviewInfo2;
        Long generatedPreviewStartTime;
        if (aweme == null || (contentModel = aweme.getContentModel()) == null || (standardBusinessModel = contentModel.standardBusinessModel) == null || (cmPreviewInfo = standardBusinessModel.getCmPreviewInfo()) == null || (shouldShowPreview = cmPreviewInfo.getShouldShowPreview()) == null || !shouldShowPreview.booleanValue()) {
            return null;
        }
        shouldShowPreview.booleanValue();
        ContentModel contentModel2 = aweme.getContentModel();
        if (contentModel2 == null || (standardBusinessModel2 = contentModel2.standardBusinessModel) == null || (cmPreviewInfo2 = standardBusinessModel2.getCmPreviewInfo()) == null || (generatedPreviewStartTime = cmPreviewInfo2.getGeneratedPreviewStartTime()) == null) {
            return null;
        }
        long jLongValue = generatedPreviewStartTime.longValue();
        Long generatedPreviewDuration = cmPreviewInfo2.getGeneratedPreviewDuration();
        if (generatedPreviewDuration == null) {
            return null;
        }
        return Long.valueOf(jLongValue + generatedPreviewDuration.longValue());
    }

    public static Float LIZJ(Aweme aweme) {
        ContentModel contentModel;
        StandardBusinessModel standardBusinessModel;
        CMPreviewInfo cmPreviewInfo;
        Long generatedPreviewStartTime;
        if (aweme != null && (contentModel = aweme.getContentModel()) != null && (standardBusinessModel = contentModel.standardBusinessModel) != null && (cmPreviewInfo = standardBusinessModel.getCmPreviewInfo()) != null && (generatedPreviewStartTime = cmPreviewInfo.getGeneratedPreviewStartTime()) != null) {
            long jLongValue = generatedPreviewStartTime.longValue();
            if (aweme.getVideo() != null) {
                return Float.valueOf(jLongValue / r0.getDuration());
            }
            return null;
        }
        return null;
    }
}
