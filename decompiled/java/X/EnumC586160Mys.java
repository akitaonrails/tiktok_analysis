package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Mys, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC586160Mys {
    public static final /* synthetic */ EnumC586160Mys[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC586160Mys POI_FEED_FILTER_TYPE_CATEGORY;
    public static final EnumC586160Mys POI_FEED_FILTER_TYPE_HOTEL_STAR_RATING;
    public static final EnumC586160Mys POI_FEED_FILTER_TYPE_LODGING_TYPE;
    public static final EnumC586160Mys POI_FEED_FILTER_TYPE_REVIEW_RATING;
    public static final EnumC586160Mys POI_FEED_FILTER_TYPE_UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<EnumC586160Mys> getEntries() {
        return LLILLL;
    }

    static {
        EnumC586160Mys enumC586160Mys = new EnumC586160Mys("POI_FEED_FILTER_TYPE_UNKNOWN", 0, 0);
        POI_FEED_FILTER_TYPE_UNKNOWN = enumC586160Mys;
        EnumC586160Mys enumC586160Mys2 = new EnumC586160Mys("POI_FEED_FILTER_TYPE_CATEGORY", 1, 1);
        POI_FEED_FILTER_TYPE_CATEGORY = enumC586160Mys2;
        EnumC586160Mys enumC586160Mys3 = new EnumC586160Mys("POI_FEED_FILTER_TYPE_LODGING_TYPE", 2, 2);
        POI_FEED_FILTER_TYPE_LODGING_TYPE = enumC586160Mys3;
        EnumC586160Mys enumC586160Mys4 = new EnumC586160Mys("POI_FEED_FILTER_TYPE_REVIEW_RATING", 3, 3);
        POI_FEED_FILTER_TYPE_REVIEW_RATING = enumC586160Mys4;
        EnumC586160Mys enumC586160Mys5 = new EnumC586160Mys("POI_FEED_FILTER_TYPE_HOTEL_STAR_RATING", 4, 4);
        POI_FEED_FILTER_TYPE_HOTEL_STAR_RATING = enumC586160Mys5;
        EnumC586160Mys[] enumC586160MysArr = {enumC586160Mys, enumC586160Mys2, enumC586160Mys3, enumC586160Mys4, enumC586160Mys5};
        LLILLJJLI = enumC586160MysArr;
        LLILLL = new C2254308sP(enumC586160MysArr);
    }

    public static EnumC586160Mys[] values() {
        return (EnumC586160Mys[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC586160Mys valueOf(String str) {
        return (EnumC586160Mys) C08FF.LIZ(EnumC586160Mys.class, str);
    }

    public EnumC586160Mys(String str, int i, int i2) {
        this.LL = i2;
    }
}
