package X;

import android.content.Context;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.android.livesdkapi.session.Event;

/* JADX INFO: renamed from: X.0IKW, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IKW {
    public final Context LIZ;
    public EnterRoomConfig LIZIZ;

    public C0IKW(Context context) {
        this.LIZ = context;
        C01GW c01gw = C464820IKq.LIZ;
        this.LIZIZ = C464820IKq.LIZ(C520010KaN.LJJIIJ(context)).LIZ();
    }

    public final boolean LIZ(String str) {
        boolean z;
        EnterRoomConfig.TimeStamp timeStamp;
        EnterRoomConfig.TimeStamp timeStamp2;
        String str2;
        EnterRoomConfig.LogData logData;
        EnterRoomConfig.RoomsData roomsData;
        EnterRoomConfig.RoomsData roomsData2;
        boolean z2 = false;
        if (this.LIZIZ == null) {
            return false;
        }
        EnterRoomConfig enterRoomConfig = C0IL2.LIZ.LIZ().mEnterRoomConfig;
        if (enterRoomConfig == null) {
            enterRoomConfig = null;
        }
        if (enterRoomConfig != null && (roomsData2 = enterRoomConfig.mRoomsData) != null && roomsData2.isShowBackRoom) {
            z = true;
        } else {
            z = false;
        }
        long j = 0;
        if (z) {
            long j2 = enterRoomConfig.mRoomsData.backRoomId;
            if (j2 > 0) {
                EnterRoomConfig enterRoomConfig2 = new EnterRoomConfig();
                EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig2.mRoomsData;
                roomsData3.roomId = j2;
                EnterRoomConfig.RoomsData roomsData4 = enterRoomConfig.mRoomsData;
                roomsData3.enterFromMerge = roomsData4.enterFromMerge;
                roomsData3.enterMethod = roomsData4.enterMethod;
                roomsData3.fromAutoJump = false;
                EnterRoomConfig enterRoomConfig3 = this.LIZIZ;
                if (enterRoomConfig3 != null && (roomsData = enterRoomConfig3.mRoomsData) != null) {
                    z2 = roomsData.isShowBackRoom;
                }
                roomsData3.isShowBackRoom = z2;
                EnterRoomConfig.LogData logData2 = enterRoomConfig2.mLogData;
                if (enterRoomConfig3 == null || (logData = enterRoomConfig3.mLogData) == null || (str2 = logData.logId) == null) {
                    str2 = "";
                }
                logData2.logId = str2;
                this.LIZIZ = enterRoomConfig2;
                EnterRoomLinkSession enterRoomLinkSessionLJ = EnterRoomLinkSession.LJ(enterRoomConfig2);
                Event event = new Event("mic_room_jump_event", 1033, C0IIR.MessageReceived);
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("roomid:");
                sbLIZ.append(j2);
                sbLIZ.append(" autojump: false");
                event.LIZIZ(C2188811AlT.LIZIZ(sbLIZ));
                enterRoomLinkSessionLJ.LIZIZ(event);
                C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_line_up_list_click_return");
                c474500IjALIZ.LJIL();
                c474500IjALIZ.LIZ();
            }
        }
        EnterRoomConfig enterRoomConfig4 = this.LIZIZ;
        if (enterRoomConfig4 != null) {
            EnterRoomConfig.RoomsData roomsData5 = enterRoomConfig4.mRoomsData;
            if (roomsData5 != null && (timeStamp2 = roomsData5.timeStamps) != null) {
                timeStamp2.enterRoomStarTimeReal = 0L;
            }
            EnterRoomConfig.RoomsData roomsData6 = enterRoomConfig4.mRoomsData;
            if (roomsData6 != null && (timeStamp = roomsData6.timeStamps) != null) {
                timeStamp.enterRoomStarTime = 0L;
            }
            EnterRoomConfig.RoomsData roomsData7 = enterRoomConfig4.mRoomsData;
            if (roomsData7 != null) {
                j = roomsData7.roomId;
            }
        }
        if (enterRoomConfig4 != null) {
            EnterRoomConfig.RoomsData roomsData8 = enterRoomConfig4.mRoomsData;
            if (roomsData8 != null) {
                roomsData8.backPreRoomType = str;
            }
            EnterRoomConfig.RoomsData roomsData9 = enterRoomConfig4.mRoomsData;
            if (roomsData9 != null) {
                roomsData9.actionType = "click";
            }
        }
        C784440Upu.LIZ().LIZIZ(new C0IF8(j, enterRoomConfig4, true, false));
        return true;
    }
}
