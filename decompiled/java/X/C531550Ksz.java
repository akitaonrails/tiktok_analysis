package X;

import com.ss.android.ugc.aweme.shortvideo.model.SummaryData;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Ksz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class C531550Ksz {
    public final EnumC1412640mre LIZ;
    public final C1412390mrF LIZIZ;
    public final C532330KuF LIZJ;
    public final SummaryData LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C531550Ksz)) {
            return false;
        }
        C531550Ksz c531550Ksz = (C531550Ksz) obj;
        return this.LIZ == c531550Ksz.LIZ && Intrinsics.LJFF(this.LIZIZ, c531550Ksz.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c531550Ksz.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c531550Ksz.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CachedDetail(templateType=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", dispatchType=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", detail=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", summary=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C531550Ksz(EnumC1412640mre enumC1412640mre, C1412390mrF c1412390mrF, C532330KuF c532330KuF, SummaryData summaryData) {
        this.LIZ = enumC1412640mre;
        this.LIZIZ = c1412390mrF;
        this.LIZJ = c532330KuF;
        this.LIZLLL = summaryData;
    }
}
