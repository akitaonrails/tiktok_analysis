package androidx.lifecycle;

import X.C19EG;
import androidx.fragment.app.Fragment;

/* JADX INFO: loaded from: classes26.dex */
public class ViewModelStores {
    public static ViewModelStore of(C19EG c19eg) {
        return c19eg.getViewModelStore();
    }

    public static ViewModelStore of(Fragment fragment) {
        return fragment.getViewModelStore();
    }
}
