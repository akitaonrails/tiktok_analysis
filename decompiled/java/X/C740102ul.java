package X;

import com.ss.android.ugc.aweme.feed.model.FcpSlotStrategy;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02ul, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C740102ul {
    public final String LIZ;
    public final FcpSlotStrategy LIZIZ;
    public final int LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C740102ul)) {
            return false;
        }
        C740102ul c740102ul = (C740102ul) obj;
        return Intrinsics.LJFF(this.LIZ, c740102ul.LIZ) && Intrinsics.LJFF(this.LIZIZ, c740102ul.LIZIZ) && this.LIZJ == c740102ul.LIZJ;
    }

    public final int hashCode() {
        String str = this.LIZ;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        FcpSlotStrategy fcpSlotStrategy = this.LIZIZ;
        return ((iHashCode + (fcpSlotStrategy != null ? fcpSlotStrategy.hashCode() : 0)) * 31) + this.LIZJ;
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SlotStrategyPayload(awemeId=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", slotStrategy=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", strategyRevision=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C740102ul(String str, FcpSlotStrategy fcpSlotStrategy, int i) {
        this.LIZ = str;
        this.LIZIZ = fcpSlotStrategy;
        this.LIZJ = i;
    }
}
