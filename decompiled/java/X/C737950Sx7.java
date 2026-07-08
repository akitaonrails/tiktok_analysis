package X;

import X.InterfaceC0148002o;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS555S0100000_11;
import kotlin.jvm.internal.AwS625S0100000_11;
import kotlin.jvm.internal.AwS660S0100000_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sx7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737950Sx7<S extends InterfaceC0148002o, VM extends AssemViewModel<S>, ITEM> implements InterfaceC724800Sbu<S, VM> {
    public final InterfaceC724760Sbq LIZ;
    public final ReusedAssem<?> LIZIZ;
    public final Function0<C13IQ<VM>> LIZJ;
    public final Function0<String> LIZLLL;
    public final Function0<InterfaceC736830SvJ<S>> LJ;
    public final Function0<ViewModelProvider.Factory> LJFF;
    public final Function1<S, S> LJI;
    public final Function0<C0RTY> LJII;
    public final Function0<C724710Sbl> LJIIIIZZ;
    public final Function0<InterfaceC665370Q7z> LJIIIZ;
    public VM LJIIJ;
    public final C01GW LJIIJJI = C452501pT.LIZIZ(new AwS555S0100000_11(this, (C737950Sx7<InterfaceC0148002o, AssemViewModel<Object>, Object>) 1351));

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C737950Sx7)) {
            return false;
        }
        C737950Sx7 c737950Sx7 = (C737950Sx7) obj;
        return Intrinsics.LJFF(this.LIZ, c737950Sx7.LIZ) && Intrinsics.LJFF(this.LIZIZ, c737950Sx7.LIZIZ) && Intrinsics.LJFF(this.LIZJ, c737950Sx7.LIZJ) && Intrinsics.LJFF(this.LIZLLL, c737950Sx7.LIZLLL) && Intrinsics.LJFF(this.LJ, c737950Sx7.LJ) && Intrinsics.LJFF(this.LJFF, c737950Sx7.LJFF) && Intrinsics.LJFF(this.LJI, c737950Sx7.LJI) && Intrinsics.LJFF(this.LJII, c737950Sx7.LJII) && Intrinsics.LJFF(this.LJIIIIZZ, c737950Sx7.LJIIIIZZ) && Intrinsics.LJFF(this.LJIIIZ, c737950Sx7.LJIIIZ);
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
        sbLIZ.append("ListScopeViewModelProvideData(scope=");
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

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        if (r2 != null) goto L28;
     */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final VM LIZ() {
        /*
            Method dump skipped, instruction units count: 541
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C737950Sx7.LIZ():com.bytedance.assem.arch.viewModel.AssemViewModel");
    }

    public final Pair<ReusedAssem<? extends C03H5>, C0SMN<?, ?>> LIZLLL() {
        AbstractC738140SxQ abstractC738140SxQ = this.LIZIZ;
        while (true) {
            LifecycleOwner parent = null;
            if ((abstractC738140SxQ != null ? abstractC738140SxQ.getParent() : null) instanceof C0SMN) {
                return new Pair<>(abstractC738140SxQ, abstractC738140SxQ.getParent());
            }
            if (abstractC738140SxQ != null) {
                parent = abstractC738140SxQ.getParent();
            }
            abstractC738140SxQ = (AbstractC738140SxQ) parent;
        }
    }

    public final InterfaceC724760Sbq LIZJ() {
        return this.LIZ;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static Pair LIZIZ(AssemViewModel assemViewModel) {
        AwS660S0100000_11 awS660S0100000_11;
        InterfaceC738070SxJ interfaceC738070SxJ;
        InterfaceC738070SxJ interfaceC738070SxJ2;
        boolean z = assemViewModel instanceof InterfaceC738070SxJ;
        AwS625S0100000_11 awS625S0100000_11 = null;
        if (z && (interfaceC738070SxJ2 = (InterfaceC738070SxJ) assemViewModel) != null) {
            awS660S0100000_11 = new AwS660S0100000_11(interfaceC738070SxJ2, 2);
        } else {
            awS660S0100000_11 = null;
        }
        if (z && (interfaceC738070SxJ = (InterfaceC738070SxJ) assemViewModel) != null) {
            awS625S0100000_11 = new AwS625S0100000_11(interfaceC738070SxJ, 103);
        }
        return new Pair(awS660S0100000_11, awS625S0100000_11);
    }

    public final VM LJ(Fragment fragment, ViewModelStore viewModelStore, String str, Lifecycle lifecycle, boolean z, boolean z2, Function1<? super VM, Unit> function1) {
        ViewModelProvider.Factory newInstanceFactory;
        VM vm;
        C724710Sbl c724710SblInvoke;
        FragmentManager fragmentManager;
        if (z && (fragmentManager = fragment.getFragmentManager()) != null) {
            fragmentManager.LJZL(new C738690SyJ(viewModelStore, 2), false);
        }
        synchronized (this.LJIIJJI.getValue().getClass()) {
            try {
                Function0<ViewModelProvider.Factory> function0 = this.LJFF;
                if (function0 == null || (newInstanceFactory = function0.invoke()) == null) {
                    newInstanceFactory = new ViewModelProvider.NewInstanceFactory();
                }
                C0RTY c0rtyInvoke = null;
                vm = (VM) new ViewModelProvider(viewModelStore, newInstanceFactory, C903300Zc8.LIZJ).get(str, C09R7.LIZ((C13IQ) this.LJIIJJI.getValue()));
                C0RTY c0rtyInvoke2 = null;
                if (!vm._initialized) {
                    vm.setLifecycleRef(new WeakReference<>(lifecycle));
                    vm.initialize(this.LJ.invoke(), this.LJI);
                    Function0<C724710Sbl> function02 = this.LJIIIIZZ;
                    if (function02 != null) {
                        c724710SblInvoke = function02.invoke();
                    } else {
                        c724710SblInvoke = null;
                    }
                    vm.hierarchyServiceStore = c724710SblInvoke;
                    if (!z2) {
                        Function0<C0RTY> function03 = this.LJII;
                        if (function03 != null) {
                            c0rtyInvoke = function03.invoke();
                        }
                        vm.hierarchyDataStore = c0rtyInvoke;
                        vm.injectHierarchyDataVScopeProducer(this.LJIIIZ);
                    }
                    if (function1 != null) {
                        function1.invoke(vm);
                    }
                }
                if (z2) {
                    Function0<C0RTY> function04 = this.LJII;
                    if (function04 != null) {
                        c0rtyInvoke2 = function04.invoke();
                    }
                    vm.hierarchyDataStore = c0rtyInvoke2;
                    vm.injectHierarchyDataVScopeProducer(this.LJIIIZ);
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
                throw th;
            }
        }
        return vm;
    }

    public C737950Sx7(InterfaceC724760Sbq interfaceC724760Sbq, ReusedAssem reusedAssem, Function0 function0, Function0 function02, C452080Ho6 c452080Ho6, Function0 function03, Function1 function1, C451660HnQ c451660HnQ, C723690Sa7 c723690Sa7, C738100SxM c738100SxM) {
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
