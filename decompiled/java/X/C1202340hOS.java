package X;

import androidx.fragment.app.Fragment;
import com.bytedance.immersionbar.ImmersionBar;
import com.bytedance.tux.system.TuxImmersionBar;

/* JADX INFO: renamed from: X.0hOS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class C1202340hOS {
    public static final /* synthetic */ int LIZ = 0;

    public static final void LIZIZ(C19EG c19eg, C1202330hOR c1202330hOR) {
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(c19eg, ImmersionBar.LJIILJJIL(c19eg));
        if (!c1202330hOR.LIZJ) {
            tuxImmersionBar.LIZ(c1202330hOR.LIZ);
        }
        LIZJ(tuxImmersionBar, c1202330hOR);
    }

    public static void LIZJ(TuxImmersionBar tuxImmersionBar, C1202330hOR c1202330hOR) {
        int i = c1202330hOR.LJFF;
        if (i != -1) {
            tuxImmersionBar.LJIIIIZZ(i);
        }
        if (c1202330hOR.LJ) {
            tuxImmersionBar.LIZIZ.LJIIJJI();
        }
        if (c1202330hOR.LIZLLL) {
            tuxImmersionBar.LJIIL();
        }
        if (c1202330hOR.LIZJ) {
            tuxImmersionBar.LJIIJ(true);
        } else {
            tuxImmersionBar.LIZ(c1202330hOR.LIZ);
        }
        int i2 = c1202330hOR.LJI;
        if (i2 != -1) {
            tuxImmersionBar.LJ(i2);
        }
        Boolean bool = c1202330hOR.LJII;
        if (bool != null) {
            tuxImmersionBar.LJI(bool.booleanValue());
        }
        tuxImmersionBar.LIZLLL();
    }

    public static final TuxImmersionBar LIZ(Fragment fragment, C1202330hOR c1202330hOR, boolean z, boolean z2) {
        TuxImmersionBar tuxImmersionBar = new TuxImmersionBar(fragment.getContext(), ImmersionBar.LJIILIIL(fragment, z2));
        if (!z) {
            tuxImmersionBar.LIZ(c1202330hOR.LIZ);
        } else if (!c1202330hOR.LIZJ) {
            tuxImmersionBar.LIZ(c1202330hOR.LIZ);
            return tuxImmersionBar;
        }
        return tuxImmersionBar;
    }
}
