package X;

/* JADX INFO: renamed from: X.0Zyg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class C917280Zyg {
    public static final /* synthetic */ int LIZ = 0;

    public static EnumC918830a1B LIZIZ(boolean z) {
        if (z) {
            return EnumC918830a1B.CAN_APPLY;
        }
        return EnumC918830a1B.CANNOT_APPLY;
    }

    public static EnumC918830a1B LIZ(int i, int i2, Integer num) {
        boolean z = false;
        if (num != null && num.intValue() != -1) {
            if (num.intValue() == 0) {
                return EnumC918830a1B.CANNOT_APPLY;
            }
            if (num.intValue() == 1) {
                if (!C925150aBN.LJJII(i2) && i2 != 1) {
                    z = true;
                }
                return LIZIZ(z);
            }
            if (num.intValue() == 2) {
                if (!C925150aBN.LJJII(i2) && i2 != 3 && i2 != 2) {
                    z = true;
                }
                return LIZIZ(z);
            }
            if (num.intValue() == 3) {
                return LIZIZ(!C925150aBN.LJJII(i2));
            }
            if (num.intValue() == 4) {
                return LIZIZ(C925150aBN.LJJII(i2));
            }
            if (num.intValue() == 5) {
                boolean z2 = C925150aBN.LIZ;
                if (i2 == 1) {
                    z = true;
                }
                return LIZIZ(!z);
            }
            if (num.intValue() != 6 && num.intValue() != 7) {
                return EnumC918830a1B.CAN_APPLY;
            }
            return EnumC918830a1B.CAN_APPLY;
        }
        if (i != 3) {
            z = true;
        }
        return LIZIZ(z);
    }
}
