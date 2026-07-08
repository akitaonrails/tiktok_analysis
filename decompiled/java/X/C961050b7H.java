package X;

import com.bytedance.android.livesdk.chatroom.interact.model.RivalExtraInfo;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0b7H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C961050b7H {
    public final long LIZ;
    public final Room LIZIZ;
    public final RivalExtraInfo LIZJ;
    public final String LIZLLL = "";

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C961050b7H)) {
            return false;
        }
        C961050b7H c961050b7H = (C961050b7H) obj;
        return this.LIZ == c961050b7H.LIZ && Intrinsics.LJFF(this.LIZIZ, c961050b7H.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c961050b7H.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c961050b7H.LIZLLL);
    }

    public final int hashCode() {
        int iY2 = ((C786410Ut5.Y2(this.LIZ) * 31) + this.LIZIZ.hashCode()) * 31;
        RivalExtraInfo rivalExtraInfo = this.LIZJ;
        return ((iY2 + (rivalExtraInfo == null ? 0 : rivalExtraInfo.hashCode())) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("NewActiveFriend(uid=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", room=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", rivalExtraInfo=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", requestId=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C961050b7H(long j, Room room, RivalExtraInfo rivalExtraInfo) {
        this.LIZ = j;
        this.LIZIZ = room;
        this.LIZJ = rivalExtraInfo;
    }
}
