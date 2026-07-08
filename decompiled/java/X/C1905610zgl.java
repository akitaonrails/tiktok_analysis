package X;

import com.bytedance.android.livesdk.livesetting.LiveLogSampleConfigSetting;
import com.bytedance.android.livesdk.livesetting.other.ReportLiveBubbleDataSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.LiveBubbleData;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.LiveBubbleExtra;
import com.bytedance.android.livesdkapi.depend.model.live.bubble.LogPb;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import com.ss.android.ugc.aweme.feed.util.LiveBubbleUtil;

/* JADX INFO: renamed from: X.0zgl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1905610zgl {
    public static boolean LIZ;
    public static int LIZIZ;
    public static String LIZJ = "";
    public static long LIZLLL;
    public static String LJ;

    public static String LIZ() {
        if (LIZIZ <= 0) {
            return null;
        }
        return LIZ ? "1" : CardStruct.IStatusCode.DEFAULT;
    }

    public static void LIZJ() {
        Room room;
        Room room2;
        LogPb logPb;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_rec_toplive_bubble");
        LiveBubbleUtil.LIZ.getClass();
        LiveBubbleData liveBubbleData = LiveBubbleUtil.LJII;
        c474500IjALIZ.LJJII((liveBubbleData == null || !liveBubbleData.showHead) ? "icon" : "head", "live_bubble_mode");
        c474500IjALIZ.LJJII(LIZ(), "is_title_run");
        c474500IjALIZ.LJJII(LIZJ, "click_area");
        LiveBubbleExtra liveBubbleExtra = LiveBubbleUtil.LJIIIIZZ;
        Long lValueOf = null;
        c474500IjALIZ.LJJII((liveBubbleExtra == null || (logPb = liveBubbleExtra.getLogPb()) == null) ? null : logPb.imprId, "request_id");
        LiveBubbleData liveBubbleData2 = LiveBubbleUtil.LJII;
        c474500IjALIZ.LJJII((liveBubbleData2 == null || (room2 = liveBubbleData2.roomData) == null) ? null : Long.valueOf(room2.getId()), "room_id");
        LiveBubbleData liveBubbleData3 = LiveBubbleUtil.LJII;
        if (liveBubbleData3 != null && (room = liveBubbleData3.roomData) != null) {
            lValueOf = Long.valueOf(room.getOwnerUserId());
        }
        c474500IjALIZ.LJJII(lValueOf, "anchor_id");
        c474500IjALIZ.LIZ();
    }

    public static void LIZIZ(String str) {
        String str2;
        String str3;
        Long lValueOf;
        Room room;
        Room room2;
        LogPb logPb;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_toplive_bubble_avoid");
        LiveBubbleUtil.LIZ.getClass();
        LiveBubbleData liveBubbleData = LiveBubbleUtil.LJII;
        if (liveBubbleData != null && liveBubbleData.showHead) {
            str2 = "head";
        } else {
            str2 = "icon";
        }
        c474500IjALIZ.LJJII(str2, "live_bubble_mode");
        c474500IjALIZ.LJJII(LIZ(), "is_title_run");
        c474500IjALIZ.LJJII(str, "avoid_reason");
        c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - LIZLLL), "bubble_show_duration");
        LiveBubbleExtra liveBubbleExtra = LiveBubbleUtil.LJIIIIZZ;
        Long lValueOf2 = null;
        if (liveBubbleExtra != null && (logPb = liveBubbleExtra.getLogPb()) != null) {
            str3 = logPb.imprId;
        } else {
            str3 = null;
        }
        c474500IjALIZ.LJJII(str3, "request_id");
        LiveBubbleData liveBubbleData2 = LiveBubbleUtil.LJII;
        if (liveBubbleData2 != null && (room2 = liveBubbleData2.roomData) != null) {
            lValueOf = Long.valueOf(room2.getId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "room_id");
        LiveBubbleData liveBubbleData3 = LiveBubbleUtil.LJII;
        if (liveBubbleData3 != null && (room = liveBubbleData3.roomData) != null) {
            lValueOf2 = Long.valueOf(room.getOwnerUserId());
        }
        c474500IjALIZ.LJJII(lValueOf2, "anchor_id");
        c474500IjALIZ.LIZ();
    }

    public static void LIZLLL(String str) {
        if (!ReportLiveBubbleDataSetting.INSTANCE.getValue()) {
            return;
        }
        C474500IjA c474500IjALIZIZ = C0IJT.LIZIZ("livesdk_bubble_setting_avoid", Double.valueOf(LiveLogSampleConfigSetting.getSAMPLE_0()));
        c474500IjALIZIZ.LJJII(str, "avoid_reason");
        c474500IjALIZIZ.LIZ();
    }

    public static void LJ(String str) {
        Long lValueOf;
        Long lValueOf2;
        String str2;
        LogPb logPb;
        Room room;
        Room room2;
        C474500IjA c474500IjALIZ = C0IJT.LIZ(str);
        LiveBubbleUtil.LIZ.getClass();
        LiveBubbleData liveBubbleData = LiveBubbleUtil.LJII;
        String str3 = null;
        if (liveBubbleData != null && (room2 = liveBubbleData.roomData) != null) {
            lValueOf = Long.valueOf(room2.getId());
        } else {
            lValueOf = null;
        }
        c474500IjALIZ.LJJII(lValueOf, "room_id");
        LiveBubbleData liveBubbleData2 = LiveBubbleUtil.LJII;
        if (liveBubbleData2 != null && (room = liveBubbleData2.roomData) != null) {
            lValueOf2 = Long.valueOf(room.getOwnerUserId());
        } else {
            lValueOf2 = null;
        }
        c474500IjALIZ.LJJII(lValueOf2, "anchor_id");
        LiveBubbleData liveBubbleData3 = LiveBubbleUtil.LJII;
        if (liveBubbleData3 != null && liveBubbleData3.showHead) {
            str2 = "head";
        } else {
            str2 = "icon";
        }
        c474500IjALIZ.LJJII(str2, "live_bubble_mode");
        c474500IjALIZ.LJJII(LIZ(), "is_title_run");
        LiveBubbleExtra liveBubbleExtra = LiveBubbleUtil.LJIIIIZZ;
        if (liveBubbleExtra != null && (logPb = liveBubbleExtra.getLogPb()) != null) {
            str3 = logPb.imprId;
        }
        c474500IjALIZ.LJJII(str3, "request_id");
        c474500IjALIZ.LIZ();
    }

    public static void LJFF(String str) {
        C1143300frE.LJIIJJI().getClass();
        AbstractC1143290frD.LJI("ttlive_eventlog", str);
    }
}
