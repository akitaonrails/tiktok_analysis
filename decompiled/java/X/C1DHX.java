package X;

import android.os.Bundle;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.vesdk.VECameraSettings;
import com.ss.android.vesdk.VEFocusSettings;
import com.ss.android.vesdk.VESize;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS613S0100000_34;

/* JADX INFO: renamed from: X.1DHX, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public interface C1DHX {
    Bundle A4();

    float B4();

    void C4(C1DL8 c1dl8);

    void D4(int i, InterfaceC2253331DHn interfaceC2253331DHn, Cert cert, float f);

    void E4(Function0<Unit> function0);

    int F4(boolean z, Boolean bool, Cert cert);

    void G4();

    void H4(boolean z);

    void I4(int i, InterfaceC2253331DHn interfaceC2253331DHn, Cert cert);

    void J4(InterfaceC2253251DHf interfaceC2253251DHf);

    boolean K3(float f, float f2);

    void K4(int i);

    void L3(AwS613S0100000_34 awS613S0100000_34);

    void L4(int i);

    void LIZ(int i);

    boolean LIZIZ(float f);

    boolean LIZLLL();

    float LJFF();

    void M2(boolean z);

    int M3();

    void M4(C1DHQ c1dhq, Cert cert, float f);

    VESize N2();

    boolean N3(float f);

    int N4();

    void O2(float f);

    void O3(int i);

    void P3(float[] fArr, double d);

    void Q3();

    void R3(int i);

    long S3();

    void T3();

    int U3(Cert cert);

    int V3(int i, int i2, Integer num, Function0 function0);

    void W3(C1448340nnE c1448340nnE);

    C1DIN X3();

    void Y3(InterfaceC2253351DHp interfaceC2253351DHp);

    void Z3(InterfaceC1780680wRG interfaceC1780680wRG);

    boolean a4();

    void b4(Cert cert);

    void c4(Cert cert, boolean z);

    void d4(boolean z);

    boolean e4();

    boolean f4();

    void g4(C1649180t1A c1649180t1A);

    C1286570jaJ getCameraECInfo();

    int getCameraPosition();

    int getCameraPreviewHeight();

    int getCameraPreviewWidth();

    String getCameraTypeString();

    List<Integer> getCameraZoomList();

    int getCurrentCameraType();

    int getFlashMode();

    boolean getHasSetFocusAreas();

    int getLastFlashMode();

    int getNextFlashMode();

    void h0();

    void h4(C1DIT c1dit);

    boolean i4(VESize vESize);

    boolean isSupportedExposureCompensation();

    void j4();

    void k4(int[] iArr);

    boolean l4();

    void m4(InterfaceC2253331DHn interfaceC2253331DHn);

    void n4(C1AIY c1aiy, Cert cert);

    void o4(InterfaceC2253351DHp interfaceC2253351DHp);

    void p4(InterfaceC1780680wRG interfaceC1780680wRG);

    boolean q4(VEFocusSettings vEFocusSettings);

    int r4(Cert cert);

    C1DIC s4();

    void setBodyBeautyLevel(int i);

    void setCameraPreviewSizeInterface(C1DIF c1dif);

    void setControllerCallback(InterfaceC2240011Clr interfaceC2240011Clr);

    void setExposureCompensation(int i);

    void setRecordMode(EnumC2249691D3n enumC2249691D3n);

    void setSATZoomListener(InterfaceC1673870tez interfaceC1673870tez);

    void setSensitiveApiCallback(InterfaceC1660900tK4 interfaceC1660900tK4);

    void t4(InterfaceC2253331DHn interfaceC2253331DHn);

    void u4(InterfaceC1631620sYq<? super Integer, ? super Integer, ? super String, Unit> interfaceC1631620sYq);

    void v4(InterfaceC2253251DHf interfaceC2253251DHf);

    void w4(boolean z);

    void x4(Function1<? super VECameraSettings.Builder, Unit> function1);

    void y4(C1660560tJW c1660560tJW, Function1 function1);

    boolean z4(int i, float f, float[] fArr, int i2);
}
