package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0guX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1183790guX {
    public static final EnumC1183790guX DIFF_AREA;
    public static final /* synthetic */ EnumC1183790guX[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1183790guX ON_TRIP;
    public static final EnumC1183790guX SAME_AREA;
    public static final EnumC1183790guX UNAVAILABLE;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1183790guX> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1183790guX enumC1183790guX = new EnumC1183790guX("SAME_AREA", 0, 1);
        SAME_AREA = enumC1183790guX;
        EnumC1183790guX enumC1183790guX2 = new EnumC1183790guX("ON_TRIP", 1, 2);
        ON_TRIP = enumC1183790guX2;
        EnumC1183790guX enumC1183790guX3 = new EnumC1183790guX("DIFF_AREA", 2, 3);
        DIFF_AREA = enumC1183790guX3;
        EnumC1183790guX enumC1183790guX4 = new EnumC1183790guX("UNAVAILABLE", 3, 4);
        UNAVAILABLE = enumC1183790guX4;
        EnumC1183790guX[] enumC1183790guXArr = {enumC1183790guX, enumC1183790guX2, enumC1183790guX3, enumC1183790guX4};
        LLILLJJLI = enumC1183790guXArr;
        LLILLL = new C2254308sP(enumC1183790guXArr);
    }

    public static EnumC1183790guX[] values() {
        return (EnumC1183790guX[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1183790guX valueOf(String str) {
        return (EnumC1183790guX) C08FF.LIZ(EnumC1183790guX.class, str);
    }

    public EnumC1183790guX(String str, int i, int i2) {
        this.LL = i2;
    }
}
