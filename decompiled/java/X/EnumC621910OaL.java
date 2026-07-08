package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OaL, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC621910OaL {
    public static final EnumC621910OaL BOTTOM_STRUCT;
    public static final EnumC621910OaL COMMENT;
    public static final C622410Ob9 Companion;
    public static final EnumC621910OaL EMOJI;
    public static final EnumC621910OaL ITEM_ID;
    public static final /* synthetic */ EnumC621910OaL[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC621910OaL VIEW_COUNT;
    public final String LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC621910OaL> getEntries() {
        return LLILZ;
    }

    /* JADX WARN: Type inference failed for: r0v7, types: [X.0Ob9] */
    static {
        EnumC621910OaL enumC621910OaL = new EnumC621910OaL("ITEM_ID", 0, "item_id", "TEXT PRIMARY KEY");
        ITEM_ID = enumC621910OaL;
        EnumC621910OaL enumC621910OaL2 = new EnumC621910OaL("EMOJI", 1, "emoji", "TEXT");
        EMOJI = enumC621910OaL2;
        EnumC621910OaL enumC621910OaL3 = new EnumC621910OaL("COMMENT", 2, "comment", "TEXT");
        COMMENT = enumC621910OaL3;
        EnumC621910OaL enumC621910OaL4 = new EnumC621910OaL("VIEW_COUNT", 3, "view_count", "INTEGER NOT NULL DEFAULT 0");
        VIEW_COUNT = enumC621910OaL4;
        EnumC621910OaL enumC621910OaL5 = new EnumC621910OaL("BOTTOM_STRUCT", 4, "bottom_struct", "TEXT");
        BOTTOM_STRUCT = enumC621910OaL5;
        EnumC621910OaL[] enumC621910OaLArr = {enumC621910OaL, enumC621910OaL2, enumC621910OaL3, enumC621910OaL4, enumC621910OaL5};
        LLILLL = enumC621910OaLArr;
        LLILZ = new C2254308sP(enumC621910OaLArr);
        Companion = new Object() { // from class: X.0Ob9
        };
    }

    public static EnumC621910OaL[] values() {
        return (EnumC621910OaL[]) LLILLL.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public final String getType() {
        return this.LLILLJJLI;
    }

    public static EnumC621910OaL valueOf(String str) {
        return (EnumC621910OaL) C08FF.LIZ(EnumC621910OaL.class, str);
    }

    public EnumC621910OaL(String str, int i, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
