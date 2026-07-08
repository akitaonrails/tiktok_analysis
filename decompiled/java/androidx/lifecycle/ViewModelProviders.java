package androidx.lifecycle;

import X.C19EG;
import android.app.Application;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: loaded from: classes8.dex */
public class ViewModelProviders {

    public static class DefaultFactory extends ViewModelProvider.AndroidViewModelFactory {
        public DefaultFactory(Application application) {
            super(application);
        }
    }

    public static ViewModelProvider of(C19EG c19eg) {
        return new ViewModelProvider(c19eg);
    }

    public static ViewModelProvider of(Fragment fragment) {
        return new ViewModelProvider(fragment);
    }

    public static ViewModelProvider of(C19EG c19eg, ViewModelProvider.Factory factory) {
        if (factory == null) {
            factory = c19eg.getDefaultViewModelProviderFactory();
        }
        return new ViewModelProvider(c19eg.getViewModelStore(), factory);
    }

    public static ViewModelProvider of(Fragment fragment, ViewModelProvider.Factory factory) {
        if (factory == null) {
            factory = fragment.getDefaultViewModelProviderFactory();
        }
        return new ViewModelProvider(fragment.getViewModelStore(), factory);
    }
}
