package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hqR, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1219690hqR {
    public static final /* synthetic */ EnumC1219690hqR[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1219690hqR POST_STATUS_FAILED;
    public static final EnumC1219690hqR POST_STATUS_PROCESSING;
    public static final EnumC1219690hqR POST_STATUS_SUCCESS;
    public static final EnumC1219690hqR POST_STATUS_UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1219690hqR> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1219690hqR enumC1219690hqR = new EnumC1219690hqR("POST_STATUS_UNKNOWN", 0, 0);
        POST_STATUS_UNKNOWN = enumC1219690hqR;
        EnumC1219690hqR enumC1219690hqR2 = new EnumC1219690hqR("POST_STATUS_PROCESSING", 1, 1);
        POST_STATUS_PROCESSING = enumC1219690hqR2;
        EnumC1219690hqR enumC1219690hqR3 = new EnumC1219690hqR("POST_STATUS_SUCCESS", 2, 2);
        POST_STATUS_SUCCESS = enumC1219690hqR3;
        EnumC1219690hqR enumC1219690hqR4 = new EnumC1219690hqR("POST_STATUS_FAILED", 3, 3);
        POST_STATUS_FAILED = enumC1219690hqR4;
        EnumC1219690hqR[] enumC1219690hqRArr = {enumC1219690hqR, enumC1219690hqR2, enumC1219690hqR3, enumC1219690hqR4};
        LLILLJJLI = enumC1219690hqRArr;
        LLILLL = new C2254308sP(enumC1219690hqRArr);
    }

    public static EnumC1219690hqR[] values() {
        return (EnumC1219690hqR[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1219690hqR valueOf(String str) {
        return (EnumC1219690hqR) C08FF.LIZ(EnumC1219690hqR.class, str);
    }

    public EnumC1219690hqR(String str, int i, int i2) {
        this.LL = i2;
    }
}
