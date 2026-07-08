package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Z5T, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z5T implements InterfaceC111300bX {
    public final List<C893950Z5d> LL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0Z5T) && Intrinsics.LJFF(this.LL, ((C0Z5T) obj).LL);
    }

    public final int hashCode() {
        return this.LL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ChatDetailHierarchyData(groups=");
        sbLIZ.append(this.LL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0Z5T(List<C893950Z5d> list) {
        this.LL = list;
    }
}
