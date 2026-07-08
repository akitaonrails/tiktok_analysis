package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.livepullstream.api.IPullStreamService;
import com.bytedance.android.livesdk.livesetting.linkmic.MultiGuestTopLiveIterationPhase1Setting;
import com.bytedance.android.livesdk.livesetting.linkmic.TiktokLiveTopLiveArchitectureOptSetting;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserApplySettings;
import com.bytedance.android.livesdk.model.linksetting.MultiLiveUserSettings;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.scene.Scene;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import webcast.data.AllLinkedUserData;
import webcast.data.MultiGuestLayoutInfo;

/* JADX INFO: renamed from: X.0Ioa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C477860Ioa {
    public static final StringBuilder LIZ = new StringBuilder();
    public static final List<String> LIZIZ = new ArrayList();
    public static final Map<String, Long> LIZJ = new ConcurrentHashMap();
    public static final Map<String, Long> LIZLLL = new ConcurrentHashMap();
    public static C477920Iog LJ;
    public static boolean LJFF;
    public static boolean LJI;

    public static void LJIILIIL() {
        LIZ.setLength(0);
        ((ArrayList) LIZIZ).clear();
        LJFF = false;
        ((ConcurrentHashMap) LIZJ).clear();
        ((ConcurrentHashMap) LIZLLL).clear();
        LJ = null;
        LJI = false;
    }

    public static int LIZ(Room room) {
        MultiLiveUserApplySettings multiLiveUserApplySettings;
        MultiGuestLayoutInfo multiGuestLayoutInfo;
        MultiLiveUserApplySettings multiLiveUserApplySettings2;
        AllLinkedUserData allLinkedUserData;
        List<User> list;
        if (room != null) {
            MultiLiveUserSettings multiLiveUserSettings = room.multiLiveUserSettings;
            if (multiLiveUserSettings != null && (multiLiveUserApplySettings2 = multiLiveUserSettings.multiLiveUserApplySettings) != null && (allLinkedUserData = multiLiveUserApplySettings2.allLinkedUserData) != null && (list = allLinkedUserData.linkedUserList) != null) {
                return list.size();
            }
            MultiLiveUserSettings multiLiveUserSettings2 = room.multiLiveUserSettings;
            if (multiLiveUserSettings2 != null && (multiLiveUserApplySettings = multiLiveUserSettings2.multiLiveUserApplySettings) != null && (multiGuestLayoutInfo = multiLiveUserApplySettings.multiGuestLayoutInfo) != null) {
                return (int) multiGuestLayoutInfo.guestCnt;
            }
            return 0;
        }
        return 0;
    }

    public static void LIZIZ(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_enter_randmatch_page");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII(str, "page_enter_from");
        c474500IjALIZ.LIZ();
    }

    public static void LJ(C477890Iod c477890Iod) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_hangout_toplive_live_card_request_result");
        c474500IjALIZ.LJJII(c477890Iod.LIZ, "enter_method");
        c474500IjALIZ.LJJII(c477890Iod.LIZIZ, Scene.SCENE_SERVICE);
        c474500IjALIZ.LJJII(c477890Iod.LIZJ, "source");
        c474500IjALIZ.LJJII(Long.valueOf(c477890Iod.LIZLLL), "duration");
        c474500IjALIZ.LJJII(c477890Iod.LJ, "result");
        String str = c477890Iod.LJFF;
        if (str == null) {
            str = "";
        }
        c474500IjALIZ.LJJII(str, "log_id");
        String str2 = c477890Iod.LJI;
        if (str2 != null) {
            c474500IjALIZ.LJJII(str2, "error_code");
        }
        String str3 = c477890Iod.LJII;
        if (str3 != null) {
            c474500IjALIZ.LJJII(str3, "error_msg");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LJI(C477900Ioe c477900Ioe) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_hangout_toplive_push_request_result");
        c474500IjALIZ.LJJII(c477900Ioe.LIZ, Scene.SCENE_SERVICE);
        c474500IjALIZ.LJJII(c477900Ioe.LIZIZ, "source");
        c474500IjALIZ.LJJII(Long.valueOf(c477900Ioe.LIZJ), "duration");
        c474500IjALIZ.LJJII(c477900Ioe.LIZLLL, "result");
        String str = c477900Ioe.LJ;
        if (str == null) {
            str = "";
        }
        c474500IjALIZ.LJJII(str, "log_id");
        String str2 = c477900Ioe.LJFF;
        if (str2 != null) {
            c474500IjALIZ.LJJII(str2, "error_code");
        }
        String str3 = c477900Ioe.LJI;
        if (str3 != null) {
            c474500IjALIZ.LJJII(str3, "error_msg");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LJII(C477880Ioc c477880Ioc) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_hangout_toplive_skylight_request_result");
        c474500IjALIZ.LJJII(c477880Ioc.LIZ, Scene.SCENE_SERVICE);
        c474500IjALIZ.LJJII(c477880Ioc.LIZIZ, "source");
        c474500IjALIZ.LJJII(Long.valueOf(c477880Ioc.LIZJ), "duration");
        c474500IjALIZ.LJJII(c477880Ioc.LIZLLL, "result");
        String str = c477880Ioc.LJ;
        if (str == null) {
            str = "";
        }
        c474500IjALIZ.LJJII(str, "log_id");
        String str2 = c477880Ioc.LJFF;
        if (str2 != null) {
            c474500IjALIZ.LJJII(str2, "error_code");
        }
        String str3 = c477880Ioc.LJI;
        if (str3 != null) {
            c474500IjALIZ.LJJII(str3, "error_msg");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LJIIL(C477910Iof c477910Iof) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_hangout_toplive_top_module_request_result");
        c474500IjALIZ.LJJII(c477910Iof.LIZ, Scene.SCENE_SERVICE);
        c474500IjALIZ.LJJII(c477910Iof.LIZIZ, "source");
        c474500IjALIZ.LJJII(Long.valueOf(c477910Iof.LIZJ), "duration");
        c474500IjALIZ.LJJII(c477910Iof.LIZLLL, "result");
        String str = c477910Iof.LJ;
        if (str == null) {
            str = "";
        }
        c474500IjALIZ.LJJII(str, "log_id");
        String str2 = c477910Iof.LJFF;
        if (str2 != null) {
            c474500IjALIZ.LJJII(str2, "error_code");
        }
        String str3 = c477910Iof.LJI;
        if (str3 != null) {
            c474500IjALIZ.LJJII(str3, "error_msg");
        }
        c474500IjALIZ.LIZ();
    }

    public static final void LJIIIIZZ(String str, boolean z) {
        EnterRoomConfig enterRoomConfig;
        String str2;
        String str3;
        EnterRoomConfig.LogData logData;
        if (LJFF || (enterRoomConfig = C0IL2.LIZ.LIZ().mEnterRoomConfig) == null) {
            return;
        }
        if (TiktokLiveTopLiveArchitectureOptSetting.INSTANCE.isArchOpt()) {
            C479670IrV.LIZ.getClass();
            z = C479670IrV.LJFF;
        }
        if (!MultiGuestTopLiveIterationPhase1Setting.isEnable() ? (str2 = enterRoomConfig.mLogData.topliveHomepageType) == null : !(!z ? (str2 = (logData = enterRoomConfig.mLogData).topLiveSource) != null || (str2 = logData.topliveHomepageType) != null : (str2 = enterRoomConfig.mLogData.topliveHomepageType) != null)) {
            str2 = "homepage_hot";
        }
        if (!MultiGuestTopLiveIterationPhase1Setting.isEnable() ? (str3 = enterRoomConfig.mLogData.liveTabSource) == null : !(!z ? (str3 = enterRoomConfig.mLogData.liveTabSource) != null : (str3 = enterRoomConfig.mRoomsData.enterMethod) != null)) {
            str3 = "toplive_icon";
        }
        LJFF = true;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toplive_slide");
        c474500IjALIZ.LJJII(str2, "enter_from_merge");
        c474500IjALIZ.LJJII(str3, "enter_method");
        c474500IjALIZ.LJJII(C479670IrV.LIZIZ, "top_tab");
        if (MultiGuestTopLiveIterationPhase1Setting.isEnable() && enterRoomConfig.mLogData.topLiveSource != null) {
            c474500IjALIZ.LJJII("enter_toplive", "enter_tab_action");
        }
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJIIJ(C477870Iob c477870Iob, Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("module_name", c477870Iob.LIZIZ);
        String str = c477870Iob.LIZJ;
        if (str != null) {
            linkedHashMap.put("module_sub_name", str);
        }
        Integer num = c477870Iob.LIZLLL;
        if (num != null) {
            linkedHashMap.put("guest_num", String.valueOf(num.intValue()));
        }
        Integer num2 = c477870Iob.LJ;
        if (num2 != null) {
            linkedHashMap.put("room_num", String.valueOf(num2.intValue()));
        }
        Long l = c477870Iob.LJFF;
        if (l != null) {
            linkedHashMap.put("anchor_id", String.valueOf(l.longValue()));
        }
        Long l2 = c477870Iob.LJI;
        if (l2 != null) {
            linkedHashMap.put("room_id", String.valueOf(l2.longValue()));
        }
        String str2 = c477870Iob.LJII;
        if (str2 != null) {
            linkedHashMap.put("guest_request_id", str2);
        }
        Integer num3 = c477870Iob.LJIIIIZZ;
        if (num3 != null) {
            linkedHashMap.put("viewer_num", String.valueOf(num3.intValue()));
        }
        String str3 = c477870Iob.LJIIIZ;
        if (str3 != null) {
            linkedHashMap.put("vertical_list", str3);
        }
        String str4 = c477870Iob.LJIIJ;
        if (str4 != null) {
            linkedHashMap.put("label_info", str4);
        }
        Integer num4 = c477870Iob.LJIIL;
        if (num4 != null) {
            linkedHashMap.put("module_sub_position", String.valueOf(num4.intValue()));
        }
        Map<String, String> map2 = c477870Iob.LJIILJJIL;
        if (map2 != null) {
            linkedHashMap.putAll(map2);
        }
        String str5 = c477870Iob.LJIILIIL;
        if (str5 == null) {
            str5 = "";
        }
        linkedHashMap.put("source", str5);
        if (MultiGuestTopLiveIterationPhase1Setting.isEnable() && C0IL2.LIZ.LIZ().mEnterRoomConfig.mLogData.topLiveSource != null) {
            linkedHashMap.put("enter_tab_action", "enter_toplive");
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toplive_module_show");
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LIZ();
    }

    public static void LJIILJJIL(String str, String str2) {
        C0IM1 c0im1Bp1;
        long jLongValue;
        C477920Iog c477920Iog = LJ;
        if (c477920Iog == null) {
            return;
        }
        long j = 0;
        if (c477920Iog.LIZ > 0 && c477920Iog.LIZIZ > 0 && c477920Iog.LJFF > 0) {
            long jCurrentTimeMillis = System.currentTimeMillis();
            long j2 = c477920Iog.LJFF;
            if (jCurrentTimeMillis <= j2) {
                return;
            }
            long j3 = jCurrentTimeMillis - j2;
            if (j3 <= 0) {
                return;
            }
            int i = (int) (j3 / 1000);
            if (i < 0) {
                i = 0;
            }
            IPullStreamService iPullStreamService = (IPullStreamService) C1161920gLG.LIZJ(IPullStreamService.class);
            if (iPullStreamService != null && (c0im1Bp1 = iPullStreamService.bp1()) != null) {
                C477500Io0 c477500Io0 = C477500Io0.LIZ;
                long j4 = c477920Iog.LIZIZ;
                c477500Io0.getClass();
                C477500Io0.LIZ(j4);
                C479320Iqw c479320Iqw = (C479320Iqw) c0im1Bp1;
                long jCurrentTimeMillis2 = System.currentTimeMillis();
                Long l = c479320Iqw.LJFF;
                if (l != null) {
                    jLongValue = l.longValue();
                } else {
                    jLongValue = jCurrentTimeMillis2;
                }
                j = (jCurrentTimeMillis2 - jLongValue) + c479320Iqw.LJII;
            }
            int i2 = (int) (j / 1000);
            long j5 = c477920Iog.LIZ;
            long j6 = c477920Iog.LIZIZ;
            String str3 = c477920Iog.LIZJ;
            String str4 = c477920Iog.LIZLLL;
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_hangout_cell_on_top_duration");
            c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
            c474500IjALIZ.LJJII(Long.valueOf(j5), "anchor_id");
            c474500IjALIZ.LJJII(Long.valueOf(j6), "room_id");
            c474500IjALIZ.LJJII(str3, "enter_from_merge");
            c474500IjALIZ.LJJII(str4, "enter_method");
            c474500IjALIZ.LJJII("click", "action_type");
            c474500IjALIZ.LJJII(Integer.valueOf(i), "duration");
            c474500IjALIZ.LJJII(Integer.valueOf(i2), "audio_on_duration");
            c474500IjALIZ.LJJII(str, "end_type");
            c474500IjALIZ.LJJII(str2, "source");
            c474500IjALIZ.LIZ();
            C20441214yg.LJIIIZ("MultiTopLiveLogger", "logHangoutCellOnTopDuration reported");
            LJ = null;
        }
    }

    public static void LIZJ(long j, String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_hangout_icon");
        c474500IjALIZ.LJJII(str, "icon_type");
        c474500IjALIZ.LJJII(str2, "event_action_type");
        c474500IjALIZ.LJJII(Long.valueOf(j), "room_id");
        c474500IjALIZ.LJJII(C479670IrV.LIZIZ, "top_tab");
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02f0 A[PHI: r11
      0x02f0: PHI (r11v7 java.lang.String) = (r11v0 java.lang.String), (r11v8 java.lang.String) binds: [B:10:0x0014, B:8:0x0011] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0063  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJFF(com.bytedance.android.livesdkapi.session.EnterRoomConfig r14, com.bytedance.android.livesdkapi.depend.model.live.Room r15, java.lang.String r16, X.C477510Io1 r17) {
        /*
            Method dump skipped, instruction units count: 779
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C477860Ioa.LJFF(com.bytedance.android.livesdkapi.session.EnterRoomConfig, com.bytedance.android.livesdkapi.depend.model.live.Room, java.lang.String, X.0Io1):void");
    }

    public static void LJIIIZ(C477870Iob c477870Iob, String str, Map map, int i) {
        if ((i & 2) != 0) {
            str = null;
        }
        if ((i & 4) != 0) {
            map = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("module_name", c477870Iob.LIZIZ);
        String str2 = c477870Iob.LIZJ;
        if (str2 != null) {
            linkedHashMap.put("module_sub_name", str2);
        }
        Integer num = c477870Iob.LIZLLL;
        if (num != null) {
            linkedHashMap.put("guest_num", String.valueOf(num.intValue()));
        }
        Integer num2 = c477870Iob.LJ;
        if (num2 != null) {
            linkedHashMap.put("room_num", String.valueOf(num2.intValue()));
        }
        Long l = c477870Iob.LJFF;
        if (l != null) {
            linkedHashMap.put("anchor_id", String.valueOf(l.longValue()));
        }
        Long l2 = c477870Iob.LJI;
        if (l2 != null) {
            linkedHashMap.put("room_id", String.valueOf(l2.longValue()));
        }
        String str3 = c477870Iob.LJII;
        if (str3 != null) {
            linkedHashMap.put("guest_request_id", str3);
            linkedHashMap.put("request_id", str3);
        }
        Integer num3 = c477870Iob.LJIIIIZZ;
        if (num3 != null) {
            linkedHashMap.put("viewer_num", String.valueOf(num3.intValue()));
        }
        String str4 = c477870Iob.LJIIIZ;
        if (str4 != null) {
            linkedHashMap.put("vertical_list", str4);
        }
        String str5 = c477870Iob.LJIIJ;
        if (str5 != null) {
            linkedHashMap.put("label_info", str5);
        }
        Integer num4 = c477870Iob.LJIIL;
        if (num4 != null) {
            linkedHashMap.put("module_sub_position", String.valueOf(num4.intValue()));
        }
        if (str != null) {
            linkedHashMap.put("click_area", str);
        }
        Map<String, String> map2 = c477870Iob.LJIILJJIL;
        if (map2 != null) {
            linkedHashMap.putAll(map2);
        }
        if (map != null) {
            linkedHashMap.putAll(map);
        }
        if (MultiGuestTopLiveIterationPhase1Setting.isEnable() && C0IL2.LIZ.LIZ().mEnterRoomConfig.mLogData.topLiveSource != null) {
            linkedHashMap.put("enter_tab_action", "enter_toplive");
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toplive_module_click");
        c474500IjALIZ.LJJIIZI(linkedHashMap);
        c474500IjALIZ.LIZ();
    }

    public static void LIZLLL(long j, String str, String str2, String str3, Long l, Long l2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_multi_leave_randmatch_page");
        c474500IjALIZ.LJJII(Long.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        c474500IjALIZ.LJJII(str, "page_enter_from");
        c474500IjALIZ.LJJII(str2, "event_action_type");
        c474500IjALIZ.LJJII(Long.valueOf(j), "duration");
        if (str3 != null) {
            c474500IjALIZ.LJJII(str3, "guest_request_id");
        }
        if (l != null) {
            c474500IjALIZ.LJJII(Long.valueOf(l.longValue()), "recommend_anchor_id");
        }
        if (l2 != null) {
            c474500IjALIZ.LJJII(Long.valueOf(l2.longValue()), "recommend_room_id");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LJIIJJI(String str, String str2, String str3, boolean z, long j, String str4, String str5, String str6, String str7, Integer num, String str8, Long l, String str9, int i) {
        String str10 = str8;
        String str11 = null;
        if ((i & 128) != 0) {
            str6 = null;
        }
        if ((i & 256) != 0) {
            str7 = null;
        }
        if ((i & 512) != 0) {
            num = null;
        }
        if ((i & 1024) != 0) {
            str10 = null;
        }
        if ((i & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            l = null;
        }
        if ((i & SpeechEngineDefines.TTS_WORK_MODE_BOTH) == 0) {
            str11 = str9;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toplive_hangout_match_result");
        c474500IjALIZ.LJJII(str, "event_action_type");
        c474500IjALIZ.LJJII(str2, "enter_method");
        c474500IjALIZ.LJJII(str3, "result");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_timeout");
        c474500IjALIZ.LJJII(Long.valueOf(j), "match_duration");
        c474500IjALIZ.LJJII(str4, "api_state");
        c474500IjALIZ.LJJII(str5, "source");
        if (str6 != null) {
            c474500IjALIZ.LJJII(str6, "match_data_source");
        }
        if (num != null) {
            c474500IjALIZ.LJJII(Integer.valueOf(num.intValue()), "room_count");
        }
        if (str7 != null) {
            c474500IjALIZ.LJJII(str7, "match_type");
        }
        if (str10 != null) {
            c474500IjALIZ.LJJII(str10, "log_id");
        }
        if (l != null) {
            c474500IjALIZ.LJJII(Long.valueOf(l.longValue()), "error_code");
        }
        if (str11 != null) {
            c474500IjALIZ.LJJII(str11, "error_msg");
        }
        c474500IjALIZ.LIZ();
    }
}
