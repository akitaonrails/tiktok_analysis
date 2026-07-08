package androidx.lifecycle;

import com.bytedance.scene.Scene;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes30.dex */
public final class SceneInternalKt {
    public static final void ensureViewModel(Scene scene, ViewModel viewModel, Function0<String> function0) {
        ViewModelStore viewModelStore = scene.getViewModelStore();
        String strInvoke = function0.invoke();
        if (viewModelStore.get(strInvoke) == null) {
            viewModelStore.put(strInvoke, viewModel);
        }
    }
}
