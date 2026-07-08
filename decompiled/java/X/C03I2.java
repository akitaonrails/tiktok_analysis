package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03I2, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03I2 {
    public static final C03I2 BR_CPF;
    public static final C03I2 COMPLIANCE_COLLECTION;
    public static final /* synthetic */ C03I2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C03I2 MX_RFC_CURP;

    public static InterfaceC2044707zh<C03I2> getEntries() {
        return LLILLJJLI;
    }

    static {
        C03I2 c03i2 = new C03I2("BR_CPF", 0);
        BR_CPF = c03i2;
        C03I2 c03i22 = new C03I2("MX_RFC_CURP", 1);
        MX_RFC_CURP = c03i22;
        C03I2 c03i23 = new C03I2("COMPLIANCE_COLLECTION", 2);
        COMPLIANCE_COLLECTION = c03i23;
        C03I2[] c03i2Arr = {c03i2, c03i22, c03i23};
        LL = c03i2Arr;
        LLILLJJLI = new C2254308sP(c03i2Arr);
    }

    public static C03I2[] values() {
        return (C03I2[]) LL.clone();
    }

    public static C03I2 valueOf(String str) {
        return (C03I2) C08FF.LIZ(C03I2.class, str);
    }

    public C03I2(String str, int i) {
    }
}
