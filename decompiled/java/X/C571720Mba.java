package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.creative.model.CreativeInfo;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0Mba, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C571720Mba {
    public static final void LIZ(VideoPublishEditModel videoPublishEditModel, String str) {
        if (!videoPublishEditModel.getCreativeInfo().isValid()) {
            C0CHQ.LIZ().getPublishService().LJJIIZI();
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("creationId can't be null or empty, scene: ");
            sbLIZ.append(str);
            sbLIZ.append(", model: ");
            sbLIZ.append(C1416310mxZ.LJIIJ(videoPublishEditModel));
            C1431730nMR.LIZJ(C2188811AlT.LIZIZ(sbLIZ));
            videoPublishEditModel.setCreativeInfo(new CreativeInfo(null, 0, null, 7, null));
            C0LAB c0lab = new C0LAB();
            c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
            c0lab.LJ("content_source", C1428470nHB.LJIILIIL(videoPublishEditModel));
            c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
            c0lab.LJ(Scene.SCENE_SERVICE, str);
            C20684815ws.LJIILLIIL("check_creation_id", c0lab.LIZ);
        }
    }
}
