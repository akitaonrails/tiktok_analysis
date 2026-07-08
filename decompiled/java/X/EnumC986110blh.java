package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0blh, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC986110blh {
    public static final EnumC986110blh CRITICAL_ERROR;
    public static final C986130blj Companion;
    public static final /* synthetic */ EnumC986110blh[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC986110blh SUCCESS;
    public static final EnumC986110blh TIMEOUT;
    public static final EnumC986110blh UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC986110blh> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0blj] */
    static {
        EnumC986110blh enumC986110blh = new EnumC986110blh("UNKNOWN", 0, -2);
        UNKNOWN = enumC986110blh;
        EnumC986110blh enumC986110blh2 = new EnumC986110blh("SUCCESS", 1, 0);
        SUCCESS = enumC986110blh2;
        EnumC986110blh enumC986110blh3 = new EnumC986110blh("CRITICAL_ERROR", 2, -1);
        CRITICAL_ERROR = enumC986110blh3;
        EnumC986110blh enumC986110blh4 = new EnumC986110blh("TIMEOUT", 3, 408);
        TIMEOUT = enumC986110blh4;
        EnumC986110blh[] enumC986110blhArr = {enumC986110blh, enumC986110blh2, enumC986110blh3, enumC986110blh4};
        LLILLJJLI = enumC986110blhArr;
        LLILLL = new C2254308sP(enumC986110blhArr);
        Companion = new Object() { // from class: X.0blj
        };
    }

    public static EnumC986110blh[] values() {
        return (EnumC986110blh[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static final EnumC986110blh fromCode(int i) {
        Companion.getClass();
        EnumC986110blh enumC986110blh = SUCCESS;
        if (i != enumC986110blh.getCode()) {
            EnumC986110blh enumC986110blh2 = TIMEOUT;
            if (i != enumC986110blh2.getCode()) {
                EnumC986110blh enumC986110blh3 = CRITICAL_ERROR;
                if (i != enumC986110blh3.getCode()) {
                    return UNKNOWN;
                }
                return enumC986110blh3;
            }
            return enumC986110blh2;
        }
        return enumC986110blh;
    }

    public static EnumC986110blh valueOf(String str) {
        return (EnumC986110blh) C08FF.LIZ(EnumC986110blh.class, str);
    }

    public EnumC986110blh(String str, int i, int i2) {
        this.LL = i2;
    }
}
