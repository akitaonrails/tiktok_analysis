package X;

import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS594S0100000_15;

/* JADX INFO: renamed from: X.0bVs, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C976300bVs {
    public static final void LIZ(C975970bVL c975970bVL, InterfaceC976360bVy interfaceC976360bVy, int i, boolean z, long j, Function0<Unit> function0, Integer num) {
        Room roomInfo;
        User owner;
        DataChannel dataChannel;
        int iIntValue;
        long j2;
        if (c975970bVL.LIZIZ == null || c975970bVL.LJIIJJI) {
            return;
        }
        boolean z2 = true;
        c975970bVL.LJIIJJI = true;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("punish, cutShort = ");
        sbLIZ.append(z);
        C20441214yg.LJIIIZ("MultiMatchStateMatching", C2188811AlT.LIZIZ(sbLIZ));
        InterfaceC975520bUc interfaceC975520bUc = c975970bVL.LIZIZ;
        Room room = null;
        if (interfaceC975520bUc != null) {
            roomInfo = interfaceC975520bUc.getRoomInfo();
        } else {
            roomInfo = null;
        }
        if ((i != 103 && i != 212) || (roomInfo != null && (owner = roomInfo.getOwner()) != null && j == owner.getId())) {
            z2 = false;
        }
        C975960bVK c975960bVK = c975970bVL.LJII;
        if (c975960bVK != null) {
            c975960bVK.LJIL = z;
        }
        InterfaceC975520bUc interfaceC975520bUc2 = c975970bVL.LIZIZ;
        if (interfaceC975520bUc2 == null || interfaceC975520bUc2.getRoomInfo() == null) {
            InterfaceC975520bUc interfaceC975520bUc3 = c975970bVL.LIZIZ;
            if (interfaceC975520bUc3 != null && (dataChannel = interfaceC975520bUc3.getDataChannel()) != null) {
                room = (Room) dataChannel.gg0(RoomChannel.class);
            }
            roomInfo = room;
        }
        InterfaceC976890bWp.LIZ.getClass();
        int iLIZ = C976760bWc.LIZ(i, j, roomInfo);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("match punish finish request fromSource = ");
        sbLIZ2.append(i);
        sbLIZ2.append(" reason = ");
        sbLIZ2.append(iLIZ);
        C20441214yg.LJ("MultiMatchStateMatching", C2188811AlT.LIZIZ(sbLIZ2));
        if (interfaceC976360bVy != null) {
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            C975960bVK c975960bVK2 = c975970bVL.LJII;
            if (c975960bVK2 != null) {
                j2 = c975960bVK2.LJ;
            } else {
                j2 = 0;
            }
            interfaceC976360bVy.LJJIIZ(iLIZ, iIntValue, j2, new C976590bWL(c975970bVL, z, z2, function0), new AwS594S0100000_15(c975970bVL, 897), z);
        }
        if (!z) {
            c975970bVL.LJJIJ("punish_request", false);
        }
    }
}
