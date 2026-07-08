package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0CGk, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC310840CGk {
    public static final EnumC310840CGk CUT_PRICE;
    public static final /* synthetic */ EnumC310840CGk[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC310840CGk UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC310840CGk> getEntries() {
        return LLILLL;
    }

    static {
        EnumC310840CGk enumC310840CGk = new EnumC310840CGk("UNKNOWN", 0, 0);
        UNKNOWN = enumC310840CGk;
        EnumC310840CGk enumC310840CGk2 = new EnumC310840CGk("CUT_PRICE", 1, 1);
        CUT_PRICE = enumC310840CGk2;
        EnumC310840CGk[] enumC310840CGkArr = {enumC310840CGk, enumC310840CGk2};
        LLILLJJLI = enumC310840CGkArr;
        LLILLL = new C2254308sP(enumC310840CGkArr);
    }

    public static EnumC310840CGk[] values() {
        return (EnumC310840CGk[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC310840CGk valueOf(String str) {
        return (EnumC310840CGk) C08FF.LIZ(EnumC310840CGk.class, str);
    }

    public EnumC310840CGk(String str, int i, int i2) {
        this.LL = i2;
    }
}
