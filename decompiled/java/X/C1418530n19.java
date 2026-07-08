package X;

import com.ss.android.ugc.aweme.creative.model.AutoCutThemeData;
import com.ss.android.ugc.aweme.draft.model.CutSameEditData;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0n19, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1418530n19 {
    public static final String LIZ(VideoPublishEditModel videoPublishEditModel) {
        if (!LIZIZ(videoPublishEditModel)) {
            return null;
        }
        if (C1428470nHB.LJJJJLI(videoPublishEditModel)) {
            AutoCutThemeData autoCutThemeDataLIZJ = C1416110mxF.LIZJ(videoPublishEditModel.creativeModel.autoCutModel);
            if (autoCutThemeDataLIZJ == null) {
                return null;
            }
            return autoCutThemeDataLIZJ.musicId;
        }
        if (!videoPublishEditModel.isCutSameVideoType()) {
            return null;
        }
        return videoPublishEditModel.cutSameEditData.musicId;
    }

    public static final boolean LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        if (C1428470nHB.LJJJJLI(videoPublishEditModel)) {
            AutoCutThemeData autoCutThemeDataLIZJ = C1416110mxF.LIZJ(videoPublishEditModel.creativeModel.autoCutModel);
            if (autoCutThemeDataLIZJ == null) {
                return false;
            }
            return C0LCZ.LIZ(EnumC1412640mre.CUT_SAME, autoCutThemeDataLIZJ.musicPostUnavailable, autoCutThemeDataLIZJ.musicId, autoCutThemeDataLIZJ.musicUrl);
        }
        if (!videoPublishEditModel.isCutSameVideoType()) {
            return false;
        }
        EnumC1412640mre enumC1412640mre = EnumC1412640mre.CUT_SAME;
        CutSameEditData cutSameEditData = videoPublishEditModel.cutSameEditData;
        return C0LCZ.LIZ(enumC1412640mre, cutSameEditData.musicPostUnavailable, cutSameEditData.musicId, cutSameEditData.musicUrl);
    }
}
