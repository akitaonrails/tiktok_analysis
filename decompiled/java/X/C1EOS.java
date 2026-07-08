package X;

import android.graphics.Bitmap;
import android.view.Surface;
import android.view.SurfaceControl;
import java.util.List;
import java.util.concurrent.ExecutorService;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1EOS, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public interface C1EOS {
    void LIZ(boolean z);

    EnumC1279670jPB LIZJ();

    boolean LJFF();

    void LJII(SurfaceControl surfaceControl, int i, int i2);

    void LJIIIIZZ();

    String LJIIIZ(int i);

    Surface LJIIJJI();

    void LJIIL(String str, String str2);

    void LJIILIIL(boolean z);

    void LJIILL();

    void LJIILLIIL(float f, float f2);

    JSONObject LJIIZILJ();

    void LJIJ(int i);

    List<String> LJIJJ();

    long LJIJJLI();

    Bitmap LJIL();

    void LJJ();

    int LJJI();

    boolean LJJIFFI();

    void LJJII(InterfaceC1279680jPC interfaceC1279680jPC);

    void LJJIIJ();

    void LJJIIJZLJL(int i);

    int LJJIIZ(C1698900uJM c1698900uJM, C1699380uK8 c1699380uK8);

    void LJJIIZI(C1698870uJJ c1698870uJJ);

    void LJJIJIIJI(String str);

    void LJJIJIIJIL(long j, Surface surface, boolean z);

    void LJJIJL(EnumC1490990ou1 enumC1490990ou1);

    void LJJIL(boolean z, boolean z2);

    void LJJIZ(C1699080uJe c1699080uJe);

    void LJJJ(InterfaceC1279750jPJ interfaceC1279750jPJ);

    void LJJJI(boolean z);

    void LJJJJI();

    C1279660jPA LJJJJIZL();

    int LJJJJL(int i);

    void LJJJJZ(C1698870uJJ c1698870uJJ);

    void LJJJJZI(boolean z);

    void LJJJLZIJ(long j, InterfaceC1279730jPH interfaceC1279730jPH, ExecutorService executorService, boolean z);

    long getBitrate();

    String getCurrentResolution();

    JSONObject getFirstFrameBlockInfo();

    int getHeight();

    C1281010jRL getNetworkState();

    int getWidth();

    void mute();

    void pause();

    void release();

    void reset();

    void setSurface(Surface surface);

    void stop();

    int stopAuxAudioDucking(int i);

    void switchResolution(String str);

    int writeAuxAudioDuckingPCM(byte[] bArr, int i);
}
