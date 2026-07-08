package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iFA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1235020iFA {
    public static final EnumC1235020iFA CHANGE;
    public static final EnumC1235020iFA CLOSE;
    public static final /* synthetic */ EnumC1235020iFA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1235020iFA UNLINK;
    public static final EnumC1235020iFA VERIFY;
    public static final EnumC1235020iFA X_OUT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1235020iFA> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1235020iFA enumC1235020iFA = new EnumC1235020iFA("CHANGE", 0, "change");
        CHANGE = enumC1235020iFA;
        EnumC1235020iFA enumC1235020iFA2 = new EnumC1235020iFA("UNLINK", 1, "unlink");
        UNLINK = enumC1235020iFA2;
        EnumC1235020iFA enumC1235020iFA3 = new EnumC1235020iFA("VERIFY", 2, "verify");
        VERIFY = enumC1235020iFA3;
        EnumC1235020iFA enumC1235020iFA4 = new EnumC1235020iFA("X_OUT", 3, "x-out");
        X_OUT = enumC1235020iFA4;
        EnumC1235020iFA enumC1235020iFA5 = new EnumC1235020iFA("CLOSE", 4, "close");
        CLOSE = enumC1235020iFA5;
        EnumC1235020iFA[] enumC1235020iFAArr = {enumC1235020iFA, enumC1235020iFA2, enumC1235020iFA3, enumC1235020iFA4, enumC1235020iFA5};
        LLILLJJLI = enumC1235020iFAArr;
        LLILLL = new C2254308sP(enumC1235020iFAArr);
    }

    public static EnumC1235020iFA[] values() {
        return (EnumC1235020iFA[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1235020iFA valueOf(String str) {
        return (EnumC1235020iFA) C08FF.LIZ(EnumC1235020iFA.class, str);
    }

    public EnumC1235020iFA(String str, int i, String str2) {
        this.LL = str2;
    }
}
