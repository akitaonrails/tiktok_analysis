package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.0Ikn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class C475510Ikn {
    /* JADX WARN: Multi-variable type inference failed */
    public static final C0IP3 LIZ(FragmentManager fragmentManager) {
        for (Fragment fragment : fragmentManager.LJJLIIIJL()) {
            if (fragment instanceof C0IP3) {
                return (C0IP3) fragment;
            }
            C0IP3 c0ip3LIZJ = LIZJ(fragment);
            if (c0ip3LIZJ != null) {
                return c0ip3LIZJ;
            }
        }
        return null;
    }

    public static final C0IP3 LIZIZ(C19EG c19eg) {
        FragmentManager containerFragmentManager;
        Object obj = null;
        if (c19eg == null) {
            return null;
        }
        if (C294740Bgu.LIZ()) {
            AbstractC1387200mCc abstractC1387200mCcLJ = C1906580ziK.LJ();
            if (abstractC1387200mCcLJ != null) {
                obj = abstractC1387200mCcLJ.LIZ;
            }
            if ((obj instanceof InterfaceC20622815ms) && (containerFragmentManager = ((InterfaceC20622815ms) obj).getContainerFragmentManager()) != null) {
                return LIZ(containerFragmentManager);
            }
        }
        return LIZ(c19eg.getSupportFragmentManager());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C0IP3 LIZJ(Fragment fragment) {
        if (fragment != null) {
            try {
                if (!fragment.isDetached()) {
                    for (Fragment fragment2 : fragment.getChildFragmentManager().LJJLIIIJL()) {
                        if (fragment2 instanceof C0IP3) {
                            return (C0IP3) fragment2;
                        }
                        C0IP3 c0ip3LIZJ = LIZJ(fragment2);
                        if (c0ip3LIZJ != null) {
                            return c0ip3LIZJ;
                        }
                    }
                    return null;
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final C0IP3 LIZLLL(Fragment fragment) {
        if (fragment != 0) {
            try {
                if (!fragment.isDetached()) {
                    if ((fragment instanceof C0IP3) && ((C0IP3) fragment).provideDataChannel() != null) {
                        return (C0IP3) fragment;
                    }
                    return LIZLLL(fragment.getParentFragment());
                }
            } catch (Throwable th) {
                TryCatchGuardChecker.doCheck(th);
            }
        }
        return null;
    }

    @InterfaceC1294060jmO
    public static final DataChannel LJ(Fragment fragment) {
        C19EG activity;
        C19EG activity2;
        if (fragment != null) {
            activity = fragment.getActivity();
        } else {
            activity = null;
        }
        if (activity instanceof C0IP3) {
            return ((C0IP3) fragment.getActivity()).provideDataChannel();
        }
        C0IP3 c0ip3LIZLLL = LIZLLL(fragment);
        if (c0ip3LIZLLL == null) {
            if (fragment != null) {
                activity2 = fragment.getActivity();
            } else {
                activity2 = null;
            }
            c0ip3LIZLLL = LIZIZ(activity2);
            if (c0ip3LIZLLL == null) {
                return null;
            }
        }
        return c0ip3LIZLLL.provideDataChannel();
    }
}
