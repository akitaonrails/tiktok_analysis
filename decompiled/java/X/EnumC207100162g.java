package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.162g, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes32.dex */
public final class EnumC207100162g {
    public static final EnumC207100162g ADS_PRIMARY_STICKER;
    public static final EnumC207100162g COMMENT;
    public static final EnumC207100162g COMMERCE;
    public static final EnumC207100162g DESCRIPTION;
    public static final EnumC207100162g DIRECT_MESSAGE;
    public static final EnumC207100162g DUBBING;
    public static final /* synthetic */ EnumC207100162g[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC207100162g OFFLINE_CAPTIONS;
    public static final EnumC207100162g PHOTO_TEXT;
    public static final EnumC207100162g PHOTO_TITLE;
    public static final EnumC207100162g RT_CAPTIONS;
    public static final EnumC207100162g TEXT_STICKER;
    public static final EnumC207100162g UNKNOWN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC207100162g> getEntries() {
        return LLILLL;
    }

    static {
        EnumC207100162g enumC207100162g = new EnumC207100162g("UNKNOWN", 0, "unknown");
        UNKNOWN = enumC207100162g;
        EnumC207100162g enumC207100162g2 = new EnumC207100162g("RT_CAPTIONS", 1, "realtime_caption");
        RT_CAPTIONS = enumC207100162g2;
        EnumC207100162g enumC207100162g3 = new EnumC207100162g("OFFLINE_CAPTIONS", 2, "offline_caption");
        OFFLINE_CAPTIONS = enumC207100162g3;
        EnumC207100162g enumC207100162g4 = new EnumC207100162g("DESCRIPTION", 3, "desc");
        DESCRIPTION = enumC207100162g4;
        EnumC207100162g enumC207100162g5 = new EnumC207100162g("TEXT_STICKER", 4, "sticker");
        TEXT_STICKER = enumC207100162g5;
        EnumC207100162g enumC207100162g6 = new EnumC207100162g("PHOTO_TITLE", 5, "photo_title");
        PHOTO_TITLE = enumC207100162g6;
        EnumC207100162g enumC207100162g7 = new EnumC207100162g("PHOTO_TEXT", 6, "photo_text");
        PHOTO_TEXT = enumC207100162g7;
        EnumC207100162g enumC207100162g8 = new EnumC207100162g("COMMENT", 7, "comment");
        COMMENT = enumC207100162g8;
        EnumC207100162g enumC207100162g9 = new EnumC207100162g("ADS_PRIMARY_STICKER", 8, "ads_primary_sticker");
        ADS_PRIMARY_STICKER = enumC207100162g9;
        EnumC207100162g enumC207100162g10 = new EnumC207100162g("COMMERCE", 9, "commerce");
        COMMERCE = enumC207100162g10;
        EnumC207100162g enumC207100162g11 = new EnumC207100162g("DIRECT_MESSAGE", 10, "direct_message");
        DIRECT_MESSAGE = enumC207100162g11;
        EnumC207100162g enumC207100162g12 = new EnumC207100162g("DUBBING", 11, "dubbing");
        DUBBING = enumC207100162g12;
        EnumC207100162g[] enumC207100162gArr = {enumC207100162g, enumC207100162g2, enumC207100162g3, enumC207100162g4, enumC207100162g5, enumC207100162g6, enumC207100162g7, enumC207100162g8, enumC207100162g9, enumC207100162g10, enumC207100162g11, enumC207100162g12};
        LLILLJJLI = enumC207100162gArr;
        LLILLL = new C2254308sP(enumC207100162gArr);
    }

    public static EnumC207100162g[] values() {
        return (EnumC207100162g[]) LLILLJJLI.clone();
    }

    public final String getEtName() {
        return this.LL;
    }

    public static EnumC207100162g valueOf(String str) {
        return (EnumC207100162g) C08FF.LIZ(EnumC207100162g.class, str);
    }

    public EnumC207100162g(String str, int i, String str2) {
        this.LL = str2;
    }
}
