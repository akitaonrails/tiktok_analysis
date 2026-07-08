package X;

import X.InterfaceC0148002o;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.SharedViewModelProvider;
import androidx.lifecycle.ViewModelProvider;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0SvV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C736950SvV<S extends InterfaceC0148002o, VM extends AssemViewModel<S>> implements C01GW<VM> {
    public static final /* synthetic */ int LLJIJIL = 0;
    public final C13IQ<VM> LL;
    public final Function0<String> LLILLJJLI;
    public final Function0<InterfaceC736830SvJ<S>> LLILLL;
    public final Function0<LifecycleOwner> LLILZ;
    public final Function0<ViewModelProvider.Factory> LLILZIL;
    public final Function1<S, S> LLILZLL;
    public final Function0<C0RTY> LLIZ;
    public final Function0<C724710Sbl> LLIZLLLIL;
    public final Function0<InterfaceC665370Q7z> LLJ;
    public VM LLJI;

    @Override // X.C01GW
    /* JADX INFO: renamed from: LIZ, reason: merged with bridge method [inline-methods] */
    public final VM getValue() {
        VM vm = this.LLJI;
        if (vm == null) {
            synchronized (C09R7.LIZ(this.LL)) {
                try {
                    vm = this.LLJI;
                    if (vm == null) {
                        ViewModelProvider.Factory factoryInvoke = this.LLILZIL.invoke();
                        VM vm2 = this.LLILLJJLI != null ? (VM) new SharedViewModelProvider(factoryInvoke).get(this.LLILZ.invoke().getLifecycle(), this.LLILLJJLI.invoke(), C09R7.LIZ(this.LL)) : (VM) new SharedViewModelProvider(factoryInvoke).get(this.LLILZ.invoke().getLifecycle(), C09R7.LIZ(this.LL));
                        C736940SvU.LIZ(vm2, this.LLILZ, this.LLIZ, this.LLIZLLLIL, this.LLJ, this.LLILLL, this.LLILZLL);
                        this.LLJI = vm2;
                        return vm2;
                    }
                } catch (Throwable th) {
                    TryCatchGuardChecker.doCheck(th);
                    throw th;
                }
            }
        }
        return vm;
    }

    @Override // X.C01GW
    public final boolean isInitialized() {
        return this.LLJI != null;
    }

    public C736950SvV(C19719912Dl c19719912Dl, Function0 function0, C452070Ho5 c452070Ho5, C1622206Wu c1622206Wu, Function0 function02, Function1 function1, Function0 function03, Function0 function04, Function0 function05) {
        this.LL = c19719912Dl;
        this.LLILLJJLI = function0;
        this.LLILLL = c452070Ho5;
        this.LLILZ = c1622206Wu;
        this.LLILZIL = function02;
        this.LLILZLL = function1;
        this.LLIZ = function03;
        this.LLIZLLLIL = function04;
        this.LLJ = function05;
    }
}
