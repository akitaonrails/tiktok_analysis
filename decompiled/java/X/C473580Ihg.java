package X;

import Y.AfS176S0100000_7;
import androidx.fragment.app.Fragment;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.RoomUserChannel;
import com.bytedance.android.livesdk.model.message.SocialMessage;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;

/* JADX INFO: renamed from: X.0Ihg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C473580Ihg {
    public final DataChannel LIZ;

    public final void onEvent(C473550Ihd c473550Ihd) {
        Room room;
        User user;
        if (c473550Ihd.LIZ != null && (room = (Room) this.LIZ.gg0(RoomChannel.class)) != null && (user = (User) this.LIZ.gg0(RoomUserChannel.class)) != null && c473550Ihd.LIZ.getDeltaIntimacy() > 0) {
            SocialMessage socialMessageLJFF = C181500mr.LJFF(room.getId(), c473550Ihd.LIZ.getDisplayText(), user);
            IMessageManager iMessageManager = (IMessageManager) this.LIZ.gg0(C776250Uch.class);
            if (iMessageManager != null) {
                iMessageManager.insertMessage(socialMessageLJFF, true);
            }
        }
    }

    public C473580Ihg(Fragment fragment, DataChannel dataChannel) {
        this.LIZ = dataChannel;
        C784440Upu.LIZ().LJI(fragment, C473550Ihd.class).LIZJ(new AfS176S0100000_7(this, 148));
    }
}
