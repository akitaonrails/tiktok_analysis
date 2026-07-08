package X;

import java.util.Arrays;

/* JADX INFO: renamed from: X.0uxa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1723840uxa {
    public static C1723850uxb LIZ(C1723850uxb c1723850uxb, String str, InterfaceC1722230uuz interfaceC1722230uuz, int i) {
        int[] iArr;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        long j;
        InterfaceC1722230uuz interfaceC1722230uuz2 = interfaceC1722230uuz;
        String str2 = str;
        EnumC1715580ukG enumC1715580ukG = null;
        if ((i & 1) != 0) {
            iArr = c1723850uxb.LIZ;
        } else {
            iArr = null;
        }
        boolean z5 = false;
        if ((i & 2) != 0) {
            z = c1723850uxb.LIZIZ;
        } else {
            z = false;
        }
        if ((i & 4) != 0) {
            z2 = c1723850uxb.LIZJ;
        } else {
            z2 = false;
        }
        if ((i & 8) != 0) {
            z3 = c1723850uxb.LIZLLL;
        } else {
            z3 = false;
        }
        if ((i & 16) != 0) {
            z4 = c1723850uxb.LJ;
        } else {
            z4 = false;
        }
        if ((i & 32) != 0) {
            z5 = c1723850uxb.LJFF;
        }
        if ((i & 64) != 0) {
            j = c1723850uxb.LJI;
        } else {
            j = 0;
        }
        if ((i & 128) != 0) {
            enumC1715580ukG = c1723850uxb.LJII;
        }
        if ((i & 256) != 0) {
            str2 = c1723850uxb.LJIIIIZZ;
        }
        if ((i & 512) != 0) {
            interfaceC1722230uuz2 = c1723850uxb.LJIIIZ;
        }
        return new C1723850uxb(Arrays.copyOf(iArr, iArr.length), z, z2, z3, z4, z5, j, enumC1715580ukG, str2, interfaceC1722230uuz2);
    }
}
