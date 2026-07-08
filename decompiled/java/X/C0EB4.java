package X;

/* JADX INFO: renamed from: X.0EB4, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EB4 {
    public static void LIZIZ(InterfaceC360800ECo interfaceC360800ECo, EnumC373450EkZ[] enumC373450EkZArr, Integer num, Boolean bool, Float f, Float f2, int i) {
        float f3;
        Float fValueOf = f;
        Boolean bool2 = bool;
        Integer num2 = num;
        Float f4 = null;
        if ((i & 2) != 0) {
            num2 = null;
        }
        if ((i & 4) != 0) {
            bool2 = null;
        }
        if ((i & 8) != 0) {
            if (bool2 != null) {
                if (bool2.booleanValue()) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.34f;
                }
                fValueOf = Float.valueOf(f3);
            } else {
                fValueOf = null;
            }
        }
        if ((i & 16) == 0) {
            f4 = f2;
        }
        interfaceC360800ECo.DI2(enumC373450EkZArr, num2, bool2, fValueOf, f4);
    }
}
