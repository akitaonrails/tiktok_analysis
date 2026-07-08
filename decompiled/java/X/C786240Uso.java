package X;

import android.content.Intent;
import androidx.localbroadcastmanager.content.LocalBroadcastManager;
import com.bytedance.android.livesdk.dataChannel.LiveCastChannel;
import com.bytedance.android.livesdk.game.broadcast.mirror.GameCast;
import com.bytedance.android.livesdk.game.broadcast.mirror.GameCastWiredFragmentV2;
import com.bytedance.android.livesdk.game.broadcast.mirror.GameCastWirelessFragmentV2;
import com.bytedance.android.livesdk.game.chatroom.ui.GameBroadcastFragment;
import com.bytedance.android.livesdk.util.GlobalContext;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;

/* JADX INFO: renamed from: X.0Uso, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public class C786240Uso implements InterfaceC19515111Wr {
    public final int $t;
    public Object l0;

    @Override // X.InterfaceC19515111Wr
    public final void LIZ(C0HWO... c0hwoArr) {
        switch (this.$t) {
            case 0:
                LIZ$0(this, c0hwoArr);
                break;
            case 1:
                LIZ$1(this, c0hwoArr);
                break;
            case 2:
                LIZ$2(this, c0hwoArr);
                break;
        }
    }

    @Override // X.InterfaceC19515111Wr
    public final void onCanceled() {
        switch (this.$t) {
            case 0:
                onCanceled$0(this);
                break;
            case 1:
                onCanceled$1(this);
                break;
            case 2:
                C20441214yg.LIZ("notification permissions apply onCanceled on start state");
                break;
        }
    }

    public static final void onCanceled$0(C786240Uso c786240Uso) {
        C16F5 c16f5 = ((GameCastWiredFragmentV2) c786240Uso.l0).LLIZ;
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIJI(2131844016));
        }
        C20441214yg.LIZIZ("GameCastWiredFragment", "notification permissions onCanceled");
    }

    public static final void onCanceled$1(C786240Uso c786240Uso) {
        C20441214yg.LIZIZ("GameCastFragment", "notification permissions onCanceled");
        DataChannelGlobal.LLILZ.HQ2(LiveCastChannel.class, C0TH2.NOTIFICATION_PERMISSIONS_ERROR);
    }

    public C786240Uso(Object obj, int i) {
        this.$t = i;
        this.l0 = obj;
    }

    public static final void LIZ$0(C786240Uso c786240Uso, C0HWO... c0hwoArr) {
        EnumC442280HVy enumC442280HVy = ((C0HWO) C13LQ.LJIL(c0hwoArr)).LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notification permissions resultType");
        sbLIZ.append(enumC442280HVy);
        C20441214yg.LIZIZ("GameCastWiredFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (enumC442280HVy == EnumC442280HVy.GRANTED) {
            1JLc r0 = C744020TGm.LIZ;
            C744020TGm.LIZJ((GameCastWiredFragmentV2) c786240Uso.l0);
            return;
        }
        C16F5 c16f5 = ((GameCastWiredFragmentV2) c786240Uso.l0).LLIZ;
        if (c16f5 != null) {
            c16f5.setText(C497740JfY.LJIJI(2131844016));
        }
        ((GameCastWiredFragmentV2) c786240Uso.l0).NR();
        ((GameCastWiredFragmentV2) c786240Uso.l0).LLILLJJLI = false;
    }

    public static final void LIZ$1(C786240Uso c786240Uso, C0HWO... c0hwoArr) {
        DataChannelGlobal dataChannelGlobal = DataChannelGlobal.LLILZ;
        Object objGg0 = dataChannelGlobal.gg0(LiveCastChannel.class);
        EnumC442280HVy enumC442280HVy = ((C0HWO) C13LQ.LJIL(c0hwoArr)).LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notification permissions resultType");
        sbLIZ.append(enumC442280HVy);
        C20441214yg.LIZIZ("GameCastFragment", C2188811AlT.LIZIZ(sbLIZ));
        if (enumC442280HVy == EnumC442280HVy.GRANTED) {
            C20441214yg.LIZIZ("GameCastFragment", "notification permissions is granted");
            GameCast gameCast = GameCast.LIZ;
            GameCast.LJIIJ((GameCastWirelessFragmentV2) c786240Uso.l0);
        } else {
            C0TH2 c0th2 = C0TH2.NOTIFICATION_PERMISSIONS_ERROR;
            if (objGg0 == c0th2) {
                C0W78.LJII(((GameCastWirelessFragmentV2) c786240Uso.l0).getActivity());
            } else {
                dataChannelGlobal.HQ2(LiveCastChannel.class, c0th2);
            }
        }
    }

    public static final void LIZ$2(C786240Uso c786240Uso, C0HWO... c0hwoArr) {
        LocalBroadcastManager.LIZ(GlobalContext.getApplicationContext()).LIZJ(new Intent("bytedance.android.livesdk.chatroom.ui.intent.filter.SERVICE_REQUEST_POST_NOTIFICATION_END"));
        int i = 1;
        if (c0hwoArr.length == 0) {
            C20441214yg.LIZ("notification permissions apply results isEmpty on start state");
            return;
        }
        EnumC442280HVy enumC442280HVy = ((C0HWO) C13LQ.LJIL(c0hwoArr)).LIZIZ;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("notification permissions apply resultType(");
        sbLIZ.append(enumC442280HVy);
        sbLIZ.append(") on start state");
        C20441214yg.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        if (enumC442280HVy != EnumC442280HVy.GRANTED) {
            i = 0;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_mobile_gaming_notification_allow");
        c474500IjALIZ.LJJII(Long.valueOf(((GameBroadcastFragment) c786240Uso.l0).getRoomId()), "room_id");
        c474500IjALIZ.LJJII("after_living", "pop_up_scene");
        c474500IjALIZ.LJJII(Integer.valueOf(i), "is_notification_authorized");
        c474500IjALIZ.LIZ();
    }
}
