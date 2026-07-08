package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Lds, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes9.dex */
public final class EnumC547660Lds {
    public static final EnumC547660Lds ASYNCHRONOUS;
    public static final /* synthetic */ EnumC547660Lds[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC547660Lds SYNCHRONOUS;
    public static final EnumC547660Lds UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC547660Lds> getEntries() {
        return LLILLL;
    }

    static {
        EnumC547660Lds enumC547660Lds = new EnumC547660Lds("ASYNCHRONOUS", 0, "asynchronous");
        ASYNCHRONOUS = enumC547660Lds;
        EnumC547660Lds enumC547660Lds2 = new EnumC547660Lds("SYNCHRONOUS", 1, "synchronous");
        SYNCHRONOUS = enumC547660Lds2;
        EnumC547660Lds enumC547660Lds3 = new EnumC547660Lds("UNKNOWN", 2, "unknown");
        UNKNOWN = enumC547660Lds3;
        EnumC547660Lds[] enumC547660LdsArr = {enumC547660Lds, enumC547660Lds2, enumC547660Lds3};
        LLILLJJLI = enumC547660LdsArr;
        LLILLL = new C2254308sP(enumC547660LdsArr);
    }

    public static EnumC547660Lds[] values() {
        return (EnumC547660Lds[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC547660Lds valueOf(String str) {
        return (EnumC547660Lds) C08FF.LIZ(EnumC547660Lds.class, str);
    }

    public EnumC547660Lds(String str, int i, String str2) {
        this.LL = str2;
    }
}
