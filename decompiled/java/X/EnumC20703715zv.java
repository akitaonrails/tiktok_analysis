package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15zv, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20703715zv {
    public static final EnumC20703715zv BEING_GENERATING;
    public static final EnumC20703715zv DO_NOT_TRANSLATE;
    public static final EnumC20703715zv EMBEDDED_CAPTION;
    public static final EnumC20703715zv LANGUAGE_NOT_SUPPORTED;
    public static final /* synthetic */ EnumC20703715zv[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20703715zv NO_AUTHORIZATION;
    public static final EnumC20703715zv OTHERS;
    public static final EnumC20703715zv SPEECH_NOT_RECOGNIZED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20703715zv> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20703715zv enumC20703715zv = new EnumC20703715zv("LANGUAGE_NOT_SUPPORTED", 0, "language_not_supported");
        LANGUAGE_NOT_SUPPORTED = enumC20703715zv;
        EnumC20703715zv enumC20703715zv2 = new EnumC20703715zv("NO_AUTHORIZATION", 1, "no_authorization");
        NO_AUTHORIZATION = enumC20703715zv2;
        EnumC20703715zv enumC20703715zv3 = new EnumC20703715zv("OTHERS", 2, "others");
        OTHERS = enumC20703715zv3;
        EnumC20703715zv enumC20703715zv4 = new EnumC20703715zv("SPEECH_NOT_RECOGNIZED", 3, "speech_not_recognized");
        SPEECH_NOT_RECOGNIZED = enumC20703715zv4;
        EnumC20703715zv enumC20703715zv5 = new EnumC20703715zv("BEING_GENERATING", 4, "being_generating");
        BEING_GENERATING = enumC20703715zv5;
        EnumC20703715zv enumC20703715zv6 = new EnumC20703715zv("EMBEDDED_CAPTION", 5, "embedded_caption");
        EMBEDDED_CAPTION = enumC20703715zv6;
        EnumC20703715zv enumC20703715zv7 = new EnumC20703715zv("DO_NOT_TRANSLATE", 6, "do_not_translate");
        DO_NOT_TRANSLATE = enumC20703715zv7;
        EnumC20703715zv[] enumC20703715zvArr = {enumC20703715zv, enumC20703715zv2, enumC20703715zv3, enumC20703715zv4, enumC20703715zv5, enumC20703715zv6, enumC20703715zv7};
        LLILLJJLI = enumC20703715zvArr;
        LLILLL = new C2254308sP(enumC20703715zvArr);
    }

    public static EnumC20703715zv[] values() {
        return (EnumC20703715zv[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC20703715zv valueOf(String str) {
        return (EnumC20703715zv) C08FF.LIZ(EnumC20703715zv.class, str);
    }

    public EnumC20703715zv(String str, int i, String str2) {
        this.LL = str2;
    }
}
