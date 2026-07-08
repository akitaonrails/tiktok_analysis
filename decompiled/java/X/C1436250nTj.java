package X;

import android.os.Bundle;
import com.ss.android.ugc.aweme.services.publish.Publish;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;

/* JADX INFO: renamed from: X.0nTj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class C1436250nTj {
    public static final C1436250nTj LIZ = new C1436250nTj();

    public static final Bundle LIZIZ(VideoPublishEditModel videoPublishEditModel) {
        int i;
        Bundle bundle = new Bundle();
        if (C1428470nHB.LJJZZI(videoPublishEditModel)) {
            i = 11;
        } else {
            i = 0;
        }
        bundle.putInt("video_type", i);
        C786410Ut5.LJJIZ(bundle, "extra_video_publish_args", videoPublishEditModel);
        C786410Ut5.LJJJI("shoot_way", videoPublishEditModel.mShootWay, bundle);
        C786410Ut5.LJJJI("creation_id", videoPublishEditModel.getCreationId(), bundle);
        bundle.putInt("publish_private_state", videoPublishEditModel.isPrivate());
        bundle.putInt("publish_permission", videoPublishEditModel.isPrivate);
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("VideoPublishService.createBundleParams()  bundle=");
        sbLIZ.append(bundle);
        C2344809Gs.LJ(C2188811AlT.LIZIZ(sbLIZ));
        Publish.PublishBundle = bundle;
        return bundle;
    }

    /* JADX WARN: Removed duplicated region for block: B:46:0x014f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final android.os.Bundle LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel r7, boolean r8) {
        /*
            Method dump skipped, instruction units count: 386
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1436250nTj.LIZ(com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel, boolean):android.os.Bundle");
    }
}
