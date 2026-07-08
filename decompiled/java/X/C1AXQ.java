package X;

import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkLayerRTCMessage;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LinkUser;
import com.bytedance.android.livesdk.comp.api.linkcore.model.LiveStreamMixer;
import com.bytedance.android.livesdk.comp.api.linkcore.model.MicPositionContentInfo;
import com.bytedance.android.livesdk.comp.api.linkcore.model.OnLineMicInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.1AXQ, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public interface C1AXQ {
    Map<String, OnLineMicInfo> LIZ();

    int LIZIZ();

    @InterfaceC1294060jmO
    void LIZJ(String str);

    List<LinkUser> LIZLLL();

    boolean LJ(String str);

    OnLineMicInfo LJFF(String str);

    void LJI();

    int LJII(int i);

    Map<String, OnLineMicInfo> LJIIIIZZ();

    List<LinkUser> LJIIIZ();

    LinkUser LJIIJ(String str);

    long LJIIJJI();

    boolean LJIIL();

    void LJIILIIL();

    void LJIILJJIL(String str, C1276750jKT c1276750jKT);

    List<C1276580jKC> LJIILL();

    int LJIILLIIL(int i);

    void LJIIZILJ(InterfaceC940430aa1 interfaceC940430aa1);

    void LJIJ(Map<Integer, Integer> map);

    OnLineMicInfo LJIJI(String str);

    void LJIJJ(String str, boolean z);

    void LJIJJLI(String str, boolean z);

    void LJIL(InterfaceC940430aa1 interfaceC940430aa1);

    @InterfaceC1294060jmO
    void LJJ(Map<String, String> map);

    int LJJI();

    LinkUser LJJIFFI(String str);

    Map<String, OnLineMicInfo> LJJII();

    void LJJIII(String str, List<? extends C1276580jKC> list);

    String LJJIIJ();

    int LJJIIJZLJL();

    boolean LJJIIZ();

    boolean LJJIJ();

    OnLineMicInfo LJJIJIIJI(String str);

    Map<String, OnLineMicInfo> LJJIJIIJIL();

    void LJJIJIL(String str, float f, boolean z);

    LinkUser LJJIJL(long j);

    OnLineMicInfo LJJIJLIJ(String str);

    int LJJIL();

    LinkUser LJJIZ(String str);

    void LJJJ(int i, int i2, InterfaceC1303110k0z interfaceC1303110k0z, String str);

    boolean LJJJI();

    @InterfaceC1294060jmO
    void LJJJIL();

    @InterfaceC1294060jmO
    LinkUser LJJJJ(long j);

    @InterfaceC1294060jmO
    String LJJJJI();

    Map<String, OnLineMicInfo> LJJJJIZL();

    Pair<Integer, Integer> LJJJJJ();

    void LJJJLZIJ(Map<String, MicPositionContentInfo> map);

    boolean LJJJZ();

    void LJJL(int i, String str, InterfaceC1303160k14 interfaceC1303160k14, String str2);

    void LJJLI(String str, String str2, List<? extends C1276580jKC> list, List<C1276780jKW> list2, List<? extends C1276580jKC> list3, List<C1276780jKW> list4, String str3, JSONObject jSONObject, JSONObject jSONObject2);

    void LJJLIIIIJ(List<C1276780jKW> list);

    boolean LJJLIIIJ(String str);

    @InterfaceC1294060jmO
    void LJJLIIIJILLIZJL();

    void LJJLIIIJJI(LinkLayerRTCMessage linkLayerRTCMessage);

    void LJJLIIIJJIZ(List<LinkUser> list, List<LinkUser> list2);

    @InterfaceC1294060jmO
    void LJJLIIIJL();

    InterfaceC1268870j7l LJJLIIIJLJLI();

    boolean LJJLIIIJLLLLLLLZ();

    void LJJLIIJ(Object obj);

    LiveStreamMixer LJJLIL(C968920bJy c968920bJy);

    boolean LJJLJ();

    void LJJLJLI(List<C1276780jKW> list);

    InterfaceC1268870j7l LJJLL(String str);

    void LJJZ(List<LinkUser> list, List<LinkUser> list2);

    void LJJZZI();

    void LJJZZIII(List list, C1AXU c1axu);

    void LJL(C969030bK9 c969030bK9);

    void LJLI(InterfaceC1280020jPk interfaceC1280020jPk);

    String getChannelId();

    DataChannel getDataChannel();

    String getGroupChannelId();

    C00IA z9();
}
