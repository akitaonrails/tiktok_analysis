package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.livesetting.other.LiveSlardarUidReportOptSetting;
import com.bytedance.android.livesdk.livesetting.rank.RankEntranceMonitorSamplingSetting;
import com.bytedance.android.livesdk.rank.api.RankTypeV2;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;

/* JADX INFO: renamed from: X.0xFW, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1811840xFW {
    public static boolean LIZ;
    public static long LIZJ;
    public static long LIZLLL;
    public static long LJ;
    public static long LJII;
    public static long LJIIIZ;
    public static long LJIIJ;
    public static long LJIIJJI;
    public static int LJIIL;
    public static int LJIILIIL;
    public static int LJIILJJIL;
    public static int LJIILL;
    public static int LJIILLIIL;
    public static int LJIIZILJ;
    public static String LIZIZ = "";
    public static final HashSet<Integer> LJFF = new HashSet<>();
    public static final HashSet<Integer> LJI = new HashSet<>();
    public static final Map<String, Long> LJIIIIZZ = new LinkedHashMap();

    public static void LJ(Throwable th, JSONObject jSONObject) {
        String canonicalName;
        String message;
        int i;
        String str = "";
        if (th instanceof C477520Io2) {
            C0K04.LJFF("error_type", "custom_api_error", jSONObject);
            C501470JlZ c501470JlZ = (C501470JlZ) th;
            C0K04.LIZLLL(c501470JlZ.getErrorCode(), "error_code", jSONObject);
            String errorMsg = c501470JlZ.getErrorMsg();
            if (errorMsg != null) {
                str = errorMsg;
            }
            C0K04.LJFF("error_msg", str, jSONObject);
            return;
        }
        if (th instanceof C501470JlZ) {
            C0K04.LJFF("error_type", "api_error", jSONObject);
            C501470JlZ c501470JlZ2 = (C501470JlZ) th;
            C0K04.LIZLLL(c501470JlZ2.getErrorCode(), "error_code", jSONObject);
            String errorMsg2 = c501470JlZ2.getErrorMsg();
            if (errorMsg2 != null) {
                str = errorMsg2;
            }
            C0K04.LJFF("error_msg", str, jSONObject);
            return;
        }
        if (th instanceof C1811850xFX) {
            C0K04.LJFF("error_type", "net_error", jSONObject);
            C1811850xFX c1811850xFX = (C1811850xFX) th;
            C0K04.LIZLLL(c1811850xFX.getCronetError(), "error_code", jSONObject);
            String message2 = c1811850xFX.getMessage();
            if (message2 != null) {
                str = message2;
            }
            C0K04.LJFF("error_msg", str, jSONObject);
            return;
        }
        if (th instanceof C1494690ozz) {
            C0K04.LJFF("error_type", "cronet_io_error", jSONObject);
            C0K04.LIZLLL(-2, "error_code", jSONObject);
            String message3 = th.getMessage();
            if (message3 != null) {
                str = message3;
            }
            C0K04.LJFF("error_msg", str, jSONObject);
            return;
        }
        if (th instanceof C1494450ozb) {
            C0K04.LJFF("error_type", "net_not_available_error", jSONObject);
            C497740JfY.LJII();
            try {
            } catch (Exception e) {
                TryCatchGuardChecker.doCheck(e);
            }
            if (!C036E.LIZ.LIZIZ()) {
                i = -3;
            } else {
                i = -4;
            }
            C0K04.LIZLLL(i, "error_code", jSONObject);
            String message4 = th.getMessage();
            if (message4 != null) {
                str = message4;
            }
            C0K04.LJFF("error_msg", str, jSONObject);
            return;
        }
        if (th == null || (canonicalName = th.getClass().getCanonicalName()) == null) {
            canonicalName = "unknown_error";
        }
        C0K04.LJFF("error_type", canonicalName, jSONObject);
        C0K04.LIZLLL(-1, "error_code", jSONObject);
        if (th != null && (message = th.getMessage()) != null) {
            str = message;
        }
        C0K04.LJFF("error_msg", str, jSONObject);
    }

    public static void LJI(RankTypeV2 rankTypeV2, boolean z) {
        long jLongValue;
        if (z) {
            LJIIIZ = System.currentTimeMillis();
            return;
        }
        LJIIJ = System.currentTimeMillis();
        Map<String, Long> map = LJIIIIZZ;
        Long l = (Long) ((LinkedHashMap) map).get(rankTypeV2.rankName);
        if (l != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        long j = (LJIIJ - LJIIIZ) / 1000;
        map.put(rankTypeV2.rankName, Long.valueOf(jLongValue + j));
        LJIIJJI += j;
    }

    public static void LIZ(DataChannel dataChannel, JSONObject jSONObject, List list) {
        long id;
        String string;
        if (dataChannel != null) {
            Room room = (Room) dataChannel.gg0(RoomChannel.class);
            long ownerUserId = 0;
            if (room != null) {
                id = room.getId();
            } else {
                id = 0;
            }
            C0K04.LJ("room_id", id, jSONObject);
            Room room2 = (Room) dataChannel.gg0(RoomChannel.class);
            if (room2 != null) {
                ownerUserId = room2.getOwnerUserId();
            }
            C0K04.LJ("anchor_id", ownerUserId, jSONObject);
            if (!LiveSlardarUidReportOptSetting.INSTANCE.isExp()) {
                C0K04.LJ("user_id", UserService.getInstance().user().getCurrentUserId(), jSONObject);
            }
            C0K04.LIZLLL(C1810700xDg.LJ(dataChannel), "opt_out_enable", jSONObject);
            if (list != null) {
                StringBuilder sb = new StringBuilder();
                int i = 0;
                for (Object obj : list) {
                    int i2 = i + 1;
                    if (i >= 0) {
                        List list2 = (List) obj;
                        int size = list2.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            RankTypeV2 rankTypeV2 = RankTypeV2.LIZ;
                            sb.append(C235000vU.LIZ(((RankTabInfo) ListProtector.get(list2, i3)).rankType, ((RankTabInfo) ListProtector.get(list2, i3)).LIZIZ).rankName);
                            if (i3 != list2.size() - 1) {
                                sb.append(", ");
                            }
                        }
                        if (i != list.size() - 1) {
                            sb.append(", ");
                        }
                        i = i2;
                    } else {
                        C1697810uHb.LJIJI();
                        throw null;
                    }
                }
                string = sb.toString();
            } else {
                string = "";
            }
            C0K04.LJFF("current_all_rank_type", string, jSONObject);
        }
    }

    public static void LIZIZ(DataChannel dataChannel, String str, Throwable th) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        C0K04.LJFF("current_entrance_rank_type", "", jSONObject);
        C0K04.LIZLLL(EnumC1811400xEo.DEFAULT.getType(), "group_type", jSONObject);
        C0K04.LJFF("retry_result", str, jSONObject);
        LIZ(dataChannel, jSONObject3, null);
        LIZLLL = System.currentTimeMillis();
        C0K04.LJFF("event_name", "ttlive_ranklist_entrance_retry_result", jSONObject);
        C0K04.LJ("event_duration", LIZLLL - LIZJ, jSONObject2);
        C0K04.LJ("event_duration", LIZLLL - LIZJ, jSONObject3);
        C0K04.LJFF("data_source", "entrance", jSONObject3);
        LJ(th, jSONObject3);
        C0K04.LJII("extra", jSONObject4, jSONObject3);
        C1CC2.LJ("ttlive_ranklist_entrance_retry_result", jSONObject, jSONObject2, jSONObject4);
    }

    public static void LIZLLL(DataChannel dataChannel, String str, Throwable th) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        C0K04.LJFF("current_entrance_rank_type", "", jSONObject);
        C0K04.LIZLLL(EnumC1811400xEo.DEFAULT.getType(), "group_type", jSONObject);
        C0K04.LJFF("request_result", str, jSONObject);
        LIZ(dataChannel, jSONObject3, null);
        C0K04.LJFF("event_name", "ttlive_ranklist_entrance_refresh", jSONObject);
        C0K04.LJFF("data_source", "entrance", jSONObject3);
        if (th != null) {
            LJ(th, jSONObject3);
        }
        C0K04.LJII("extra", jSONObject4, jSONObject3);
        C1CC2.LJ("ttlive_ranklist_entrance_refresh", jSONObject, jSONObject2, jSONObject4);
    }

    public static void LIZJ(JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3, boolean z) {
        JSONObject jSONObject4 = new JSONObject();
        if (((LIZ ^ z) && !Intrinsics.LJFF(LIZIZ, "") && LIZLLL != 0 && LJ != 0) || (!z && Intrinsics.LJFF(LIZIZ, "change_by_mic_room"))) {
            C0K04.LIZLLL(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0, "display", jSONObject3);
            C0K04.LJFF("reason", LIZIZ, jSONObject3);
            C0K04.LJII("extra", jSONObject4, jSONObject3);
            C1CC2.LJ("ttlive_ranklist_entrance_display", jSONObject, jSONObject2, jSONObject4);
        }
        LIZ = z;
        LIZIZ = "";
    }

    public static void LJFF(DataChannel dataChannel, EnumC1811400xEo enumC1811400xEo, RankTypeV2 rankTypeV2, EnumC1843350y4L enumC1843350y4L, Map map, Map map2) {
        if (enumC1843350y4L.getReportBadCaseSamplingRate() > 1) {
            RankEntranceMonitorSamplingSetting rankEntranceMonitorSamplingSetting = RankEntranceMonitorSamplingSetting.INSTANCE;
            if (rankEntranceMonitorSamplingSetting.getDeviceId() >= 1 && rankEntranceMonitorSamplingSetting.getDeviceId() % enumC1843350y4L.getReportBadCaseSamplingRate() != 0) {
                return;
            }
        }
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        JSONObject jSONObject4 = new JSONObject();
        C0K04.LIZLLL(enumC1811400xEo.getType(), "group_type", jSONObject);
        C0K04.LJFF("current_entrance_rank_type", rankTypeV2.rankName, jSONObject);
        C0K04.LJFF("bad_case_type", enumC1843350y4L.getBadCaseType(), jSONObject);
        C0K04.LJ("msg_id", LJII, jSONObject3);
        if (map != null) {
            for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
                C0K04.LJFF((String) entry.getKey(), (String) entry.getValue(), jSONObject);
            }
        }
        if (map2 != null) {
            for (Map.Entry entry2 : ((LinkedHashMap) map2).entrySet()) {
                C0K04.LJFF((String) entry2.getKey(), (String) entry2.getValue(), jSONObject3);
            }
        }
        LIZ(dataChannel, jSONObject3, null);
        LIZ(dataChannel, jSONObject3, null);
        C0K04.LJII("extra", jSONObject4, jSONObject3);
        C1CC2.LJ("ttlive_ranklist_entrance_bad_case", jSONObject, jSONObject2, jSONObject4);
    }
}
