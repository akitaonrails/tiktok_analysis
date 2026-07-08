package androidx.compose.animation;

import X.AbstractC1676640tjS;
import X.AbstractC1676650tjT;
import X.AbstractC1685820tyG;
import X.AbstractC20055413dY;
import X.C05P0;
import X.C05P1;
import X.C13FE;
import X.C1676510tjF;
import X.C1676530tjH;
import X.C1676540tjI;
import X.C1676550tjJ;
import X.C1676560tjK;
import X.C1676690tjX;
import X.C1676850tjn;
import X.C1676910tjt;
import X.C1677270tkT;
import X.C1677610tl1;
import X.C1682900ttY;
import X.C19991913Kb;
import X.C19992013Kc;
import X.C20028913Yh;
import X.EnumC1671200tag;
import X.EnumC1678550tmX;
import X.InterfaceC1668050tVb;
import X.InterfaceC1671880tbm;
import X.InterfaceC1675680thu;
import X.InterfaceC1676580tjM;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS391S0200000_25;
import kotlin.jvm.internal.AwS604S0100000_25;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes26.dex */
public final class AnimatedContentTransitionScopeImpl<S> implements InterfaceC1676580tjM<S> {
    public final C1676910tjt<S> LIZ;
    public InterfaceC1668050tVb LIZIZ;
    public EnumC1671200tag LIZJ;
    public final C05P0 LIZLLL = C20028913Yh.LJI(new C1682900ttY(0));
    public final C19991913Kb<S, C05P1<C1682900ttY>> LJ = C19992013Kc.LIZIZ();
    public C1676850tjn LJFF;

    public static final class SizeModifierElement<S> extends AbstractC1685820tyG<C1676560tjK<S>> {
        public final C1676910tjt<S>.a<C1682900ttY, C1677270tkT> LIZIZ;
        public final C05P1<InterfaceC1671880tbm> LIZJ;
        public final AnimatedContentTransitionScopeImpl<S> LIZLLL;

        @Override // X.AbstractC1685820tyG
        public final AbstractC20055413dY LJIJI() {
            return new C1676560tjK(this.LIZIZ, this.LIZJ, this.LIZLLL);
        }

        public final int hashCode() {
            int iHashCode = this.LIZLLL.hashCode() * 31;
            C1676910tjt<S>.a<C1682900ttY, C1677270tkT> aVar = this.LIZIZ;
            return ((iHashCode + (aVar != null ? aVar.hashCode() : 0)) * 31) + this.LIZJ.hashCode();
        }

        @Override // X.AbstractC1685820tyG
        public final void LJIJJ(AbstractC20055413dY abstractC20055413dY) {
            C1676560tjK c1676560tjK = (C1676560tjK) abstractC20055413dY;
            c1676560tjK.LLJJ = this.LIZIZ;
            c1676560tjK.LLJJI = this.LIZJ;
            c1676560tjK.LLJJIII = this.LIZLLL;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof SizeModifierElement) {
                SizeModifierElement sizeModifierElement = (SizeModifierElement) obj;
                if (Intrinsics.LJFF(sizeModifierElement.LIZIZ, this.LIZIZ) && Intrinsics.LJFF(sizeModifierElement.LIZJ, this.LIZJ)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public SizeModifierElement(C1676910tjt.a aVar, C05P0 c05p0, AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
            this.LIZIZ = aVar;
            this.LIZJ = c05p0;
            this.LIZLLL = animatedContentTransitionScopeImpl;
        }
    }

    @Override // X.InterfaceC1676620tjQ
    public final S LIZIZ() {
        return this.LIZ.LJFF().LIZIZ();
    }

    @Override // X.InterfaceC1676620tjQ
    public final S LIZJ() {
        return this.LIZ.LJFF().LIZJ();
    }

    public static final long LJI(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl) {
        C1676850tjn c1676850tjn = animatedContentTransitionScopeImpl.LJFF;
        if (c1676850tjn != null) {
            return ((C1682900ttY) c1676850tjn.getValue()).LIZ;
        }
        return ((C1682900ttY) ((C13FE) animatedContentTransitionScopeImpl.LIZLLL).getValue()).LIZ;
    }

    public final boolean LJII(int i) {
        if (i == 0 || ((i == 4 && this.LIZJ == EnumC1671200tag.Ltr) || (i == 5 && this.LIZJ == EnumC1671200tag.Rtl))) {
            return true;
        }
        return false;
    }

    public final boolean LJIIIIZZ(int i) {
        if (i != 1 && ((i != 4 || this.LIZJ != EnumC1671200tag.Rtl) && (i != 5 || this.LIZJ != EnumC1671200tag.Ltr))) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC1676620tjQ
    public final boolean LIZ(Object obj, Object obj2) {
        if (Intrinsics.LJFF(obj, LIZIZ()) && Intrinsics.LJFF(obj2, LIZJ())) {
            return true;
        }
        return false;
    }

    public AnimatedContentTransitionScopeImpl(C1676910tjt<S> c1676910tjt, InterfaceC1668050tVb interfaceC1668050tVb, EnumC1671200tag enumC1671200tag) {
        this.LIZ = c1676910tjt;
        this.LIZIZ = interfaceC1668050tVb;
        this.LIZJ = enumC1671200tag;
    }

    public static final long LJFF(AnimatedContentTransitionScopeImpl animatedContentTransitionScopeImpl, long j, long j2) {
        return animatedContentTransitionScopeImpl.LIZIZ.LIZ(j, j2, EnumC1671200tag.Ltr);
    }

    @Override // X.InterfaceC1676580tjM
    public final C1676540tjI LIZLLL(int i, InterfaceC1675680thu interfaceC1675680thu, Function1 function1) {
        if (LJII(i)) {
            AwS391S0200000_25 awS391S0200000_25 = new AwS391S0200000_25(this, function1, 1);
            C1677610tl1 c1677610tl1 = C1676510tjF.LIZ;
            return new C1676540tjI(new C1676690tjX(null, new C1676530tjH(interfaceC1675680thu, new AwS604S0100000_25((Function1) awS391S0200000_25, (Function1<? super EnumC1678550tmX, Boolean>) 546)), null, null, false, null, 61));
        }
        if (LJIIIIZZ(i)) {
            AwS391S0200000_25 awS391S0200000_252 = new AwS391S0200000_25(this, function1, 2);
            C1677610tl1 c1677610tl12 = C1676510tjF.LIZ;
            return new C1676540tjI(new C1676690tjX(null, new C1676530tjH(interfaceC1675680thu, new AwS604S0100000_25((Function1) awS391S0200000_252, (Function1<? super EnumC1678550tmX, Boolean>) 546)), null, null, false, null, 61));
        }
        if (i == 2) {
            return C1676510tjF.LJIILL(interfaceC1675680thu, new AwS391S0200000_25(this, function1, 3));
        }
        if (i == 3) {
            return C1676510tjF.LJIILL(interfaceC1675680thu, new AwS391S0200000_25(this, function1, 4));
        }
        return AbstractC1676640tjS.LIZ;
    }

    @Override // X.InterfaceC1676580tjM
    public final C1676550tjJ LJ(int i, InterfaceC1675680thu interfaceC1675680thu, Function1 function1) {
        if (LJII(i)) {
            AwS391S0200000_25 awS391S0200000_25 = new AwS391S0200000_25(this, function1, 5);
            C1677610tl1 c1677610tl1 = C1676510tjF.LIZ;
            return new C1676550tjJ(new C1676690tjX(null, new C1676530tjH(interfaceC1675680thu, new AwS604S0100000_25((Function1) awS391S0200000_25, (Function1<? super EnumC1678550tmX, Boolean>) 549)), null, null, false, null, 61));
        }
        if (LJIIIIZZ(i)) {
            AwS391S0200000_25 awS391S0200000_252 = new AwS391S0200000_25(this, function1, 6);
            C1677610tl1 c1677610tl12 = C1676510tjF.LIZ;
            return new C1676550tjJ(new C1676690tjX(null, new C1676530tjH(interfaceC1675680thu, new AwS604S0100000_25((Function1) awS391S0200000_252, (Function1<? super EnumC1678550tmX, Boolean>) 549)), null, null, false, null, 61));
        }
        if (i == 2) {
            return C1676510tjF.LJIJ(interfaceC1675680thu, new AwS391S0200000_25(this, function1, 7));
        }
        if (i == 3) {
            return C1676510tjF.LJIJ(interfaceC1675680thu, new AwS391S0200000_25(this, function1, 8));
        }
        return AbstractC1676650tjT.LIZ;
    }
}
