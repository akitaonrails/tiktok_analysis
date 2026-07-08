package Y;

import X.C0IF8;
import X.C0IL2;
import X.C0INL;
import X.C0IU0;
import X.C0K1L;
import X.C464330IIt;
import X.C784440Upu;
import android.view.View;
import com.bytedance.android.livesdk.chatroom.model.interact.LinkPlayerInfo;
import com.bytedance.android.livesdk.event.UserProfileEvent;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.session.EnterRoomLinkSession;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.List;

/* JADX INFO: loaded from: classes8.dex */
public class ACListenerS51S0101000_7 implements View.OnClickListener {
    public final int $t;
    public int i1;
    public Object l0;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
            case 2:
                onClick$2(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS51S0101000_7 aCListenerS51S0101000_7, View view) {
        ((C0K1L) aCListenerS51S0101000_7.l0).LL.LIZ(aCListenerS51S0101000_7.i1);
    }

    public static final void onClick$1(ACListenerS51S0101000_7 aCListenerS51S0101000_7, View view) {
        Room room;
        EnterRoomConfig enterRoomConfig;
        boolean z;
        List<Room> list = ((C0INL) aCListenerS51S0101000_7.l0).LL;
        if (list != null) {
            room = (Room) ListProtector.get(list, aCListenerS51S0101000_7.i1);
        } else {
            room = null;
        }
        if (room != null) {
            EnterRoomConfig enterRoomConfig2 = new EnterRoomConfig();
            enterRoomConfig2.mLogData.logPb = room.getLog_pb();
            enterRoomConfig2.mLogData.requestId = room.getRequestId();
            EnterRoomConfig.RoomsData roomsData = enterRoomConfig2.mRoomsData;
            roomsData.enterFromMerge = "live_end";
            roomsData.enterMethod = "live_cover";
            enterRoomConfig2.mLogData.liveEndExit = "auto_swipe";
            EnterRoomLinkSession enterRoomLinkSessionLIZ = C0IL2.LIZ.LIZ();
            if (enterRoomLinkSessionLIZ != null && (enterRoomConfig = enterRoomLinkSessionLIZ.mEnterRoomConfig) != null && (z = enterRoomConfig.mRoomsData.fromNewStyle)) {
                if (room.isOfficial()) {
                    z = false;
                }
                EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig2.mRoomsData;
                roomsData2.fromNewStyle = z;
                EnterRoomConfig.RoomsData roomsData3 = enterRoomConfig.mRoomsData;
                roomsData2.fromDrawerStyle = roomsData3.fromDrawerStyle;
                roomsData2.enterLiveSource = roomsData3.enterFromLiveSource;
                roomsData2.windowMode = "full_screen";
                roomsData2.feedUrl = roomsData3.feedUrl;
            }
            enterRoomConfig2.mRoomsData.roomId = room.getId();
            enterRoomConfig2.mRoomsData.streamType = room.getStreamType();
            enterRoomConfig2.mLogData.userFrom = room.getUserFrom();
            enterRoomConfig2.mRoomsData.orientation = 1;
            C464330IIt.LIZLLL(room, enterRoomConfig2);
            C784440Upu.LIZ().LIZIZ(new C0IF8(enterRoomConfig2, room.getId()));
        }
        C0IU0.LJI(4);
    }

    public static final void onClick$2(ACListenerS51S0101000_7 aCListenerS51S0101000_7, View view) {
        if (((LinkPlayerInfo) aCListenerS51S0101000_7.l0).mUser == null) {
            return;
        }
        C784440Upu c784440UpuLIZ = C784440Upu.LIZ();
        UserProfileEvent userProfileEvent = new UserProfileEvent(((LinkPlayerInfo) aCListenerS51S0101000_7.l0).mUser);
        int i = aCListenerS51S0101000_7.i1;
        boolean z = false;
        userProfileEvent.coHostEnable = false;
        if (i >= 1) {
            z = true;
        }
        userProfileEvent.linkInRoomEnable = z;
        userProfileEvent.mSource = "guest_connection";
        userProfileEvent.mClickUserPosition = "connection_list";
        userProfileEvent.clickModule = "multi_guest_panel_head";
        c784440UpuLIZ.LIZIZ(userProfileEvent);
    }

    public ACListenerS51S0101000_7(int i, Object obj, int i2) {
        this.$t = i2;
        this.l0 = obj;
        this.i1 = i;
    }
}
