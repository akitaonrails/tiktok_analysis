package X;

import X.C0RAA;
import X.InterfaceC1604490rr5;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AFwS221S0000000_31;

/* JADX INFO: renamed from: X.15cz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public abstract class AbstractC20561515cz<P extends InterfaceC1604490rr5, R extends C0RAA> implements InterfaceC20562615dA {
    public final EnumC1783170wVH LL = EnumC1783170wVH.MANAGER;
    public final CopyOnWriteArrayList<InterfaceC20561815d2<R>> LLILLJJLI = new CopyOnWriteArrayList<>();
    public P LLILLL;
    public R LLILZ;

    public abstract void LIZJ(P p);

    @Override // X.InterfaceC20562615dA
    public EnumC1783170wVH getNodeType() {
        return this.LL;
    }

    public final void LIZLLL(C0RAA c0raa) {
        Iterator<InterfaceC20561815d2<R>> it2 = this.LLILLJJLI.iterator();
        while (it2.hasNext()) {
            it2.next().LIZ(c0raa);
        }
    }

    public final void LJ(InterfaceC20561815d2<R> interfaceC20561815d2) {
        this.LLILLJJLI.remove(interfaceC20561815d2);
    }

    public final void LIZIZ(final InterfaceC20561815d2<R> interfaceC20561815d2, boolean z, boolean z2) {
        if (z2) {
            this.LLILLJJLI.add((InterfaceC20561815d2<R>) new InterfaceC20561815d2<R>(interfaceC20561815d2) { // from class: X.15d0
                public final WeakReference<InterfaceC20561815d2<R>> LIZ;

                {
                    this.LIZ = new WeakReference<>(interfaceC20561815d2);
                }

                @Override // X.InterfaceC20561815d2
                public final void LIZ(R r) {
                    InterfaceC20561815d2<R> interfaceC20561815d22 = this.LIZ.get();
                    if (interfaceC20561815d22 != null) {
                        interfaceC20561815d22.LIZ(r);
                    }
                }
            });
        } else {
            this.LLILLJJLI.add(interfaceC20561815d2);
        }
        if (z) {
            interfaceC20561815d2.LIZ(this.LLILZ);
        }
    }

    @Override // X.InterfaceC20562615dA
    public final void Ui(Function0<String> function0, InterfaceC1604490rr5 interfaceC1604490rr5, C0RAA c0raa) {
        C20569715eJ.LJIIIZ(this, function0, interfaceC1604490rr5, c0raa);
    }

    @Override // X.InterfaceC20562615dA
    public final void ah(Function0<String> function0, InterfaceC1604490rr5 interfaceC1604490rr5, C0RAA c0raa) {
        C20569715eJ.LJII(this, function0, interfaceC1604490rr5, c0raa);
    }

    @Override // X.InterfaceC20562615dA
    public final void em(Function0<String> function0, InterfaceC1604490rr5 interfaceC1604490rr5, C0RAA c0raa) {
        C20569715eJ.LJIIJJI(this, function0, interfaceC1604490rr5, c0raa);
    }

    public final void LJFF(C0T9Y c0t9y, InterfaceC1604490rr5 interfaceC1604490rr5, C0RAA c0raa, Function0<? extends Object> function0) {
        C20569715eJ.LJIILIIL(this, c0t9y, interfaceC1604490rr5, c0raa, (AFwS221S0000000_31) function0);
    }

    @Override // X.InterfaceC20562615dA
    public final void Lj(C0T9Y c0t9y, InterfaceC1604490rr5 interfaceC1604490rr5, C0RAA c0raa, Function0<? extends Object> function0) {
        C20569715eJ.LJ(this, c0t9y, interfaceC1604490rr5, c0raa, function0);
    }

    @Override // X.InterfaceC20562615dA
    public final void y5(C0T9Y c0t9y, InterfaceC1604490rr5 interfaceC1604490rr5, C0RAA c0raa, Function0<? extends Object> function0) {
        C20569715eJ.LIZJ(this, c0t9y, interfaceC1604490rr5, c0raa, function0);
    }

    @Override // X.InterfaceC20562615dA
    public final void zb(C0T9Y c0t9y, InterfaceC1604490rr5 interfaceC1604490rr5, C0RAA c0raa, Function0<? extends Object> function0) {
        C20569715eJ.LIZ(this, c0t9y, interfaceC1604490rr5, c0raa, function0);
    }
}
