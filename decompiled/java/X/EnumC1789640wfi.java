package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wfi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1789640wfi {
    public static final /* synthetic */ EnumC1789640wfi[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1789640wfi PAYMENT_METHOD_MISMATCH;
    public static final EnumC1789640wfi STORE_ACCOUNT_MISMATCH;
    public static final EnumC1789640wfi TT_ACCOUNT_MISMATCH_ACTIVE;
    public static final EnumC1789640wfi TT_ACCOUNT_MISMATCH_CANCEL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1789640wfi> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1789640wfi enumC1789640wfi = new EnumC1789640wfi("TT_ACCOUNT_MISMATCH_ACTIVE", 0, "You have an active subscription on your Google/Apple account. Please log in with the correct TikTok account to manage it.");
        TT_ACCOUNT_MISMATCH_ACTIVE = enumC1789640wfi;
        EnumC1789640wfi enumC1789640wfi2 = new EnumC1789640wfi("TT_ACCOUNT_MISMATCH_CANCEL", 1, "You have an cancelled subscription on your Google/Apple account. Please log in with the correct TikTok account to manage it.");
        TT_ACCOUNT_MISMATCH_CANCEL = enumC1789640wfi2;
        EnumC1789640wfi enumC1789640wfi3 = new EnumC1789640wfi("STORE_ACCOUNT_MISMATCH", 2, "We couldn't verify your subscription with your Google/Apple account. Please make sure you're signed in with the correct ID.");
        STORE_ACCOUNT_MISMATCH = enumC1789640wfi3;
        EnumC1789640wfi enumC1789640wfi4 = new EnumC1789640wfi("PAYMENT_METHOD_MISMATCH", 3, "We couldn't verify your subscription with your Google/Apple account. Please make sure you're signed in with the correct ID.");
        PAYMENT_METHOD_MISMATCH = enumC1789640wfi4;
        EnumC1789640wfi[] enumC1789640wfiArr = {enumC1789640wfi, enumC1789640wfi2, enumC1789640wfi3, enumC1789640wfi4};
        LLILLJJLI = enumC1789640wfiArr;
        LLILLL = new C2254308sP(enumC1789640wfiArr);
    }

    public static EnumC1789640wfi[] values() {
        return (EnumC1789640wfi[]) LLILLJJLI.clone();
    }

    public final String getMsg() {
        return this.LL;
    }

    public static EnumC1789640wfi valueOf(String str) {
        return (EnumC1789640wfi) C08FF.LIZ(EnumC1789640wfi.class, str);
    }

    public EnumC1789640wfi(String str, int i, String str2) {
        this.LL = str2;
    }
}
