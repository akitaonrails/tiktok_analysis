package androidx.lifecycle;

import androidx.fragment.app.Fragment;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes18.dex */
public final class WidgetInternalLiveSDKKt {
    public static final void ensureViewModel(Fragment fragment, ViewModel viewModel, Function0<String> function0) {
        ViewModelStore viewModelStore = fragment.getViewModelStore();
        String strInvoke = function0.invoke();
        if (viewModelStore.get(strInvoke) == null) {
            viewModelStore.put(strInvoke, viewModel);
        }
    }
}
