package X;

import android.os.SystemClock;
import com.bytedance.android.live.interaction.drawguess.DrawGuessCorrectsRoundsChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundCountChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundIdChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessRoundStartTimeChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessSessionIdChannel;
import com.bytedance.android.live.interaction.drawguess.DrawGuessSessionStartTimeChannel;
import com.bytedance.android.live.liveinteract.api.IInteractService;
import com.bytedance.android.livesdk.interaction.drawguess.network.DrawGuessWord;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.util.HashMap;

/* JADX INFO: renamed from: X.0JFO, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JFO {
    public static String LIZ = "start";

    public static void LIZ(C474500IjA c474500IjA) {
        boolean z;
        String str;
        String str2;
        IInteractService iInteractService = (IInteractService) C1161920gLG.LIZJ(IInteractService.class);
        if (iInteractService.LJII() > 0) {
            z = true;
        } else {
            z = false;
        }
        c474500IjA.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_guest_connection");
        if (iInteractService.k81()) {
            str = "grid";
        } else if (iInteractService.LL2()) {
            str = "floating";
        } else {
            str = "normal_floating";
        }
        c474500IjA.LJJII(str, "layout_setting");
        if (iInteractService.ib2()) {
            str2 = "fixed";
        } else if (iInteractService.Kz()) {
            str2 = "unfixed";
        } else {
            str2 = "not_existed";
        }
        c474500IjA.LJJII(str2, "window_setting");
    }

    public static Long LJIIL(DataChannel dataChannel) {
        if (dataChannel != null) {
            return (Long) dataChannel.gg0(DrawGuessRoundIdChannel.class);
        }
        return null;
    }

    public static void LIZIZ(C474500IjA c474500IjA, DataChannel dataChannel) {
        Object objGg0;
        c474500IjA.LJIJJLI(dataChannel);
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(DrawGuessSessionIdChannel.class);
        } else {
            objGg0 = null;
        }
        c474500IjA.LJJII(objGg0, "pictionary_session_id");
        c474500IjA.LJJII(LJIIL(dataChannel), "pictionary_id");
    }

    public static void LIZJ(DataChannel dataChannel, String str) {
        long jLongValue;
        Long l;
        if (dataChannel != null && (l = (Long) dataChannel.gg0(DrawGuessRoundIdChannel.class)) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_pictionary_mode_exit_popup_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(jLongValue), "pictionary_id");
        c474500IjALIZ.LJJII(str, "selection");
        c474500IjALIZ.LIZ();
    }

    public static void LIZLLL(DataChannel dataChannel, String str) {
        Long l;
        int iIntValue;
        long jLongValue;
        Long l2;
        Integer num;
        if (dataChannel != null && (l = (Long) dataChannel.gg0(DrawGuessSessionIdChannel.class)) != null) {
            long jLongValue2 = l.longValue();
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_pictionary_end");
            c474500IjALIZ.LJIL();
            c474500IjALIZ.LJJII(Long.valueOf(jLongValue2), "pictionary_session_id");
            if (dataChannel != null && (num = (Integer) dataChannel.gg0(DrawGuessRoundCountChannel.class)) != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            c474500IjALIZ.LJJII(Integer.valueOf(iIntValue), "number_cnt");
            c474500IjALIZ.LJJII(str, "end_reason");
            LIZ(c474500IjALIZ);
            LJIIJJI(c474500IjALIZ, dataChannel);
            long jUptimeMillis = SystemClock.uptimeMillis();
            if (dataChannel != null && (l2 = (Long) dataChannel.gg0(DrawGuessSessionStartTimeChannel.class)) != null) {
                jLongValue = l2.longValue();
            } else {
                jLongValue = 0;
            }
            c474500IjALIZ.LJJII(Long.valueOf(jUptimeMillis - jLongValue), "duration");
            c474500IjALIZ.LIZ();
        }
    }

    public static void LJ(DataChannel dataChannel, boolean z) {
        long jLongValue;
        Object objGg0;
        int iIntValue;
        String str;
        HashMap map;
        Integer num;
        Long l;
        long jUptimeMillis = SystemClock.uptimeMillis();
        if (dataChannel != null && (l = (Long) dataChannel.gg0(DrawGuessSessionStartTimeChannel.class)) != null) {
            jLongValue = l.longValue();
        } else {
            jLongValue = 0;
        }
        long j = jUptimeMillis - jLongValue;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_audience_pictionary_end");
        c474500IjALIZ.LJIJJLI(dataChannel);
        if (dataChannel != null) {
            objGg0 = dataChannel.gg0(DrawGuessSessionIdChannel.class);
        } else {
            objGg0 = null;
        }
        c474500IjALIZ.LJJII(objGg0, "pictionary_session_id");
        LIZ(c474500IjALIZ);
        LJIIJJI(c474500IjALIZ, dataChannel);
        c474500IjALIZ.LJJII(Long.valueOf(Math.min(j, 120000L)), "duration");
        c474500IjALIZ.LJJII(Long.valueOf(Math.min(j, 120000L)), "time");
        int size = 0;
        if (dataChannel != null && (num = (Integer) dataChannel.gg0(DrawGuessRoundCountChannel.class)) != null) {
            iIntValue = num.intValue();
        } else {
            iIntValue = 0;
        }
        c474500IjALIZ.LJJII(Integer.valueOf(iIntValue), "number_cnt");
        if (dataChannel != null && (map = (HashMap) dataChannel.gg0(DrawGuessCorrectsRoundsChannel.class)) != null) {
            size = map.size();
        }
        c474500IjALIZ.LJJII(Integer.valueOf(size), "correct_cnt");
        if (z) {
            str = "1";
        } else {
            str = CardStruct.IStatusCode.DEFAULT;
        }
        c474500IjALIZ.LJJII(str, "before_end");
        c474500IjALIZ.LIZ();
    }

    public static void LJIIJJI(C474500IjA c474500IjA, DataChannel dataChannel) {
        String str;
        if (C0JFQ.LIZIZ(dataChannel)) {
            str = "freely";
        } else {
            str = "draw_and_guess";
        }
        c474500IjA.LJJII(str, "type");
    }

    public static void LJFF(DataChannel dataChannel, DrawGuessWord drawGuessWord, String str) {
        Long lValueOf;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_pictionary_change_word_click");
        LIZIZ(c474500IjALIZ, dataChannel);
        LIZ(c474500IjALIZ);
        String str2 = null;
        if (drawGuessWord != null) {
            lValueOf = Long.valueOf(drawGuessWord.id);
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "word_id");
        if (drawGuessWord != null) {
            str2 = drawGuessWord.word;
        }
        c474500IjALIZ.LJJII(str2, "word");
        c474500IjALIZ.LJJII(str, "enter_from");
        c474500IjALIZ.LIZ();
    }

    public static void LJIIIIZZ(DataChannel dataChannel, String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_pictionary_word_edit");
        c474500IjALIZ.LJIJJLI(dataChannel);
        LIZ(c474500IjALIZ);
        if (str == null) {
            str = "";
        }
        c474500IjALIZ.LJJII(str, "original_word");
        c474500IjALIZ.LJJII(str2, "enter_from");
        c474500IjALIZ.LIZ();
    }

    public static void LJIIIZ(DataChannel dataChannel, Long l, String str) {
        long jLongValue;
        if (dataChannel == null) {
            return;
        }
        HashMap map = (HashMap) dataChannel.gg0(DrawGuessRoundStartTimeChannel.class);
        if (map == null) {
            map = new HashMap();
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        Long l2 = (Long) map.get(LJIIL(dataChannel));
        if (l2 != null) {
            jLongValue = l2.longValue();
        } else {
            jLongValue = 0;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_pictionary_round_end");
        LIZIZ(c474500IjALIZ, dataChannel);
        c474500IjALIZ.LJJII(l, "correct_ucnt");
        c474500IjALIZ.LJJII(Long.valueOf(Math.min(jUptimeMillis - jLongValue, 120000L)), "time");
        c474500IjALIZ.LJJII(str, "end_reason");
        c474500IjALIZ.LIZ();
    }

    public static void LJIIJ(DataChannel dataChannel, String str, boolean z) {
        String str2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_pictionary_start_popup_click");
        c474500IjALIZ.LJIJJLI(dataChannel);
        if (z) {
            str2 = "confirm";
        } else {
            str2 = "cancel";
        }
        c474500IjALIZ.LJJII(str2, "selection");
        c474500IjALIZ.LJJII(str, "function_type");
        c474500IjALIZ.LIZ();
    }

    public static void LJI(DataChannel dataChannel, String str, String str2, boolean z) {
        LIZ = str;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_anchor_pictionary_click_start");
        c474500IjALIZ.LJIJJLI(dataChannel);
        LIZ(c474500IjALIZ);
        c474500IjALIZ.LJJII(str, "enter_from");
        c474500IjALIZ.LJJII(Integer.valueOf(C500260Jjc.LJJJI(Boolean.valueOf(z)) ? 1 : 0), "is_customized");
        c474500IjALIZ.LJJII(str2, "type");
        c474500IjALIZ.LIZ();
    }
}
