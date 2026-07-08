package X;

import com.bytedance.pumbaa.utility.method_id.MethodIDManager;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.VideoPublishContainerScene;
import kotlin.jvm.internal.AFwS266S0000000_25;
import kotlin.jvm.internal.AwS241S0300000_32;

/* JADX INFO: renamed from: X.18a9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes33.dex */
public final class C21308318a9 {
    public static final void LIZ(VideoPublishContainerScene videoPublishContainerScene) {
        boolean zLJI = MethodIDManager.LJI(71738);
        VideoPublishEditModel videoPublishEditModel = videoPublishContainerScene.LLLLIILL;
        if (videoPublishEditModel == null) {
            C193S.LIZ("VideoPublishContainerScene.onActivityCreated: mModel is null");
            if (zLJI) {
                MethodIDManager.LJ();
                return;
            }
            return;
        }
        C1654320t9S.LIZIZ(videoPublishContainerScene, AFwS266S0000000_25.get$arr$(155));
        C1664590tQ1.LIZLLL(videoPublishContainerScene, "VideoPublishContainerScene", false, new AwS241S0300000_32(videoPublishEditModel, videoPublishContainerScene, videoPublishContainerScene, 1), 2);
        C1664600tQ2.LIZ(videoPublishContainerScene, "VideoPublishContainerScene", new AwS241S0300000_32(videoPublishEditModel, videoPublishContainerScene, videoPublishContainerScene, 2));
        if (zLJI) {
            MethodIDManager.LJ();
        }
    }
}
