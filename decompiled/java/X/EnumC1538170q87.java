package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0q87, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1538170q87 {
    public static final /* synthetic */ EnumC1538170q87[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1538170q87 TEMPLATE_ARRAY;
    public static final EnumC1538170q87 TEMPLATE_ARRAY_PRELOAD_TEMPLATE;
    public static final EnumC1538170q87 TEMPLATE_BUNDLE_PARSE_EXTRA;
    public static final EnumC1538170q87 TEMPLATE_BUNDLE_PRE_DECODE;
    public static final EnumC1538170q87 TEMPLATE_SSR;
    public static final EnumC1538170q87 UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1538170q87> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1538170q87 enumC1538170q87 = new EnumC1538170q87("TEMPLATE_BUNDLE_PRE_DECODE", 0, "templateBundle-preDecode");
        TEMPLATE_BUNDLE_PRE_DECODE = enumC1538170q87;
        EnumC1538170q87 enumC1538170q872 = new EnumC1538170q87("TEMPLATE_BUNDLE_PARSE_EXTRA", 1, "templateBundle-parseExtra");
        TEMPLATE_BUNDLE_PARSE_EXTRA = enumC1538170q872;
        EnumC1538170q87 enumC1538170q873 = new EnumC1538170q87("TEMPLATE_ARRAY_PRELOAD_TEMPLATE", 2, "templateArray-preloadTemplate");
        TEMPLATE_ARRAY_PRELOAD_TEMPLATE = enumC1538170q873;
        EnumC1538170q87 enumC1538170q874 = new EnumC1538170q87("TEMPLATE_ARRAY", 3, "templateArray");
        TEMPLATE_ARRAY = enumC1538170q874;
        EnumC1538170q87 enumC1538170q875 = new EnumC1538170q87("TEMPLATE_SSR", 4, "templateSSR");
        TEMPLATE_SSR = enumC1538170q875;
        EnumC1538170q87 enumC1538170q876 = new EnumC1538170q87("UNKNOWN", 5, "unknown");
        UNKNOWN = enumC1538170q876;
        EnumC1538170q87[] enumC1538170q87Arr = {enumC1538170q87, enumC1538170q872, enumC1538170q873, enumC1538170q874, enumC1538170q875, enumC1538170q876};
        LLILLJJLI = enumC1538170q87Arr;
        LLILLL = new C2254308sP(enumC1538170q87Arr);
    }

    public static EnumC1538170q87[] values() {
        return (EnumC1538170q87[]) LLILLJJLI.clone();
    }

    public final String getFrom() {
        return this.LL;
    }

    public static EnumC1538170q87 valueOf(String str) {
        return (EnumC1538170q87) C08FF.LIZ(EnumC1538170q87.class, str);
    }

    public EnumC1538170q87(String str, int i, String str2) {
        this.LL = str2;
    }
}
