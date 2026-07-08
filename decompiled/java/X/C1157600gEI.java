package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0gEI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1157600gEI {
    public final String LIZ;
    public final List<EnumC1597060rf6> LIZIZ;
    public final EnumC1154780g9k LIZJ;
    public final EnumC2492309ph LIZLLL;

    public C1157600gEI() {
        throw null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1157600gEI)) {
            return false;
        }
        C1157600gEI c1157600gEI = (C1157600gEI) obj;
        return Intrinsics.LJFF(this.LIZ, c1157600gEI.LIZ) && Intrinsics.LJFF(this.LIZIZ, c1157600gEI.LIZIZ) && this.LIZJ == c1157600gEI.LIZJ && this.LIZLLL == c1157600gEI.LIZLLL;
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FetcherStageConfig(id=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", fetcherBizTypes=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", commitMode=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", nextTriggerMode=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1157600gEI(String str, List list, EnumC1154780g9k enumC1154780g9k, int i) {
        EnumC2492309ph enumC2492309ph;
        enumC1154780g9k = (i & 4) != 0 ? EnumC1154780g9k.BATCH : enumC1154780g9k;
        if ((i & 8) != 0) {
            enumC2492309ph = EnumC2492309ph.AUTO;
        } else {
            enumC2492309ph = null;
        }
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = enumC1154780g9k;
        this.LIZLLL = enumC2492309ph;
    }
}
