package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QXi, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC671960QXi {
    public static final EnumC671960QXi EMPTY;
    public static final EnumC671960QXi FASHION;
    public static final EnumC671960QXi HOMEPAGE_MALL;
    public static final /* synthetic */ EnumC671960QXi[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC671960QXi MALL;
    public static final EnumC671960QXi OTHER;
    public static final EnumC671960QXi PDP;
    public static final EnumC671960QXi VIDEO_ANCHOR;
    public final String LL;

    public static InterfaceC2044707zh<EnumC671960QXi> getEntries() {
        return LLILLL;
    }

    static {
        EnumC671960QXi enumC671960QXi = new EnumC671960QXi("MALL", 0, "mall");
        MALL = enumC671960QXi;
        EnumC671960QXi enumC671960QXi2 = new EnumC671960QXi("HOMEPAGE_MALL", 1, "homepage_mall");
        HOMEPAGE_MALL = enumC671960QXi2;
        EnumC671960QXi enumC671960QXi3 = new EnumC671960QXi("PDP", 2, "product_detail");
        PDP = enumC671960QXi3;
        EnumC671960QXi enumC671960QXi4 = new EnumC671960QXi("EMPTY", 3, "");
        EMPTY = enumC671960QXi4;
        EnumC671960QXi enumC671960QXi5 = new EnumC671960QXi("FASHION", 4, "fashion");
        FASHION = enumC671960QXi5;
        EnumC671960QXi enumC671960QXi6 = new EnumC671960QXi("VIDEO_ANCHOR", 5, "video_product_anchor");
        VIDEO_ANCHOR = enumC671960QXi6;
        EnumC671960QXi enumC671960QXi7 = new EnumC671960QXi("OTHER", 6, "homepage_hot");
        OTHER = enumC671960QXi7;
        EnumC671960QXi[] enumC671960QXiArr = {enumC671960QXi, enumC671960QXi2, enumC671960QXi3, enumC671960QXi4, enumC671960QXi5, enumC671960QXi6, enumC671960QXi7};
        LLILLJJLI = enumC671960QXiArr;
        LLILLL = new C2254308sP(enumC671960QXiArr);
    }

    public static EnumC671960QXi[] values() {
        return (EnumC671960QXi[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC671960QXi valueOf(String str) {
        return (EnumC671960QXi) C08FF.LIZ(EnumC671960QXi.class, str);
    }

    public EnumC671960QXi(String str, int i, String str2) {
        this.LL = str2;
    }
}
