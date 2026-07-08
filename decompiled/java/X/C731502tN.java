package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02tN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C731502tN implements InterfaceC729102sz {
    public final Summary LIZ;

    public C731502tN() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C731502tN) && Intrinsics.LJFF(this.LIZ, ((C731502tN) obj).LIZ);
    }

    public final int hashCode() {
        Summary summary = this.LIZ;
        if (summary == null) {
            return 0;
        }
        return summary.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UsCombinedSkuSummaryCompState(summary=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C731502tN(Summary summary) {
        this.LIZ = summary;
    }
}
