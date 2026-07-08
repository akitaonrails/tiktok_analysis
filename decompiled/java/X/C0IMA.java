package X;

import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.session.EnterRoomConfig;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0IMA, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IMA {
    public final String LIZ;
    public final Long LIZIZ;
    public final String LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0IMA)) {
            return false;
        }
        C0IMA c0ima = (C0IMA) obj;
        return Intrinsics.LJFF(this.LIZ, c0ima.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0ima.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0ima.LIZJ) && this.LIZLLL == c0ima.LIZLLL;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Long l = this.LIZIZ;
        int iHashCode2 = (iHashCode + (l == null ? 0 : l.hashCode())) * 31;
        String str2 = this.LIZJ;
        return ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PlayerIDs(sessionId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", roomId=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", logId=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", forceLowLatency=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public static final boolean LIZIZ(Room room) {
        if (room != null) {
            return room.isSupportLowLatency();
        }
        return false;
    }

    public static final String LIZ(Room room, EnterRoomConfig enterRoomConfig) {
        EnterRoomConfig.LogData logData;
        String str;
        String str2;
        if (room == null || (str2 = room.logId) == null) {
            if (enterRoomConfig == null || (logData = enterRoomConfig.mLogData) == null || (str = logData.logId) == null) {
                return "";
            }
            return str;
        }
        return str2;
    }

    public C0IMA(String str, Long l, boolean z, String str2) {
        this.LIZ = str;
        this.LIZIZ = l;
        this.LIZJ = str2;
        this.LIZLLL = z;
    }
}
