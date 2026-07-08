package X;

import android.view.View;
import com.ss.bytertc.engine.video.IVideoStrategyRunner;
import com.ss.lyrax.transcoder.LyraxTranscoderFeature;
import com.ss.lyrax.video.ILyraxVideoPlatformWrapper;
import com.ss.lyrax.video.LyraxPreProcessVideoNodeStats;
import com.ss.lyrax.video.LyraxVideoBitrateGearTableItem;
import com.ss.lyrax.video.LyraxVideoEncoderProfile;
import com.ss.pusher.core.params.ASRWordMuting;
import com.ss.ttlivestreamer.core.utils.TEBundle;
import java.util.List;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0j3i, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public interface InterfaceC1266360j3i {
    void LJIIIIZZ(String str, String str2, int i);

    void LJIIIZ(boolean z);

    void LJIIJ(C1277690jLz c1277690jLz, boolean z);

    boolean LJIIJJI();

    void LJIIL(C1267500j5Y c1267500j5Y);

    void LJIILIIL(InterfaceC1277660jLw interfaceC1277660jLw);

    void LJIILJJIL();

    void LJIILL(boolean z);

    void LJIILLIIL(String[] strArr, boolean z);

    void LJIIZILJ(C1278180jMm c1278180jMm);

    void LJIJ(String str, boolean z);

    ASRWordMuting LJIJI();

    String LJIJJ();

    int LJIJJLI(InterfaceC1277930jMN interfaceC1277930jMN);

    int LJIL(View view);

    int LJJ();

    void LJJI();

    void LJJIFFI(TEBundle tEBundle);

    void LJJII(InterfaceC1274510jGr interfaceC1274510jGr);

    void LJJIII(boolean z, EnumC1269700j96 enumC1269700j96);

    Object LJJIIJ();

    void LJJIIJZLJL(InterfaceC1278600jNS interfaceC1278600jNS);

    void LJJIIZ(String str);

    JSONObject LJJIIZI();

    EnumC1276080jJO LJJIJ();

    int LJJIJIIJI(String str, Object obj, int i, boolean z, boolean z2, int i2);

    EnumC1277890jMJ LJJIJIIJIL();

    int LJJIJIL(int i, int i2, int i3);

    void LJJIJL(List<LyraxTranscoderFeature> list);

    void LJJIJLIJ();

    void LJJIL(C1277560jLm c1277560jLm);

    void bindToRoom(String str);

    void cacheJoinRoomState();

    int enableCalculateAudioLoudness(boolean z);

    LyraxVideoEncoderProfile.VideoDegradeLevels getDegradeLevels();

    C1277690jLz getPusherState();

    List<LyraxVideoBitrateGearTableItem> getVideoBitrateGearTable();

    void insertStandardLevel(int i, int i2, int i3, int i4);

    void reportFinalLog(String str);

    void setVideoSource(ILyraxVideoPlatformWrapper iLyraxVideoPlatformWrapper);

    void setVideoStrategyRunner(IVideoStrategyRunner iVideoStrategyRunner);

    void stopPush(boolean z);

    void unbindFromRoom(String str);

    void updateExternalStats(LyraxPreProcessVideoNodeStats lyraxPreProcessVideoNodeStats);
}
