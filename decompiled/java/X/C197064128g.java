package X;

import Y.ARunnableS132S0100000_32;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;

/* JADX INFO: renamed from: X.128g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C197064128g implements HasDefaultViewModelProviderFactory, C128Y, ViewModelStoreOwner {
    public final Fragment LL;
    public final ViewModelStore LLILLJJLI;
    public final Runnable LLILLL;
    public ViewModelProvider.Factory LLILZ;
    public LifecycleRegistry LLILZIL;
    public C197065128h LLILZLL;

    public final void LIZIZ() {
        if (this.LLILZIL == null) {
            this.LLILZIL = new LifecycleRegistry(this);
            C197065128h c197065128hLIZ = C197069128l.LIZ(this);
            this.LLILZLL = c197065128hLIZ;
            c197065128hLIZ.LIZ.LIZIZ();
            this.LLILLL.run();
        }
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final AbstractC903280Zc6 getDefaultViewModelCreationExtras() {
        Context contextN3 = C786410Ut5.N3(this.LL.requireContext());
        while (true) {
            if (!(contextN3 instanceof ContextWrapper)) {
                contextN3 = null;
                break;
            }
            if (contextN3 instanceof Application) {
                break;
            }
            contextN3 = ((ContextWrapper) contextN3).getBaseContext();
        }
        C903290Zc7 c903290Zc7 = new C903290Zc7();
        if (contextN3 != null) {
            c903290Zc7.LIZIZ(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, contextN3);
        }
        c903290Zc7.LIZIZ(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this.LL);
        c903290Zc7.LIZIZ(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        if (this.LL.getArguments() != null) {
            c903290Zc7.LIZIZ(SavedStateHandleSupport.DEFAULT_ARGS_KEY, this.LL.getArguments());
        }
        return c903290Zc7;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        Application application;
        ViewModelProvider.Factory defaultViewModelProviderFactory = this.LL.getDefaultViewModelProviderFactory();
        if (!defaultViewModelProviderFactory.equals(this.LL.mDefaultFactory)) {
            this.LLILZ = defaultViewModelProviderFactory;
            return defaultViewModelProviderFactory;
        }
        if (this.LLILZ == null) {
            Context contextN3 = C786410Ut5.N3(this.LL.requireContext());
            while (true) {
                if (!(contextN3 instanceof ContextWrapper)) {
                    application = null;
                    break;
                }
                if (contextN3 instanceof Application) {
                    application = (Application) contextN3;
                    break;
                }
                contextN3 = ((ContextWrapper) contextN3).getBaseContext();
            }
            Fragment fragment = this.LL;
            this.LLILZ = new SavedStateViewModelFactory(application, fragment, fragment.getArguments());
        }
        return this.LLILZ;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        LIZIZ();
        return this.LLILZIL;
    }

    @Override // X.C128Y
    public final C197066128i getSavedStateRegistry() {
        LIZIZ();
        return this.LLILZLL.LIZIZ;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        LIZIZ();
        return this.LLILLJJLI;
    }

    public final void LIZ(Lifecycle.Event event) {
        this.LLILZIL.handleLifecycleEvent(event);
    }

    public C197064128g(Fragment fragment, ViewModelStore viewModelStore, ARunnableS132S0100000_32 aRunnableS132S0100000_32) {
        this.LL = fragment;
        this.LLILLJJLI = viewModelStore;
        this.LLILLL = aRunnableS132S0100000_32;
    }
}
