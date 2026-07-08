package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0gCG, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes19.dex */
public final class EnumC1156340gCG {
    public static final /* synthetic */ EnumC1156340gCG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1156340gCG POI_REVIEW_ALL_TAB;
    public static final EnumC1156340gCG POI_REVIEW_OTHERS_TAB;
    public static final EnumC1156340gCG POI_REVIEW_TABELOG_TAB;
    public static final EnumC1156340gCG POI_REVIEW_TIKTOK_TAB;
    public static final EnumC1156340gCG POI_REVIEW_TRIPADVISOR_TAB;
    public final int LL;

    public static InterfaceC2044707zh<EnumC1156340gCG> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1156340gCG enumC1156340gCG = new EnumC1156340gCG("POI_REVIEW_ALL_TAB", 0, 0);
        POI_REVIEW_ALL_TAB = enumC1156340gCG;
        EnumC1156340gCG enumC1156340gCG2 = new EnumC1156340gCG("POI_REVIEW_TIKTOK_TAB", 1, 1);
        POI_REVIEW_TIKTOK_TAB = enumC1156340gCG2;
        EnumC1156340gCG enumC1156340gCG3 = new EnumC1156340gCG("POI_REVIEW_OTHERS_TAB", 2, 2);
        POI_REVIEW_OTHERS_TAB = enumC1156340gCG3;
        EnumC1156340gCG enumC1156340gCG4 = new EnumC1156340gCG("POI_REVIEW_TRIPADVISOR_TAB", 3, 3);
        POI_REVIEW_TRIPADVISOR_TAB = enumC1156340gCG4;
        EnumC1156340gCG enumC1156340gCG5 = new EnumC1156340gCG("POI_REVIEW_TABELOG_TAB", 4, 4);
        POI_REVIEW_TABELOG_TAB = enumC1156340gCG5;
        EnumC1156340gCG[] enumC1156340gCGArr = {enumC1156340gCG, enumC1156340gCG2, enumC1156340gCG3, enumC1156340gCG4, enumC1156340gCG5};
        LLILLJJLI = enumC1156340gCGArr;
        LLILLL = new C2254308sP(enumC1156340gCGArr);
    }

    public static EnumC1156340gCG[] values() {
        return (EnumC1156340gCG[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static EnumC1156340gCG valueOf(String str) {
        return (EnumC1156340gCG) C08FF.LIZ(EnumC1156340gCG.class, str);
    }

    public EnumC1156340gCG(String str, int i, int i2) {
        this.LL = i2;
    }
}
