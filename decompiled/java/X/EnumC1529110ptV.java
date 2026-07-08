package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ptV, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1529110ptV {
    public static final EnumC1529110ptV CACHE_MISS_ERROR;
    public static final EnumC1529110ptV CLIENT_PARSE_ERROR;
    public static final EnumC1529110ptV INIT_FAIL;
    public static final /* synthetic */ EnumC1529110ptV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1529110ptV OID_GENERATE_FAIL;
    public static final EnumC1529110ptV REQUEST_ERROR;
    public static final EnumC1529110ptV SERVER_ERROR;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1529110ptV> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1529110ptV enumC1529110ptV = new EnumC1529110ptV("INIT_FAIL", 0, -1);
        INIT_FAIL = enumC1529110ptV;
        EnumC1529110ptV enumC1529110ptV2 = new EnumC1529110ptV("OID_GENERATE_FAIL", 1, -2);
        OID_GENERATE_FAIL = enumC1529110ptV2;
        EnumC1529110ptV enumC1529110ptV3 = new EnumC1529110ptV("REQUEST_ERROR", 2, -3);
        REQUEST_ERROR = enumC1529110ptV3;
        EnumC1529110ptV enumC1529110ptV4 = new EnumC1529110ptV("SERVER_ERROR", 3, -4);
        SERVER_ERROR = enumC1529110ptV4;
        EnumC1529110ptV enumC1529110ptV5 = new EnumC1529110ptV("CLIENT_PARSE_ERROR", 4, -5);
        CLIENT_PARSE_ERROR = enumC1529110ptV5;
        EnumC1529110ptV enumC1529110ptV6 = new EnumC1529110ptV("CACHE_MISS_ERROR", 5, -6);
        CACHE_MISS_ERROR = enumC1529110ptV6;
        EnumC1529110ptV[] enumC1529110ptVArr = {enumC1529110ptV, enumC1529110ptV2, enumC1529110ptV3, enumC1529110ptV4, enumC1529110ptV5, enumC1529110ptV6};
        LLILLJJLI = enumC1529110ptVArr;
        LLILLL = new C2254308sP(enumC1529110ptVArr);
    }

    public static EnumC1529110ptV[] values() {
        return (EnumC1529110ptV[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static EnumC1529110ptV valueOf(String str) {
        return (EnumC1529110ptV) C08FF.LIZ(EnumC1529110ptV.class, str);
    }

    public EnumC1529110ptV(String str, int i, int i2) {
        this.LL = i2;
    }
}
