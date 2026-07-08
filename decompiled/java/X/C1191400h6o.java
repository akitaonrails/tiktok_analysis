package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0h6o, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1191400h6o implements InterfaceC0148002o {
    public final EnumC1191410h6p LL;
    public final Long LLILLJJLI;

    public C1191400h6o() {
        this(null, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1191400h6o)) {
            return false;
        }
        C1191400h6o c1191400h6o = (C1191400h6o) obj;
        return this.LL == c1191400h6o.LL && Intrinsics.LJFF(this.LLILLJJLI, c1191400h6o.LLILLJJLI);
    }

    public final int hashCode() {
        EnumC1191410h6p enumC1191410h6p = this.LL;
        int iHashCode = (enumC1191410h6p == null ? 0 : enumC1191410h6p.hashCode()) * 31;
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

    public C1191400h6o(EnumC1191410h6p enumC1191410h6p, Long l) {
        this.LL = enumC1191410h6p;
        this.LLILLJJLI = l;
    }
}
