package X;

import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0D3N, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D3N implements Serializable {
    public final List<C332860D3c> deals;

    public final C0D3N copy(List<C332860D3c> list) {
        return new C0D3N(list);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0D3N) && Intrinsics.LJFF(this.deals, ((C0D3N) obj).deals);
    }

    public int hashCode() {
        return this.deals.hashCode();
    }

    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PdpDealsState(deals=");
        sbLIZ.append(this.deals);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final boolean getHasClaimedDeal() {
        List<C332860D3c> list = this.deals;
        if (!(list instanceof Collection) || !list.isEmpty()) {
            Iterator<C332860D3c> it2 = list.iterator();
            while (it2.hasNext()) {
                if (it2.next().isClaimed()) {
                    return true;
                }
            }
        }
        return false;
    }

    public C0D3N(List<C332860D3c> list) {
        this.deals = list;
    }
}
