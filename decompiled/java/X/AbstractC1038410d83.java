package X;

import android.app.Activity;
import android.content.ComponentCallbacks;
import android.content.ComponentCallbacks2;
import android.view.View;
import androidx.fragment.app.Fragment;

/* JADX INFO: renamed from: X.0d83, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public abstract class AbstractC1038410d83 implements InterfaceC1399350mWD, InterfaceC1008670cM5 {
    public final Activity LL;
    public final Fragment LLILLJJLI;

    @Override // X.InterfaceC1399350mWD
    public final /* synthetic */ boolean Fi() {
        return false;
    }

    @Override // X.InterfaceC1008670cM5
    public final void enable(boolean z) {
        InterfaceC655270Pn3 interfaceC655270Pn3;
        InterfaceC214897198d interfaceC214897198d;
        InterfaceC655270Pn3 interfaceC655270Pn32;
        InterfaceC655270Pn3 interfaceC655270Pn33;
        InterfaceC214897198d interfaceC214897198d2;
        InterfaceC655270Pn3 interfaceC655270Pn34;
        InterfaceC214902198i dynamicParentRootFragment = null;
        if (z) {
            ComponentCallbacks componentCallbacksLIZ = C487580JAe.LIZ(this.LL, this.LLILLJJLI);
            if (componentCallbacksLIZ == null) {
                componentCallbacksLIZ = this.LL;
            }
            if ((componentCallbacksLIZ instanceof InterfaceC655270Pn3) && (interfaceC655270Pn34 = (InterfaceC655270Pn3) componentCallbacksLIZ) != null) {
                interfaceC655270Pn34.registerActivityOnKeyDownListener(this);
            }
            ComponentCallbacks2 componentCallbacks2 = this.LL;
            if ((componentCallbacks2 instanceof InterfaceC214897198d) && (interfaceC214897198d2 = (InterfaceC214897198d) componentCallbacks2) != null) {
                dynamicParentRootFragment = interfaceC214897198d2.getDynamicParentRootFragment();
            }
            if ((dynamicParentRootFragment instanceof InterfaceC655270Pn3) && (interfaceC655270Pn33 = (InterfaceC655270Pn3) dynamicParentRootFragment) != null) {
                interfaceC655270Pn33.registerActivityOnKeyDownListener(this);
                return;
            }
            return;
        }
        ComponentCallbacks componentCallbacksLIZ2 = C487580JAe.LIZ(this.LL, this.LLILLJJLI);
        if (componentCallbacksLIZ2 == null) {
            componentCallbacksLIZ2 = this.LL;
        }
        if ((componentCallbacksLIZ2 instanceof InterfaceC655270Pn3) && (interfaceC655270Pn32 = (InterfaceC655270Pn3) componentCallbacksLIZ2) != null) {
            interfaceC655270Pn32.unRegisterActivityOnKeyDownListener(this);
        }
        ComponentCallbacks2 componentCallbacks22 = this.LL;
        if ((componentCallbacks22 instanceof InterfaceC214897198d) && (interfaceC214897198d = (InterfaceC214897198d) componentCallbacks22) != null) {
            dynamicParentRootFragment = interfaceC214897198d.getDynamicParentRootFragment();
        }
        if (!(dynamicParentRootFragment instanceof InterfaceC655270Pn3) || (interfaceC655270Pn3 = (InterfaceC655270Pn3) dynamicParentRootFragment) == null) {
            return;
        }
        interfaceC655270Pn3.unRegisterActivityOnKeyDownListener(this);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public AbstractC1038410d83(Activity activity, View view) {
        Fragment fragmentLIZ;
        if (view != null) {
            fragmentLIZ = C946803n0.LIZ(view);
        } else {
            fragmentLIZ = null;
        }
        this(activity, fragmentLIZ);
    }

    public AbstractC1038410d83(Activity activity, Fragment fragment) {
        this.LL = activity;
        this.LLILLJJLI = fragment;
    }
}
