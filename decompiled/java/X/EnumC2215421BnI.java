package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1BnI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes35.dex */
public final class EnumC2215421BnI {
    public static final EnumC2215421BnI AND;
    public static final C2215451BnL Companion;
    public static final /* synthetic */ EnumC2215421BnI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2215421BnI OR;
    public final String LL;

    public static InterfaceC2044707zh<EnumC2215421BnI> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.1BnL] */
    static {
        EnumC2215421BnI enumC2215421BnI = new EnumC2215421BnI("AND", 0, "&&");
        AND = enumC2215421BnI;
        EnumC2215421BnI enumC2215421BnI2 = new EnumC2215421BnI("OR", 1, "||");
        OR = enumC2215421BnI2;
        EnumC2215421BnI[] enumC2215421BnIArr = {enumC2215421BnI, enumC2215421BnI2};
        LLILLJJLI = enumC2215421BnIArr;
        LLILLL = new C2254308sP(enumC2215421BnIArr);
        Companion = new Object() { // from class: X.1BnL
        };
    }

    public static EnumC2215421BnI[] values() {
        return (EnumC2215421BnI[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC2215421BnI valueOf(String str) {
        return (EnumC2215421BnI) C08FF.LIZ(EnumC2215421BnI.class, str);
    }

    public EnumC2215421BnI(String str, int i, String str2) {
        this.LL = str2;
    }
}
