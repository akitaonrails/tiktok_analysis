package X;

import android.content.res.ColorStateList;
import com.zhiliaoapp.musically.R;

/* JADX INFO: renamed from: X.0UfB, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes13.dex */
public abstract class AbstractC777790UfB implements InterfaceC778710Ugf {
    public abstract EnumC777770Uf9 LIZ();

    @Override // X.InterfaceC778710Ugf
    public final C778580UgS getIcon() {
        int iIntValue;
        C20743516Fd c20743516Fd = null;
        switch (C777780UfA.LIZ[LIZ().ordinal()]) {
            case 1:
                return new C778580UgS(C497740JfY.LJIIJ(R.drawable.c3z), null);
            case 2:
                return new C778580UgS(C497740JfY.LJIIJ(R.drawable.eqq), null);
            case 3:
                return new C778580UgS(C497740JfY.LJIIJ(R.drawable.ff9), null);
            case 4:
                return new C778580UgS(C497740JfY.LJIIJ(R.drawable.emc), null);
            case 5:
                Integer numLIZJ = C1308910kAL.LIZJ(R.attr.c9i, C497740JfY.LJII());
                iIntValue = numLIZJ != null ? numLIZJ.intValue() : -1;
                C20743516Fd c20743516FdLIZLLL = C20736316Cj.LIZLLL(R.attr.dn2, C497740JfY.LJII());
                if (c20743516FdLIZLLL != null) {
                    c20743516FdLIZLLL.setTint(iIntValue);
                    c20743516Fd = c20743516FdLIZLLL;
                }
                return new C778580UgS(c20743516Fd, ColorStateList.valueOf(iIntValue));
            case 6:
                return new C778580UgS(C497740JfY.LJIIJ(R.drawable.elv), null);
            case 7:
                Integer numLIZJ2 = C1308910kAL.LIZJ(R.attr.c9i, C497740JfY.LJII());
                iIntValue = numLIZJ2 != null ? numLIZJ2.intValue() : -1;
                C20743516Fd c20743516FdLIZLLL2 = C20736316Cj.LIZLLL(R.attr.eny, C497740JfY.LJII());
                if (c20743516FdLIZLLL2 != null) {
                    c20743516FdLIZLLL2.setTint(iIntValue);
                    c20743516Fd = c20743516FdLIZLLL2;
                }
                return new C778580UgS(c20743516Fd, ColorStateList.valueOf(iIntValue));
            case 8:
                return null;
            default:
                throw new C1954807lC();
        }
    }
}
