package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OrI, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC632420OrI {
    public static final EnumC632420OrI ARTIST_HUB;
    public static final EnumC632420OrI GHOST_ENTRANCE;
    public static final EnumC632420OrI GHOST_TAB;
    public static final /* synthetic */ EnumC632420OrI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC632420OrI MUSIC_TAB_BANNER;
    public final String LL;

    public static InterfaceC2044707zh<EnumC632420OrI> getEntries() {
        return LLILLL;
    }

    static {
        EnumC632420OrI enumC632420OrI = new EnumC632420OrI("GHOST_TAB", 0, "ghost_tab");
        GHOST_TAB = enumC632420OrI;
        EnumC632420OrI enumC632420OrI2 = new EnumC632420OrI("MUSIC_TAB_BANNER", 1, "music_tab");
        MUSIC_TAB_BANNER = enumC632420OrI2;
        EnumC632420OrI enumC632420OrI3 = new EnumC632420OrI("ARTIST_HUB", 2, "artist_hub");
        ARTIST_HUB = enumC632420OrI3;
        EnumC632420OrI enumC632420OrI4 = new EnumC632420OrI("GHOST_ENTRANCE", 3, "ghost_entrance");
        GHOST_ENTRANCE = enumC632420OrI4;
        EnumC632420OrI[] enumC632420OrIArr = {enumC632420OrI, enumC632420OrI2, enumC632420OrI3, enumC632420OrI4};
        LLILLJJLI = enumC632420OrIArr;
        LLILLL = new C2254308sP(enumC632420OrIArr);
    }

    public static EnumC632420OrI[] values() {
        return (EnumC632420OrI[]) LLILLJJLI.clone();
    }

    public final String getFrom() {
        return this.LL;
    }

    public static EnumC632420OrI valueOf(String str) {
        return (EnumC632420OrI) C08FF.LIZ(EnumC632420OrI.class, str);
    }

    public EnumC632420OrI(String str, int i, String str2) {
        this.LL = str2;
    }
}
