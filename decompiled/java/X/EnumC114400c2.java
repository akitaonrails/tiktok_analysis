package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00c2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC114400c2 {
    public static final EnumC114400c2 COUPON_DEDUCTED;
    public static final EnumC114400c2 EXCLAMATION_MARK_CIRCLE;
    public static final EnumC114400c2 ICON_TYPE_BALANCE_REFUND;
    public static final EnumC114400c2 ICON_TYPE_EXCLAMATION_MARK_TRIANGLE_FILL;
    public static final EnumC114400c2 ICON_TYPE_INFO_CIRCLE;
    public static final EnumC114400c2 ICON_TYPE_LIGHTING_SHIELD;
    public static final EnumC114400c2 ICON_TYPE_MONEY_FILL;
    public static final EnumC114400c2 ICON_TYPE_UNKNOWN;
    public static final EnumC114400c2 ICON_TYPE_UTURN_LEFT_FILL;
    public static final /* synthetic */ EnumC114400c2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC114400c2> getEntries() {
        return LLILLL;
    }

    static {
        EnumC114400c2 enumC114400c2 = new EnumC114400c2("ICON_TYPE_UNKNOWN", 0, 0);
        ICON_TYPE_UNKNOWN = enumC114400c2;
        EnumC114400c2 enumC114400c22 = new EnumC114400c2("ICON_TYPE_INFO_CIRCLE", 1, 1);
        ICON_TYPE_INFO_CIRCLE = enumC114400c22;
        EnumC114400c2 enumC114400c23 = new EnumC114400c2("ICON_TYPE_UTURN_LEFT_FILL", 2, 2);
        ICON_TYPE_UTURN_LEFT_FILL = enumC114400c23;
        EnumC114400c2 enumC114400c24 = new EnumC114400c2("ICON_TYPE_BALANCE_REFUND", 3, 3);
        ICON_TYPE_BALANCE_REFUND = enumC114400c24;
        EnumC114400c2 enumC114400c25 = new EnumC114400c2("ICON_TYPE_EXCLAMATION_MARK_TRIANGLE_FILL", 4, 4);
        ICON_TYPE_EXCLAMATION_MARK_TRIANGLE_FILL = enumC114400c25;
        EnumC114400c2 enumC114400c26 = new EnumC114400c2("ICON_TYPE_MONEY_FILL", 5, 5);
        ICON_TYPE_MONEY_FILL = enumC114400c26;
        EnumC114400c2 enumC114400c27 = new EnumC114400c2("ICON_TYPE_LIGHTING_SHIELD", 6, 6);
        ICON_TYPE_LIGHTING_SHIELD = enumC114400c27;
        EnumC114400c2 enumC114400c28 = new EnumC114400c2("COUPON_DEDUCTED", 7, 7);
        COUPON_DEDUCTED = enumC114400c28;
        EnumC114400c2 enumC114400c29 = new EnumC114400c2("EXCLAMATION_MARK_CIRCLE", 8, 8);
        EXCLAMATION_MARK_CIRCLE = enumC114400c29;
        EnumC114400c2[] enumC114400c2Arr = {enumC114400c2, enumC114400c22, enumC114400c23, enumC114400c24, enumC114400c25, enumC114400c26, enumC114400c27, enumC114400c28, enumC114400c29};
        LLILLJJLI = enumC114400c2Arr;
        LLILLL = new C2254308sP(enumC114400c2Arr);
    }

    public static EnumC114400c2[] values() {
        return (EnumC114400c2[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC114400c2 valueOf(String str) {
        return (EnumC114400c2) C08FF.LIZ(EnumC114400c2.class, str);
    }

    public EnumC114400c2(String str, int i, int i2) {
        this.LL = i2;
    }
}
