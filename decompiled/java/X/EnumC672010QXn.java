package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QXn, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC672010QXn {
    public static final /* synthetic */ EnumC672010QXn[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC672010QXn SOURCE_ANCHOR;
    public static final EnumC672010QXn SOURCE_MALL;
    public static final EnumC672010QXn SOURCE_MALL_MIDDLE;
    public static final EnumC672010QXn SOURCE_PDP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC672010QXn> getEntries() {
        return LLILLL;
    }

    static {
        EnumC672010QXn enumC672010QXn = new EnumC672010QXn("SOURCE_MALL", 0, "mall");
        SOURCE_MALL = enumC672010QXn;
        EnumC672010QXn enumC672010QXn2 = new EnumC672010QXn("SOURCE_PDP", 1, "product_detail");
        SOURCE_PDP = enumC672010QXn2;
        EnumC672010QXn enumC672010QXn3 = new EnumC672010QXn("SOURCE_ANCHOR", 2, "anchor_product");
        SOURCE_ANCHOR = enumC672010QXn3;
        EnumC672010QXn enumC672010QXn4 = new EnumC672010QXn("SOURCE_MALL_MIDDLE", 3, "mall_middle_page");
        SOURCE_MALL_MIDDLE = enumC672010QXn4;
        EnumC672010QXn[] enumC672010QXnArr = {enumC672010QXn, enumC672010QXn2, enumC672010QXn3, enumC672010QXn4};
        LLILLJJLI = enumC672010QXnArr;
        LLILLL = new C2254308sP(enumC672010QXnArr);
    }

    public static EnumC672010QXn[] values() {
        return (EnumC672010QXn[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC672010QXn valueOf(String str) {
        return (EnumC672010QXn) C08FF.LIZ(EnumC672010QXn.class, str);
    }

    public EnumC672010QXn(String str, int i, String str2) {
        this.LL = str2;
    }
}
