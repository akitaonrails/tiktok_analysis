package X;

/* JADX INFO: renamed from: X.0vJK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class C1737320vJK {
    public static EnumC1737340vJM LIZ(Integer num) {
        for (EnumC1737340vJM enumC1737340vJM : EnumC1737340vJM.values()) {
            int intValue = enumC1737340vJM.getIntValue();
            if (num != null && intValue == num.intValue()) {
                return enumC1737340vJM;
            }
        }
        return EnumC1737340vJM.NOT_SET;
    }
}
