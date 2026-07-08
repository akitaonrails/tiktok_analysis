package X;

import android.content.Context;
import com.bytedance.android.live.browser.IHybridContainerService;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.rank.model.RankTabInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: renamed from: X.0esS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1105620esS {
    public static final void LIZ(Context context, DataChannel dataChannel, List<RankTabInfo> list) {
        int iLJJI;
        long id;
        long ownerUserId;
        InterfaceC2262081DgM interfaceC2262081DgM;
        Room room;
        Room room2;
        Boolean bool;
        String str = "";
        if (list != null) {
            Iterator<RankTabInfo> it2 = list.iterator();
            while (it2.hasNext()) {
                String strLIZ = C1078670eAz.LIZ(it2.next().rankType, EnumC1083240eIM.RANK_DIALOG.getScene());
                if (strLIZ != null) {
                    str = strLIZ;
                }
            }
        }
        if (str.length() == 0) {
            return;
        }
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(C0TZM.class)) != null && !bool.booleanValue()) {
            iLJJI = (int) C497740JfY.LJJI(C465640INu.LIZIZ(context));
        } else {
            iLJJI = 622;
        }
        int iLJJI2 = (int) C497740JfY.LJJI(C465640INu.LIZIZ(context));
        C760370TsB c760370TsBLIZIZ = C0KYL.LIZIZ(str);
        long id2 = 0;
        if (dataChannel != null && (room2 = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            id = room2.getId();
        } else {
            id = 0;
        }
        c760370TsBLIZIZ.LJJIFFI("room_id", String.valueOf(id));
        if (dataChannel != null && (room = (Room) dataChannel.gg0(RoomChannel.class)) != null) {
            ownerUserId = room.getOwnerUserId();
        } else {
            ownerUserId = 0;
        }
        c760370TsBLIZIZ.LJJIFFI("anchor_id", String.valueOf(ownerUserId));
        if (dataChannel != null && (interfaceC2262081DgM = (InterfaceC2262081DgM) dataChannel.gg0(C1132290fZT.class)) != null) {
            id2 = interfaceC2262081DgM.getId();
        }
        c760370TsBLIZIZ.LJJIFFI("user_id", String.valueOf(id2));
        EnumC760350Ts9 enumC760350Ts9 = EnumC760350Ts9.DP;
        c760370TsBLIZIZ.LJIIIZ(iLJJI, enumC760350Ts9);
        c760370TsBLIZIZ.LJJ(iLJJI2, enumC760350Ts9);
        c760370TsBLIZIZ.LJIJI(8, enumC760350Ts9);
        c760370TsBLIZIZ.LJIJJLI("bottom");
        c760370TsBLIZIZ.LJIIIIZZ("bottom");
        c760370TsBLIZIZ.LJIILIIL("end");
        c760370TsBLIZIZ.LJIILL("end");
        String string = c760370TsBLIZIZ.LIZ().toString();
        if (context != null) {
            ((IHybridContainerService) C1161920gLG.LIZJ(IHybridContainerService.class)).YC1(context, string, null);
        }
    }
}
