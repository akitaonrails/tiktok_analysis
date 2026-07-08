package X;

import android.graphics.Bitmap;
import android.view.Surface;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VERecorder;
import com.ss.android.vesdk.runtime.VEMapBufferInfo;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS581S0100000_2;
import kotlin.jvm.internal.AwS604S0100000_25;

/* JADX INFO: renamed from: X.1DKk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public interface InterfaceC2254081DKk {
    void Ah(Surface surface, String str, Function1<? super Integer, Unit> function1);

    boolean Bh();

    int Ch(C19GS c19gs, InterfaceC1652760t6w interfaceC1652760t6w);

    void Dh(InterfaceC1631630sYr<? super Integer, ? super Integer, ? super String, ? super VERecorder, Unit> interfaceC1631630sYr);

    void E0();

    void E4(boolean z);

    void F0(String str, int i, int i2, boolean z, Bitmap.CompressFormat compressFormat, Function1<? super Integer, Unit> function1, boolean z2);

    void F4(Function1 function1, boolean z);

    void G0(InterfaceC1437720nW6 interfaceC1437720nW6);

    void G4(String str, long j, long j2, boolean z, boolean z2, boolean z3, int i, long j3);

    void H0(int i, int i2);

    void H4(Function1<? super Integer, Unit> function1);

    void I0();

    boolean I4();

    void J0(boolean z);

    boolean K(boolean z);

    void K0(InterfaceC2253851DJn interfaceC2253851DJn);

    void K4(C1DLS c1dls);

    void L0(InterfaceC1631630sYr<? super Integer, ? super Integer, ? super String, ? super VERecorder, Unit> interfaceC1631630sYr);

    void LIZ(int i);

    void LJLJL(int i, int i2, InterfaceC2173471A4j interfaceC2173471A4j);

    void LJLJLLL(Surface surface);

    void LJLL();

    void M0();

    void M2(boolean z);

    void N0(InterfaceC2253851DJn interfaceC2253851DJn);

    boolean N4(String str);

    void O3(int i);

    void O4(C1DLS c1dls);

    void P4(String str, double d, Function1<? super Integer, Unit> function1);

    void Qa(boolean z);

    void R3(int i);

    void R4();

    void Ra(boolean z);

    void S4(Function0 function0, Function1 function1);

    void U3(Cert cert);

    void enableAudio(boolean z);

    void enableEffect(boolean z);

    boolean fh();

    InterfaceC1660820tJw getAudioController();

    int getBackCameraPos();

    C1DHX getCameraController();

    C1286570jaJ getCameraECInfo();

    int getCameraPosition();

    int getCameraPreviewHeight();

    int getCameraPreviewWidth();

    String getCameraTypeString();

    List<Integer> getCameraZoomList();

    int getCurrentCameraType();

    Runnable getDataSourceVideoCompleteListener();

    VEDisplaySettings getDisplayingSettings();

    InterfaceC1645720sva getEffectController();

    long getEndFrameTimeUS();

    boolean getExposureCompensationEnable();

    int getFPS();

    int getFlashMode();

    int getFrontCameraPos();

    boolean getHasSetFocusAreas();

    long getInitRecorderTime();

    VEMapBufferInfo getIntermediatePathFromEffect();

    boolean getIsExposureSeekBarShowing();

    int getLastFlashMode();

    int getLastRecordFrameNum();

    LifecycleOwner getLifecycleOwner();

    float getMaxCameraZoom();

    InterfaceC2254001DKc getMediaController();

    int getNextFlashMode();

    C1DKV getRecordContext();

    long getSegmentAudioLength();

    float[] getSuggestVolume();

    InterfaceC20520115Rf getViewFunction();

    void gh(AwS604S0100000_25 awS604S0100000_25);

    void hh(InterfaceC2186241AhK interfaceC2186241AhK);

    void ih(InterfaceC1652830t73 interfaceC1652830t73);

    void init();

    void jh();

    void kh(InterfaceC2186241AhK interfaceC2186241AhK);

    void lh(InterfaceC1652830t73 interfaceC1652830t73);

    void lk();

    void mh(InterfaceC1437720nW6 interfaceC1437720nW6);

    void mk(InterfaceC1623210sLH interfaceC1623210sLH);

    boolean n();

    int n4(String str, int i, int i2, Function1<? super Integer, Unit> function1);

    void nh(float f, float f2);

    void nk(String[] strArr, double[] dArr, boolean[] zArr);

    InterfaceC2253831DJl oh();

    void pauseEffectAudio(boolean z);

    void ph();

    void qh(C650110Pej c650110Pej);

    void rh(C1DMD c1dmd, String str);

    void sendEffectMsg(int i, long j, long j2, String str);

    void setARCoreParam(boolean z);

    void setAudioCaptureDevice(C1621480sIU c1621480sIU);

    void setAudioDevice(C1621480sIU c1621480sIU);

    void setAudioDevice(boolean z);

    void setBodyBeautyLevel(int i);

    void setCameraPreviewSizeInterface(C1DIF c1dif);

    void setCloseCameraListener(Function0<Unit> function0);

    void setControllerCallback(InterfaceC2240011Clr interfaceC2240011Clr);

    void setDataSourceVideoCompleteListener(Runnable runnable);

    void setDetectInterval(int i);

    void setDeviceRotation(int i);

    void setDuetSupportChangeLayout(boolean z);

    void setExposureCompensation(int i);

    void setExposureCompensationEnable(boolean z);

    void setExposureSeekBarProgress(float f);

    void setFilter(String str);

    void setHandDetectLowpower(boolean z);

    void setLifecycleOwner(LifecycleOwner lifecycleOwner);

    void setMusicPath(String str);

    void setRecordMaxDuration(long j);

    void setRecordMode(EnumC2249691D3n enumC2249691D3n);

    void setRenderCacheString(String str, String str2);

    void setSATZoomListener(InterfaceC1673870tez interfaceC1673870tez);

    void setSensitiveApiCallback(InterfaceC1660900tK4 interfaceC1660900tK4);

    void setUseAudioGraph(boolean z);

    void sh(C1660560tJW c1660560tJW, Function1 function1, InterfaceC2253331DHn interfaceC2253331DHn, Cert cert);

    void t1();

    @InterfaceC1294060jmO
    void th(Cert cert, boolean z);

    int uh(C19EG c19eg, InterfaceC1652760t6w interfaceC1652760t6w);

    void vh(long j, long j2, long j3, int i, String str, boolean z);

    void wh(boolean z);

    void xh(C1621410sIN c1621410sIN);

    void yh(double d, boolean z, float f, int i, int i2, AwS581S0100000_2 awS581S0100000_2);

    void zh(C1DKV c1dkv, C2253301DHk c2253301DHk);
}
