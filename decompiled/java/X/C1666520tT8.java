package X;

import androidx.compose.foundation.layout.c;
import com.ss.android.ugc.aweme.social.creation.edit.uiviewmodel.EditUILayerViewModel;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS131S0101000_25;
import kotlin.jvm.internal.AwS62S0301000_25;

/* JADX INFO: renamed from: X.0tT8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1666520tT8 {
    public static final void LIZ(InterfaceC1685750ty9 interfaceC1685750ty9, C1666530tT9 c1666530tT9, EditUILayerViewModel editUILayerViewModel, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        int i4;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1108661788);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty9)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1666530tT9)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(editUILayerViewModel)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (!c1666530tT9.LIZJ) {
                C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
                if (c20030013YsLJJJJZI != null) {
                    c20030013YsLJJJJZI.LIZLLL = new AwS62S0301000_25(interfaceC1685750ty9, c1666530tT9, editUILayerViewModel, i, 7);
                    return;
                }
                return;
            }
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = Integer.valueOf(c1666530tT9.LIZLLL);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            int iIntValue = ((Number) objLJJ).intValue();
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean zLJII = c13zcLJIIJ.LJII(editUILayerViewModel);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (zLJII || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS131S0101000_25(iIntValue, editUILayerViewModel, 2);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C20084413iE.LIZ(0, 4, c13zcLJIIJ, C1666320tSo.LIZ(c13zcLJIIJ, C1682520tsw.LJIIL(C1682520tsw.LJIIIIZZ(c.LJIILIIL(interfaceC1685750ty9, 40), 8), 12, 0.0f, 0.0f, 0.0f, 14), c1666530tT9.LJ), (Function1) objLJJ2, null);
        }
        C20030013Ys c20030013YsLJJJJZI2 = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI2 != null) {
            c20030013YsLJJJJZI2.LIZLLL = new AwS62S0301000_25(interfaceC1685750ty9, c1666530tT9, editUILayerViewModel, i, 8);
        }
    }
}
