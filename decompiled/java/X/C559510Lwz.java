package X;

import com.bytedance.keva.Keva;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.draft.model.AwemeDraft;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0Lwz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C559510Lwz {
    public static final void LIZIZ(VideoPublishEditModel videoPublishEditModel, C0LAB c0lab) {
        Keva keva = C542480LPi.LIZ;
        String creationId = videoPublishEditModel.getCreationId();
        Keva keva2 = C542480LPi.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(creationId);
        sbLIZ.append(C542480LPi.LIZIZ);
        c0lab.LIZ(keva2.getInt(C2188811AlT.LIZIZ(sbLIZ), 0), "retry_count");
        String creationId2 = videoPublishEditModel.getCreationId();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(creationId2);
        sbLIZ2.append(C542480LPi.LIZJ);
        c0lab.LIZ(keva2.getInt(C2188811AlT.LIZIZ(sbLIZ2), 0), "has_publish_failed");
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(videoPublishEditModel.getCreationId());
        sbLIZ3.append(videoPublishEditModel.getCreativeInfo().getVersion());
        c0lab.LJ("preceive_id", C2188811AlT.LIZIZ(sbLIZ3));
        c0lab.LIZ(videoPublishEditModel.creativeModel.transientPostPageModel.LJJJJLI ? 1 : 0, "auto_retry");
    }

    public static final void LIZ(C0LAB c0lab, AwemeDraft awemeDraft, String str) {
        c0lab.LJ(Scene.SCENE_SERVICE, str);
        Keva keva = C542480LPi.LIZ;
        String strLIZ = awemeDraft.LIZ();
        Keva keva2 = C542480LPi.LIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(strLIZ);
        sbLIZ.append(C542480LPi.LIZIZ);
        c0lab.LIZ(keva2.getInt(C2188811AlT.LIZIZ(sbLIZ), 0), "retry_count");
        c0lab.LIZ(awemeDraft.LJIILL() ? 1 : 0, "is_story");
        String strLIZ2 = awemeDraft.LIZ();
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append(strLIZ2);
        sbLIZ2.append(C542480LPi.LIZJ);
        c0lab.LIZ(keva2.getInt(C2188811AlT.LIZIZ(sbLIZ2), 0), "has_publish_failed");
        StringBuilder sbLIZ3 = C2188811AlT.LIZ();
        sbLIZ3.append(awemeDraft.LIZ());
        sbLIZ3.append(awemeDraft.LIZIZ().getVersion());
        c0lab.LJ("preceive_id", C2188811AlT.LIZIZ(sbLIZ3));
    }
}
