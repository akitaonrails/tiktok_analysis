package X;

import X.InterfaceC0148002o;
import android.os.Looper;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Sws, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737800Sws<S extends InterfaceC0148002o, VM extends AssemViewModel<S>> implements C01GW<VM> {
    public final Function0<C13IQ<VM>> LL;
    public final ReusedAssem<?> LLILLJJLI;
    public final Function0<InterfaceC736830SvJ<S>> LLILLL;
    public final Function0<ViewModelProvider.Factory> LLILZ;
    public final Function1<S, S> LLILZIL;
    public final EnumC452301pR LLILZLL;
    public VM LLIZ;
    public final C01GW LLIZLLLIL = C452501pT.LIZIZ(new C737830Swv(this));

    @Override // X.C01GW
    public final Object getValue() {
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
                C725430Scv.LIZ(new C737840Sww(c737880Sx0, "refactor_holder_vm", SystemClock.elapsedRealtimeNanos()));
            }
        }
        Object objLIZ = this.LLIZ;
        if (objLIZ == null) {
            if (this.LLILZLL == EnumC452301pR.SYNCHRONIZED) {
                synchronized (C09R7.LIZ((C13IQ) this.LLIZLLLIL.getValue())) {
                    try {
                        objLIZ = this.LLIZ;
                        if (objLIZ == null) {
                            objLIZ = LIZ(this.LLILZLL);
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            } else {
                objLIZ = LIZ(this.LLILZLL);
            }
        }
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
                C725430Scv.LIZ(new C737810Swt(c737880Sx02, "refactor_holder_vm", SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), this));
            }
        }
        return objLIZ;
    }

    @Override // X.C01GW
    public final boolean isInitialized() {
        return this.LLIZ != null;
    }

    public final VM LIZ(EnumC452301pR enumC452301pR) {
        final ViewModelStore viewModelStore;
        AbstractC738140SxQ abstractC738140SxQ = this.LLILLJJLI;
        while (!(abstractC738140SxQ.getParent() instanceof InterfaceC719640SKs)) {
            abstractC738140SxQ = (AbstractC738140SxQ) abstractC738140SxQ.getParent();
        }
        LifecycleOwner parent = abstractC738140SxQ.getParent();
        Fragment fragmentLJI = C724240Sb0.LJI(parent);
        if (fragmentLJI != null) {
            ViewModelProvider.Factory factoryInvoke = this.LLILZ.invoke();
            try {
                viewModelStore = fragmentLJI.getViewModelStore();
            } catch (IllegalStateException e) {
                TryCatchGuardChecker.doCheck(e);
                viewModelStore = new ViewModelStore();
                FragmentManager fragmentManager = fragmentLJI.getFragmentManager();
                if (fragmentManager != null) {
                    fragmentManager.LJZL(new AbstractC813200VvC() { // from class: X.0Swu
                        @Override // X.AbstractC813200VvC
                        public final void onFragmentDestroyed(FragmentManager fragmentManager2, Fragment fragment) {
                            super.onFragmentDestroyed(fragmentManager2, fragment);
                            viewModelStore.clear();
                        }
                    }, false);
                }
            }
            VM vm = (VM) new ViewModelProvider(viewModelStore, factoryInvoke, C903300Zc8.LIZJ).get(((C13IQ) this.LLIZLLLIL.getValue()).LJI() + parent.hashCode(), C09R7.LIZ((C13IQ) this.LLIZLLLIL.getValue()));
            vm.setLifecycleRef(new WeakReference<>(parent.getLifecycle()));
            if (C725080ScM.LIZLLL) {
                try {
                    InterfaceC723720SaA interfaceC723720SaA = C725080ScM.LIZIZ;
                    if (interfaceC723720SaA != null) {
                        StringBuilder sbLIZ = C2188811AlT.LIZ();
                        sbLIZ.append("init vm ");
                        sbLIZ.append(vm);
                        sbLIZ.append(" in ");
                        sbLIZ.append(enumC452301pR);
                        String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
                        int i = C2187451AjH.LIZ;
                        interfaceC723720SaA.log("assem_vm", strLIZIZ);
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                }
            }
            vm.initialize(this.LLILLL.invoke(), this.LLILZIL);
            this.LLIZ = vm;
            return vm;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public C737800Sws(Function0 function0, ReusedAssem reusedAssem, C452080Ho6 c452080Ho6, Function0 function02, Function1 function1, EnumC452301pR enumC452301pR) {
        this.LL = function0;
        this.LLILLJJLI = reusedAssem;
        this.LLILLL = c452080Ho6;
        this.LLILZ = function02;
        this.LLILZIL = function1;
        this.LLILZLL = enumC452301pR;
    }
}
