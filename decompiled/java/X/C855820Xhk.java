package X;

import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoPublishEditModel;
import com.ss.android.ugc.aweme.shortvideo.ui.viewmodel.VideoPublishViewModel;

/* JADX INFO: renamed from: X.0Xhk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C855820Xhk extends AbstractC855890Xhr {
    public final VideoPublishEditModel LJIIJ;

    @Override // X.AbstractC855890Xhr
    public final int LIZIZ() {
        return C0FPS.LONG_VIDEO.getScene();
    }

    @Override // X.AbstractC855890Xhr
    public final boolean LJ() {
        return C0C64.LJIILLIIL().LJIIIZ(31744, "enable_long_video_audio_copyright_detection", true, true);
    }

    @Override // X.AbstractC855890Xhr
    public final VideoPublishEditModel LIZJ() {
        return this.LJIIJ;
    }

    public C855820Xhk(VideoPublishEditModel videoPublishEditModel, Scene scene, VideoPublishViewModel videoPublishViewModel) {
        super(videoPublishEditModel, scene, videoPublishViewModel);
        this.LJIIJ = videoPublishEditModel;
    }
}
