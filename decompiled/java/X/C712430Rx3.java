package X;

import android.app.Application;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;

/* JADX INFO: renamed from: X.0Rx3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes12.dex */
public final class C712430Rx3 {
    public static Application LIZ(C19EG c19eg) {
        Application application = c19eg.getApplication();
        if (application != null) {
            return application;
        }
        throw new IllegalStateException("Your activity/fragment is not yet attached to Application. You can't request ViewModel before onCreate call.");
    }

    public static ViewModelProvider LIZIZ(Fragment fragment, ViewModelStoreOwner viewModelStoreOwner) {
        C19EG activity = fragment.getActivity();
        if (activity != null) {
            return new ViewModelProvider(viewModelStoreOwner.getViewModelStore(), ViewModelProvider.AndroidViewModelFactory.getInstance(LIZ(activity)));
        }
        throw new IllegalStateException("Can't create ViewModelProvider for detached fragment");
    }

    public static ViewModelProvider LIZJ(Fragment fragment, ViewModelStoreOwner viewModelStoreOwner, ViewModelProvider.Factory factory) {
        C19EG activity = fragment.getActivity();
        if (activity != null) {
            LIZ(activity);
            return new ViewModelProvider(viewModelStoreOwner.getViewModelStore(), factory);
        }
        throw new IllegalStateException("Can't create ViewModelProvider for detached fragment");
    }
}
