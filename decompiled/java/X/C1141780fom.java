package X;

import androidx.fragment.app.Fragment;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.ss.ugc.live.sdk.message.interfaces.IMessageManager;

/* JADX INFO: renamed from: X.0fom, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1141780fom implements InterfaceC20489715Fn {
    public int LIZ;
    public int LIZIZ;
    public long LIZJ;

    @Override // X.InterfaceC20489715Fn
    public final void Ig() {
        this.LIZIZ = 0;
        this.LIZ = 0;
        this.LIZJ = 0L;
    }

    @Override // X.InterfaceC20489715Fn
    public final void g0(Fragment fragment, DataChannel dataChannel) {
        long id;
        IMessageManager iMessageManager;
        Room room;
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            id = room.getId();
        } else {
            id = 0;
        }
        this.LIZJ = id;
        if (dataChannel != null && (iMessageManager = (IMessageManager) dataChannel.gg0(C776250Uch.class)) != null) {
            iMessageManager.addAsyncMessageListener(C001A.GIFT.getIntType(), new C1151720g4o(this, 26));
        }
    }
}
