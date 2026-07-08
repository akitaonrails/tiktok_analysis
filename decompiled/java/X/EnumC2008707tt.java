package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.07tt, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public final class EnumC2008707tt {
    public static final /* synthetic */ EnumC2008707tt[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC2008707tt SEARCH_IAC_MULTI_AD_MULTI_PRODUCT;
    public static final EnumC2008707tt SEARCH_IAC_SINGLE_AD_MULTI_PRODUCT;
    public static final EnumC2008707tt SEARCH_IAC_SINGLE_AD_SINGLE_PRODUCT;
    public final int LL;

    public static InterfaceC2044707zh<EnumC2008707tt> getEntries() {
        return LLILLL;
    }

    static {
        EnumC2008707tt enumC2008707tt = new EnumC2008707tt("SEARCH_IAC_SINGLE_AD_SINGLE_PRODUCT", 0, 17);
        SEARCH_IAC_SINGLE_AD_SINGLE_PRODUCT = enumC2008707tt;
        EnumC2008707tt enumC2008707tt2 = new EnumC2008707tt("SEARCH_IAC_SINGLE_AD_MULTI_PRODUCT", 1, 18);
        SEARCH_IAC_SINGLE_AD_MULTI_PRODUCT = enumC2008707tt2;
        EnumC2008707tt enumC2008707tt3 = new EnumC2008707tt("SEARCH_IAC_MULTI_AD_MULTI_PRODUCT", 2, 19);
        SEARCH_IAC_MULTI_AD_MULTI_PRODUCT = enumC2008707tt3;
        EnumC2008707tt[] enumC2008707ttArr = {enumC2008707tt, enumC2008707tt2, enumC2008707tt3};
        LLILLJJLI = enumC2008707ttArr;
        LLILLL = new C2254308sP(enumC2008707ttArr);
    }

    public static EnumC2008707tt[] values() {
        return (EnumC2008707tt[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC2008707tt valueOf(String str) {
        return (EnumC2008707tt) C08FF.LIZ(EnumC2008707tt.class, str);
    }

    public EnumC2008707tt(String str, int i, int i2) {
        this.LL = i2;
    }
}
