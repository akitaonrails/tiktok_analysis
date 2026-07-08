package X;

import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoRecordData;
import com.ss.android.ugc.aweme.creative.model.edit.multiedit.MultiEditVideoStatusRecordData;
import com.ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import kotlin.text.a0;

/* JADX INFO: renamed from: X.0njD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1445850njD {
    public static final CreativeInfo LIZ = new CreativeInfo("FixedCreativeInfo", 0, null, 4, null);
    public static final CreativeInfo LIZIZ = new CreativeInfo("ab_roll", 0, null, 4, null);
    public static final CreativeInfo LIZJ = new CreativeInfo("story_thought", 0, null, 4, null);
    public static final CreativeInfo LIZLLL = new CreativeInfo("celebration", 0, null, 4, null);
    public static final CreativeInfo LJ = new CreativeInfo("story_highlights", 0, null, 4, null);

    public static final void LIZ(Workspace workspace, VideoPublishEditModel videoPublishEditModel) {
        MultiEditVideoStatusRecordData multiEditVideoRecordData;
        MultiEditVideoRecordData multiEditVideoRecordData2;
        String str;
        if (workspace != null && videoPublishEditModel != null && (multiEditVideoRecordData = videoPublishEditModel.getMultiEditVideoRecordData()) != null && (multiEditVideoRecordData2 = multiEditVideoRecordData.curMultiEditVideoRecordData) != null && (str = multiEditVideoRecordData2.curRecordingDir) != null) {
            String strLIZJ = C570490MZb.LIZJ(str);
            int iLJJJ = a0.LJJJ(strLIZJ, "new", 0, false, 6);
            if (iLJJJ >= 0) {
                workspace.LL.kr(C570490MZb.LIZJ(strLIZJ.substring(0, iLJJJ)));
            } else {
                workspace.LL.kr(strLIZJ);
            }
        }
    }
}
