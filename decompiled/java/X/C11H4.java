package X;

import X.InterfaceC0148002o;
import androidx.lifecycle.LifecycleOwner;
import defpackage.Config;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS124S0400000_29;
import kotlin.jvm.internal.AwS211S0300000_2;
import kotlin.jvm.internal.AwS238S0300000_29;
import kotlin.jvm.internal.AwS395S0200000_29;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS582S0100000_3;
import kotlin.jvm.internal.AwS598S0100000_19;
import kotlin.jvm.internal.AwS608S0100000_29;
import kotlin.jvm.internal.AwS62S0500000_29;
import kotlin.jvm.internal.AwS635S0100000_21;
import kotlin.jvm.internal.AwS643S0100000_29;

/* JADX INFO: renamed from: X.11H4, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C11H4<S extends InterfaceC0148002o> implements InterfaceC736830SvJ<S> {
    public InterfaceC497601wk LIZ;
    public S LIZIZ;
    public final C11NJ LIZJ = new C11NJ();
    public final C01GW LIZLLL = C452501pT.LIZIZ(new AwS555S0100000_11(this, 1350));
    public final C054G LJ = C2296808zG.LIZ(C2296908zH.LIZ());

    @Override // X.InterfaceC736830SvJ
    public final void LJJIJL(boolean z) {
    }

    public final C0NK4<S> LIZJ() {
        return (C0NK4) this.LIZLLL.getValue();
    }

    @Override // X.InterfaceC736830SvJ
    public final void LJJIJIIJIL() {
        C2296808zG.LIZJ(this.LJ, null);
        this.LIZJ.LJ();
        C0NK4<S> c0nk4LIZJ = LIZJ();
        c0nk4LIZJ.LIZJ.LJIIJJI(null);
        C2296808zG.LIZJ(c0nk4LIZJ.LJ, null);
    }

    @Override // X.InterfaceC736830SvJ
    public final S getState() {
        return (S) LIZJ().LIZ.getValue();
    }

    @Override // X.InterfaceC736830SvJ
    public final void LIZ(Function1<? super S, ? extends S> function1) {
        C0NK4<S> c0nk4LIZJ = LIZJ();
        C0NK5<S> c0nk5 = c0nk4LIZJ.LIZLLL;
        synchronized (c0nk5) {
            c0nk5.LIZIZ.add(function1);
        }
        c0nk4LIZJ.LIZJ.LJIIIIZZ(Unit.LIZ);
    }

    @Override // X.InterfaceC736830SvJ
    public final void LJJIJIL(Function1<? super S, Unit> function1) {
        C0NK4<S> c0nk4LIZJ = LIZJ();
        C0NK5<S> c0nk5 = c0nk4LIZJ.LIZLLL;
        synchronized (c0nk5) {
            c0nk5.LIZ.add(function1);
        }
        c0nk4LIZJ.LIZJ.LJIIIIZZ(Unit.LIZ);
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
        Config.a aVar;
        C2252321DDq c2252321DDq = LIZJ().LIZ;
        do {
            aVar = (Object) c2252321DDq.getValue();
        } while (!c2252321DDq.compareAndSet(aVar, function1.invoke(aVar)));
    }

    @Override // X.InterfaceC736830SvJ
    public final C0ZP4 LJJJJ(LifecycleOwner lifecycleOwner, C1770850wBP<S> c1770850wBP, Function1<? super Throwable, Unit> function1, InterfaceC1790830whd interfaceC1790830whd, Function0<Boolean> function0, Function1<? super S, Unit> function12) {
        InterfaceC346201Wa c1629806Zs;
        Function1<? super Throwable, Unit> c11h8 = function1;
        InterfaceC346201Wa interfaceC346201WaLJIILJJIL = C09IC.LJIILJJIL(new AwS643S0100000_29(c1770850wBP, 62), LIZJ().LIZIZ);
        if (c1770850wBP.LIZ) {
            c1629806Zs = new C1629806Zs(interfaceC346201WaLJIILJJIL);
        } else {
            c1629806Zs = interfaceC346201WaLJIILJJIL;
        }
        boolean z = c1770850wBP.LIZJ;
        C11HA c11ha = c1770850wBP.LJI;
        C1DFH c1dfh = C0PEM.LIZ;
        AbstractC2238408pq abstractC2238408pqLLIILII = C2107308Nj.LIZ.LLIILII();
        if (c11h8 == null) {
            c11h8 = new C11H8();
        }
        return LIZIZ(c1629806Zs, lifecycleOwner, z, c11ha, abstractC2238408pqLLIILII, c11h8, function12);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0077  */
    /* JADX WARN: Type inference failed for: r0v16, types: [X.0yGH] */
    /* JADX WARN: Type inference failed for: r0v5, types: [X.0yGH] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final X.C1850750yGH LIZIZ(X.InterfaceC346201Wa r7, androidx.lifecycle.LifecycleOwner r8, boolean r9, X.C11HA r10, X.AbstractC2252651DEx r11, kotlin.jvm.functions.Function1 r12, kotlin.jvm.functions.Function1 r13) {
        /*
            r6 = this;
            r4 = 2
            r2 = 0
            if (r8 != 0) goto L15
            X.054G r1 = r6.LJ
            X.01ep r0 = new X.01ep
            r0.<init>(r7, r12, r13, r2)
            X.0956 r1 = X.C23250099c.LIZLLL(r1, r11, r2, r0, r4)
            X.0yGH r0 = new X.0yGH
            r0.<init>()
            return r0
        L15:
            com.bytedance.assem.arch.viewModel.internal.FlowLifecycleAwareCollector r3 = new com.bytedance.assem.arch.viewModel.internal.FlowLifecycleAwareCollector
            r0 = r9 ^ 1
            r3.<init>(r8, r0, r10, r13)
            X.054G r1 = r6.LJ
            X.01p4 r0 = new X.01p4
            r0.<init>(r7, r12, r3, r2)
            X.0956 r4 = X.C23250099c.LIZLLL(r1, r11, r2, r0, r4)
            r3.LLJI = r4
            if (r10 == 0) goto L30
            kotlin.jvm.internal.AwS608S0100000_29 r0 = r3.LLJIJIL
            r10.LIZJ(r0)
        L30:
            kotlin.jvm.internal.AwS608S0100000_29 r1 = new kotlin.jvm.internal.AwS608S0100000_29
            r0 = 505(0x1f9, float:7.08E-43)
            r1.<init>(r3, r0)
            r4.LJII(r1)
            boolean r0 = X.C20630086i.LIZ()
            if (r0 == 0) goto L7f
            androidx.lifecycle.LifecycleOwner r5 = r3.LLJ
            if (r5 == 0) goto L64
            boolean r0 = X.C725080ScM.LJIILLIIL
            if (r0 == 0) goto L77
            boolean r0 = r5 instanceof androidx.fragment.app.Fragment
            if (r0 == 0) goto L6a
            r1 = r5
            androidx.fragment.app.Fragment r1 = (androidx.fragment.app.Fragment) r1
            androidx.fragment.app.FragmentManager r0 = r1.getFragmentManager()
            if (r0 == 0) goto L61
            androidx.lifecycle.Lifecycle r0 = r1.getLifecycle()
            androidx.lifecycle.Lifecycle$State r1 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r1 != r0) goto L77
        L61:
            r4.LIZIZ(r2)
        L64:
            X.0yGH r0 = new X.0yGH
            r0.<init>()
            return r0
        L6a:
            androidx.lifecycle.Lifecycle r0 = r5.getLifecycle()
            androidx.lifecycle.Lifecycle$State r1 = r0.getCurrentState()
            androidx.lifecycle.Lifecycle$State r0 = androidx.lifecycle.Lifecycle.State.DESTROYED
            if (r1 != r0) goto L77
            goto L61
        L77:
            androidx.lifecycle.Lifecycle r0 = r5.getLifecycle()
            r0.addObserver(r3)
            goto L64
        L7f:
            com.bytedance.assem.arch.threadpool.AssemMainHandler r2 = X.C20630086i.LIZ
            Y.ARunnableS80S0200000_11 r1 = new Y.ARunnableS80S0200000_11
            r0 = 33
            r1.<init>(r3, r4, r0)
            X.C786410Ut5.LJJZZIII(r2, r1)
            goto L64
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C11H4.LIZIZ(X.01Wa, androidx.lifecycle.LifecycleOwner, boolean, X.11HA, X.1DEx, kotlin.jvm.functions.Function1, kotlin.jvm.functions.Function1):X.0yGH");
    }

    public final C1850750yGH LIZLLL(LifecycleOwner lifecycleOwner, C1770850wBP c1770850wBP, Function1 function1, Function1 function12, InterfaceC1790830whd interfaceC1790830whd, Function0 function0, Function1 function13) {
        InterfaceC346201Wa c1629806Zs;
        AbstractC2252651DEx abstractC2252651DExLLIILII;
        Function1 awS582S0100000_3 = function13;
        Function1 c11h8 = function12;
        InterfaceC346201Wa interfaceC346201WaLJIILJJIL = C09IC.LJIILJJIL(new AwS635S0100000_21(c1770850wBP, (C1770850wBP<Object>) 108), new C1864860yd2(new C23135094r(new C1790810whb(LIZJ().LIZIZ, function0, interfaceC1790830whd, null), C23271099x.INSTANCE, -2, EnumC2252401DDy.SUSPEND), function1, 2));
        if (c1770850wBP.LIZ) {
            c1629806Zs = new C1629806Zs(interfaceC346201WaLJIILJJIL);
        } else {
            c1629806Zs = interfaceC346201WaLJIILJJIL;
        }
        if (c1770850wBP.LJFF) {
            abstractC2252651DExLLIILII = C2182901Abw.LIZIZ(C725080ScM.LIZ());
        } else {
            C1DFH c1dfh = C0PEM.LIZ;
            abstractC2252651DExLLIILII = C2107308Nj.LIZ.LLIILII();
        }
        if (!c1770850wBP.LJFF) {
            awS582S0100000_3 = new AwS582S0100000_3(awS582S0100000_3, (Function1<? super Boolean, Unit>) 80);
        }
        boolean z = c1770850wBP.LIZJ;
        C11HA c11ha = c1770850wBP.LJI;
        if (c11h8 == null) {
            c11h8 = new C11H8();
        }
        return LIZIZ(c1629806Zs, lifecycleOwner, z, c11ha, abstractC2252651DExLLIILII, c11h8, awS582S0100000_3);
    }

    @Override // X.InterfaceC736830SvJ
    public final <A> C0ZP4 LJJIJLIJ(LifecycleOwner lifecycleOwner, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, C1770850wBP<C11H9<A>> c1770850wBP, InterfaceC1790830whd interfaceC1790830whd, Function0<Boolean> function0, Function1<? super Throwable, Unit> function1, Function1<? super A, Unit> function12) {
        return LIZLLL(lifecycleOwner, c1770850wBP, new AwS608S0100000_29((InterfaceC2217241BqE) interfaceC2217241BqE, 507), function1, interfaceC1790830whd, function0, new AwS608S0100000_29(function12, 508));
    }

    @Override // X.InterfaceC736830SvJ
    public final <A, B> C0ZP4 LJJJ(LifecycleOwner lifecycleOwner, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, C1770850wBP<C19474211Gy<A, B>> c1770850wBP, InterfaceC1790830whd interfaceC1790830whd, Function0<Boolean> function0, Function1<? super Throwable, Unit> function1, Function2<? super A, ? super B, Unit> function2) {
        return LIZLLL(lifecycleOwner, c1770850wBP, new AwS395S0200000_29(interfaceC2217241BqE, interfaceC2217241BqE2, 64), function1, interfaceC1790830whd, function0, new AwS608S0100000_29(function2, 509));
    }

    @Override // X.InterfaceC736830SvJ
    public final C0ZP4 LJJJJI(LifecycleOwner lifecycleOwner, InterfaceC2217241BqE interfaceC2217241BqE, C1770850wBP c1770850wBP, C736800SvG c736800SvG, Function0 function0, Function1 function1, Function0 function02, Function1 function12) {
        return LIZLLL(lifecycleOwner, c1770850wBP, new AwS598S0100000_19(interfaceC2217241BqE, (InterfaceC2217241BqE<InterfaceC0148002o, ? extends AbstractC1623806Xk<Object>>) 526), null, c736800SvG, function0, new AwS211S0300000_2(function02, (Function0<Unit>) function1, (Function1<? super Throwable, Unit>) function12, (Function1<Object, Unit>) 12));
    }

    @Override // X.InterfaceC736830SvJ
    public final <A, B, C> C0ZP4 LJJIL(LifecycleOwner lifecycleOwner, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, C1770850wBP<C11H7<A, B, C>> c1770850wBP, InterfaceC1790830whd interfaceC1790830whd, Function0<Boolean> function0, Function1<? super Throwable, Unit> function1, InterfaceC1631620sYq<? super A, ? super B, ? super C, Unit> interfaceC1631620sYq) {
        return LIZLLL(lifecycleOwner, c1770850wBP, new AwS238S0300000_29(interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, 20), function1, interfaceC1790830whd, function0, new AwS608S0100000_29(interfaceC1631620sYq, 510));
    }

    @Override // X.InterfaceC736830SvJ
    public final <A, B, C, D> C0ZP4 LJJJIL(LifecycleOwner lifecycleOwner, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, C1770850wBP<C11H6<A, B, C, D>> c1770850wBP, InterfaceC1790830whd interfaceC1790830whd, Function0<Boolean> function0, Function1<? super Throwable, Unit> function1, InterfaceC1631630sYr<? super A, ? super B, ? super C, ? super D, Unit> interfaceC1631630sYr) {
        return LIZLLL(lifecycleOwner, c1770850wBP, new AwS124S0400000_29(interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, 1), function1, interfaceC1790830whd, function0, new AwS608S0100000_29(interfaceC1631630sYr, 511));
    }

    @Override // X.InterfaceC736830SvJ
    public final <A, B, C, D, E> C0ZP4 LJJJJJ(LifecycleOwner lifecycleOwner, InterfaceC2217241BqE<S, ? extends A> interfaceC2217241BqE, InterfaceC2217241BqE<S, ? extends B> interfaceC2217241BqE2, InterfaceC2217241BqE<S, ? extends C> interfaceC2217241BqE3, InterfaceC2217241BqE<S, ? extends D> interfaceC2217241BqE4, InterfaceC2217241BqE<S, ? extends E> interfaceC2217241BqE5, C1770850wBP<C11H2<A, B, C, D, E>> c1770850wBP, InterfaceC1790830whd interfaceC1790830whd, Function0<Boolean> function0, Function1<? super Throwable, Unit> function1, InterfaceC1685420txc<? super A, ? super B, ? super C, ? super D, ? super E, Unit> interfaceC1685420txc) {
        return LIZLLL(lifecycleOwner, c1770850wBP, new AwS62S0500000_29(interfaceC2217241BqE, interfaceC2217241BqE2, interfaceC2217241BqE3, interfaceC2217241BqE4, interfaceC2217241BqE5, 1), function1, interfaceC1790830whd, function0, new AwS608S0100000_29(interfaceC1685420txc, 506));
    }
}
