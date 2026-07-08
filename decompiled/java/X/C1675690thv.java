package X;

import h0.n2;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AwS153S0400000_25;
import kotlin.jvm.internal.AwS391S0200000_25;

/* JADX INFO: renamed from: X.0thv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes26.dex */
public final class C1675690thv {
    public static final C1677780tlI LIZJ(int i, InterfaceC1680500tpg interfaceC1680500tpg, String str) {
        Object objLJJ = interfaceC1680500tpg.LJJ();
        InterfaceC1680500tpg.LIZ.getClass();
        if (objLJJ == C1680510tph.LIZIZ) {
            objLJJ = new C1677780tlI();
            interfaceC1680500tpg.LJJIJIIJI(objLJJ);
        }
        C1677780tlI c1677780tlI = (C1677780tlI) objLJJ;
        c1677780tlI.LIZ(interfaceC1680500tpg, 0);
        return c1677780tlI;
    }

    public static final C1677800tlK LIZ(C1677780tlI c1677780tlI, float f, float f2, C1677040tk6 c1677040tk6, String str, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        String str2 = str;
        if ((i2 & 8) != 0) {
            str2 = "FloatAnimation";
        }
        int i3 = i << 3;
        return LIZIZ(c1677780tlI, Float.valueOf(f), Float.valueOf(f2), n2.LIZ, c1677040tk6, str2, interfaceC1680500tpg, (i & 14) | (i & 112) | (i & 896) | (57344 & i3) | (i3 & 458752), 0);
    }

    public static final C1677800tlK LIZIZ(C1677780tlI c1677780tlI, Object obj, Object obj2, InterfaceC1677290tkV interfaceC1677290tkV, C1677040tk6 c1677040tk6, String str, InterfaceC1680500tpg interfaceC1680500tpg, int i, int i2) {
        boolean z;
        boolean z2;
        Object objLJJ = interfaceC1680500tpg.LJJ();
        InterfaceC1680500tpg.LIZ.getClass();
        C1680520tpi c1680520tpi = C1680510tph.LIZIZ;
        if (objLJJ == c1680520tpi) {
            objLJJ = new C1677800tlK(c1677780tlI, obj, obj2, interfaceC1677290tkV, c1677040tk6);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ);
        }
        C1677800tlK c1677800tlK = (C1677800tlK) objLJJ;
        boolean z3 = true;
        if ((((i & 112) ^ 48) <= 32 || !interfaceC1680500tpg.LJII(obj)) && (i & 48) != 32) {
            z = false;
        } else {
            z = true;
        }
        if ((((i & 896) ^ 384) <= 256 || !interfaceC1680500tpg.LJII(obj2)) && (i & 384) != 256) {
            z2 = false;
        } else {
            z2 = true;
        }
        boolean z4 = z | z2;
        if ((((57344 & i) ^ 24576) <= 16384 || !interfaceC1680500tpg.LJII(c1677040tk6)) && (i & 24576) != 16384) {
            z3 = false;
        }
        boolean z5 = z4 | z3;
        Object objLJJ2 = interfaceC1680500tpg.LJJ();
        if (z5 || objLJJ2 == c1680520tpi) {
            objLJJ2 = new AwS153S0400000_25(obj, c1677800tlK, (C1677800tlK<Object, Object>) obj2, c1677040tk6, (C1677040tk6<Object>) 7);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ2);
        }
        C1680540tpk.LJII((Function0) objLJJ2, interfaceC1680500tpg);
        boolean zLJII = interfaceC1680500tpg.LJII(c1677780tlI);
        Object objLJJ3 = interfaceC1680500tpg.LJJ();
        if (zLJII || objLJJ3 == c1680520tpi) {
            objLJJ3 = new AwS391S0200000_25(c1677780tlI, (C1677780tlI) c1677800tlK, (C1677800tlK<Object, Object>) 196);
            interfaceC1680500tpg.LJJIJIIJI(objLJJ3);
        }
        C1680540tpk.LIZIZ(c1677800tlK, (Function1) objLJJ3, interfaceC1680500tpg);
        return c1677800tlK;
    }
}
