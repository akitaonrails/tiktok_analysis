package X;

import kotlin.text.a0;

/* JADX INFO: renamed from: X.0wZc, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class C1785860wZc {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [X.0wZn, java.lang.Integer] */
    /* JADX WARN: Type inference failed for: r4v7 */
    public static C1785870wZd LIZ(EnumC1785890wZf enumC1785890wZf, String str, boolean z) {
        C1785870wZd c1785870wZd;
        C1785870wZd c1785870wZd2;
        InterfaceC1785930wZj interfaceC1785930wZj;
        int i;
        InterfaceC1785930wZj c1556350qbR;
        Integer num;
        int[] iArr = C1785880wZe.LIZ;
        int i2 = 14;
        Integer num2 = 0;
        Integer num3 = null;
        switch (iArr[enumC1785890wZf.ordinal()]) {
            case 1:
            case 2:
                c1785870wZd = new C1785870wZd(enumC1785890wZf, (C1785970wZn) num2, (Integer) num2, i2);
                break;
            case 3:
                c1785870wZd = new C1785870wZd(enumC1785890wZf, (C1785970wZn) num2, (Integer) 2131855572, 10);
                break;
            case 4:
                c1785870wZd = new C1785870wZd(enumC1785890wZf, (C1785970wZn) num2, (Integer) num2, i2);
                break;
            case 5:
            case 6:
                c1785870wZd = new C1785870wZd(enumC1785890wZf, C1785970wZn.LIZ, (Integer) num2, 12);
                break;
            default:
                throw new C1954807lC();
        }
        switch (iArr[enumC1785890wZf.ordinal()]) {
            case 1:
            case 2:
            case 5:
            case 6:
                c1785870wZd2 = new C1785870wZd(enumC1785890wZf, (C1785970wZn) num2, (Integer) num2, i2);
                break;
            case 3:
                boolean z2 = true;
                if (str == null || !(!a0.LJJJIL(str))) {
                    str = null;
                }
                if (!z || str == null) {
                    z2 = false;
                }
                if (z2) {
                    if (str == null) {
                        str = "";
                    }
                    c1556350qbR = new C1556350qbR(str);
                } else {
                    c1556350qbR = C1785950wZl.LIZ;
                }
                if (z) {
                    num = 2131855543;
                } else {
                    num = null;
                }
                if (z2) {
                    num3 = 2131855542;
                }
                c1785870wZd2 = new C1785870wZd(enumC1785890wZf, c1556350qbR, num, num3);
                break;
            case 4:
                if (z) {
                    interfaceC1785930wZj = C1785960wZm.LIZ;
                    i = 2131855596;
                } else {
                    interfaceC1785930wZj = C1785950wZl.LIZ;
                    i = 2131855608;
                }
                Integer numValueOf = Integer.valueOf(i);
                if (z) {
                    num2 = 2131851312;
                }
                c1785870wZd2 = new C1785870wZd(enumC1785890wZf, interfaceC1785930wZj, numValueOf, num2);
                break;
            default:
                throw new C1954807lC();
        }
        InterfaceC1785930wZj interfaceC1785930wZj2 = c1785870wZd2.LIZIZ;
        Integer num4 = c1785870wZd2.LIZJ;
        if (num4 == null) {
            num4 = c1785870wZd.LIZJ;
        }
        Integer num5 = c1785870wZd2.LIZLLL;
        if (num5 == null) {
            num5 = c1785870wZd.LIZLLL;
        }
        return new C1785870wZd(c1785870wZd.LIZ, interfaceC1785930wZj2, num4, num5);
    }
}
