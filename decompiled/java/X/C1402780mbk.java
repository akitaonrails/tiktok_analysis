package X;

import com.bytedance.keva.Keva;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.model.EditPreviewInfo;
import kotlin.jvm.internal.AFwS210S0000000_22;

/* JADX INFO: renamed from: X.0mbk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1402780mbk {
    public static final C1402780mbk LIZ = new C1402780mbk();
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS210S0000000_22.get$arr$(9));

    public static void LIZ(VideoPublishEditModel videoPublishEditModel, String str, Integer num) {
        boolean z;
        C01GW c01gw = LIZIZ;
        if (!((Keva) c01gw.getValue()).getBoolean(videoPublishEditModel.getCreationId(), false)) {
            return;
        }
        ((Keva) c01gw.getValue()).storeBoolean(videoPublishEditModel.getCreationId(), false);
        if (videoPublishEditModel.getTtStoryUploadModel() != null) {
            z = true;
        } else {
            z = false;
        }
        C0LAB c0lab = new C0LAB();
        c0lab.LJ("op_region", C2222691Bz1.LIZ());
        c0lab.LJ("api_path", str);
        c0lab.LJ("creation_id", videoPublishEditModel.getCreationId());
        c0lab.LJ("shoot_way", videoPublishEditModel.mShootWay);
        c0lab.LJ("content_type", C1428470nHB.LJIILL(videoPublishEditModel));
        if (num != null) {
            c0lab.LIZ(num.intValue(), "error_code");
        }
        EditPreviewInfo previewInfo = videoPublishEditModel.getPreviewInfo();
        if (previewInfo != null) {
            c0lab.LJ("source_duration", String.valueOf(previewInfo.getPreviewVideoLength()));
        }
        if (z) {
            c0lab.LIZ(1, "is_story");
        } else {
            c0lab.LIZ(0, "is_story");
        }
        C20684815ws.LJIILLIIL("publish_blocked", c0lab.LIZ);
    }
}
