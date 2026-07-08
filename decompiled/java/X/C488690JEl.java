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
import kotlin.jvm.internal.AFwS193S0000000_7;

/* JADX INFO: renamed from: X.0JEl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C488690JEl extends C1361400lX0 implements ViewModelStoreOwner, LifecycleOwner {
    public WeakReference<Fragment> LLIZ;
    public final C01GW LLIZLLLIL;
    public final C01GW LLJ;

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Fragment fragment;
        Lifecycle lifecycle;
        WeakReference<Fragment> weakReference = this.LLIZ;
        return (weakReference == null || (fragment = weakReference.get()) == null || (lifecycle = fragment.getLifecycle()) == null) ? ((C488700JEm) this.LLIZLLLIL.getValue()).getLifecycle() : lifecycle;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        ViewModelStore viewModelStore;
        Fragment fragment;
        Fragment fragment2;
        WeakReference<Fragment> weakReference = this.LLIZ;
        if (weakReference != null && (fragment = weakReference.get()) != null && fragment.getFragmentManager() != null) {
            WeakReference<Fragment> weakReference2 = this.LLIZ;
            if (weakReference2 != null && (fragment2 = weakReference2.get()) != null) {
                viewModelStore = fragment2.getViewModelStore();
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

    public C488690JEl(C19EG c19eg) {
        super(c19eg, c19eg.getTheme());
        this.LLIZLLLIL = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(321));
        this.LLJ = C452501pT.LIZIZ(AFwS193S0000000_7.get$arr$(322));
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
}
