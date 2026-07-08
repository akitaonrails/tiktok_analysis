package X;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.02s2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class C723202s2 extends AbstractC756202xM {
    public final C719302rP LLILZLL;
    public final String LLIZ;
    public final String LLIZLLLIL;

    public C723202s2() {
        this(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C723202s2) && Intrinsics.LJFF(this.LLILZLL, ((C723202s2) obj).LLILZLL);
    }

    public final int hashCode() {
        C719302rP c719302rP = this.LLILZLL;
        if (c719302rP == null) {
            return 0;
        }
        return c719302rP.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("SingleAggregationOrderVO(aggregationOrderVO=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getGroupId() {
        return this.LLIZ;
    }

    @Override // X.AbstractC756202xM, X.AbstractC723102s1
    public final String getItemId() {
        return this.LLIZLLLIL;
    }

    public C723202s2(C719302rP c719302rP) {
        this.LLILZLL = c719302rP;
        this.LLIZ = "shop_orders_new";
        this.LLIZLLLIL = "shop_orders_new_single_item";
    }

    @Override // X.AbstractC723102s1, X.InterfaceC1891350zJl
    public final boolean areItemTheSame(InterfaceC1891350zJl interfaceC1891350zJl) {
        if (interfaceC1891350zJl instanceof C723202s2) {
            return true;
        }
        return super.areItemTheSame(interfaceC1891350zJl);
    }
}
