package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fcl, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1134330fcl {
    public static final EnumC1134330fcl CANNOT_SHOW_CONSUMPTION_PANEL_FROM_BALANCE;
    public static final EnumC1134330fcl COIN_CASH_TASK_CONFLICT;
    public static final EnumC1134330fcl CURRENCY_CODE_INVALID;
    public static final /* synthetic */ EnumC1134330fcl[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1134330fcl LOCAL_CURRENCY_GIFT_PRICE_GAP;
    public static final EnumC1134330fcl NO_CASH_CONSUMPTION_TASK;
    public static final EnumC1134330fcl NO_FROZEN_COINS_TASK;
    public static final EnumC1134330fcl NO_RECHARGE_TASK;
    public static final EnumC1134330fcl TP_GIFT_NOT_FOUND;
    public static final EnumC1134330fcl TP_VERSION_UNMATCHED;
    public static final EnumC1134330fcl WALLET_IAP_ID_CONVERSION_FAIL;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1134330fcl> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1134330fcl enumC1134330fcl = new EnumC1134330fcl("NO_RECHARGE_TASK", 0, 1001, "no recharge task");
        NO_RECHARGE_TASK = enumC1134330fcl;
        EnumC1134330fcl enumC1134330fcl2 = new EnumC1134330fcl("NO_CASH_CONSUMPTION_TASK", 1, 1002, "no cash consumption task");
        NO_CASH_CONSUMPTION_TASK = enumC1134330fcl2;
        EnumC1134330fcl enumC1134330fcl3 = new EnumC1134330fcl("NO_FROZEN_COINS_TASK", 2, 1003, "no frozen coins task");
        NO_FROZEN_COINS_TASK = enumC1134330fcl3;
        EnumC1134330fcl enumC1134330fcl4 = new EnumC1134330fcl("COIN_CASH_TASK_CONFLICT", 3, 1004, "coin_cash_task_conflict");
        COIN_CASH_TASK_CONFLICT = enumC1134330fcl4;
        EnumC1134330fcl enumC1134330fcl5 = new EnumC1134330fcl("LOCAL_CURRENCY_GIFT_PRICE_GAP", 4, 1005, "local currency gift price gap");
        LOCAL_CURRENCY_GIFT_PRICE_GAP = enumC1134330fcl5;
        EnumC1134330fcl enumC1134330fcl6 = new EnumC1134330fcl("CURRENCY_CODE_INVALID", 5, 1006, "local currency code invalid");
        CURRENCY_CODE_INVALID = enumC1134330fcl6;
        EnumC1134330fcl enumC1134330fcl7 = new EnumC1134330fcl("CANNOT_SHOW_CONSUMPTION_PANEL_FROM_BALANCE", 6, 1007, "cannot show consumption panel from balance");
        CANNOT_SHOW_CONSUMPTION_PANEL_FROM_BALANCE = enumC1134330fcl7;
        EnumC1134330fcl enumC1134330fcl8 = new EnumC1134330fcl("TP_VERSION_UNMATCHED", 7, 1200, "touch point version unmatched");
        TP_VERSION_UNMATCHED = enumC1134330fcl8;
        EnumC1134330fcl enumC1134330fcl9 = new EnumC1134330fcl("TP_GIFT_NOT_FOUND", 8, 1201, "gift not found");
        TP_GIFT_NOT_FOUND = enumC1134330fcl9;
        EnumC1134330fcl enumC1134330fcl10 = new EnumC1134330fcl("WALLET_IAP_ID_CONVERSION_FAIL", 9, 2001, "iap conversion exception");
        WALLET_IAP_ID_CONVERSION_FAIL = enumC1134330fcl10;
        EnumC1134330fcl[] enumC1134330fclArr = {enumC1134330fcl, enumC1134330fcl2, enumC1134330fcl3, enumC1134330fcl4, enumC1134330fcl5, enumC1134330fcl6, enumC1134330fcl7, enumC1134330fcl8, enumC1134330fcl9, enumC1134330fcl10};
        LLILLL = enumC1134330fclArr;
        LLILZ = new C2254308sP(enumC1134330fclArr);
    }

    public static EnumC1134330fcl[] values() {
        return (EnumC1134330fcl[]) LLILLL.clone();
    }

    public final int getErrorCode() {
        return this.LL;
    }

    public final String getErrorMsg() {
        return this.LLILLJJLI;
    }

    public static EnumC1134330fcl valueOf(String str) {
        return (EnumC1134330fcl) C08FF.LIZ(EnumC1134330fcl.class, str);
    }

    public EnumC1134330fcl(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
