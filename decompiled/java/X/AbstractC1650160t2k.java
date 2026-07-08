package X;

import Y.ARunnableS125S0100000_25;
import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.aweme.framework.services.IStickerService;
import com.ss.android.ugc.aweme.ftc.FTCVideoRecordNewActivity;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import pyl.q;

/* JADX INFO: renamed from: X.0t2k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1650160t2k extends C19A3 implements IRecordingOperationPanel {
    public ShortVideoContextViewModel LLJILLL;
    public ARunnableS125S0100000_25 LLJJ;

    public abstract C1DRG getDiContainer();

    public LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final int getSurfaceSizeLayoutId() {
        return R.id.mg3;
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void hideBottomTab() {
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void onHidePanel(String str) {
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void onShowPanel(String str) {
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void showBottomTab() {
    }

    @Override // X.C19A3
    public final void LLLILZLLLI() {
        ARunnableS125S0100000_25 aRunnableS125S0100000_25 = this.LLJJ;
        if (aRunnableS125S0100000_25 != null) {
            aRunnableS125S0100000_25.run();
        }
    }

    public final ShortVideoContextViewModel LLLLIIIILLL() {
        if (this.LLJILLL == null) {
            this.LLJILLL = (ShortVideoContextViewModel) C1659630tI1.LJFF(this).get(ShortVideoContextViewModel.class);
        }
        return this.LLJILLL;
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final C1322110kVd backgroundView() {
        View view = this.mView;
        if (view != null) {
            return (C1322110kVd) view.findViewById(R.id.szu);
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void closeRecording() {
        if (this.mActivity == null) {
            return;
        }
        ((FTCVideoRecordNewActivity) requireActivity()).LLJZIJLIL.cV0(false);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final FragmentManager fragmentManager() {
        return ((C19EG) this.mActivity).getSupportFragmentManager();
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final int getCameraPos() {
        TikTokCameraBaseGroupScene tikTokCameraBaseGroupSceneLIZ = C577960Mle.LIZ(this.mActivity);
        if (tikTokCameraBaseGroupSceneLIZ == null || tikTokCameraBaseGroupSceneLIZ.LLLLLLLLL() == null) {
            return 0;
        }
        return tikTokCameraBaseGroupSceneLIZ.LLLLLLLLL().LJLJJLL();
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final InterfaceC2177841ALe videoRecorder() {
        ComponentCallbacks2 componentCallbacks2 = this.mActivity;
        if (componentCallbacks2 instanceof InterfaceC1650180t2m) {
            return ((InterfaceC1650180t2m) componentCallbacks2).LLIZLLLIL();
        }
        return null;
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final long getAvgExpTime() {
        return ((FTCVideoRecordNewActivity) requireActivity()).LLJZ.u92().getCameraController().S3();
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final int getCameraInfo() {
        C1286570jaJ cameraECInfo = ((FTCVideoRecordNewActivity) requireActivity()).LLJZ.u92().getCameraController().getCameraECInfo();
        return Math.abs(cameraECInfo.LIZJ) + Math.abs(cameraECInfo.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final String getEnterFrom() {
        return (LLLLIIIILLL() == null || LLLLIIIILLL().LL == null) ? "" : LLLLIIIILLL().LL.enterFrom;
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final String getLiveSourceParams() {
        return (LLLLIIIILLL() == null || LLLLIIIILLL().LL == null) ? "" : LLLLIIIILLL().LL.liveSourceParams;
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final View getPreviewView() {
        return ((FTCVideoRecordNewActivity) requireActivity()).LLJJIII;
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final int[] getVideoSize() {
        int[] recordVideoSize = AVSettingsWrapper.getRecordVideoSize();
        return recordVideoSize == null ? new int[]{0, 0} : recordVideoSize;
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final Boolean isCameraOpen() {
        return Boolean.valueOf(((FTCVideoRecordNewActivity) requireActivity()).LLJZ.u92().getCameraController().M3() == 3);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final boolean isSupportedExposureCompensation() {
        return ((FTCVideoRecordNewActivity) requireActivity()).LLJZ.u92().getCameraController().isSupportedExposureCompensation();
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void closeCamera(Cert cert) {
        ((FTCVideoRecordNewActivity) requireActivity()).LLJZ.aJ0(true, cert);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void detectDirtyLens(Function2<Float, Integer, Unit> function2) {
        ((FTCVideoRecordNewActivity) requireActivity()).LLJZ.detectDirtyLens(function2);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void openCamera(Cert cert) {
        ((FTCVideoRecordNewActivity) requireActivity()).LLJZ.openCamera(cert);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final Boolean scaleCamera(ScaleGestureDetector scaleGestureDetector) {
        return Boolean.valueOf(((FTCVideoRecordNewActivity) requireActivity()).LLJZ.scaleCamera(scaleGestureDetector));
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void setExposureCompensation(int i) {
        ((FTCVideoRecordNewActivity) requireActivity()).LLJZ.u92().getCameraController().setExposureCompensation(i);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void onGameStickerChosen(IStickerService.FaceSticker faceSticker, String str) {
        Activity activity = this.mActivity;
        if (activity != null && (activity instanceof FTCVideoRecordNewActivity)) {
            ((InterfaceC1648510t05) getDiContainer().LJII(InterfaceC1648510t05.class, null)).IQ0(new C1637100shg());
        }
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void onStickerCancel(IStickerService.FaceSticker faceSticker, String str) {
        Activity activity = this.mActivity;
        if (activity != null && (activity instanceof FTCVideoRecordNewActivity)) {
            ((InterfaceC1648510t05) getDiContainer().LJII(InterfaceC1648510t05.class, null)).IQ0(new C1637100shg());
        }
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void onStickerChosen(IStickerService.FaceSticker faceSticker, String str) {
        Activity activity = this.mActivity;
        if (activity != null && (activity instanceof FTCVideoRecordNewActivity) && "livestreaming".equals(str)) {
            InterfaceC1648510t05 interfaceC1648510t05 = (InterfaceC1648510t05) getDiContainer().LJII(InterfaceC1648510t05.class, null);
            if (!C580130Mp9.LIZ(faceSticker.tags) && faceSticker.tags.contains("transfer_touch")) {
                interfaceC1648510t05.IQ0(new C1697860uHg(this.mActivity, videoRecorder()));
                return;
            }
            if (!C580130Mp9.LIZ(faceSticker.types) && faceSticker.types.contains("AR")) {
                interfaceC1648510t05.IQ0(new C1697880uHi(videoRecorder(), new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) ((FTCVideoRecordNewActivity) this.mActivity).LLJZ.fF2().getLayoutParams())));
            } else if (!C580130Mp9.LIZ(faceSticker.types) && faceSticker.types.contains("TouchGes")) {
                interfaceC1648510t05.IQ0(new C1697880uHi(videoRecorder(), new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) ((FTCVideoRecordNewActivity) this.mActivity).LLJZ.fF2().getLayoutParams())));
            } else {
                interfaceC1648510t05.IQ0(new C1637100shg());
            }
        }
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void openCamera(Cert cert, boolean z) {
        ((FTCVideoRecordNewActivity) requireActivity()).LLJZ.openCamera(cert, z);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void setCameraPos(int i, Cert cert) {
        q qVarLIZIZ;
        if (this.mActivity == null) {
            return;
        }
        if (i == 1) {
            qVarLIZIZ = q.LIZ();
        } else {
            qVarLIZIZ = q.LIZIZ();
        }
        ((FTCVideoRecordNewActivity) requireActivity()).LLJZ.cd0(qVarLIZIZ, cert, null);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void setFilter(String str, float f) {
        ((FTCVideoRecordNewActivity) requireActivity()).LLJZ.setFilter(str, f);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void cameraFocus(int i, int i2, float[] fArr) {
        ((FTCVideoRecordNewActivity) requireActivity()).LLJZ.u92().getCameraController().z4(i, 0.15f, fArr, i2);
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
