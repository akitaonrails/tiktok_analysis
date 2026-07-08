package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0DOf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C338350DOf implements InterfaceC0148002o {
    public final AbstractC1623806Xk<List<InterfaceC339430DSj>> LL;

    public C338350DOf() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C338350DOf) && Intrinsics.LJFF(this.LL, ((C338350DOf) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchSchoolMembersListState(userItemsResponse=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public /* synthetic */ C338350DOf(int i) {
        this(C491101vh.LIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C338350DOf(AbstractC1623806Xk<? extends List<? extends InterfaceC339430DSj>> abstractC1623806Xk) {
        this.LL = abstractC1623806Xk;
    }
}
