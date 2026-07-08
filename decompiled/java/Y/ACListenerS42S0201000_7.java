package Y;

import X.C0IF8;
import X.C0II0;
import X.C0IJT;
import X.C0IKC;
import X.C0IKD;
import X.C0IL2;
import X.C0IMJ;
import X.C0IMV;
import X.C0IU0;
import X.C0K1Z;
import X.C1388190mED;
import X.C15WP;
import X.C19EG;
import X.C464330IIt;
import X.C474500IjA;
import X.C497820Jfg;
import X.C510590K0r;
import X.C748840TZa;
import X.C748920TZi;
import X.C748930TZj;
import X.C748940TZk;
import X.C748970TZn;
import X.C749140Ta4;
import X.C784440Upu;
import X.EnumC492500JTc;
import android.view.View;
import androidx.fragment.app.FragmentManager;
import com.bytedance.android.livesdk.chatroom.end.newaudienceend.LiveNewAudienceEndFragment;
import com.bytedance.android.livesdk.chatroom.ui.LivePlayFragment;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import com.bytedance.android.livesdkapi.subscribe.subonlyvideo.SubOnlyVideoOpenParams;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.ss.android.ugc.aweme.framework.services.IUserService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import com.ss.android.ugc.aweme.profile.model.User;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes8.dex */
public class ACListenerS42S0201000_7 implements View.OnClickListener {
    public final int $t;
    public int i2;
    public Object l0;
    public Object l1;

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.$t) {
            case 0:
                onClick$0(this, view);
                break;
            case 1:
                onClick$1(this, view);
                break;
        }
    }

    public static final void onClick$0(ACListenerS42S0201000_7 aCListenerS42S0201000_7, View view) {
        FragmentManager supportFragmentManager;
        SubOnlyVideoOpenParams subOnlyVideoOpenParams = new SubOnlyVideoOpenParams("privilege_page_sov_section", EnumC492500JTc.PRIVILEGE_PAGE, aCListenerS42S0201000_7.i2);
        C0K1Z c0k1z = C0K1Z.LIZ;
        C19EG c19egLIZIZ = C1388190mED.LIZIZ(((C510590K0r) aCListenerS42S0201000_7.l0).itemView.getContext());
        User currentUser = null;
        if (c19egLIZIZ != null) {
            supportFragmentManager = c19egLIZIZ.getSupportFragmentManager();
        } else {
            supportFragmentManager = null;
        }
        com.bytedance.android.live.base.model.user.User user = (com.bytedance.android.live.base.model.user.User) aCListenerS42S0201000_7.l1;
        IUserService iUserService = (IUserService) ServiceManager.get().getService(IUserService.class);
        if (iUserService != null) {
            currentUser = iUserService.getCurrentUser();
        }
        com.bytedance.android.live.base.model.user.User userLJ = C15WP.LJ(currentUser);
        int iLIZ = C497820Jfg.LIZ(((C510590K0r) aCListenerS42S0201000_7.l0).itemView.getContext());
        Boolean bool = Boolean.TRUE;
        Function0<Unit> function0 = ((C510590K0r) aCListenerS42S0201000_7.l0).LLILLJJLI;
        c0k1z.getClass();
        C0K1Z.LIZ(supportFragmentManager, user, userLJ, iLIZ, bool, subOnlyVideoOpenParams, function0);
    }

    public static final void onClick$1(ACListenerS42S0201000_7 aCListenerS42S0201000_7, View view) {
        BPEAHandler bPEAHandler;
        C0IMJ c0imj = (C0IMJ) aCListenerS42S0201000_7.l0;
        List list = (List) aCListenerS42S0201000_7.l1;
        int i = aCListenerS42S0201000_7.i2;
        C0IKD c0ikd = c0imj.LLILLL;
        if (c0ikd != null && (bPEAHandler = ((LiveNewAudienceEndFragment) c0ikd).LLILLL) != null) {
            bPEAHandler.removeCallbacksAndMessages(null);
        }
        Room room = (Room) ListProtector.get(list, i);
        c0imj.getContext();
        DataChannel dataChannel = c0imj.LL;
        EnterRoomConfig enterRoomConfig = new EnterRoomConfig();
        enterRoomConfig.mLogData.logPb = room.getLog_pb();
        enterRoomConfig.mLogData.requestId = room.getRequestId();
        EnterRoomConfig.RoomsData roomsData = enterRoomConfig.mRoomsData;
        roomsData.enterFromMerge = "live_end";
        roomsData.enterMethod = "live_cover";
        boolean z = true;
        enterRoomConfig.mLogData.fromEnd = 1;
        C0IKC c0ikc = (C0IKC) dataChannel.gg0(C749140Ta4.class);
        if (c0ikc != null) {
            EnterRoomConfig.LogData logData = enterRoomConfig.mLogData;
            logData.endSourceEnterFromMerge = c0ikc.LIZ;
            logData.endSourceEnterMethod = c0ikc.LIZIZ;
            logData.endSourceActionType = c0ikc.LIZJ;
            logData.endViewStatus = c0ikc.LIZLLL;
        }
        EnterRoomConfig.LogData logData2 = enterRoomConfig.mLogData;
        int iIntValue = ((Integer) dataChannel.gg0(C748970TZn.class)).intValue();
        String str = LivePlayFragment._pnsPageId;
        if (iIntValue != C0II0.LIVE_ACCESS_RECALL.ordinal()) {
            z = false;
        }
        logData2.isPreLiveAccessRecall = z;
        enterRoomConfig.mLogData.liveEndExit = "rec_click";
        C0IMV.LIZIZ(dataChannel, "rec_click");
        if (((Boolean) dataChannel.gg0(C748840TZa.class)).booleanValue()) {
            enterRoomConfig.mRoomsData.fromNewStyle = ((Boolean) dataChannel.gg0(C748840TZa.class)).booleanValue();
            enterRoomConfig.mRoomsData.fromDrawerStyle = (String) dataChannel.gg0(C748930TZj.class);
            enterRoomConfig.mRoomsData.enterLiveSource = (String) dataChannel.gg0(C748920TZi.class);
            EnterRoomConfig.RoomsData roomsData2 = enterRoomConfig.mRoomsData;
            roomsData2.windowMode = "full_screen";
            roomsData2.feedUrl = (String) dataChannel.gg0(C748940TZk.class);
        }
        enterRoomConfig.mRoomsData.roomId = room.getId();
        enterRoomConfig.mRoomsData.streamType = room.getStreamType();
        enterRoomConfig.mLogData.userFrom = room.getUserFrom();
        enterRoomConfig.mRoomsData.orientation = room.getOrientation();
        C464330IIt.LIZLLL(room, enterRoomConfig);
        long id = room.getId();
        EnterRoomConfig enterRoomConfig2 = C0IL2.LIZ.LIZ().mEnterRoomConfig;
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_finish_rec_click");
        c474500IjALIZ.LJJII(Long.valueOf(id), "rec_room_id");
        c474500IjALIZ.LJJII(Long.valueOf(enterRoomConfig2.mRoomsData.roomId), "room_id");
        c474500IjALIZ.LJJII(Long.valueOf(enterRoomConfig2.mRoomsData.enterUserId), "anchor_id");
        c474500IjALIZ.LJIJJLI(dataChannel);
        c474500IjALIZ.LIZ();
        C784440Upu.LIZ().LIZIZ(new C0IF8(enterRoomConfig, room.getId()));
        C0IU0.LJI(4);
    }

    public ACListenerS42S0201000_7(int i, Object obj, Object obj2, int i2) {
        this.$t = i2;
        this.i2 = i;
        this.l0 = obj;
        this.l1 = obj2;
    }
}
