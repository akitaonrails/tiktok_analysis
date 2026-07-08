package androidx.lifecycle;

import X.AbstractC903280Zc6;
import X.C128Y;
import X.C13IQ;
import X.C19566311gr;
import X.C197066128i;
import X.InterfaceC1294060jmO;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;

/* JADX INFO: loaded from: classes30.dex */
@InterfaceC1294060jmO
public abstract class AbstractSavedStateViewModelFactory extends ViewModelProvider.OnRequeryFactory implements ViewModelProvider.Factory {
    public Bundle defaultArgs;
    public Lifecycle lifecycle;
    public C197066128i savedStateRegistry;

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public final /* synthetic */ ViewModel create(C13IQ c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
        return C19566311gr.LIZ(this, c13iq, abstractC903280Zc6);
    }

    public abstract <T extends ViewModel> T create(String str, Class<T> cls, SavedStateHandle savedStateHandle);

    public AbstractSavedStateViewModelFactory() {
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            if (this.lifecycle != null) {
                return (T) create(canonicalName, cls);
            }
            throw new UnsupportedOperationException("AbstractSavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    public void onRequery(ViewModel viewModel) {
        C197066128i c197066128i = this.savedStateRegistry;
        if (c197066128i != null) {
            LegacySavedStateHandleController.attachHandleIfNeeded(viewModel, c197066128i, this.lifecycle);
        }
    }

    public AbstractSavedStateViewModelFactory(C128Y c128y, Bundle bundle) {
        this.savedStateRegistry = c128y.getSavedStateRegistry();
        this.lifecycle = c128y.getLifecycle();
        this.defaultArgs = bundle;
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> cls, AbstractC903280Zc6 abstractC903280Zc6) {
        String str = (String) abstractC903280Zc6.LIZ(ViewModelProvider.NewInstanceFactory.VIEW_MODEL_KEY);
        if (str != null) {
            if (this.savedStateRegistry != null) {
                return (T) create(str, cls);
            }
            return (T) create(str, cls, SavedStateHandleSupport.createSavedStateHandle(abstractC903280Zc6));
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    private final <T extends ViewModel> T create(String str, Class<T> cls) {
        SavedStateHandleController savedStateHandleControllerCreate = LegacySavedStateHandleController.create(this.savedStateRegistry, this.lifecycle, str, this.defaultArgs);
        T t = (T) create(str, cls, savedStateHandleControllerCreate.getHandle());
        t.addCloseable("androidx.lifecycle.savedstate.vm.tag", savedStateHandleControllerCreate);
        return t;
    }
}
