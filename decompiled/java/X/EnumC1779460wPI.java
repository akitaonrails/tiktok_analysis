package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wPI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1779460wPI {
    public static final EnumC1779460wPI ERROR;
    public static final /* synthetic */ EnumC1779460wPI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1779460wPI LOADING;
    public static final EnumC1779460wPI SUCCESS;
    public static final EnumC1779460wPI UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1779460wPI> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1779460wPI enumC1779460wPI = new EnumC1779460wPI("UNKNOWN", 0, -1);
        UNKNOWN = enumC1779460wPI;
        EnumC1779460wPI enumC1779460wPI2 = new EnumC1779460wPI("SUCCESS", 1, 1);
        SUCCESS = enumC1779460wPI2;
        EnumC1779460wPI enumC1779460wPI3 = new EnumC1779460wPI("LOADING", 2, 2);
        LOADING = enumC1779460wPI3;
        EnumC1779460wPI enumC1779460wPI4 = new EnumC1779460wPI("ERROR", 3, 3);
        ERROR = enumC1779460wPI4;
        EnumC1779460wPI[] enumC1779460wPIArr = {enumC1779460wPI, enumC1779460wPI2, enumC1779460wPI3, enumC1779460wPI4};
        LLILLJJLI = enumC1779460wPIArr;
        LLILLL = new C2254308sP(enumC1779460wPIArr);
    }

    public static EnumC1779460wPI[] values() {
        return (EnumC1779460wPI[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC1779460wPI valueOf(String str) {
        return (EnumC1779460wPI) C08FF.LIZ(EnumC1779460wPI.class, str);
    }

    public EnumC1779460wPI(String str, int i, int i2) {
        this.LL = i2;
    }
}
