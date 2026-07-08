package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zzt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1917470zzt {
    public static final /* synthetic */ EnumC1917470zzt[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1917470zzt USER_BAN_APPEAL;
    public static final EnumC1917470zzt USER_BAN_DYD;
    public static final EnumC1917470zzt USER_BAN_LOGOUT;
    public static final EnumC1917470zzt USER_BAN_NATIVE;
    public static final EnumC1917470zzt USER_BAN_WEB;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1917470zzt> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1917470zzt enumC1917470zzt = new EnumC1917470zzt("USER_BAN_LOGOUT", 0, "dismiss");
        USER_BAN_LOGOUT = enumC1917470zzt;
        EnumC1917470zzt enumC1917470zzt2 = new EnumC1917470zzt("USER_BAN_WEB", 1, "web");
        USER_BAN_WEB = enumC1917470zzt2;
        EnumC1917470zzt enumC1917470zzt3 = new EnumC1917470zzt("USER_BAN_APPEAL", 2, "appeal");
        USER_BAN_APPEAL = enumC1917470zzt3;
        EnumC1917470zzt enumC1917470zzt4 = new EnumC1917470zzt("USER_BAN_NATIVE", 3, "native");
        USER_BAN_NATIVE = enumC1917470zzt4;
        EnumC1917470zzt enumC1917470zzt5 = new EnumC1917470zzt("USER_BAN_DYD", 4, "download_your_data");
        USER_BAN_DYD = enumC1917470zzt5;
        EnumC1917470zzt[] enumC1917470zztArr = {enumC1917470zzt, enumC1917470zzt2, enumC1917470zzt3, enumC1917470zzt4, enumC1917470zzt5};
        LLILLJJLI = enumC1917470zztArr;
        LLILLL = new C2254308sP(enumC1917470zztArr);
    }

    public static EnumC1917470zzt[] values() {
        return (EnumC1917470zzt[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1917470zzt valueOf(String str) {
        return (EnumC1917470zzt) C08FF.LIZ(EnumC1917470zzt.class, str);
    }

    public EnumC1917470zzt(String str, int i, String str2) {
        this.LL = str2;
    }
}
