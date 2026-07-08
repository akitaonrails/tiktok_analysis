package X;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.ss.android.ugc.aweme.IAccountService;
import com.ss.android.ugc.aweme.framework.services.ServiceManager;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS128S1000000_25;
import kotlin.jvm.internal.AwS1S0121000_25;
import kotlin.jvm.internal.AwS404S0200000_3;

/* JADX INFO: renamed from: X.0u3H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1688930u3H {
    public static final void LIZ(C2015407uy c2015407uy, boolean z, boolean z2, InterfaceC1680500tpg interfaceC1680500tpg, int i) {
        int i2;
        int iIntValue;
        int i3;
        int i4;
        int i5;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1754858251);
        if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(c2015407uy)) {
                i5 = 4;
            } else {
                i5 = 2;
            }
            i2 = i5 | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z)) {
                i4 = 32;
            } else {
                i4 = 16;
            }
            i2 |= i4;
        }
        if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJIIZILJ(z2)) {
                i3 = 256;
            } else {
                i3 = 128;
            }
            i2 |= i3;
        }
        if ((i2 & 147) == 146 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            Context context = (Context) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = ((IAccountService) ServiceManager.get().getService(IAccountService.class)).LJIIJ().getAvatarUrl();
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            String str = (String) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            Integer num = c2015407uy.LLILLL;
            if (num != null) {
                iIntValue = num.intValue();
            } else {
                iIntValue = 0;
            }
            String strLIZIZ = C0MBB.LIZIZ(iIntValue, c13zcLJIIJ);
            C1668880tWw c1668880tWw = c2015407uy.LLILLJJLI;
            if (c1668880tWw == null) {
                c1668880tWw = C1668100tVg.LIZ;
            }
            C1685380txY c1685380txYLJFF = C1688900u3E.LJFF(c1668880tWw, c13zcLJIIJ);
            Function1<InterfaceC1872607Vc, Unit> function1 = c2015407uy.LL;
            c13zcLJIIJ.LJJIIJZLJL(5004770);
            boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(function1);
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (zLJJIIJ || objLJJ2 == c1680520tpi) {
                objLJJ2 = new AwS404S0200000_3(c2015407uy, context, 46);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1673210tdv.LIZ(null, strLIZIZ, 0, null, false, false, null, false, c1685380txYLJFF, false, null, z, z2, null, null, null, null, null, C1675010tgp.LIZ(1, 0L, c13zcLJIIJ, (Function0) objLJJ2), null, null, null, null, false, C13Z4.LIZJ(1945485844, new AwS128S1000000_25(str, 2), c13zcLJIIJ), c13zcLJIIJ, 0, (i2 & 112) | (i2 & 896), 24576, 16508669);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS1S0121000_25(c2015407uy, z, z2, i, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x00b9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZIZ(boolean r18, boolean r19, com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.login.cell.SwitchAccountVM r20, X.InterfaceC1680500tpg r21, int r22, int r23) {
        /*
            Method dump skipped, instruction units count: 365
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1688930u3H.LIZIZ(boolean, boolean, com.ss.android.ugc.aweme.setting.ui.rvmpcompose.group.login.cell.SwitchAccountVM, X.0tpg, int, int):void");
    }
}
