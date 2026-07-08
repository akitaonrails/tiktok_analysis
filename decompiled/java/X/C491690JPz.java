package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JPz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C491690JPz implements InterfaceC111300bX {
    public final Room LL;
    public final String LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C491690JPz)) {
            return false;
        }
        C491690JPz c491690JPz = (C491690JPz) obj;
        return Intrinsics.LJFF(this.LL, c491690JPz.LL) && Intrinsics.LJFF(this.LLILLJJLI, c491690JPz.LLILLJJLI);
    }

    public final int hashCode() {
        Room room = this.LL;
        int iHashCode = (room == null ? 0 : room.hashCode()) * 31;
        String str = this.LLILLJJLI;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SubOnlyLiveVipHierarchy(room=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", showEntrance=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C491690JPz(Room room, String str) {
        this.LL = room;
        this.LLILLJJLI = str;
    }
}
