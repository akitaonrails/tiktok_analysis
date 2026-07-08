package X;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0tLY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1661820tLY {
    public final boolean LIZ;
    public final List<C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>> LIZIZ;
    public final List<C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>> LIZJ;
    public final Function2<AbstractC1678220tm0, InterfaceC1660090tIl, Unit> LIZLLL;
    public final int LJ;
    public final C1683130ttv LJFF;
    public final boolean LJI;
    public final boolean LJII;

    public C1661820tLY() {
        this(null, 255);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1661820tLY)) {
            return false;
        }
        C1661820tLY c1661820tLY = (C1661820tLY) obj;
        return this.LIZ == c1661820tLY.LIZ && Intrinsics.LJFF(this.LIZIZ, c1661820tLY.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c1661820tLY.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c1661820tLY.LIZLLL) && this.LJ == c1661820tLY.LJ && Intrinsics.LJFF(this.LJFF, c1661820tLY.LJFF) && this.LJI == c1661820tLY.LJI && this.LJII == c1661820tLY.LJII;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C1661820tLY(C1683130ttv c1683130ttv, int i) {
        boolean z;
        C13BV c13bv;
        C13BV c13bv2;
        int size;
        boolean z2;
        C1683130ttv c1683130ttv2 = c1683130ttv;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if ((i & 2) != 0) {
            c13bv = C13BV.INSTANCE;
        } else {
            c13bv = null;
        }
        if ((i & 4) != 0) {
            c13bv2 = C13BV.INSTANCE;
        } else {
            c13bv2 = null;
        }
        AFwS311S0000000_25 aFwS311S0000000_25 = (i & 8) != 0 ? AFwS311S0000000_25.get$arr$(18) : null;
        if ((i & 16) != 0) {
            size = 7 - c13bv.size();
        } else {
            size = 0;
        }
        c1683130ttv2 = (i & 32) != 0 ? C1683130ttv.LJ : c1683130ttv2;
        if ((i & 128) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this(z, c13bv, c13bv2, aFwS311S0000000_25, size, c1683130ttv2, false, z2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1661820tLY(boolean z, List<C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>> list, List<C1661930tLj<AbstractC1678220tm0, InterfaceC1461640o8g<? extends AbstractC1678220tm0>>> list2, Function2<? super AbstractC1678220tm0, ? super InterfaceC1660090tIl, Unit> function2, int i, C1683130ttv c1683130ttv, boolean z2, boolean z3) {
        this.LIZ = z;
        this.LIZIZ = list;
        this.LIZJ = list2;
        this.LIZLLL = function2;
        this.LJ = i;
        this.LJFF = c1683130ttv;
        this.LJI = z2;
        this.LJII = z3;
    }
}
