package androidx.lifecycle;

import X.AbstractC903280Zc6;
import X.C09R7;
import X.C128Y;
import X.C13IQ;
import X.C197066128i;
import android.app.Application;
import android.os.Bundle;
import androidx.lifecycle.ViewModelProvider;
import java.lang.reflect.Constructor;

/* JADX INFO: loaded from: classes30.dex */
public final class SavedStateViewModelFactory extends ViewModelProvider.OnRequeryFactory implements ViewModelProvider.Factory {
    public Application application;
    public Bundle defaultArgs;
    public final ViewModelProvider.Factory factory;
    public Lifecycle lifecycle;
    public C197066128i savedStateRegistry;

    public SavedStateViewModelFactory() {
        this.factory = new ViewModelProvider.AndroidViewModelFactory();
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> cls) {
        String canonicalName = cls.getCanonicalName();
        if (canonicalName != null) {
            return (T) create(canonicalName, cls);
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    @Override // androidx.lifecycle.ViewModelProvider.OnRequeryFactory
    public void onRequery(ViewModel viewModel) {
        Lifecycle lifecycle = this.lifecycle;
        if (lifecycle != null) {
            LegacySavedStateHandleController.attachHandleIfNeeded(viewModel, this.savedStateRegistry, lifecycle);
        }
    }

    public SavedStateViewModelFactory(Application application, C128Y c128y) {
        this(application, c128y, null);
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(Class<T> cls, AbstractC903280Zc6 abstractC903280Zc6) {
        Constructor constructorFindMatchingConstructor;
        String str = (String) abstractC903280Zc6.LIZ(ViewModelProvider.VIEW_MODEL_KEY);
        if (str != null) {
            if (abstractC903280Zc6.LIZ(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY) != null && abstractC903280Zc6.LIZ(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY) != null) {
                Object objLIZ = abstractC903280Zc6.LIZ(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY);
                boolean zIsAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
                if (zIsAssignableFrom && objLIZ != null) {
                    constructorFindMatchingConstructor = SavedStateViewModelFactory_androidKt.findMatchingConstructor(cls, SavedStateViewModelFactory_androidKt.ANDROID_VIEWMODEL_SIGNATURE);
                } else {
                    constructorFindMatchingConstructor = SavedStateViewModelFactory_androidKt.findMatchingConstructor(cls, SavedStateViewModelFactory_androidKt.VIEWMODEL_SIGNATURE);
                }
                if (constructorFindMatchingConstructor == null) {
                    return (T) this.factory.create(cls, abstractC903280Zc6);
                }
                if (zIsAssignableFrom && objLIZ != null) {
                    return (T) SavedStateViewModelFactory_androidKt.newInstance(cls, constructorFindMatchingConstructor, objLIZ, SavedStateHandleSupport.createSavedStateHandle(abstractC903280Zc6));
                }
                return (T) SavedStateViewModelFactory_androidKt.newInstance(cls, constructorFindMatchingConstructor, SavedStateHandleSupport.createSavedStateHandle(abstractC903280Zc6));
            }
            if (this.lifecycle != null) {
                return (T) create(str, cls);
            }
            throw new IllegalStateException("SAVED_STATE_REGISTRY_OWNER_KEY andVIEW_MODEL_STORE_OWNER_KEY must be provided in the creation extras tosuccessfully create a ViewModel.");
        }
        throw new IllegalStateException("VIEW_MODEL_KEY must always be provided by ViewModelProvider");
    }

    public final <T extends ViewModel> T create(String str, Class<T> cls) {
        Constructor constructorFindMatchingConstructor;
        T t;
        Application application;
        Lifecycle lifecycle = this.lifecycle;
        if (lifecycle != null) {
            boolean zIsAssignableFrom = AndroidViewModel.class.isAssignableFrom(cls);
            if (zIsAssignableFrom && this.application != null) {
                constructorFindMatchingConstructor = SavedStateViewModelFactory_androidKt.findMatchingConstructor(cls, SavedStateViewModelFactory_androidKt.ANDROID_VIEWMODEL_SIGNATURE);
            } else {
                constructorFindMatchingConstructor = SavedStateViewModelFactory_androidKt.findMatchingConstructor(cls, SavedStateViewModelFactory_androidKt.VIEWMODEL_SIGNATURE);
            }
            if (constructorFindMatchingConstructor == null) {
                if (this.application != null) {
                    return (T) this.factory.create(cls);
                }
                return (T) ViewModelProvider.NewInstanceFactory.Companion.getInstance().create(cls);
            }
            SavedStateHandleController savedStateHandleControllerCreate = LegacySavedStateHandleController.create(this.savedStateRegistry, lifecycle, str, this.defaultArgs);
            if (zIsAssignableFrom && (application = this.application) != null) {
                t = (T) SavedStateViewModelFactory_androidKt.newInstance(cls, constructorFindMatchingConstructor, application, savedStateHandleControllerCreate.getHandle());
            } else {
                t = (T) SavedStateViewModelFactory_androidKt.newInstance(cls, constructorFindMatchingConstructor, savedStateHandleControllerCreate.getHandle());
            }
            t.addCloseable("androidx.lifecycle.savedstate.vm.tag", savedStateHandleControllerCreate);
            return t;
        }
        throw new UnsupportedOperationException("SavedStateViewModelFactory constructed with empty constructor supports only calls to create(modelClass: Class<T>, extras: CreationExtras).");
    }

    @Override // androidx.lifecycle.ViewModelProvider.Factory
    public <T extends ViewModel> T create(C13IQ<T> c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
        return (T) create(C09R7.LIZ(c13iq), abstractC903280Zc6);
    }

    public SavedStateViewModelFactory(Application application, C128Y c128y, Bundle bundle) {
        ViewModelProvider.AndroidViewModelFactory androidViewModelFactory;
        this.savedStateRegistry = c128y.getSavedStateRegistry();
        this.lifecycle = c128y.getLifecycle();
        this.defaultArgs = bundle;
        this.application = application;
        if (application != null) {
            androidViewModelFactory = ViewModelProvider.AndroidViewModelFactory.Companion.getInstance(application);
        } else {
            androidViewModelFactory = new ViewModelProvider.AndroidViewModelFactory();
        }
        this.factory = androidViewModelFactory;
    }
}
