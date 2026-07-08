package X;

import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveInnerPrePullStreamConfigData;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveInnerPrePullStreamSettings;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0IEw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C463320IEw {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(76));

    public static final boolean LIZ() {
        LiveInnerPrePullStreamConfigData value = LiveInnerPrePullStreamSettings.INSTANCE.getValue();
        return value != null && value.delayTimeForPrePullStream >= 0;
    }

    public static ConcurrentHashMap LIZIZ() {
        return (ConcurrentHashMap) LIZ.getValue();
    }

    public static void LIZJ(C463310IEv c463310IEv) {
        HashMap map = new HashMap();
        map.put("delay_time_to_pull_stream", String.valueOf(c463310IEv.LIZ));
        map.put("alive_time_for_pull_stream", String.valueOf(c463310IEv.LIZIZ));
        map.put("final_phase", String.valueOf(c463310IEv.LJ));
        map.put("upload_scene", String.valueOf(c463310IEv.LJFF));
        map.put("alive_duration", String.valueOf(c463310IEv.LJI));
        map.put("advance_time_for_pull_stream", String.valueOf(c463310IEv.LJII));
        map.put("enter_from_merge", c463310IEv.LJIIJ);
        map.put("enter_method", c463310IEv.LJIIIZ);
        map.put("room_id", String.valueOf(c463310IEv.LJIIIIZZ));
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_live_inner_pre_pull_parallel", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
        c474500IjALIZIZ.LJJIIZI(map);
        c474500IjALIZIZ.LIZ();
    }

    public static final void LIZLLL(String str, long j, EnterRoomConfig enterRoomConfig, C0IFL c0ifl) {
        String str2;
        EnterRoomConfig.RoomsData roomsData;
        String str3;
        EnterRoomConfig.RoomsData roomsData2;
        if (str == null) {
            C827750WdZ.LIZIZ("LiveRoomOptimizer", "pre-pull -> pre pull stream has been started but the tag is null.");
            return;
        }
        if (LIZIZ().containsKey(str)) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("pre-pull -> pre pull stream has been started for ");
            sbLIZ.append(str);
            sbLIZ.append('.');
            C827750WdZ.LIZIZ("LiveRoomOptimizer", C2188811AlT.LIZIZ(sbLIZ));
            return;
        }
        ConcurrentHashMap concurrentHashMapLIZIZ = LIZIZ();
        C463310IEv c463310IEv = new C463310IEv();
        c463310IEv.LIZ = c0ifl.LIZ;
        c463310IEv.LIZIZ = c0ifl.LIZIZ;
        c463310IEv.LIZJ = System.currentTimeMillis();
        c463310IEv.LJ = 0;
        c463310IEv.LJIIIIZZ = j;
        String str4 = "";
        if (enterRoomConfig == null || (roomsData2 = enterRoomConfig.mRoomsData) == null || (str2 = roomsData2.enterFromMerge) == null) {
            str2 = "";
        }
        c463310IEv.LJIIJ = str2;
        if (enterRoomConfig != null && (roomsData = enterRoomConfig.mRoomsData) != null && (str3 = roomsData.enterMethod) != null) {
            str4 = str3;
        }
        c463310IEv.LJIIIZ = str4;
        concurrentHashMapLIZIZ.put(str, c463310IEv);
    }
}
