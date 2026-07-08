package X;

import com.bytedance.android.livesdk.model.FeedItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00IB, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00IB {
    public final List<FeedItem> LIZ;
    public final long LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00IB)) {
            return false;
        }
        C00IB c00ib = (C00IB) obj;
        return Intrinsics.LJFF(this.LIZ, c00ib.LIZ) && this.LIZIZ == c00ib.LIZIZ;
    }

    public final int hashCode() {
        return (this.LIZ.hashCode() * 31) + C786410Ut5.Y2(this.LIZIZ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CachedRoomData(roomList=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", timestamp=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C00IB(List<FeedItem> list, long j) {
        this.LIZ = list;
        this.LIZIZ = j;
    }
}
