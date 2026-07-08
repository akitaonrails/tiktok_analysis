package X;

import android.view.Surface;
import com.ss.android.ugc.aweme.player.sdk.api.OnUIPlayListener;
import com.ss.android.ugc.playerkit.simapicommon.reporter.IMonitor;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0oiD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public interface InterfaceC1483670oiD extends InterfaceC1483520ohy {
    void LIZ(boolean z);

    <T> T LIZIZ(AbstractC586270Mz3<T> abstractC586270Mz3);

    InterfaceC1481730of5 LJIIIZ();

    void LJIIL(OnUIPlayListener onUIPlayListener);

    InterfaceC1483810oiR LJIILIIL();

    C1480660odM LJIJ(String str);

    void LJIJJLI(Surface surface, boolean z);

    void LJIL(IMonitor iMonitor);

    void LJJIJ(OnUIPlayListener onUIPlayListener);

    void LJJIJIIJI(C2218291Brv c2218291Brv);

    void LJJIJIIJIL(OnUIPlayListener onUIPlayListener);

    void LJJIJL(InterfaceC1472010oPP interfaceC1472010oPP);

    void LJJIJLIJ(boolean z);

    void LJJIZ(String str);

    void LJJJ();

    Object LJJJJJ(String str, String str2, Map<String, Object> map);

    void LJJJJJL(C1479530obX c1479530obX);

    void LJJJLZIJ(C1479530obX c1479530obX);

    void LJJJZ(int i, JSONObject jSONObject);

    int LJJLI();

    void LJJLIIIJ(InterfaceC1471920oPG interfaceC1471920oPG);

    void LJJLIIIJILLIZJL(String str, String str2);

    void LJJLIIIJJI(int i);

    void LJJLIIIJJIZ(String str, boolean z);

    void LJJLIIIJLJLI();

    void LJJLJLI(C00UI c00ui);

    void LJJZZI(InterfaceC1472880oQo interfaceC1472880oQo);

    InterfaceC650720Pfi getLegacy();

    InterfaceC1484080ois getPlayState();

    void pause();

    void release();

    void reset();

    void resume();

    void seek(float f);

    void setLoop(boolean z);

    void setSpeed(float f);

    void setSurface(Surface surface);

    void stop();
}
