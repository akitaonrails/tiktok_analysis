package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wUS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1782660wUS {
    public static final /* synthetic */ EnumC1782660wUS[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1782660wUS ORIGINAL;
    public static final EnumC1782660wUS TRANSLATED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1782660wUS> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1782660wUS enumC1782660wUS = new EnumC1782660wUS("ORIGINAL", 0, "original");
        ORIGINAL = enumC1782660wUS;
        EnumC1782660wUS enumC1782660wUS2 = new EnumC1782660wUS("TRANSLATED", 1, "translated");
        TRANSLATED = enumC1782660wUS2;
        EnumC1782660wUS[] enumC1782660wUSArr = {enumC1782660wUS, enumC1782660wUS2};
        LLILLJJLI = enumC1782660wUSArr;
        LLILLL = new C2254308sP(enumC1782660wUSArr);
    }

    public static EnumC1782660wUS[] values() {
        return (EnumC1782660wUS[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1782660wUS valueOf(String str) {
        return (EnumC1782660wUS) C08FF.LIZ(EnumC1782660wUS.class, str);
    }

    public EnumC1782660wUS(String str, int i, String str2) {
        this.LL = str2;
    }
}
