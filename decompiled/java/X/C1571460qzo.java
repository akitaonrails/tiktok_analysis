package X;

import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0qzo, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1571460qzo implements InterfaceC0148002o {
    public final AbstractC1623806Xk<EnumC221100tF> LL;
    public final AbstractC1623806Xk<Unit> LLILLJJLI;
    public final AbstractC1623806Xk<C1580650rEd> LLILLL;
    public final AbstractC1623806Xk<Object> LLILZ;
    public final AbstractC1623806Xk<String> LLILZIL;
    public final AbstractC1623806Xk<Boolean> LLILZLL;

    public C1571460qzo() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1571460qzo)) {
            return false;
        }
        C1571460qzo c1571460qzo = (C1571460qzo) obj;
        return Intrinsics.LJFF(this.LL, c1571460qzo.LL) && Intrinsics.LJFF(this.LLILLJJLI, c1571460qzo.LLILLJJLI) && Intrinsics.LJFF(this.LLILLL, c1571460qzo.LLILLL) && Intrinsics.LJFF(this.LLILZ, c1571460qzo.LLILZ) && Intrinsics.LJFF(this.LLILZIL, c1571460qzo.LLILZIL) && Intrinsics.LJFF(this.LLILZLL, c1571460qzo.LLILZLL);
    }

    public final int hashCode() {
        return (((((((((this.LL.hashCode() * 31) + this.LLILLJJLI.hashCode()) * 31) + this.LLILLL.hashCode()) * 31) + this.LLILZ.hashCode()) * 31) + this.LLILZIL.hashCode()) * 31) + this.LLILZLL.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("ShopMallMixState(loadDataStatus=");
        sbLIZ.append(this.LL);
        sbLIZ.append(", loadLynxStatus=");
        sbLIZ.append(this.LLILLJJLI);
        sbLIZ.append(", shoppingCartCard=");
        sbLIZ.append(this.LLILLL);
        sbLIZ.append(", shopCartTooltip=");
        sbLIZ.append(this.LLILZ);
        sbLIZ.append(", topBarContentStyle=");
        sbLIZ.append(this.LLILZIL);
        sbLIZ.append(", newCustomerState=");
        sbLIZ.append(this.LLILZLL);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ C1571460qzo(int i) {
        C491101vh c491101vh = C491101vh.LIZ;
        this(c491101vh, c491101vh, c491101vh, c491101vh, c491101vh, c491101vh);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C1571460qzo(AbstractC1623806Xk<? extends EnumC221100tF> abstractC1623806Xk, AbstractC1623806Xk<Unit> abstractC1623806Xk2, AbstractC1623806Xk<C1580650rEd> abstractC1623806Xk3, AbstractC1623806Xk<Object> abstractC1623806Xk4, AbstractC1623806Xk<String> abstractC1623806Xk5, AbstractC1623806Xk<Boolean> abstractC1623806Xk6) {
        this.LL = abstractC1623806Xk;
        this.LLILLJJLI = abstractC1623806Xk2;
        this.LLILLL = abstractC1623806Xk3;
        this.LLILZ = abstractC1623806Xk4;
        this.LLILZIL = abstractC1623806Xk5;
        this.LLILZLL = abstractC1623806Xk6;
    }

    public static C1571460qzo LIZ(C1571460qzo c1571460qzo, AbstractC1623806Xk abstractC1623806Xk, AbstractC1623806Xk abstractC1623806Xk2, AbstractC1623806Xk abstractC1623806Xk3, C1623606Xi c1623606Xi, int i) {
        AbstractC1623806Xk<Object> abstractC1623806Xk4;
        AbstractC1623806Xk<String> abstractC1623806Xk5 = c1623606Xi;
        AbstractC1623806Xk abstractC1623806Xk6 = abstractC1623806Xk3;
        AbstractC1623806Xk abstractC1623806Xk7 = abstractC1623806Xk2;
        AbstractC1623806Xk abstractC1623806Xk8 = abstractC1623806Xk;
        if ((i & 1) != 0) {
            abstractC1623806Xk8 = c1571460qzo.LL;
        }
        if ((i & 2) != 0) {
            abstractC1623806Xk7 = c1571460qzo.LLILLJJLI;
        }
        if ((i & 4) != 0) {
            abstractC1623806Xk6 = c1571460qzo.LLILLL;
        }
        AbstractC1623806Xk<Boolean> abstractC1623806Xk9 = null;
        if ((i & 8) != 0) {
            abstractC1623806Xk4 = c1571460qzo.LLILZ;
        } else {
            abstractC1623806Xk4 = null;
        }
        if ((i & 16) != 0) {
            abstractC1623806Xk5 = c1571460qzo.LLILZIL;
        }
        if ((i & 32) != 0) {
            abstractC1623806Xk9 = c1571460qzo.LLILZLL;
        }
        c1571460qzo.getClass();
        return new C1571460qzo(abstractC1623806Xk8, abstractC1623806Xk7, abstractC1623806Xk6, abstractC1623806Xk4, abstractC1623806Xk5, abstractC1623806Xk9);
    }
}
