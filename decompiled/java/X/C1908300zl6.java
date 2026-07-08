package X;

import kotlin.jvm.internal.AwS40S0001000_28;

/* JADX INFO: renamed from: X.0zl6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class C1908300zl6 {
    public static volatile C1908260zl2 LIZ;

    public static void LIZ(int i) {
        AwS40S0001000_28 awS40S0001000_28 = new AwS40S0001000_28(i, 0);
        C1908260zl2 c1908260zl2 = LIZ;
        if (c1908260zl2 != null) {
            awS40S0001000_28.invoke(c1908260zl2);
        }
    }

    public static void LIZIZ(EnumC1908280zl4 enumC1908280zl4, int i, String str) {
        if (LIZ != null) {
            LIZ = null;
            return;
        }
        LIZ = new C1908260zl2(0);
        C1908270zl3 c1908270zl3 = new C1908270zl3(enumC1908280zl4, i, str);
        C1908260zl2 c1908260zl2 = LIZ;
        if (c1908260zl2 != null) {
            c1908270zl3.invoke(c1908260zl2);
        }
    }
}
