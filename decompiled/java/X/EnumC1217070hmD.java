package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0hmD, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1217070hmD {
    public static final EnumC1217070hmD CREATOR;
    public static final EnumC1217070hmD CUT_PRICE;
    public static final /* synthetic */ EnumC1217070hmD[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1217070hmD> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1217070hmD enumC1217070hmD = new EnumC1217070hmD("CREATOR", 0, 1);
        CREATOR = enumC1217070hmD;
        EnumC1217070hmD enumC1217070hmD2 = new EnumC1217070hmD("CUT_PRICE", 1, 2);
        CUT_PRICE = enumC1217070hmD2;
        EnumC1217070hmD[] enumC1217070hmDArr = {enumC1217070hmD, enumC1217070hmD2};
        LLILLJJLI = enumC1217070hmDArr;
        LLILLL = new C2254308sP(enumC1217070hmDArr);
    }

    public static EnumC1217070hmD[] values() {
        return (EnumC1217070hmD[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1217070hmD valueOf(String str) {
        return (EnumC1217070hmD) C08FF.LIZ(EnumC1217070hmD.class, str);
    }

    public EnumC1217070hmD(String str, int i, int i2) {
        this.LL = i2;
    }
}
