package X;

import com.bytedance.android.livesdk.model.message.PunishEventInfo;
import kotlin.jvm.internal.AFwS199S0000000_12;
import qo2.w;

/* JADX INFO: renamed from: X.0UhH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C779090UhH {
    public static final C01GW LIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(254));
    public static final C01GW LIZIZ = C452501pT.LIZIZ(AFwS199S0000000_12.get$arr$(253));

    public static void LIZIZ(String str, PunishEventInfo punishEventInfo) {
        if (punishEventInfo == null) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_violation_toast_floating");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII("screen_share", "live_type");
        String str2 = punishEventInfo.punishId;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        c474500IjALIZ.LJJII(str2, "record_id");
        c474500IjALIZ.LJJII(str, "action_type");
        c474500IjALIZ.LJJII(Long.valueOf(punishEventInfo.violationUid), "violation_anchor_id");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(Long.valueOf(w.LJIJJ()), "room_id");
        String str4 = punishEventInfo.punishType;
        if (str4 == null) {
            str4 = "";
        }
        c474500IjALIZ.LJJII(str4, "violation_type");
        Object obj = punishEventInfo.duration;
        if (obj == null) {
            obj = "";
        }
        c474500IjALIZ.LJJII(obj.toString(), "period");
        String str5 = punishEventInfo.punishReason;
        if (str5 != null) {
            str3 = str5;
        }
        c474500IjALIZ.LJJII(str3, "violation_reason");
        c474500IjALIZ.LIZ();
    }

    public static void LIZ(int i, int i2, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_floating_ball_show");
        c474500IjALIZ.LJJII(Long.valueOf(((Number) LIZ.getValue()).longValue()), "room_id");
        c474500IjALIZ.LJJII(LIZIZ.getValue(), "anchor_id");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "error_code");
        c474500IjALIZ.LJJII(str, "error_msg");
        c474500IjALIZ.LJJII(Integer.valueOf(i2), "is_exceed_screen");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(long j, long j2, String str) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_warning_no_rec_anchor_pop");
        c474500IjALIZ.LJIL();
        c474500IjALIZ.LJJII("screen_share", "live_type");
        c474500IjALIZ.LJJII(Long.valueOf(j2), "room_id");
        c474500IjALIZ.LJJII(Long.valueOf(j), "anchor_id");
        c474500IjALIZ.LJJII("hover", "event_page");
        c474500IjALIZ.LJJII(str, "warning_type");
        c474500IjALIZ.LIZ();
    }
}
