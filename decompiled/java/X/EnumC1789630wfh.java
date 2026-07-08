package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wfh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1789630wfh {
    public static final EnumC1789630wfh APP_ACCOUNT_MISMATCH;
    public static final EnumC1789630wfh FAILURE;
    public static final /* synthetic */ EnumC1789630wfh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1789630wfh PAYMENT_METHOD_MISMATCH;
    public static final EnumC1789630wfh STORE_ACCOUNT_MISMATCH;
    public static final EnumC1789630wfh SUCCESS;
    public static final EnumC1789630wfh UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1789630wfh> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1789630wfh enumC1789630wfh = new EnumC1789630wfh("UNKNOWN", 0, -1);
        UNKNOWN = enumC1789630wfh;
        EnumC1789630wfh enumC1789630wfh2 = new EnumC1789630wfh("SUCCESS", 1, 0);
        SUCCESS = enumC1789630wfh2;
        EnumC1789630wfh enumC1789630wfh3 = new EnumC1789630wfh("FAILURE", 2, 1);
        FAILURE = enumC1789630wfh3;
        EnumC1789630wfh enumC1789630wfh4 = new EnumC1789630wfh("APP_ACCOUNT_MISMATCH", 3, 2);
        APP_ACCOUNT_MISMATCH = enumC1789630wfh4;
        EnumC1789630wfh enumC1789630wfh5 = new EnumC1789630wfh("STORE_ACCOUNT_MISMATCH", 4, 3);
        STORE_ACCOUNT_MISMATCH = enumC1789630wfh5;
        EnumC1789630wfh enumC1789630wfh6 = new EnumC1789630wfh("PAYMENT_METHOD_MISMATCH", 5, 4);
        PAYMENT_METHOD_MISMATCH = enumC1789630wfh6;
        EnumC1789630wfh[] enumC1789630wfhArr = {enumC1789630wfh, enumC1789630wfh2, enumC1789630wfh3, enumC1789630wfh4, enumC1789630wfh5, enumC1789630wfh6};
        LLILLJJLI = enumC1789630wfhArr;
        LLILLL = new C2254308sP(enumC1789630wfhArr);
    }

    public static EnumC1789630wfh[] values() {
        return (EnumC1789630wfh[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static EnumC1789630wfh valueOf(String str) {
        return (EnumC1789630wfh) C08FF.LIZ(EnumC1789630wfh.class, str);
    }

    public EnumC1789630wfh(String str, int i, int i2) {
        this.LL = i2;
    }
}
