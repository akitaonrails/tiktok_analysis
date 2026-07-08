package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JZH, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JZH implements InterfaceC111300bX {
    public final String LL;
    public final Room LLILLJJLI;
    public final DataChannel LLILLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0JZH)) {
            return false;
        }
        C0JZH c0jzh = (C0JZH) obj;
        return Intrinsics.LJFF(this.LL, c0jzh.LL) && Intrinsics.LJFF(this.LLILLJJLI, c0jzh.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c0jzh.LLILLL);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        Room room = this.LLILLJJLI;
        int iHashCode2 = (iHashCode + (room == null ? 0 : room.hashCode())) * 31;
        DataChannel dataChannel = this.LLILLL;
        return iHashCode2 + (dataChannel != null ? dataChannel.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubOnlyLiveSettingDialogHierarchy(enterFrom=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", room=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", dataChannel=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0JZH(Room room, DataChannel dataChannel, String str) {
        this.LL = str;
        this.LLILLJJLI = room;
        this.LLILLL = dataChannel;
    }
}
