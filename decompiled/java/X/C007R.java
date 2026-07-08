package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.007R, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C007R implements InterfaceC1891350zJl {
    public final boolean LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C007R) && this.LL == ((C007R) obj).LL;
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return C786410Ut5.Z2(this.LL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("PaidContentRecommendHeader(showViewAll=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C007R(boolean z) {
        this.LL = z;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C007R) {
            if (((C007R) interfaceC1891350zJl).LL == this.LL) {
                return true;
            }
            return false;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C007R) {
            return true;
        }
        return Intrinsics.LJFF(interfaceC1891350zJl, this);
    }
}
