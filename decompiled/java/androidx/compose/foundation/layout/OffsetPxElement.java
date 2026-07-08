package androidx.compose.foundation.layout;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1676820tjk;
import X.C1688590u2j;
import X.C1688620u2m;
import X.C20052513d5;
import X.C2188811AlT;
import X.C786410Ut5;
import X.InterfaceC1690500u5o;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes26.dex */
public final class OffsetPxElement extends AbstractC1685820tyG<C1688590u2j> {
    public final Function1<InterfaceC1690500u5o, C1676820tjk> LIZIZ;
    public final boolean LIZJ;
    public final Function1<C1688620u2m, Unit> LIZLLL;

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1688590u2j(this.LIZIZ, this.LIZJ);
    }

    public final int hashCode() {
        return (this.LIZIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZJ);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("OffsetPxModifier(offset=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", rtlAware=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C1688590u2j c1688590u2j = (C1688590u2j) abstractC20055413dY;
        Function1<InterfaceC1690500u5o, C1676820tjk> function1 = this.LIZIZ;
        boolean z = this.LIZJ;
        if (c1688590u2j.LLJJ != function1 || c1688590u2j.LLJJI != z) {
            C20052513d5.LJFF(c1688590u2j).LJJL(false);
        }
        c1688590u2j.LLJJ = function1;
        c1688590u2j.LLJJI = z;
    }

    public final boolean equals(Object obj) {
        OffsetPxElement offsetPxElement;
        if (this == obj) {
            return true;
        }
        if (obj instanceof OffsetPxElement) {
            offsetPxElement = (OffsetPxElement) obj;
        } else {
            offsetPxElement = null;
        }
        if (offsetPxElement != null && this.LIZIZ == offsetPxElement.LIZIZ && this.LIZJ == offsetPxElement.LIZJ) {
            return true;
        }
        return false;
    }

    public OffsetPxElement(Function1 function1, Function1 function12, boolean z) {
        this.LIZIZ = function1;
        this.LIZJ = z;
        this.LIZLLL = function12;
    }
}
