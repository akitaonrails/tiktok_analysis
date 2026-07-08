package X;

import com.bytedance.android.livesdk.livesetting.game.GameDualDeviceInvitingSetting;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.android.livesdkapi.host.IHostNetwork;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.scene.Scene;
import com.ss.android.common.applog.AppLog;
import com.ss.android.ugc.aweme.search.lynx.core.communicate.jsbridge.FollowStatusChangeMethod;
import kotlin.jvm.internal.AFwS199S0000000_12;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0TEq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C743540TEq {
    public static long LIZ = System.currentTimeMillis();
    public static final /* synthetic */ int LIZIZ = 0;

    public static long LIZ() {
        return UserService.getInstance().user().getCurrentUserId();
    }

    public static long LIZIZ() {
        if (UserService.getInstance().user() != null) {
            return UserService.getInstance().user().getCurrentUserId();
        }
        return 0L;
    }

    public static void LIZLLL(DataChannel dataChannel) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_screencasting_livestudio_btn_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(LIZIZ()), "anchor_id");
        c474500IjALIZ.LJJII(LiveMode.LIVE_STUDIO.logStreamingType, "live_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJII(String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dual_device_qr_code_show");
        c474500IjALIZ.LJJII(Long.valueOf(LIZIZ()), "anchor_id");
        c474500IjALIZ.LJJII(str, "room_id");
        c474500IjALIZ.LJJII(Integer.valueOf(((IHostNetwork) C1161920gLG.LIZJ(IHostNetwork.class)).isWsConnected() ? 1 : 0), "is_ws_connected");
        c474500IjALIZ.LJJII(1, "is_rtc");
        c474500IjALIZ.LIZ();
    }

    public static void LJIILJJIL(boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dual_device_source_entrance");
        c474500IjALIZ.LJJII(Long.valueOf(LIZIZ()), "user_id");
        if (z) {
            c474500IjALIZ.LJJII(1, "is_rtc");
        } else {
            c474500IjALIZ.LJJII(0, "is_rtc");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LJIILL(boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dual_device_source_init_succeed");
        c474500IjALIZ.LJJII(Long.valueOf(LIZIZ()), "user_id");
        if (z) {
            c474500IjALIZ.LJJII(1, "is_rtc");
        } else {
            c474500IjALIZ.LJJII(0, "is_rtc");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LJIJJ(boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_cast_onStart");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_wireless");
        c474500IjALIZ.LIZ();
    }

    public static void LJIL(boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_cast_receive_first_frame");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_wireless");
        c474500IjALIZ.LIZ();
    }

    public static void LJJ(boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_cast_start_mirror");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_wireless");
        c474500IjALIZ.LIZ();
    }

    public static void LJJIFFI(boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_screencasting_livestudio_connected_show");
        c474500IjALIZ.LJJII(Long.valueOf(LIZIZ()), "anchor_id");
        c474500IjALIZ.LJJII(LiveMode.LIVE_STUDIO.logStreamingType, "live_type");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_wireless");
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(String str, String str2) {
        C01GW c01gwLIZIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(128));
        C01GW c01gwLIZIZ2 = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(127));
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dual_device_select_position");
        c474500IjALIZ.LJJII(c01gwLIZIZ2.getValue(), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(((Number) c01gwLIZIZ.getValue()).longValue()), "room_id");
        c474500IjALIZ.LJJII("confirm", "click_position");
        c474500IjALIZ.LJJII(str, "window_position");
        c474500IjALIZ.LJJII(str2, "position_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJ(String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dual_device_connection_failed");
        c474500IjALIZ.LJJII(Long.valueOf(LIZIZ()), "user_id");
        c474500IjALIZ.LJJII(str, "error_code");
        c474500IjALIZ.LJJII(str2, "detail_error_code");
        c474500IjALIZ.LIZ();
    }

    public static void LJFF(String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dual_device_shooting_popup_click");
        c474500IjALIZ.LJJII(Long.valueOf(LIZIZ()), "user_id");
        c474500IjALIZ.LJJII(str, "room_id");
        c474500IjALIZ.LJJII(str2, "position");
        c474500IjALIZ.LIZ();
    }

    public static void LJIILLIIL(String str, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dual_device_source_living");
        c474500IjALIZ.LJJII(Long.valueOf(LIZIZ()), "user_id");
        c474500IjALIZ.LJJII(str, "room_id");
        if (z) {
            c474500IjALIZ.LJJII(1, "is_rtc");
        } else {
            c474500IjALIZ.LJJII(0, "is_rtc");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LJIIZILJ(String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dual_device_shooting_click");
        c474500IjALIZ.LJJII(Long.valueOf(LIZIZ()), "user_id");
        c474500IjALIZ.LJJII(str, "room_id");
        c474500IjALIZ.LJJII(str2, "position");
        c474500IjALIZ.LIZ();
    }

    public static void LJIJ(boolean z, boolean z2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_cast_enter_cast_fragment");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_casting");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z2)) ? 1 : 0), "is_wireless");
        c474500IjALIZ.LIZ();
    }

    public static void LJIJJLI(long j, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_cast_on_stop");
        c474500IjALIZ.LJJII(Boolean.valueOf(z), "is_wireless");
        c474500IjALIZ.LJJII(Long.valueOf(j), "duration");
        c474500IjALIZ.LIZ();
    }

    public static void LJJII(String str, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_screencasting_livestudio_disconnect_show");
        c474500IjALIZ.LJJII(Long.valueOf(LIZIZ()), "anchor_id");
        c474500IjALIZ.LJJII(LiveMode.LIVE_STUDIO.logStreamingType, "live_type");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_wireless");
        c474500IjALIZ.LJJII(str, "disconnect_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJIIJ(int i, Long l, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dual_device_rtc_success_rate");
        c474500IjALIZ.LJJII(str, "device_type");
        c474500IjALIZ.LJJII(Long.valueOf(LIZIZ()), "anchor_id");
        if (l != null) {
            l.longValue();
            c474500IjALIZ.LJJII(l, "room_id");
        }
        c474500IjALIZ.LJJII(Integer.valueOf(i), "code");
        c474500IjALIZ.LIZ();
    }

    public static void LJIJI(int i, String str, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_cast_connect_succeed");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "extra");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_wireless");
        c474500IjALIZ.LJJII(str, "serviceInfo");
        c474500IjALIZ.LIZ();
    }

    public static void LJJIII(long j, String str, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_screencasting_livestudio_disconnect_click");
        c474500IjALIZ.LJIJJLI(null);
        c474500IjALIZ.LJJII(Long.valueOf(LIZIZ()), "anchor_id");
        c474500IjALIZ.LJJII(LiveMode.LIVE_STUDIO.logStreamingType, "live_type");
        c474500IjALIZ.LJJII(str, "enter_from");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_wireless");
        c474500IjALIZ.LJJII(Long.valueOf(j), "duration");
        c474500IjALIZ.LIZ();
    }

    public static void LJJIIZ(String str, boolean z, boolean z2) {
        if (str == null) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_screencasting_type_click");
        c474500IjALIZ.LJJII(Long.valueOf(LIZIZ()), "anchor_id");
        c474500IjALIZ.LJJII(str, "enter_from");
        c474500IjALIZ.LJJII(Integer.valueOf(z ? 1 : 0), "is_wireless");
        c474500IjALIZ.LJJII(LiveMode.LIVE_STUDIO.logStreamingType, "live_type");
        c474500IjALIZ.LJJII(Integer.valueOf(z2 ? 1 : 0), "if_start");
        c474500IjALIZ.LIZ();
    }

    public static void LJJIJIIJI(C0TET c0tet, String str, String str2) {
        String str3;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_phone_camera_page_action");
        c474500IjALIZ.LJJII(Long.valueOf(LIZ()), "anchor_id");
        c474500IjALIZ.LJJII("live_studio", "live_type");
        if (c0tet == C0TET.WIRELESS) {
            str3 = "wireless";
        } else {
            str3 = "wired";
        }
        c474500IjALIZ.LJJII(str3, "show_page");
        c474500IjALIZ.LJJII(str, "action");
        if (Intrinsics.LJFF(str, "click")) {
            c474500IjALIZ.LJJII(str2, "click_type");
        }
        c474500IjALIZ.LJJII(AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId(), "device_id");
        c474500IjALIZ.LIZ();
    }

    public static void LJJIIJ(boolean z, Integer num, Integer num2, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_screencasting_livestudio_connect_failed_show");
        c474500IjALIZ.LJIJJLI(null);
        c474500IjALIZ.LJJII(Long.valueOf(LIZIZ()), "anchor_id");
        c474500IjALIZ.LJJII(LiveMode.LIVE_STUDIO.logStreamingType, "live_type");
        c474500IjALIZ.LJJII(num, "error_code");
        c474500IjALIZ.LJJII(num2, "sub_code");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(num);
        sbLIZ.append('-');
        sbLIZ.append(num2);
        c474500IjALIZ.LJJII(C2188811AlT.LIZIZ(sbLIZ), "combin_code");
        c474500IjALIZ.LJJII(Boolean.valueOf(z), "is_wireless");
        c474500IjALIZ.LJJII(str, "msg");
        c474500IjALIZ.LIZ();
    }

    public static void LJIIJJI(long j, int i, Integer num, String str, int i2) {
        if ((i2 & 8) != 0) {
            num = null;
        }
        if ((i2 & 16) != 0) {
            str = null;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dual_device_tech_monitor");
        c474500IjALIZ.LJJII("screen_share", "device_type");
        c474500IjALIZ.LJJII(Long.valueOf(j), "room_id");
        c474500IjALIZ.LJJII(Long.valueOf(LIZIZ()), "user_id");
        c474500IjALIZ.LJJII("init_sdk", Scene.SCENE_SERVICE);
        c474500IjALIZ.LJJII(Integer.valueOf(i), "code");
        if (num != null) {
            c474500IjALIZ.LJJII(num, "extra_code");
        }
        if (str != null) {
            c474500IjALIZ.LJJII(str, "extra_msg");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LJIIL(long j, int i, int i2, Integer num, Float f) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dual_device_sink_params");
        c474500IjALIZ.LJJII(Long.valueOf(j), "room_id");
        c474500IjALIZ.LJJII(Long.valueOf(LIZIZ()), "user_id");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "video_w");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "video_h");
        if (num != null) {
            c474500IjALIZ.LJJII(Integer.valueOf(num.intValue()), "fps");
        }
        if (f != null) {
            c474500IjALIZ.LJJIFFI(Float.valueOf(f.floatValue()), "bit_rate_scale");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LJJIIZI(int i, int i2, int i3, String str, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_cast_permission_result");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "resultCode");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ.LJJII(str, "data");
        c474500IjALIZ.LJJII(Integer.valueOf(i3), "requestCode");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_wireless");
        c474500IjALIZ.LIZ();
    }

    public static void LJJIJ(C0TET c0tet, String str, String str2, String str3, String str4) {
        String str5;
        String str6;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_phone_camera_connect_status");
        c474500IjALIZ.LJJII(Long.valueOf(LIZ()), "anchor_id");
        c474500IjALIZ.LJJII(str2, "room_id");
        c474500IjALIZ.LJJII("live_studio", "live_type");
        C0TET c0tet2 = C0TET.WIRELESS;
        if (c0tet == c0tet2) {
            str5 = "wireless";
        } else {
            str5 = "wired";
        }
        c474500IjALIZ.LJJII(str5, "phone_camera_type");
        c474500IjALIZ.LJJII(str, FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ.LJJII(AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId(), "device_id");
        if (c0tet == c0tet2) {
            if (Intrinsics.LJFF(str3, "live_studio")) {
                str6 = "live_studio_takelive_page";
            } else if (Intrinsics.LJFF(str3, "screen_share")) {
                str6 = "screen_share_takelive_page";
            } else {
                str6 = "others";
            }
            c474500IjALIZ.LJJII(str6, "qr_scan_source");
        }
        if (Intrinsics.LJFF(str, "success")) {
            c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - LIZ), "connect_duration");
        }
        if (C041J.LIZ(str4)) {
            c474500IjALIZ.LJJII(str4, "fail_reason");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LJJIJIIJIL(C0TET c0tet, String str, String str2, String str3, String str4) {
        String str5;
        Long lLJIILIIL = C2095008Iq.LJIILIIL(str4);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_phone_camera_page_popup");
        c474500IjALIZ.LJJII(Long.valueOf(LIZ()), "anchor_id");
        c474500IjALIZ.LJJII(lLJIILIIL, "room_id");
        if (c0tet == C0TET.WIRELESS) {
            str5 = "wireless";
        } else {
            str5 = "wired";
        }
        c474500IjALIZ.LJJII(str5, "phone_camera_type");
        c474500IjALIZ.LJJII(str, "action");
        c474500IjALIZ.LJJII(str2, "popup_type");
        c474500IjALIZ.LJJII(AppLog.com_ss_android_common_applog_AppLog_com_ss_android_ugc_aweme_feed_lancet_AppLogLancet_getServerDeviceId(), "device_id");
        if (C041J.LIZ(str3)) {
            c474500IjALIZ.LJJII(str3, "click_type");
        }
        if (Intrinsics.LJFF(str, "click")) {
            c474500IjALIZ.LJJII(str3, "click_type");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LJI(int i, int i2, String str, String str2, String str3, boolean z) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dual_device_tech_monitor");
        c474500IjALIZ.LJJII("shoot", "device_type");
        c474500IjALIZ.LJJII(str, "room_id");
        c474500IjALIZ.LJJII(Long.valueOf(LIZIZ()), "user_id");
        c474500IjALIZ.LJJII(str2, Scene.SCENE_SERVICE);
        c474500IjALIZ.LJJII(Integer.valueOf(i), "code");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "extra_code");
        c474500IjALIZ.LJJII(str3, "extra_msg");
        c474500IjALIZ.LJJII(Boolean.valueOf(z), "is_in_background");
        c474500IjALIZ.LIZ();
    }

    public static void LJIIIIZZ(int i, long j, Long l, String str, String str2, String str3) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dual_device_rtc_error");
        c474500IjALIZ.LJJII(str, "device_type");
        c474500IjALIZ.LJJII(Long.valueOf(LIZIZ()), "anchor_id");
        c474500IjALIZ.LJJII(Long.valueOf(j), "room_id");
        c474500IjALIZ.LJJII(str2, Scene.SCENE_SERVICE);
        c474500IjALIZ.LJJII(Integer.valueOf(i), "code");
        if (l != null) {
            l.longValue();
            c474500IjALIZ.LJJII(l, "sub_code");
        }
        if (str3 != null) {
            c474500IjALIZ.LJJII(str3, "desc");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LJJI(int i, int i2, String str, String str2, boolean z, boolean z2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_cast_init_sdk");
        c474500IjALIZ.LJJII(str2, "e");
        c474500IjALIZ.LJJII(str, "errMsg");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "errCode");
        c474500IjALIZ.LJJII(Integer.valueOf(i), FollowStatusChangeMethod.PARAM_FOLLOW_STATUS);
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_casting");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z2)) ? 1 : 0), "is_wireless");
        c474500IjALIZ.LIZ();
    }

    public static void LJIILIIL(String str, String str2, String str3, String str4, boolean z, String str5, int i) {
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            str4 = null;
        }
        if ((i & 16) != 0) {
            z = false;
        }
        if ((i & 32) != 0) {
            str5 = null;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_dual_device_connected_show");
        c474500IjALIZ.LJJII(Long.valueOf(LIZIZ()), "anchor_id");
        c474500IjALIZ.LJJII(str, "room_id");
        c474500IjALIZ.LJJII(str2, "device_type");
        if (Intrinsics.LJFF(str2, "screen_share")) {
            if (str3 == null) {
                str3 = "embed";
            }
            c474500IjALIZ.LJJII(str3, "position_type");
            c474500IjALIZ.LJJII(str4, "source_page");
            c474500IjALIZ.LJJII(1, "is_rtc");
        } else if (Intrinsics.LJFF(str2, "shoot")) {
            if (z) {
                c474500IjALIZ.LJJII(1, "is_rtc");
            } else {
                c474500IjALIZ.LJJII(0, "is_rtc");
            }
        }
        if (GameDualDeviceInvitingSetting.INSTANCE.isExperiment() && str5 != null) {
            c474500IjALIZ.LJJII(str5, "connect_type");
        }
        c474500IjALIZ.LIZ();
    }
}
