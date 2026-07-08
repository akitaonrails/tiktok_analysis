package X;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.util.Log;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.scene.Scene;
import com.ss.android.ugc.aweme.nxreword.manager.NxRewordManager;
import java.lang.ref.WeakReference;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.0JEc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C488600JEc extends MutableContextWrapper implements InterfaceC488640JEg, ViewModelStoreOwner, LifecycleOwner {
    public final WeakReference<C19EG> LL;
    public final C19EG LLILLJJLI;
    public final C01GW LLILLL;
    public final C01GW LLILZ;
    public WeakReference<C488650JEh> LLILZIL;

    @Override // X.InterfaceC488640JEg
    public final C488650JEh LIZ() {
        WeakReference<C488650JEh> weakReference = this.LLILZIL;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Lifecycle lifecycle;
        C488650JEh c488650JEh;
        Lifecycle lifecycle2;
        WeakReference<C488650JEh> weakReference = this.LLILZIL;
        if (weakReference != null && (c488650JEh = weakReference.get()) != null && (lifecycle2 = c488650JEh.getLifecycle()) != null) {
            return lifecycle2;
        }
        if (((Boolean) C258350AAn.LIZ.getValue()).booleanValue()) {
            C19EG c19eg = this.LL.get();
            return (c19eg == null || (lifecycle = c19eg.getLifecycle()) == null) ? ((C488630JEf) this.LLILZ.getValue()).getLifecycle() : lifecycle;
        }
        C19EG c19eg2 = this.LLILLJJLI;
        if (c19eg2 != null) {
            return c19eg2.getLifecycle();
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        ViewModelStore viewModelStore;
        C488650JEh c488650JEh;
        WeakReference<C488650JEh> weakReference = this.LLILZIL;
        if (weakReference != null && (c488650JEh = weakReference.get()) != null) {
            return c488650JEh.getViewModelStore();
        }
        if (((Boolean) C258350AAn.LIZ.getValue()).booleanValue()) {
            C19EG c19eg = this.LL.get();
            return (c19eg == null || (viewModelStore = c19eg.getViewModelStore()) == null) ? (ViewModelStore) this.LLILLL.getValue() : viewModelStore;
        }
        C19EG c19eg2 = this.LLILLJJLI;
        if (c19eg2 != null) {
            return c19eg2.getViewModelStore();
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public C488600JEc(C19EG c19eg) {
        super(c19eg);
        this.LL = new WeakReference<>(c19eg);
        if (!((Boolean) C258350AAn.LIZ.getValue()).booleanValue()) {
            this.LLILLJJLI = c19eg;
        }
        this.LLILLL = C452501pT.LIZIZ(new C488610JEd());
        this.LLILZ = C452501pT.LIZIZ(new C488620JEe());
    }

    @Override // android.content.ContextWrapper
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

    @Override // android.content.ContextWrapper, android.content.Context
    public final Object getSystemService(String str) {
        C488650JEh c488650JEh;
        InterfaceC214902198i interfaceC214902198iLIZLLL;
        if (Intrinsics.LJFF("layout_inflater", str)) {
            return C786410Ut5.ne(getBaseContext()).cloneInContext(this);
        }
        if (Intrinsics.LJFF(Scene.SCENE_SERVICE, str)) {
            WeakReference<C488650JEh> weakReference = this.LLILZIL;
            if (weakReference != null && (c488650JEh = weakReference.get()) != null && (interfaceC214902198iLIZLLL = c488650JEh.LIZLLL()) != null) {
                return interfaceC214902198iLIZLLL.ib();
            }
            return null;
        }
        return C786410Ut5.H2(getBaseContext(), str);
    }
}
