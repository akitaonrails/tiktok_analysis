package X;

import com.bytedance.android.livesdk.signaling.model.downlink.CacheUpdateItem;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.00EE, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00EE {
    public List<String> LIZ;
    public final List<CacheUpdateItem> LIZIZ;

    public C00EE() {
        this((List) null, 3);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C00EE)) {
            return false;
        }
        C00EE c00ee = (C00EE) obj;
        return Intrinsics.LJFF(this.LIZ, c00ee.LIZ) && Intrinsics.LJFF(this.LIZIZ, c00ee.LIZIZ);
    }

    public final int hashCode() {
        List<String> list = this.LIZ;
        int iHashCode = (list == null ? 0 : list.hashCode()) * 31;
        List<CacheUpdateItem> list2 = this.LIZIZ;
        return iHashCode + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("RoomCacheUpdateState(anchorIds=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", needRefreshRooms=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C00EE(List list, int i) {
        this((List<String>) ((i & 1) != 0 ? null : list), (List<CacheUpdateItem>) null);
    }

    public C00EE(List<String> list, List<CacheUpdateItem> list2) {
        this.LIZ = list;
        this.LIZIZ = list2;
    }
}
