package X;

import android.content.Context;
import android.graphics.drawable.Drawable;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AFwS214S0000000_25;
import kotlin.jvm.internal.AFwS311S0000000_25;
import kotlin.jvm.internal.AwS181S0101000_25;
import kotlin.jvm.internal.AwS39S0000100_25;
import kotlin.jvm.internal.Intrinsics;
import o0.k;
import p2.g;

/* JADX INFO: renamed from: X.0tS6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1665880tS6 {
    public static final void LIZ(Function0<Unit> function0, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int i3;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-826165455);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i3 = 4;
            } else {
                i3 = 2;
            }
            i2 = i3 | i;
        } else {
            i2 = i;
        }
        if ((i2 & 3) == 2 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            long jB2 = C1670400tZO.LIZIZ(c13zcLJIIJ).B2();
            Context context = (Context) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
            InterfaceC1690500u5o interfaceC1690500u5o = (InterfaceC1690500u5o) c13zcLJIIJ.LJJIL(C20055113dV.LJII);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                C419910GdJ c419910GdJ = new C419910GdJ();
                c419910GdJ.LIZ = R.raw.icon_bitmap_story_reveal;
                C1665850tS3 c1665850tS3 = C1665860tS4.LIZJ;
                float f = 2;
                c419910GdJ.LIZIZ = interfaceC1690500u5o.LJLLJ(c1665850tS3.LIZ * f);
                c419910GdJ.LIZJ = interfaceC1690500u5o.LJLLJ(c1665850tS3.LIZ * f);
                objLJJ = c419910GdJ.LIZ(context);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            Drawable drawable = (Drawable) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            C1685760tyA c1685760tyA = InterfaceC1685750ty9.LIZ;
            InterfaceC1685750ty9 interfaceC1685750ty9LIZ = C1666320tSo.LIZ(c13zcLJIIJ, c.LJIILIIL(c1685760tyA, C1665860tS4.LIZ), function0);
            InterfaceC1668050tVb.LIZ.getClass();
            InterfaceC20053113dB interfaceC20053113dBLIZLLL = k.LIZLLL(C1668040tVa.LIZIZ, false);
            int iLIZ = C0MXE.LIZ(c13zcLJIIJ);
            C13D2 c13d2LJJJIL = c13zcLJIIJ.LJJJIL();
            InterfaceC1685750ty9 interfaceC1685750ty9LIZLLL = C1685720ty6.LIZLLL(c13zcLJIIJ, interfaceC1685750ty9LIZ);
            g.LJLIIIL.getClass();
            AFwS214S0000000_25 aFwS214S0000000_25 = g.a.LIZIZ;
            if (c13zcLJIIJ.LIZIZ instanceof InterfaceC20032213Zo) {
                c13zcLJIIJ.LJJIII();
                if (c13zcLJIIJ.LJJJI) {
                    c13zcLJIIJ.LJJI(aFwS214S0000000_25);
                } else {
                    c13zcLJIIJ.LJIILJJIL();
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC20053113dBLIZLLL, g.a.LJI);
                C1665930tSB.LIZ(c13zcLJIIJ, c13d2LJJJIL, g.a.LJFF);
                AFwS311S0000000_25 aFwS311S0000000_25 = g.a.LJIIIIZZ;
                if (c13zcLJIIJ.LJJJI || !Intrinsics.LJFF(c13zcLJIIJ.LJJ(), Integer.valueOf(iLIZ))) {
                    c13zcLJIIJ.LJJIJIIJI(Integer.valueOf(iLIZ));
                    c13zcLJIIJ.LIZIZ(Integer.valueOf(iLIZ), aFwS311S0000000_25);
                }
                C1665930tSB.LIZ(c13zcLJIIJ, interfaceC1685750ty9LIZLLL, g.a.LIZLLL);
                C1672220tcK c1672220tcK = C1672220tcK.LIZ;
                FillElement fillElement = c.LIZJ;
                c13zcLJIIJ.LJJIIJZLJL(5004770);
                boolean zLJIJJ = c13zcLJIIJ.LJIJJ(jB2);
                Object objLJJ2 = c13zcLJIIJ.LJJ();
                if (zLJIJJ || objLJJ2 == c1680520tpi) {
                    objLJJ2 = new AwS39S0000100_25(jB2, 1);
                    c13zcLJIIJ.LJJIJIIJI(objLJJ2);
                }
                c13zcLJIIJ.LJJJJL(false);
                C1668170tVn.LIZ(fillElement, (Function1) objLJJ2, c13zcLJIIJ, 6);
                C1668230tVt.LIZ(C1668830tWr.LIZIZ(drawable, c13zcLJIIJ), null, c1672220tcK.LIZIZ(C1667200tUE.LIZ(c.LJIILIIL(c1685760tyA, C1665860tS4.LIZJ.LIZ * 2), C1669050tXD.LIZ), C1668040tVa.LJFF), null, null, 0.0f, null, c13zcLJIIJ, 48, 120);
                c13zcLJIIJ.LJJJJL(true);
            } else {
                C0MXE.LIZIZ();
                throw null;
            }
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS181S0101000_25(i, function0, 29);
        }
    }
}
