package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DDb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC335450DDb {
    public static final EnumC335450DDb CHECKOUT;
    public static final EnumC335450DDb FEED_ADS;
    public static final EnumC335450DDb INBOX;
    public static final /* synthetic */ EnumC335450DDb[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC335450DDb ONE_STEP_CHECKOUT;
    public static final EnumC335450DDb ORDER;
    public static final EnumC335450DDb ORDER_DETAIL;
    public static final EnumC335450DDb PDP;
    public static final EnumC335450DDb SHOP;
    public static final EnumC335450DDb THANK_YOU;
    public final int LL;

    public static InterfaceC2044707zh<EnumC335450DDb> getEntries() {
        return LLILLL;
    }

    static {
        EnumC335450DDb enumC335450DDb = new EnumC335450DDb("FEED_ADS", 0, 1);
        FEED_ADS = enumC335450DDb;
        EnumC335450DDb enumC335450DDb2 = new EnumC335450DDb("PDP", 1, 2);
        PDP = enumC335450DDb2;
        EnumC335450DDb enumC335450DDb3 = new EnumC335450DDb("CHECKOUT", 2, 3);
        CHECKOUT = enumC335450DDb3;
        EnumC335450DDb enumC335450DDb4 = new EnumC335450DDb("THANK_YOU", 3, 4);
        THANK_YOU = enumC335450DDb4;
        EnumC335450DDb enumC335450DDb5 = new EnumC335450DDb("INBOX", 4, 5);
        INBOX = enumC335450DDb5;
        EnumC335450DDb enumC335450DDb6 = new EnumC335450DDb("ORDER", 5, 6);
        ORDER = enumC335450DDb6;
        EnumC335450DDb enumC335450DDb7 = new EnumC335450DDb("ORDER_DETAIL", 6, 7);
        ORDER_DETAIL = enumC335450DDb7;
        EnumC335450DDb enumC335450DDb8 = new EnumC335450DDb("SHOP", 7, 8);
        SHOP = enumC335450DDb8;
        EnumC335450DDb enumC335450DDb9 = new EnumC335450DDb("ONE_STEP_CHECKOUT", 8, 9);
        ONE_STEP_CHECKOUT = enumC335450DDb9;
        EnumC335450DDb[] enumC335450DDbArr = {enumC335450DDb, enumC335450DDb2, enumC335450DDb3, enumC335450DDb4, enumC335450DDb5, enumC335450DDb6, enumC335450DDb7, enumC335450DDb8, enumC335450DDb9};
        LLILLJJLI = enumC335450DDbArr;
        LLILLL = new C2254308sP(enumC335450DDbArr);
    }

    public static EnumC335450DDb[] values() {
        return (EnumC335450DDb[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC335450DDb valueOf(String str) {
        return (EnumC335450DDb) C08FF.LIZ(EnumC335450DDb.class, str);
    }

    public EnumC335450DDb(String str, int i, int i2) {
        this.LL = i2;
    }
}
