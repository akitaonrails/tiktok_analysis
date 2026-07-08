package X;

/* JADX INFO: renamed from: X.10on, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19360710on {
    public static final EnumC19360410ok LIZ(Integer num) {
        EnumC19360410ok enumC19360410ok = EnumC19360410ok.SCORE;
        int type = enumC19360410ok.getType();
        if (num != null && num.intValue() == type) {
            return enumC19360410ok;
        }
        EnumC19360410ok enumC19360410ok2 = EnumC19360410ok.TIME_SECOND;
        int type2 = enumC19360410ok2.getType();
        if (num != null && num.intValue() == type2) {
            return enumC19360410ok2;
        }
        return null;
    }

    public static final EnumC19360610om LIZIZ(EnumC19361210os enumC19361210os) {
        int i = C19360810oo.LIZIZ[enumC19361210os.ordinal()];
        if (i != 1) {
            if (i != 2) {
                if (i == 3) {
                    return null;
                }
                throw new C1954807lC();
            }
            return EnumC19360610om.ASCENDING;
        }
        return EnumC19360610om.DESCENDING;
    }
}
