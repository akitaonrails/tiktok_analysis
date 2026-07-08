package androidx.navigation;

import X.AbstractC903280Zc6;
import X.C01GW;
import X.C128Y;
import X.C197062128e;
import X.C197065128h;
import X.C197066128i;
import X.C197069128l;
import X.C20131713pr;
import X.C452501pT;
import X.C786410Ut5;
import X.C903290Zc7;
import X.InterfaceC197063128f;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.lifecycle.HasDefaultViewModelProviderFactory;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.SavedStateHandle;
import androidx.lifecycle.SavedStateHandleSupport;
import androidx.lifecycle.SavedStateViewModelFactory;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.jvm.internal.AwS573S0100000_29;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes30.dex */
public final class NavBackStackEntry implements LifecycleOwner, ViewModelStoreOwner, HasDefaultViewModelProviderFactory, C128Y {
    public static final /* synthetic */ int LLJILLL = 0;
    public final Context LL;
    public C20131713pr LLILLJJLI;
    public final Bundle LLILLL;
    public Lifecycle.State LLILZ;
    public final InterfaceC197063128f LLILZIL;
    public final String LLILZLL;
    public final Bundle LLIZ;
    public boolean LLJI;
    public final LifecycleRegistry LLIZLLLIL = new LifecycleRegistry(this);
    public final C197065128h LLJ = C197069128l.LIZ(this);
    public final C01GW LLJIJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 10));
    public final C01GW LLJILJIL = C452501pT.LIZIZ(new AwS573S0100000_29(this, 11));
    public Lifecycle.State LLJILJILJ = Lifecycle.State.INITIALIZED;

    static {
        new C197062128e();
    }

    public final void LIZIZ() {
        if (!this.LLJI) {
            this.LLJ.LIZ.LIZIZ();
            this.LLJI = true;
            if (this.LLILZIL != null) {
                SavedStateHandleSupport.enableSavedStateHandles(this);
            }
            this.LLJ.LIZ(this.LLIZ);
        }
        if (this.LLILZ.ordinal() < this.LLJILJILJ.ordinal()) {
            this.LLIZLLLIL.setCurrentState(this.LLILZ);
        } else {
            this.LLIZLLLIL.setCurrentState(this.LLJILJILJ);
        }
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final AbstractC903280Zc6 getDefaultViewModelCreationExtras() {
        C903290Zc7 c903290Zc7 = new C903290Zc7((Object) null);
        Context context = this.LL;
        Context contextN3 = context != null ? C786410Ut5.N3(context) : null;
        if ((contextN3 instanceof Application) && contextN3 != null) {
            c903290Zc7.LIZIZ(ViewModelProvider.AndroidViewModelFactory.APPLICATION_KEY, contextN3);
        }
        c903290Zc7.LIZIZ(SavedStateHandleSupport.SAVED_STATE_REGISTRY_OWNER_KEY, this);
        c903290Zc7.LIZIZ(SavedStateHandleSupport.VIEW_MODEL_STORE_OWNER_KEY, this);
        Bundle bundle = this.LLILLL;
        if (bundle != null) {
            c903290Zc7.LIZIZ(SavedStateHandleSupport.DEFAULT_ARGS_KEY, bundle);
        }
        return c903290Zc7;
    }

    @Override // androidx.lifecycle.HasDefaultViewModelProviderFactory
    public final ViewModelProvider.Factory getDefaultViewModelProviderFactory() {
        return (SavedStateViewModelFactory) this.LLJIJIL.getValue();
    }

    @Override // X.C128Y
    public final C197066128i getSavedStateRegistry() {
        return this.LLJ.LIZIZ;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        if (!this.LLJI) {
            "You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).".toString();
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels until it is added to the NavController's back stack (i.e., the Lifecycle of the NavBackStackEntry reaches the CREATED state).");
        }
        if (this.LLIZLLLIL.getCurrentState() == Lifecycle.State.DESTROYED) {
            "You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.".toString();
            throw new IllegalStateException("You cannot access the NavBackStackEntry's ViewModels after the NavBackStackEntry is destroyed.");
        }
        InterfaceC197063128f interfaceC197063128f = this.LLILZIL;
        if (interfaceC197063128f != null) {
            return interfaceC197063128f.Vs2(this.LLILZLL);
        }
        "You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.".toString();
        throw new IllegalStateException("You must call setViewModelStore() on your NavHostController before accessing the ViewModelStore of a navigation graph.");
    }

    public final int hashCode() {
        Set<String> setKeySet;
        Object obj;
        int iHashCode = (this.LLILZLL.hashCode() * 31) + this.LLILLJJLI.hashCode();
        Bundle bundle = this.LLILLL;
        if (bundle != null && (setKeySet = bundle.keySet()) != null) {
            Iterator<T> it2 = setKeySet.iterator();
            while (it2.hasNext()) {
                int i = iHashCode * 31;
                try {
                    obj = this.LLILLL.get((String) it2.next());
                } catch (Exception e) {
                    TryCatchGuardChecker.doCheck(e);
                } catch (OutOfMemoryError e2) {
                    TryCatchGuardChecker.doCheck(e2);
                }
                int iHashCode2 = obj != null ? obj.hashCode() : 0;
                iHashCode = i + iHashCode2;
            }
        }
        return (((iHashCode * 31) + this.LLIZLLLIL.hashCode()) * 31) + this.LLJ.LIZIZ.hashCode();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLIZLLLIL;
    }

    public static final class SavedStateViewModel extends ViewModel {
        public final SavedStateHandle LL;

        public SavedStateViewModel(SavedStateHandle savedStateHandle) {
            this.LL = savedStateHandle;
        }
    }

    public final void LIZ(Lifecycle.State state) {
        this.LLJILJILJ = state;
        LIZIZ();
    }

    public final boolean equals(Object obj) {
        Set<String> setKeySet;
        Object obj2;
        if (obj == null || !(obj instanceof NavBackStackEntry)) {
            return false;
        }
        NavBackStackEntry navBackStackEntry = (NavBackStackEntry) obj;
        if (!Intrinsics.LJFF(this.LLILZLL, navBackStackEntry.LLILZLL) || !Intrinsics.LJFF(this.LLILLJJLI, navBackStackEntry.LLILLJJLI) || !Intrinsics.LJFF(this.LLIZLLLIL, navBackStackEntry.LLIZLLLIL) || !Intrinsics.LJFF(this.LLJ.LIZIZ, navBackStackEntry.LLJ.LIZIZ)) {
            return false;
        }
        if (!Intrinsics.LJFF(this.LLILLL, navBackStackEntry.LLILLL)) {
            Bundle bundle = this.LLILLL;
            if (bundle == null || (setKeySet = bundle.keySet()) == null) {
                return false;
            }
            if (!(setKeySet instanceof Collection) || !setKeySet.isEmpty()) {
                for (String str : setKeySet) {
                    Object obj3 = null;
                    try {
                        obj2 = this.LLILLL.get(str);
                    } catch (Exception e) {
                        TryCatchGuardChecker.doCheck(e);
                        obj2 = null;
                    } catch (OutOfMemoryError e2) {
                        TryCatchGuardChecker.doCheck(e2);
                        obj2 = null;
                    }
                    Bundle bundle2 = navBackStackEntry.LLILLL;
                    if (bundle2 != null) {
                        try {
                            obj3 = bundle2.get(str);
                        } catch (Exception e3) {
                            TryCatchGuardChecker.doCheck(e3);
                        } catch (OutOfMemoryError e4) {
                            TryCatchGuardChecker.doCheck(e4);
                        }
                    }
                    if (!Intrinsics.LJFF(obj2, obj3)) {
                        return false;
                    }
                }
            }
        }
        return true;
    }

    public NavBackStackEntry(Context context, C20131713pr c20131713pr, Bundle bundle, Lifecycle.State state, InterfaceC197063128f interfaceC197063128f, String str, Bundle bundle2) {
        this.LL = context;
        this.LLILLJJLI = c20131713pr;
        this.LLILLL = bundle;
        this.LLILZ = state;
        this.LLILZIL = interfaceC197063128f;
        this.LLILZLL = str;
        this.LLIZ = bundle2;
    }
}
