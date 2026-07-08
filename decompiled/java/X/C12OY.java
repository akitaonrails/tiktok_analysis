package X;

import com.bytedance.android.livesdk.dataChannel.BroadcastNetworkStatusChannel;
import com.bytedance.android.livesdk.dataChannel.BroadcastTemperStatusChannel;
import com.bytedance.android.livesdk.dataChannel.LiveModeChannel;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterMockToolSwitch;
import com.bytedance.android.livesdkapi.depend.model.live.LiveMode;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.tts.oecverify.BdTuring;
import java.util.Map;
import kotlin.Pair;
import kotlin.jvm.internal.AwS63S0001000_28;
import kotlin.jvm.internal.AwS88S1000000_3;
import kotlin.jvm.internal.Intrinsics;
import tikcast.api.boost.Card;
import webcast.data.RealtimeLiveCenterTips;

/* JADX INFO: renamed from: X.12OY, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12OY {
    public static boolean LIZIZ;
    public static long LIZLLL;
    public static final C12OY LIZ = new C12OY();
    public static String LIZJ = "";

    public static String LJFF(int i) {
        return i != -1 ? i != 2 ? i != 3 ? "normal" : "noconnection" : "unstable" : "unknown";
    }

    public static String LIZLLL(DataChannel dataChannel) {
        Pair pair;
        if (dataChannel != null && (pair = (Pair) dataChannel.gg0(BroadcastTemperStatusChannel.class)) != null) {
            int iIntValue = ((Number) pair.getFirst()).intValue();
            if (iIntValue != -1) {
                if (iIntValue != 1) {
                    if (iIntValue == 2) {
                        return "critical";
                    }
                    return "normal";
                }
                return "serious";
            }
            return "unknown";
        }
        return "normal";
    }

    public static String LJ(C12OE c12oe) {
        switch (C12OF.LIZ[c12oe.ordinal()]) {
            case 1:
                return "violation";
            case 2:
                return LiveCenterMockToolSwitch.FLARE;
            case 3:
                return "coldstart";
            case 4:
                return "growthjourney";
            case 5:
                return "decoupling";
            case 6:
                return "";
            case 7:
                return "whitebox";
            case 8:
                return "service_plus_challenge";
            case BdTuring.TYPE_ECAF /* 9 */:
                return "preview_viewer_trigger";
            default:
                return "normal";
        }
    }

    public static String LJI(DataChannel dataChannel) {
        int iIntValue;
        Pair pair;
        if (dataChannel != null && (pair = (Pair) dataChannel.gg0(BroadcastNetworkStatusChannel.class)) != null) {
            iIntValue = ((Number) pair.getFirst()).intValue();
        } else {
            iIntValue = 1;
        }
        return LJFF(iIntValue);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0030 A[PHI: r2
      0x0030: PHI (r2v1 int) = (r2v0 int), (r2v4 int) binds: [B:16:0x002d, B:8:0x0017] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C19416710xp LJIIIIZZ(com.bytedance.ies.sdk.datachannel.DataChannel r4) {
        /*
            r3 = 0
            if (r4 == 0) goto L2c
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.BroadcastNetworkV3StatusChannel> r0 = com.bytedance.android.livesdk.dataChannel.BroadcastNetworkV3StatusChannel.class
            java.lang.Object r0 = r4.gg0(r0)
            X.0IPE r0 = (X.C0IPE) r0
            if (r0 == 0) goto L2c
            int r2 = r0.LIZ
        Lf:
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.BroadcastAudioStatusChannel> r0 = com.bytedance.android.livesdk.dataChannel.BroadcastAudioStatusChannel.class
            java.lang.Object r0 = r4.gg0(r0)
            X.0IPD r0 = (X.C0IPD) r0
            if (r0 == 0) goto L30
            int r1 = r0.LIZ
        L1b:
            java.lang.Class<com.bytedance.android.livesdk.dataChannel.BroadcastPerformanceStatusChannel> r0 = com.bytedance.android.livesdk.dataChannel.BroadcastPerformanceStatusChannel.class
            java.lang.Object r0 = r4.gg0(r0)
            X.0IPF r0 = (X.C0IPF) r0
            if (r0 == 0) goto L27
            int r3 = r0.LIZ
        L27:
            X.10xp r0 = LJII(r2, r1, r3)
            return r0
        L2c:
            r2 = 0
            if (r4 == 0) goto L30
            goto Lf
        L30:
            r1 = 0
            if (r4 == 0) goto L27
            goto L1b
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C12OY.LJIIIIZZ(com.bytedance.ies.sdk.datachannel.DataChannel):X.10xp");
    }

    public static String LJIJJLI(Integer num) {
        if (num != null) {
            if (num.intValue() == 1) {
                return "1";
            }
            if (num.intValue() == 3) {
                return "2";
            }
            if (num.intValue() == 4) {
                return "3";
            }
            return "";
        }
        return "";
    }

    public static void LIZ(C474500IjA c474500IjA, C0IP6 c0ip6) {
        c474500IjA.LJJII(c0ip6.LIZ, "network_suggestion");
        c474500IjA.LJJII(c0ip6.LIZIZ, "audio_suggestion");
        c474500IjA.LJJII(c0ip6.LIZJ, "performance_suggestion");
    }

    public static String LIZJ(int i, EnumC466180IPw enumC466180IPw) {
        int i2 = C12OF.LIZIZ[enumC466180IPw.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    if (i == 0 || i != 2) {
                        return "green";
                    }
                    return "red";
                }
                throw new C1954807lC();
            }
            if (i == 0) {
                return "green";
            }
            if (i != 1) {
                if (i != 2) {
                    return "green";
                }
                return "red";
            }
            return "yellow";
        }
        if (i == 0) {
            return "green";
        }
        if (i != 1) {
            if (i != 2 && i != 3) {
                return "green";
            }
            return "red";
        }
        return "yellow";
    }

    public static void LJIIIZ(C474500IjA c474500IjA, Card card) {
        if (card != null) {
            c474500IjA.LJJII(card.id, "card_id");
            c474500IjA.LJJII(card.taskId, "task_id");
            c474500IjA.LJJII(Integer.valueOf(card.taskSource), "task_source");
            c474500IjA.LJJII(Long.valueOf(card.goal), "boost_level");
            c474500IjA.LJJII(Integer.valueOf(card.goalTier), "tier_level");
        }
        c474500IjA.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(C494680Jac.LJIILIIL())) ? 1 : 0), "is_subscriber_only_live");
    }

    public static void LIZIZ(C474500IjA c474500IjA, C19416710xp c19416710xp, boolean z) {
        c474500IjA.LJJII(Integer.valueOf(c19416710xp.LIZIZ), "network_status");
        c474500IjA.LJJII(Integer.valueOf(c19416710xp.LIZJ), "audio_status");
        c474500IjA.LJJII(Integer.valueOf(c19416710xp.LIZLLL), "performance_status");
        if (z) {
            c474500IjA.LJJII(c19416710xp.LIZ, "status_color");
        }
    }

    public static C19416710xp LJII(int i, int i2, int i3) {
        String strLIZJ = LIZJ(i, EnumC466180IPw.NETWORK);
        String strLIZJ2 = LIZJ(i2, EnumC466180IPw.AUDIO);
        String strLIZJ3 = LIZJ(i3, EnumC466180IPw.PERFORMANCE);
        String str = "red";
        if (!Intrinsics.LJFF(strLIZJ, "red") && !Intrinsics.LJFF(strLIZJ2, "red") && !Intrinsics.LJFF(strLIZJ3, "red")) {
            str = "yellow";
            if (!Intrinsics.LJFF(strLIZJ, "yellow") && !Intrinsics.LJFF(strLIZJ2, "yellow") && !Intrinsics.LJFF(strLIZJ3, "yellow")) {
                str = "green";
            }
        }
        return new C19416710xp(str, i, i2, i3);
    }

    public static void LJIIZILJ(DataChannel dataChannel, String str, String str2) {
        String str3;
        if (Intrinsics.LJFF(str2, "show")) {
            str3 = "livesdk_live_center_icon_show_frame_check";
        } else {
            str3 = "livesdk_live_center_icon_click_frame_check";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str3);
        c474500IjALIZ.LJIJJLI(dataChannel);
        if (C1152720g6Q.LIZ()) {
            C19416710xp c19416710xpLJIIIIZZ = LJIIIIZZ(dataChannel);
            if (Intrinsics.LJFF(str2, "show")) {
                LIZIZ(c474500IjALIZ, c19416710xpLJIIIIZZ, true);
            } else {
                c474500IjALIZ.LJJII(c19416710xpLJIIIIZZ.LIZ, "status_color");
            }
        }
        c474500IjALIZ.LJJII("anchor", "user_type");
        c474500IjALIZ.LJJII(str, "icon_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJIJJ(long j, DataChannel dataChannel, RealtimeLiveCenterTips realtimeLiveCenterTips) {
        String str;
        String str2;
        String str3;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_realtime_live_center_tip_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        String str4 = "";
        if (realtimeLiveCenterTips == null || (str = realtimeLiveCenterTips.tipsStarlingKey) == null) {
            str = "";
        }
        c474500IjALIZ.LJJII(str, "tip_id");
        if (realtimeLiveCenterTips == null || (str2 = realtimeLiveCenterTips.typeEventTrack) == null) {
            str2 = "";
        }
        c474500IjALIZ.LJJII(str2, "tip_type_new");
        if (realtimeLiveCenterTips != null && (str3 = realtimeLiveCenterTips.buttonEventTrack) != null) {
            str4 = str3;
        }
        c474500IjALIZ.LJJII(str4, "action_type");
        c474500IjALIZ.LJJIIZ(Long.valueOf(j), "refresh_time", new C19747612Oc(j));
        c474500IjALIZ.LJJIJL();
    }

    public final void LJIIJJI(DataChannel dataChannel, Card card, String str) {
        LJIILLIIL(this, dataChannel, "flare_cards", "click", null, 0, null, null, 120);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_boost_card_confirm_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        LJIIIZ(c474500IjALIZ, card);
        c474500IjALIZ.LJJII(str, "click_button");
        c474500IjALIZ.LIZ();
    }

    public static void LJIILL(long j, DataChannel dataChannel, String str, String str2) {
        String str3;
        LiveMode liveMode;
        if (dataChannel == null || (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) == null || (str3 = liveMode.logStreamingType) == null) {
            str3 = "";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_realtime_live_center_leave");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str, "enter_type");
        c474500IjALIZ.LJJII(str2, "leave_type");
        c474500IjALIZ.LJJII(str3, "live_type");
        c474500IjALIZ.LJJII(Long.valueOf(j), "duration");
        c474500IjALIZ.LIZ();
        LIZIZ = false;
        LIZJ = "";
        LIZLLL = 0L;
    }

    public static void LJIJ(DataChannel dataChannel, C12OE c12oe, int i, String str) {
        LJIIZILJ(dataChannel, LJ(c12oe), str);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_center_icon");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJ(str);
        c474500IjALIZ.LJJII("normal", "restriction_status");
        c474500IjALIZ.LJJII(0, "restriction_number");
        c474500IjALIZ.LJJII(LJ(c12oe), "icon_type");
        c474500IjALIZ.LJJII(LIZLLL(dataChannel), "heat_status");
        c474500IjALIZ.LJJII(LJI(dataChannel), "network_status");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "coldstart_viewer_cnt");
        c474500IjALIZ.LIZ();
    }

    public static void LJIJI(DataChannel dataChannel, C12OE c12oe, int i, int i2) {
        String str;
        byte b = 0;
        if ((i2 & 4) != 0) {
            b = -1;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        if ((i2 & 32) != 0) {
            str = "show";
        } else {
            str = null;
        }
        LJIIZILJ(dataChannel, LJ(c12oe), str);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_center_icon");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJ(str);
        String str2 = "normal";
        c474500IjALIZ.LJJII("normal", "restriction_status");
        c474500IjALIZ.LJJII(0, "restriction_number");
        c474500IjALIZ.LJJII(LJ(c12oe), "icon_type");
        if (b == -1) {
            str2 = "unknown";
        }
        c474500IjALIZ.LJJII(str2, "heat_status");
        c474500IjALIZ.LJJII(LJFF(i), "network_status");
        c474500IjALIZ.LJJII(0, "coldstart_viewer_cnt");
        c474500IjALIZ.LIZ();
    }

    public static void LJIIJ(DataChannel dataChannel, C12OE c12oe, int i, String str, long j) {
        LJIIZILJ(dataChannel, LJ(c12oe), "show");
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_center_icon");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJ("show");
        c474500IjALIZ.LJJII("normal", "restriction_status");
        c474500IjALIZ.LJJII(0, "restriction_number");
        c474500IjALIZ.LJJII(LJ(c12oe), "icon_type");
        c474500IjALIZ.LJJII(LJFF(i), "network_status");
        c474500IjALIZ.LJJII(str, "growthjourney_type");
        c474500IjALIZ.LJJII(Long.valueOf(j), "growth_stage");
        c474500IjALIZ.LIZ();
    }

    public static void LJIILJJIL(DataChannel dataChannel, C12OE c12oe, Map map, String str, int i) {
        LJIIZILJ(dataChannel, LJ(c12oe), str);
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_center_icon");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJ(str);
        c474500IjALIZ.LJJII("normal", "restriction_status");
        c474500IjALIZ.LJJII(0, "restriction_number");
        c474500IjALIZ.LJJII(LJ(c12oe), "icon_type");
        c474500IjALIZ.LJJII(LIZLLL(dataChannel), "heat_status");
        c474500IjALIZ.LJJII(LJI(dataChannel), "network_status");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "coldstart_viewer_cnt");
        for (Map.Entry entry : map.entrySet()) {
            c474500IjALIZ.LJJII(entry.getValue(), (String) entry.getKey());
        }
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r7v1, types: [int] */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    public static void LJIILIIL(DataChannel dataChannel, String str, String str2, String str3, boolean z, int i) {
        if ((i & 8) != 0) {
            str3 = "";
        }
        ?? r7 = z;
        if ((i & 16) != 0) {
            r7 = 0;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_manager_cues_msg_show");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str, "msg_id");
        c474500IjALIZ.LJJII(str2, "suggestion_template_id");
        c474500IjALIZ.LJJII(Integer.valueOf((int) r7), "is_button");
        if (str3.length() > 0) {
            c474500IjALIZ.LJJII(str3, "msg_type");
        }
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1, types: [int] */
    /* JADX WARN: Type inference failed for: r10v2 */
    /* JADX WARN: Type inference failed for: r10v3 */
    public static void LJIIL(DataChannel dataChannel, String str, String str2, long j, String str3, String str4, boolean z, int i) {
        if ((i & 32) != 0) {
            str4 = "";
        }
        ?? r10 = z;
        if ((i & 64) != 0) {
            r10 = 0;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_manager_cues_msg_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str, "msg_id");
        c474500IjALIZ.LJJII(str2, "action_type");
        c474500IjALIZ.LJJII(Long.valueOf(j / 1000), "show_duration");
        c474500IjALIZ.LJJII(str3, "suggestion_template_id");
        c474500IjALIZ.LJJII(Integer.valueOf((int) r10), "is_button");
        if (str4.length() > 0) {
            c474500IjALIZ.LJJII(str4, "msg_type");
        }
        c474500IjALIZ.LIZ();
    }

    public static void LJIILLIIL(C12OY c12oy, DataChannel dataChannel, String str, String str2, String str3, int i, String str4, Map map, int i2) {
        LiveMode liveMode;
        String str5;
        String str6 = "";
        if ((i2 & 8) != 0) {
            str3 = "";
        }
        if ((i2 & 16) != 0) {
            i = -1;
        }
        if ((i2 & 32) != 0) {
            str4 = "";
        }
        if ((i2 & 64) != 0) {
            map = null;
        }
        c12oy.getClass();
        if (dataChannel != null && (liveMode = (LiveMode) dataChannel.gg0(LiveModeChannel.class)) != null && (str5 = liveMode.logStreamingType) != null) {
            str6 = str5;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_realtime_live_center_module");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(str, "module_name");
        c474500IjALIZ.LJJII(str6, "live_type");
        c474500IjALIZ.LJJII(str2, "action_type");
        c474500IjALIZ.LJJIIZ(Integer.valueOf(i - 1), "module_position", new AwS63S0001000_28(i, 2));
        c474500IjALIZ.LJJIIZ(str4, "click_position", new AwS88S1000000_3(str4, 15));
        c474500IjALIZ.LJJIIZ(str3, "msg_id", new AwS88S1000000_3(str3, 16));
        c474500IjALIZ.LJJIIZI(map);
        if (C1152720g6Q.LIZ()) {
            LIZIZ(c474500IjALIZ, LJIIIIZZ(dataChannel), true);
        }
        c474500IjALIZ.LIZ();
    }
}
