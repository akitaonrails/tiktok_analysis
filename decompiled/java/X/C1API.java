package X;

import android.graphics.Bitmap;
import android.graphics.Point;
import android.view.Surface;
import android.view.SurfaceControl;
import android.view.SurfaceHolder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1API, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public interface C1API {
    void LIZ(boolean z);

    int LIZJ();

    void LIZLLL();

    int LJ();

    boolean LJFF();

    JSONObject LJI();

    void LJII(SurfaceControl surfaceControl, int i, int i2);

    String LJIIIIZZ();

    String LJIIIZ(int i);

    void LJIIJ(int i);

    Surface LJIIJJI();

    void LJIIL(String str, String str2);

    void LJIILIIL(boolean z);

    void LJIILJJIL(boolean z);

    void LJIILL(boolean z);

    void LJIILLIIL(ArrayList<String> arrayList);

    void LJIIZILJ(boolean z);

    void LJIJJ(String str, String str2, boolean z, C0IMA c0ima);

    List<String> LJIJJLI();

    void LJJ(String str);

    void LJJI(String str);

    void LJJIFFI();

    void LJJII(C1699360uK6 c1699360uK6);

    long LJJIIJ();

    void LJJIIJZLJL(String str, String str2, C0IMA c0ima);

    void LJJIIZ(int i, Surface surface);

    void LJJIIZI(int i);

    boolean LJJIJ();

    void LJJIJIIJI(C0IMA c0ima, boolean z, Long l);

    void LJJIJIIJIL(int i);

    void LJJIJIL(int i, boolean z, boolean z2);

    void LJJIJL();

    void LJJIJLIJ(C0IMA c0ima, boolean z);

    boolean LJJIL(Surface surface);

    void LJJIZ(String str, Map<String, String> map, EnumC1700430uLp enumC1700430uLp);

    void LJJJ(String str);

    void LJJJI(InterfaceC1700420uLo interfaceC1700420uLo, InterfaceC1700400uLm interfaceC1700400uLm);

    void LJJJIL(String str);

    void LJJJJ(String str, String str2, boolean z, C0IMA c0ima);

    void LJJJJI(Surface surface);

    void LJJJJIZL(int i, Surface surface);

    void LJJJJJ(String str);

    void LJJL(SurfaceHolder surfaceHolder);

    long c0();

    void changeLowLatencyMode(boolean z);

    void changeSRSupportScene(boolean z);

    String d0();

    void dynamicOpenTextureRender();

    int getAudioDuckingDurationForLive(int i);

    Bitmap getCurrentFrame();

    String getCurrentResolution();

    C1281010jRL getNetworkState();

    C1699430uKD getPlayerThreadBlockStatus();

    Point getVideoSize();

    boolean isPlaying();

    boolean isWidevineDrmStream();

    void play();

    void release(String str);

    void reset();

    void setRenderRotation(C0IIZ c0iiz);

    void setSeiOpen(boolean z);

    int startAuxAudioDucking(C1300320jwU c1300320jwU, InterfaceC1699390uK9 interfaceC1699390uK9);

    void stop();

    int stopAuxAudioDucking(int i);

    void stopUseTextureRender();

    void switchResolution(String str);

    void switchResolution(String str, InterfaceC1699420uKC interfaceC1699420uKC);

    int writeAuxAudioDuckingPCM(byte[] bArr, int i);
}
