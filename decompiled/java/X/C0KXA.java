package X;

import Y.AfS103S0300000_7;
import Y.AfS176S0100000_7;
import com.bytedance.android.live.usermanage.BanCapabilityParams;
import com.bytedance.android.live.usermanage.ILiveBanCapabilityApi;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.List;

/* JADX INFO: renamed from: X.0KXA, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KXA {
    public final DataChannel LIZ;
    public final Room LIZIZ;
    public final C11NJ LIZJ;

    public C0KXA(DataChannel dataChannel) {
        Room room;
        this.LIZ = dataChannel;
        if (dataChannel != null) {
            room = (Room) dataChannel.gg0(RoomChannel.class);
        } else {
            room = null;
        }
        this.LIZIZ = room;
        this.LIZJ = new C11NJ();
    }

    public static boolean LIZ(Long l) {
        if (l != null && l.longValue() > 0 && l.longValue() > System.currentTimeMillis() / 1000) {
            return true;
        }
        return false;
    }

    public final void LIZIZ(List<Integer> list) {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(C0KXA.class.getSimpleName());
        sbLIZ.append("_queryBanCapability scenes:");
        sbLIZ.append(C13LP.LJJLIIIJ(list, ",", null, null, 0, null, null, 62));
        C20441214yg.LIZIZ("perception", C2188811AlT.LIZIZ(sbLIZ));
        DataChannel dataChannel = this.LIZ;
        if (dataChannel == null) {
            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
            sbLIZ2.append(C0KXA.class.getSimpleName());
            sbLIZ2.append("_queryBanCapability return as dataChannel is null");
            C20441214yg.LIZIZ("perception", C2188811AlT.LIZIZ(sbLIZ2));
            return;
        }
        Room room = this.LIZIZ;
        if (room == null) {
            StringBuilder sbLIZ3 = C2188811AlT.LIZ();
            sbLIZ3.append(C0KXA.class.getSimpleName());
            sbLIZ3.append("_queryBanCapability return as room is null");
            C20441214yg.LIZIZ("perception", C2188811AlT.LIZIZ(sbLIZ3));
            return;
        }
        long ownerUserId = room.getOwnerUserId();
        long id = this.LIZIZ.getId();
        C480460Ism.LIZ().getClass();
        C19487311Lz.LIZIZ(((ILiveBanCapabilityApi) C480460Ism.LIZLLL(ILiveBanCapabilityApi.class)).getLiveBanCapability(new BanCapabilityParams(list, id, ownerUserId)).LJL(C11S5.LIZ()).LJJJLZIJ(C1701940uOG.LIZIZ()), this.LIZJ, new AfS103S0300000_7(this, dataChannel, list, 17), new AfS176S0100000_7(dataChannel, 217), null, null, 56);
    }
}
