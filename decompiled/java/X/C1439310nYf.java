package X;

import com.ss.android.ugc.aweme.creative.model.edit.EditModel;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0nYf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final /* synthetic */ class C1439310nYf extends C2217421BqW implements Function0<Boolean> {
    public C1439310nYf(VideoEditContainerScene videoEditContainerScene) {
        super(0, videoEditContainerScene, VideoEditContainerScene.class, "isSupportMemoryOpt", "isSupportMemoryOpt()Z", 0);
    }

    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        VideoEditContainerScene videoEditContainerScene = (VideoEditContainerScene) this.receiver;
        videoEditContainerScene.getClass();
        boolean z = true;
        boolean z2 = !C1439280nYc.LIZ();
        EditModel editModel = videoEditContainerScene.LLJZIJLIL.creativeModel.editModel;
        boolean z3 = editModel.hasClickNext;
        editModel.hasClickNext = false;
        if (!editModel.hasJumpToPublish || (!z2 && !z3)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
