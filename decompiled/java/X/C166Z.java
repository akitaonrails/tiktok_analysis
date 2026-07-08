package X;

import X.C166Z;
import X.InterfaceC340040DUs;
import android.os.Looper;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.166Z, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C166Z<F extends Fragment, T extends InterfaceC340040DUs> extends AbstractC207198166a<F, T> {
    public final boolean LLILLL;
    public boolean LLILZ;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference incomplete: some casts might be missing */
    public final InterfaceC340040DUs LIZIZ(Fragment fragment) {
        boolean z;
        String str;
        boolean z2 = false;
        if (Looper.getMainLooper() == Looper.myLooper()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            InterfaceC340040DUs interfaceC340040DUs = this.LLILLJJLI;
            InterfaceC340040DUs interfaceC340040DUs2 = interfaceC340040DUs;
            if (interfaceC340040DUs == null) {
                if (this.LLILLL || (fragment.isAdded() && !fragment.isDetached() && ((fragment instanceof DialogFragment) || fragment.getView() != null))) {
                    z2 = true;
                }
                if (!z2) {
                    if (fragment.isAdded()) {
                        if (!fragment.isDetached()) {
                            if (!(fragment instanceof DialogFragment) && fragment.getView() == null) {
                                str = "Fragment's view can't be accessed. Fragment's view is null. Maybe you try to access view before onViewCreated() or after onDestroyView(). Add check `if (view != null)` before call ViewBinding";
                            } else {
                                str = "Host view isn't ready. LifecycleAwareViewBindingProperty.isViewInitialized return false";
                            }
                        } else {
                            str = "Fragment's view can't be accessed. Fragment is detached";
                        }
                    } else {
                        str = "Fragment's view can't be accessed. Fragment isn't added";
                    }
                    str.toString();
                    throw new IllegalStateException(str);
                }
                try {
                    Lifecycle lifecycle = fragment.getViewLifecycleOwner().getLifecycle();
                    if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                        this.LLILLJJLI = null;
                        interfaceC340040DUs2 = (VB) this.LL.invoke((R) fragment);
                    } else {
                        VB vb = (VB) this.LL.invoke((R) fragment);
                        lifecycle.addObserver(new LifecycleEventObserver() { // from class: com.bytedance.viewbinding.property.LifecycleAwareViewBindingProperty$getValue$3
                            @Override // androidx.lifecycle.LifecycleEventObserver
                            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                                if (event == Lifecycle.Event.ON_DESTROY) {
                                    this.LIZ();
                                }
                            }
                        });
                        this.LLILLJJLI = vb;
                        interfaceC340040DUs2 = vb;
                    }
                } catch (IllegalStateException e) {
                    TryCatchGuardChecker.doCheck(e);
                    "Fragment doesn't have a view associated with it or the view has been destroyed".toString();
                    throw new IllegalStateException("Fragment doesn't have a view associated with it or the view has been destroyed");
                }
            }
            if (!this.LLILZ) {
                fragment.getLifecycle().addObserver(new LifecycleEventObserver(this) { // from class: com.bytedance.viewbinding.property.FragmentViewBindingProperty$registerFragmentLifecycleCallbacksIfNeeded$1
                    public final /* synthetic */ C166Z<Fragment, InterfaceC340040DUs> LL;

                    {
                        this.LL = this;
                    }

                    @Override // androidx.lifecycle.LifecycleEventObserver
                    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                        if (event == Lifecycle.Event.ON_DESTROY) {
                            this.LL.LIZ();
                        }
                    }
                });
                this.LLILZ = true;
            }
            return interfaceC340040DUs2;
        }
        "Get ViewBinding method must be called on the main thread".toString();
        throw new IllegalStateException("Get ViewBinding method must be called on the main thread");
    }

    public C166Z(Function1 function1, boolean z) {
        super(function1);
        this.LLILLL = z;
    }

    @Override // X.InterfaceC1731706qJ
    public final /* bridge */ /* synthetic */ Object getValue(Object obj, InterfaceC2217461Bqa interfaceC2217461Bqa) {
        return LIZIZ((Fragment) obj);
    }
}
