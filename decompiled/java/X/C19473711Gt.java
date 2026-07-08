package X;

import X.InterfaceC0148002o;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.internal.LifecycleAwareObserver;
import java.util.concurrent.Executor;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS211S0300000_2;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS62S0500000_29;

/* JADX INFO: renamed from: X.11Gt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19473711Gt<S extends InterfaceC0148002o> implements InterfaceC736830SvJ<S> {
    public InterfaceC497601wk LIZ;
    public S LIZIZ;
    public final C11NJ LIZJ = new C11NJ();
    public final C01GW LIZLLL = C452501pT.LIZIZ(new C19473511Gr(this));

    @Override // X.InterfaceC736830SvJ
    public final void LJJIJL(boolean z) {
    }

    public final C11NZ<S> LIZIZ() {
        return ((InterfaceC19473611Gs) this.LIZLLL.getValue()).LIZIZ();
    }

    @Override // X.InterfaceC736830SvJ
    public final void LJJIJIIJIL() {
        this.LIZJ.LJ();
    }

    @Override // X.InterfaceC736830SvJ
    public final S getState() {
        return (S) ((InterfaceC19473611Gs) this.LIZLLL.getValue()).getState();
    }

    @Override // X.InterfaceC736830SvJ
    public final void LIZ(Function1<? super S, ? extends S> function1) {
        ((InterfaceC19473611Gs) this.LIZLLL.getValue()).LIZ(function1);
    }

    @Override // X.InterfaceC736830SvJ
    public final void LJJIJIL(Function1<? super S, Unit> function1) {
        ((InterfaceC19473611Gs) this.LIZLLL.getValue()).LIZLLL(function1);
    }

    @Override // X.InterfaceC736830SvJ
    public final void LJJIZ(InterfaceC497601wk interfaceC497601wk) {
        this.LIZ = interfaceC497601wk;
    }

    @Override // X.InterfaceC736830SvJ
    public final void LJJJI(S s) {
        this.LIZIZ = s;
    }

    @Override // X.InterfaceC736830SvJ
    public final void LJJJJIZL(Function1<? super S, ? extends S> function1) {
        ((InterfaceC19473611Gs) this.LIZLLL.getValue()).LIZJ(function1);
    }

    @Override // X.InterfaceC736830SvJ
    public final C0ZP4 LJJJJ(LifecycleOwner lifecycleOwner, final C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1790830whd interfaceC1790830whd, Function0<Boolean> function0, Function1<? super S, Unit> function12) {
        C11NZ c19475811Ho;
        C19488511Ml c19488511MlLJJII = LIZIZ().LJJII(new InterfaceC1627390sS1() { // from class: X.0SvW
            /* JADX WARN: Type inference incomplete: some casts might be missing */
            @Override // X.InterfaceC1627390sS1
            public final boolean test(Object obj, Object obj2) {
                return c1770850wBP.LIZIZ.invoke((Object) obj, (Object) obj2).booleanValue();
            }
        });
        if (c1770850wBP.LIZ) {
            c19475811Ho = new C19475811Ho(c19488511MlLJJII);
        } else {
            c19475811Ho = c19488511MlLJJII;
        }
        return new C11HB(LIZJ(c19475811Ho, lifecycleOwner, c1770850wBP.LIZJ, C20630086i.LIZIZ, c1770850wBP.LJI, function1, function12));
    }

    public final InterfaceC420801kM LIZJ(C11NZ c11nz, LifecycleOwner lifecycleOwner, boolean z, C11RO c11ro, C11HA c11ha, Function1 function1, final Function1 function12) {
        final Function1 c11h8 = function1;
        if (lifecycleOwner == null) {
            if (c11ro != null) {
                c11nz = c11nz.LJJJLZIJ(c11ro);
            }
            InterfaceC420801kM interfaceC420801kMLJJLL = c11nz.LJJLL(new C09JN() { // from class: X.0N1M
                @Override // X.C09JN
                public final /* synthetic */ void accept(Object obj) {
                    C1C7U.LIZ("RxViewModelDispatcherKt@2a43.sam$io_reactivex_functions_Consumer$0");
                    function12.invoke(obj);
                    C1C7U.LIZIZ("RxViewModelDispatcherKt@2a43.sam$io_reactivex_functions_Consumer$0");
                }
            }, new C09JN() { // from class: X.0H17
                @Override // X.C09JN
                public final void accept(Object obj) {
                    C1C7U.LIZ("RxViewModelDispatcher@4208.lifecycleAwareSubscribe$2");
                    Function1 c11h82 = c11h8;
                    if (c11h82 == null) {
                        c11h82 = new C11H8();
                    }
                    c11h82.invoke(obj);
                    C1C7U.LIZIZ("RxViewModelDispatcher@4208.lifecycleAwareSubscribe$2");
                }
            });
            this.LIZJ.LIZ(interfaceC420801kMLJJLL);
            return interfaceC420801kMLJJLL;
        }
        if (c11ro != null) {
            c11nz = c11nz.LJJJLZIJ(c11ro);
        }
        boolean z2 = !z;
        if (c11h8 == null) {
            c11h8 = new C11H8();
        }
        LifecycleAwareObserver lifecycleAwareObserver = new LifecycleAwareObserver(lifecycleOwner, z2, false, c11ha, function12, c11h8, new C19474311Gz(this));
        c11nz.LIZIZ(lifecycleAwareObserver);
        this.LIZJ.LIZ(lifecycleAwareObserver);
        return lifecycleAwareObserver;
    }

    @Override // X.InterfaceC736830SvJ
    public final <A> C0ZP4 LJJIJLIJ(LifecycleOwner lifecycleOwner, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, InterfaceC1790830whd interfaceC1790830whd, Function0<Boolean> function0, Function1<? super Throwable, Unit> function1, Function1<? super A, Unit> function12) {
        C11NZ c19475811Ho;
        C11RO c19501611Rm;
        C19474011Gw c19474011Gw = new C19474011Gw(interfaceC2217241BqE);
        C19474111Gx c19474111Gx = new C19474111Gx(function12);
        C19488511Ml c19488511MlLJJII = new C11HQ(LIZIZ(), new C1211890hdr(function0), interfaceC1790830whd).LJJJJZI(new C1750030vdp(c19474011Gw)).LJJII(new C727460SgC(c1770850wBP));
        if (c1770850wBP.LIZ) {
            c19475811Ho = new C19475811Ho(c19488511MlLJJII);
        } else {
            c19475811Ho = c19488511MlLJJII;
        }
        Executor executorLIZ = C725080ScM.LIZ();
        boolean z = c1770850wBP.LIZJ;
        C11HA c11ha = c1770850wBP.LJI;
        if (c1770850wBP.LJFF) {
            C11RO c11ro = C11S5.LIZ;
            c19501611Rm = new C19501611Rm(executorLIZ);
        } else {
            c19501611Rm = C20630086i.LIZIZ;
        }
        return new C11HB(LIZJ(c19475811Ho, lifecycleOwner, z, c19501611Rm, c11ha, function1, new AwS395S0200000_29(c1770850wBP, (C1770850wBP<Object>) c19474111Gx, (Function1<Object, Unit>) 63)));
    }

    @Override // X.InterfaceC736830SvJ
    public final <A, B> C0ZP4 LJJJ(LifecycleOwner lifecycleOwner, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, InterfaceC1790830whd interfaceC1790830whd, Function0<Boolean> function0, Function1<? super Throwable, Unit> function1, Function2<? super A, ? super B, Unit> function2) {
        C11NZ c19475811Ho;
        C11RO c19501611Rm;
        C19473911Gv c19473911Gv = new C19473911Gv(interfaceC2217241BqE, interfaceC2217241BqE2);
        C19473811Gu c19473811Gu = new C19473811Gu(function2);
        C19488511Ml c19488511MlLJJII = new C11HQ(LIZIZ(), new C1211890hdr(function0), interfaceC1790830whd).LJJJJZI(new C1750030vdp(c19473911Gv)).LJJII(new C727460SgC(c1770850wBP));
        if (c1770850wBP.LIZ) {
            c19475811Ho = new C19475811Ho(c19488511MlLJJII);
        } else {
            c19475811Ho = c19488511MlLJJII;
        }
        Executor executorLIZ = C725080ScM.LIZ();
        boolean z = c1770850wBP.LIZJ;
        C11HA c11ha = c1770850wBP.LJI;
        if (c1770850wBP.LJFF) {
            C11RO c11ro = C11S5.LIZ;
            c19501611Rm = new C19501611Rm(executorLIZ);
        } else {
            c19501611Rm = C20630086i.LIZIZ;
        }
        return new C11HB(LIZJ(c19475811Ho, lifecycleOwner, z, c19501611Rm, c11ha, function1, new AwS395S0200000_29(c1770850wBP, (C1770850wBP<Object>) c19473811Gu, (Function1<Object, Unit>) 63)));
    }

    @Override // X.InterfaceC736830SvJ
    public final C0ZP4 LJJJJI(LifecycleOwner lifecycleOwner, InterfaceC2217241BqE interfaceC2217241BqE, C1770850wBP c1770850wBP, C736800SvG c736800SvG, Function0 function0, Function1 function1, Function0 function02, Function1 function12) {
        C11NZ c19475811Ho;
        C11RO c19501611Rm;
        AwS598S0100000_19 awS598S0100000_19 = new AwS598S0100000_19(interfaceC2217241BqE, (InterfaceC2217241BqE<InterfaceC0148002o, ? extends AbstractC1623806Xk<Object>>) 525);
        AwS211S0300000_2 awS211S0300000_2 = new AwS211S0300000_2(function02, (Function0<Unit>) function1, (Function1<? super Throwable, Unit>) function12, (Function1<Object, Unit>) 11);
        C19488511Ml c19488511MlLJJII = new C11HQ(LIZIZ(), new C1211890hdr(function0), c736800SvG).LJJJJZI(new C1750030vdp(awS598S0100000_19)).LJJII(new C727460SgC(c1770850wBP));
        if (c1770850wBP.LIZ) {
            c19475811Ho = new C19475811Ho(c19488511MlLJJII);
        } else {
            c19475811Ho = c19488511MlLJJII;
        }
        Executor executorLIZ = C725080ScM.LIZ();
        boolean z = c1770850wBP.LIZJ;
        C11HA c11ha = c1770850wBP.LJI;
        if (c1770850wBP.LJFF) {
            C11RO c11ro = C11S5.LIZ;
            c19501611Rm = new C19501611Rm(executorLIZ);
        } else {
            c19501611Rm = C20630086i.LIZIZ;
        }
        return new C11HB(LIZJ(c19475811Ho, lifecycleOwner, z, c19501611Rm, c11ha, null, new AwS395S0200000_29(c1770850wBP, (C1770850wBP<Object>) awS211S0300000_2, (Function1<Object, Unit>) 63)));
    }

    @Override // X.InterfaceC736830SvJ
    public final <A, B, C> C0ZP4 LJJIL(LifecycleOwner lifecycleOwner, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, InterfaceC1790830whd interfaceC1790830whd, Function0<Boolean> function0, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super A, ? super B, ? super C, Unit> interfaceC1631620sYq) {
        C11NZ c19475811Ho;
        C11RO c19501611Rm;
        C11H0 c11h0 = new C11H0(interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3);
        C11H3 c11h3 = new C11H3(interfaceC1631620sYq);
        C19488511Ml c19488511MlLJJII = new C11HQ(LIZIZ(), new C1211890hdr(function0), interfaceC1790830whd).LJJJJZI(new C1750030vdp(c11h0)).LJJII(new C727460SgC(c1770850wBP));
        if (c1770850wBP.LIZ) {
            c19475811Ho = new C19475811Ho(c19488511MlLJJII);
        } else {
            c19475811Ho = c19488511MlLJJII;
        }
        Executor executorLIZ = C725080ScM.LIZ();
        boolean z = c1770850wBP.LIZJ;
        C11HA c11ha = c1770850wBP.LJI;
        if (c1770850wBP.LJFF) {
            C11RO c11ro = C11S5.LIZ;
            c19501611Rm = new C19501611Rm(executorLIZ);
        } else {
            c19501611Rm = C20630086i.LIZIZ;
        }
        return new C11HB(LIZJ(c19475811Ho, lifecycleOwner, z, c19501611Rm, c11ha, function1, new AwS395S0200000_29(c1770850wBP, (C1770850wBP<Object>) c11h3, (Function1<Object, Unit>) 63)));
    }

    @Override // X.InterfaceC736830SvJ
    public final <A, B, C, D> C0ZP4 LJJJIL(LifecycleOwner lifecycleOwner, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, InterfaceC1790830whd interfaceC1790830whd, Function0<Boolean> function0, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super A, ? super B, ? super C, ? super D, Unit> interfaceC1631630sYr) {
        C11NZ c19475811Ho;
        C11RO c19501611Rm;
        C11H1 c11h1 = new C11H1(interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4);
        C11H5 c11h5 = new C11H5(interfaceC1631630sYr);
        C19488511Ml c19488511MlLJJII = new C11HQ(LIZIZ(), new C1211890hdr(function0), interfaceC1790830whd).LJJJJZI(new C1750030vdp(c11h1)).LJJII(new C727460SgC(c1770850wBP));
        if (c1770850wBP.LIZ) {
            c19475811Ho = new C19475811Ho(c19488511MlLJJII);
        } else {
            c19475811Ho = c19488511MlLJJII;
        }
        Executor executorLIZ = C725080ScM.LIZ();
        boolean z = c1770850wBP.LIZJ;
        C11HA c11ha = c1770850wBP.LJI;
        if (c1770850wBP.LJFF) {
            C11RO c11ro = C11S5.LIZ;
            c19501611Rm = new C19501611Rm(executorLIZ);
        } else {
            c19501611Rm = C20630086i.LIZIZ;
        }
        return new C11HB(LIZJ(c19475811Ho, lifecycleOwner, z, c19501611Rm, c11ha, function1, new AwS395S0200000_29(c1770850wBP, (C1770850wBP<Object>) c11h5, (Function1<Object, Unit>) 63)));
    }

    @Override // X.InterfaceC736830SvJ
    public final <A, B, C, D, E> C0ZP4 LJJJJJ(LifecycleOwner lifecycleOwner, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, InterfaceC1790830whd interfaceC1790830whd, Function0<Boolean> function0, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685420txc) {
        C11RO c19501611Rm;
        AwS62S0500000_29 awS62S0500000_29 = new AwS62S0500000_29(interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, 0);
        AwS608S0100000_29 awS608S0100000_29 = new AwS608S0100000_29(interfaceC1685420txc, 504);
        C11NZ c11nzLJJII = new C11HQ(LIZIZ(), new C1211890hdr(function0), interfaceC1790830whd).LJJJJZI(new C1750030vdp(awS62S0500000_29)).LJJII(new C727460SgC(c1770850wBP));
        if (c1770850wBP.LIZ) {
            c11nzLJJII = new C19475811Ho(c11nzLJJII);
        }
        Executor executorLIZ = C725080ScM.LIZ();
        boolean z = c1770850wBP.LIZJ;
        C11HA c11ha = c1770850wBP.LJI;
        if (c1770850wBP.LJFF) {
            C11RO c11ro = C11S5.LIZ;
            c19501611Rm = new C19501611Rm(executorLIZ);
        } else {
            c19501611Rm = C20630086i.LIZIZ;
        }
        return new C11HB(LIZJ(c11nzLJJII, lifecycleOwner, z, c19501611Rm, c11ha, function1, new AwS395S0200000_29(c1770850wBP, (C1770850wBP<Object>) awS608S0100000_29, (Function1<Object, Unit>) 63)));
    }
}
