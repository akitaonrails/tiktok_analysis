package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0yTO, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes28.dex */
public final class EnumC1858880yTO {
    public static final /* synthetic */ EnumC1858880yTO[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1858880yTO TAKO_GOODS;
    public static final EnumC1858880yTO TAKO_HORIZONTAL_USER;
    public static final EnumC1858880yTO TAKO_HORIZONTAL_VIDEO;
    public static final EnumC1858880yTO TAKO_IMAGE;
    public static final EnumC1858880yTO TAKO_INTENT_VIDEO;
    public static final EnumC1858880yTO TAKO_INTERACTION;
    public static final EnumC1858880yTO TAKO_LYNX;
    public static final EnumC1858880yTO TAKO_MARKDOWN_TEXT;
    public static final EnumC1858880yTO TAKO_MESSAGE_DISCLAIMER;
    public static final EnumC1858880yTO TAKO_USER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1858880yTO> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1858880yTO enumC1858880yTO = new EnumC1858880yTO("TAKO_MARKDOWN_TEXT", 0, "tako_markdown_text");
        TAKO_MARKDOWN_TEXT = enumC1858880yTO;
        EnumC1858880yTO enumC1858880yTO2 = new EnumC1858880yTO("TAKO_USER", 1, "tako_user");
        TAKO_USER = enumC1858880yTO2;
        EnumC1858880yTO enumC1858880yTO3 = new EnumC1858880yTO("TAKO_MESSAGE_DISCLAIMER", 2, "tako_message_disclaimer");
        TAKO_MESSAGE_DISCLAIMER = enumC1858880yTO3;
        EnumC1858880yTO enumC1858880yTO4 = new EnumC1858880yTO("TAKO_INTERACTION", 3, "tako_interaction");
        TAKO_INTERACTION = enumC1858880yTO4;
        EnumC1858880yTO enumC1858880yTO5 = new EnumC1858880yTO("TAKO_HORIZONTAL_VIDEO", 4, "tako_horizontal_video");
        TAKO_HORIZONTAL_VIDEO = enumC1858880yTO5;
        EnumC1858880yTO enumC1858880yTO6 = new EnumC1858880yTO("TAKO_INTENT_VIDEO", 5, "tako_intent_video");
        TAKO_INTENT_VIDEO = enumC1858880yTO6;
        EnumC1858880yTO enumC1858880yTO7 = new EnumC1858880yTO("TAKO_IMAGE", 6, "tako_image");
        TAKO_IMAGE = enumC1858880yTO7;
        EnumC1858880yTO enumC1858880yTO8 = new EnumC1858880yTO("TAKO_GOODS", 7, "tako_goods");
        TAKO_GOODS = enumC1858880yTO8;
        EnumC1858880yTO enumC1858880yTO9 = new EnumC1858880yTO("TAKO_HORIZONTAL_USER", 8, "tako_horizontal_user");
        TAKO_HORIZONTAL_USER = enumC1858880yTO9;
        EnumC1858880yTO enumC1858880yTO10 = new EnumC1858880yTO("TAKO_LYNX", 9, "tako_lynx");
        TAKO_LYNX = enumC1858880yTO10;
        EnumC1858880yTO[] enumC1858880yTOArr = {enumC1858880yTO, enumC1858880yTO2, enumC1858880yTO3, enumC1858880yTO4, enumC1858880yTO5, enumC1858880yTO6, enumC1858880yTO7, enumC1858880yTO8, enumC1858880yTO9, enumC1858880yTO10};
        LLILLJJLI = enumC1858880yTOArr;
        LLILLL = new C2254308sP(enumC1858880yTOArr);
    }

    public static EnumC1858880yTO[] values() {
        return (EnumC1858880yTO[]) LLILLJJLI.clone();
    }

    public final String getTag() {
        return this.LL;
    }

    public static EnumC1858880yTO valueOf(String str) {
        return (EnumC1858880yTO) C08FF.LIZ(EnumC1858880yTO.class, str);
    }

    public EnumC1858880yTO(String str, int i, String str2) {
        this.LL = str2;
    }
}
