package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0nDd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes23.dex */
public final class EnumC1426270nDd {
    public static final /* synthetic */ EnumC1426270nDd[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1426270nDd NORMAL_SEARCH;
    public static final EnumC1426270nDd SEARCH_HISTORY;
    public static final EnumC1426270nDd SEARCH_SUG;
    public static final EnumC1426270nDd SEARCH_TRENDING;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1426270nDd> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1426270nDd enumC1426270nDd = new EnumC1426270nDd("NORMAL_SEARCH", 0, "normal_search");
        NORMAL_SEARCH = enumC1426270nDd;
        EnumC1426270nDd enumC1426270nDd2 = new EnumC1426270nDd("SEARCH_SUG", 1, "search_sug");
        SEARCH_SUG = enumC1426270nDd2;
        EnumC1426270nDd enumC1426270nDd3 = new EnumC1426270nDd("SEARCH_HISTORY", 2, "search_history");
        SEARCH_HISTORY = enumC1426270nDd3;
        EnumC1426270nDd enumC1426270nDd4 = new EnumC1426270nDd("SEARCH_TRENDING", 3, "trending_editing_effect");
        SEARCH_TRENDING = enumC1426270nDd4;
        EnumC1426270nDd[] enumC1426270nDdArr = {enumC1426270nDd, enumC1426270nDd2, enumC1426270nDd3, enumC1426270nDd4};
        LLILLJJLI = enumC1426270nDdArr;
        LLILLL = new C2254308sP(enumC1426270nDdArr);
    }

    public static EnumC1426270nDd[] values() {
        return (EnumC1426270nDd[]) LLILLJJLI.clone();
    }

    public final String getMethodKey() {
        return this.LL;
    }

    public static EnumC1426270nDd valueOf(String str) {
        return (EnumC1426270nDd) C08FF.LIZ(EnumC1426270nDd.class, str);
    }

    public EnumC1426270nDd(String str, int i, String str2) {
        this.LL = str2;
    }
}
