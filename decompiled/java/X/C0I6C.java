package X;

import android.view.View;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0I6C, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I6C {
    public final View LIZ;
    public final C0I60 LIZIZ;
    public final List<C1562980qm8<C0ZL0>> LIZJ;
    public final List<Integer> LIZLLL;
    public final List<Integer> LJ;
    public final List<Integer> LJFF;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0I6C)) {
            return false;
        }
        C0I6C c0i6c = (C0I6C) obj;
        return Intrinsics.LJFF(this.LIZ, c0i6c.LIZ) && this.LIZIZ == c0i6c.LIZIZ && Intrinsics.LJFF(this.LIZJ, c0i6c.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c0i6c.LIZLLL) && Intrinsics.LJFF(this.LJ, c0i6c.LJ) && Intrinsics.LJFF(this.LJFF, c0i6c.LJFF);
    }

    public final int hashCode() {
        return (((((((((this.LIZ.hashCode() * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31) + this.LJFF.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SimpleLongClickConfig(target=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", position=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", actions=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", toHideMessageComponents=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", requireHeightAdjustmentBottomComponents=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", requireHeightAdjustmentTopComponents=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public C0I6C(View view, C0I60 c0i60, List<C1562980qm8<C0ZL0>> list, List<Integer> list2, List<Integer> list3, List<Integer> list4) {
        this.LIZ = view;
        this.LIZIZ = c0i60;
        this.LIZJ = list;
        this.LIZLLL = list2;
        this.LJ = list3;
        this.LJFF = list4;
    }
}
