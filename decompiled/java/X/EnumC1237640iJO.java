package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iJO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1237640iJO {
    public static final /* synthetic */ EnumC1237640iJO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1237640iJO LOGIN;
    public static final EnumC1237640iJO SIGNUP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1237640iJO> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1237640iJO enumC1237640iJO = new EnumC1237640iJO("LOGIN", 0, "login");
        LOGIN = enumC1237640iJO;
        EnumC1237640iJO enumC1237640iJO2 = new EnumC1237640iJO("SIGNUP", 1, "signup");
        SIGNUP = enumC1237640iJO2;
        EnumC1237640iJO[] enumC1237640iJOArr = {enumC1237640iJO, enumC1237640iJO2};
        LLILLJJLI = enumC1237640iJOArr;
        LLILLL = new C2254308sP(enumC1237640iJOArr);
    }

    public static EnumC1237640iJO[] values() {
        return (EnumC1237640iJO[]) LLILLJJLI.clone();
    }

    public final String getPanelType() {
        return this.LL;
    }

    public static EnumC1237640iJO valueOf(String str) {
        return (EnumC1237640iJO) C08FF.LIZ(EnumC1237640iJO.class, str);
    }

    public EnumC1237640iJO(String str, int i, String str2) {
        this.LL = str2;
    }
}
