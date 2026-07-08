package X;

import Y.ARunnableS81S0200000_12;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.game.chatroom.ui.GameBroadcastFragment;
import com.bytedance.android.livesdk.game.common.datachannel.BroadCastGameMomentChannel;
import com.bytedance.android.livesdk.livesetting.game.moment.LiveGameMomentAnchorToastDurationSetting;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.ies.sdk.datachannel.DataChannelGlobal;
import java.util.Set;
import kotlin.jvm.internal.AFwS189S0000000_3;
import kotlin.jvm.internal.AwS591S0100000_12;

/* JADX INFO: renamed from: X.0UhR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public final class C779190UhR {
    public DataChannel LIZ;
    public Fragment LIZIZ;
    public long LIZJ;
    public final C01GW LIZLLL = C452501pT.LIZIZ(AFwS189S0000000_3.get$arr$(223));

    public final void LIZIZ(C204543151x c204543151x) {
        Room room;
        String strLJIJI;
        DataChannel dataChannel = this.LIZ;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        if (!c204543151x.LIZ().contains(1) && !c204543151x.LIZ().contains(2)) {
            return;
        }
        C474500IjA c474500IjALIZ = C0IJT.LIZ("livesdk_game_moment_recv");
        LIZ(c474500IjALIZ, c204543151x, room);
        c474500IjALIZ.LIZ();
        if (((Set) this.LIZLLL.getValue()).contains(c204543151x.LJI())) {
            C474500IjA c474500IjALIZ2 = C0IJT.LIZ("livesdk_game_moment_ignore");
            c474500IjALIZ2.LJJII("duplicated", "reason");
            LIZ(c474500IjALIZ2, c204543151x, room);
            c474500IjALIZ2.LIZ();
            return;
        }
        if (c204543151x.LIZIZ() == 0 || System.currentTimeMillis() - this.LIZJ < LiveGameMomentAnchorToastDurationSetting.INSTANCE.getValueMillis()) {
            return;
        }
        ((Set) this.LIZLLL.getValue()).add(c204543151x.LJI());
        C786410Ut5.LJLIIL(60000L, C473410IhP.LIZ(), new ARunnableS81S0200000_12(c204543151x, this, 6));
        C474500IjA c474500IjALIZ3 = C0IJT.LIZ("livesdk_game_moment_dispatch");
        LIZ(c474500IjALIZ3, c204543151x, room);
        c474500IjALIZ3.LIZ();
        int iLIZIZ = c204543151x.LIZIZ();
        if (iLIZIZ == 2 || iLIZIZ != 3) {
            strLJIJI = C497740JfY.LJIJI(2131852523);
        } else {
            strLJIJI = C497740JfY.LJIJI(2131852512);
        }
        C777840UfG.LJII(new C778150Ufl("game_moment", "", strLJIJI, (ImageModel) null, c204543151x));
        this.LIZJ = System.currentTimeMillis();
    }

    public C779190UhR(GameBroadcastFragment gameBroadcastFragment, DataChannel dataChannel) {
        this.LIZ = dataChannel;
        this.LIZIZ = gameBroadcastFragment;
        Fragment fragment = this.LIZIZ;
        if (fragment != null) {
            DataChannelGlobal.LLILZ.CQ2(BroadCastGameMomentChannel.class, fragment, new AwS591S0100000_12(this, 38));
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x009f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C474500IjA r11, X.C204543151x r12, com.bytedance.android.livesdkapi.depend.model.live.Room r13) {
        /*
            Method dump skipped, instruction units count: 262
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C779190UhR.LIZ(X.0IjA, X.151x, com.bytedance.android.livesdkapi.depend.model.live.Room):void");
    }
}
