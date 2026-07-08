package X;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import com.bytedance.bpea.transmit.delegate.BPEAHandler;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: X.198X, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C198X extends C198W<SAFFragmentRootScene> implements ViewModelStoreOwner, InterfaceC1671500tbA {
    public final /* synthetic */ SAFFragmentRootScene LLILZIL;

    @Override // X.AnonymousClass1996, X.C19F6
    public final boolean LIZJ() {
        Window window;
        Activity activity = this.LL;
        return (activity == null || (window = activity.getWindow()) == null || window.peekDecorView() == null) ? false : true;
    }

    @Override // X.AnonymousClass1996
    public final LayoutInflater LJIIIIZZ() {
        return ((Boolean) this.LLILZIL.LLJI.getValue()).booleanValue() ? this.LLILZIL.LLJJJJJIL() : LJIILIIL().getLayoutInflater().cloneInContext(LJIILIIL());
    }

    public final C19EG LJIILIIL() {
        return (C19EG) this.LLILZIL.requireActivity();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LLILZIL.LLJJJ;
    }

    @Override // X.InterfaceC1671500tbA
    public final OnBackPressedDispatcher getOnBackPressedDispatcher() {
        return this.LLILZIL.LLJJIJI;
    }

    @Override // androidx.lifecycle.ViewModelStoreOwner
    public final ViewModelStore getViewModelStore() {
        return this.LLILZIL.getViewModelStore();
    }

    @Override // X.AnonymousClass1996
    public final /* bridge */ /* synthetic */ Object LJII() {
        return this.LLILZIL;
    }

    @Override // X.AnonymousClass1996, X.C19F6
    public final View LIZIZ(int i) {
        View viewFindViewById;
        if (((Boolean) this.LLILZIL.LLJILLL.getValue()).booleanValue()) {
            View view = this.LLILZIL.mView;
            if (view != null) {
                return view.findViewById(i);
            }
            return null;
        }
        View view2 = this.LLILZIL.mView;
        if (view2 != null && (viewFindViewById = view2.findViewById(i)) != null) {
            return viewFindViewById;
        }
        Activity activity = this.LL;
        if (activity != null) {
            return activity.findViewById(i);
        }
        return null;
    }

    @Override // X.AnonymousClass1996
    public final boolean LJIIJ(String str) {
        return C0VE9.LJIIJ(LJIILIIL(), str);
    }

    @Override // X.AnonymousClass1996
    public final void LJIIIZ(final Fragment fragment, final String[] strArr, final int i) {
        final SAFFragmentRootScene sAFFragmentRootScene = this.LLILZIL;
        Looper looperMyLooper = Looper.myLooper();
        Looper looper = C20630515o7.LIZ;
        if (Intrinsics.LJFF(looperMyLooper, looper)) {
            C12WM.LIZJ(LJIILIIL(), this, strArr, i, new C198Z(sAFFragmentRootScene, fragment, i, strArr));
        } else {
            C786410Ut5.LJJZZIII(new BPEAHandler(looper), new Runnable() { // from class: X.198Y
                @Override // java.lang.Runnable
                public final void run() {
                    boolean zLIZ;
                    C1C7U.LIZ("SAFFragmentRootScene$SceneHostCallBacks@a895.onRequestPermissionsFromFragment$$inlined$runInMainThread$1");
                    try {
                        C19EG c19egLJIILIIL = this.LL.LJIILIIL();
                        C198X c198x = this.LL;
                        String[] strArr2 = strArr;
                        int i2 = i;
                        C12WM.LIZJ(c19egLJIILIIL, c198x, strArr2, i2, new C198Z(sAFFragmentRootScene, fragment, i2, strArr2));
                    } finally {
                        if (!zLIZ) {
                        }
                    }
                    C1C7U.LIZIZ("SAFFragmentRootScene$SceneHostCallBacks@a895.onRequestPermissionsFromFragment$$inlined$runInMainThread$1");
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C198X(SAFFragmentRootScene sAFFragmentRootScene, Activity activity, Context context, Handler handler) {
        super(activity, context, handler);
        this.LLILZIL = sAFFragmentRootScene;
    }

    @Override // X.AnonymousClass1996
    public final void LJIIJJI(final Fragment fragment, Intent intent, final int i, Bundle bundle) {
        C19EG c19egLJIILIIL = LJIILIIL();
        final SAFFragmentRootScene sAFFragmentRootScene = this.LLILZIL;
        C12WM.LIZLLL(c19egLJIILIIL, this, intent, i, bundle, new C12WN() { // from class: X.198a
            @Override // X.C12WN
            public final void onResult(int i2, Intent intent2) {
                sAFFragmentRootScene.LLLIILIL().LIZJ();
                fragment.onActivityResult(i, i2, intent2);
            }
        });
    }
}
