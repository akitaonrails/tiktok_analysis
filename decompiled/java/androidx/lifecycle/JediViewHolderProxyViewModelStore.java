package androidx.lifecycle;

import X.C01GW;
import X.C452501pT;
import java.util.HashMap;
import java.util.Iterator;
import kotlin.jvm.internal.AFwS217S0000000_28;

/* JADX INFO: loaded from: classes29.dex */
public final class JediViewHolderProxyViewModelStore {
    public final C01GW viewModels$delegate = C452501pT.LIZIZ(AFwS217S0000000_28.get$arr$(10));

    private final HashMap<String, ViewModel> getViewModels() {
        return (HashMap) this.viewModels$delegate.getValue();
    }

    public final void clear() {
        Iterator<T> it2 = getViewModels().values().iterator();
        while (it2.hasNext()) {
            ((ViewModel) it2.next()).onCleared();
        }
        getViewModels().clear();
    }

    public final ViewModel get(String str) {
        return getViewModels().get(str);
    }

    public final void put(String str, ViewModel viewModel) {
        ViewModel viewModelPut = getViewModels().put(str, viewModel);
        if (viewModelPut != null) {
            viewModelPut.onCleared();
        }
    }
}
