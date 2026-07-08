package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15zu, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC20703615zu {
    public static final EnumC20703615zu BEING_GENERATING;
    public static final EnumC20703615zu DO_NOT_TRANSLATE;
    public static final EnumC20703615zu EMBEDDED_CAPTION;
    public static final EnumC20703615zu LANGUAGE_NOT_SUPPORTED;
    public static final /* synthetic */ EnumC20703615zu[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC20703615zu NO_AUTHORIZATION;
    public static final EnumC20703615zu OTHERS;
    public static final EnumC20703615zu SPEECH_NOT_RECOGNIZED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC20703615zu> getEntries() {
        return LLILLL;
    }

    static {
        EnumC20703615zu enumC20703615zu = new EnumC20703615zu("LANGUAGE_NOT_SUPPORTED", 0, "language_not_supported");
        LANGUAGE_NOT_SUPPORTED = enumC20703615zu;
        EnumC20703615zu enumC20703615zu2 = new EnumC20703615zu("NO_AUTHORIZATION", 1, "no_authorization");
        NO_AUTHORIZATION = enumC20703615zu2;
        EnumC20703615zu enumC20703615zu3 = new EnumC20703615zu("OTHERS", 2, "others");
        OTHERS = enumC20703615zu3;
        EnumC20703615zu enumC20703615zu4 = new EnumC20703615zu("SPEECH_NOT_RECOGNIZED", 3, "speech_not_recognized");
        SPEECH_NOT_RECOGNIZED = enumC20703615zu4;
        EnumC20703615zu enumC20703615zu5 = new EnumC20703615zu("BEING_GENERATING", 4, "being_generating");
        BEING_GENERATING = enumC20703615zu5;
        EnumC20703615zu enumC20703615zu6 = new EnumC20703615zu("EMBEDDED_CAPTION", 5, "embedded_caption");
        EMBEDDED_CAPTION = enumC20703615zu6;
        EnumC20703615zu enumC20703615zu7 = new EnumC20703615zu("DO_NOT_TRANSLATE", 6, "do_not_translate");
        DO_NOT_TRANSLATE = enumC20703615zu7;
        EnumC20703615zu[] enumC20703615zuArr = {enumC20703615zu, enumC20703615zu2, enumC20703615zu3, enumC20703615zu4, enumC20703615zu5, enumC20703615zu6, enumC20703615zu7};
        LLILLJJLI = enumC20703615zuArr;
        LLILLL = new C2254308sP(enumC20703615zuArr);
    }

    public static EnumC20703615zu[] values() {
        return (EnumC20703615zu[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC20703615zu valueOf(String str) {
        return (EnumC20703615zu) C08FF.LIZ(EnumC20703615zu.class, str);
    }

    public EnumC20703615zu(String str, int i, String str2) {
        this.LL = str2;
    }
}
