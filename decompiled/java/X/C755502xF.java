package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02xF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C755502xF extends AbstractC756202xM {
    public final C722302rt LLILZLL;
    public final C720002rW LLIZ;
    public final C035M LLIZLLLIL;
    public final boolean LLJ;
    public final Boolean LLJI;
    public final boolean LLJIJIL;
    public final String LLJILJIL;
    public final String LLJILJILJ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C755502xF)) {
            return false;
        }
        C755502xF c755502xF = (C755502xF) obj;
        return Intrinsics.LJFF(this.LLILZLL, c755502xF.LLILZLL) && Intrinsics.LJFF(this.LLIZ, c755502xF.LLIZ) && Intrinsics.LJFF(this.LLIZLLLIL, c755502xF.LLIZLLLIL) && this.LLJ == c755502xF.LLJ && Intrinsics.LJFF(this.LLJI, c755502xF.LLJI) && this.LLJIJIL == c755502xF.LLJIJIL;
    }

    public final int hashCode() {
        int iHashCode = this.LLILZLL.hashCode() * 31;
        C720002rW c720002rW = this.LLIZ;
        int iHashCode2 = (iHashCode + (c720002rW == null ? 0 : c720002rW.hashCode())) * 31;
        C035M c035m = this.LLIZLLLIL;
        int iHashCode3 = (((iHashCode2 + (c035m == null ? 0 : c035m.hashCode())) * 31) + C786410Ut5.Z2(this.LLJ)) * 31;
        Boolean bool = this.LLJI;
        return ((iHashCode3 + (bool != null ? bool.hashCode() : 0)) * 31) + C786410Ut5.Z2(this.LLJIJIL);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("USOrderSummaryVO(summaryVO=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(", discountsVO=");
        sbLIZ.append(this.LLIZ);
        sbLIZ.append(", donationVO=");
        sbLIZ.append(this.LLIZLLLIL);
        sbLIZ.append(", isShowSkeleton=");
        sbLIZ.append(this.LLJ);
        sbLIZ.append(", isPreHandle=");
        sbLIZ.append(this.LLJI);
        sbLIZ.append(", titleSmallStyle=");
        sbLIZ.append(this.LLJIJIL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getGroupId() {
        return this.LLJILJIL;
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getItemId() {
        return this.LLJILJILJ;
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        return Intrinsics.LJFF(C755502xF.class, interfaceC1891350zJl.getClass());
    }

    public static C755502xF LIZIZ(C755502xF c755502xF, C722302rt c722302rt, boolean z, int i) {
        C720002rW c720002rW;
        C035M c035m;
        boolean z2;
        boolean z3 = z;
        C722302rt c722302rt2 = c722302rt;
        if ((i & 1) != 0) {
            c722302rt2 = c755502xF.LLILZLL;
        }
        Boolean bool = null;
        if ((i & 2) != 0) {
            c720002rW = c755502xF.LLIZ;
        } else {
            c720002rW = null;
        }
        if ((i & 4) != 0) {
            c035m = c755502xF.LLIZLLLIL;
        } else {
            c035m = null;
        }
        if ((i & 8) != 0) {
            z3 = c755502xF.LLJ;
        }
        if ((i & 16) != 0) {
            bool = c755502xF.LLJI;
        }
        if ((i & 32) != 0) {
            z2 = c755502xF.LLJIJIL;
        } else {
            z2 = false;
        }
        c755502xF.getClass();
        return new C755502xF(c722302rt2, c720002rW, c035m, z3, bool, z2);
    }

    public /* synthetic */ C755502xF(C722302rt c722302rt, C720002rW c720002rW, C035M c035m, Boolean bool, boolean z, int i) {
        this(c722302rt, c720002rW, (i & 4) != 0 ? null : c035m, false, (i & 16) == 0 ? bool : null, (i & 32) != 0 ? false : z);
    }

    public C755502xF(C722302rt c722302rt, C720002rW c720002rW, C035M c035m, boolean z, Boolean bool, boolean z2) {
        this.LLILZLL = c722302rt;
        this.LLIZ = c720002rW;
        this.LLIZLLLIL = c035m;
        this.LLJ = z;
        this.LLJI = bool;
        this.LLJIJIL = z2;
        this.LLJILJIL = "order_summary";
        this.LLJILJILJ = "order_summary_item";
    }
}
