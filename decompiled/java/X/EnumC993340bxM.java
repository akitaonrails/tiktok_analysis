package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bxM, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC993340bxM {
    public static final EnumC993340bxM IN_APP;
    public static final /* synthetic */ EnumC993340bxM[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC993340bxM THIRD_PARTY;
    public final String LL;

    public static InterfaceC2044707zh<EnumC993340bxM> getEntries() {
        return LLILLL;
    }

    static {
        EnumC993340bxM enumC993340bxM = new EnumC993340bxM("IN_APP", 0, "1p");
        IN_APP = enumC993340bxM;
        EnumC993340bxM enumC993340bxM2 = new EnumC993340bxM("THIRD_PARTY", 1, "3p");
        THIRD_PARTY = enumC993340bxM2;
        EnumC993340bxM[] enumC993340bxMArr = {enumC993340bxM, enumC993340bxM2};
        LLILLJJLI = enumC993340bxMArr;
        LLILLL = new C2254308sP(enumC993340bxMArr);
    }

    public static EnumC993340bxM[] values() {
        return (EnumC993340bxM[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC993340bxM valueOf(String str) {
        return (EnumC993340bxM) C08FF.LIZ(EnumC993340bxM.class, str);
    }

    public EnumC993340bxM(String str, int i, String str2) {
        this.LL = str2;
    }
}
