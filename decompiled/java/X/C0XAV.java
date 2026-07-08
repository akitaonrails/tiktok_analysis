package X;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutorService;

/* JADX INFO: renamed from: X.0XAV, reason: invalid class name */
/* JADX INFO: loaded from: classes14.dex */
public final class C0XAV {
    public static ExecutorService LIZ;
    public static C0XAB LIZIZ;
    public static Method LIZJ;

    public static ExecutorService LIZIZ() {
        if (LIZ == null) {
            if (C0XAA.LIZ() == null || C0XAA.LIZ().LIZJ == null) {
                throw new IllegalStateException("SceneManagerConfig#executorservice must init");
            }
            LIZ = C0XAA.LIZ().LIZJ;
        }
        return LIZ;
    }

    /* JADX WARN: Code restructure failed: missing block: B:71:0x00c9, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.fragment.app.Fragment LIZ(java.util.List<androidx.fragment.app.Fragment> r8) {
        /*
            Method dump skipped, instruction units count: 225
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XAV.LIZ(java.util.List):androidx.fragment.app.Fragment");
    }

    public static FragmentManager LIZJ(Fragment fragment) {
        try {
            if (LIZJ == null) {
                LIZJ = Fragment.class.getDeclaredMethod("peekChildFragmentManager", new Class[0]);
            }
            Method method = LIZJ;
            if (method == null) {
                return null;
            }
            method.setAccessible(true);
            return (FragmentManager) LIZJ.invoke(fragment, new Object[0]);
        } catch (Exception e) {
            TryCatchGuardChecker.doCheck(e);
            return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0068, code lost:
    
        if (r0 != null) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static androidx.fragment.app.Fragment LIZLLL(java.util.List<androidx.fragment.app.Fragment> r6) {
        /*
            r5 = r6
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            boolean r0 = r5.isEmpty()
            r4 = 0
            if (r0 != 0) goto L6c
            r3 = 0
            r2 = 0
        Lc:
            int r0 = r5.size()
            if (r2 >= r0) goto L62
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r6, r2)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            android.view.View r1 = r0.getView()
            if (r1 == 0) goto L5f
            android.view.View r1 = r0.getView()
            android.view.ViewParent r1 = r1.getParent()
            if (r1 == 0) goto L5f
            android.view.View r1 = r0.getView()
            android.view.ViewParent r1 = r1.getParent()
            android.view.View r1 = (android.view.View) r1
            int r1 = r1.getVisibility()
            if (r1 != 0) goto L5f
        L38:
            java.lang.Object r1 = r0.getHost()
            if (r1 == 0) goto L6b
            androidx.fragment.app.FragmentManager r1 = LIZJ(r0)
            if (r1 == 0) goto L6b
            androidx.fragment.app.FragmentManager r1 = r0.getChildFragmentManager()
            java.util.List r1 = r1.LJJLIIIJL()
            int r1 = r1.size()
            if (r1 <= 0) goto L6b
            androidx.fragment.app.FragmentManager r0 = r0.getChildFragmentManager()
            java.util.List r0 = r0.LJJLIIIJL()
            androidx.fragment.app.Fragment r0 = LIZ(r0)
            return r0
        L5f:
            int r2 = r2 + 1
            goto Lc
        L62:
            java.lang.Object r0 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r6, r3)
            androidx.fragment.app.Fragment r0 = (androidx.fragment.app.Fragment) r0
            if (r0 == 0) goto L6c
            goto L38
        L6b:
            return r0
        L6c:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C0XAV.LIZLLL(java.util.List):androidx.fragment.app.Fragment");
    }

    public static Fragment LJ(List<Fragment> list) {
        for (int i = 0; i < ((ArrayList) list).size(); i++) {
            Fragment fragment = (Fragment) ListProtector.get(list, i);
            if (fragment.getTag() != null && fragment.getTag().startsWith("android:switcher:") && fragment.getUserVisibleHint() && fragment.getHost() != null) {
                if (LIZJ(fragment) == null) {
                    return fragment;
                }
                List<Fragment> listLJJLIIIJL = fragment.getChildFragmentManager().LJJLIIIJL();
                if (listLJJLIIIJL.size() > 0) {
                    return LIZ(listLJJLIIIJL);
                }
                return fragment;
            }
        }
        return null;
    }
}
