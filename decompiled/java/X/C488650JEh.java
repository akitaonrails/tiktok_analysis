package X;

import android.content.Context;
import android.util.Log;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0JEh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C488650JEh extends C1361400lX0 implements ViewModelStoreOwner, LifecycleOwner {
    public WeakReference<InterfaceC214902198i> LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;

    public final Fragment LIZJ() {
        Object obj;
        WeakReference<InterfaceC214902198i> weakReference = this.LLIZ;
        if (weakReference == null || (obj = (InterfaceC214902198i) weakReference.get()) == null) {
            return null;
        }
        return (Fragment) obj;
    }

    public final InterfaceC214902198i LIZLLL() {
        WeakReference<InterfaceC214902198i> weakReference = this.LLIZ;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Lifecycle lifecycle;
        Fragment fragmentLIZJ = LIZJ();
        return (fragmentLIZJ == null || (lifecycle = fragmentLIZJ.getLifecycle()) == null) ? ((C488680JEk) this.LLIZLLLIL.getValue()).getLifecycle() : lifecycle;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        ViewModelStore viewModelStore;
        Fragment fragmentLIZJ = LIZJ();
        if (fragmentLIZJ != null && fragmentLIZJ.getFragmentManager() != null) {
            Fragment fragmentLIZJ2 = LIZJ();
            if (fragmentLIZJ2 != null) {
                viewModelStore = fragmentLIZJ2.getViewModelStore();
            }
            "Required value was null.".toString();
            throw new IllegalArgumentException("Required value was null.");
        }
        viewModelStore = (ViewModelStore) this.LLJ.getValue();
        if (viewModelStore != null) {
            return viewModelStore;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public C488650JEh(C19EG c19eg) {
        super(c19eg, c19eg.getTheme());
        this.LLIZLLLIL = C452501pT.LIZIZ(new C488670JEj());
        this.LLJ = C452501pT.LIZIZ(new C488660JEi());
    }

    @Override // X.C1361400lX0, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        if (NxRewordManager.LJIILIIL) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("attachBaseContextWrapper: ");
            sbLIZ.append(Log.getStackTraceString(new Throwable(context.toString())));
            C2188811AlT.LIZIZ(sbLIZ);
            context = new C817700W5w(context, false);
        }
        super.attachBaseContext(context);
    }

    public C488650JEh(C19EG c19eg, int i) {
        super(c19eg, i);
        this.LLIZLLLIL = C452501pT.LIZIZ(new C488670JEj());
        this.LLJ = C452501pT.LIZIZ(new C488660JEi());
    }
}
