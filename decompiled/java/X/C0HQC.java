package X;

import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS289S0000000_6;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0HQC, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HQC {
    public final String LIZ;
    public final List<C443120HZe<Integer, String, C05YD<C0HOM<? extends C440440HOw>>>> LIZIZ;
    public final Function2<Set<? extends C443120HZe<Integer, String, ? extends C05YD<? extends C0HOM<? extends C440440HOw>>>>, C443120HZe<Integer, String, ? extends C05YD<? extends C0HOM<? extends C440440HOw>>>, C0HQE<Set<C443120HZe<Integer, String, C05YD<C0HOM<? extends C440440HOw>>>>, Integer>> LIZJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0HQC)) {
            return false;
        }
        C0HQC c0hqc = (C0HQC) obj;
        return Intrinsics.LJFF(this.LIZ, c0hqc.LIZ) && Intrinsics.LJFF(this.LIZIZ, c0hqc.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c0hqc.LIZJ);
    }

    public final int hashCode() {
        return (((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("IdConfiguration(title=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", ids=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", selectionStrategy=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0HQC(String str, List list, AFwS289S0000000_6 aFwS289S0000000_6) {
        this.LIZ = str;
        this.LIZIZ = list;
        this.LIZJ = aFwS289S0000000_6;
    }
}
