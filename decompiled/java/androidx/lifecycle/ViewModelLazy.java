package androidx.lifecycle;

import X.AbstractC903280Zc6;
import X.C01GW;
import X.C13IQ;
import X.C19286210cm;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes29.dex */
public final class ViewModelLazy<VM extends ViewModel> implements C01GW<VM> {
    public VM cached;
    public final Function0<AbstractC903280Zc6> extrasProducer;
    public final Function0<ViewModelProvider.Factory> factoryProducer;
    public final Function0<ViewModelStore> storeProducer;
    public final C13IQ<VM> viewModelClass;

    @Override // X.C01GW
    public VM getValue() {
        VM vm = this.cached;
        if (vm != null) {
            return vm;
        }
        VM vm2 = (VM) ViewModelProvider.Companion.create(this.storeProducer.invoke(), this.factoryProducer.invoke(), this.extrasProducer.invoke()).get(this.viewModelClass);
        this.cached = vm2;
        return vm2;
    }

    @Override // X.C01GW
    public boolean isInitialized() {
        return this.cached != null;
    }

    public ViewModelLazy(C13IQ<VM> c13iq, Function0<? extends ViewModelStore> function0, Function0<? extends ViewModelProvider.Factory> function02) {
        this(c13iq, function0, function02, new C19286210cm());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ViewModelLazy(C13IQ<VM> c13iq, Function0<? extends ViewModelStore> function0, Function0<? extends ViewModelProvider.Factory> function02, Function0<? extends AbstractC903280Zc6> function03) {
        this.viewModelClass = c13iq;
        this.storeProducer = function0;
        this.factoryProducer = function02;
        this.extrasProducer = function03;
    }
}
