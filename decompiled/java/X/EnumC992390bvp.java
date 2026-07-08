package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bvp, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes17.dex */
public final class EnumC992390bvp {
    public static final /* synthetic */ EnumC992390bvp[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC992390bvp PAYIN_CASHIER;
    public static final EnumC992390bvp PAYIN_NATIVE_CASHIER;
    public static final EnumC992390bvp STANDARD_REFUND_CASHIER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC992390bvp> getEntries() {
        return LLILLL;
    }

    static {
        EnumC992390bvp enumC992390bvp = new EnumC992390bvp("PAYIN_CASHIER", 0, "PAYIN_CASHIER");
        PAYIN_CASHIER = enumC992390bvp;
        EnumC992390bvp enumC992390bvp2 = new EnumC992390bvp("PAYIN_NATIVE_CASHIER", 1, "PAYIN_NATIVE_CASHIER");
        PAYIN_NATIVE_CASHIER = enumC992390bvp2;
        EnumC992390bvp enumC992390bvp3 = new EnumC992390bvp("STANDARD_REFUND_CASHIER", 2, "STANDARD_REFUND_CASHIER");
        STANDARD_REFUND_CASHIER = enumC992390bvp3;
        EnumC992390bvp[] enumC992390bvpArr = {enumC992390bvp, enumC992390bvp2, enumC992390bvp3};
        LLILLJJLI = enumC992390bvpArr;
        LLILLL = new C2254308sP(enumC992390bvpArr);
    }

    public static EnumC992390bvp[] values() {
        return (EnumC992390bvp[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC992390bvp valueOf(String str) {
        return (EnumC992390bvp) C08FF.LIZ(EnumC992390bvp.class, str);
    }

    public EnumC992390bvp(String str, int i, String str2) {
        this.LL = str2;
    }
}
