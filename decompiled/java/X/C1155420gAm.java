package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gAm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1155420gAm implements InterfaceC0148002o {
    public final List<C20526015Tm> LL;

    public C1155420gAm() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1155420gAm) && Intrinsics.LJFF(this.LL, ((C1155420gAm) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ExploreTopicFeedSharedState(sharedRecommendTopicList=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1155420gAm(int i) {
        this(C13BV.INSTANCE);
    }

    public C1155420gAm(List<C20526015Tm> list) {
        this.LL = list;
    }
}
