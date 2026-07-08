package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0kXX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes21.dex */
public final class EnumC1323290kXX {
    public static final EnumC1323290kXX FAIL;
    public static final EnumC1323290kXX INIT;
    public static final /* synthetic */ EnumC1323290kXX[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1323290kXX LOADING;
    public static final EnumC1323290kXX SUCCESS;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1323290kXX> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1323290kXX enumC1323290kXX = new EnumC1323290kXX("INIT", 0, 0);
        INIT = enumC1323290kXX;
        EnumC1323290kXX enumC1323290kXX2 = new EnumC1323290kXX("LOADING", 1, 1);
        LOADING = enumC1323290kXX2;
        EnumC1323290kXX enumC1323290kXX3 = new EnumC1323290kXX("SUCCESS", 2, 2);
        SUCCESS = enumC1323290kXX3;
        EnumC1323290kXX enumC1323290kXX4 = new EnumC1323290kXX("FAIL", 3, 3);
        FAIL = enumC1323290kXX4;
        EnumC1323290kXX[] enumC1323290kXXArr = {enumC1323290kXX, enumC1323290kXX2, enumC1323290kXX3, enumC1323290kXX4};
        LLILLJJLI = enumC1323290kXXArr;
        LLILLL = new C2254308sP(enumC1323290kXXArr);
    }

    public static EnumC1323290kXX[] values() {
        return (EnumC1323290kXX[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1323290kXX valueOf(String str) {
        return (EnumC1323290kXX) C08FF.LIZ(EnumC1323290kXX.class, str);
    }

    public EnumC1323290kXX(String str, int i, int i2) {
        this.LL = i2;
    }
}
