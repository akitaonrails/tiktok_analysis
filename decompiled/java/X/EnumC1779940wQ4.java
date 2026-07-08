package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wQ4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779940wQ4 {
    public static final EnumC1779940wQ4 AUTHENTICATION_AUTHORIZATION;
    public static final EnumC1779940wQ4 AUTHENTICATION_ONLY;
    public static final EnumC1779940wQ4 AUTO_AUTHORIZATION_DISABLED;
    public static final EnumC1779940wQ4 INCREMENTAL_AUTHORIZATION;
    public static final /* synthetic */ EnumC1779940wQ4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1779940wQ4> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1779940wQ4 enumC1779940wQ4 = new EnumC1779940wQ4("AUTHENTICATION_ONLY", 0, "authentication_only");
        AUTHENTICATION_ONLY = enumC1779940wQ4;
        EnumC1779940wQ4 enumC1779940wQ42 = new EnumC1779940wQ4("AUTHENTICATION_AUTHORIZATION", 1, "authentication_authorization");
        AUTHENTICATION_AUTHORIZATION = enumC1779940wQ42;
        EnumC1779940wQ4 enumC1779940wQ43 = new EnumC1779940wQ4("INCREMENTAL_AUTHORIZATION", 2, "incremental_authorization");
        INCREMENTAL_AUTHORIZATION = enumC1779940wQ43;
        EnumC1779940wQ4 enumC1779940wQ44 = new EnumC1779940wQ4("AUTO_AUTHORIZATION_DISABLED", 3, "auto_authorization_disabled");
        AUTO_AUTHORIZATION_DISABLED = enumC1779940wQ44;
        EnumC1779940wQ4[] enumC1779940wQ4Arr = {enumC1779940wQ4, enumC1779940wQ42, enumC1779940wQ43, enumC1779940wQ44};
        LLILLJJLI = enumC1779940wQ4Arr;
        LLILLL = new C2254308sP(enumC1779940wQ4Arr);
    }

    public static EnumC1779940wQ4[] values() {
        return (EnumC1779940wQ4[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1779940wQ4 valueOf(String str) {
        return (EnumC1779940wQ4) C08FF.LIZ(EnumC1779940wQ4.class, str);
    }

    public EnumC1779940wQ4(String str, int i, String str2) {
        this.LL = str2;
    }
}
