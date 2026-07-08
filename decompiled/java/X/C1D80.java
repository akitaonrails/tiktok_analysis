package X;

import Y.ARunnableS101S0200000_32;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS283S0000000_35;
import kotlin.jvm.internal.AwS401S0200000_35;
import kotlin.jvm.internal.AwS579S0100000_35;
import kotlin.jvm.internal.AwS614S0100000_35;
import kotlin.jvm.internal.AwS649S0100000_35;
import kotlin.jvm.internal.AwS684S0100000_35;

/* JADX INFO: renamed from: X.1D80, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D80 {
    public static final /* synthetic */ int LJIILL = 0;
    public boolean LIZ;
    public boolean LIZIZ;
    public final C20147013sK LIZJ;
    public Executor LIZLLL;
    public Executor LJ;
    public Executor LJFF;
    public final List<Object> LJI;
    public final List<Object> LJII;
    public boolean LJIIIIZZ;
    public final C1D88 LJIIIZ;
    public final String LJIIJ;
    public final C1D82[] LJIIJJI;
    public int LJIIL = 100;
    public final String LJIILIIL;
    public final C1D84 LJIILJJIL;

    public final C1D8Z LIZJ() {
        return (C1D8Z) this.LJIIIZ.LJ.LIZ;
    }

    public final boolean LIZLLL() {
        C013C c013c = new C013C();
        c013c.element = false;
        AwS684S0100000_35 awS684S0100000_35 = new AwS684S0100000_35(c013c, 0);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        LinkedList<C1D82> linkedList = new LinkedList<>();
        for (C1D82 c1d82 : this.LJIIJJI) {
            awS684S0100000_35.LIZ$0(c1d82, linkedHashSet, linkedList);
        }
        return c013c.element;
    }

    public final void LJII() {
        LJFF(new AwS614S0100000_35(this, 3));
    }

    public final void LIZ(InterfaceC1840230xzJ interfaceC1840230xzJ) {
        LJFF(new AwS401S0200000_35(this, interfaceC1840230xzJ, 8));
    }

    public final void LIZIZ(Object obj) {
        LJFF(new AwS401S0200000_35(this, obj, 9));
    }

    public final void LJFF(Function1<? super C556300Lro, Unit> function1) {
        LJ(this.LIZLLL, function1);
    }

    public final void LJI(AbstractC556190Lrd abstractC556190Lrd) {
        AwS614S0100000_35 awS614S0100000_35 = new AwS614S0100000_35(this, 2);
        LJ(this.LJFF, new AwS401S0200000_35(this, abstractC556190Lrd, 11));
        if (awS614S0100000_35.LIZ$0(abstractC556190Lrd)) {
            this.LJIIIZ.LIZJ(null);
        }
    }

    public static void LJ(Executor executor, Function1 function1) {
        C556300Lro c556300Lro = new C556300Lro(0);
        if (executor == null) {
            function1.invoke(c556300Lro);
        } else {
            executor.execute(new ARunnableS101S0200000_32(function1, c556300Lro, 0));
        }
    }

    public final void LJIIIIZZ(Function1 function1, boolean z) {
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (C1D82 c1d82 : this.LJIIJJI) {
            C2325401G0s.get$arr$(0).getClass();
            C2325401G0s.LIZ$0(c1d82, linkedHashSet, z, function1);
        }
    }

    public C1D80(String str, C1D82[] c1d82Arr, String str2, C1D84 c1d84) {
        this.LJIIJ = str;
        this.LJIIJJI = c1d82Arr;
        this.LJIILIIL = str2;
        this.LJIILJJIL = c1d84;
        for (C1D82 c1d82 : c1d82Arr) {
            C2250851D7z c2250851D7z = c1d82.LIZ;
            c2250851D7z.LIZLLL = this;
            c2250851D7z.LIZJ = true;
        }
        this.LIZJ = new C20147013sK(this.LJIILJJIL);
        this.LJI = C1697810uHb.LJIILJJIL(new C2250831D7x(new C21185917vV(this), new C1D4B(this)));
        this.LJII = new ArrayList();
        this.LJIIIZ = new C1D88(this.LJIIJ, this.LJIIIIZZ, AFwS283S0000000_35.get$arr$(2), this.LJIILJJIL, new C1D89() { // from class: X.1D81
            @Override // X.C1D89
            public final void LJIILJJIL() {
            }

            @Override // X.C1D89
            public final void LJIJ(Object obj) {
            }

            @Override // X.C1D89
            public final void onStart() {
                C1D80 c1d80 = this.LIZ;
                if (c1d80.LJIIIIZZ) {
                    C157K c157k = C157K.LJIIIIZZ;
                    String str3 = c1d80.LJIILIIL;
                    synchronized (c157k) {
                        Boolean boolRemove = C157K.LJFF.remove(str3);
                        if (boolRemove != null) {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append("clearFinishedRecord: netId=");
                            sbLIZ.append(str3);
                            sbLIZ.append(", removed=");
                            sbLIZ.append(boolRemove);
                            C157K.LJFF(C2188811AlT.LIZIZ(sbLIZ));
                        }
                    }
                }
                C1D80 c1d802 = this.LIZ;
                c1d802.LJI(new C556240Lri(c1d802.LJIIJ, new C1404610meh(c1d802.LJI), new C556300Lro(0)));
                C1D80 c1d803 = this.LIZ;
                if (c1d803.LIZLLL()) {
                    throw new C1436910nUn("net has circle", String.valueOf(777003), null);
                }
                C2250801D7u c2250801D7u = C2250801D7u.LIZ;
                AwS579S0100000_35 awS579S0100000_35 = new AwS579S0100000_35(new AwS649S0100000_35(c1d803, 0), 9);
                C556270Lrl c556270Lrl = new C556270Lrl(awS579S0100000_35, c2250801D7u);
                C1D82 c1d822 = new C1D82(awS579S0100000_35, c2250801D7u);
                c1d822.LIZLLL = c556270Lrl.LIZ;
                c1d822.LIZIZ = c556270Lrl.LIZIZ;
                c1d822.LJIIJ = c556270Lrl.LIZJ;
                c1d803.LJIIIIZZ(new AwS614S0100000_35(c1d822, 4), true);
                for (C1D82 c1d823 : this.LIZ.LJIIJJI) {
                    c1d823.LJII();
                }
            }

            @Override // X.C1D89
            public final void LIZ(Object obj) {
                if (this.LIZ.LIZJ() instanceof C1D8O) {
                    C1D80 c1d80 = this.LIZ;
                    c1d80.LJI(new AbstractC556140LrY(new C556300Lro(0), c1d80.LJIIJ, obj) { // from class: X.0Lra
                        public final String toString() {
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(this.LIZ);
                            sbLIZ.append(" Msg-NetFailedFinish info:");
                            sbLIZ.append(this.LIZJ);
                            return C2188811AlT.LIZIZ(sbLIZ);
                        }
                    });
                } else {
                    C1D80 c1d802 = this.LIZ;
                    c1d802.LJI(new C556220Lrg(new C556300Lro(0), c1d802.LJIIJ, obj));
                }
            }

            @Override // X.C1D89
            public final void LJIIIZ(AbstractC1404540mea abstractC1404540mea) {
                C1D80 c1d80 = this.LIZ;
                if (c1d80.LJIIIIZZ) {
                    C157K.LJIIIIZZ.LIZLLL(c1d80.LJIILIIL, C157J.WAVE_NET_CANCELED);
                }
                C1D80 c1d802 = this.LIZ;
                c1d802.LJI(new C556150LrZ(c1d802.LJIIJ, new C556300Lro(0), abstractC1404540mea));
                this.LIZ.LJIIIIZZ(new AwS614S0100000_35((Function1) new AwS614S0100000_35(abstractC1404540mea, 9), 1), false);
            }

            @Override // X.C1D89
            public final void LJIIJJI(Object obj) {
                C1D80 c1d80 = this.LIZ;
                if (c1d80.LIZ) {
                    c1d80.LJI(new C556170Lrb(c1d80.LJIIJ, new C556300Lro(0)));
                }
                this.LIZ.LJIIIIZZ(new AwS614S0100000_35(obj, 10), false);
            }

            @Override // X.C1D89
            public final void LJI(Function1 function1, Object obj) {
                this.LIZ.getClass();
                this.LIZ.LJIIIIZZ(new AwS614S0100000_35(obj, 12), false);
            }

            @Override // X.C1D89
            public final void LJFF(C1435220nS4 c1435220nS4, boolean z, boolean z2, C556300Lro c556300Lro) {
                C1D80 c1d80 = this.LIZ;
                if (c1d80.LJIIIIZZ) {
                    C157K.LJIIIIZZ.LIZLLL(c1d80.LJIILIIL, C157J.WAVE_NET_FAILED);
                }
                C1D80 c1d802 = this.LIZ;
                c1d802.LJI(new C556230Lrh(c1d802.LJIIJ, c1435220nS4, c556300Lro));
                this.LIZ.LJIIIIZZ(new AwS614S0100000_35((Function1) new AwS614S0100000_35(c1435220nS4, 11), 1), false);
            }

            @Override // X.C1D89
            public final void LJ(Object obj, boolean z, boolean z2, boolean z3, C556300Lro c556300Lro) {
                C1D80 c1d80 = this.LIZ;
                if (c1d80.LJIIIIZZ) {
                    C157K.LJIIIIZZ.LIZLLL(c1d80.LJIILIIL, C157J.WAVE_NET_SUCCESS);
                }
                C1D80 c1d802 = this.LIZ;
                c1d802.LJI(new C556250Lrj(c1d802.LJIIJ, obj, z, c556300Lro));
            }
        });
    }
}
