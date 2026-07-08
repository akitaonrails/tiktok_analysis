package X;

import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicStateSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import java.util.Map;
import qo2.w;

/* JADX INFO: renamed from: X.01xz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C505301xz {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(int i, int i2, int i3, Throwable th) {
        String message;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("[Rsp:");
        sbLIZ.append(i2);
        sbLIZ.append("] change state ");
        sbLIZ.append(i);
        C2188811AlT.LIZIZ(sbLIZ);
        Map<String, Object> map = C1338270kvh.LIZ;
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("change_state_result", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_10()));
        c474500IjALIZIZ.LJJII(Integer.valueOf(i), "state_type");
        c474500IjALIZIZ.LJJII(Integer.valueOf(i2), "is_succeed");
        c474500IjALIZIZ.LJJII(Integer.valueOf(i3), "error_code");
        if (th == null || (message = th.getMessage()) == null) {
            message = "";
        }
        c474500IjALIZIZ.LJJII(message, "error_msg");
        c474500IjALIZIZ.LJJII(C921180a4y.LJIIJ(C915980Zwa.LJIIIIZZ()), "link_id");
        c474500IjALIZIZ.LJIL();
        c474500IjALIZIZ.LIZ();
    }

    public static void LIZIZ(long j, int i, String str, String str2, boolean z) {
        String str3;
        String str4;
        String str5;
        long jLIZ = C158B.LIZ() - j;
        if (!LinkMicStateSetting.INSTANCE.timeCostReport()) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("on ");
            if (z) {
                str5 = "IM";
            } else {
                str5 = "RTC";
            }
            sbLIZ.append(str5);
            sbLIZ.append("Message stat[]: from ");
            sbLIZ.append(str2);
            sbLIZ.append(", cost ");
            sbLIZ.append(jLIZ);
            C2188811AlT.LIZIZ(sbLIZ);
            Map<String, Object> map = C1338270kvh.LIZ;
            return;
        }
        if (z) {
            str3 = "livesdk_rtc_message_cost";
        } else {
            str3 = "livesdk_state_im_cost";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str3);
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    if (i != 6) {
                        if (i != 7) {
                            if (i != 9) {
                                str4 = "other";
                            } else {
                                str4 = "avatar_id";
                            }
                        } else {
                            str4 = "background_image";
                        }
                    } else {
                        str4 = "network_state";
                    }
                } else {
                    str4 = "video_mute";
                }
            } else {
                str4 = "audio_mute";
            }
        } else {
            str4 = "online_user_state";
        }
        c474500IjALIZ.LJJII(str4, "message_type");
        c474500IjALIZ.LJJII(str, "channel_id");
        if (str2 != null && str2.length() != 0) {
            c474500IjALIZ.LJJII(str2, "message_direction");
        }
        c474500IjALIZ.LJJII(Long.valueOf(jLIZ), "message_cost");
        if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LIZ();
        } else {
            c474500IjALIZ.LJJIJLIJ();
            w.LIZ.getClass();
            c474500IjALIZ.LJJII(Long.valueOf(w.LJIJJ()), "room_id");
            c474500IjALIZ.LJJIJL();
        }
    }
}
