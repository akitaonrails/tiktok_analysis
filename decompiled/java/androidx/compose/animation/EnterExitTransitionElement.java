package androidx.compose.animation;

import X.AbstractC1676640tjS;
import X.AbstractC1676650tjT;
import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C1676750tjd;
import X.C1676820tjk;
import X.C1676910tjt;
import X.C1677270tkT;
import X.C1682900ttY;
import X.C2188811AlT;
import X.EnumC1676720tja;
import X.InterfaceC1676780tjg;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class EnterExitTransitionElement extends AbstractC1685820tyG<C1676750tjd> {
    public final C1676910tjt<EnumC1676720tja> LIZIZ;
    public final C1676910tjt<EnumC1676720tja>.a<C1682900ttY, C1677270tkT> LIZJ;
    public final C1676910tjt<EnumC1676720tja>.a<C1676820tjk, C1677270tkT> LIZLLL;
    public final C1676910tjt<EnumC1676720tja>.a<C1676820tjk, C1677270tkT> LJ;
    public final AbstractC1676640tjS LJFF;
    public final AbstractC1676650tjT LJI;
    public final Function0<Boolean> LJII;
    public final InterfaceC1676780tjg LJIIIIZZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return Intrinsics.LJFF(this.LIZIZ, enterExitTransitionElement.LIZIZ) && Intrinsics.LJFF(this.LIZJ, enterExitTransitionElement.LIZJ) && Intrinsics.LJFF(this.LIZLLL, enterExitTransitionElement.LIZLLL) && Intrinsics.LJFF(this.LJ, enterExitTransitionElement.LJ) && Intrinsics.LJFF(this.LJFF, enterExitTransitionElement.LJFF) && Intrinsics.LJFF(this.LJI, enterExitTransitionElement.LJI) && Intrinsics.LJFF(this.LJII, enterExitTransitionElement.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, enterExitTransitionElement.LJIIIIZZ);
    }

    public final int hashCode() {
        int iHashCode = this.LIZIZ.hashCode() * 31;
        C1676910tjt<EnumC1676720tja>.a<C1682900ttY, C1677270tkT> aVar = this.LIZJ;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        C1676910tjt<EnumC1676720tja>.a<C1676820tjk, C1677270tkT> aVar2 = this.LIZLLL;
        int iHashCode3 = (iHashCode2 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        C1676910tjt<EnumC1676720tja>.a<C1676820tjk, C1677270tkT> aVar3 = this.LJ;
        return ((((((((iHashCode3 + (aVar3 != null ? aVar3.hashCode() : 0)) * 31) + this.LJFF.hashCode()) * 31) + this.LJI.hashCode()) * 31) + this.LJII.hashCode()) * 31) + this.LJIIIIZZ.hashCode();
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("EnterExitTransitionElement(transition=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", sizeAnimation=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", offsetAnimation=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", slideAnimation=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", enter=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", exit=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", isEnabled=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", graphicsLayerBlock=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    @Override // X.AbstractC1685820tyG
    public final AbstractC20055413dY LJIJI() {
        return new C1676750tjd(this.LIZIZ, this.LIZJ, this.LIZLLL, this.LJ, this.LJFF, this.LJI, this.LJII, this.LJIIIIZZ);
    }

    @Override // X.AbstractC1685820tyG
    public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
        C1676750tjd c1676750tjd = (C1676750tjd) abstractC20055413dY;
        c1676750tjd.LLJJ = this.LIZIZ;
        c1676750tjd.LLJJI = this.LIZJ;
        c1676750tjd.LLJJIII = this.LIZLLL;
        c1676750tjd.LLJJIJI = this.LJ;
        c1676750tjd.LLJJIJIIJIL = this.LJFF;
        c1676750tjd.LLJJIJIL = this.LJI;
        c1676750tjd.LLJJJ = this.LJII;
        c1676750tjd.LLJJJIL = this.LJIIIIZZ;
    }

    public EnterExitTransitionElement(C1676910tjt<EnumC1676720tja> c1676910tjt, C1676910tjt<EnumC1676720tja>.a<C1682900ttY, C1677270tkT> aVar, C1676910tjt<EnumC1676720tja>.a<C1676820tjk, C1677270tkT> aVar2, C1676910tjt<EnumC1676720tja>.a<C1676820tjk, C1677270tkT> aVar3, AbstractC1676640tjS abstractC1676640tjS, AbstractC1676650tjT abstractC1676650tjT, Function0<Boolean> function0, InterfaceC1676780tjg interfaceC1676780tjg) {
        this.LIZIZ = c1676910tjt;
        this.LIZJ = aVar;
        this.LIZLLL = aVar2;
        this.LJ = aVar3;
        this.LJFF = abstractC1676640tjS;
        this.LJI = abstractC1676650tjT;
        this.LJII = function0;
        this.LJIIIIZZ = interfaceC1676780tjg;
    }
}
