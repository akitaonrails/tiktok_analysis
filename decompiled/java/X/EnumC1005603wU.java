package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03wU, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes2.dex */
public final class EnumC1005603wU {
    public static final EnumC1005603wU COUPON;
    public static final EnumC1005603wU CUT_PRICE;
    public static final /* synthetic */ EnumC1005603wU[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1005603wU NORMAL;
    public static final EnumC1005603wU OUT_APP;
    public static final EnumC1005603wU RANK;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1005603wU> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1005603wU enumC1005603wU = new EnumC1005603wU("NORMAL", 0, 0);
        NORMAL = enumC1005603wU;
        EnumC1005603wU enumC1005603wU2 = new EnumC1005603wU("COUPON", 1, 1);
        COUPON = enumC1005603wU2;
        EnumC1005603wU enumC1005603wU3 = new EnumC1005603wU("RANK", 2, 2);
        RANK = enumC1005603wU3;
        EnumC1005603wU enumC1005603wU4 = new EnumC1005603wU("CUT_PRICE", 3, 3);
        CUT_PRICE = enumC1005603wU4;
        EnumC1005603wU enumC1005603wU5 = new EnumC1005603wU("OUT_APP", 4, 4);
        OUT_APP = enumC1005603wU5;
        EnumC1005603wU[] enumC1005603wUArr = {enumC1005603wU, enumC1005603wU2, enumC1005603wU3, enumC1005603wU4, enumC1005603wU5};
        LLILLJJLI = enumC1005603wUArr;
        LLILLL = new C2254308sP(enumC1005603wUArr);
    }

    public static EnumC1005603wU[] values() {
        return (EnumC1005603wU[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1005603wU valueOf(String str) {
        return (EnumC1005603wU) C08FF.LIZ(EnumC1005603wU.class, str);
    }

    public EnumC1005603wU(String str, int i, int i2) {
        this.LL = i2;
    }
}
