package X;

import java.util.UUID;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0NTe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C594440NTe implements InterfaceC2753014t {
    public final Function0<C0PFK> LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C594440NTe) && Intrinsics.LJFF(this.LL, ((C594440NTe) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SearchCardAdapterDataSourceSource(searchCardAdapterDataSource=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C594440NTe(Function0<? extends C0PFK> function0) {
        this.LL = function0;
        UUID.randomUUID().toString();
    }
}
