package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Pll, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC654470Pll implements InterfaceC654480Plm {
    public static final EnumC654470Pll COMMON;
    public static final /* synthetic */ EnumC654470Pll[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC654470Pll SEARCH_SAF;
    public static final EnumC654470Pll TOP_1_MULTIPLE_DOC;
    public final String LL;
    public final String LLILLJJLI;

    public EnumC654470Pll() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC654470Pll> getEntries() {
        return LLILZ;
    }

    static {
        EnumC654470Pll enumC654470Pll = new EnumC654470Pll("COMMON", 0, "common");
        COMMON = enumC654470Pll;
        EnumC654470Pll enumC654470Pll2 = new EnumC654470Pll("TOP_1_MULTIPLE_DOC", 1, "top_1_multiple_doc");
        TOP_1_MULTIPLE_DOC = enumC654470Pll2;
        EnumC654470Pll enumC654470Pll3 = new EnumC654470Pll("SEARCH_SAF", 2, "search_saf");
        SEARCH_SAF = enumC654470Pll3;
        EnumC654470Pll[] enumC654470PllArr = {enumC654470Pll, enumC654470Pll2, enumC654470Pll3};
        LLILLL = enumC654470PllArr;
        LLILZ = new C2254308sP(enumC654470PllArr);
    }

    public static EnumC654470Pll[] values() {
        return (EnumC654470Pll[]) LLILLL.clone();
    }

    @Override // X.InterfaceC664500Q4q
    public String getCatalog() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC664500Q4q
    public String getSubcategory() {
        return this.LL;
    }

    public static EnumC654470Pll valueOf(String str) {
        return (EnumC654470Pll) C08FF.LIZ(EnumC654470Pll.class, str);
    }

    public EnumC654470Pll(String str, int i, String str2) {
        this.LL = str2;
        this.LLILLJJLI = "comprehensive";
    }
}
