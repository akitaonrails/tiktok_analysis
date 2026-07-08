package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.view.View;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.SAFFragmentRootScene;

/* JADX INFO: renamed from: X.0Ph6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class C651580Ph6 {
    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC214902198i LIZ(Activity activity) {
        InterfaceC214902198i interfaceC214902198i;
        InterfaceC214897198d interfaceC214897198d;
        C214932199m dynamicParentScene;
        SAFFragmentRootScene sAFFragmentRootScene;
        if ((activity instanceof InterfaceC214897198d) && (interfaceC214897198d = (InterfaceC214897198d) activity) != null && (dynamicParentScene = interfaceC214897198d.getDynamicParentScene()) != null && (sAFFragmentRootScene = dynamicParentScene.LLJI) != null) {
            interfaceC214902198i = sAFFragmentRootScene.LLJJ;
        } else {
            interfaceC214902198i = null;
        }
        if (!(interfaceC214902198i instanceof C0PE2)) {
            return null;
        }
        return interfaceC214902198i;
    }

    public static final InterfaceC214902198i LIZIZ(Activity activity) {
        C19EG c19eg;
        InterfaceC214902198i interfaceC214902198iLIZ = LIZ(activity);
        if (interfaceC214902198iLIZ == null) {
            if (!(activity instanceof C19EG) || (c19eg = (C19EG) activity) == null) {
                return null;
            }
            return SAFExtensionKt.LJIILLIIL(c19eg);
        }
        return interfaceC214902198iLIZ;
    }

    public static final boolean LIZJ(InterfaceC214902198i interfaceC214902198i) {
        if (interfaceC214902198i == null) {
            return true;
        }
        if (interfaceC214902198i.W1()) {
            if (!SAFExtensionKt.LJIIZILJ(interfaceC214902198i) && interfaceC214902198i != null && !SAFExtensionKt.LJIJ(interfaceC214902198i)) {
                return false;
            }
            return true;
        }
        return SAFExtensionKt.LJIIZILJ(interfaceC214902198i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Fragment LIZLLL(View view) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        InterfaceC214902198i interfaceC214902198iLIZLLL;
        Fragment fragmentLIZ;
        if (view == null) {
            return null;
        }
        C0PE2 c0pe2LJ = C0PHF.LJ(view);
        if (c0pe2LJ != null && (fragmentLIZ = C0PHF.LIZ(c0pe2LJ)) != null) {
            return fragmentLIZ;
        }
        if (C1210904oV.LIZ()) {
            return C0PHE.LIZ(view);
        }
        C488650JEh c488650JEhLJII = SAFExtensionKt.LJII(view.getContext());
        if (c488650JEhLJII == null || (interfaceC214902198iLIZLLL = c488650JEhLJII.LIZLLL()) == null) {
            if (SAFExtensionKt.LJFF(view.getContext()) != null) {
                ComponentCallbacks2 componentCallbacks2LJFF2 = SAFExtensionKt.LJFF(view.getContext());
                if (C294780Bgy.LIZ()) {
                    if (!(componentCallbacks2LJFF2 instanceof InterfaceC214897198d)) {
                        return null;
                    }
                } else if (!(componentCallbacks2LJFF2 instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF2).getEnableSAF()) {
                    return null;
                }
            }
            Fragment fragmentLIZ2 = C946803n0.LIZ(view);
            if (fragmentLIZ2 == 0) {
                return null;
            }
            Context context = fragmentLIZ2.getContext();
            if (context != null) {
                componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
            } else {
                componentCallbacks2LJFF = null;
            }
            if (C294780Bgy.LIZ()) {
                if (!(componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                    return null;
                }
            } else if (!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) {
                return null;
            }
            while (!(fragmentLIZ2 instanceof InterfaceC214902198i)) {
                fragmentLIZ2 = fragmentLIZ2.getParentFragment();
                if (fragmentLIZ2 == 0) {
                    return null;
                }
            }
            interfaceC214902198iLIZLLL = (InterfaceC214902198i) fragmentLIZ2;
            if (interfaceC214902198iLIZLLL == null) {
                return null;
            }
        }
        return (Fragment) interfaceC214902198iLIZLLL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Fragment LJ(Fragment fragment) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        Fragment fragmentLIZ;
        if (fragment == 0) {
            return null;
        }
        C0PE2 c0pe2LJFF = C0PHF.LJFF(fragment);
        if (c0pe2LJFF != null && (fragmentLIZ = C0PHF.LIZ(c0pe2LJFF)) != null) {
            return fragmentLIZ;
        }
        if (C1210904oV.LIZ()) {
            return C0PHE.LIZIZ(fragment);
        }
        Context context = fragment.getContext();
        if (context != null) {
            componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
        } else {
            componentCallbacks2LJFF = null;
        }
        if (C294780Bgy.LIZ()) {
            if (!(componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                return null;
            }
        } else if (!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) {
            return null;
        }
        while (!(fragment instanceof InterfaceC214902198i)) {
            fragment = fragment.getParentFragment();
            if (fragment == 0) {
                return null;
            }
        }
        Object obj = (InterfaceC214902198i) fragment;
        if (obj == null) {
            return null;
        }
        return (Fragment) obj;
    }
}
