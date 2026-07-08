package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0r2W, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1573140r2W implements InterfaceC1272104yN {
    public final C1573130r2V LL;

    @Override // X.InterfaceC1272104yN
    public final boolean LJJIJIL() {
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1573140r2W) && Intrinsics.LJFF(this.LL, ((C1573140r2W) obj).LL);
    }

    @Override // X.InterfaceC1891350zJl
    public final Object getChangePayload(InterfaceC1891350zJl interfaceC1891350zJl) {
        return null;
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SeriesVipSubscriptionPlanSelectorItem(planSelector=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C1573140r2W(C1573130r2V c1573130r2V) {
        this.LL = c1573130r2V;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areContentsTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if ((interfaceC1891350zJl instanceof C1573140r2W) && Intrinsics.LJFF(((C1573140r2W) interfaceC1891350zJl).LL, this.LL)) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return interfaceC1891350zJl instanceof C1573140r2W;
    }
}
