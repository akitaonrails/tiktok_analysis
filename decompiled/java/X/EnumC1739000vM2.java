package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vM2, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1739000vM2 {
    public static final EnumC1739000vM2 CAMPAIGN;
    public static final EnumC1739000vM2 CATEGORY;
    public static final EnumC1739000vM2 HOME;
    public static final /* synthetic */ EnumC1739000vM2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1739000vM2 PRODUCT;
    public static final EnumC1739000vM2 UNDEFINED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1739000vM2> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1739000vM2 enumC1739000vM2 = new EnumC1739000vM2("UNDEFINED", 0, "-1");
        UNDEFINED = enumC1739000vM2;
        EnumC1739000vM2 enumC1739000vM22 = new EnumC1739000vM2("HOME", 1, "1");
        HOME = enumC1739000vM22;
        EnumC1739000vM2 enumC1739000vM23 = new EnumC1739000vM2("PRODUCT", 2, "2");
        PRODUCT = enumC1739000vM23;
        EnumC1739000vM2 enumC1739000vM24 = new EnumC1739000vM2("CATEGORY", 3, "3");
        CATEGORY = enumC1739000vM24;
        EnumC1739000vM2 enumC1739000vM25 = new EnumC1739000vM2("CAMPAIGN", 4, "4");
        CAMPAIGN = enumC1739000vM25;
        EnumC1739000vM2[] enumC1739000vM2Arr = {enumC1739000vM2, enumC1739000vM22, enumC1739000vM23, enumC1739000vM24, enumC1739000vM25};
        LLILLJJLI = enumC1739000vM2Arr;
        LLILLL = new C2254308sP(enumC1739000vM2Arr);
    }

    public static EnumC1739000vM2[] values() {
        return (EnumC1739000vM2[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1739000vM2 valueOf(String str) {
        return (EnumC1739000vM2) C08FF.LIZ(EnumC1739000vM2.class, str);
    }

    public EnumC1739000vM2(String str, int i, String str2) {
        this.LL = str2;
    }
}
