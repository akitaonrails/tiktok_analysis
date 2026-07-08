package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.162h, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC207101162h {
    public static final EnumC207101162h ADS_PRIMARY_STICKER;
    public static final EnumC207101162h ALL;
    public static final EnumC207101162h CAPTION;
    public static final EnumC207101162h COMMENT;
    public static final EnumC207101162h COMMERCE;
    public static final EnumC207101162h DESCRIPTION;
    public static final EnumC207101162h DIRECT_MESSAGE;
    public static final EnumC207101162h DUBBING;
    public static final /* synthetic */ EnumC207101162h[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC207101162h PHOTO_TEXT;
    public static final EnumC207101162h PHOTO_TITLE;
    public static final EnumC207101162h STICKER;
    public static final EnumC207101162h UNKNOWN;
    public final EnumC207102162i LL;
    public final int LLILLJJLI;

    public static InterfaceC2044707zh<EnumC207101162h> getEntries() {
        return LLILZ;
    }

    static {
        EnumC207102162i enumC207102162i = EnumC207102162i.NONE;
        EnumC207101162h enumC207101162h = new EnumC207101162h("UNKNOWN", 0, enumC207102162i, -1);
        UNKNOWN = enumC207101162h;
        EnumC207101162h enumC207101162h2 = new EnumC207101162h("ALL", 1, enumC207102162i, 0);
        ALL = enumC207101162h2;
        EnumC207102162i enumC207102162i2 = EnumC207102162i.TEXT;
        EnumC207101162h enumC207101162h3 = new EnumC207101162h("DESCRIPTION", 2, enumC207102162i2, 1);
        DESCRIPTION = enumC207101162h3;
        EnumC207101162h enumC207101162h4 = new EnumC207101162h("CAPTION", 3, EnumC207102162i.CAPTION, 2);
        CAPTION = enumC207101162h4;
        EnumC207101162h enumC207101162h5 = new EnumC207101162h("STICKER", 4, EnumC207102162i.STICKER, 3);
        STICKER = enumC207101162h5;
        EnumC207101162h enumC207101162h6 = new EnumC207101162h("PHOTO_TITLE", 5, enumC207102162i2, 4);
        PHOTO_TITLE = enumC207101162h6;
        EnumC207101162h enumC207101162h7 = new EnumC207101162h("COMMENT", 6, EnumC207102162i.COMMENT, 5);
        COMMENT = enumC207101162h7;
        EnumC207101162h enumC207101162h8 = new EnumC207101162h("PHOTO_TEXT", 7, EnumC207102162i.PHOTO_TEXT, 6);
        PHOTO_TEXT = enumC207101162h8;
        EnumC207102162i enumC207102162i3 = EnumC207102162i.COMMERCE;
        EnumC207101162h enumC207101162h9 = new EnumC207101162h("ADS_PRIMARY_STICKER", 8, enumC207102162i3, 7);
        ADS_PRIMARY_STICKER = enumC207101162h9;
        EnumC207101162h enumC207101162h10 = new EnumC207101162h("COMMERCE", 9, enumC207102162i3, 8);
        COMMERCE = enumC207101162h10;
        EnumC207101162h enumC207101162h11 = new EnumC207101162h("DIRECT_MESSAGE", 10, EnumC207102162i.DIRECT_MESSAGE, 9);
        DIRECT_MESSAGE = enumC207101162h11;
        EnumC207101162h enumC207101162h12 = new EnumC207101162h("DUBBING", 11, EnumC207102162i.DUBBING, 10);
        DUBBING = enumC207101162h12;
        EnumC207101162h[] enumC207101162hArr = {enumC207101162h, enumC207101162h2, enumC207101162h3, enumC207101162h4, enumC207101162h5, enumC207101162h6, enumC207101162h7, enumC207101162h8, enumC207101162h9, enumC207101162h10, enumC207101162h11, enumC207101162h12};
        LLILLL = enumC207101162hArr;
        LLILZ = new C2254308sP(enumC207101162hArr);
    }

    public static EnumC207101162h[] values() {
        return (EnumC207101162h[]) LLILLL.clone();
    }

    public final EnumC207102162i getTranslationGroup() {
        return this.LL;
    }

    public final int getValue() {
        return this.LLILLJJLI;
    }

    public static EnumC207101162h valueOf(String str) {
        return (EnumC207101162h) C08FF.LIZ(EnumC207101162h.class, str);
    }

    public EnumC207101162h(String str, int i, EnumC207102162i enumC207102162i, int i2) {
        this.LL = enumC207102162i;
        this.LLILLJJLI = i2;
    }
}
