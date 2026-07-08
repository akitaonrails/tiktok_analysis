package X;

/* JADX INFO: renamed from: X.11lE, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes30.dex */
public final class C19593411lE {
    public static EnumC19593011lA LIZ(Integer num) {
        for (EnumC19593011lA enumC19593011lA : EnumC19593011lA.values()) {
            int value = enumC19593011lA.getValue();
            if (num != null && value == num.intValue()) {
                return enumC19593011lA;
            }
        }
        return EnumC19593011lA.ATTRIBUTION_LINK_MEDIA_SIZE_NORMAL;
    }
}
