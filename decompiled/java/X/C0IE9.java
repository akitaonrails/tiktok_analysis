package X;

import com.bytedance.android.live.microom.IMicRoomService;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdk.livesetting.watchlive.enterroom.LiveTrimStreamDataExp;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.Event;
import kotlin.Pair;

/* JADX INFO: renamed from: X.0IE9, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IE9 implements InterfaceC463960IHi {
    public final /* synthetic */ LivePlayFragment LIZ;

    public C0IE9(LivePlayFragment livePlayFragment) {
        this.LIZ = livePlayFragment;
    }

    @Override // X.InterfaceC463960IHi
    public final void LIZIZ(Room room) {
        C463260IEq c463260IEq;
        boolean z;
        this.LIZ.PS().LIZIZ("after_info_by_user");
        IMicRoomService iMicRoomService = (IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class);
        if (LiveTrimStreamDataExp.isEnableTrim(this.LIZ.g1) && iMicRoomService != null && !iMicRoomService.On1() && !LivePlayFragment.GT(room)) {
            LivePlayFragment livePlayFragment = this.LIZ;
            LiveTrimStreamDataExp.assignTrimStreamData(livePlayFragment.g1, livePlayFragment.LLILZ, room);
        }
        EnterRoomConfig enterRoomConfig = this.LIZ.g1;
        if (enterRoomConfig != null) {
            enterRoomConfig.mRoomsData.enterRoomId = room.getId();
            EnterRoomConfig.RoomsData roomsData = this.LIZ.g1.mRoomsData;
            if (((IMicRoomService) C1161920gLG.LIZJ(IMicRoomService.class)).n42(room) && room.getOfficialChannelInfo() != null && room.getOfficialChannelInfo().backupRoomId == room.getId()) {
                z = true;
            } else {
                z = false;
            }
            roomsData.curIsMicRoomFromOfficial = z;
            EnterRoomConfig.RoomsData roomsData2 = this.LIZ.g1.mRoomsData;
            long j = roomsData2.enterRoomId;
            long j2 = roomsData2.enterUserId;
            C0IUA.LIZLLL = j;
            C0IUA.LJFF = j2;
            C0IUA.LJFF(roomsData2.enterMethod, roomsData2.enterFromMerge);
            C0IU0.LJFF();
        }
        long id = room.getId();
        LivePlayFragment livePlayFragment2 = this.LIZ;
        long j3 = livePlayFragment2.g1.mStreamData.streamRoomId;
        if (id != j3 && j3 != -1 && (c463260IEq = livePlayFragment2.R0) != null) {
            c463260IEq.LJIIIZ = true;
        }
        if (livePlayFragment2.CW(false, room)) {
            this.LIZ.JU(0, false);
        }
    }

    @Override // X.InterfaceC463960IHi
    public final void LIZ(int i, String str) {
        int i2;
        this.LIZ.PS().LIZIZ("info_by_user_failed");
        if (i != 30003 && i != 30001) {
            if (i != 0) {
                i2 = i;
            } else {
                i2 = 103;
            }
            LivePlayFragment livePlayFragment = this.LIZ;
            livePlayFragment.G0.LJIIL(i2, str, livePlayFragment.LLLZI, livePlayFragment.LLILLJJLI, livePlayFragment.LLJ);
            LivePlayFragment livePlayFragment2 = this.LIZ;
            livePlayFragment2.cS(i2, livePlayFragment2.LLILLJJLI, str);
        }
        LivePlayFragment livePlayFragment3 = this.LIZ;
        long j = livePlayFragment3.LLILLJJLI;
        if (j != 0) {
            livePlayFragment3.TV(j, false);
            return;
        }
        livePlayFragment3.PT(203L, i, "fetch room by userId failure");
        Event event = new Event("live_play_end_room_fetch_fail", 1026, C0IIR.ServerApiCall);
        event.LIZIZ("fetch room by userId failure");
        C0IL2.LIZ.LIZ().LIZIZ(event);
        this.LIZ.y.IQ2(C749240TaE.class, new Pair(101, 101006));
        C0IIS.LIZLLL(this.LIZ.g1, C0II1.USER_FETCH_FAILED, "slide_next_room", null);
        this.LIZ.oS(C0II0.FETCH_FAILED);
        if (i != 30003) {
            C474500IjA c474500IjALIZ = C0IJT.LIZ("rd_info_by_user_failed");
            c474500IjALIZ.LJIJJLI(this.LIZ.y);
            c474500IjALIZ.LIZ();
        } else {
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("rd_enter_room_live_end");
            c474500IjALIZ2.LJIJJLI(this.LIZ.y);
            c474500IjALIZ2.LIZ();
        }
    }
}
