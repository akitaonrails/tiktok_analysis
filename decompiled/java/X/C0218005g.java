package X;

import com.ss.android.ugc.aweme.im.callroom.api.model.RoomInfo;
import com.ss.android.ugc.aweme.im.callroom.api.model.RtcInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.005g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0218005g {
    public final RoomInfo LIZ;
    public final RtcInfo LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0218005g)) {
            return false;
        }
        C0218005g c0218005g = (C0218005g) obj;
        return Intrinsics.LJFF(this.LIZ, c0218005g.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0218005g.LIZIZ);
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SessionEndpoint(roomInfo=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", rtcInfo=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0218005g(RoomInfo roomInfo, RtcInfo rtcInfo) {
        this.LIZ = roomInfo;
        this.LIZIZ = rtcInfo;
    }
}
