package X;

import android.graphics.Matrix;
import android.graphics.Typeface;
import androidx.compose.foundation.layout.c;
import com.bytedance.speech.speechengine.SpeechEngineDefines;
import java.util.Map;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AwS0S0953000_20;
import o0.k;

/* JADX INFO: renamed from: X.0tWm, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1668780tWm {
    public static final void LIZIZ(C1294720jnS c1294720jnS, Function0<Float> function0, InterfaceC1685750ty9 interfaceC1685750ty9, boolean z, boolean z2, boolean z3, EnumC1295970jpT enumC1295970jpT, boolean z4, C1296540jqO c1296540jqO, InterfaceC1668050tVb interfaceC1668050tVb, InterfaceC1671600tbK interfaceC1671600tbK, boolean z5, Map<String, ? extends Typeface> map, EnumC1296010jpX enumC1296010jpX, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2, int i3) {
        Map<String, ? extends Typeface> map2 = map;
        boolean z6 = z5;
        InterfaceC1685750ty9 interfaceC1685750ty92 = interfaceC1685750ty9;
        InterfaceC1671600tbK interfaceC1671600tbK2 = interfaceC1671600tbK;
        EnumC1295970jpT enumC1295970jpT2 = enumC1295970jpT;
        C1296540jqO c1296540jqO2 = c1296540jqO;
        InterfaceC1668050tVb interfaceC1668050tVb2 = interfaceC1668050tVb;
        boolean z7 = z4;
        boolean z8 = z2;
        EnumC1296010jpX enumC1296010jpX2 = enumC1296010jpX;
        boolean z9 = z3;
        boolean z10 = z;
        C13ZC c13zcLJIIJ = interfaceC1680500tpg.LJIIJ(-1070242582);
        if ((i3 & 4) != 0) {
            interfaceC1685750ty92 = InterfaceC1685750ty9.LIZ;
        }
        if ((i3 & 8) != 0) {
            z10 = false;
        }
        if ((i3 & 16) != 0) {
            z8 = false;
        }
        if ((i3 & 32) != 0) {
            z9 = false;
        }
        if ((i3 & 64) != 0) {
            enumC1295970jpT2 = EnumC1295970jpT.AUTOMATIC;
        }
        if ((i3 & 128) != 0) {
            z7 = false;
        }
        if ((i3 & 256) != 0) {
            c1296540jqO2 = null;
        }
        if ((i3 & 512) != 0) {
            InterfaceC1668050tVb.LIZ.getClass();
            interfaceC1668050tVb2 = C1668040tVa.LJFF;
        }
        if ((i3 & 1024) != 0) {
            InterfaceC1671600tbK.LIZ.getClass();
            interfaceC1671600tbK2 = C1671610tbL.LIZJ;
        }
        if ((i3 & SpeechEngineDefines.ASR_WORK_MODE_OFFLINE) != 0) {
            z6 = true;
        }
        if ((i3 & SpeechEngineDefines.TTS_WORK_MODE_BOTH) != 0) {
            map2 = null;
        }
        if ((i3 & 8192) != 0) {
            enumC1296010jpX2 = EnumC1296010jpX.AUTOMATIC;
        }
        c13zcLJIIJ.LJJIJIIJIL(-492369756);
        Object objLJJ = c13zcLJIIJ.LJJ();
        InterfaceC1680500tpg.LIZ.getClass();
        C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
        if (objLJJ == c1680520tpi) {
            objLJJ = new C1295950jpR();
            c13zcLJIIJ.LJJIJIIJI(objLJJ);
        }
        c13zcLJIIJ.LJJJJL(false);
        C1295950jpR c1295950jpR = (C1295950jpR) objLJJ;
        c13zcLJIIJ.LJJIJIIJIL(-492369756);
        Object objLJJ2 = c13zcLJIIJ.LJJ();
        if (objLJJ2 == c1680520tpi) {
            objLJJ2 = new Matrix();
            c13zcLJIIJ.LJJIJIIJI(objLJJ2);
        }
        c13zcLJIIJ.LJJJJL(false);
        Matrix matrix = (Matrix) objLJJ2;
        c13zcLJIIJ.LJJIJIIJIL(1157296644);
        boolean zLJJIIJ = c13zcLJIIJ.LJJIIJ(c1294720jnS);
        Object objLJJ3 = c13zcLJIIJ.LJJ();
        if (zLJJIIJ || objLJJ3 == c1680520tpi) {
            objLJJ3 = C20028913Yh.LJI(null);
            c13zcLJIIJ.LJJIJIIJI(objLJJ3);
        }
        c13zcLJIIJ.LJJJJL(false);
        C05P0 c05p0 = (C05P0) objLJJ3;
        c13zcLJIIJ.LJJIJIIJIL(185151773);
        if (c1294720jnS != null && c1294720jnS.LIZIZ() != 0.0f) {
            c13zcLJIIJ.LJJJJL(false);
            float fLIZJ = C1294350jmr.LIZJ();
            C1668170tVn.LIZ(c.LJIILJJIL(interfaceC1685750ty92, c1294720jnS.LJIIIZ.width() / fLIZJ, c1294720jnS.LJIIIZ.height() / fLIZJ), new C1296520jqM(c1294720jnS, interfaceC1671600tbK2, interfaceC1668050tVb2, matrix, c1295950jpR, z9, enumC1295970jpT2, enumC1296010jpX2, map2, c1296540jqO2, z10, z8, z7, z6, function0, c05p0), c13zcLJIIJ, 0);
            C20030013Ys c20030013YsLJJJJZI = c13zcLJIIJ.LJJJJZI();
            if (c20030013YsLJJJJZI != null) {
                c20030013YsLJJJJZI.LIZLLL = new AwS0S0953000_20(c1294720jnS, function0, interfaceC1685750ty92, z10, z8, z9, enumC1295970jpT2, z7, c1296540jqO2, interfaceC1668050tVb2, interfaceC1671600tbK2, z6, map2, enumC1296010jpX2, i, i2, i3, 1);
                return;
            }
            return;
        }
        c13zcLJIIJ.LJJJJL(false);
        C20030013Ys c20030013YsLJJJJZI2 = c13zcLJIIJ.LJJJJZI();
        if (c20030013YsLJJJJZI2 != null) {
            c20030013YsLJJJJZI2.LIZLLL = new AwS0S0953000_20(c1294720jnS, function0, interfaceC1685750ty92, z10, z8, z9, enumC1295970jpT2, z7, c1296540jqO2, interfaceC1668050tVb2, interfaceC1671600tbK2, z6, map2, enumC1296010jpX2, i, i2, i3, 0);
        }
        k.LIZ(interfaceC1685750ty92, c13zcLJIIJ, (i >> 6) & 14);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x00de  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void LIZ(X.C1294720jnS r27, X.InterfaceC1685750ty9 r28, boolean r29, boolean r30, X.AbstractC1670470tZV r31, float r32, int r33, boolean r34, boolean r35, boolean r36, X.EnumC1295970jpT r37, boolean r38, boolean r39, X.C1296540jqO r40, X.InterfaceC1668050tVb r41, X.InterfaceC1671600tbK r42, boolean r43, java.util.Map<java.lang.String, ? extends android.graphics.Typeface> r44, X.EnumC1296010jpX r45, X.InterfaceC1680500tpg r46, int r47, int r48, int r49) {
        /*
            Method dump skipped, instruction units count: 346
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C1668780tWm.LIZ(X.0jnS, X.0ty9, boolean, boolean, X.0tZV, float, int, boolean, boolean, boolean, X.0jpT, boolean, boolean, X.0jqO, X.0tVb, X.0tbK, boolean, java.util.Map, X.0jpX, X.0tpg, int, int, int):void");
    }
}
