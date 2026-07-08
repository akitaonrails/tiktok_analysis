package X;

import X.InterfaceC0148002o;
import android.os.Looper;
import android.os.SystemClock;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS13S1100100_11;
import kotlin.jvm.internal.AwS2S1210100_11;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0Swq, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C737780Swq<S extends InterfaceC0148002o, VM extends AssemViewModel<S>> implements C01GW<VM> {
    public final C13IQ<VM> LL;
    public final Function0<String> LLILLJJLI;
    public final Function0<InterfaceC736830SvJ<S>> LLILLL;
    public final Function0<LifecycleOwner> LLILZ;
    public final LifecycleOwner LLILZIL;
    public final Function0<ViewModelProvider.Factory> LLILZLL;
    public final Function1<S, S> LLIZ;
    public final C0RDF LLIZLLLIL;
    public final EnumC452301pR LLJ;
    public VM LLJI;

    public final VM LIZ() {
        ViewModelStore viewModelStore;
        Set<AssemViewModel<?>> setLIZ;
        ViewModelProvider.Factory factoryInvoke = this.LLILZLL.invoke();
        Fragment fragmentLJI = C724240Sb0.LJI(this.LLILZIL);
        if (fragmentLJI == null) {
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        try {
            viewModelStore = fragmentLJI.getViewModelStore();
        } catch (IllegalStateException e) {
            TryCatchGuardChecker.doCheck(e);
            viewModelStore = new ViewModelStore();
            FragmentManager fragmentManager = fragmentLJI.getFragmentManager();
            if (fragmentManager != null) {
                fragmentManager.LJZL(new C738690SyJ(viewModelStore, 0), false);
            }
        }
        VM vm = (VM) new ViewModelProvider(viewModelStore, factoryInvoke, C903300Zc8.LIZJ).get(this.LLILLJJLI.invoke(), C09R7.LIZ(this.LL));
        vm.setLifecycleRef(new WeakReference<>(this.LLILZ.invoke().getLifecycle()));
        vm.initialize(this.LLILLL.invoke(), this.LLIZ);
        C0RDF c0rdf = this.LLIZLLLIL;
        if (c0rdf != null && (setLIZ = c0rdf.LIZ()) != null) {
            setLIZ.add(vm);
        }
        this.LLJI = vm;
        return vm;
    }

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
                C725430Scv.LIZ(new AwS13S1100100_11(c737880Sx0, "refactor_holder_vm", SystemClock.elapsedRealtimeNanos(), 14));
            }
        }
        AssemViewModel assemViewModelLIZ = this.LLJI;
        if (assemViewModelLIZ == null) {
            if (this.LLJ == EnumC452301pR.SYNCHRONIZED) {
                synchronized (this.LL) {
                    try {
                        assemViewModelLIZ = this.LLJI;
                        if (assemViewModelLIZ == null) {
                            assemViewModelLIZ = LIZ();
                        }
                    } catch (Throwable th) {
                        TryCatchGuardChecker.doCheck(th);
                        throw th;
                    }
                }
            } else {
                assemViewModelLIZ = LIZ();
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
                    C725430Scv.LIZ(new AwS2S1210100_11(c737880Sx02, "refactor_holder_vm", SystemClock.elapsedRealtimeNanos(), Intrinsics.LJFF(C786410Ut5.u3(), Looper.getMainLooper().getThread()), this, 10));
                }
            }
        }
        return assemViewModelLIZ;
    }

    @Override // X.C01GW
    public final boolean isInitialized() {
        return this.LLJI != null;
    }

    public C737780Swq(C19719912Dl c19719912Dl, C1276904z9 c1276904z9, C452080Ho6 c452080Ho6, C1622206Wu c1622206Wu, LifecycleOwner lifecycleOwner, Function0 function0, Function1 function1, C0RDF c0rdf, EnumC452301pR enumC452301pR) {
        this.LL = c19719912Dl;
        this.LLILLJJLI = c1276904z9;
        this.LLILLL = c452080Ho6;
        this.LLILZ = c1622206Wu;
        this.LLILZIL = lifecycleOwner;
        this.LLILZLL = function0;
        this.LLIZ = function1;
        this.LLIZLLLIL = c0rdf;
        this.LLJ = enumC452301pR;
    }
}
