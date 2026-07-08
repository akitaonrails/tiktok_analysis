package X;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ScaleGestureDetector;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LiveData;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ugc.aweme.framework.services.IStickerService;
import com.ss.android.ugc.aweme.property.AVSettingsWrapper;
import com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel;
import com.ss.android.ugc.aweme.shortvideo.ShortVideoContextViewModel;
import com.ss.android.ugc.aweme.shortvideo.ui.TikTokCameraBaseGroupScene;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import pyl.q;

/* JADX INFO: renamed from: X.0t2l, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public abstract class AbstractC1650170t2l extends C19A3 implements IRecordingOperationPanel {
    public ShortVideoContextViewModel LLJILLL;
    public Runnable LLJJ;

    public abstract C1DRG LLLLIIIILLL();

    public abstract C1DRG getDiContainer();

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public LifecycleOwner getLifecycleOwner() {
        return this;
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final int getSurfaceSizeLayoutId() {
        return R.id.mg3;
    }

    @Override // X.C19A3
    public final void LLLILZLLLI() {
        Runnable runnable = this.LLJJ;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final ShortVideoContextViewModel LLLLIILL() {
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
        ((InterfaceC1648570t0B) LLLLIIIILLL().LJII(InterfaceC1648570t0B.class, null)).cV0(false);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final FragmentManager fragmentManager() {
        return C20622515mp.LJIILL((C19EG) this.mActivity, this);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final long getAvgExpTime() {
        return ((InterfaceC1650190t2n) LLLLIIIILLL().LJII(InterfaceC1650230t2r.class, null)).u92().getCameraController().s4().S3();
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final int getCameraInfo() {
        C1286570jaJ cameraECInfo = ((InterfaceC1650190t2n) LLLLIIIILLL().LJII(InterfaceC1650230t2r.class, null)).u92().getCameraController().getCameraECInfo();
        if (cameraECInfo == null) {
            return 0;
        }
        return Math.abs(cameraECInfo.LIZJ) + Math.abs(cameraECInfo.LIZ);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final int getCameraPos() {
        return ((InterfaceC1650190t2n) LLLLIIIILLL().LJII(InterfaceC1650230t2r.class, null)).LJLJJLL();
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final String getEnterFrom() {
        return (LLLLIILL() == null || LLLLIILL().LL == null) ? "" : LLLLIILL().LL.enterFrom;
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final String getLiveSourceParams() {
        return (LLLLIILL() == null || LLLLIILL().LL == null) ? "" : LLLLIILL().LL.liveSourceParams;
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final View getPreviewView() {
        return ((InterfaceC1650190t2n) LLLLIIIILLL().LJII(InterfaceC1650230t2r.class, null)).getPreviewView();
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final int[] getVideoSize() {
        int[] recordVideoSize = AVSettingsWrapper.getRecordVideoSize();
        return recordVideoSize == null ? new int[]{0, 0} : recordVideoSize;
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final LiveData<Float> getZoomEvent() {
        return ((InterfaceC1650190t2n) LLLLIIIILLL().LJII(InterfaceC1650230t2r.class, null)).Tz1();
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void hideBottomTab() {
        ((InterfaceC1650190t2n) LLLLIIIILLL().LJII(InterfaceC1650230t2r.class, null)).Zl0(new C1663770tOh(false, false, true));
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final Boolean isCameraOpen() {
        return Boolean.valueOf(((InterfaceC1650190t2n) LLLLIIIILLL().LJII(InterfaceC1650230t2r.class, null)).u92().getCameraController().M3() == 3);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final boolean isSupportedExposureCompensation() {
        return ((InterfaceC1650190t2n) LLLLIIIILLL().LJII(InterfaceC1650230t2r.class, null)).u92().getCameraController().isSupportedExposureCompensation();
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void showBottomTab() {
        ((InterfaceC1650190t2n) LLLLIIIILLL().LJII(InterfaceC1650230t2r.class, null)).Zl0(new C1663770tOh(true, false, true));
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final InterfaceC2177841ALe videoRecorder() {
        C128Y c128yLIZ = C372650EjH.LIZ(this);
        if (c128yLIZ instanceof InterfaceC1650180t2m) {
            return ((InterfaceC1650180t2m) c128yLIZ).LLIZLLLIL();
        }
        return null;
    }

    public static boolean LLLLIL(String str) {
        if (!"xssticker".equals(str) && !"xsbeauty".equals(str) && !"livestreaming".equals(str) && !"beauty".equals(str)) {
            return false;
        }
        return true;
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void closeCamera(Cert cert) {
        ((InterfaceC1650230t2r) LLLLIIIILLL().LJII(InterfaceC1650230t2r.class, null)).aJ0(true, cert);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void detectDirtyLens(Function2<Float, Integer, Unit> function2) {
        ((InterfaceC1650190t2n) LLLLIIIILLL().LJII(InterfaceC1650230t2r.class, null)).detectDirtyLens(function2);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void onHidePanel(String str) {
        if (LLLLIL(str)) {
            ((InterfaceC1650190t2n) LLLLIIIILLL().LJII(InterfaceC1650230t2r.class, null)).Zl0(new C1663770tOh(true, false, true));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void onShowPanel(String str) {
        if (LLLLIL(str)) {
            ((InterfaceC1650190t2n) LLLLIIIILLL().LJII(InterfaceC1650230t2r.class, null)).Zl0(new C1663770tOh(false, false, true));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void openCamera(Cert cert) {
        ((InterfaceC1650230t2r) LLLLIIIILLL().LJII(InterfaceC1650230t2r.class, null)).openCamera(cert);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final Boolean scaleCamera(ScaleGestureDetector scaleGestureDetector) {
        return Boolean.valueOf(((InterfaceC1650190t2n) LLLLIIIILLL().LJII(InterfaceC1650230t2r.class, null)).scaleCamera(scaleGestureDetector));
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void setExposureCompensation(int i) {
        ((InterfaceC1650190t2n) LLLLIIIILLL().LJII(InterfaceC1650230t2r.class, null)).u92().getCameraController().setExposureCompensation(i);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void onGameStickerChosen(IStickerService.FaceSticker faceSticker, String str) {
        if (this.mActivity != null) {
            ((InterfaceC1648510t05) getDiContainer().LJII(InterfaceC1648510t05.class, null)).IQ0(new C1637100shg());
        }
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void onStickerCancel(IStickerService.FaceSticker faceSticker, String str) {
        if (this.mActivity != null) {
            ((InterfaceC1648510t05) getDiContainer().LJII(InterfaceC1648510t05.class, null)).IQ0(new C1637100shg());
        }
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void onStickerChosen(IStickerService.FaceSticker faceSticker, String str) {
        boolean z;
        boolean z2;
        if (this.mActivity != null && "livestreaming".equals(str)) {
            InterfaceC1648510t05 interfaceC1648510t05 = (InterfaceC1648510t05) getDiContainer().LJII(InterfaceC1648510t05.class, null);
            if (!C580130Mp9.LIZ(faceSticker.tags) && faceSticker.tags.contains("transfer_touch")) {
                interfaceC1648510t05.IQ0(new C1697860uHg(this.mActivity, videoRecorder()));
                return;
            }
            List<String> list = faceSticker.types;
            if (list != null && list.contains("AR")) {
                z = true;
            } else {
                z = false;
            }
            List<String> list2 = faceSticker.requirements;
            if (list2 != null && list2.contains("AR")) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z && !z2) {
                if (!C580130Mp9.LIZ(faceSticker.types) && faceSticker.types.contains("TouchGes")) {
                    AbstractC214814194y abstractC214814194yLIZ = C372650EjH.LIZ(this);
                    if (!(abstractC214814194yLIZ instanceof TikTokCameraBaseGroupScene)) {
                        return;
                    }
                    interfaceC1648510t05.IQ0(new C1697880uHi(videoRecorder(), new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) ((TikTokCameraBaseGroupScene) abstractC214814194yLIZ).LLLLLLLLL().fF2().getLayoutParams())));
                    return;
                }
                interfaceC1648510t05.IQ0(new C1637100shg());
                return;
            }
            AbstractC214814194y abstractC214814194yLIZ2 = C372650EjH.LIZ(this);
            if (!(abstractC214814194yLIZ2 instanceof TikTokCameraBaseGroupScene)) {
                return;
            }
            interfaceC1648510t05.IQ0(new C1697880uHi(videoRecorder(), new ViewGroup.MarginLayoutParams((ViewGroup.MarginLayoutParams) ((TikTokCameraBaseGroupScene) abstractC214814194yLIZ2).LLLLLLLLL().fF2().getLayoutParams())));
        }
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void openCamera(Cert cert, boolean z) {
        ((InterfaceC1650230t2r) LLLLIIIILLL().LJII(InterfaceC1650230t2r.class, null)).openCamera(cert, z);
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
        ((InterfaceC1650190t2n) LLLLIIIILLL().LJII(InterfaceC1650230t2r.class, null)).cd0(qVarLIZIZ, cert, null);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void setFilter(String str, float f) {
        ((InterfaceC1650190t2n) LLLLIIIILLL().LJII(InterfaceC1650230t2r.class, null)).setFilter(str, f);
    }

    @Override // com.ss.android.ugc.aweme.services.recording.IRecordingOperationPanel
    public final void cameraFocus(int i, int i2, float[] fArr) {
        ((InterfaceC1650190t2n) LLLLIIIILLL().LJII(InterfaceC1650230t2r.class, null)).u92().getCameraController().z4(i, 0.15f, fArr, i2);
    }

    @Override // X.C19A3, com.bytedance.scene.Scene
    public /* bridge */ /* synthetic */ View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return onCreateView(layoutInflater, viewGroup, bundle);
    }
}
