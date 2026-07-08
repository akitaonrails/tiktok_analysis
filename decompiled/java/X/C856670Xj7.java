package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0Xj7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C856670Xj7 {
    public static void LIZ(VideoPublishEditModel videoPublishEditModel, String str, long j) {
        int length;
        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("creationId: ");
        sbLIZ.append(videoPublishEditModel.getCreationId());
        sbLIZ.append(", restore caption cost: ");
        sbLIZ.append(j);
        sbLIZ.append("ms");
        c1437510nVlLJJLIIIJ.LIZ("lexical", C2188811AlT.LIZIZ(sbLIZ));
        C0LAB c0labLJFF = C0EMD.LJFF(videoPublishEditModel);
        c0labLJFF.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0labLJFF.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0labLJFF.LJ("publish_step_name", "restore");
        c0labLJFF.LJ(Scene.SCENE_SERVICE, str);
        c0labLJFF.LIZIZ(j, "duration");
        c0labLJFF.LJFF("is_draft", videoPublishEditModel.creativeModel.draftInfoModel.isDraft);
        String str2 = videoPublishEditModel.creativeModel.postPageModel.captionModel.markupText;
        if (str2 != null) {
            length = str2.length();
        } else {
            length = 0;
        }
        c0labLJFF.LIZ(length, "markup_length");
        c0labLJFF.LIZ(videoPublishEditModel.creativeModel.postPageModel.captionModel.markupExtra.size(), "metadata_length");
        C20684815ws.LJIILLIIL("lexical_perf", c0labLJFF.LIZ);
    }

    public static void LIZIZ(VideoPublishEditModel videoPublishEditModel, String str, long j) {
        int length;
        C1437510nVl c1437510nVlLJJLIIIJ = C0CHQ.LIZ().getPublishService().LJJLIIIJ();
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("creationId: ");
        sbLIZ.append(videoPublishEditModel.getCreationId());
        sbLIZ.append(", snapshot caption cost: ");
        sbLIZ.append(j);
        sbLIZ.append("ms");
        c1437510nVlLJJLIIIJ.LIZ("lexical", C2188811AlT.LIZIZ(sbLIZ));
        C0LAB c0labLJFF = C0EMD.LJFF(videoPublishEditModel);
        c0labLJFF.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0labLJFF.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
        c0labLJFF.LJ("publish_step_name", "snapshot");
        c0labLJFF.LJ(Scene.SCENE_SERVICE, str);
        c0labLJFF.LIZIZ(j, "duration");
        c0labLJFF.LJFF("is_draft", videoPublishEditModel.creativeModel.draftInfoModel.isDraft);
        String str2 = videoPublishEditModel.creativeModel.postPageModel.captionModel.markupText;
        if (str2 != null) {
            length = str2.length();
        } else {
            length = 0;
        }
        c0labLJFF.LIZ(length, "markup_length");
        c0labLJFF.LIZ(videoPublishEditModel.creativeModel.postPageModel.captionModel.markupExtra.size(), "metadata_length");
        C20684815ws.LJIILLIIL("lexical_perf", c0labLJFF.LIZ);
    }
}
