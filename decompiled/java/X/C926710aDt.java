package X;

import com.bytedance.android.livesdk.dataChannel.RoomChannel;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;

/* JADX INFO: renamed from: X.0aDt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C926710aDt implements InterfaceC926580aDg {
    public final DataChannel LIZ;

    public C926710aDt(DataChannel dataChannel) {
        this.LIZ = dataChannel;
    }

    @Override // X.InterfaceC926580aDg
    public final boolean LIZ(String str) {
        Room room = (Room) this.LIZ.gg0(RoomChannel.class);
        if (room == null || room.getMosaicStatus() != 1) {
            return false;
        }
        C766270U4b.LIZLLL(2131853480);
        C927960aFu.LIZ("MosaicInterceptor");
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append(EnumC1303240k1C.BIZ.getValue());
        sbLIZ.append("_MosaicInterceptor_");
        sbLIZ.append(27);
        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("onInteractIconClickForApply intercepted by MosaicInterceptor, from: ");
        sbLIZ2.append(str);
        C1AZW.LJIIJ(12, strLIZIZ, C2188811AlT.LIZIZ(sbLIZ2), null, null);
        return true;
    }
}
