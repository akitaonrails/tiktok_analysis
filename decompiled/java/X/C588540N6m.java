package X;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0N6m, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C588540N6m extends AbstractC588570N6p {
    public final int LIZ;
    public final List<InterfaceC588620N6u> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C588540N6m)) {
            return false;
        }
        C588540N6m c588540N6m = (C588540N6m) obj;
        return this.LIZ == c588540N6m.LIZ && Intrinsics.LJFF(this.LIZIZ, c588540N6m.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        List<InterfaceC588620N6u> list = this.LIZIZ;
        return i + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("FragmentStatusIntent(currentEnable=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", allStatus=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C588540N6m(int i, List<? extends InterfaceC588620N6u> list) {
        this.LIZ = i;
        this.LIZIZ = list;
    }
}
