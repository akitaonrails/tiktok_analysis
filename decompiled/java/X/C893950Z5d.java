package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Z5d, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class C893950Z5d implements InterfaceC111300bX {
    public final C0ZBL LL;
    public final List<AbstractC894380Z6u<?>> LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C893950Z5d)) {
            return false;
        }
        C893950Z5d c893950Z5d = (C893950Z5d) obj;
        return this.LL == c893950Z5d.LL && Intrinsics.LJFF(this.LLILLJJLI, c893950Z5d.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ActionGroupHierarchyData(layoutDirection=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", actions=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C893950Z5d(C0ZBL c0zbl, List<? extends AbstractC894380Z6u<?>> list) {
        this.LL = c0zbl;
        this.LLILLJJLI = list;
    }
}
