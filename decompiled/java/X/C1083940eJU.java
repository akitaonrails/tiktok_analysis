package X;

import com.bytedance.android.livesdk.comp.api.pcs.IPcsService;
import com.bytedance.android.livesdk.comp.api.pcs.data.setting.LivePcsSmbStateServiceEnableSetting;
import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdk.dataChannel.UserIsAnchorChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.SMBInfo;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0eJU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1083940eJU {
    public static final /* synthetic */ int LIZ = 0;

    public static final boolean LIZ(DataChannel dataChannel) {
        boolean zBooleanValue;
        Room room;
        Boolean bool;
        if (dataChannel != null && (bool = (Boolean) dataChannel.gg0(UserIsAnchorChannel.class)) != null) {
            zBooleanValue = bool.booleanValue();
        } else {
            zBooleanValue = false;
            if (dataChannel == null) {
                room = null;
            }
            if (zBooleanValue && LIZIZ(room)) {
                return true;
            }
        }
        room = (Room) dataChannel.gg0(RoomChannel.class);
        return zBooleanValue ? false : false;
    }

    public static final boolean LIZIZ(Room room) {
        SMBInfo sMBInfo;
        SMBInfo sMBInfo2;
        InterfaceC1083970eJX interfaceC1083970eJXUN1;
        InterfaceC1083980eJY interfaceC1083980eJYLIZ;
        if (LivePcsSmbStateServiceEnableSetting.INSTANCE.getValue()) {
            if (room != null) {
                IPcsService iPcsService = (IPcsService) C1161920gLG.LIZJ(IPcsService.class);
                if (iPcsService != null && (interfaceC1083970eJXUN1 = iPcsService.UN1()) != null && (interfaceC1083980eJYLIZ = interfaceC1083970eJXUN1.LIZ(String.valueOf(room.getId()))) != null) {
                    return Intrinsics.LJFF(interfaceC1083980eJYLIZ.LJIIIZ().getValue(), Boolean.TRUE);
                }
            } else {
                return false;
            }
        }
        if (room != null && (sMBInfo = room.smbInfo) != null && sMBInfo.optInStatus == 1 && room != null && (sMBInfo2 = room.smbInfo) != null && sMBInfo2.activeSkuCount > 0) {
            return true;
        }
        return false;
    }
}
