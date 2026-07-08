package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iJd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1237790iJd {
    public static final EnumC1237790iJd BIND_PHONE;
    public static final EnumC1237790iJd CHANGE_EMAIL;
    public static final EnumC1237790iJd CHANGE_PHONE;
    public static final EnumC1237790iJd DISMISS;
    public static final EnumC1237790iJd LINK_EMAIL;
    public static final /* synthetic */ EnumC1237790iJd[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1237790iJd LOGOUT;
    public static final EnumC1237790iJd VERIFY_EMAIL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1237790iJd> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1237790iJd enumC1237790iJd = new EnumC1237790iJd("CHANGE_PHONE", 0, "change_phone");
        CHANGE_PHONE = enumC1237790iJd;
        EnumC1237790iJd enumC1237790iJd2 = new EnumC1237790iJd("VERIFY_EMAIL", 1, "verify_email");
        VERIFY_EMAIL = enumC1237790iJd2;
        EnumC1237790iJd enumC1237790iJd3 = new EnumC1237790iJd("BIND_PHONE", 2, "bind_phone");
        BIND_PHONE = enumC1237790iJd3;
        EnumC1237790iJd enumC1237790iJd4 = new EnumC1237790iJd("LINK_EMAIL", 3, "link_email");
        LINK_EMAIL = enumC1237790iJd4;
        EnumC1237790iJd enumC1237790iJd5 = new EnumC1237790iJd("CHANGE_EMAIL", 4, "change_email");
        CHANGE_EMAIL = enumC1237790iJd5;
        EnumC1237790iJd enumC1237790iJd6 = new EnumC1237790iJd("DISMISS", 5, "dismiss");
        DISMISS = enumC1237790iJd6;
        EnumC1237790iJd enumC1237790iJd7 = new EnumC1237790iJd("LOGOUT", 6, "logout");
        LOGOUT = enumC1237790iJd7;
        EnumC1237790iJd[] enumC1237790iJdArr = {enumC1237790iJd, enumC1237790iJd2, enumC1237790iJd3, enumC1237790iJd4, enumC1237790iJd5, enumC1237790iJd6, enumC1237790iJd7};
        LLILLJJLI = enumC1237790iJdArr;
        LLILLL = new C2254308sP(enumC1237790iJdArr);
    }

    public static EnumC1237790iJd[] values() {
        return (EnumC1237790iJd[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1237790iJd valueOf(String str) {
        return (EnumC1237790iJd) C08FF.LIZ(EnumC1237790iJd.class, str);
    }

    public EnumC1237790iJd(String str, int i, String str2) {
        this.LL = str2;
    }
}
