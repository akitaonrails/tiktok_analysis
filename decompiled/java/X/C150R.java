package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.dataChannel.PIPStatusData;
import com.bytedance.android.livesdk.game.pip.GameLivePipQualityStrategy$registerFragmentDestroy$1;
import com.bytedance.android.livesdk.livesetting.game.GameLivePipQualityStrategySetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.host.ILiveGameService;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Map;
import kotlin.jvm.internal.AwS610S0100000_31;

/* JADX INFO: renamed from: X.150R, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C150R implements InterfaceC463800IGs {
    public static final long LJI;
    public static final long LJII;
    public Fragment LIZ;
    public DataChannel LIZIZ;
    public boolean LIZJ;
    public String LIZLLL = "";
    public long LJ;
    public C11JF LJFF;

    static {
        GameLivePipQualityStrategySetting gameLivePipQualityStrategySetting = GameLivePipQualityStrategySetting.INSTANCE;
        LJI = gameLivePipQualityStrategySetting.delayTime();
        LJII = gameLivePipQualityStrategySetting.intervalTime();
    }

    public static boolean LIZIZ() {
        String strStrategy = GameLivePipQualityStrategySetting.INSTANCE.strategy();
        int iHashCode = strStrategy.hashCode();
        boolean z = true;
        if (iHashCode != 3448) {
            if (iHashCode != 3665) {
                if (iHashCode == 2124767295 && strStrategy.equals("dynamic")) {
                    C752210Tf1 c752210Tf1 = C752210Tf1.LIZ;
                    if (((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).e92("pip_resolution_strategy_android")) {
                        Object objHS0 = ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).HS0();
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("runPipGameLiveStrategy pipGameLiveResult:");
                        sbLIZ.append(objHS0);
                        C20441214yg.LIZIZ("GameLiveClientAiManager", C2188811AlT.LIZIZ(sbLIZ));
                        if (!(objHS0 instanceof Boolean) || !((Boolean) objHS0).booleanValue()) {
                            z = false;
                        }
                    }
                    Map<String, Object> map = C1338270kvh.LIZ;
                    return z;
                }
            } else if (strStrategy.equals("sd")) {
                Map<String, Object> map2 = C1338270kvh.LIZ;
                return false;
            }
        } else if (strStrategy.equals("ld")) {
            Map<String, Object> map3 = C1338270kvh.LIZ;
            return true;
        }
        Map<String, Object> map4 = C1338270kvh.LIZ;
        return true;
    }

    public static void LIZLLL(int i) {
        Map<String, Object> map = C1338270kvh.LIZ;
        ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).XL0(Integer.valueOf(i), "g_watch_live_pip_status");
    }

    public static void LIZJ(int i, long j) {
        String string;
        String string2;
        Object feature = ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).getFeature("g_watch_live_pip_status");
        String str = "";
        if (feature == null || (string = feature.toString()) == null) {
            string = "";
        }
        Object feature2 = ((ILiveGameService) C1161920gLG.LIZJ(ILiveGameService.class)).getFeature("g_interaction_fusion_tag_id");
        if (feature2 != null && (string2 = feature2.toString()) != null) {
            str = string2;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_pip_status");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "action");
        c474500IjALIZ.LJJII(str, "fusion_id");
        c474500IjALIZ.LJJII(string, "pip_status");
        if (i != 1 && i != 2) {
            c474500IjALIZ.LJJII(0L, "duration");
        } else {
            c474500IjALIZ.LJJII(Long.valueOf(j), "duration");
        }
        c474500IjALIZ.LIZ();
    }

    public final void LIZ(Fragment fragment, DataChannel dataChannel) {
        Object objGg0 = dataChannel.gg0(LiveModeChannel.class);
        Map<String, Object> map = C1338270kvh.LIZ;
        if (C13LQ.LJJIJIIJI(objGg0, new LiveMode[]{LiveMode.SCREEN_RECORD, LiveMode.LIVE_STUDIO, LiveMode.THIRD_PARTY}) >= 0) {
            this.LIZ = fragment;
            this.LIZIZ = dataChannel;
            dataChannel.EQ2(fragment, PIPStatusData.class, new AwS610S0100000_31(this, 378));
            Fragment fragment2 = this.LIZ;
            if (fragment2 != null) {
                fragment2.getViewLifecycleOwner().getLifecycle().addObserver(new GameLivePipQualityStrategy$registerFragmentDestroy$1(this));
            }
        }
    }
}
