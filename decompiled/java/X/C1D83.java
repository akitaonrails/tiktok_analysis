package X;

import java.util.ArrayList;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS401S0200000_35;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.1D83, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D83 implements C1D89 {
    public final /* synthetic */ AwS579S0100000_35 LIZ;

    @Override // X.C1D89
    public final void LJIILJJIL() {
        C1D82 c1d82 = (C1D82) this.LIZ.l0;
        C2250771D7r c2250771D7r = new C2250771D7r((C1D82) this.LIZ.l0);
        C157K c157k = C157K.LJIIIIZZ;
        InterfaceC20334914hX interfaceC20334914hX = c1d82.LJIIJ;
        C1D80 c1d80 = c1d82.LIZ.LIZLLL;
        c157k.LIZIZ(interfaceC20334914hX, new C157M(c2250771D7r, c1d80.LJIIL, c1d80.LJIILIIL, c1d82.LJI, c1d82.LJIIL, c1d82.LJIIJ));
    }

    @Override // X.C1D89
    public final void onStart() {
        C1404610meh c1404610mehLIZ = ((C1D82) this.LIZ.l0).LIZ.LIZ();
        if (Intrinsics.LJFF(((C1D82) this.LIZ.l0).LJIIL, C2250801D7u.LIZ)) {
            C1D82 c1d82 = (C1D82) this.LIZ.l0;
            c1d82.LIZJ = c1d82.LJIILIIL.invoke();
            ((C1D82) this.LIZ.l0).LIZJ.LJFF(c1404610mehLIZ, new C1D85((C1D82) this.LIZ.l0));
        } else {
            C1D82 c1d822 = (C1D82) this.LIZ.l0;
            c1d822.LIZ.LIZLLL(new C556240Lri(c1d822.LJIIL, c1404610mehLIZ, new C556300Lro(0)));
            ((C1D82) this.LIZ.l0).LJIIIIZZ("onStart", new AwS401S0200000_35(this, c1404610mehLIZ, 5));
        }
    }

    public C1D83(AwS579S0100000_35 awS579S0100000_35) {
        this.LIZ = awS579S0100000_35;
    }

    @Override // X.C1D89
    public final void LIZ(Object obj) {
        if (Intrinsics.LJFF(((C1D82) this.LIZ.l0).LJIIL, C2250801D7u.LIZ)) {
            return;
        }
        C1D82 c1d82 = (C1D82) this.LIZ.l0;
        c1d82.LIZ.LIZLLL(new C556220Lrg(new C556300Lro(0), c1d82.LJIIL, obj));
    }

    public final void LIZIZ(String str) {
        C1D84 c1d84 = ((C1D82) this.LIZ.l0).LIZ.LIZLLL.LJIILJJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("Node:");
        sbLIZ.append(((C1D82) this.LIZ.l0).LJIIL);
        sbLIZ.append(' ');
        sbLIZ.append(str);
        c1d84.LIZIZ(777002, C2188811AlT.LIZIZ(sbLIZ), null);
    }

    @Override // X.C1D89
    public final void LJIIIZ(AbstractC1404540mea abstractC1404540mea) {
        if (Intrinsics.LJFF(((C1D82) this.LIZ.l0).LJIIL, C2250801D7u.LIZ)) {
            return;
        }
        C1D82 c1d82 = (C1D82) this.LIZ.l0;
        c1d82.LIZ.LIZLLL(new C556150LrZ(c1d82.LJIIL, new C556300Lro(0), abstractC1404540mea));
        ((C1D82) this.LIZ.l0).LJIIIIZZ("onCancel", new AwS401S0200000_35(this, abstractC1404540mea, 2));
    }

    @Override // X.C1D89
    public final void LJIIJJI(Object obj) {
        if (Intrinsics.LJFF(((C1D82) this.LIZ.l0).LJIIL, C2250801D7u.LIZ)) {
            return;
        }
        C1D82 c1d82 = (C1D82) this.LIZ.l0;
        if (c1d82.LIZLLL) {
            c1d82.LIZ.LIZLLL(new C556170Lrb(c1d82.LJIIL, new C556300Lro(0)));
        }
        ((C1D82) this.LIZ.l0).LJIIIIZZ("onPause", new AwS401S0200000_35(this, obj, 3));
    }

    @Override // X.C1D89
    public final void LJIJ(Object obj) {
        C1D82 c1d82 = (C1D82) this.LIZ.l0;
        c1d82.LJ++;
        C1404610meh c1404610mehLIZ = c1d82.LIZ.LIZ();
        C1D84 c1d84 = ((C1D82) this.LIZ.l0).LIZ.LIZLLL.LJIILJJIL;
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("onRestart: ");
        sbLIZ.append(((C1D82) this.LIZ.l0).LJIIL);
        sbLIZ.append(" restart, restart count = ");
        sbLIZ.append(((C1D82) this.LIZ.l0).LJ);
        c1d84.LIZ(C2188811AlT.LIZIZ(sbLIZ));
        ArrayList arrayList = new ArrayList(c1404610mehLIZ.LIZ);
        if (obj != null) {
            arrayList.add(obj);
        }
        C1404610meh c1404610meh = new C1404610meh(arrayList);
        C1D82 c1d822 = (C1D82) this.LIZ.l0;
        C2250851D7z c2250851D7z = c1d822.LIZ;
        final Object obj2 = c1d822.LJIIL;
        final C556300Lro c556300Lro = new C556300Lro(0);
        c2250851D7z.LIZIZ(new C556200Lre(new C556300Lro(0), obj2, new AbstractC556140LrY(obj2, c556300Lro) { // from class: X.0Lrc
            public final String toString() {
                StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                sbLIZ2.append(this.LIZ);
                sbLIZ2.append(" Msg-BeforeRestart info:");
                sbLIZ2.append(this.LIZJ);
                return C2188811AlT.LIZIZ(sbLIZ2);
            }
        }), EnumC2251001D8o.ALL);
        ((C1D82) this.LIZ.l0).LJIIIIZZ("onRestart", new AwS401S0200000_35(this, c1404610meh, 4));
    }

    @Override // X.C1D89
    public final void LJI(Function1 function1, Object obj) {
        if (Intrinsics.LJFF(((C1D82) this.LIZ.l0).LJIIL, C2250801D7u.LIZ)) {
            return;
        }
        ((C1D82) this.LIZ.l0).getClass();
        C1D82 c1d82 = (C1D82) this.LIZ.l0;
        C1D8F c1d8f = c1d82.LJIIIZ;
        if (c1d8f instanceof C1D8E) {
            function1.invoke(c1d8f);
            C1D8E c1d8e = (C1D8E) c1d8f;
            ((C1D82) this.LIZ.l0).LIZ.LJ(c1d8e.LIZIZ, c1d8e.LIZJ, c1d8f.LIZ);
            return;
        }
        if (c1d8f instanceof C1D8D) {
            function1.invoke(c1d8f);
            ((C1D82) this.LIZ.l0).LIZ.LIZJ(((C1D8D) c1d8f).LIZIZ, c1d8f.LIZ);
        } else {
            c1d82.LJIIIIZZ("onResume", new AwS401S0200000_35(this, obj, 6));
        }
    }

    @Override // X.C1D89
    public final void LJFF(C1435220nS4 c1435220nS4, boolean z, boolean z2, C556300Lro c556300Lro) {
        if (z) {
            if (((C1D82) this.LIZ.l0).LJFF) {
                LIZIZ("set failed on cancel state when task support cancel");
            }
            C1D82 c1d82 = (C1D82) this.LIZ.l0;
            c1d82.LIZ.LIZLLL(new C556220Lrg(c556300Lro, c1d82.LJIIL, null));
            C1D82 c1d822 = (C1D82) this.LIZ.l0;
            if (c1d822.LIZ.LIZLLL.LJIIIIZZ) {
                C157L.LIZ(c1d822, EnumC207165164t.Cancel);
                return;
            }
            return;
        }
        if (z2) {
            if (((C1D82) this.LIZ.l0).LJIIIIZZ) {
                LIZIZ("set failed on pause state when task support pause");
            }
            C1D82 c1d823 = (C1D82) this.LIZ.l0;
            c1d823.LJIIIZ = new C1D8D(c1435220nS4, c556300Lro);
            if (!c1d823.LIZ.LIZLLL.LJIIIIZZ) {
                return;
            }
            C157L.LIZ(c1d823, EnumC207165164t.Pause);
            return;
        }
        C1D82 c1d824 = (C1D82) this.LIZ.l0;
        if (c1d824.LIZ.LIZLLL.LJIIIIZZ) {
            C157L.LIZ(c1d824, EnumC207165164t.Fail);
        }
        ((C1D82) this.LIZ.l0).LIZ.LIZJ(c1435220nS4, c556300Lro);
    }

    @Override // X.C1D89
    public final void LJ(Object obj, boolean z, boolean z2, boolean z3, C556300Lro c556300Lro) {
        if (z2) {
            if (((C1D82) this.LIZ.l0).LJFF) {
                LIZIZ("set success on cancel state when task support cancel");
            }
            C1D82 c1d82 = (C1D82) this.LIZ.l0;
            c1d82.LIZ.LIZLLL(new C556220Lrg(c556300Lro, c1d82.LJIIL, null));
            C1D82 c1d822 = (C1D82) this.LIZ.l0;
            if (c1d822.LIZ.LIZLLL.LJIIIIZZ) {
                C157L.LIZ(c1d822, EnumC207165164t.Cancel);
                return;
            }
            return;
        }
        if (z3) {
            if (((C1D82) this.LIZ.l0).LJIIIIZZ) {
                LIZIZ("set success on pause state when task support pause");
            }
            C1D82 c1d823 = (C1D82) this.LIZ.l0;
            c1d823.LJIIIZ = new C1D8E(obj, z, c556300Lro);
            if (!c1d823.LIZ.LIZLLL.LJIIIIZZ) {
                return;
            }
            C157L.LIZ(c1d823, EnumC207165164t.Pause);
            return;
        }
        C1D82 c1d824 = (C1D82) this.LIZ.l0;
        if (c1d824.LIZ.LIZLLL.LJIIIIZZ) {
            C157L.LIZ(c1d824, EnumC207165164t.Success);
        }
        ((C1D82) this.LIZ.l0).LIZ.LJ(obj, z, c556300Lro);
    }
}
