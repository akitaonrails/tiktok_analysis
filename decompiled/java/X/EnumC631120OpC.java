package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OpC, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC631120OpC {
    public static final C631130OpD Companion;
    public static final EnumC631120OpC DSP2TT_DM;
    public static final EnumC631120OpC FEED_DIRECT_MESSAGE;
    public static final EnumC631120OpC FEED_FOLLOWING;
    public static final EnumC631120OpC FEED_FYP;
    public static final EnumC631120OpC FEED_INNER;
    public static final EnumC631120OpC FEED_PROFILE;
    public static final EnumC631120OpC FEED_PROFILE_SPOTLIGHT;
    public static final EnumC631120OpC FEED_SEARCH;
    public static final EnumC631120OpC HYBRID_UNKNOWN;
    public static final /* synthetic */ EnumC631120OpC[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC631120OpC MUSIC_DETAIL;
    public static final EnumC631120OpC MUSIC_JOURNEY;
    public static final EnumC631120OpC MY_SONGS;
    public static final EnumC631120OpC OTHER;
    public static final EnumC631120OpC PROFILE_MUSIC_TAB;
    public static final EnumC631120OpC SETTING;

    public static InterfaceC2044707zh<EnumC631120OpC> getEntries() {
        return LLILLJJLI;
    }

    public final boolean isMyMusicEntrance() {
        return C13LQ.LJLIIL(new EnumC631120OpC[]{MUSIC_JOURNEY, MY_SONGS}).contains(this);
    }

    /* JADX WARN: Type inference failed for: r0v16, types: [X.0OpD] */
    static {
        EnumC631120OpC enumC631120OpC = new EnumC631120OpC("FEED_FYP", 0);
        FEED_FYP = enumC631120OpC;
        EnumC631120OpC enumC631120OpC2 = new EnumC631120OpC("FEED_SEARCH", 1);
        FEED_SEARCH = enumC631120OpC2;
        EnumC631120OpC enumC631120OpC3 = new EnumC631120OpC("FEED_DIRECT_MESSAGE", 2);
        FEED_DIRECT_MESSAGE = enumC631120OpC3;
        EnumC631120OpC enumC631120OpC4 = new EnumC631120OpC("FEED_FOLLOWING", 3);
        FEED_FOLLOWING = enumC631120OpC4;
        EnumC631120OpC enumC631120OpC5 = new EnumC631120OpC("FEED_PROFILE", 4);
        FEED_PROFILE = enumC631120OpC5;
        EnumC631120OpC enumC631120OpC6 = new EnumC631120OpC("FEED_PROFILE_SPOTLIGHT", 5);
        FEED_PROFILE_SPOTLIGHT = enumC631120OpC6;
        EnumC631120OpC enumC631120OpC7 = new EnumC631120OpC("FEED_INNER", 6);
        FEED_INNER = enumC631120OpC7;
        EnumC631120OpC enumC631120OpC8 = new EnumC631120OpC("DSP2TT_DM", 7);
        DSP2TT_DM = enumC631120OpC8;
        EnumC631120OpC enumC631120OpC9 = new EnumC631120OpC("MUSIC_DETAIL", 8);
        MUSIC_DETAIL = enumC631120OpC9;
        EnumC631120OpC enumC631120OpC10 = new EnumC631120OpC("SETTING", 9);
        SETTING = enumC631120OpC10;
        EnumC631120OpC enumC631120OpC11 = new EnumC631120OpC("HYBRID_UNKNOWN", 10);
        HYBRID_UNKNOWN = enumC631120OpC11;
        EnumC631120OpC enumC631120OpC12 = new EnumC631120OpC("MY_SONGS", 11);
        MY_SONGS = enumC631120OpC12;
        EnumC631120OpC enumC631120OpC13 = new EnumC631120OpC("MUSIC_JOURNEY", 12);
        MUSIC_JOURNEY = enumC631120OpC13;
        EnumC631120OpC enumC631120OpC14 = new EnumC631120OpC("PROFILE_MUSIC_TAB", 13);
        PROFILE_MUSIC_TAB = enumC631120OpC14;
        EnumC631120OpC enumC631120OpC15 = new EnumC631120OpC("OTHER", 14);
        OTHER = enumC631120OpC15;
        EnumC631120OpC[] enumC631120OpCArr = {enumC631120OpC, enumC631120OpC2, enumC631120OpC3, enumC631120OpC4, enumC631120OpC5, enumC631120OpC6, enumC631120OpC7, enumC631120OpC8, enumC631120OpC9, enumC631120OpC10, enumC631120OpC11, enumC631120OpC12, enumC631120OpC13, enumC631120OpC14, enumC631120OpC15};
        LL = enumC631120OpCArr;
        LLILLJJLI = new C2254308sP(enumC631120OpCArr);
        Companion = new Object() { // from class: X.0OpD
        };
    }

    public static EnumC631120OpC[] values() {
        return (EnumC631120OpC[]) LL.clone();
    }

    public static EnumC631120OpC valueOf(String str) {
        return (EnumC631120OpC) C08FF.LIZ(EnumC631120OpC.class, str);
    }

    public EnumC631120OpC(String str, int i) {
    }
}
