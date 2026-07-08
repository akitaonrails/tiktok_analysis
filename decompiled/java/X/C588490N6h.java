package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N6h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C588490N6h extends AbstractC588520N6k {
    public final int LIZ;
    public final List<InterfaceC588530N6l> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C588490N6h)) {
            return false;
        }
        C588490N6h c588490N6h = (C588490N6h) obj;
        return this.LIZ == c588490N6h.LIZ && Intrinsics.LJFF(this.LIZIZ, c588490N6h.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        List<InterfaceC588530N6l> list = this.LIZIZ;
        return i + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("StatusIntent(currentEnable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", allStatus=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C588490N6h(int i, List<? extends InterfaceC588530N6l> list) {
        this.LIZ = i;
        this.LIZIZ = list;
    }
}
