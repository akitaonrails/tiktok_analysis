package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NfC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC599440NfC {
    public static final EnumC599440NfC EMPTY_CONTEXT;
    public static final EnumC599440NfC INVALID_PARAMS;
    public static final EnumC599440NfC INVALID_VALUE;
    public static final /* synthetic */ EnumC599440NfC[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC599440NfC> getEntries() {
        return LLILZ;
    }

    static {
        EnumC599440NfC enumC599440NfC = new EnumC599440NfC("INVALID_PARAMS", 0, 1, "invalid params");
        INVALID_PARAMS = enumC599440NfC;
        EnumC599440NfC enumC599440NfC2 = new EnumC599440NfC("EMPTY_CONTEXT", 1, 2, "empty context");
        EMPTY_CONTEXT = enumC599440NfC2;
        EnumC599440NfC enumC599440NfC3 = new EnumC599440NfC("INVALID_VALUE", 2, 3, "invalid value");
        INVALID_VALUE = enumC599440NfC3;
        EnumC599440NfC[] enumC599440NfCArr = {enumC599440NfC, enumC599440NfC2, enumC599440NfC3};
        LLILLL = enumC599440NfCArr;
        LLILZ = new C2254308sP(enumC599440NfCArr);
    }

    public static EnumC599440NfC[] values() {
        return (EnumC599440NfC[]) LLILLL.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public final String getMessage() {
        return this.LLILLJJLI;
    }

    public static EnumC599440NfC valueOf(String str) {
        return (EnumC599440NfC) C08FF.LIZ(EnumC599440NfC.class, str);
    }

    public EnumC599440NfC(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
