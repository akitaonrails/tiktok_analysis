package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0mpA, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1411100mpA {
    public static final EnumC1411100mpA GENERAL_ERROR;
    public static final /* synthetic */ EnumC1411100mpA[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1411100mpA NETWORK_ERROR;
    public static final EnumC1411100mpA PAYMENT_ERROR;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1411100mpA> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1411100mpA enumC1411100mpA = new EnumC1411100mpA("NETWORK_ERROR", 0, "network_error");
        NETWORK_ERROR = enumC1411100mpA;
        EnumC1411100mpA enumC1411100mpA2 = new EnumC1411100mpA("PAYMENT_ERROR", 1, "payment_error");
        PAYMENT_ERROR = enumC1411100mpA2;
        EnumC1411100mpA enumC1411100mpA3 = new EnumC1411100mpA("GENERAL_ERROR", 2, "general_error");
        GENERAL_ERROR = enumC1411100mpA3;
        EnumC1411100mpA[] enumC1411100mpAArr = {enumC1411100mpA, enumC1411100mpA2, enumC1411100mpA3};
        LLILLJJLI = enumC1411100mpAArr;
        LLILLL = new C2254308sP(enumC1411100mpAArr);
    }

    public static EnumC1411100mpA[] values() {
        return (EnumC1411100mpA[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1411100mpA valueOf(String str) {
        return (EnumC1411100mpA) C08FF.LIZ(EnumC1411100mpA.class, str);
    }

    public EnumC1411100mpA(String str, int i, String str2) {
        this.LL = str2;
    }
}
