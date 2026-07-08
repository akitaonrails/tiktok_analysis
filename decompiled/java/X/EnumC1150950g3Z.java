package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0g3Z, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1150950g3Z {
    public static final EnumC1150950g3Z CHECK_BALANCE_AMOUNT;
    public static final EnumC1150950g3Z CHECK_EXCHANGE_THRESHOLD;
    public static final EnumC1150950g3Z EXCHANGE_FAILURE;
    public static final EnumC1150950g3Z HANDLE_AUTO_EXCHANGE;
    public static final EnumC1150950g3Z HANDLE_EXCHANGE_DIALOG;
    public static final /* synthetic */ EnumC1150950g3Z[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1150950g3Z NONE;
    public static final EnumC1150950g3Z START_GIFT_EXCHANGE;

    public static InterfaceC2044707zh<EnumC1150950g3Z> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1150950g3Z enumC1150950g3Z = new EnumC1150950g3Z("START_GIFT_EXCHANGE", 0);
        START_GIFT_EXCHANGE = enumC1150950g3Z;
        EnumC1150950g3Z enumC1150950g3Z2 = new EnumC1150950g3Z("CHECK_BALANCE_AMOUNT", 1);
        CHECK_BALANCE_AMOUNT = enumC1150950g3Z2;
        EnumC1150950g3Z enumC1150950g3Z3 = new EnumC1150950g3Z("CHECK_EXCHANGE_THRESHOLD", 2);
        CHECK_EXCHANGE_THRESHOLD = enumC1150950g3Z3;
        EnumC1150950g3Z enumC1150950g3Z4 = new EnumC1150950g3Z("HANDLE_AUTO_EXCHANGE", 3);
        HANDLE_AUTO_EXCHANGE = enumC1150950g3Z4;
        EnumC1150950g3Z enumC1150950g3Z5 = new EnumC1150950g3Z("HANDLE_EXCHANGE_DIALOG", 4);
        HANDLE_EXCHANGE_DIALOG = enumC1150950g3Z5;
        EnumC1150950g3Z enumC1150950g3Z6 = new EnumC1150950g3Z("EXCHANGE_FAILURE", 5);
        EXCHANGE_FAILURE = enumC1150950g3Z6;
        EnumC1150950g3Z enumC1150950g3Z7 = new EnumC1150950g3Z("NONE", 6);
        NONE = enumC1150950g3Z7;
        EnumC1150950g3Z[] enumC1150950g3ZArr = {enumC1150950g3Z, enumC1150950g3Z2, enumC1150950g3Z3, enumC1150950g3Z4, enumC1150950g3Z5, enumC1150950g3Z6, enumC1150950g3Z7};
        LL = enumC1150950g3ZArr;
        LLILLJJLI = new C2254308sP(enumC1150950g3ZArr);
    }

    public static EnumC1150950g3Z[] values() {
        return (EnumC1150950g3Z[]) LL.clone();
    }

    public static EnumC1150950g3Z valueOf(String str) {
        return (EnumC1150950g3Z) C08FF.LIZ(EnumC1150950g3Z.class, str);
    }

    public EnumC1150950g3Z(String str, int i) {
    }
}
