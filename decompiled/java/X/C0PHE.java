package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import java.lang.ref.WeakReference;

/* JADX INFO: renamed from: X.0PHE, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PHE {
    public static final Fragment LIZ(View view) {
        Fragment fragmentLIZ;
        ComponentCallbacks2 componentCallbacks2LIZ;
        Object objLIZLLL;
        C488690JEl c488690JElLJI;
        WeakReference<Fragment> weakReference;
        Fragment fragment;
        Context context = view.getContext();
        if (context != null && (c488690JElLJI = C0PHF.LJI(context)) != null && (weakReference = c488690JElLJI.LLIZ) != null && (fragment = weakReference.get()) != null) {
            return fragment;
        }
        C488650JEh c488650JEhLJII = SAFExtensionKt.LJII(view.getContext());
        if (c488650JEhLJII != null && (objLIZLLL = c488650JEhLJII.LIZLLL()) != null) {
            return (Fragment) objLIZLLL;
        }
        boolean z = false;
        if (C1388190mED.LIZ(view.getContext()) != null) {
            Context context2 = view.getContext();
            if (context2 != null) {
                componentCallbacks2LIZ = C1388190mED.LIZ(context2);
            } else {
                componentCallbacks2LIZ = null;
            }
            if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LIZ instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LIZ).getEnableSAF()) : (componentCallbacks2LIZ instanceof InterfaceC214897198d)) {
                z = true;
            }
        }
        boolean zLIZ = C1209904oL.LIZ();
        if ((!z && !zLIZ) || (fragmentLIZ = C946803n0.LIZ(view)) == null) {
            return null;
        }
        return LIZIZ(fragmentLIZ);
    }

    public static final Fragment LIZIZ(Fragment fragment) {
        ComponentCallbacks2 componentCallbacks2LIZ;
        boolean z;
        Context context = fragment.getContext();
        if (context != null) {
            componentCallbacks2LIZ = C1388190mED.LIZ(context);
        } else {
            componentCallbacks2LIZ = null;
        }
        if (!C294780Bgy.LIZ() ? !(componentCallbacks2LIZ instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LIZ).getEnableSAF() : !(componentCallbacks2LIZ instanceof InterfaceC214897198d)) {
            z = true;
        } else {
            z = false;
        }
        boolean z2 = !z;
        boolean zLIZ = C1209904oL.LIZ();
        if (!z2 && !zLIZ) {
            return null;
        }
        while (!(fragment instanceof InterfaceC214902198i) && !(fragment instanceof C0PE2)) {
            fragment = fragment.getParentFragment();
            if (fragment == null) {
                return null;
            }
        }
        return fragment;
    }
}
