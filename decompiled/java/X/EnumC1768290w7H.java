package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0w7H, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1768290w7H {
    public static final EnumC1768290w7H API_FETCH;
    public static final EnumC1768290w7H BACK_BUTTON;
    public static final EnumC1768290w7H BASE_TOOLTIP;
    public static final EnumC1768290w7H DIVERSION_PARAMS_INFO;
    public static final /* synthetic */ EnumC1768290w7H[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1768290w7H SPARKVIEW;
    public static final EnumC1768290w7H VOUCHER_BLOCK;
    public static final EnumC1768290w7H VOUCHER_DIALOG;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1768290w7H> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1768290w7H enumC1768290w7H = new EnumC1768290w7H("BASE_TOOLTIP", 0, "base_tooltip");
        BASE_TOOLTIP = enumC1768290w7H;
        EnumC1768290w7H enumC1768290w7H2 = new EnumC1768290w7H("VOUCHER_DIALOG", 1, "voucher_dialog");
        VOUCHER_DIALOG = enumC1768290w7H2;
        EnumC1768290w7H enumC1768290w7H3 = new EnumC1768290w7H("VOUCHER_BLOCK", 2, "voucher_block");
        VOUCHER_BLOCK = enumC1768290w7H3;
        EnumC1768290w7H enumC1768290w7H4 = new EnumC1768290w7H("SPARKVIEW", 3, "sparkview");
        SPARKVIEW = enumC1768290w7H4;
        EnumC1768290w7H enumC1768290w7H5 = new EnumC1768290w7H("BACK_BUTTON", 4, "back_button");
        BACK_BUTTON = enumC1768290w7H5;
        EnumC1768290w7H enumC1768290w7H6 = new EnumC1768290w7H("DIVERSION_PARAMS_INFO", 5, "diversion_params_info");
        DIVERSION_PARAMS_INFO = enumC1768290w7H6;
        EnumC1768290w7H enumC1768290w7H7 = new EnumC1768290w7H("API_FETCH", 6, "api_fetch");
        API_FETCH = enumC1768290w7H7;
        EnumC1768290w7H[] enumC1768290w7HArr = {enumC1768290w7H, enumC1768290w7H2, enumC1768290w7H3, enumC1768290w7H4, enumC1768290w7H5, enumC1768290w7H6, enumC1768290w7H7};
        LLILLJJLI = enumC1768290w7HArr;
        LLILLL = new C2254308sP(enumC1768290w7HArr);
    }

    public static EnumC1768290w7H[] values() {
        return (EnumC1768290w7H[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1768290w7H valueOf(String str) {
        return (EnumC1768290w7H) C08FF.LIZ(EnumC1768290w7H.class, str);
    }

    public EnumC1768290w7H(String str, int i, String str2) {
        this.LL = str2;
    }
}
