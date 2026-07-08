package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Jy7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes8.dex */
public final class EnumC509250Jy7 {
    public static final EnumC509250Jy7 AUDIENCE_PRIVILEGE_PAGE;
    public static final EnumC509250Jy7 HOST_SUBSCRIPTION_MANAGEMENT_PAGE;
    public static final EnumC509250Jy7 HOST_SUBSCRIPTION_PANEL;
    public static final /* synthetic */ EnumC509250Jy7[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC509250Jy7> getEntries() {
        return LLILLL;
    }

    static {
        EnumC509250Jy7 enumC509250Jy7 = new EnumC509250Jy7("AUDIENCE_PRIVILEGE_PAGE", 0, "privilege_intro_page");
        AUDIENCE_PRIVILEGE_PAGE = enumC509250Jy7;
        EnumC509250Jy7 enumC509250Jy72 = new EnumC509250Jy7("HOST_SUBSCRIPTION_PANEL", 1, "live_detail_management_page");
        HOST_SUBSCRIPTION_PANEL = enumC509250Jy72;
        EnumC509250Jy7 enumC509250Jy73 = new EnumC509250Jy7("HOST_SUBSCRIPTION_MANAGEMENT_PAGE", 2, "other_management_page");
        HOST_SUBSCRIPTION_MANAGEMENT_PAGE = enumC509250Jy73;
        EnumC509250Jy7[] enumC509250Jy7Arr = {enumC509250Jy7, enumC509250Jy72, enumC509250Jy73};
        LLILLJJLI = enumC509250Jy7Arr;
        LLILLL = new C2254308sP(enumC509250Jy7Arr);
    }

    public static EnumC509250Jy7[] values() {
        return (EnumC509250Jy7[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC509250Jy7 valueOf(String str) {
        return (EnumC509250Jy7) C08FF.LIZ(EnumC509250Jy7.class, str);
    }

    public EnumC509250Jy7(String str, int i, String str2) {
        this.LL = str2;
    }
}
