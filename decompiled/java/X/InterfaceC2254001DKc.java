package X;

import android.graphics.Bitmap;
import android.view.Surface;
import androidx.lifecycle.MutableLiveData;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.vesdk.VEDisplaySettings;
import com.ss.android.vesdk.VESafeAreaParams;
import com.ss.android.vesdk.VESize;
import com.ss.android.vesdk.VEVideoEncodeSettings;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS581S0100000_2;

/* JADX INFO: renamed from: X.1DKc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes36.dex */
public interface InterfaceC2254001DKc {
    int A5();

    void B5();

    int C5(boolean z);

    int D4(VEDisplaySettings vEDisplaySettings);

    void D5(InterfaceC2183551Acz interfaceC2183551Acz);

    void E4(boolean z);

    int E5(boolean z);

    void F0(String str, int i, int i2, boolean z, Bitmap.CompressFormat compressFormat, Function1<? super Integer, Unit> function1, boolean z2);

    void F4(Function1 function1, boolean z);

    MutableLiveData F5();

    void G4(String str, long j, long j2, boolean z, boolean z2, boolean z3, int i, long j3);

    int G5();

    void H4(Function1<? super Integer, Unit> function1);

    float H5(boolean z, boolean z2);

    boolean I4();

    void I5(C1DLJ c1dlj);

    float J4(boolean z);

    float J5();

    void K4(C1DLS c1dls);

    float K5();

    float L4();

    float L5();

    void LIZ();

    void LJLJLLL(Surface surface);

    void LJLL();

    float M4(boolean z);

    void M5(boolean z, String str, Function1 function1);

    boolean N4(String str);

    void N5(InterfaceC2183551Acz interfaceC2183551Acz);

    void O4(C1DLS c1dls);

    void O5(VEVideoEncodeSettings vEVideoEncodeSettings);

    void P4(String str, double d, Function1<? super Integer, Unit> function1);

    float P5();

    void Q4(int i, int i2);

    void Q5(double d, AwS581S0100000_2 awS581S0100000_2);

    void R4();

    void S4(Function0 function0, Function1 function1);

    String T4();

    void U4();

    void V4(C1655800tBq c1655800tBq);

    int W4(boolean z);

    @InterfaceC1294060jmO
    void X4(Cert cert, boolean z);

    int Y4();

    int Z4();

    void a5(Function1<? super VEDisplaySettings.Builder, Unit> function1);

    void b5(Surface surface, Function1 function1);

    int c5();

    float d5();

    int e5();

    void enableAudio(boolean z);

    void f5();

    int g5();

    long getEndFrameTimeUS();

    void getIntermediatePathFromEffect();

    int getLastRecordFrameNum();

    long getSegmentAudioLength();

    float[] getSuggestVolume();

    void h5(Function1<? super C1780100wQK, Unit> function1);

    int i5();

    int j5();

    void k5(VESafeAreaParams[] vESafeAreaParamsArr);

    void l5(float f);

    boolean m5();

    void n4(String str, int i, int i2, Function1 function1);

    void n5();

    String[] o5();

    void p5(List list, int i, C1DLD c1dld);

    int q5();

    int r5();

    VEDisplaySettings s1();

    float s5();

    void setControllerCallback(InterfaceC2240011Clr interfaceC2240011Clr);

    void setRecordMaxDuration(long j);

    void t1();

    void t5(VESize vESize);

    float u5(boolean z);

    int v5();

    void w5();

    void x5(boolean z);

    int y5(boolean z);

    void z5();
}
