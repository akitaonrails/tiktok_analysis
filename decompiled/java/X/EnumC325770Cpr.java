package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Cpr, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class EnumC325770Cpr {
    public static final EnumC325770Cpr ARCHIVE;
    public static final EnumC325770Cpr AVATAR;
    public static final EnumC325770Cpr DETAIL;
    public static final EnumC325770Cpr HIGHLIGHTS;
    public static final /* synthetic */ EnumC325770Cpr[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC325770Cpr STORY_CARD;
    public static final EnumC325770Cpr TOP_CELL;
    public static final EnumC325770Cpr UNSPECIFIED;
    public final String LL;

    public static InterfaceC2044707zh<EnumC325770Cpr> getEntries() {
        return LLILLL;
    }

    static {
        EnumC325770Cpr enumC325770Cpr = new EnumC325770Cpr("UNSPECIFIED", 0, "");
        UNSPECIFIED = enumC325770Cpr;
        EnumC325770Cpr enumC325770Cpr2 = new EnumC325770Cpr("TOP_CELL", 1, "social_story_top_cell");
        TOP_CELL = enumC325770Cpr2;
        EnumC325770Cpr enumC325770Cpr3 = new EnumC325770Cpr("STORY_CARD", 2, "social_story_card");
        STORY_CARD = enumC325770Cpr3;
        EnumC325770Cpr enumC325770Cpr4 = new EnumC325770Cpr("AVATAR", 3, "social_story_avatar");
        AVATAR = enumC325770Cpr4;
        EnumC325770Cpr enumC325770Cpr5 = new EnumC325770Cpr("DETAIL", 4, "social_story_detail");
        DETAIL = enumC325770Cpr5;
        EnumC325770Cpr enumC325770Cpr6 = new EnumC325770Cpr("HIGHLIGHTS", 5, "social_story_highlights");
        HIGHLIGHTS = enumC325770Cpr6;
        EnumC325770Cpr enumC325770Cpr7 = new EnumC325770Cpr("ARCHIVE", 6, "social_story_archive");
        ARCHIVE = enumC325770Cpr7;
        EnumC325770Cpr[] enumC325770CprArr = {enumC325770Cpr, enumC325770Cpr2, enumC325770Cpr3, enumC325770Cpr4, enumC325770Cpr5, enumC325770Cpr6, enumC325770Cpr7};
        LLILLJJLI = enumC325770CprArr;
        LLILLL = new C2254308sP(enumC325770CprArr);
    }

    public static EnumC325770Cpr[] values() {
        return (EnumC325770Cpr[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC325770Cpr valueOf(String str) {
        return (EnumC325770Cpr) C08FF.LIZ(EnumC325770Cpr.class, str);
    }

    public EnumC325770Cpr(String str, int i, String str2) {
        this.LL = str2;
    }
}
