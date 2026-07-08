package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Oaf, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC622110Oaf {
    public static final EnumC622110Oaf AVATAR_URL;
    public static final EnumC622110Oaf BADGE_ICON_URL;
    public static final EnumC622110Oaf BULLETIN_BOARD_ID;
    public static final C622390Ob7 Companion;
    public static final EnumC622110Oaf DESC;
    public static final EnumC622110Oaf EXTRA_DATA;
    public static final /* synthetic */ EnumC622110Oaf[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC622110Oaf MEMBER_COUNT;
    public static final EnumC622110Oaf NAME;
    public final String LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC622110Oaf> getEntries() {
        return LLILZ;
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [X.0Ob7] */
    static {
        EnumC622110Oaf enumC622110Oaf = new EnumC622110Oaf("BULLETIN_BOARD_ID", 0, "bulletin_board_id", "TEXT PRIMARY KEY");
        BULLETIN_BOARD_ID = enumC622110Oaf;
        EnumC622110Oaf enumC622110Oaf2 = new EnumC622110Oaf("NAME", 1, "name", "TEXT NOT NULL");
        NAME = enumC622110Oaf2;
        EnumC622110Oaf enumC622110Oaf3 = new EnumC622110Oaf("DESC", 2, "desc", "TEXT");
        DESC = enumC622110Oaf3;
        EnumC622110Oaf enumC622110Oaf4 = new EnumC622110Oaf("AVATAR_URL", 3, "avatar_url", "TEXT");
        AVATAR_URL = enumC622110Oaf4;
        EnumC622110Oaf enumC622110Oaf5 = new EnumC622110Oaf("MEMBER_COUNT", 4, "member_count", "INTEGER NOT NULL DEFAULT 0");
        MEMBER_COUNT = enumC622110Oaf5;
        EnumC622110Oaf enumC622110Oaf6 = new EnumC622110Oaf("BADGE_ICON_URL", 5, "badge_icon_url", "TEXT");
        BADGE_ICON_URL = enumC622110Oaf6;
        EnumC622110Oaf enumC622110Oaf7 = new EnumC622110Oaf("EXTRA_DATA", 6, "extra_data", "TEXT");
        EXTRA_DATA = enumC622110Oaf7;
        EnumC622110Oaf[] enumC622110OafArr = {enumC622110Oaf, enumC622110Oaf2, enumC622110Oaf3, enumC622110Oaf4, enumC622110Oaf5, enumC622110Oaf6, enumC622110Oaf7};
        LLILLL = enumC622110OafArr;
        LLILZ = new C2254308sP(enumC622110OafArr);
        Companion = new Object() { // from class: X.0Ob7
        };
    }

    public static EnumC622110Oaf[] values() {
        return (EnumC622110Oaf[]) LLILLL.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public final String getType() {
        return this.LLILLJJLI;
    }

    public static EnumC622110Oaf valueOf(String str) {
        return (EnumC622110Oaf) C08FF.LIZ(EnumC622110Oaf.class, str);
    }

    public EnumC622110Oaf(String str, int i, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
