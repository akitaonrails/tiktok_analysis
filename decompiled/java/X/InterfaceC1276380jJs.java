package X;

import android.view.SurfaceView;
import android.view.View;
import com.bytedance.bpea.basics.Cert;
import com.ss.bytertc.engine.RTCVideoInterface;
import com.ss.bytertc.engine.type.LinkMicType;
import com.ss.lyrax.transcoder.LyraxTranscoderFeature;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0jJs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public interface InterfaceC1276380jJs {
    void LIZ();

    void LIZIZ();

    int LJFF(String str);

    void LJI();

    void LJIIIIZZ(List<LyraxTranscoderFeature> list);

    void LJIIIZ(C969430bKn c969430bKn);

    void LJIIL(int i);

    void LJIILIIL();

    int LJIILJJIL(String str, C1276750jKT c1276750jKT);

    List<C1276580jKC> LJIILL();

    int LJIILLIIL(String str);

    void LJIIZILJ(String str);

    int LJIJJ(String str, C01IM c01im);

    void LJJIII(String str, List list);

    C1275750jIr LJJIJ(C01IN c01in);

    void LJJIJIIJI(C969430bKn c969430bKn);

    int LJJIJIL(String str, SurfaceView surfaceView);

    void LJJIJL(C1273200jEk c1273200jEk);

    View LJJIJLIJ();

    int LJJIL(String str, C01IL c01il);

    void LJJIZ(int i);

    void LJJJ(List<C1276780jKW> list);

    void LJJJI(C1274760jHG c1274760jHG);

    void LJJJIL(boolean z);

    void LJJJJ(String str, JSONObject jSONObject);

    void LJJJJI(Object obj, String str);

    void LJJJJIZL(EnumC1277210jLD enumC1277210jLD, C1273200jEk c1273200jEk);

    void LJJJJJ(boolean z);

    JSONArray LJJJJJL();

    void LJJJJL(JSONObject jSONObject, EnumC1275330jIB enumC1275330jIB);

    boolean LJJJJLI(C1274190jGL c1274190jGL);

    boolean LJJJJLL();

    RTCVideoInterface LJJJJZ();

    int LJJJJZI(String str, boolean z);

    void LJJJLIIL(boolean z);

    int LJJJLL(String str, boolean z, boolean z2);

    void LJJJLZIJ();

    List<String> LJJJZ();

    void LJJL();

    void LJJLI(boolean z);

    void LJJLIIIIJ(float f, String str);

    void LJJLIIIJ(String str);

    void LJJLIIIJILLIZJL(String str);

    void LJJLIIIJJI(Cert cert);

    void LJJLIIIJJIZ(EnumC1277210jLD enumC1277210jLD);

    void LJJLIIIJL(List<C1276780jKW> list);

    int LJJLIIIJLJLI(EnumC1276480jK2 enumC1276480jK2);

    boolean LJJLIIIJLLLLLLLZ();

    void LJJLIIJ(String str);

    JSONArray LJJLIL();

    int LJJLJ(String str);

    void LJJLJLI(float f, String str);

    void LJJLL(long j, String str);

    void LJJZ(InterfaceC1274710jHB interfaceC1274710jHB);

    void LJJZZI(float f, boolean z);

    boolean Z4();

    void b0(boolean z);

    void disableDownlinkAudioSelection();

    void dispose();

    void enableDownlinkAudioSelection(int i);

    C1275030jHh getConfig();

    List<LyraxTranscoderFeature> getFeatures();

    void joinChannel();

    void muteAllRemoteAudioStreams(boolean z);

    void muteAllRemoteVideoStreams(boolean z);

    void muteRemoteAudioStream(String str, boolean z);

    void pause();

    void resume();

    long sendRoomMessage(String str);

    long sendUserMessage(String str, String str2);

    void setBizSessionId(String str);

    void setBusinessId(String str);

    void setGroupChannelId(String str);

    void setLinkMicType(LinkMicType linkMicType);

    void setLinkmicStateForAnchorNet();

    void setRemoteAudioPlaybackVolume(String str, int i);

    void setRemoteRoomAudioPlaybackVolume(int i);

    int startAuxStream(String str);

    int startForwardStreamToRooms(List<C1275450jIN> list);

    void stop();

    void stop(Cert cert);

    int stopAuxStream(String str);

    void stopForwardStreamToRooms();

    int updateForwardStreamToRooms(List<C1275450jIN> list);

    void updateRtcExtInfo(String str);
}
