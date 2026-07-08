package androidx.lifecycle;

import X.AbstractC903280Zc6;
import X.C128Y;
import X.C13IQ;
import X.C13LE;
import X.C19566311gr;
import X.InterfaceC197061128d;
import X.InterfaceC902960Zba;
import android.os.Bundle;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: loaded from: classes30.dex */
public final class SavedStateHandleSupport {
    public static final InterfaceC902960Zba<C128Y> SAVED_STATE_REGISTRY_OWNER_KEY = new InterfaceC902960Zba<C128Y>() { // from class: androidx.lifecycle.SavedStateHandleSupport$special$$inlined$Key$1
    };
    public static final InterfaceC902960Zba<ViewModelStoreOwner> VIEW_MODEL_STORE_OWNER_KEY = new InterfaceC902960Zba<ViewModelStoreOwner>() { // from class: androidx.lifecycle.SavedStateHandleSupport$special$$inlined$Key$2
    };
    public static final InterfaceC902960Zba<Bundle> DEFAULT_ARGS_KEY = new InterfaceC902960Zba<Bundle>() { // from class: androidx.lifecycle.SavedStateHandleSupport$special$$inlined$Key$3
    };

    public static final SavedStateHandle createSavedStateHandle(AbstractC903280Zc6 abstractC903280Zc6) {
        C128Y c128y = (C128Y) abstractC903280Zc6.LIZ(SAVED_STATE_REGISTRY_OWNER_KEY);
        if (c128y != null) {
            ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) abstractC903280Zc6.LIZ(VIEW_MODEL_STORE_OWNER_KEY);
            if (viewModelStoreOwner != null) {
                Bundle bundle = (Bundle) abstractC903280Zc6.LIZ(DEFAULT_ARGS_KEY);
                String str = (String) abstractC903280Zc6.LIZ(ViewModelProvider.VIEW_MODEL_KEY);
                if (str != null) {
                    return createSavedStateHandle(c128y, viewModelStoreOwner, str, bundle);
                }
                throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_KEY`");
            }
            throw new IllegalArgumentException("CreationExtras must have a value by `VIEW_MODEL_STORE_OWNER_KEY`");
        }
        throw new IllegalArgumentException("CreationExtras must have a value by `SAVED_STATE_REGISTRY_OWNER_KEY`");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T extends C128Y & ViewModelStoreOwner> void enableSavedStateHandles(T t) {
        Lifecycle.State currentState = t.getLifecycle().getCurrentState();
        if (currentState != Lifecycle.State.INITIALIZED && currentState != Lifecycle.State.CREATED) {
            "Failed requirement.".toString();
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (t.getSavedStateRegistry().LIZIZ() == null) {
            SavedStateHandlesProvider savedStateHandlesProvider = new SavedStateHandlesProvider(t.getSavedStateRegistry(), t);
            t.getSavedStateRegistry().LIZJ("androidx.lifecycle.internal.SavedStateHandlesProvider", savedStateHandlesProvider);
            t.getLifecycle().addObserver(new SavedStateHandleAttacher(savedStateHandlesProvider));
        }
    }

    public static final SavedStateHandlesProvider getSavedStateHandlesProvider(C128Y c128y) {
        SavedStateHandlesProvider savedStateHandlesProvider;
        InterfaceC197061128d interfaceC197061128dLIZIZ = c128y.getSavedStateRegistry().LIZIZ();
        if ((interfaceC197061128dLIZIZ instanceof SavedStateHandlesProvider) && (savedStateHandlesProvider = (SavedStateHandlesProvider) interfaceC197061128dLIZIZ) != null) {
            return savedStateHandlesProvider;
        }
        throw new IllegalStateException("enableSavedStateHandles() wasn't called prior to createSavedStateHandle() call");
    }

    public static final SavedStateHandlesVM getSavedStateHandlesVM(ViewModelStoreOwner viewModelStoreOwner) {
        return (SavedStateHandlesVM) ViewModelProvider.Companion.create$default(ViewModelProvider.Companion, viewModelStoreOwner, new ViewModelProvider.Factory() { // from class: androidx.lifecycle.SavedStateHandleSupport$savedStateHandlesVM$1
            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(Class cls) {
                return C19566311gr.LIZIZ(this, cls);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public final /* synthetic */ ViewModel create(Class cls, AbstractC903280Zc6 abstractC903280Zc6) {
                return C19566311gr.LIZJ(this, cls, abstractC903280Zc6);
            }

            @Override // androidx.lifecycle.ViewModelProvider.Factory
            public <T extends ViewModel> T create(C13IQ<T> c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
                return new SavedStateHandlesVM();
            }
        }, null, 4, null).get("androidx.lifecycle.internal.SavedStateHandlesVM", C13LE.LIZ(SavedStateHandlesVM.class));
    }

    public static final SavedStateHandle createSavedStateHandle(C128Y c128y, ViewModelStoreOwner viewModelStoreOwner, String str, Bundle bundle) {
        SavedStateHandlesProvider savedStateHandlesProvider = getSavedStateHandlesProvider(c128y);
        SavedStateHandlesVM savedStateHandlesVM = getSavedStateHandlesVM(viewModelStoreOwner);
        SavedStateHandle savedStateHandle = savedStateHandlesVM.getHandles().get(str);
        if (savedStateHandle == null) {
            SavedStateHandle savedStateHandleCreateHandle = SavedStateHandle.Companion.createHandle(savedStateHandlesProvider.consumeRestoredStateForKey(str), bundle);
            savedStateHandlesVM.getHandles().put(str, savedStateHandleCreateHandle);
            return savedStateHandleCreateHandle;
        }
        return savedStateHandle;
    }
}
