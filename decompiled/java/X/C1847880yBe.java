package X;

import android.view.View;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

/* JADX INFO: renamed from: X.0yBe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1847880yBe extends AbstractC813200VvC {
    public static final C1847880yBe LL = new C1847880yBe();

    @Override // X.AbstractC813200VvC
    public final void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
        C1847740yBQ c1847740yBQLIZIZ;
        super.onFragmentPaused(fragmentManager, fragment);
        View view = fragment.getView();
        if (view != null && (c1847740yBQLIZIZ = C1846620y9c.LIZIZ(view)) != null && c1847740yBQLIZIZ.LIZIZ != null) {
            if (C1847960yBm.LJIIIIZZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onPause: fragment = ");
                sbLIZ.append(fragment.getClass().getName());
                C2188811AlT.LIZIZ(sbLIZ);
            }
            if (!(fragment instanceof DialogFragment)) {
                C1847860yBc.LIZ(C1847630yBF.LIZ(fragment));
            }
        }
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentResumed(fragmentManager, fragment);
        if (C1847960yBm.LJIIIIZZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onResume: fragment = ");
            sbLIZ.append(fragment.getClass().getName());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        if (!(fragment instanceof DialogFragment)) {
            C1847860yBc.LIZJ(C1847630yBF.LIZ(fragment));
        }
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentStarted(fragmentManager, fragment);
        final C1847620yBE c1847620yBELIZ = C1847630yBF.LIZ(fragment);
        if (C1847960yBm.LJIIIIZZ) {
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("onFragmentStarted: fragment = ");
            sbLIZ.append(c1847620yBELIZ.LIZJ.getClass().getName());
            sbLIZ.append(", hashcode=");
            sbLIZ.append(c1847620yBELIZ.LIZJ.hashCode());
            C2188811AlT.LIZIZ(sbLIZ);
        }
        Fragment fragment2 = c1847620yBELIZ.LIZJ;
        if (fragment2 != null) {
            C1845200y7K.LIZIZ(fragment2);
        }
        C1847860yBc.LLILLJJLI.LIZJ.LIZIZ(new InterfaceC1489050oqt<InterfaceC1848190yC9>(c1847620yBELIZ) { // from class: X.0yC8
            @Override // X.InterfaceC1489050oqt
            public final void LIZ(InterfaceC1848190yC9 interfaceC1848190yC9) {
                interfaceC1848190yC9.LLLZIL();
            }
        });
    }

    @Override // X.AbstractC813200VvC
    public final void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        C1847740yBQ c1847740yBQLIZIZ;
        super.onFragmentViewDestroyed(fragmentManager, fragment);
        View view = fragment.getView();
        if (view != null && (c1847740yBQLIZIZ = C1846620y9c.LIZIZ(view)) != null && c1847740yBQLIZIZ.LIZIZ != null) {
            if (C1847960yBm.LJIIIIZZ) {
                StringBuilder sbLIZ = C2188811AlT.LIZ();
                sbLIZ.append("onDestroyView: fragment = ");
                sbLIZ.append(fragment.getClass().getName());
                C2188811AlT.LIZIZ(sbLIZ);
            }
            if (!(fragment instanceof DialogFragment)) {
                final C1847620yBE c1847620yBELIZ = C1847630yBF.LIZ(fragment);
                if (C1847960yBm.LJIIIIZZ) {
                    StringBuilder sbLIZ2 = C2188811AlT.LIZ();
                    sbLIZ2.append("onFragmentDestroyView: fragment = ");
                    sbLIZ2.append(c1847620yBELIZ.LIZJ.getClass().getName());
                    sbLIZ2.append(", hashcode=");
                    sbLIZ2.append(c1847620yBELIZ.LIZJ.hashCode());
                    C2188811AlT.LIZIZ(sbLIZ2);
                }
                C1847860yBc.LLILLJJLI.LIZJ.LIZIZ(new InterfaceC1489050oqt<InterfaceC1848190yC9>() { // from class: X.0yCC
                    @Override // X.InterfaceC1489050oqt
                    public final void LIZ(InterfaceC1848190yC9 interfaceC1848190yC9) {
                        interfaceC1848190yC9.LLZLI(c1847620yBELIZ);
                    }
                });
            }
        }
    }
}
