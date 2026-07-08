package X;

import android.os.Bundle;
import android.view.Surface;
import android.view.SurfaceHolder;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0odR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public interface InterfaceC1480710odR {
    void LIZ(boolean z);

    <T> T LIZIZ(AbstractC586270Mz3<T> abstractC586270Mz3);

    void LIZJ(String str);

    void LIZLLL(String str, String str2);

    boolean LJ();

    float LJFF(int i);

    void LJI(float f);

    boolean LJII();

    C1472440oQ6 LJIIIIZZ();

    int LJIIIZ();

    float LJIIJ();

    void LJIIJJI();

    OnUIPlayListener LJIIL();

    void LJIILIIL();

    boolean LJIILJJIL();

    void LJIILL(float f);

    void LJIILLIIL(float f, float f2);

    boolean LJIIZILJ();

    boolean LJIJ();

    int LJIJI();

    boolean LJIJJ();

    void LJIJJLI();

    void LJIL();

    boolean LJJ();

    void LJJIIZ();

    void LJJIIZI();

    void LJJIJ(OnUIPlayListener onUIPlayListener);

    void LJJIJIIJI(int i);

    boolean LJJIJIIJIL();

    int LJJIJIL();

    void LJJIJL(InterfaceC1472010oPP interfaceC1472010oPP);

    void LJJIJLIJ(boolean z);

    void LJJIL(Surface surface);

    void LJJIZ(String str);

    void LJJJ();

    void LJJJLZIJ();

    void LJJJZ(int i, JSONObject jSONObject);

    void LJJL(SurfaceHolder surfaceHolder);

    int LJJLI();

    void LJJLIIIIJ(String str);

    void LJJLIIIJ(InterfaceC1471920oPG interfaceC1471920oPG);

    void LJJLIIIJILLIZJL(String str, String str2);

    void LJJLIIIJJI(int i);

    void LJJLIIIJJIZ(String str, boolean z);

    void LJJLIIIJL();

    boolean LJJLIIIJLLLLLLLZ(String str);

    int LJJLIIJ();

    boolean LJJLIL(String str);

    boolean LJJLJ(String str);

    void LJJLJLI();

    void LJJLL(InterfaceC1480060ocO interfaceC1480060ocO);

    void LJJZ(int i, Bundle bundle);

    void LJJZZIII(InterfaceC1284280jWc interfaceC1284280jWc);

    void LJL(Bundle bundle);

    void LJLI(InterfaceC1480320oco interfaceC1480320oco);

    void LJLIIIL(InterfaceC1472880oQo interfaceC1472880oQo);

    void LJLIIL(InterfaceC1480330ocp interfaceC1480330ocp);

    void LJLIL(C1479510obV c1479510obV);

    void LJLILLLLZI(InterfaceC1499700p84 interfaceC1499700p84);

    void LJLJJI(C00UI c00ui);

    void LJLJJL(InterfaceC1472490oQB interfaceC1472490oQB);

    void LJLJJLL(int i, int i2);

    void LJLJL(Bundle bundle, boolean z);

    String LJLJLJ();

    boolean LJLJLLL();

    long getCurrentPosition();

    long getDuration();

    String getKey();

    EnumC1479760obu getPlayerType();

    int getSessionId();

    int getState();

    int getVideoHeight();

    C1471500oOa getVideoInfo();

    int getVideoWidth();

    boolean isLoading();

    boolean isMute();

    boolean isPaused();

    boolean isPlaying();

    void pause();

    void release();

    void reset();

    void resume();

    void setLoop(boolean z);

    void setSurface(Surface surface);

    void start();
}
