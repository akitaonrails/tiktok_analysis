package X;

import androidx.recyclerview.widget.RecyclerView;
import java.util.UUID;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.019j, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2873019j implements InterfaceC2753014t {
    public final RecyclerView LL;
    public RecyclerView.ViewHolder LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2873019j)) {
            return false;
        }
        C2873019j c2873019j = (C2873019j) obj;
        return Intrinsics.LJFF(this.LL, c2873019j.LL) && Intrinsics.LJFF(this.LLILLJJLI, c2873019j.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        RecyclerView.ViewHolder viewHolder = this.LLILLJJLI;
        return iHashCode + (viewHolder == null ? 0 : viewHolder.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FirstLevelHitLineVHSource(recyclerView=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", hitLineRef=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C2873019j(RecyclerView recyclerView, RecyclerView.ViewHolder viewHolder) {
        this.LL = recyclerView;
        this.LLILLJJLI = viewHolder;
        UUID.randomUUID().toString();
    }
}
