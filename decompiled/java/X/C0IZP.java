package X;

import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.live.programmedlive.IProgrammedLiveService;
import com.bytedance.android.livesdk.livesetting.performance.BuriedFieldReductionSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import kotlin.jvm.internal.Intrinsics;
import qo2.w;

/* JADX INFO: renamed from: X.0IZP, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IZP {
    public static EnterRoomConfig LIZ;

    public static long LIZ() {
        EnterRoomConfig enterRoomConfig;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig.TimeStamp timeStamp;
        EnterRoomLinkSession enterRoomLinkSessionLIZ = C0IL2.LIZ.LIZ();
        if (enterRoomLinkSessionLIZ == null || (enterRoomConfig = enterRoomLinkSessionLIZ.mEnterRoomConfig) == null || (roomsData = enterRoomConfig.mRoomsData) == null || (timeStamp = roomsData.timeStamps) == null) {
            return -1L;
        }
        return timeStamp.enterRoomStarTimeReal;
    }

    public static String LIZIZ() {
        IProgrammedLiveService iProgrammedLiveService = (IProgrammedLiveService) C1161920gLG.LIZJ(IProgrammedLiveService.class);
        Boolean boolValueOf = iProgrammedLiveService != null ? Boolean.valueOf(iProgrammedLiveService.lm1()) : null;
        IMicRoomService iMicRoomService = (IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class);
        Boolean boolValueOf2 = iMicRoomService != null ? Boolean.valueOf(iMicRoomService.On1()) : null;
        Boolean bool = Boolean.TRUE;
        return Intrinsics.LJFF(boolValueOf, bool) ? "programmedlive" : Intrinsics.LJFF(boolValueOf2, bool) ? "lineup" : "normal";
    }

    public static final void LIZJ(final Room room, final String str) {
        final String str2;
        EnterRoomConfig.RoomsData roomsData;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        w.LIZ.getClass();
        final String strLJIIIZ = w.LJIIIZ();
        final String strLJIIL = w.LJIIL();
        EnterRoomConfig enterRoomConfig = LIZ;
        if (enterRoomConfig != null && (roomsData = enterRoomConfig.mRoomsData) != null) {
            str2 = roomsData.enterType;
        } else {
            str2 = null;
        }
        final String strLIZIZ = LIZIZ();
        C783270Uo1.LIZLLL(new Runnable() { // from class: X.0IZO
            public final void LIZ() {
                String str3 = str;
                Room room2 = room;
                long j = jCurrentTimeMillis;
                String str4 = strLJIIIZ;
                String str5 = strLJIIL;
                String str6 = str2;
                String str7 = strLIZIZ;
                long jLIZ = C0IZP.LIZ();
                if (jLIZ <= 0 || room2 == null) {
                    return;
                }
                long j2 = j - jLIZ;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_frame_load_duration");
                c474500IjALIZ.LJJII(Long.valueOf(room2.getId()), "room_id");
                InterfaceC2262081DgM interfaceC2262081DgMAuthor = room2.author();
                c474500IjALIZ.LJJII(interfaceC2262081DgMAuthor != null ? Long.valueOf(interfaceC2262081DgMAuthor.getId()) : null, "anchor_id");
                c474500IjALIZ.LJJII(str4, "enter_from_merge");
                c474500IjALIZ.LJJII(str5, "enter_method");
                c474500IjALIZ.LJJII(str6, "action_type");
                c474500IjALIZ.LJJII(str7, "room_type");
                c474500IjALIZ.LJJII(str3, "icon_type");
                c474500IjALIZ.LJJII(Long.valueOf(j2), "duration_icon");
                if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
                    c474500IjALIZ.LIZ();
                } else {
                    c474500IjALIZ.LJJIJLIJ();
                    c474500IjALIZ.LJJIJL();
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LogComponents@8f3a.logDuration$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LogComponents@8f3a.logDuration$1");
            }
        });
    }

    public static final void LIZLLL(final String str, final Room room, final Long l) {
        final String str2;
        EnterRoomConfig.RoomsData roomsData;
        final long jCurrentTimeMillis = System.currentTimeMillis();
        w.LIZ.getClass();
        final String strLJIIIZ = w.LJIIIZ();
        final String strLJIIL = w.LJIIL();
        EnterRoomConfig enterRoomConfig = LIZ;
        if (enterRoomConfig != null && (roomsData = enterRoomConfig.mRoomsData) != null) {
            str2 = roomsData.enterType;
        } else {
            str2 = null;
        }
        final String strLIZIZ = LIZIZ();
        C783270Uo1.LIZLLL(new Runnable() { // from class: X.0IZN
            public final void LIZ() {
                String str3 = str;
                Room room2 = room;
                Long l2 = l;
                long j = jCurrentTimeMillis;
                String str4 = strLJIIIZ;
                String str5 = strLJIIL;
                String str6 = str2;
                String str7 = strLIZIZ;
                long jLIZ = C0IZP.LIZ();
                if (jLIZ <= 0 || l2 == null || room2 == null) {
                    return;
                }
                long j2 = j - jLIZ;
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_live_frame_load_duration");
                c474500IjALIZ.LJJII(Long.valueOf(room2.getId()), "room_id");
                InterfaceC2262081DgM interfaceC2262081DgMAuthor = room2.author();
                c474500IjALIZ.LJJII(interfaceC2262081DgMAuthor != null ? Long.valueOf(interfaceC2262081DgMAuthor.getId()) : null, "anchor_id");
                c474500IjALIZ.LJJII(str4, "enter_from_merge");
                c474500IjALIZ.LJJII(str5, "enter_method");
                c474500IjALIZ.LJJII(str6, "action_type");
                c474500IjALIZ.LJJII(str7, "room_type");
                c474500IjALIZ.LJJII(str3, "icon_type");
                c474500IjALIZ.LJJII(Long.valueOf(l2.longValue() - jLIZ), "duration_icon");
                c474500IjALIZ.LJJII(Long.valueOf(j2), "duration_action");
                if (!BuriedFieldReductionSetting.INSTANCE.isBuriedField(c474500IjALIZ.LJIJ())) {
                    c474500IjALIZ.LIZ();
                } else {
                    c474500IjALIZ.LJJIJLIJ();
                    c474500IjALIZ.LJJIJL();
                }
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("LogComponents@8f3a.logDurationWithAnim$1");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("LogComponents@8f3a.logDurationWithAnim$1");
            }
        });
    }
}
