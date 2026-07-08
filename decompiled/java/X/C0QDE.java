package X;

import kotlin.jvm.internal.AFwS293S0000000_10;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0QDE, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QDE implements C0PWT {
    public final int LL;
    public final String LLILLJJLI;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0QDE)) {
            return false;
        }
        C0QDE c0qde = (C0QDE) obj;
        return this.LL == c0qde.LL && Intrinsics.LJFF(this.LLILLJJLI, c0qde.LLILLJJLI);
    }

    public final int hashCode() {
        return (this.LL * 31) + this.LLILLJJLI.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("UpdateSearchDetailCurrentRankInViewPagerAction(rankInViewPager=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", aidInViewPager=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    static {
        C0Q3E.LJFF().ov1().LIZIZ(C13LE.LIZ(C0QDE.class), AFwS293S0000000_10.get$arr$(174));
    }

    @Override // X.C0PWT
    public final boolean isLog() {
        return C0P9U.LIZ();
    }

    public C0QDE(int i, String str) {
        this.LL = i;
        this.LLILLJJLI = str;
    }
}
