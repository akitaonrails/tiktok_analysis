package X;

import android.os.Bundle;
import android.os.Handler;
import com.bytedance.bpea.basics.Cert;
import com.ss.android.ttvecamera.TECameraFrame;
import com.ss.android.ttvecamera.TEFrameRateRange;
import com.ss.android.ttvecamera.TEFrameSizei;
import com.ss.android.ttvecamera.cameraalgorithm.TECameraAlgorithmParam;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1DJK, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public interface C1DJK {
    float J4(boolean z);

    float L4();

    void LIZ(int i);

    C1DJ6 LIZIZ();

    int LIZJ();

    boolean LIZLLL();

    int[] LJ();

    float LJFF();

    int LJI(Cert cert);

    int[] LJII();

    void LJIIIIZZ();

    int LJIIIZ();

    void LJIIJ(EnumC2244671CtN enumC2244671CtN);

    Bundle LJIIJJI(String str);

    void LJIIL();

    int LJIILIIL();

    void LJIILJJIL(float f, InterfaceC2254701DMu interfaceC2254701DMu);

    void LJIILL(C1DJG c1djg);

    void LJIILLIIL();

    int LJIIZILJ();

    void LJIJ(TECameraAlgorithmParam tECameraAlgorithmParam);

    void LJIJI(int i);

    int LJIJJ();

    TEFrameSizei LJIJJLI(float f, TEFrameSizei tEFrameSizei);

    int LJIL(int i);

    void LJJ(Bundle bundle);

    void LJJI(InterfaceC2254701DMu interfaceC2254701DMu, boolean z);

    void LJJIFFI(String str);

    void LJJII(int i, int i2);

    int LJJIII();

    void LJJIIJ(boolean z);

    void LJJIIJZLJL(float f);

    TECameraFrame LJJIIZ(TECameraFrame tECameraFrame);

    void LJJIIZI(int i);

    JSONObject LJJIJ();

    void LJJIJIIJI(C1305780k5I c1305780k5I);

    void LJJIJIIJIL(float f);

    float LJJIJIL();

    int LJJIJL();

    C1DNM LJJIJLIJ();

    void LJJIL();

    boolean LJJIZ(long j);

    int LJJJ();

    boolean LJJJI();

    void LJJJIL();

    int LJJJJ();

    List<TEFrameSizei> LJJJJI();

    boolean LJJJJIZL(EnumC2244671CtN enumC2244671CtN);

    int LJJJJJ();

    float[] LJJJJJL();

    void LJJJJL(int i);

    void LJJJJLI();

    void LJJJJLL(int i);

    float[] LJJJJZ();

    void LJJJJZI(boolean z);

    void LJJJLIIL();

    Cert LJJJLL(EnumC1270990jBB enumC1270990jBB);

    void LJJJLZIJ();

    int[] LJJJZ();

    void LJJL(int i);

    void LJJLI();

    void LJJLIIIIJ();

    void LJJLIIIJ(boolean z);

    void LJJLIIIJILLIZJL();

    void LJJLIIIJJI(Cert cert);

    boolean LJJLIIIJJIZ();

    void LJJLIIIJL(int i, int i2);

    void LJJLIIIJLJLI();

    void LJJLIIIJLLLLLLLZ();

    List<TEFrameSizei> LJJLIIJ();

    void LJJLIL(boolean z);

    void LJJLJ();

    boolean LJJLJLI();

    void LJJLL(TEFrameRateRange tEFrameRateRange);

    void LJJZ();

    void LJJZZI(C20188413z0 c20188413z0);

    void LJJZZIII();

    int LJL();

    void LJLI(C1DNM c1dnm);

    boolean LJLIIIL();

    long[] LJLIIL();

    void LJLIL(int i);

    void LJLILLLLZI(InterfaceC1287190jbJ interfaceC1287190jbJ);

    void LJLJI(float f, InterfaceC2254701DMu interfaceC2254701DMu);

    int[] LJLJJI();

    void LJLJJL(long j);

    void LJLJJLL();

    void LJLJL(TECameraAlgorithmParam tECameraAlgorithmParam);

    long LJLJLJ(boolean z);

    void LJLJLLL(boolean z);

    float LJLL(boolean z);

    int LJLLI(C1DJ6 c1dj6, Cert cert);

    void LJLLILLLL(InterfaceC2186151AhB interfaceC2186151AhB);

    void LJLLJ(InterfaceC2254701DMu interfaceC2254701DMu);

    void LJLLL();

    void LJLLLL(C1DJY c1djy);

    void LJLLLLLL(boolean z);

    float M4(boolean z);

    void destroy();

    C1286570jaJ getCameraECInfo();

    int getFlashMode();

    Handler getHandler();

    boolean isSupportedExposureCompensation();

    void setDeviceRotation(int i);

    boolean setExposureCompensation(int i);

    void stopCapture();
}
