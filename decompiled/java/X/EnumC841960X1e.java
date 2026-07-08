package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0X1e, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC841960X1e {
    public static final EnumC841960X1e EXCEPTION;
    public static final /* synthetic */ EnumC841960X1e[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC841960X1e NETWORK_ERROR;
    public static final EnumC841960X1e TIMEOUT;
    public static final EnumC841960X1e UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC841960X1e> getEntries() {
        return LLILLL;
    }

    static {
        EnumC841960X1e enumC841960X1e = new EnumC841960X1e("UNKNOWN", 0, -1);
        UNKNOWN = enumC841960X1e;
        EnumC841960X1e enumC841960X1e2 = new EnumC841960X1e("TIMEOUT", 1, -2);
        TIMEOUT = enumC841960X1e2;
        EnumC841960X1e enumC841960X1e3 = new EnumC841960X1e("NETWORK_ERROR", 2, -3);
        NETWORK_ERROR = enumC841960X1e3;
        EnumC841960X1e enumC841960X1e4 = new EnumC841960X1e("EXCEPTION", 3, -4);
        EXCEPTION = enumC841960X1e4;
        EnumC841960X1e[] enumC841960X1eArr = {enumC841960X1e, enumC841960X1e2, enumC841960X1e3, enumC841960X1e4};
        LLILLJJLI = enumC841960X1eArr;
        LLILLL = new C2254308sP(enumC841960X1eArr);
    }

    public static EnumC841960X1e[] values() {
        return (EnumC841960X1e[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC841960X1e valueOf(String str) {
        return (EnumC841960X1e) C08FF.LIZ(EnumC841960X1e.class, str);
    }

    public EnumC841960X1e(String str, int i, int i2) {
        this.LL = i2;
    }
}
