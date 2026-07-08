package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ghC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1175520ghC {
    public static final EnumC1175520ghC FOLDED_AREA_PANEL;
    public static final EnumC1175520ghC ITEM_COMMENT_PANEL;
    public static final /* synthetic */ EnumC1175520ghC[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1175520ghC POI_DEAILE_PAGE_MERGED;
    public static final EnumC1175520ghC POI_DETAIL_PAGE;
    public static final EnumC1175520ghC POI_DETAIL_PAGE_2TAB;
    public static final EnumC1175520ghC POI_REVIEW_LANDING;
    public static final EnumC1175520ghC POI_REVIEW_LANDING_2TAB;
    public static final EnumC1175520ghC POI_REVIEW_TAG_FILER;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1175520ghC> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1175520ghC enumC1175520ghC = new EnumC1175520ghC("POI_DETAIL_PAGE", 0, 1);
        POI_DETAIL_PAGE = enumC1175520ghC;
        EnumC1175520ghC enumC1175520ghC2 = new EnumC1175520ghC("POI_REVIEW_LANDING", 1, 2);
        POI_REVIEW_LANDING = enumC1175520ghC2;
        EnumC1175520ghC enumC1175520ghC3 = new EnumC1175520ghC("POI_DEAILE_PAGE_MERGED", 2, 3);
        POI_DEAILE_PAGE_MERGED = enumC1175520ghC3;
        EnumC1175520ghC enumC1175520ghC4 = new EnumC1175520ghC("POI_REVIEW_TAG_FILER", 3, 5);
        POI_REVIEW_TAG_FILER = enumC1175520ghC4;
        EnumC1175520ghC enumC1175520ghC5 = new EnumC1175520ghC("POI_DETAIL_PAGE_2TAB", 4, 6);
        POI_DETAIL_PAGE_2TAB = enumC1175520ghC5;
        EnumC1175520ghC enumC1175520ghC6 = new EnumC1175520ghC("POI_REVIEW_LANDING_2TAB", 5, 7);
        POI_REVIEW_LANDING_2TAB = enumC1175520ghC6;
        EnumC1175520ghC enumC1175520ghC7 = new EnumC1175520ghC("ITEM_COMMENT_PANEL", 6, 100);
        ITEM_COMMENT_PANEL = enumC1175520ghC7;
        EnumC1175520ghC enumC1175520ghC8 = new EnumC1175520ghC("FOLDED_AREA_PANEL", 7, 101);
        FOLDED_AREA_PANEL = enumC1175520ghC8;
        EnumC1175520ghC[] enumC1175520ghCArr = {enumC1175520ghC, enumC1175520ghC2, enumC1175520ghC3, enumC1175520ghC4, enumC1175520ghC5, enumC1175520ghC6, enumC1175520ghC7, enumC1175520ghC8};
        LLILLJJLI = enumC1175520ghCArr;
        LLILLL = new C2254308sP(enumC1175520ghCArr);
    }

    public static EnumC1175520ghC[] values() {
        return (EnumC1175520ghC[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1175520ghC valueOf(String str) {
        return (EnumC1175520ghC) C08FF.LIZ(EnumC1175520ghC.class, str);
    }

    public EnumC1175520ghC(String str, int i, int i2) {
        this.LL = i2;
    }
}
