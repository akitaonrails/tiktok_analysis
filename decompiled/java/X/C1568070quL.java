package X;

import com.ss.android.ugc.aweme.series.feed.tab.feed.SeriesFeedViewHolder;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0quL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1568070quL implements InterfaceC111300bX {
    public final InterfaceC1574170r4B LL;
    public final SeriesFeedViewHolder LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1568070quL)) {
            return false;
        }
        C1568070quL c1568070quL = (C1568070quL) obj;
        return Intrinsics.LJFF(this.LL, c1568070quL.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1568070quL.LLILLJJLI);
    }

    public final int hashCode() {
        int iHashCode = this.LL.hashCode() * 31;
        SeriesFeedViewHolder seriesFeedViewHolder = this.LLILLJJLI;
        return iHashCode + (seriesFeedViewHolder == null ? 0 : seriesFeedViewHolder.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeriesFeedHierarchyData(hostAbility=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", feedListViewHolder=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1568070quL(C1568140quS c1568140quS, SeriesFeedViewHolder seriesFeedViewHolder) {
        this.LL = c1568140quS;
        this.LLILLJJLI = seriesFeedViewHolder;
    }
}
