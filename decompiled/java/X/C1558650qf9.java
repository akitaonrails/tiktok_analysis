package X;

import kotlin.jvm.functions.Function1;

/* JADX INFO: renamed from: X.0qf9, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class C1558650qf9 {
    public static C1562980qm8 LIZ(String str, Enum r10, int i, String str2, Function1 function1) {
        return new C1562980qm8(str, r10, new C1556520qbi(i), new C1555960qao(str2), EnumC1562950qm5.DEBUG, new C1579030rC1(), false, function1);
    }

    public static C1562980qm8 LIZJ(String str, Enum r10, int i, int i2, Function1 function1) {
        return new C1562980qm8(str, r10, new C1556520qbi(i), new C1556510qbh(i2), EnumC1562950qm5.RED, new C1579030rC1(), false, function1);
    }

    public static C1562980qm8 LIZIZ(String str, Enum r11, Integer num, int i, boolean z, Function1 function1, int i2) {
        C1579030rC1 c1579030rC1;
        InterfaceC1557220qcq c1556520qbi;
        boolean z2 = z;
        if ((i2 & 16) != 0) {
            c1579030rC1 = new C1579030rC1();
        } else {
            c1579030rC1 = null;
        }
        if ((i2 & 32) != 0) {
            z2 = false;
        }
        if (num == null) {
            c1556520qbi = C1557230qcr.LIZ;
        } else {
            c1556520qbi = new C1556520qbi(num.intValue());
        }
        return new C1562980qm8(str, r11, c1556520qbi, new C1556510qbh(i), EnumC1562950qm5.PRIMARY, c1579030rC1, z2, function1);
    }
}
