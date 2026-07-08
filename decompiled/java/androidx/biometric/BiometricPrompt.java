package androidx.biometric;

import X.AbstractC21643419n6;
import X.C1813520xIE;
import X.C19EG;
import X.C356901a3;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStoreOwner;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes34.dex */
public final class BiometricPrompt {
    public FragmentManager LIZ;

    public static class ResetCallbackObserver implements DefaultLifecycleObserver, GenericLifecycleObserver {
        public final WeakReference<BiometricViewModel> LL;

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
            C356901a3.LIZLLL(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
            C356901a3.LJ(this, lifecycleOwner);
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
            C356901a3.LJFF(this, lifecycleOwner);
        }

        public ResetCallbackObserver(BiometricViewModel biometricViewModel) {
            this.LL = new WeakReference<>(biometricViewModel);
        }

        @Override // androidx.lifecycle.DefaultLifecycleObserver
        public final void onDestroy(LifecycleOwner lifecycleOwner) {
            if (this.LL.get() != null) {
                this.LL.get().LLILLJJLI = null;
            }
        }
    }

    public static Context LIZIZ(Fragment fragment) {
        C19EG activity = fragment.getActivity();
        if (activity != null) {
            return activity;
        }
        return fragment.getContext();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BiometricViewModel LIZJ(Context context) {
        if (context instanceof ViewModelStoreOwner) {
            return (BiometricViewModel) new ViewModelProvider((ViewModelStoreOwner) context).get(BiometricViewModel.class);
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0088  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LIZ(X.C1836540xtM r7, X.C14BY r8) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.biometric.BiometricPrompt.LIZ(X.0xtM, X.14BY):void");
    }

    public BiometricPrompt(Fragment fragment, Executor executor, AbstractC21643419n6 abstractC21643419n6) {
        if (fragment != null) {
            if (executor != null) {
                FragmentManager childFragmentManager = fragment.getChildFragmentManager();
                BiometricViewModel biometricViewModelLIZJ = LIZJ(LIZIZ(fragment));
                if (biometricViewModelLIZJ != null) {
                    fragment.getLifecycle().addObserver(new ResetCallbackObserver(biometricViewModelLIZJ));
                }
                this.LIZ = childFragmentManager;
                if (biometricViewModelLIZJ != null) {
                    biometricViewModelLIZJ.LL = executor;
                    biometricViewModelLIZJ.LLILLJJLI = abstractC21643419n6;
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Executor must not be null.");
        }
        throw new IllegalArgumentException("Fragment must not be null.");
    }

    public BiometricPrompt(C19EG c19eg, Executor executor, C1813520xIE c1813520xIE) {
        if (executor != null) {
            FragmentManager supportFragmentManager = c19eg.getSupportFragmentManager();
            BiometricViewModel biometricViewModelLIZJ = LIZJ(c19eg);
            this.LIZ = supportFragmentManager;
            if (biometricViewModelLIZJ != null) {
                biometricViewModelLIZJ.LL = executor;
                biometricViewModelLIZJ.LLILLJJLI = c1813520xIE;
                return;
            }
            return;
        }
        throw new IllegalArgumentException("Executor must not be null.");
    }
}
