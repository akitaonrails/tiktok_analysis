package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0q86, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes24.dex */
public final class EnumC1538160q86 {
    public static final /* synthetic */ EnumC1538160q86[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1538160q86 TEMPLATE_ARRAY;
    public static final EnumC1538160q86 TEMPLATE_ARRAY_PRELOAD_TEMPLATE;
    public static final EnumC1538160q86 TEMPLATE_BUNDLE_PARSE_EXTRA;
    public static final EnumC1538160q86 TEMPLATE_BUNDLE_PRE_DECODE;
    public static final EnumC1538160q86 TEMPLATE_SSR;
    public static final EnumC1538160q86 UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1538160q86> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1538160q86 enumC1538160q86 = new EnumC1538160q86("TEMPLATE_BUNDLE_PRE_DECODE", 0, "templateBundle-preDecode");
        TEMPLATE_BUNDLE_PRE_DECODE = enumC1538160q86;
        EnumC1538160q86 enumC1538160q862 = new EnumC1538160q86("TEMPLATE_BUNDLE_PARSE_EXTRA", 1, "templateBundle-parseExtra");
        TEMPLATE_BUNDLE_PARSE_EXTRA = enumC1538160q862;
        EnumC1538160q86 enumC1538160q863 = new EnumC1538160q86("TEMPLATE_ARRAY_PRELOAD_TEMPLATE", 2, "templateArray-preloadTemplate");
        TEMPLATE_ARRAY_PRELOAD_TEMPLATE = enumC1538160q863;
        EnumC1538160q86 enumC1538160q864 = new EnumC1538160q86("TEMPLATE_ARRAY", 3, "templateArray");
        TEMPLATE_ARRAY = enumC1538160q864;
        EnumC1538160q86 enumC1538160q865 = new EnumC1538160q86("TEMPLATE_SSR", 4, "templateSSR");
        TEMPLATE_SSR = enumC1538160q865;
        EnumC1538160q86 enumC1538160q866 = new EnumC1538160q86("UNKNOWN", 5, "unknown");
        UNKNOWN = enumC1538160q866;
        EnumC1538160q86[] enumC1538160q86Arr = {enumC1538160q86, enumC1538160q862, enumC1538160q863, enumC1538160q864, enumC1538160q865, enumC1538160q866};
        LLILLJJLI = enumC1538160q86Arr;
        LLILLL = new C2254308sP(enumC1538160q86Arr);
    }

    public static EnumC1538160q86[] values() {
        return (EnumC1538160q86[]) LLILLJJLI.clone();
    }

    public final String getFrom() {
        return this.LL;
    }

    public static EnumC1538160q86 valueOf(String str) {
        return (EnumC1538160q86) C08FF.LIZ(EnumC1538160q86.class, str);
    }

    public EnumC1538160q86(String str, int i, String str2) {
        this.LL = str2;
    }
}
