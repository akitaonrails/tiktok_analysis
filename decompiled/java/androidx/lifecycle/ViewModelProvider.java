package androidx.lifecycle;

import X.AbstractC903280Zc6;
import X.C09R7;
import X.C128W;
import X.C13IQ;
import X.C13LE;
import X.C13LQ;
import X.C19566011go;
import X.C19566111gp;
import X.C1968307nN;
import X.C2188811AlT;
import X.C728850SiR;
import X.C903300Zc8;
import X.C906980Zi4;
import X.InterfaceC1569560qwk;
import X.InterfaceC902960Zba;
import android.app.Application;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlin.text.u;

/* JADX INFO: loaded from: classes30.dex */
public class ViewModelProvider {
    public static final Companion Companion = new Companion();
    public static final InterfaceC902960Zba<String> VIEW_MODEL_KEY = new InterfaceC902960Zba<String>() { // from class: androidx.lifecycle.ViewModelProvider$special$$inlined$Key$1
    };
    public final C128W impl;
    public Object store;

    public static class OnRequeryFactory {
        public void onRequery(ViewModel viewModel) {
        }
    }

    public static final ViewModelProvider create(ViewModelStore viewModelStore, Factory factory, AbstractC903280Zc6 abstractC903280Zc6) {
        return Companion.create(viewModelStore, factory, abstractC903280Zc6);
    }

    public static final ViewModelProvider create(ViewModelStoreOwner viewModelStoreOwner, Factory factory, AbstractC903280Zc6 abstractC903280Zc6) {
        return Companion.create(viewModelStoreOwner, factory, abstractC903280Zc6);
    }

    public ViewModel get(String str, Class cls) {
        return androidx_lifecycle_ViewModelProvider_com_ss_android_ugc_aweme_main_lancet_KtSafLancet_hookGet(this, str, cls);
    }

    public static class AndroidViewModelFactory extends NewInstanceFactory {
        public static AndroidViewModelFactory _instance;
        public final Application application;
        public static final Companion Companion = new Companion();
        public static final InterfaceC902960Zba<Application> APPLICATION_KEY = new InterfaceC902960Zba<Application>() { // from class: androidx.lifecycle.ViewModelProvider$AndroidViewModelFactory$special$$inlined$Key$1
        };

        public AndroidViewModelFactory() {
            this(null, 0);
        }

        public static final AndroidViewModelFactory getInstance(Application application) {
            return Companion.getInstance(application);
        }

        /* JADX INFO: loaded from: classes8.dex */
        public static final class Companion {
            public final AndroidViewModelFactory getInstance(Application application) {
                if (AndroidViewModelFactory._instance == null) {
                    AndroidViewModelFactory._instance = new AndroidViewModelFactory(application);
                }
                return AndroidViewModelFactory._instance;
            }
        }

        public AndroidViewModelFactory(Application application) {
            this(application, 0);
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> cls) {
            Application application = this.application;
            if (application != null) {
                return (T) create(cls, application);
            }
            throw new UnsupportedOperationException("AndroidViewModelFactory constructed with empty constructor works only with create(modelClass: Class<T>, extras: CreationExtras).");
        }

        public AndroidViewModelFactory(Application application, int i) {
            this.application = application;
        }

        private final <T extends ViewModel> T create(Class<T> cls, Application application) {
            if (AndroidViewModel.class.isAssignableFrom(cls)) {
                try {
                    return cls.getConstructor(Application.class).newInstance(application);
                } catch (IllegalAccessException e) {
                    TryCatchGuardChecker.doCheck(e);
                    StringBuilder sbLIZ = C2188811AlT.LIZ();
                    sbLIZ.append("Cannot create an instance of ");
                    sbLIZ.append(cls);
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ), e);
                } catch (InstantiationException e2) {
                    TryCatchGuardChecker.doCheck(e2);
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("Cannot create an instance of ");
                    sbLIZ2.append(cls);
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ2), e2);
                } catch (NoSuchMethodException e3) {
                    TryCatchGuardChecker.doCheck(e3);
                    StringBuilder sbLIZ3 = C2188811AlT.LIZ();
                    sbLIZ3.append("Cannot create an instance of ");
                    sbLIZ3.append(cls);
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ3), e3);
                } catch (InvocationTargetException e4) {
                    TryCatchGuardChecker.doCheck(e4);
                    StringBuilder sbLIZ4 = C2188811AlT.LIZ();
                    sbLIZ4.append("Cannot create an instance of ");
                    sbLIZ4.append(cls);
                    throw new RuntimeException(C2188811AlT.LIZIZ(sbLIZ4), e4);
                }
            }
            return (T) super.create(cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.NewInstanceFactory, androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> cls, AbstractC903280Zc6 abstractC903280Zc6) {
            if (this.application != null) {
                return (T) create(cls);
            }
            Application application = (Application) abstractC903280Zc6.LIZ(APPLICATION_KEY);
            if (application != null) {
                return (T) create(cls, application);
            }
            if (!AndroidViewModel.class.isAssignableFrom(cls)) {
                return (T) super.create(cls);
            }
            throw new IllegalArgumentException("CreationExtras must have an application by `APPLICATION_KEY`");
        }
    }

    public interface Factory {
        public static final Companion Companion = Companion.$$INSTANCE;

        <T extends ViewModel> T create(C13IQ<T> c13iq, AbstractC903280Zc6 abstractC903280Zc6);

        <T extends ViewModel> T create(Class<T> cls);

        <T extends ViewModel> T create(Class<T> cls, AbstractC903280Zc6 abstractC903280Zc6);

        public static final class Companion {
            public static final /* synthetic */ Companion $$INSTANCE = new Companion();

            public final Factory from(C19566111gp<?>... c19566111gpArr) {
                C19566111gp[] c19566111gpArr2 = (C19566111gp[]) Arrays.copyOf(c19566111gpArr, c19566111gpArr.length);
                return new C19566011go((C19566111gp[]) Arrays.copyOf(c19566111gpArr2, c19566111gpArr2.length));
            }
        }
    }

    public static class NewInstanceFactory implements Factory {
        public static final Companion Companion = new Companion();
        public static final InterfaceC902960Zba<String> VIEW_MODEL_KEY = ViewModelProvider.VIEW_MODEL_KEY;
        public static NewInstanceFactory _instance;

        public static final class Companion {
            public static /* synthetic */ void getInstance$annotations() {
            }

            public final NewInstanceFactory getInstance() {
                if (NewInstanceFactory._instance == null) {
                    NewInstanceFactory._instance = new NewInstanceFactory();
                }
                return NewInstanceFactory._instance;
            }
        }

        public static final NewInstanceFactory getInstance() {
            return Companion.getInstance();
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> cls) {
            return (T) C1968307nN.LIZ(cls);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(C13IQ<T> c13iq, AbstractC903280Zc6 abstractC903280Zc6) {
            return (T) create(C09R7.LIZ(c13iq), abstractC903280Zc6);
        }

        @Override // androidx.lifecycle.ViewModelProvider.Factory
        public <T extends ViewModel> T create(Class<T> cls, AbstractC903280Zc6 abstractC903280Zc6) {
            return (T) create(cls);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ViewModelProvider(ViewModelStoreOwner viewModelStoreOwner) {
        Factory defaultViewModelProviderFactory;
        AbstractC903280Zc6 defaultViewModelCreationExtras;
        ViewModelStore viewModelStore = viewModelStoreOwner.getViewModelStore();
        if (viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory) {
            defaultViewModelProviderFactory = ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelProviderFactory();
            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelProviderFactory = C906980Zi4.LIZ;
            defaultViewModelCreationExtras = C903300Zc8.LIZJ;
        }
        this(viewModelStore, defaultViewModelProviderFactory, defaultViewModelCreationExtras);
    }

    public final <T extends ViewModel> T get(C13IQ<T> c13iq) {
        String strLIZLLL;
        C128W c128w = this.impl;
        if (c13iq != null && (strLIZLLL = c13iq.LIZLLL()) != null) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("androidx.lifecycle.ViewModelProvider.DefaultKey:");
            sbLIZ.append(strLIZLLL);
            return (T) c128w.LIZ(C2188811AlT.LIZIZ(sbLIZ), c13iq);
        }
        "Local and anonymous classes can not be ViewModels".toString();
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public ViewModelProvider(C128W c128w) {
        this.impl = c128w;
    }

    public <T extends ViewModel> T get(Class<T> cls) {
        return (T) get(C13LE.LIZ(cls));
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public ViewModelProvider(ViewModelStoreOwner viewModelStoreOwner, Factory factory) {
        AbstractC903280Zc6 defaultViewModelCreationExtras;
        ViewModelStore viewModelStore = viewModelStoreOwner.getViewModelStore();
        if (viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory) {
            defaultViewModelCreationExtras = ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras();
        } else {
            defaultViewModelCreationExtras = C903300Zc8.LIZJ;
        }
        this(viewModelStore, factory, defaultViewModelCreationExtras);
    }

    public <T extends ViewModel> T androidx_lifecycle_ViewModelProvider__get$___twin___(String str, Class<T> cls) {
        return (T) this.impl.LIZ(str, C13LE.LIZ(cls));
    }

    public final <T extends ViewModel> T get(String str, C13IQ<T> c13iq) {
        return (T) this.impl.LIZ(str, c13iq);
    }

    public ViewModelProvider(ViewModelStore viewModelStore, Factory factory) {
        this(viewModelStore, factory, C903300Zc8.LIZJ);
    }

    /* JADX INFO: loaded from: classes15.dex */
    public static final class Companion {
        public final ViewModelProvider create(ViewModelStoreOwner viewModelStoreOwner, Factory factory, AbstractC903280Zc6 abstractC903280Zc6) {
            return new ViewModelProvider(viewModelStoreOwner.getViewModelStore(), factory, abstractC903280Zc6);
        }

        public final ViewModelProvider create(ViewModelStore viewModelStore, Factory factory, AbstractC903280Zc6 abstractC903280Zc6) {
            return new ViewModelProvider(viewModelStore, factory, abstractC903280Zc6);
        }

        public static ViewModelProvider create$default(Companion companion, ViewModelStoreOwner viewModelStoreOwner, Factory factory, AbstractC903280Zc6 abstractC903280Zc6, int i, Object obj) {
            if ((i & 2) != 0) {
                if (viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory) {
                    factory = ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelProviderFactory();
                } else {
                    factory = C906980Zi4.LIZ;
                }
            }
            if ((i & 4) != 0) {
                if (viewModelStoreOwner instanceof HasDefaultViewModelProviderFactory) {
                    abstractC903280Zc6 = ((HasDefaultViewModelProviderFactory) viewModelStoreOwner).getDefaultViewModelCreationExtras();
                } else {
                    abstractC903280Zc6 = C903300Zc8.LIZJ;
                }
            }
            return companion.create(viewModelStoreOwner, factory, abstractC903280Zc6);
        }
    }

    public ViewModelProvider(ViewModelStore viewModelStore, Factory factory, AbstractC903280Zc6 abstractC903280Zc6) {
        this(new C128W(viewModelStore, factory, abstractC903280Zc6));
    }

    public static ViewModel androidx_lifecycle_ViewModelProvider_com_ss_android_ugc_aweme_main_lancet_KtSafLancet_hookGet(ViewModelProvider viewModelProvider, String str, Class cls) {
        Object obj = viewModelProvider.store;
        if (obj instanceof InterfaceC1569560qwk) {
            String name = cls.getName();
            if (!u.LJJIIJZLJL(name, "androidx.", false) && C13LQ.LJJIJIIJI(cls, C728850SiR.LIZ) < 0) {
                ((InterfaceC1569560qwk) obj).LIZ(name);
            }
        }
        return viewModelProvider.androidx_lifecycle_ViewModelProvider__get$___twin___(str, cls);
    }
}
