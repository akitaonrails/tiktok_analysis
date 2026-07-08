package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0NfD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC599450NfD {
    public static final EnumC599450NfD EMPTY_CONTEXT;
    public static final EnumC599450NfD EMPTY_VALUE;
    public static final EnumC599450NfD INVALID_PARAMS;
    public static final EnumC599450NfD INVALID_VALUE;
    public static final /* synthetic */ EnumC599450NfD[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC599450NfD> getEntries() {
        return LLILZ;
    }

    static {
        EnumC599450NfD enumC599450NfD = new EnumC599450NfD("INVALID_PARAMS", 0, 1, "invalid params");
        INVALID_PARAMS = enumC599450NfD;
        EnumC599450NfD enumC599450NfD2 = new EnumC599450NfD("EMPTY_CONTEXT", 1, 2, "empty context");
        EMPTY_CONTEXT = enumC599450NfD2;
        EnumC599450NfD enumC599450NfD3 = new EnumC599450NfD("EMPTY_VALUE", 2, 3, "empty value");
        EMPTY_VALUE = enumC599450NfD3;
        EnumC599450NfD enumC599450NfD4 = new EnumC599450NfD("INVALID_VALUE", 3, 4, "invalid value");
        INVALID_VALUE = enumC599450NfD4;
        EnumC599450NfD[] enumC599450NfDArr = {enumC599450NfD, enumC599450NfD2, enumC599450NfD3, enumC599450NfD4};
        LLILLL = enumC599450NfDArr;
        LLILZ = new C2254308sP(enumC599450NfDArr);
    }

    public static EnumC599450NfD[] values() {
        return (EnumC599450NfD[]) LLILLL.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public final String getMessage() {
        return this.LLILLJJLI;
    }

    public static EnumC599450NfD valueOf(String str) {
        return (EnumC599450NfD) C08FF.LIZ(EnumC599450NfD.class, str);
    }

    public EnumC599450NfD(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
