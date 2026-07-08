package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Vif, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC805430Vif {
    public static final C805440Vig Companion;
    public static final EnumC805430Vif FEED_FORYOU;
    public static final EnumC805430Vif FEED_FORYOU_5VV;
    public static final EnumC805430Vif FOLLOW;
    public static final EnumC805430Vif FRIENDS;
    public static final EnumC805430Vif IC;
    public static final EnumC805430Vif INBOX;
    public static final EnumC805430Vif LIVE;
    public static final /* synthetic */ EnumC805430Vif[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC805430Vif PROFILE_HOME;
    public static final EnumC805430Vif PSP;
    public static final EnumC805430Vif SEARCH;
    public static final EnumC805430Vif STABILITY;
    public static final EnumC805430Vif VOD;
    public final String LL;

    public static InterfaceC2044707zh<EnumC805430Vif> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v24, types: [X.0Vig] */
    static {
        EnumC805430Vif enumC805430Vif = new EnumC805430Vif("STABILITY", 0, "stability");
        STABILITY = enumC805430Vif;
        EnumC805430Vif enumC805430Vif2 = new EnumC805430Vif("FEED_FORYOU_5VV", 1, "feed_foryou_5vv");
        FEED_FORYOU_5VV = enumC805430Vif2;
        EnumC805430Vif enumC805430Vif3 = new EnumC805430Vif("FEED_FORYOU", 2, "feed_foryou");
        FEED_FORYOU = enumC805430Vif3;
        EnumC805430Vif enumC805430Vif4 = new EnumC805430Vif("VOD", 3, "vod");
        VOD = enumC805430Vif4;
        EnumC805430Vif enumC805430Vif5 = new EnumC805430Vif("IC", 4, "ic");
        IC = enumC805430Vif5;
        EnumC805430Vif enumC805430Vif6 = new EnumC805430Vif("LIVE", 5, "live");
        LIVE = enumC805430Vif6;
        EnumC805430Vif enumC805430Vif7 = new EnumC805430Vif("PSP", 6, "psp");
        PSP = enumC805430Vif7;
        EnumC805430Vif enumC805430Vif8 = new EnumC805430Vif("SEARCH", 7, "search");
        SEARCH = enumC805430Vif8;
        EnumC805430Vif enumC805430Vif9 = new EnumC805430Vif("INBOX", 8, "inbox");
        INBOX = enumC805430Vif9;
        EnumC805430Vif enumC805430Vif10 = new EnumC805430Vif("FRIENDS", 9, "friends");
        FRIENDS = enumC805430Vif10;
        EnumC805430Vif enumC805430Vif11 = new EnumC805430Vif("FOLLOW", 10, "following_feed");
        FOLLOW = enumC805430Vif11;
        EnumC805430Vif enumC805430Vif12 = new EnumC805430Vif("PROFILE_HOME", 11, "profile_home");
        PROFILE_HOME = enumC805430Vif12;
        EnumC805430Vif[] enumC805430VifArr = {enumC805430Vif, enumC805430Vif2, enumC805430Vif3, enumC805430Vif4, enumC805430Vif5, enumC805430Vif6, enumC805430Vif7, enumC805430Vif8, enumC805430Vif9, enumC805430Vif10, enumC805430Vif11, enumC805430Vif12};
        LLILLJJLI = enumC805430VifArr;
        LLILLL = new C2254308sP(enumC805430VifArr);
        Companion = new Object() { // from class: X.0Vig
        };
    }

    public static EnumC805430Vif[] values() {
        return (EnumC805430Vif[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC805430Vif valueOf(String str) {
        return (EnumC805430Vif) C08FF.LIZ(EnumC805430Vif.class, str);
    }

    public EnumC805430Vif(String str, int i, String str2) {
        this.LL = str2;
    }
}
