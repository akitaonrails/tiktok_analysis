package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vvN, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1760910vvN {
    public static final EnumC1760910vvN FALLBACK;
    public static final /* synthetic */ EnumC1760910vvN[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC1760910vvN NATIVE;
    public static final EnumC1760910vvN UNKNOWN;

    public static InterfaceC2044707zh<EnumC1760910vvN> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1760910vvN enumC1760910vvN = new EnumC1760910vvN("UNKNOWN", 0);
        UNKNOWN = enumC1760910vvN;
        EnumC1760910vvN enumC1760910vvN2 = new EnumC1760910vvN("NATIVE", 1);
        NATIVE = enumC1760910vvN2;
        EnumC1760910vvN enumC1760910vvN3 = new EnumC1760910vvN("FALLBACK", 2);
        FALLBACK = enumC1760910vvN3;
        EnumC1760910vvN[] enumC1760910vvNArr = {enumC1760910vvN, enumC1760910vvN2, enumC1760910vvN3};
        LL = enumC1760910vvNArr;
        LLILLJJLI = new C2254308sP(enumC1760910vvNArr);
    }

    public static EnumC1760910vvN[] values() {
        return (EnumC1760910vvN[]) LL.clone();
    }

    public static EnumC1760910vvN valueOf(String str) {
        return (EnumC1760910vvN) C08FF.LIZ(EnumC1760910vvN.class, str);
    }

    public EnumC1760910vvN(String str, int i) {
    }
}
