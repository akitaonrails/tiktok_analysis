package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iKt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1238570iKt {
    public static final EnumC1238570iKt ACCOUNT_USER_INFO;
    public static final EnumC1238570iKt CREATOR_VERIFICATION;
    public static final EnumC1238570iKt DEACTIVATE_DELETE_ACCOUNT;
    public static final EnumC1238570iKt DELETE_ACCOUNT_ONLY;
    public static final EnumC1238570iKt DOWNLOAD_DATA;
    public static final EnumC1238570iKt EXTERNAL_ACCOUNTS;
    public static final /* synthetic */ EnumC1238570iKt[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1238570iKt MANAGE_ORG_ACCOUNTS;
    public static final EnumC1238570iKt MANAGE_ORG_PERMISSIONS;
    public static final EnumC1238570iKt PASSKEY;
    public static final EnumC1238570iKt PASSWORD;
    public static final EnumC1238570iKt PIN;
    public static final EnumC1238570iKt REQUEST_VERIFICATION;
    public static final EnumC1238570iKt SELLER_SETTINGS;
    public static final EnumC1238570iKt SWITCH_ACCOUNT;

    public static InterfaceC2044707zh<EnumC1238570iKt> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1238570iKt enumC1238570iKt = new EnumC1238570iKt("ACCOUNT_USER_INFO", 0);
        ACCOUNT_USER_INFO = enumC1238570iKt;
        EnumC1238570iKt enumC1238570iKt2 = new EnumC1238570iKt("PASSWORD", 1);
        PASSWORD = enumC1238570iKt2;
        EnumC1238570iKt enumC1238570iKt3 = new EnumC1238570iKt("PASSKEY", 2);
        PASSKEY = enumC1238570iKt3;
        EnumC1238570iKt enumC1238570iKt4 = new EnumC1238570iKt("REQUEST_VERIFICATION", 3);
        REQUEST_VERIFICATION = enumC1238570iKt4;
        EnumC1238570iKt enumC1238570iKt5 = new EnumC1238570iKt("CREATOR_VERIFICATION", 4);
        CREATOR_VERIFICATION = enumC1238570iKt5;
        EnumC1238570iKt enumC1238570iKt6 = new EnumC1238570iKt("SWITCH_ACCOUNT", 5);
        SWITCH_ACCOUNT = enumC1238570iKt6;
        EnumC1238570iKt enumC1238570iKt7 = new EnumC1238570iKt("SELLER_SETTINGS", 6);
        SELLER_SETTINGS = enumC1238570iKt7;
        EnumC1238570iKt enumC1238570iKt8 = new EnumC1238570iKt("PIN", 7);
        PIN = enumC1238570iKt8;
        EnumC1238570iKt enumC1238570iKt9 = new EnumC1238570iKt("DOWNLOAD_DATA", 8);
        DOWNLOAD_DATA = enumC1238570iKt9;
        EnumC1238570iKt enumC1238570iKt10 = new EnumC1238570iKt("DEACTIVATE_DELETE_ACCOUNT", 9);
        DEACTIVATE_DELETE_ACCOUNT = enumC1238570iKt10;
        EnumC1238570iKt enumC1238570iKt11 = new EnumC1238570iKt("DELETE_ACCOUNT_ONLY", 10);
        DELETE_ACCOUNT_ONLY = enumC1238570iKt11;
        EnumC1238570iKt enumC1238570iKt12 = new EnumC1238570iKt("MANAGE_ORG_PERMISSIONS", 11);
        MANAGE_ORG_PERMISSIONS = enumC1238570iKt12;
        EnumC1238570iKt enumC1238570iKt13 = new EnumC1238570iKt("MANAGE_ORG_ACCOUNTS", 12);
        MANAGE_ORG_ACCOUNTS = enumC1238570iKt13;
        EnumC1238570iKt enumC1238570iKt14 = new EnumC1238570iKt("EXTERNAL_ACCOUNTS", 13);
        EXTERNAL_ACCOUNTS = enumC1238570iKt14;
        EnumC1238570iKt[] enumC1238570iKtArr = {enumC1238570iKt, enumC1238570iKt2, enumC1238570iKt3, enumC1238570iKt4, enumC1238570iKt5, enumC1238570iKt6, enumC1238570iKt7, enumC1238570iKt8, enumC1238570iKt9, enumC1238570iKt10, enumC1238570iKt11, enumC1238570iKt12, enumC1238570iKt13, enumC1238570iKt14};
        LL = enumC1238570iKtArr;
        LLILLJJLI = new C2254308sP(enumC1238570iKtArr);
    }

    public static EnumC1238570iKt[] values() {
        return (EnumC1238570iKt[]) LL.clone();
    }

    public static EnumC1238570iKt valueOf(String str) {
        return (EnumC1238570iKt) C08FF.LIZ(EnumC1238570iKt.class, str);
    }

    public EnumC1238570iKt(String str, int i) {
    }
}
