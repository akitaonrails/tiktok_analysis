package X;

import android.app.Activity;
import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.SAFExtensionKt;

/* JADX INFO: renamed from: X.0OmY, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C629480OmY {
    public static final float LIZ(C627680Oje c627680Oje) {
        float f;
        int i;
        C629490OmZ c629490OmZ = c627680Oje.LLILLJJLI;
        float f2 = c627680Oje.LL;
        int i2 = c629490OmZ.LIZJ;
        if (f2 >= c629490OmZ.LIZIZ) {
            i = c629490OmZ.LJ;
        } else if (f2 > c629490OmZ.LIZ) {
            i = c629490OmZ.LJ + c629490OmZ.LJFF;
        } else {
            if (f2 > 0.73f) {
                return -(i2 - ((f2 * i2) - c629490OmZ.LIZLLL));
            }
            f = (i2 * 0.26999998f) + c629490OmZ.LIZLLL;
            return -f;
        }
        f = i;
        return -f;
    }

    public static final boolean LIZIZ(Fragment fragment) {
        ComponentCallbacks2 componentCallbacks2LJFF = null;
        if (fragment != null) {
            Context context = fragment.getContext();
            if (context != null) {
                componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
            }
            if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                while (!(fragment instanceof InterfaceC214902198i)) {
                    fragment = fragment.getParentFragment();
                    if (fragment != null) {
                    }
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Intent LIZJ(Fragment fragment) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        Fragment fragment2;
        Bundle arguments;
        if (fragment == null) {
            return null;
        }
        Context context = fragment.getContext();
        if (context != null) {
            componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
        } else {
            componentCallbacks2LJFF = null;
        }
        if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment instanceof InterfaceC214902198i) {
                    Object obj = (InterfaceC214902198i) parentFragment;
                    if (obj != null) {
                        Intent intent = new Intent();
                        if (!(obj instanceof Fragment) || (fragment2 = (Fragment) obj) == null || (arguments = fragment2.getArguments()) == null) {
                            return intent;
                        }
                        intent.putExtras(arguments);
                        return intent;
                    }
                    if (fragment == null) {
                        return null;
                    }
                } else {
                    parentFragment = parentFragment.getParentFragment();
                    if (parentFragment == 0) {
                        break;
                    }
                }
            }
        }
        C19EG activity = fragment.getActivity();
        if (activity == null) {
            return null;
        }
        return activity.getIntent();
    }

    public static final LifecycleOwner LIZLLL(Activity activity) {
        Object objLJIILLIIL;
        Fragment fragment;
        C19EG c19eg;
        boolean z = activity instanceof C19EG;
        if (z && (c19eg = (C19EG) activity) != null) {
            objLJIILLIIL = SAFExtensionKt.LJIILLIIL(c19eg);
        } else {
            objLJIILLIIL = null;
        }
        if ((objLJIILLIIL instanceof Fragment) && (fragment = (Fragment) objLJIILLIIL) != null) {
            return fragment;
        }
        if (!z) {
            return null;
        }
        return (C19FO) activity;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Integer LJ(Fragment fragment) {
        InterfaceC1670800ta2 activity;
        C0OGM c0ogm;
        ComponentCallbacks2 componentCallbacks2LJFF;
        C0OGM c0ogm2;
        if (fragment != null) {
            Context context = fragment.getContext();
            if (context != null) {
                componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
            } else {
                componentCallbacks2LJFF = null;
            }
            if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                Fragment parentFragment = fragment;
                while (true) {
                    if (parentFragment instanceof InterfaceC214902198i) {
                        InterfaceC214902198i interfaceC214902198i = (InterfaceC214902198i) parentFragment;
                        if (interfaceC214902198i != null) {
                            if (!(interfaceC214902198i instanceof C0OGM) || (c0ogm2 = (C0OGM) interfaceC214902198i) == null) {
                                return null;
                            }
                            return Integer.valueOf(c0ogm2.getPageType());
                        }
                        if (fragment != null) {
                            break;
                        }
                    } else {
                        parentFragment = parentFragment.getParentFragment();
                        if (parentFragment == 0) {
                            break;
                        }
                    }
                }
                activity = null;
            }
            activity = fragment.getActivity();
        } else {
            activity = null;
        }
        if (!(activity instanceof C0OGM) || (c0ogm = (C0OGM) activity) == null) {
            return null;
        }
        return Integer.valueOf(c0ogm.getPageType());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC665370Q7z LJFF(Fragment fragment) {
        ComponentCallbacks2 componentCallbacks2LJFF;
        if (fragment == null) {
            return null;
        }
        Context context = fragment.getContext();
        if (context != null) {
            componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
        } else {
            componentCallbacks2LJFF = null;
        }
        if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
            Fragment parentFragment = fragment;
            while (true) {
                if (parentFragment instanceof InterfaceC214902198i) {
                    Object obj = (InterfaceC214902198i) parentFragment;
                    if (obj != null && (obj instanceof Fragment)) {
                        return C1558360qeg.LJFF((Fragment) obj, null);
                    }
                    if (fragment == null) {
                        return null;
                    }
                } else {
                    parentFragment = parentFragment.getParentFragment();
                    if (parentFragment == 0) {
                        break;
                    }
                }
            }
        }
        C19EG activity = fragment.getActivity();
        if (activity == null) {
            return null;
        }
        return C1558360qeg.LJI(activity, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void LJI(Fragment fragment) {
        ComponentCallbacks2 componentCallbacks2LJFF = null;
        if (fragment != null) {
            Context context = fragment.getContext();
            if (context != null) {
                componentCallbacks2LJFF = SAFExtensionKt.LJFF(context);
            }
            if (!C294780Bgy.LIZ() ? !(!(componentCallbacks2LJFF instanceof InterfaceC214897198d) || !((InterfaceC214897198d) componentCallbacks2LJFF).getEnableSAF()) : (componentCallbacks2LJFF instanceof InterfaceC214897198d)) {
                Fragment parentFragment = fragment;
                while (true) {
                    if (parentFragment instanceof InterfaceC214902198i) {
                        InterfaceC214902198i interfaceC214902198i = (InterfaceC214902198i) parentFragment;
                        if (interfaceC214902198i != null) {
                            interfaceC214902198i.finish();
                            return;
                        } else if (fragment == null) {
                            return;
                        }
                    } else {
                        parentFragment = parentFragment.getParentFragment();
                        if (parentFragment == 0) {
                            break;
                        }
                    }
                }
            }
            C19EG activity = fragment.getActivity();
            if (activity != null) {
                activity.finish();
            }
        }
    }
}
