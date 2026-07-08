package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HLg, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes7.dex */
public final class EnumC439500HLg {
    public static final EnumC439500HLg CLICK_BACK;
    public static final EnumC439500HLg CLICK_BACKGROUND;
    public static final EnumC439500HLg CLICK_X;
    public static final EnumC439500HLg GET_AVATAR;
    public static final /* synthetic */ EnumC439500HLg[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC439500HLg NOT_NOW;
    public static final EnumC439500HLg SHOW;
    public final String LL;

    public static InterfaceC2044707zh<EnumC439500HLg> getEntries() {
        return LLILLL;
    }

    static {
        EnumC439500HLg enumC439500HLg = new EnumC439500HLg("SHOW", 0, "show");
        SHOW = enumC439500HLg;
        EnumC439500HLg enumC439500HLg2 = new EnumC439500HLg("GET_AVATAR", 1, "get_avatar");
        GET_AVATAR = enumC439500HLg2;
        EnumC439500HLg enumC439500HLg3 = new EnumC439500HLg("NOT_NOW", 2, "not_now");
        NOT_NOW = enumC439500HLg3;
        EnumC439500HLg enumC439500HLg4 = new EnumC439500HLg("CLICK_X", 3, "click_x");
        CLICK_X = enumC439500HLg4;
        EnumC439500HLg enumC439500HLg5 = new EnumC439500HLg("CLICK_BACKGROUND", 4, "close");
        CLICK_BACKGROUND = enumC439500HLg5;
        EnumC439500HLg enumC439500HLg6 = new EnumC439500HLg("CLICK_BACK", 5, "nav_bar");
        CLICK_BACK = enumC439500HLg6;
        EnumC439500HLg[] enumC439500HLgArr = {enumC439500HLg, enumC439500HLg2, enumC439500HLg3, enumC439500HLg4, enumC439500HLg5, enumC439500HLg6};
        LLILLJJLI = enumC439500HLgArr;
        LLILLL = new C2254308sP(enumC439500HLgArr);
    }

    public static EnumC439500HLg[] values() {
        return (EnumC439500HLg[]) LLILLJJLI.clone();
    }

    public final String getString() {
        return this.LL;
    }

    public static EnumC439500HLg valueOf(String str) {
        return (EnumC439500HLg) C08FF.LIZ(EnumC439500HLg.class, str);
    }

    public EnumC439500HLg(String str, int i, String str2) {
        this.LL = str2;
    }
}
