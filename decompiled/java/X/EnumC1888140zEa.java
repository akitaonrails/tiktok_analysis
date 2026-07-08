package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zEa, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1888140zEa {
    public static final EnumC1888140zEa BASE_PAGE;
    public static final EnumC1888140zEa CONFIRM_PAGE;
    public static final /* synthetic */ EnumC1888140zEa[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1888140zEa LOADING;
    public static final EnumC1888140zEa SHOW_CREATE_PASSKEY_DIALOG;
    public static final EnumC1888140zEa SHOW_ERROR_2SV_DIALOG;
    public static final EnumC1888140zEa SHOW_FAIL_AUTO_IDV_DIALOG;
    public static final EnumC1888140zEa SHOW_RETRY_CREATE_DIALOG;

    public static InterfaceC2044707zh<EnumC1888140zEa> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1888140zEa enumC1888140zEa = new EnumC1888140zEa("BASE_PAGE", 0);
        BASE_PAGE = enumC1888140zEa;
        EnumC1888140zEa enumC1888140zEa2 = new EnumC1888140zEa("LOADING", 1);
        LOADING = enumC1888140zEa2;
        EnumC1888140zEa enumC1888140zEa3 = new EnumC1888140zEa("SHOW_CREATE_PASSKEY_DIALOG", 2);
        SHOW_CREATE_PASSKEY_DIALOG = enumC1888140zEa3;
        EnumC1888140zEa enumC1888140zEa4 = new EnumC1888140zEa("SHOW_FAIL_AUTO_IDV_DIALOG", 3);
        SHOW_FAIL_AUTO_IDV_DIALOG = enumC1888140zEa4;
        EnumC1888140zEa enumC1888140zEa5 = new EnumC1888140zEa("SHOW_RETRY_CREATE_DIALOG", 4);
        SHOW_RETRY_CREATE_DIALOG = enumC1888140zEa5;
        EnumC1888140zEa enumC1888140zEa6 = new EnumC1888140zEa("SHOW_ERROR_2SV_DIALOG", 5);
        SHOW_ERROR_2SV_DIALOG = enumC1888140zEa6;
        EnumC1888140zEa enumC1888140zEa7 = new EnumC1888140zEa("CONFIRM_PAGE", 6);
        CONFIRM_PAGE = enumC1888140zEa7;
        EnumC1888140zEa[] enumC1888140zEaArr = {enumC1888140zEa, enumC1888140zEa2, enumC1888140zEa3, enumC1888140zEa4, enumC1888140zEa5, enumC1888140zEa6, enumC1888140zEa7};
        LL = enumC1888140zEaArr;
        LLILLJJLI = new C2254308sP(enumC1888140zEaArr);
    }

    public static EnumC1888140zEa[] values() {
        return (EnumC1888140zEa[]) LL.clone();
    }

    public static EnumC1888140zEa valueOf(String str) {
        return (EnumC1888140zEa) C08FF.LIZ(EnumC1888140zEa.class, str);
    }

    public EnumC1888140zEa(String str, int i) {
    }
}
