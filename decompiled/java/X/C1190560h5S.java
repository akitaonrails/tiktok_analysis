package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h5S, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1190560h5S implements InterfaceC0148002o {
    public final EnumC1190580h5U LL;
    public final Long LLILLJJLI;

    public C1190560h5S() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1190560h5S)) {
            return false;
        }
        C1190560h5S c1190560h5S = (C1190560h5S) obj;
        return this.LL == c1190560h5S.LL && Intrinsics.LJFF(this.LLILLJJLI, c1190560h5S.LLILLJJLI);
    }

    public final int hashCode() {
        EnumC1190580h5U enumC1190580h5U = this.LL;
        int iHashCode = (enumC1190580h5U == null ? 0 : enumC1190580h5U.hashCode()) * 31;
        Long l = this.LLILLJJLI;
        return iHashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PoiReviewHelpfulVMState(reviewStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", likedCount=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1190560h5S(EnumC1190580h5U enumC1190580h5U, Long l) {
        this.LL = enumC1190580h5U;
        this.LLILLJJLI = l;
    }
}
