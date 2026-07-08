package X;

import android.content.Context;
import android.provider.Settings;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;

/* JADX INFO: renamed from: X.0taF, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1670930taF {
    public static final InterfaceC1668800tWo LIZ(C1294720jnS c1294720jnS, boolean z, boolean z2, boolean z3, AbstractC1670470tZV abstractC1670470tZV, float f, int i, EnumC1681150tqj enumC1681150tqj, boolean z4, boolean z5, InterfaceC1680500tpg interfaceC1680500tpg, int i2) {
        boolean z6 = z5;
        EnumC1681150tqj enumC1681150tqj2 = enumC1681150tqj;
        int i3 = i;
        boolean z7 = z3;
        AbstractC1670470tZV abstractC1670470tZV2 = abstractC1670470tZV;
        boolean z8 = z2;
        float f2 = f;
        boolean z9 = z;
        interfaceC1680500tpg.LJJIJIIJIL(683659508);
        if ((i2 & 2) != 0) {
            z9 = true;
        }
        if ((i2 & 4) != 0) {
            z8 = true;
        }
        if ((i2 & 8) != 0) {
            z7 = false;
        }
        if ((i2 & 16) != 0) {
            abstractC1670470tZV2 = null;
        }
        if ((i2 & 32) != 0) {
            f2 = 1.0f;
        }
        if ((i2 & 64) != 0) {
            i3 = 1;
        }
        if ((i2 & 128) != 0) {
            enumC1681150tqj2 = EnumC1681150tqj.Immediately;
        }
        if ((i2 & 256) != 0) {
            z4 = false;
        }
        if ((i2 & 512) != 0) {
            z6 = false;
        }
        if (i3 > 0) {
            if (!Float.isInfinite(f2) && !Float.isNaN(f2)) {
                interfaceC1680500tpg.LJJIJIIJIL(2024497114);
                interfaceC1680500tpg.LJJIJIIJIL(-492369756);
                Object objLJJ = interfaceC1680500tpg.LJJ();
                InterfaceC1680500tpg.LIZ.getClass();
                C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
                if (objLJJ == c1680520tpi) {
                    objLJJ = new C1681200tqo();
                    interfaceC1680500tpg.LJJIJIIJI(objLJJ);
                }
                interfaceC1680500tpg.LJJIJLIJ();
                InterfaceC1668800tWo interfaceC1668800tWo = (InterfaceC1668800tWo) objLJJ;
                interfaceC1680500tpg.LJJIJLIJ();
                interfaceC1680500tpg.LJJIJIIJIL(-492369756);
                Object objLJJ2 = interfaceC1680500tpg.LJJ();
                if (objLJJ2 == c1680520tpi) {
                    objLJJ2 = C20028913Yh.LJI(Boolean.valueOf(z9));
                    interfaceC1680500tpg.LJJIJIIJI(objLJJ2);
                }
                interfaceC1680500tpg.LJJIJLIJ();
                C05P0 c05p0 = (C05P0) objLJJ2;
                interfaceC1680500tpg.LJJIJIIJIL(-180606834);
                if (!z4) {
                    f2 /= Settings.Global.getFloat(((Context) interfaceC1680500tpg.LJJIL(AndroidCompositionLocals_androidKt.LIZIZ)).getContentResolver(), "animator_duration_scale", 1.0f);
                }
                interfaceC1680500tpg.LJJIJLIJ();
                C1680540tpk.LJI(new Object[]{c1294720jnS, Boolean.valueOf(z9), abstractC1670470tZV2, Float.valueOf(f2), Integer.valueOf(i3)}, new C1670450tZT(z9, z8, interfaceC1668800tWo, c1294720jnS, i3, z7, f2, abstractC1670470tZV2, enumC1681150tqj2, z6, c05p0, null), interfaceC1680500tpg);
                interfaceC1680500tpg.LJJIJLIJ();
                return interfaceC1668800tWo;
            }
            StringBuilder sbLIZ = C2188811AlT.LIZ();
            sbLIZ.append("Speed must be a finite number. It is ");
            sbLIZ.append(f2);
            sbLIZ.append('.');
            String strLIZIZ = C2188811AlT.LIZIZ(sbLIZ);
            strLIZIZ.toString();
            throw new IllegalArgumentException(strLIZIZ);
        }
        StringBuilder sbLIZ2 = C2188811AlT.LIZ();
        sbLIZ2.append("Iterations must be a positive number (");
        sbLIZ2.append(i3);
        sbLIZ2.append(").");
        String strLIZIZ2 = C2188811AlT.LIZIZ(sbLIZ2);
        strLIZIZ2.toString();
        throw new IllegalArgumentException(strLIZIZ2);
    }
}
