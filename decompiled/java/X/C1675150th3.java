package X;

import androidx.compose.foundation.layout.c;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.ss.android.ugc.aweme.relation.ffp.nearby.ui.ConnectNowBasePage;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS1S0502000_25;
import kotlin.jvm.internal.AwS460S0200000_25;
import kotlin.jvm.internal.AwS633S0100000_19;
import tiktok.compose.assem.UiComposableAssem;

/* JADX INFO: renamed from: X.0th3, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1675150th3 {
    public static final void LIZ(EnumC1675160th4 enumC1675160th4, InterfaceC1685750ty9 interfaceC1685750ty9, C1687630u1B c1687630u1B, Function0<Unit> function0, ConnectNowBasePage connectNowBasePage, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean zLJII;
        int i8;
        Function0<Unit> function02;
        C1687630u1B c1687630u1B2 = c1687630u1B;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(1388777597);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJIJI(enumC1675160th4.ordinal())) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        int i9 = i2 & 2;
        if (i9 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i10 = i2 & 4;
        if (i10 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJII(c1687630u1B2)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        int i11 = i2 & 8;
        if (i11 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function0)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i2 & 16) != 0) {
            i3 |= 24576;
        } else if ((i & 24576) == 0) {
            if ((32768 & i) == 0) {
                zLJII = c13zcLJIIJ.LJJIIJ(connectNowBasePage);
            } else {
                zLJII = c13zcLJIIJ.LJII(connectNowBasePage);
            }
            if (zLJII) {
                i8 = 16384;
            } else {
                i8 = 8192;
            }
            i3 |= i8;
        }
        if ((i3 & 9363) == 9362 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
            function02 = function0;
        } else {
            if (i9 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            function02 = null;
            if (i10 != 0) {
                c1687630u1B2 = null;
            }
            if (i11 == 0) {
                function02 = function0;
            }
            int i12 = UiComposableAssem.LLJ;
            connectNowBasePage.getClass();
            c13zcLJIIJ.LJJIIJZLJL(123815698);
            ((InterfaceC1690500u5o) c13zcLJIIJ.LJJIL(C20055113dV.LJII)).LJJJJLL(155);
            ((C19EG) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ)).getSupportFragmentManager();
            C1668060tVc.LIZ(c.LJI(c.LJ(interfaceC1685750ty92, 1.0f), 44), false, 0L, 0L, null, C13Z4.LIZJ(2020258153, new AwS633S0100000_19(function02, (Function0<Unit>) 74), c13zcLJIIJ), C13Z4.LIZJ(-164017784, new AwS460S0200000_25(enumC1675160th4, c1687630u1B2, 14), c13zcLJIIJ), C1675180th6.LIZ, c13zcLJIIJ, 14352384, 30);
            c13zcLJIIJ.LJJJJL(false);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS1S0502000_25(enumC1675160th4, (EnumC1675160th4) interfaceC1685750ty92, (InterfaceC1685750ty9) c1687630u1B2, (C1687630u1B) function02, (Function0<Unit>) connectNowBasePage, (ConnectNowBasePage) i, i2, 1);
        }
    }
}
