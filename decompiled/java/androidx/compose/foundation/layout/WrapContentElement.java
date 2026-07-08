package androidx.compose.foundation.layout;

import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1676820tjk;
import X.C1682900ttY;
import X.C1683980tvI;
import X.C786410Ut5;
import X.EnumC1671200tag;
import X.EnumC1683990tvJ;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class WrapContentElement extends AbstractC1685820tyG<C1683980tvI> {
    public static final /* synthetic */ int LJFF = 0;
    public final EnumC1683990tvJ LIZIZ;
    public final boolean LIZJ;
    public final Function2<C1682900ttY, EnumC1671200tag, C1676820tjk> LIZLLL;
    public final Object LJ;

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1683980tvI(this.LIZIZ, this.LIZJ, this.LIZLLL);
    }

    public final int hashCode() {
        return (((this.LIZIZ.hashCode() * 31) + C786410Ut5.Z2(this.LIZJ)) * 31) + this.LJ.hashCode();
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C1683980tvI c1683980tvI = (C1683980tvI) abstractC20055413dY;
        c1683980tvI.LLJJ = this.LIZIZ;
        c1683980tvI.LLJJI = this.LIZJ;
        c1683980tvI.LLJJIII = this.LIZLLL;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || WrapContentElement.class != obj.getClass()) {
            return false;
        }
        WrapContentElement wrapContentElement = (WrapContentElement) obj;
        if (this.LIZIZ == wrapContentElement.LIZIZ && this.LIZJ == wrapContentElement.LIZJ && Intrinsics.LJFF(this.LJ, wrapContentElement.LJ)) {
            return true;
        }
        return false;
    }

    public WrapContentElement(EnumC1683990tvJ enumC1683990tvJ, boolean z, Function2 function2, Object obj) {
        this.LIZIZ = enumC1683990tvJ;
        this.LIZJ = z;
        this.LIZLLL = function2;
        this.LJ = obj;
    }
}
