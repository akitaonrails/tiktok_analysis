package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zBr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1886450zBr {
    public static final EnumC1886450zBr ADD_PASSKEY;
    public static final EnumC1886450zBr DELETE_PASSKEY_LOADING;
    public static final EnumC1886450zBr ERROR_PAGE_LOAD;
    public static final /* synthetic */ EnumC1886450zBr[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1886450zBr LOADING;
    public static final EnumC1886450zBr PAGE_LOADED;
    public static final EnumC1886450zBr SHOW_ADD_LOGIN_DIALOG;
    public static final EnumC1886450zBr SHOW_DELETE_DIALOG;
    public static final EnumC1886450zBr SHOW_FAIL_AUTO_IDV_DIALOG;
    public static final EnumC1886450zBr SHOW_PASSKEY_EXISTS_DIALOG;
    public static final EnumC1886450zBr SHOW_RETRY_CREATE_DIALOG;

    public static InterfaceC2044707zh<EnumC1886450zBr> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1886450zBr enumC1886450zBr = new EnumC1886450zBr("LOADING", 0);
        LOADING = enumC1886450zBr;
        EnumC1886450zBr enumC1886450zBr2 = new EnumC1886450zBr("ERROR_PAGE_LOAD", 1);
        ERROR_PAGE_LOAD = enumC1886450zBr2;
        EnumC1886450zBr enumC1886450zBr3 = new EnumC1886450zBr("PAGE_LOADED", 2);
        PAGE_LOADED = enumC1886450zBr3;
        EnumC1886450zBr enumC1886450zBr4 = new EnumC1886450zBr("ADD_PASSKEY", 3);
        ADD_PASSKEY = enumC1886450zBr4;
        EnumC1886450zBr enumC1886450zBr5 = new EnumC1886450zBr("SHOW_DELETE_DIALOG", 4);
        SHOW_DELETE_DIALOG = enumC1886450zBr5;
        EnumC1886450zBr enumC1886450zBr6 = new EnumC1886450zBr("DELETE_PASSKEY_LOADING", 5);
        DELETE_PASSKEY_LOADING = enumC1886450zBr6;
        EnumC1886450zBr enumC1886450zBr7 = new EnumC1886450zBr("SHOW_ADD_LOGIN_DIALOG", 6);
        SHOW_ADD_LOGIN_DIALOG = enumC1886450zBr7;
        EnumC1886450zBr enumC1886450zBr8 = new EnumC1886450zBr("SHOW_FAIL_AUTO_IDV_DIALOG", 7);
        SHOW_FAIL_AUTO_IDV_DIALOG = enumC1886450zBr8;
        EnumC1886450zBr enumC1886450zBr9 = new EnumC1886450zBr("SHOW_RETRY_CREATE_DIALOG", 8);
        SHOW_RETRY_CREATE_DIALOG = enumC1886450zBr9;
        EnumC1886450zBr enumC1886450zBr10 = new EnumC1886450zBr("SHOW_PASSKEY_EXISTS_DIALOG", 9);
        SHOW_PASSKEY_EXISTS_DIALOG = enumC1886450zBr10;
        EnumC1886450zBr[] enumC1886450zBrArr = {enumC1886450zBr, enumC1886450zBr2, enumC1886450zBr3, enumC1886450zBr4, enumC1886450zBr5, enumC1886450zBr6, enumC1886450zBr7, enumC1886450zBr8, enumC1886450zBr9, enumC1886450zBr10};
        LL = enumC1886450zBrArr;
        LLILLJJLI = new C2254308sP(enumC1886450zBrArr);
    }

    public static EnumC1886450zBr[] values() {
        return (EnumC1886450zBr[]) LL.clone();
    }

    public static EnumC1886450zBr valueOf(String str) {
        return (EnumC1886450zBr) C08FF.LIZ(EnumC1886450zBr.class, str);
    }

    public EnumC1886450zBr(String str, int i) {
    }
}
