package X;

import com.ss.android.ugc.aweme.feed.model.live.LiveDropsRoomInfo;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Pmm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C655100Pmm implements InterfaceC655080Pmk {
    public final LiveDropsRoomInfo LIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C655100Pmm) && Intrinsics.LJFF(this.LIZ, ((C655100Pmm) obj).LIZ);
    }

    public final int hashCode() {
        return this.LIZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("GameAnchor(data=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C655100Pmm(LiveDropsRoomInfo liveDropsRoomInfo) {
        this.LIZ = liveDropsRoomInfo;
    }
}
