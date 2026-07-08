package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0vOX, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes27.dex */
public final class EnumC1740550vOX {
    public static final EnumC1740550vOX BUILD;
    public static final EnumC1740550vOX JSON_PARSE;
    public static final /* synthetic */ EnumC1740550vOX[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1740550vOX PAGE_SOURCE_INFO;
    public static final EnumC1740550vOX QUERY;
    public static final EnumC1740550vOX SPLIT;
    public static final EnumC1740550vOX STATIC;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1740550vOX> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1740550vOX enumC1740550vOX = new EnumC1740550vOX("QUERY", 0, "query");
        QUERY = enumC1740550vOX;
        EnumC1740550vOX enumC1740550vOX2 = new EnumC1740550vOX("STATIC", 1, "static");
        STATIC = enumC1740550vOX2;
        EnumC1740550vOX enumC1740550vOX3 = new EnumC1740550vOX("BUILD", 2, "build");
        BUILD = enumC1740550vOX3;
        EnumC1740550vOX enumC1740550vOX4 = new EnumC1740550vOX("PAGE_SOURCE_INFO", 3, "page_source_info");
        PAGE_SOURCE_INFO = enumC1740550vOX4;
        EnumC1740550vOX enumC1740550vOX5 = new EnumC1740550vOX("SPLIT", 4, "split");
        SPLIT = enumC1740550vOX5;
        EnumC1740550vOX enumC1740550vOX6 = new EnumC1740550vOX("JSON_PARSE", 5, "json_parse");
        JSON_PARSE = enumC1740550vOX6;
        EnumC1740550vOX[] enumC1740550vOXArr = {enumC1740550vOX, enumC1740550vOX2, enumC1740550vOX3, enumC1740550vOX4, enumC1740550vOX5, enumC1740550vOX6};
        LLILLJJLI = enumC1740550vOXArr;
        LLILLL = new C2254308sP(enumC1740550vOXArr);
    }

    public static EnumC1740550vOX[] values() {
        return (EnumC1740550vOX[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC1740550vOX valueOf(String str) {
        return (EnumC1740550vOX) C08FF.LIZ(EnumC1740550vOX.class, str);
    }

    public EnumC1740550vOX(String str, int i, String str2) {
        this.LL = str2;
    }
}
