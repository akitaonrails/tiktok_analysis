package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.0JEX, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0JEX<VM extends ViewModel> implements C01GW<VM> {
    public final C13IQ<VM> LL;
    public final Function0<ViewModelStore> LLILLJJLI;
    public final Function0<ViewModelProvider.Factory> LLILLL;
    public VM LLILZ;

    @Override // X.C01GW
    public final Object getValue() {
        VM vm = this.LLILZ;
        if (vm != null) {
            return vm;
        }
        VM vm2 = (VM) new ViewModelProvider(this.LLILLJJLI.invoke(), this.LLILLL.invoke()).get(C09R7.LIZ(this.LL));
        this.LLILZ = vm2;
        return vm2;
    }

    @Override // X.C01GW
    public final boolean isInitialized() {
        return this.LLILZ != null;
    }

    public C0JEX(C19719912Dl c19719912Dl, Function0 function0, Function0 function02) {
        this.LL = c19719912Dl;
        this.LLILLJJLI = function0;
        this.LLILLL = function02;
    }
}
