package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.repository.dto.Summary;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02tM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C731402tM implements InterfaceC729102sz {
    public final Summary LIZ;

    public C731402tM() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C731402tM) && Intrinsics.LJFF(this.LIZ, ((C731402tM) obj).LIZ);
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
        sbLIZ.append("SeaSummaryCompState(summary=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C731402tM(Summary summary) {
        this.LIZ = summary;
    }
}
