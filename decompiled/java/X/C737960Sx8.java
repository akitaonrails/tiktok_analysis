package X;

import X.InterfaceC0148002o;
import android.os.Looper;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.ext_power_list.AssemViewModelWithItem;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sx8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737960Sx8<S extends InterfaceC0148002o, VM extends AssemViewModel<S>, T extends ReusedAssem<? extends C03H5>, ITEM> implements InterfaceC724800Sbu<S, VM> {
    public final InterfaceC724760Sbq LIZ;
    public final T LIZIZ;
    public final Function0<C13IQ<VM>> LIZJ;
    public final Function0<String> LIZLLL;
    public final Function0<InterfaceC736830SvJ<S>> LJ;
    public final Function0<ViewModelProvider.Factory> LJFF;
    public final Function1<S, S> LJI;
    public final Function0<C0RTY> LJII;
    public final Function0<C724710Sbl> LJIIIIZZ;
    public final Function0<InterfaceC665370Q7z> LJIIIZ;
    public VM LJIIJ;
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new C738020SxE(this));

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C737960Sx8)) {
            return false;
        }
        C737960Sx8 c737960Sx8 = (C737960Sx8) obj;
        return Intrinsics.LJFF(this.LIZ, c737960Sx8.LIZ) && Intrinsics.LJFF(this.LIZIZ, c737960Sx8.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c737960Sx8.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c737960Sx8.LIZLLL) && Intrinsics.LJFF(this.LJ, c737960Sx8.LJ) && Intrinsics.LJFF(this.LJFF, c737960Sx8.LJFF) && Intrinsics.LJFF(this.LJI, c737960Sx8.LJI) && Intrinsics.LJFF(this.LJII, c737960Sx8.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c737960Sx8.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c737960Sx8.LJIIIZ);
    }

    public final int hashCode() {
        InterfaceC724760Sbq interfaceC724760Sbq = this.LIZ;
        int iHashCode = (((((((((interfaceC724760Sbq == null ? 0 : interfaceC724760Sbq.hashCode()) * 31) + this.LIZIZ.hashCode()) * 31) + this.LIZJ.hashCode()) * 31) + this.LIZLLL.hashCode()) * 31) + this.LJ.hashCode()) * 31;
        Function0<ViewModelProvider.Factory> function0 = this.LJFF;
        int iHashCode2 = (((iHashCode + (function0 == null ? 0 : function0.hashCode())) * 31) + this.LJI.hashCode()) * 31;
        Function0<C0RTY> function02 = this.LJII;
        int iHashCode3 = (iHashCode2 + (function02 == null ? 0 : function02.hashCode())) * 31;
        Function0<C724710Sbl> function03 = this.LJIIIIZZ;
        int iHashCode4 = (iHashCode3 + (function03 == null ? 0 : function03.hashCode())) * 31;
        Function0<InterfaceC665370Q7z> function04 = this.LJIIIZ;
        return iHashCode4 + (function04 != null ? function04.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("CellScopeViewModelProvideData(scope=");
        sbLIZ.append(this.LIZ);
        sbLIZ.append(", host=");
        sbLIZ.append(this.LIZIZ);
        sbLIZ.append(", viewModelClassProducer=");
        sbLIZ.append(this.LIZJ);
        sbLIZ.append(", keyFactory=");
        sbLIZ.append(this.LIZLLL);
        sbLIZ.append(", dispatcherFactory=");
        sbLIZ.append(this.LJ);
        sbLIZ.append(", factoryProducer=");
        sbLIZ.append(this.LJFF);
        sbLIZ.append(", argumentsAcceptor=");
        sbLIZ.append(this.LJI);
        sbLIZ.append(", hierarchyDataStore=");
        sbLIZ.append(this.LJII);
        sbLIZ.append(", hierarchyServiceStore=");
        sbLIZ.append(this.LJIIIIZZ);
        sbLIZ.append(", hierarchyDataVScopeProducer=");
        sbLIZ.append(this.LJIIIZ);
        sbLIZ.append(')');
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v9, types: [androidx.lifecycle.LifecycleOwner] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:593)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // X.InterfaceC724800Sbu
    public final VM LIZ() {
        Object c738060SxI;
        VM vm;
        Object obj;
        AssemViewModelWithItem assemViewModelWithItem;
        InterfaceC738070SxJ interfaceC738070SxJ;
        InterfaceC738070SxJ interfaceC738070SxJ2;
        ViewModelProvider.Factory newInstanceFactory;
        final ViewModelStore viewModelStore;
        Fragment fragment;
        FragmentManager fragmentManager;
        ViewModelProvider.Factory newInstanceFactory2;
        C259800zU c259800zU = new C259800zU();
        c259800zU.element = this.LIZIZ;
        while (true) {
            AbstractC738140SxQ abstractC738140SxQ = (AbstractC738140SxQ) c259800zU.element;
            c738060SxI = null;
            T parent = 0;
            c738060SxI = null;
            if ((abstractC738140SxQ != null ? abstractC738140SxQ.getParent() : null) instanceof InterfaceC719640SKs) {
                break;
            }
            AbstractC738140SxQ abstractC738140SxQ2 = (AbstractC738140SxQ) c259800zU.element;
            if (abstractC738140SxQ2 != null) {
                parent = abstractC738140SxQ2.getParent();
            }
            c259800zU.element = parent;
        }
        C724270Sb3 c724270Sb3 = this.LIZIZ.LLJI;
        if (Intrinsics.LJFF(this.LIZ, C0HHT.LIZ)) {
            C737880Sx0 c737880Sx0 = C737880Sx0.LIZ;
            if (C725450Scx.LIZJ) {
                ArrayList<InterfaceC725440Scw> arrayList = C725430Scv.LIZIZ;
                if (arrayList.size() > 0) {
                    Iterator<InterfaceC725440Scw> it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        it2.next().onEventBegin(c737880Sx0);
                    }
                }
                if (C725480Sd0.LIZ(c737880Sx0)) {
                    C725430Scv.LIZ(new C738000SxC(c737880Sx0, "default", SystemClock.elapsedRealtimeNanos()));
                }
            }
            C737990SxB c737990SxB = new C737990SxB(c724270Sb3, c259800zU);
            VM vm2 = this.LJIIJ;
            if (vm2 == null) {
                synchronized (LIZJ()) {
                    try {
                        vm2 = this.LJIIJ;
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
                if (vm2 == null) {
                    LifecycleOwner parent2 = ((AbstractC738140SxQ) c259800zU.element).getParent();
                    ViewModelStoreOwner viewModelStoreOwnerLJI = C724240Sb0.LJI(parent2);
                    if (viewModelStoreOwnerLJI == null && (viewModelStoreOwnerLJI = C724240Sb0.LIZ(parent2)) == null) {
                        "Required value was null.".toString();
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    try {
                        viewModelStore = viewModelStoreOwnerLJI.getViewModelStore();
                    } catch (IllegalStateException e) {
                        TryCatchGuardChecker.doCheck(e);
                        viewModelStore = new ViewModelStore();
                        if ((viewModelStoreOwnerLJI instanceof Fragment) && (fragment = (Fragment) viewModelStoreOwnerLJI) != null && (fragmentManager = fragment.getFragmentManager()) != null) {
                            fragmentManager.LJZL(new AbstractC813200VvC() { // from class: X.0SxF
                                @Override // X.AbstractC813200VvC
                                public final void onFragmentDestroyed(FragmentManager fragmentManager2, Fragment fragment2) {
                                    super.onFragmentDestroyed(fragmentManager2, fragment2);
                                    viewModelStore.clear();
                                }
                            }, false);
                        }
                    }
                    synchronized (viewModelStore) {
                        try {
                            Function0<ViewModelProvider.Factory> function0 = this.LJFF;
                            if (function0 == null || (newInstanceFactory2 = function0.invoke()) == null) {
                                newInstanceFactory2 = new ViewModelProvider.NewInstanceFactory();
                            }
                            ViewModelProvider viewModelProvider = new ViewModelProvider(viewModelStore, newInstanceFactory2, C903300Zc8.LIZJ);
                            StringBuilder sbLIZ = C2188811AlT.LIZ();
                            sbLIZ.append(LIZJ().LJI());
                            sbLIZ.append(parent2.hashCode());
                            vm = (VM) viewModelProvider.get(C2188811AlT.LIZIZ(sbLIZ), C09R7.LIZ(LIZJ()));
                            if (!vm._initialized) {
                                vm.useOwnerLifecycle = true;
                                vm.setLifecycleRef(new WeakReference<>(parent2.getLifecycle()));
                                vm.initialize(this.LJ.invoke(), this.LJI);
                                Function0<C724710Sbl> function02 = this.LJIIIIZZ;
                                vm.hierarchyServiceStore = function02 != null ? function02.invoke() : null;
                            }
                            Function0<C0RTY> function03 = this.LJII;
                            vm.hierarchyDataStore = function03 != null ? function03.invoke() : null;
                            vm.injectHierarchyDataVScopeProducer(this.LJIIIZ);
                            this.LJIIJ = vm;
                        } catch (Throwable th2) {
                            TryCatchGuardChecker.doCheck(th2);
                            throw th2;
                        }
                    }
                    c737990SxB.invoke(vm);
                    C737880Sx0 c737880Sx02 = C737880Sx0.LIZ;
                    if (C725450Scx.LIZJ) {
                        ArrayList<InterfaceC725440Scw> arrayList2 = C725430Scv.LIZIZ;
                        if (arrayList2.size() > 0) {
                            Iterator<InterfaceC725440Scw> it3 = arrayList2.iterator();
                            while (it3.hasNext()) {
                                it3.next().onEventEnd(c737880Sx02);
                            }
                        }
                        if (C725480Sd0.LIZ(c737880Sx02)) {
                            C725430Scv.LIZ(new C737970Sx9(c737880Sx02, "default", SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), this));
                        }
                    }
                }
            }
            c737990SxB.invoke(vm2);
            return vm2;
        }
        C737880Sx0 c737880Sx03 = C737880Sx0.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList3 = C725430Scv.LIZIZ;
            if (arrayList3.size() > 0) {
                Iterator<InterfaceC725440Scw> it4 = arrayList3.iterator();
                while (it4.hasNext()) {
                    it4.next().onEventBegin(c737880Sx03);
                }
            }
            if (C725480Sd0.LIZ(c737880Sx03)) {
                C725430Scv.LIZ(new C738010SxD(c737880Sx03, "default", SystemClock.elapsedRealtimeNanos()));
            }
        }
        C724270Sb3 c724270Sb32 = ((ReusedAssem) c259800zU.element).LLJI;
        if (c724270Sb32 == null) {
            "proxy not bound to Assem yet".toString();
            throw new IllegalArgumentException("proxy not bound to Assem yet");
        }
        if (c724270Sb32.LLILZ == null) {
            ViewModelStore viewModelStore2 = c724270Sb32.getViewModelStore();
            Function0<ViewModelProvider.Factory> function04 = this.LJFF;
            if (function04 == null || (newInstanceFactory = function04.invoke()) == null) {
                newInstanceFactory = new ViewModelProvider.NewInstanceFactory();
            }
            c724270Sb32.LLILZ = new ViewModelProvider(viewModelStore2, newInstanceFactory, C903300Zc8.LIZJ);
        }
        synchronized (c724270Sb32.getViewModelStore()) {
            try {
                ViewModelProvider viewModelProvider2 = c724270Sb32.LLILZ;
                if (viewModelProvider2 == null) {
                    "Required value was null.".toString();
                    throw new IllegalArgumentException("Required value was null.");
                }
                vm = (VM) viewModelProvider2.get(this.LIZLLL.invoke(), C09R7.LIZ(LIZJ()));
                if (C725080ScM.LIZLLL) {
                    try {
                        InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                        if (interfaceC723720SaA != null) {
                            StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                            sbLIZ2.append("found cell vm ");
                            sbLIZ2.append(vm);
                            sbLIZ2.append(", isinit: ");
                            sbLIZ2.append(vm._initialized);
                            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ2);
                            int i = C2187451AjH.LIZ;
                            interfaceC723720SaA.log("assem_vm", strLIZIZ);
                        }
                    } catch (Throwable th3) {
                        TryCatchGuardChecker.doCheck(th3);
                    }
                }
                if (!vm._initialized) {
                    vm.usedInReusedScene = true;
                    vm.setLifecycleRef(new WeakReference<>(c724270Sb32.LLJIJIL));
                    Function0<C0RTY> function05 = this.LJII;
                    vm.hierarchyDataStore = function05 != null ? function05.invoke() : null;
                    Function0<C724710Sbl> function06 = this.LJIIIIZZ;
                    vm.hierarchyServiceStore = function06 != null ? function06.invoke() : null;
                    vm.injectHierarchyDataVScopeProducer(this.LJIIIZ);
                    vm.initialize(this.LJ.invoke(), this.LJI);
                }
            } catch (Throwable th4) {
                TryCatchGuardChecker.doCheck(th4);
                throw th4;
            }
        }
        boolean z = vm instanceof InterfaceC738070SxJ;
        C738050SxH c738050SxH = (!z || (interfaceC738070SxJ2 = (InterfaceC738070SxJ) vm) == null) ? null : new C738050SxH(interfaceC738070SxJ2);
        if (z && (interfaceC738070SxJ = (InterfaceC738070SxJ) vm) != null) {
            c738060SxI = new C738060SxI(interfaceC738070SxJ);
        }
        if ((vm instanceof AssemViewModelWithItem) && (assemViewModelWithItem = (AssemViewModelWithItem) vm) != null) {
            assemViewModelWithItem.proxy = c724270Sb32;
        }
        if (c738050SxH != null && c724270Sb3 != null) {
            c724270Sb3.LJIIJ(vm, c738050SxH);
        }
        if (c738060SxI != null && (obj = c724270Sb32.LLJ) != null) {
            vm.syncState2Item$assem_release(c724270Sb32.LL, c738060SxI, obj);
        }
        C737880Sx0 c737880Sx04 = C737880Sx0.LIZ;
        if (C725450Scx.LIZJ) {
            ArrayList<InterfaceC725440Scw> arrayList4 = C725430Scv.LIZIZ;
            if (arrayList4.size() > 0) {
                Iterator<InterfaceC725440Scw> it5 = arrayList4.iterator();
                while (it5.hasNext()) {
                    it5.next().onEventEnd(c737880Sx04);
                }
            }
            if (C725480Sd0.LIZ(c737880Sx04)) {
                C725430Scv.LIZ(new C737980SxA(c737880Sx04, "default", SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), this));
                return vm;
            }
        }
        return vm;
    }

    public final C13IQ<VM> LIZJ() {
        return (C13IQ) this.LJIIJJI.getValue();
    }

    public final InterfaceC724760Sbq LIZIZ() {
        return this.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public C737960Sx8(InterfaceC724760Sbq interfaceC724760Sbq, ReusedAssem reusedAssem, Function0 function0, Function0 function02, C452080Ho6 c452080Ho6, Function0 function03, Function1 function1, C451660HnQ c451660HnQ, C723690Sa7 c723690Sa7, C738100SxM c738100SxM) {
        this.LIZ = interfaceC724760Sbq;
        this.LIZIZ = reusedAssem;
        this.LIZJ = function0;
        this.LIZLLL = function02;
        this.LJ = c452080Ho6;
        this.LJFF = function03;
        this.LJI = function1;
        this.LJII = c451660HnQ;
        this.LJIIIIZZ = c723690Sa7;
        this.LJIIIZ = c738100SxM;
    }
}
