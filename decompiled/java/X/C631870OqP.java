package X;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ss.android.ugc.aweme.music.OriginMusicArg;
import com.ss.android.ugc.aweme.music.vm.OriginMusicListViewModel;
import com.ss.android.ugc.aweme.profile.model.User;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS121S0201000_9;
import kotlin.jvm.internal.AwS253S0300000_9;
import kotlin.jvm.internal.AwS553S0100000_9;

/* JADX INFO: renamed from: X.0OqP, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C631870OqP {
    public static final void LIZ(OriginMusicListViewModel originMusicListViewModel, Function0<Unit> function0, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        boolean z;
        int i3;
        int i4;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(2061390179);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJJIIJ(originMusicListViewModel)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i2 = i4 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i3 = 32;
            } else {
                i3 = 16;
            }
            i2 |= i3;
        }
        if ((i2 & 19) == 18 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            Context context = (Context) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
            OriginMusicArg originMusicArgAQ2 = originMusicListViewModel.AQ2();
            C632210Oqx.LIZ.getClass();
            User userLIZJ = C632210Oqx.LIZJ();
            Unit unit = Unit.LIZ;
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = new C613540O4q(null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(unit, (Function2) objLJJ, c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean zLJII = c13zcLJIIJ.LJII(originMusicArgAQ2) | c13zcLJIIJ.LJII(userLIZJ);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (zLJII || objLJJ2 == c1680520tpi) {
                objLJJ2 = new C613550O4r(originMusicArgAQ2, userLIZJ, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(unit, (Function2) objLJJ2, c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(-1746271574);
            boolean zLJII2 = c13zcLJIIJ.LJII(userLIZJ) | c13zcLJIIJ.LJII(context) | c13zcLJIIJ.LJII(originMusicArgAQ2);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (zLJII2 || objLJJ3 == c1680520tpi) {
                objLJJ3 = new AwS253S0300000_9(userLIZJ, context, originMusicArgAQ2, 11);
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            Function0 function02 = (Function0) objLJJ3;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            if ((i2 & 112) == 32) {
                z = true;
            } else {
                z = false;
            }
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (z || objLJJ4 == c1680520tpi) {
                objLJJ4 = new AwS553S0100000_9(function0, (Function0<Unit>) 1813);
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            c13zcLJIIJ.LJJJJL(false);
            C634290OuJ.LIZ(0, 4, c13zcLJIIJ, null, function02, (Function0) objLJJ4);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS121S0201000_9(originMusicListViewModel, (OriginMusicListViewModel) function0, (Function0<Unit>) i, 8);
        }
    }
}
