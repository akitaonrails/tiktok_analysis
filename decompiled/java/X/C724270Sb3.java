package X;

import android.os.Looper;
import android.os.SystemClock;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.assem.arch.core.AssemSupervisor;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS13S1100100_11;
import kotlin.jvm.internal.AwS1S1110100_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sb3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C724270Sb3 extends AbstractC724260Sb2 implements C11HA {
    public boolean LLJILJILJ;
    public long LLJILLL;
    public final LifecycleRegistry LLJIJIL = new LifecycleRegistry(this);
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new C724350SbB());
    public final ConcurrentHashMap<C13IQ<?>, Object> LLJJ = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<C13IQ<?>, AssemViewModel<?>> LLJJI = new ConcurrentHashMap<>();
    public final ConcurrentHashMap<AssemViewModel<?>, Object> LLJJIII = new ConcurrentHashMap<>();
    public final CopyOnWriteArrayList<C724430SbJ> LLJJIJI = new CopyOnWriteArrayList<>();
    public final List<Function1<Boolean, Unit>> LLJJIJIIJIL = new CopyOnWriteArrayList();

    public final void LJII() {
        this.LLILLL = false;
        Iterator<Function1<Boolean, Unit>> it2 = this.LLJJIJIIJIL.iterator();
        while (it2.hasNext()) {
            it2.next().invoke(Boolean.FALSE);
        }
    }

    @Override // X.InterfaceC736810SvH
    public final LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        return (ViewModelStore) this.LLJILJIL.getValue();
    }

    @Override // X.C11HA
    public final boolean LIZ() {
        return this.LLILLL;
    }

    @Override // X.InterfaceC725050ScJ
    public final C03H5 getActualReceiver() {
        return this.LLILZIL;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLJIJIL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void LJIIJJI(ReusedAssem reusedAssem) {
        CopyOnWriteArrayList<AbstractC738140SxQ> copyOnWriteArrayList;
        ReusedAssem reusedAssem2;
        C0RYM c0rym;
        if (reusedAssem == 0) {
            return;
        }
        if ((reusedAssem instanceof C0RYM) && (c0rym = (C0RYM) reusedAssem) != null) {
            c0rym.a4();
        }
        reusedAssem.LLILLJJLI = false;
        C724100Sam.LIZIZ(reusedAssem, C724100Sam.LIZJ(reusedAssem, null), false, false);
        ((CopyOnWriteArrayList) reusedAssem.LL.LL.getValue()).clear();
        AssemSupervisor assemSupervisor = reusedAssem.getAssemSupervisor();
        if (assemSupervisor != null && (copyOnWriteArrayList = assemSupervisor.LLJILLL) != null) {
            for (AbstractC738140SxQ abstractC738140SxQ : copyOnWriteArrayList) {
                if (abstractC738140SxQ instanceof ReusedAssem) {
                    reusedAssem2 = (ReusedAssem) abstractC738140SxQ;
                } else {
                    reusedAssem2 = null;
                }
                LJIIJJI(reusedAssem2);
            }
        }
    }

    @Override // X.C11HA
    public final void LIZIZ(Function1<? super Boolean, Unit> function1) {
        ((CopyOnWriteArrayList) this.LLJJIJIIJIL).remove(function1);
    }

    @Override // X.C11HA
    public final void LIZJ(Function1<? super Boolean, Unit> function1) {
        ((CopyOnWriteArrayList) this.LLJJIJIIJIL).add(function1);
        function1.invoke(Boolean.valueOf(this.LLILLL));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIL(ReusedAssem<?> reusedAssem) {
        C724430SbJ next;
        reusedAssem.LLJI = this;
        if (C725080ScM.LJIJ.contains(C13LE.LIZ(reusedAssem.getClass()))) {
            try {
                InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                if (interfaceC723720SaA != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("triggerAssemBindProxy assem: ");
                    sbLIZ.append(reusedAssem);
                    sbLIZ.append(", proxy: ");
                    sbLIZ.append(this);
                    sbLIZ.append(", item: ");
                    sbLIZ.append(this.LL);
                    sbLIZ.append(", isHostAttached: ");
                    sbLIZ.append(this.LLILLL);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    int i = C2187451AjH.LIZ;
                    interfaceC723720SaA.log("AssemList", strLIZIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        if (reusedAssem.LLJILJIL) {
            Iterator<C724430SbJ> it2 = this.LLJJIJI.iterator();
            while (true) {
                if (it2.hasNext()) {
                    next = it2.next();
                    if (Intrinsics.LJFF(next.LL, C13LE.LIZ(reusedAssem.getClass()))) {
                        break;
                    }
                } else {
                    next = null;
                    break;
                }
            }
            C724430SbJ c724430SbJ = next;
            if (c724430SbJ == null) {
                c724430SbJ = new C724430SbJ();
                c724430SbJ.LL = C13LE.LIZ(reusedAssem.getClass());
                this.LLJJIJI.add(c724430SbJ);
            }
            reusedAssem.LLJILJILJ = c724430SbJ;
            c724430SbJ.LLILLJJLI = reusedAssem;
        }
    }

    @Override // X.AbstractC724260Sb2
    public final void LIZLLL(final ReusedAssem<?> reusedAssem, long j) {
        String strValueOf = String.valueOf(hashCode());
        C725260Sce c725260Sce = C725260Sce.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
            if (arrayList.size() > 0) {
                Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().onEventBegin(c725260Sce);
                }
            }
            if (C725480Sd0.LIZ(c725260Sce)) {
                C725430Scv.LIZ(new C724320Sb8(c725260Sce, strValueOf, SystemClock.elapsedRealtimeNanos()));
            }
        }
        LJIIL(reusedAssem);
        if (this.LLILLL) {
            reusedAssem.LLILLJJLI = false;
            C724100Sam.LIZIZ(reusedAssem, C724100Sam.LIZJ(reusedAssem, null), false, false);
            ReusedAssem.vo(reusedAssem, EnumC724380SbE.HOSTATTACH, false, false, false, 14);
        } else {
            if (!this.LLIZLLLIL) {
                reusedAssem.LLILLJJLI = false;
                C724100Sam.LIZIZ(reusedAssem, C724100Sam.LIZJ(reusedAssem, null), false, false);
            }
            InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
            if (interfaceC723720SaA != null) {
                if (!C725080ScM.LJIILJJIL) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("assem: ");
                    sbLIZ.append(reusedAssem);
                    sbLIZ.append(" initializeHost, notAttached, ");
                    sbLIZ.append(j);
                    sbLIZ.append(", ");
                    sbLIZ.append(this.LLJI);
                    sbLIZ.append("}, ");
                    sbLIZ.append(this.LLIZLLLIL);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    int i = C2187451AjH.LIZ;
                    interfaceC723720SaA.log("AssemList", strLIZIZ);
                } else if (C725080ScM.LIZLLL) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("assem: ");
                    sbLIZ2.append(reusedAssem);
                    sbLIZ2.append(" initializeHost, notAttached, ");
                    sbLIZ2.append(j);
                    sbLIZ2.append(", ");
                    sbLIZ2.append(this.LLJI);
                    sbLIZ2.append("}, ");
                    sbLIZ2.append(this.LLIZLLLIL);
                    String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
                    int i2 = C2187451AjH.LIZ;
                    interfaceC723720SaA.log("AssemList", strLIZIZ2);
                }
            }
        }
        C725080ScM.LIZ().execute(new Runnable() { // from class: X.0Sb5
            public final void LIZ() {
                this.LL.LJIIIIZZ(reusedAssem, false);
                C724270Sb3 c724270Sb3 = this.LL;
                for (Map.Entry<AssemViewModel<?>, Object> entry : c724270Sb3.LLJJIII.entrySet()) {
                    AssemViewModel<?> key = entry.getKey();
                    key.maxScheduledGeneration = c724270Sb3.LLJILLL;
                    AssemViewModel.syncItem2State$assem_release$default(key, c724270Sb3.LL, null, entry.getValue(), null, 8, null);
                }
                this.LL.LLJJIII.clear();
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ReusedSingleLayerProxy@1dad.initializeHost$2");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ReusedSingleLayerProxy@1dad.initializeHost$2");
            }
        });
        C725260Sce c725260Sce2 = C725260Sce.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList2 = C725430Scv.LIZIZ;
            if (arrayList2.size() > 0) {
                Iterator<InterfaceC725440Scw> it3 = arrayList2.iterator();
                while (it3.hasNext()) {
                    it3.next().onEventEnd(c725260Sce2);
                }
            }
            if (C725480Sd0.LIZ(c725260Sce2)) {
                C725430Scv.LIZ(new C724310Sb7(c725260Sce2, strValueOf, SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread())));
            }
        }
    }

    @Override // X.AbstractC724260Sb2
    public final void LJ(AssemViewModel<?> assemViewModel, Object obj) {
        if (assemViewModel.maxScheduledGeneration != this.LLJILLL) {
            this.LLJJIII.put(assemViewModel, obj);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIIIZZ(ReusedAssem<?> reusedAssem, boolean z) {
        InterfaceC712990Rxx interfaceC712990Rxx;
        if (!this.LLJILJILJ || !z) {
            reusedAssem.so();
        }
        CopyOnWriteArraySet<InterfaceC724800Sbu<?, ?>> copyOnWriteArraySet = reusedAssem.LLJIJIL;
        if (copyOnWriteArraySet != null) {
            Iterator<InterfaceC724800Sbu<?, ?>> it2 = copyOnWriteArraySet.iterator();
            while (it2.hasNext()) {
                it2.next().LIZ();
            }
        }
        Object obj = this.LL;
        if (obj != null && (reusedAssem instanceof InterfaceC712990Rxx) && (interfaceC712990Rxx = (InterfaceC712990Rxx) reusedAssem) != null) {
            interfaceC712990Rxx.vr(obj);
        }
    }

    public final void LJIIIZ(List<? extends ReusedAssem<?>> list, Function1<? super ReusedAssem<?>, Unit> function1) {
        ReusedAssem<? extends C03H5> reusedAssem = this.LLILZIL;
        if (reusedAssem == null) {
            return;
        }
        function1.invoke(reusedAssem);
        Iterator<? extends ReusedAssem<?>> it2 = list.iterator();
        while (it2.hasNext()) {
            function1.invoke(it2.next());
        }
    }

    public final <VM extends AssemViewModel<S>, S extends InterfaceC0148002o, ITEM> void LJIIJ(VM vm, InterfaceC1631620sYq<? super S, ? super ITEM, ? super List<? extends Object>, ? extends S> interfaceC1631620sYq) {
        C19719912Dl c19719912DlLIZ = C13LE.LIZ(vm.getClass());
        if (!this.LLJJ.containsKey(c19719912DlLIZ)) {
            LJ(vm, interfaceC1631620sYq);
            this.LLJJ.put(c19719912DlLIZ, interfaceC1631620sYq);
            if (C725080ScM.LIZLLL) {
                try {
                    InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                    if (interfaceC723720SaA != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("cell store item sync to state map: ");
                        sbLIZ.append(vm);
                        sbLIZ.append(", isInit: ");
                        sbLIZ.append(vm._initialized);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        int i = C2187451AjH.LIZ;
                        interfaceC723720SaA.log("assem_vm", strLIZIZ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            this.LLJJI.put(c19719912DlLIZ, vm);
        }
    }

    public final void LJI(ReusedUIAssem reusedUIAssem, Object obj, final List list, Function1 function1, Function0 function0) {
        this.LLILZIL = null;
        if (this.LLILZLL == null) {
            this.LLILZLL = C13LE.LIZ(reusedUIAssem.getClass());
        }
        this.LLILZIL = reusedUIAssem;
        C725280Scg c725280Scg = C725280Scg.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
            if (arrayList.size() > 0) {
                Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    it2.next().onEventBegin(c725280Scg);
                }
            }
            if (C725480Sd0.LIZ(c725280Scg)) {
                C725430Scv.LIZ(new AwS13S1100100_11(c725280Scg, "default", SystemClock.elapsedRealtimeNanos(), 24));
            }
        }
        if (C725080ScM.LJIJ.contains(C13LE.LIZ(reusedUIAssem.getClass()))) {
            try {
                InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                if (interfaceC723720SaA != null) {
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("bindHostAndItem: host: ");
                    sbLIZ.append(reusedUIAssem);
                    sbLIZ.append(", proxy: ");
                    sbLIZ.append(this);
                    sbLIZ.append(", ");
                    sbLIZ.append(obj);
                    String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                    int i = C2187451AjH.LIZ;
                    interfaceC723720SaA.log("AssemList", strLIZIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        this.LLJI++;
        this.LL = obj;
        this.LLILLJJLI = list;
        this.LLILZIL = reusedUIAssem;
        this.LLJ = function1;
        this.LLIZ = function0;
        final ArrayList arrayList2 = new ArrayList();
        C723460SZk.LIZ(reusedUIAssem, arrayList2);
        LJIIIZ(arrayList2, new C724340SbA(this));
        C725280Scg c725280Scg2 = C725280Scg.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList3 = C725430Scv.LIZIZ;
            if (arrayList3.size() > 0) {
                Iterator<InterfaceC725440Scw> it3 = arrayList3.iterator();
                while (it3.hasNext()) {
                    it3.next().onEventEnd(c725280Scg2);
                }
            }
            if (C725480Sd0.LIZ(c725280Scg2)) {
                C725430Scv.LIZ(new AwS1S1110100_11(c725280Scg2, "default", SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), 4));
            }
        }
        C725290Sch c725290Sch = C725290Sch.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList4 = C725430Scv.LIZIZ;
            if (arrayList4.size() > 0) {
                Iterator<InterfaceC725440Scw> it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    it4.next().onEventBegin(c725290Sch);
                }
            }
            if (C725480Sd0.LIZ(c725290Sch)) {
                C725430Scv.LIZ(new AwS13S1100100_11(c725290Sch, "default", SystemClock.elapsedRealtimeNanos(), 25));
            }
        }
        LJIIJJI(reusedUIAssem);
        C725290Sch c725290Sch2 = C725290Sch.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList5 = C725430Scv.LIZIZ;
            if (arrayList5.size() > 0) {
                Iterator<InterfaceC725440Scw> it5 = arrayList5.iterator();
                while (it5.hasNext()) {
                    it5.next().onEventEnd(c725290Sch2);
                }
            }
            if (C725480Sd0.LIZ(c725290Sch2)) {
                C725430Scv.LIZ(new AwS1S1110100_11(c725290Sch2, "default", SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), 5));
            }
        }
        C725080ScM.LIZ().execute(new Runnable() { // from class: X.0Sb4
            public final void LIZ() {
                C724300Sb6 c724300Sb6;
                this.LL.LLJJIII.clear();
                C724270Sb3 c724270Sb3 = this.LL;
                c724270Sb3.LJIIIZ(arrayList2, new C724330Sb9(c724270Sb3));
                C724270Sb3 c724270Sb32 = this.LL;
                c724270Sb32.LLJILJILJ = true;
                ReusedAssem<? extends C03H5> reusedAssem = c724270Sb32.LLILZIL;
                if (reusedAssem != null && (c724300Sb6 = reusedAssem.LLIZLLLIL) != null) {
                    Object obj2 = c724270Sb32.LL;
                    List<Object> list2 = list;
                    long j = c724270Sb32.LLJILLL;
                    for (Map.Entry<C13IQ<?>, Object> entry : c724300Sb6.LIZ.entrySet()) {
                        AssemViewModel<?> assemViewModel = c724300Sb6.LIZIZ.get(entry.getKey());
                        if (assemViewModel != null) {
                            assemViewModel.maxScheduledGeneration = j;
                            AssemViewModel.syncItem2State$assem_release$default(assemViewModel, obj2, list2, entry.getValue(), null, 8, null);
                        }
                    }
                }
                C724270Sb3 c724270Sb33 = this.LL;
                ConcurrentHashMap<C13IQ<?>, Object> concurrentHashMap = c724270Sb33.LLJJ;
                List<Object> list3 = list;
                for (Map.Entry<C13IQ<?>, Object> entry2 : concurrentHashMap.entrySet()) {
                    AssemViewModel<?> assemViewModel2 = c724270Sb33.LLJJI.get(entry2.getKey());
                    if (assemViewModel2 != null) {
                        assemViewModel2.maxScheduledGeneration = c724270Sb33.LLJILLL;
                        AssemViewModel.syncItem2State$assem_release$default(assemViewModel2, c724270Sb33.LL, list3, entry2.getValue(), null, 8, null);
                    }
                }
                this.LL.LLJILLL++;
            }

            @Override // java.lang.Runnable
            public final void run() {
                boolean zLIZ;
                C1C7U.LIZ("ReusedSingleLayerProxy@1dad.bind$5");
                try {
                    LIZ();
                } finally {
                    if (!zLIZ) {
                    }
                }
                C1C7U.LIZIZ("ReusedSingleLayerProxy@1dad.bind$5");
            }
        });
    }
}
