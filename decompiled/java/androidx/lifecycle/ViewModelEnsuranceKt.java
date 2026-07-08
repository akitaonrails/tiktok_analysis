package androidx.lifecycle;

import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes30.dex */
public final class ViewModelEnsuranceKt {
    public static final void ensureViewModel(Fragment fragment, ViewModel viewModel, Function0<String> function0) {
        ViewModelStore viewModelStoreOf = ViewModelStores.of(fragment);
        String strInvoke = function0.invoke();
        if (viewModelStoreOf.get(strInvoke) == null) {
            viewModelStoreOf.put(strInvoke, viewModel);
        }
    }
}
