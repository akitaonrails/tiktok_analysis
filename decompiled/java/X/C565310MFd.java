package X;

import android.os.Bundle;
import com.bytedance.scene.navigation.NavigationScene;
import com.ss.android.ugc.aweme.adaptation.BaseScreenAdaptScene;
import com.ss.android.ugc.aweme.image.ui.ImageEditRootScene;
import com.ss.android.ugc.aweme.shortvideo.edit.VideoEditContainerScene;

/* JADX INFO: renamed from: X.0MFd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C565310MFd {
    public static final C565310MFd LIZ = new C565310MFd();

    public static void LIZ(BaseScreenAdaptScene baseScreenAdaptScene, InterfaceC20597015ii interfaceC20597015ii) {
        C569760MWg c569760MWg = new C569760MWg();
        c569760MWg.LIZJ = new C214798194i();
        c569760MWg.LIZ = false;
        NavigationScene navigationScene = interfaceC20597015ii.getNavigationScene();
        if (navigationScene != null) {
            navigationScene.LLLLLLLLLL(baseScreenAdaptScene, c569760MWg.LIZ());
        }
    }

    public static final void LIZIZ(AbstractC214814194y abstractC214814194y, Bundle bundle, boolean z) {
        InterfaceC20597015ii interfaceC20597015iiLJ = C20622515mp.LJ(abstractC214814194y);
        if (interfaceC20597015iiLJ == null) {
            return;
        }
        C0MUK.LIZJ(bundle).creationTypeModel.creationMode = 2;
        bundle.putLong("video_image_switch_start_time", System.currentTimeMillis());
        C1411560mpu.LIZIZ = false;
        ImageEditRootScene imageEditRootScene = new ImageEditRootScene();
        if (z) {
            bundle = C571310Mav.LIZ(bundle);
        }
        imageEditRootScene.mArguments = bundle;
        LIZ(imageEditRootScene, interfaceC20597015iiLJ);
    }

    public static final void LIZJ(AbstractC214814194y abstractC214814194y, Bundle bundle, boolean z) {
        InterfaceC20597015ii interfaceC20597015iiLJ = C20622515mp.LJ(abstractC214814194y);
        if (interfaceC20597015iiLJ == null) {
            return;
        }
        if (z) {
            if (bundle == null) {
                bundle = new Bundle();
            }
            bundle = C571310Mav.LIZ(bundle);
        } else if (bundle == null) {
            bundle = new Bundle();
        }
        C0MUK.LIZJ(bundle).creationTypeModel.creationMode = 1;
        bundle.putLong("video_image_switch_start_time", System.currentTimeMillis());
        C1411560mpu.LIZIZ = false;
        VideoEditContainerScene videoEditContainerScene = new VideoEditContainerScene();
        videoEditContainerScene.mArguments = bundle;
        LIZ(videoEditContainerScene, interfaceC20597015iiLJ);
    }
}
