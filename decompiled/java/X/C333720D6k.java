package X;

import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.LocalOrderWrapper;
import com.ss.android.ugc.aweme.commercialize.ucp.impl.data.ordersv2.OrderSnapshotV2;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D6k, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C333720D6k {
    public final OrderSnapshotV2 LIZ;
    public final List<LocalOrderWrapper> LIZIZ;
    public final long LIZJ;
    public final boolean LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C333720D6k)) {
            return false;
        }
        C333720D6k c333720D6k = (C333720D6k) obj;
        return Intrinsics.LJFF(this.LIZ, c333720D6k.LIZ) && Intrinsics.LJFF(this.LIZIZ, c333720D6k.LIZIZ) && this.LIZJ == c333720D6k.LIZJ && this.LIZLLL == c333720D6k.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + C786410Ut5.Y2(this.LIZJ)) * 31) + C786410Ut5.Z2(this.LIZLLL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("LoadMoreResultV2(displaySnapshot=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", loadedMoreItems=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", cursor=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", hasMore=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C333720D6k(OrderSnapshotV2 orderSnapshotV2, List<LocalOrderWrapper> list, long j, boolean z) {
        this.LIZ = orderSnapshotV2;
        this.LIZIZ = list;
        this.LIZJ = j;
        this.LIZLLL = z;
    }
}
