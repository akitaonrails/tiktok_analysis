package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0rKb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes25.dex */
public final class EnumC1584350rKb {
    public static final EnumC1584350rKb COIN;
    public static final EnumC1584350rKb DM_NOTICE;
    public static final EnumC1584350rKb INBOX;
    public static final EnumC1584350rKb LIVE;
    public static final /* synthetic */ EnumC1584350rKb[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1584350rKb MY_PROFILE;
    public static final EnumC1584350rKb PUBLISH;
    public static final EnumC1584350rKb SCAN;
    public static final EnumC1584350rKb SEARCH;
    public static final EnumC1584350rKb SHOP_CART;
    public static final EnumC1584350rKb SPECIAL;
    public static final EnumC1584350rKb STORY;
    public static final EnumC1584350rKb STORY_CAMERA;
    public static final EnumC1584350rKb TAKO;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1584350rKb> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1584350rKb enumC1584350rKb = new EnumC1584350rKb("DM_NOTICE", 0, "dm_notice");
        DM_NOTICE = enumC1584350rKb;
        EnumC1584350rKb enumC1584350rKb2 = new EnumC1584350rKb("SPECIAL", 1, "special_event");
        SPECIAL = enumC1584350rKb2;
        EnumC1584350rKb enumC1584350rKb3 = new EnumC1584350rKb("SCAN", 2, "scan");
        SCAN = enumC1584350rKb3;
        EnumC1584350rKb enumC1584350rKb4 = new EnumC1584350rKb("LIVE", 3, "live");
        LIVE = enumC1584350rKb4;
        EnumC1584350rKb enumC1584350rKb5 = new EnumC1584350rKb("PUBLISH", 4, "publish");
        PUBLISH = enumC1584350rKb5;
        EnumC1584350rKb enumC1584350rKb6 = new EnumC1584350rKb("SEARCH", 5, "search");
        SEARCH = enumC1584350rKb6;
        EnumC1584350rKb enumC1584350rKb7 = new EnumC1584350rKb("SHOP_CART", 6, "shop_cart");
        SHOP_CART = enumC1584350rKb7;
        EnumC1584350rKb enumC1584350rKb8 = new EnumC1584350rKb("INBOX", 7, "NOTIFICATION");
        INBOX = enumC1584350rKb8;
        EnumC1584350rKb enumC1584350rKb9 = new EnumC1584350rKb("MY_PROFILE", 8, "USER");
        MY_PROFILE = enumC1584350rKb9;
        EnumC1584350rKb enumC1584350rKb10 = new EnumC1584350rKb("STORY", 9, "story");
        STORY = enumC1584350rKb10;
        EnumC1584350rKb enumC1584350rKb11 = new EnumC1584350rKb("STORY_CAMERA", 10, "story_camera");
        STORY_CAMERA = enumC1584350rKb11;
        EnumC1584350rKb enumC1584350rKb12 = new EnumC1584350rKb("COIN", 11, "coin");
        COIN = enumC1584350rKb12;
        EnumC1584350rKb enumC1584350rKb13 = new EnumC1584350rKb("TAKO", 12, "tako");
        TAKO = enumC1584350rKb13;
        EnumC1584350rKb[] enumC1584350rKbArr = {enumC1584350rKb, enumC1584350rKb2, enumC1584350rKb3, enumC1584350rKb4, enumC1584350rKb5, enumC1584350rKb6, enumC1584350rKb7, enumC1584350rKb8, enumC1584350rKb9, enumC1584350rKb10, enumC1584350rKb11, enumC1584350rKb12, enumC1584350rKb13};
        LLILLJJLI = enumC1584350rKbArr;
        LLILLL = new C2254308sP(enumC1584350rKbArr);
    }

    public static EnumC1584350rKb[] values() {
        return (EnumC1584350rKb[]) LLILLJJLI.clone();
    }

    public final String getTag() {
        return this.LL;
    }

    public static EnumC1584350rKb valueOf(String str) {
        return (EnumC1584350rKb) C08FF.LIZ(EnumC1584350rKb.class, str);
    }

    public EnumC1584350rKb(String str, int i, String str2) {
        this.LL = str2;
    }
}
