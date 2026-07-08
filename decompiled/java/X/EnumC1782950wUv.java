package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0wUv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1782950wUv {
    public static final EnumC1782950wUv ABILITY_NULL;
    public static final EnumC1782950wUv DATA_ERROR;
    public static final /* synthetic */ EnumC1782950wUv[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1782950wUv LOAD_FAILED;
    public static final EnumC1782950wUv LOAD_INTERRUPT;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1782950wUv> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1782950wUv enumC1782950wUv = new EnumC1782950wUv("ABILITY_NULL", 0, -1, "ability is null");
        ABILITY_NULL = enumC1782950wUv;
        EnumC1782950wUv enumC1782950wUv2 = new EnumC1782950wUv("LOAD_INTERRUPT", 1, -2, "cancel before load finish");
        LOAD_INTERRUPT = enumC1782950wUv2;
        EnumC1782950wUv enumC1782950wUv3 = new EnumC1782950wUv("LOAD_FAILED", 2, -3, "load failed");
        LOAD_FAILED = enumC1782950wUv3;
        EnumC1782950wUv enumC1782950wUv4 = new EnumC1782950wUv("DATA_ERROR", 3, -4, "data_error");
        DATA_ERROR = enumC1782950wUv4;
        EnumC1782950wUv[] enumC1782950wUvArr = {enumC1782950wUv, enumC1782950wUv2, enumC1782950wUv3, enumC1782950wUv4};
        LLILLL = enumC1782950wUvArr;
        LLILZ = new C2254308sP(enumC1782950wUvArr);
    }

    public static EnumC1782950wUv[] values() {
        return (EnumC1782950wUv[]) LLILLL.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public final String getMessage() {
        return this.LLILLJJLI;
    }

    public static EnumC1782950wUv valueOf(String str) {
        return (EnumC1782950wUv) C08FF.LIZ(EnumC1782950wUv.class, str);
    }

    public EnumC1782950wUv(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
