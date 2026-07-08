package X;

import com.bytedance.android.livesdk.comp.api.game.partnership.PartnershipEnterRoomPromotingTaskChannel;
import com.bytedance.android.livesdk.comp.api.game.service.IGamePartnershipService;
import com.bytedance.android.livesdk.game.model.BriefCreatorCode;
import com.bytedance.android.livesdk.game.model.BriefGameTask;
import com.bytedance.android.livesdk.game.model.PartnershipTask;
import com.bytedance.android.livesdk.game.model.TaskAttributionInfo;
import com.bytedance.android.livesdk.userservice.UserService;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import com.ss.android.ugc.aweme.localservice.passthrough.settings.LSPassThroughRecordSizeConfig;
import java.net.URLDecoder;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONObject;
import qo2.w;

/* JADX INFO: renamed from: X.0yyo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1878360yyo {
    public static BriefGameTask LIZIZ;
    public static long LIZ = -1;
    public static String LIZJ = "";

    public static boolean LIZ(BriefGameTask briefGameTask) {
        PartnershipTask partnershipTask;
        TaskAttributionInfo taskAttributionInfo;
        String str;
        if (briefGameTask != null && (partnershipTask = briefGameTask.task) != null && (taskAttributionInfo = partnershipTask.attributionInfo) != null && taskAttributionInfo.viewReportScene != 0 && (str = taskAttributionInfo.viewThroughUrl) != null && str.length() > 0) {
            return true;
        }
        return false;
    }

    public static String LIZIZ(Integer num) {
        if (num != null) {
            if (num.intValue() != 0 && num.intValue() != 1) {
                if (num.intValue() == 2) {
                    return "benefit";
                }
                if (num.intValue() == 3) {
                    return "discount";
                }
                return "";
            }
            return "non";
        }
        return "";
    }

    public static void LJFF(DataChannel dataChannel) {
        String str;
        String strLIZIZ;
        String str2;
        Long l;
        PartnershipTask partnershipTask;
        BriefCreatorCode briefCreatorCode;
        String str3;
        Integer numValueOf;
        BriefCreatorCode briefCreatorCode2;
        BriefCreatorCode briefCreatorCode3;
        if (dataChannel == null || LIZ < 0) {
            return;
        }
        long jCurrentTimeMillis = (System.currentTimeMillis() - LIZ) / ((long) LSPassThroughRecordSizeConfig.DEFAULT);
        LIZ = -1L;
        BriefGameTask briefGameTask = (BriefGameTask) dataChannel.gg0(C168J.class);
        String str4 = null;
        if (briefGameTask != null && (briefCreatorCode3 = briefGameTask.creatorCode) != null) {
            str = briefCreatorCode3.creatorCode;
        } else {
            str = null;
        }
        int i = 0;
        if (str != null && str.length() != 0 && briefGameTask != null && (briefCreatorCode = briefGameTask.creatorCode) != null && (str3 = briefCreatorCode.activityId) != null && str3.length() != 0) {
            if (briefGameTask != null && (briefCreatorCode2 = briefGameTask.creatorCode) != null) {
                numValueOf = Integer.valueOf(briefCreatorCode2.rewardType);
            } else {
                numValueOf = null;
            }
            strLIZIZ = LIZIZ(numValueOf);
            i = 1;
        } else {
            strLIZIZ = "";
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_gamepad_btn_duration");
        c474500IjALIZ.LJIJJLI(dataChannel);
        if (C0IXW.LIZLLL(dataChannel)) {
            str2 = "ad";
        } else {
            str2 = "normal";
        }
        c474500IjALIZ.LJJII(str2, "live_traffic_source");
        c474500IjALIZ.LJJII("live_detail", "page_name");
        c474500IjALIZ.LJJII("icon", "btn_name");
        c474500IjALIZ.LJJII(Long.valueOf(jCurrentTimeMillis), "duration");
        BriefGameTask briefGameTask2 = LIZIZ;
        if (briefGameTask2 != null && (partnershipTask = briefGameTask2.task) != null) {
            l = partnershipTask.gameId;
        } else {
            l = null;
        }
        c474500IjALIZ.LJJII(String.valueOf(l), "game_id");
        c474500IjALIZ.LJJII("user", "user_type");
        c474500IjALIZ.LJJII(String.valueOf(UserService.getInstance().user().getCurrentUserId()), "user_id");
        w.LIZ.getClass();
        c474500IjALIZ.LJJII(String.valueOf(w.LJ()), "host_id");
        c474500IjALIZ.LJJII(String.valueOf(w.LJIJJ()), "content_id");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_creator_code");
        c474500IjALIZ.LJJII(strLIZIZ, "creator_code_type");
        try {
            BriefGameTask briefGameTask3 = LIZIZ;
            if (briefGameTask3 != null) {
                str4 = briefGameTask3.logExtra;
            }
            c474500IjALIZ.LJJIIJZLJL(new JSONObject(URLDecoder.decode(String.valueOf(str4), "UTF-8")));
            C189200o6.m2constructorimpl(c474500IjALIZ);
        } catch (Throwable th) {
            TryCatchGuardChecker.doCheck(th);
            C189200o6.m2constructorimpl(new C098200Yq(th));
        }
        c474500IjALIZ.LIZ();
    }

    public static void LIZJ(Room room, DataChannel dataChannel) {
        if (room != null) {
            room.getId();
        }
        if (!C01SL.LIZ(room)) {
            return;
        }
        if (dataChannel != null) {
            dataChannel.zW(PartnershipEnterRoomPromotingTaskChannel.class, new C1869800yl0(0));
            dataChannel.SX0(C1085170eLT.class, Boolean.FALSE);
            dataChannel.SX0(C1083550eIr.class, Boolean.FALSE);
            dataChannel.SX0(C1084060eJg.class, Boolean.FALSE);
        }
        ((IGamePartnershipService) C1161920gLG.LIZJ(IGamePartnershipService.class)).s40(room);
        if (dataChannel != null) {
            LJFF(dataChannel);
        }
        LIZ = -1L;
        LIZIZ = null;
        LIZJ = "";
    }

    public static void LIZLLL(String str, String str2) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("ttlive_drops_card_change_event");
        c474500IjALIZ.LJJII(str, "action");
        c474500IjALIZ.LJJII(str2, "load_from");
        c474500IjALIZ.LIZ();
    }

    public static void LJI(Boolean bool, String str, String str2, Boolean bool2, Boolean bool3) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_partnership_gecko_check");
        c474500IjALIZ.LJJII(str, "channel");
        Boolean bool4 = Boolean.TRUE;
        c474500IjALIZ.LJJII(Integer.valueOf(Intrinsics.LJFF(bool, bool4) ? 1 : 0), "succeed");
        c474500IjALIZ.LJJII(Integer.valueOf(Intrinsics.LJFF(bool2, bool4) ? 1 : 0), "is_anchor");
        c474500IjALIZ.LJJII(str2, "error_msg");
        c474500IjALIZ.LJJII(bool3, "gecko_exist");
        c474500IjALIZ.LIZ();
    }

    public static void LJII(String str, Boolean bool, Boolean bool2, String str2, Map map) {
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_pre_download_game_intro_card");
        c474500IjALIZ.LJJII(str, "channel");
        c474500IjALIZ.LJJII(bool, "succeed");
        c474500IjALIZ.LJJII(bool2, "cache");
        c474500IjALIZ.LJJII(str2, "from");
        c474500IjALIZ.LJJIIZI(map);
        c474500IjALIZ.LIZ();
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void LJ(final boolean r10, webcast.api.partnership.AudienceRoomInfoResponse.ResponseData r11, com.bytedance.ies.sdk.datachannel.DataChannel r12, long r13, java.lang.Throwable r15, int r16) {
        /*
            r5 = r13
            r7 = r12
            r9 = r11
            r0 = r16 & 2
            r8 = 0
            if (r0 == 0) goto L9
            r9 = r8
        L9:
            r0 = r16 & 4
            if (r0 == 0) goto Le
            r7 = r8
        Le:
            r0 = r16 & 8
            r3 = 0
            if (r0 == 0) goto L16
            r5 = 0
        L16:
            r0 = r16 & 16
            if (r0 != 0) goto L1b
            r8 = r15
        L1b:
            if (r10 == 0) goto L2f
            if (r9 == 0) goto L3c
            webcast.api.partnership.AudienceRoomInfoResponse$PartnershipInfo r0 = r9.partnershipInfo
            if (r0 == 0) goto L3c
            long r1 = r0.cpsClickId
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 == 0) goto L3c
            java.lang.String r0 = java.lang.String.valueOf(r1)
        L2d:
            X.C1878360yyo.LIZJ = r0
        L2f:
            java.util.concurrent.ExecutorService r0 = X.C823050WQl.LIZIZ()
            X.0yl1 r4 = new X.0yl1
            r4.<init>()
            r0.submit(r4)
            return
        L3c:
            java.lang.String r0 = ""
            goto L2d
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1878360yyo.LJ(boolean, webcast.api.partnership.AudienceRoomInfoResponse$ResponseData, com.bytedance.ies.sdk.datachannel.DataChannel, long, java.lang.Throwable, int):void");
    }
}
