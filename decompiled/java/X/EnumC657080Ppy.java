package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ppy, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC657080Ppy {
    public static final EnumC657080Ppy BEST_MATCH;
    public static final /* synthetic */ EnumC657080Ppy[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC657080Ppy POI_DISTANCE;
    public static final EnumC657080Ppy TRENDING_NORMAL;
    public static final EnumC657080Ppy TRENDING_SAD;
    public final String LL;

    public static InterfaceC2044707zh<EnumC657080Ppy> getEntries() {
        return LLILLL;
    }

    static {
        EnumC657080Ppy enumC657080Ppy = new EnumC657080Ppy("TRENDING_NORMAL", 0, "trending_normal");
        TRENDING_NORMAL = enumC657080Ppy;
        EnumC657080Ppy enumC657080Ppy2 = new EnumC657080Ppy("TRENDING_SAD", 1, "trending_sad");
        TRENDING_SAD = enumC657080Ppy2;
        EnumC657080Ppy enumC657080Ppy3 = new EnumC657080Ppy("POI_DISTANCE", 2, "POIDistance");
        POI_DISTANCE = enumC657080Ppy3;
        EnumC657080Ppy enumC657080Ppy4 = new EnumC657080Ppy("BEST_MATCH", 3, "BestMatch");
        BEST_MATCH = enumC657080Ppy4;
        EnumC657080Ppy[] enumC657080PpyArr = {enumC657080Ppy, enumC657080Ppy2, enumC657080Ppy3, enumC657080Ppy4};
        LLILLJJLI = enumC657080PpyArr;
        LLILLL = new C2254308sP(enumC657080PpyArr);
    }

    public static EnumC657080Ppy[] values() {
        return (EnumC657080Ppy[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC657080Ppy valueOf(String str) {
        return (EnumC657080Ppy) C08FF.LIZ(EnumC657080Ppy.class, str);
    }

    public EnumC657080Ppy(String str, int i, String str2) {
        this.LL = str2;
    }
}
