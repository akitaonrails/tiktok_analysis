package X;

import android.widget.LinearLayout;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0bsU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class C990320bsU {
    public final LinearLayout LIZ;
    public final List<AbstractC1914480zv4> LIZIZ;
    public final List<C443120HZe<String, String, AbstractC1914480zv4>> LIZJ;
    public final Set<String> LIZLLL;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C990320bsU)) {
            return false;
        }
        C990320bsU c990320bsU = (C990320bsU) obj;
        return Intrinsics.LJFF(this.LIZ, c990320bsU.LIZ) && Intrinsics.LJFF(this.LIZIZ, c990320bsU.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c990320bsU.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c990320bsU.LIZLLL);
    }

    public final int hashCode() {
        return (((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UniversalPopupBlockSetupResult(container=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", blockViews=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", radioBlockViews=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", unselectedGroups=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C990320bsU(LinearLayout linearLayout, List<? extends AbstractC1914480zv4> list, List<? extends C443120HZe<String, String, ? extends AbstractC1914480zv4>> list2, Set<String> set) {
        this.LIZ = linearLayout;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = set;
    }
}
