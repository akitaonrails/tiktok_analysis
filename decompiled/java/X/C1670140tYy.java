package X;

import android.content.Context;
import android.widget.TextView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import com.zhiliaoapp.musically.R;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AwS30S0600000_9;
import kotlin.jvm.internal.AwS4S0402000_9;

/* JADX INFO: renamed from: X.0tYy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1670140tYy {
    public static final TextView LIZJ(C05P0<TextView> c05p0) {
        return c05p0.getValue();
    }

    public static final void LIZIZ(InterfaceC636240OxS<?> interfaceC636240OxS, C1690050u55 c1690050u55, InterfaceC1685750ty9 interfaceC1685750ty9, Function0<Unit> function0, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        boolean z;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-353282467);
        if ((i2 & 1) != 0) {
            i3 = i | 6;
        } else if ((i & 6) == 0) {
            if (c13zcLJIIJ.LJII(interfaceC636240OxS)) {
                i4 = 4;
            } else {
                i4 = 2;
            }
            i3 = i4 | i;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            if (c13zcLJIIJ.LJJIIJ(c1690050u55)) {
                i5 = 32;
            } else {
                i5 = 16;
            }
            i3 |= i5;
        }
        int i8 = i2 & 4;
        if (i8 != 0) {
            i3 |= 384;
        } else if ((i & 384) == 0) {
            if (c13zcLJIIJ.LJJIIJ(interfaceC1685750ty92)) {
                i6 = 256;
            } else {
                i6 = 128;
            }
            i3 |= i6;
        }
        Function0<Unit> function02 = function0;
        if ((i2 & 8) != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            if (c13zcLJIIJ.LJII(function02)) {
                i7 = SpeechEngineDefines.ASR_WORK_MODE_OFFLINE;
            } else {
                i7 = 1024;
            }
            i3 |= i7;
        }
        if ((i3 & 1171) == 1170 && c13zcLJIIJ.LIZ()) {
            c13zcLJIIJ.LIZJ();
        } else {
            if (i8 != 0) {
                interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
            }
            Context context = (Context) c13zcLJIIJ.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ = c13zcLJIIJ.LJJ();
            InterfaceC1680500tpg.LIZ.getClass();
            C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
            if (objLJJ == c1680520tpi) {
                objLJJ = C20028913Yh.LJI(null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ);
            }
            C05P0 c05p0 = (C05P0) objLJJ;
            c13zcLJIIJ.LJJJJL(false);
            Boolean bool = Boolean.TRUE;
            c13zcLJIIJ.LJJIIJZLJL(-1633490746);
            boolean z2 = true;
            if ((i3 & 112) == 32) {
                z = true;
            } else {
                z = false;
            }
            Object objLJJ2 = c13zcLJIIJ.LJJ();
            if (z || objLJJ2 == c1680520tpi) {
                objLJJ2 = new C636420Oxk(c1690050u55, c05p0, null);
                c13zcLJIIJ.LJJIJIIJI(objLJJ2);
            }
            c13zcLJIIJ.LJJJJL(false);
            C1680540tpk.LJFF(bool, (Function2) objLJJ2, c13zcLJIIJ);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ3 = c13zcLJIIJ.LJJ();
            if (objLJJ3 == c1680520tpi) {
                objLJJ3 = C20028913Yh.LJI(C786410Ut5.Sd(R.layout.i9x, C786410Ut5.ne(context), null));
                c13zcLJIIJ.LJJIJIIJI(objLJJ3);
            }
            C05P0 c05p02 = (C05P0) objLJJ3;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ4 = c13zcLJIIJ.LJJ();
            if (objLJJ4 == c1680520tpi) {
                objLJJ4 = C20028913Yh.LJI(new C1390410mHn(context, null, 6));
                c13zcLJIIJ.LJJIJIIJI(objLJJ4);
            }
            C05P0 c05p03 = (C05P0) objLJJ4;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(1849434622);
            Object objLJJ5 = c13zcLJIIJ.LJJ();
            if (objLJJ5 == c1680520tpi) {
                objLJJ5 = C636430Oxl.LLIZ;
                c13zcLJIIJ.LJJIJIIJI(objLJJ5);
            }
            Function1 function1 = (Function1) objLJJ5;
            c13zcLJIIJ.LJJJJL(false);
            c13zcLJIIJ.LJJIIJZLJL(-1224400529);
            boolean zLJII = c13zcLJIIJ.LJII(context);
            if ((i3 & 7168) != 2048) {
                z2 = false;
            }
            boolean zLJII2 = zLJII | z2 | c13zcLJIIJ.LJII(interfaceC636240OxS);
            Object objLJJ6 = c13zcLJIIJ.LJJ();
            if (zLJII2 || objLJJ6 == c1680520tpi) {
                function02 = function02;
                objLJJ6 = new AwS30S0600000_9(context, (Context) function02, (Function0<Unit>) interfaceC636240OxS, (InterfaceC636240OxS<?>) c05p0, (C05P0<C636350Oxd>) c05p02, (C05P0<TextView>) c05p03, (C05P0<C1390410mHn>) 2);
                c13zcLJIIJ.LJJIJIIJI(objLJJ6);
            }
            c13zcLJIIJ.LJJJJL(false);
            C20084413iE.LIZ(((i3 >> 3) & 112) | 6, 0, c13zcLJIIJ, interfaceC1685750ty92, function1, (Function1) objLJJ6);
        }
        C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI != null) {
            c20030013YsLJJJJZI.LIZLLL = new AwS4S0402000_9((InterfaceC636240OxS) interfaceC636240OxS, (InterfaceC636240OxS<?>) c1690050u55, (C1690050u55) interfaceC1685750ty92, (InterfaceC1685750ty9) function02, (Function0<Unit>) i, i2, 1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0345  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.C12823050b r45, boolean r46, kotlin.jvm.functions.Function0<kotlin.Unit> r47, X.InterfaceC1685750ty9 r48, kotlin.jvm.functions.Function0<kotlin.Unit> r49, X.InterfaceC1680500tpg r50, int r51, int r52) {
        /*
            Method dump skipped, instruction units count: 1018
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1670140tYy.LIZ(X.050b, boolean, kotlin.jvm.functions.Function0, X.0ty9, kotlin.jvm.functions.Function0, X.0tpg, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:47:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0100  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x026b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZLLL(com.ss.android.ugc.aweme.viewmodel.MentionFavoriteVideoVM r36, com.ss.android.ugc.aweme.viewmodel.MentionVideoShareModel r37, kotlin.jvm.functions.Function0<kotlin.Unit> r38, kotlin.jvm.functions.Function0<kotlin.Unit> r39, X.InterfaceC1685750ty9 r40, kotlin.jvm.functions.Function0<kotlin.Unit> r41, X.InterfaceC1680500tpg r42, int r43, int r44) {
        /*
            Method dump skipped, instruction units count: 953
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1670140tYy.LIZLLL(com.ss.android.ugc.aweme.viewmodel.MentionFavoriteVideoVM, com.ss.android.ugc.aweme.viewmodel.MentionVideoShareModel, kotlin.jvm.functions.Function0, kotlin.jvm.functions.Function0, X.0ty9, kotlin.jvm.functions.Function0, X.0tpg, int, int):void");
    }
}
