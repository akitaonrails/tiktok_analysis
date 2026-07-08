package X;

/* JADX INFO: renamed from: X.0kka, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public enum EnumC1331380kka {
    LOW,
    MEDIUM,
    HIGH,
    IMMEDIATE;

    public static int getIntPriorityValue(EnumC1331380kka enumC1331380kka) {
        int i = C1331390kkb.LIZ[enumC1331380kka.ordinal()];
        if (i != 1) {
            if (i != 3) {
                if (i != 4) {
                    return 1;
                }
                return 3;
            }
            return 2;
        }
        return 0;
    }

    public static EnumC1331380kka getHigherPriority(EnumC1331380kka enumC1331380kka, EnumC1331380kka enumC1331380kka2) {
        if (enumC1331380kka == null) {
            return enumC1331380kka2;
        }
        if (enumC1331380kka2 == null || enumC1331380kka.ordinal() > enumC1331380kka2.ordinal()) {
            return enumC1331380kka;
        }
        return enumC1331380kka2;
    }

    public static EnumC1331380kka getLowerPriority(EnumC1331380kka enumC1331380kka, EnumC1331380kka enumC1331380kka2) {
        if (enumC1331380kka == null) {
            return enumC1331380kka2;
        }
        if (enumC1331380kka2 == null || enumC1331380kka.ordinal() < enumC1331380kka2.ordinal()) {
            return enumC1331380kka;
        }
        return enumC1331380kka2;
    }
}
