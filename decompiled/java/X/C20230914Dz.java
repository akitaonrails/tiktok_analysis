package X;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.Fragment;
import com.ss.android.ugc.aweme.SAFExtensionKt;
import com.ss.android.ugc.aweme.tako.ui.TakoChatRootFragment;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.14Dz, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes31.dex */
public final class C20230914Dz {
    public static final /* synthetic */ int LIZ = 0;

    /* JADX WARN: Multi-variable type inference failed */
    public static View LIZJ(Fragment fragment) {
        C19EG activity;
        Window window;
        View decorView;
        ComponentCallbacks2 componentCallbacks2LJFF;
        View view;
        View viewFindViewById;
        Window window2;
        View decorView2;
        if (C07CP.LIZ()) {
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
                        if (obj != null && (view = ((Fragment) obj).getView()) != null && (viewFindViewById = view.findViewById(R.id.xbo)) != null) {
                            return viewFindViewById;
                        }
                    } else {
                        parentFragment = parentFragment.getParentFragment();
                        if (parentFragment == 0) {
                            break;
                        }
                    }
                }
            }
            C19EG activity2 = fragment.getActivity();
            if (activity2 == null || (window2 = activity2.getWindow()) == null || (decorView2 = window2.getDecorView()) == null) {
                return null;
            }
            return decorView2.findViewById(R.id.x3q);
        }
        if (fragment == null || (activity = fragment.getActivity()) == null || (window = activity.getWindow()) == null || (decorView = window.getDecorView()) == null) {
            return null;
        }
        return decorView.findViewById(R.id.x3q);
    }

    public static InterfaceC214902198i LIZLLL(C19EG c19eg) {
        InterfaceC214902198i interfaceC214902198iLJIILLIIL;
        if (C07CP.LIZ() && c19eg != null && (interfaceC214902198iLJIILLIIL = SAFExtensionKt.LJIILLIIL(c19eg)) != null && (interfaceC214902198iLJIILLIIL instanceof TakoChatRootFragment)) {
            return interfaceC214902198iLJIILLIIL;
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0015, code lost:
    
        if (r0 == null) goto L11;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.fragment.app.FragmentManager LIZ(android.view.View r2, X.C19EG r3) {
        /*
            r1 = 0
            if (r2 == 0) goto L17
            boolean r0 = X.C07CP.LIZ()
            if (r0 == 0) goto L1e
            androidx.fragment.app.FragmentManager r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJIIJ(r2)
            if (r0 != 0) goto L25
            if (r3 == 0) goto L1d
            androidx.fragment.app.FragmentManager r0 = r3.getSupportFragmentManager()
        L15:
            if (r0 != 0) goto L25
        L17:
            if (r3 == 0) goto L1d
            androidx.fragment.app.FragmentManager r1 = r3.getSupportFragmentManager()
        L1d:
            return r1
        L1e:
            if (r3 == 0) goto L1d
            androidx.fragment.app.FragmentManager r0 = r3.getSupportFragmentManager()
            goto L15
        L25:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20230914Dz.LIZ(android.view.View, X.19EG):androidx.fragment.app.FragmentManager");
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0035, code lost:
    
        if (r0 == null) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.fragment.app.FragmentManager LIZIZ(androidx.fragment.app.Fragment r3, X.C19EG r4) {
        /*
            r2 = 0
            if (r3 == 0) goto L37
            boolean r0 = X.C07CP.LIZ()
            if (r0 == 0) goto L45
            X.14E0 r0 = X.C14E0.LIZ
            r0.getClass()
            X.01GW r0 = X.C14E0.LIZJ
            java.lang.Object r0 = r0.getValue()
            java.lang.Number r0 = (java.lang.Number) r0
            int r1 = r0.intValue()
            int r0 = X.C14E0.LIZIZ
            if (r1 != r0) goto L29
            r1 = r3
        L1f:
            boolean r0 = r1 instanceof com.bytedance.tux.sheet.sheet.TuxSheet
            if (r0 == 0) goto L3e
            androidx.fragment.app.FragmentManager r0 = r1.getChildFragmentManager()
            if (r0 != 0) goto L4c
        L29:
            androidx.fragment.app.FragmentManager r0 = com.ss.android.ugc.aweme.SAFExtensionKt.LJIIJJI(r3)
            if (r0 != 0) goto L4c
            if (r4 == 0) goto L3d
            androidx.fragment.app.FragmentManager r0 = r4.getSupportFragmentManager()
        L35:
            if (r0 != 0) goto L4c
        L37:
            if (r4 == 0) goto L3d
            androidx.fragment.app.FragmentManager r2 = r4.getSupportFragmentManager()
        L3d:
            return r2
        L3e:
            androidx.fragment.app.Fragment r1 = r1.getParentFragment()
            if (r1 == 0) goto L29
            goto L1f
        L45:
            if (r4 == 0) goto L3d
            androidx.fragment.app.FragmentManager r0 = r4.getSupportFragmentManager()
            goto L35
        L4c:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C20230914Dz.LIZIZ(androidx.fragment.app.Fragment, X.19EG):androidx.fragment.app.FragmentManager");
    }
}
