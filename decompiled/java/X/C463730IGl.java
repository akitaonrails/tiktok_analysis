package X;

import Y.AfS43S1100000_7;
import android.text.TextUtils;
import com.bytedance.android.live.liveinteract.api.MultiLiveVideoSizePairData;
import com.bytedance.android.livesdk.dataChannel.AudienceLastSelectDefinitionInfo;
import com.bytedance.android.livesdk.dataChannel.GameLiveAbrNewResolution;
import com.bytedance.android.livesdk.livesetting.other.SlardarSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayConfirmIntervalSetting;
import com.bytedance.android.livesdk.livesetting.performance.LivePlayEnforceIntervalSetting;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.GsonProtectorUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IGl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C463730IGl extends C0K04 {
    public Room LIZ;
    public long LIZLLL;
    public long LJ;
    public int LJFF;
    public long LJI;
    public long LJIIJ;
    public int LJIIL;
    public int LJIILIIL;
    public DataChannel LJIILL;
    public LiveMode LJIILLIIL;
    public String LIZIZ = "";
    public String LIZJ = "";
    public final Map<String, InterfaceC420801kM> LJII = new LinkedHashMap();
    public final long LJIIIIZZ = LivePlayConfirmIntervalSetting.INSTANCE.getValue();
    public final long LJIIIZ = LivePlayEnforceIntervalSetting.INSTANCE.getValue();
    public String LJIIJJI = "";
    public final String LJIILJJIL = "";

    public final void LJIIL() {
        if (LJIIJJI() && Intrinsics.LJFF(this.LIZIZ, "T1")) {
            LJIIJ();
            LJIILLIIL(System.currentTimeMillis(), "system_exit_first_frame_received", "", "");
            LJIILL();
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.LIZLLL = jCurrentTimeMillis;
            this.LIZIZ = "T2";
            LJIILLIIL(jCurrentTimeMillis, "system_enter_confirm_time_start", "", "");
            LJIIZILJ(this.LJIIIIZZ, this.LIZIZ);
        }
    }

    public final void LJIILIIL() {
        if (LJIIJJI() && Intrinsics.LJFF(this.LIZIZ, "T0")) {
            LJIILLIIL(System.currentTimeMillis(), "system_exit_preload_succeeded", "", "");
            LJIILL();
            long jCurrentTimeMillis = System.currentTimeMillis();
            this.LIZLLL = jCurrentTimeMillis;
            this.LIZIZ = "T1";
            LJIILLIIL(jCurrentTimeMillis, "system_enter_start_receive_first_frame", "", "");
        }
    }

    public final void LJIILL() {
        this.LJFF = 0;
        this.LJI = 0L;
    }

    public final void LJIIJ() {
        String str;
        Map map;
        String str2;
        DataChannel dataChannel = this.LJIILL;
        if (dataChannel != null && (map = (Map) dataChannel.gg0(AudienceLastSelectDefinitionInfo.class)) != null && (str2 = (String) map.get("sdk_key")) != null && !Intrinsics.LJFF("auto", str2.toLowerCase(Locale.ROOT))) {
            this.LJIIJJI = str2;
            return;
        }
        DataChannel dataChannel2 = this.LJIILL;
        if (dataChannel2 == null || (str = (String) dataChannel2.gg0(GameLiveAbrNewResolution.class)) == null) {
            str = "";
        }
        this.LJIIJJI = str;
    }

    public final boolean LJIIJJI() {
        LiveMode liveMode = this.LJIILLIIL;
        return liveMode == LiveMode.THIRD_PARTY || liveMode == LiveMode.SCREEN_RECORD || liveMode == LiveMode.LIVE_STUDIO;
    }

    public C463730IGl(Room room) {
        this.LIZ = room;
    }

    public final void LJIILJJIL(C463430IFh c463430IFh) {
        if (!LJIIJJI() || TextUtils.isEmpty(this.LIZIZ)) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        String str = c463430IFh.LIZ;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        String str3 = c463430IFh.LIZIZ;
        if (str3 == null) {
            str3 = "";
        }
        String str4 = c463430IFh.LIZJ;
        if (str4 != null) {
            str2 = str4;
        }
        LJIILLIIL(jCurrentTimeMillis, str, str3, str2);
    }

    public final void LJIIZILJ(long j, String str) {
        if (((LinkedHashMap) this.LJII).get(str) != null) {
            return;
        }
        this.LJII.put(str, C11NZ.LJLJJLL(j, TimeUnit.MILLISECONDS).LJJJLZIJ(C1701940uOG.LIZIZ()).LJJLJLI(new AfS43S1100000_7(this, str, 0)));
    }

    public final void LJIILLIIL(long j, String str, String str2, String str3) {
        Pair pair;
        int iIntValue;
        int iIntValue2;
        Long lValueOf;
        Long lValueOf2;
        String strName;
        StreamUrl streamUrl;
        LinkedList<LiveCoreSDKData.Quality> linkedList;
        DataChannel dataChannel = this.LJIILL;
        ArrayList arrayList = null;
        if (dataChannel != null) {
            pair = (Pair) dataChannel.gg0(MultiLiveVideoSizePairData.class);
        } else {
            pair = null;
        }
        if (pair != null) {
            iIntValue = ((Number) pair.getFirst()).intValue();
        } else {
            iIntValue = 0;
        }
        this.LJIIL = iIntValue;
        if (pair != null) {
            iIntValue2 = ((Number) pair.getSecond()).intValue();
        } else {
            iIntValue2 = 0;
        }
        this.LJIILIIL = iIntValue2;
        if (!SlardarSampleSetting.INSTANCE.isReport("livesdk_game_audience_watchlive_whole_link_tracking", 0.0d)) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_audience_watchlive_whole_link_tracking");
        c474500IjALIZ.LJJII(this.LIZIZ, "state");
        c474500IjALIZ.LJJII(Long.valueOf(j), "timestamp");
        c474500IjALIZ.LJJII(this.LIZJ, "live_log_id");
        c474500IjALIZ.LJJII(str, "action_type");
        String str4 = "";
        c474500IjALIZ.LJJII("", "enter_from_key");
        c474500IjALIZ.LJJII(Long.valueOf(j - this.LIZLLL), "duration_time");
        c474500IjALIZ.LJJII(Long.valueOf(j - this.LJ), "live_watch_time");
        c474500IjALIZ.LJJII(str2, "error_code");
        c474500IjALIZ.LJJII(str3, "error_msg");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LJFF), "rebuffer_count");
        c474500IjALIZ.LJJII(Long.valueOf(this.LJI), "rebuffer_time");
        c474500IjALIZ.LJJII(0, "interrupt_count");
        c474500IjALIZ.LJJII(0L, "interrupt_time");
        Room room = this.LIZ;
        if (room != null) {
            lValueOf = Long.valueOf(room.getId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "room_id");
        Room room2 = this.LIZ;
        if (room2 != null) {
            lValueOf2 = Long.valueOf(room2.getOwnerUserId());
        } else {
            lValueOf2 = null;
        }
        c474500IjALIZ.LJJII(lValueOf2, "host_id");
        Room room3 = this.LIZ;
        if (room3 != null && (streamUrl = room3.getStreamUrl()) != null && (linkedList = streamUrl.qualityList) != null) {
            arrayList = new ArrayList();
            for (LiveCoreSDKData.Quality quality : linkedList) {
                if (C0IN9.LJ(quality)) {
                    arrayList.add(quality);
                }
            }
        }
        ArrayList arrayList2 = new ArrayList();
        if (arrayList != null) {
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                arrayList2.add(((LiveCoreSDKData.Quality) it2.next()).sdkKey);
            }
        }
        String json = GsonProtectorUtils.toJson(C19748512Ol.LIZIZ, arrayList2);
        if (json == null) {
            json = "";
        }
        c474500IjALIZ.LJJII(json, "live_support_resolution");
        c474500IjALIZ.LJJII(this.LJIIJJI, "live_resolution");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LJIIL), "live_width");
        c474500IjALIZ.LJJII(Integer.valueOf(this.LJIILIIL), "live_height");
        LiveMode liveMode = this.LJIILLIIL;
        if (liveMode != null && (strName = liveMode.name()) != null) {
            str4 = strName;
        }
        c474500IjALIZ.LJJII(str4, "room_type");
        c474500IjALIZ.LJJII(this.LJIILJJIL, "screen_orientation");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LIZ();
        } else {
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LJJIJL();
        }
    }
}
