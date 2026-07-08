package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0fuK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class C1145220fuK implements InterfaceC0148002o {
    public final AbstractC1623806Xk<C1144610ftL> LL;

    public C1145220fuK() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1145220fuK) && Intrinsics.LJFF(this.LL, ((C1145220fuK) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UserSelectionPageState(data=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C1145220fuK(int i) {
        this(C491101vh.LIZ);
    }

    public C1145220fuK(AbstractC1623806Xk<C1144610ftL> abstractC1623806Xk) {
        this.LL = abstractC1623806Xk;
    }
}
