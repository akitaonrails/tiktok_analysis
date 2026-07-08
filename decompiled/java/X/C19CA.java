package X;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import com.bytedance.scene.Scene;
import com.bytedance.scene.navigation.NavigationScene;

/* JADX INFO: renamed from: X.19CA, reason: invalid class name */
/* JADX INFO: loaded from: classes33.dex */
public final class C19CA {
    public static C214873197f LIZ(Activity activity, Class<? extends Scene> cls) {
        return new C214873197f(activity, cls);
    }

    public static InterfaceC1655610tBX LIZIZ(Activity activity, int i, C214936199q c214936199q, InterfaceC214877197j interfaceC214877197j, boolean z, String str, boolean z2) {
        C19CE c19ceLIZ;
        C12WP.LIZ();
        if (str != null) {
            C788890Ux5.LIZ(activity, str);
            final NavigationScene navigationScene = (NavigationScene) C2350509Ix.LIZ(c214936199q.LIZ(), NavigationScene.class);
            if (!C19BL.LJ(activity)) {
                return new InterfaceC1655610tBX(navigationScene) { // from class: X.19CG
                    public final NavigationScene LIZ;

                    @Override // X.InterfaceC1655610tBX
                    public final void LIZ() {
                    }

                    @Override // X.InterfaceC1655610tBX
                    public final boolean onBackPressed() {
                        return false;
                    }

                    @Override // X.InterfaceC1655610tBX
                    public final NavigationScene getNavigationScene() {
                        return this.LIZ;
                    }

                    {
                        this.LIZ = navigationScene;
                    }
                };
            }
            navigationScene.LLJIJIL = interfaceC214877197j;
            FragmentManager fragmentManager = activity.getFragmentManager();
            C19CC c19cc = (C19CC) fragmentManager.findFragmentByTag(str);
            if (c19cc != null && !z) {
                FragmentTransaction fragmentTransactionBeginTransaction = fragmentManager.beginTransaction();
                fragmentTransactionBeginTransaction.remove(c19cc);
                C19BL.LIZ(fragmentManager, fragmentTransactionBeginTransaction, z2);
                c19cc = null;
            }
            C19394410uE c19394410uE = new C19394410uE(activity);
            if (c19cc != null) {
                c19ceLIZ = C19CE.LIZ(activity, str, false, z2);
                c19cc.LLILLJJLI = new C19AK(i, c19394410uE, navigationScene, c19ceLIZ, z);
            } else {
                c19cc = new C19CC();
                FragmentTransaction fragmentTransactionBeginTransaction2 = fragmentManager.beginTransaction();
                fragmentTransactionBeginTransaction2.add(i, c19cc, str);
                navigationScene = navigationScene;
                c19ceLIZ = C19CE.LIZ(activity, str, !z, z2);
                c19cc.LLILLJJLI = new C19AK(i, c19394410uE, navigationScene, c19ceLIZ, z);
                C19BL.LIZ(fragmentManager, fragmentTransactionBeginTransaction2, z2);
            }
            return new C19CD(activity, navigationScene, c19cc, c19ceLIZ, z2);
        }
        throw new IllegalArgumentException("tag cant be null");
    }
}
