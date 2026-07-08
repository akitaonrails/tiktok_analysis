package X;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.SlardarSampleSetting;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdk.workaround.LiveInnerWatchEfficiencyLogSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.concurrent.CopyOnWriteArrayList;
import qo2.w;

/* JADX INFO: renamed from: X.0IEg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C463160IEg {
    public static final C463160IEg LIZ = new C463160IEg();
    public static long LIZIZ;
    public static long LIZJ;
    public static long LIZLLL;

    public static void LIZ(C0IIQ c0iiq) {
        String str;
        String guestRequestId;
        long j;
        EnterRoomConfig.RoomsData roomsData;
        if (SlardarSampleSetting.INSTANCE.isReport("livesdk_live_leave", 0.0d)) {
            if (TextUtils.isEmpty(c0iiq.reason)) {
                str = "draw";
            } else {
                str = c0iiq.reason;
            }
            if (C2093608Ic.LIZJ(str, "click") && c0iiq.detailReason == 2) {
                str = "click_exit_bubble";
            } else if (C2093608Ic.LIZJ(str, "click") && c0iiq.detailReason == 3) {
                str = "right_draw";
            }
            Room room = (Room) DataChannelGlobal.LLILZ.gg0(C930940aKi.class);
            if (room != null) {
                guestRequestId = room.getGuestRequestId();
            } else {
                guestRequestId = null;
            }
            if (room != null) {
                long id = room.getId();
                long ownerUserId = room.getOwnerUserId();
                EnterRoomConfig enterRoomConfig = C0IL2.LIZ.LIZ().mEnterRoomConfig;
                C0IEV.LIZ = SystemClock.elapsedRealtime();
                long j2 = -1;
                if (C0IEV.LIZIZ > 0) {
                    j = C0IEV.LIZ - C0IEV.LIZIZ;
                } else {
                    j = -1;
                }
                C0IEV.LJFF = j;
                if (C0IEV.LJI > 0) {
                    j2 = C0IEV.LIZ - C0IEV.LJI;
                }
                C0IEV.LJIIJ = j2;
                C0IEV.LJIIJJI = id;
                C0IEV.LJIIL = ownerUserId;
                C0IEV.LJIILIIL = c0iiq;
                String str2 = "";
                if (enterRoomConfig != null && (roomsData = enterRoomConfig.mRoomsData) != null) {
                    String str3 = roomsData.enterFromMerge;
                    if (str3 == null) {
                        str3 = "";
                    }
                    C0IEV.LJIILJJIL = str3;
                    String str4 = enterRoomConfig.mRoomsData.enterMethod;
                    if (str4 == null) {
                        str4 = "";
                    }
                    C0IEV.LJIILL = str4;
                    String str5 = enterRoomConfig.mRoomsData.actionType;
                    if (str5 != null) {
                        str2 = str5;
                    }
                    C0IEV.LJIILLIIL = str2;
                } else {
                    C0IEV.LJIILJJIL = "";
                    C0IEV.LJIILL = "";
                    C0IEV.LJIILLIIL = "";
                }
                C1107690evn c1107690evn = C464800IKo.LIZ;
                C463150IEf c463150IEf = C0IEV.LJIIZILJ;
                if (c463150IEf != null) {
                    ((CopyOnWriteArrayList) c1107690evn.LJIIIIZZ).remove(c463150IEf);
                    if (((CopyOnWriteArrayList) c1107690evn.LJIIIIZZ).isEmpty() && c1107690evn.LJIIIZ) {
                        C19322110iZ.LJII(c1107690evn.LJIIJ);
                        c1107690evn.LJIIIZ = false;
                    }
                } else {
                    c1107690evn.getClass();
                }
            }
            C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_leave");
            c474500IjALIZ.LJJII(str, "leave_type");
            c474500IjALIZ.LJJII(guestRequestId, "guest_request_id");
            w.LIZ.getClass();
            int i = w.LIZIZ;
            w.LIZIZ = 0;
            c474500IjALIZ.LJJII(Integer.valueOf(i), "duplicate_room_count");
            if (LiveInnerWatchEfficiencyLogSetting.INSTANCE.getValue()) {
                c474500IjALIZ.LJJII(Long.valueOf(System.currentTimeMillis() - LIZLLL), "session_stay_duration");
                c474500IjALIZ.LJJII(Long.valueOf(LIZIZ), "session_show_stream_duration");
                c474500IjALIZ.LJJII(Long.valueOf(LIZJ), "session_stoped_duration");
            }
            c474500IjALIZ.LJIIL();
            if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LIZ();
                return;
            }
            c474500IjALIZ.LJJIJLIJ();
            c474500IjALIZ.LJIIIIZZ();
            c474500IjALIZ.LJJII(w.LJIJI(), "request_id");
            c474500IjALIZ.LJJII(w.LIZLLL(), "action_type");
            c474500IjALIZ.LJJII(w.LJJII(), "video_id");
            c474500IjALIZ.LJJII(w.LJIIZILJ(), "log_pb");
            c474500IjALIZ.LJJIJL();
        }
    }

    public final synchronized void LIZIZ(long j) {
        LIZIZ += j;
    }
}
