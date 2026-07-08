package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Pl6, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes11.dex */
public final class EnumC654060Pl6 {
    public static final EnumC654060Pl6 GAME;
    public static final EnumC654060Pl6 IMDB;
    public static final /* synthetic */ EnumC654060Pl6[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC654060Pl6 MUSIC;
    public static final EnumC654060Pl6 WIKI;
    public final String LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC654060Pl6> getEntries() {
        return LLILZ;
    }

    static {
        EnumC654060Pl6 enumC654060Pl6 = new EnumC654060Pl6("WIKI", 0, "wiki", "Wikipedia");
        WIKI = enumC654060Pl6;
        EnumC654060Pl6 enumC654060Pl62 = new EnumC654060Pl6("IMDB", 1, "imdb_card", "imdb");
        IMDB = enumC654060Pl62;
        EnumC654060Pl6 enumC654060Pl63 = new EnumC654060Pl6("MUSIC", 2, "music", null);
        MUSIC = enumC654060Pl63;
        EnumC654060Pl6 enumC654060Pl64 = new EnumC654060Pl6("GAME", 3, "game", null);
        GAME = enumC654060Pl64;
        EnumC654060Pl6[] enumC654060Pl6Arr = {enumC654060Pl6, enumC654060Pl62, enumC654060Pl63, enumC654060Pl64};
        LLILLL = enumC654060Pl6Arr;
        LLILZ = new C2254308sP(enumC654060Pl6Arr);
    }

    public static EnumC654060Pl6[] values() {
        return (EnumC654060Pl6[]) LLILLL.clone();
    }

    public final String getPageType() {
        return this.LLILLJJLI;
    }

    public final String getTokenType() {
        return this.LL;
    }

    public static EnumC654060Pl6 valueOf(String str) {
        return (EnumC654060Pl6) C08FF.LIZ(EnumC654060Pl6.class, str);
    }

    public EnumC654060Pl6(String str, int i, String str2, String str3) {
        this.LL = str2;
        this.LLILLJJLI = str3;
    }
}
