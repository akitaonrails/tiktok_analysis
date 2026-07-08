package X;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: X.10cl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C19286110cl<VM extends ViewModel> implements C01GW<VM> {
    public final /* synthetic */ ViewModelLazy<VM> LL;
    public final C13IQ<VM> LLILLJJLI;
    public final Function0<ViewModelStore> LLILLL;
    public final Function0<ViewModelProvider.Factory> LLILZ;

    @Override // X.C01GW
    public final boolean isInitialized() {
        return this.LL.isInitialized();
    }

    @Override // X.C01GW
    public final Object getValue() {
        return this.LL.getValue();
    }

    public C19286110cl(C19719912Dl c19719912Dl, Function0 function0, Function0 function02) {
        this.LL = new ViewModelLazy<>(c19719912Dl, function0, function02, new C19286210cm());
        this.LLILLJJLI = c19719912Dl;
        this.LLILLL = function0;
        this.LLILZ = function02;
    }
}
