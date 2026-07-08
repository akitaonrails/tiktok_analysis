package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00Hj, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class EnumC053300Hj {
    public static final EnumC053300Hj CLICK_COMMENT_WIDGET;
    public static final EnumC053300Hj CLICK_MSG;
    public static final EnumC053300Hj COMMENT_COMBO_TRAY;
    public static final EnumC053300Hj GAME_MODERATOR_CAPSULE;
    public static final /* synthetic */ EnumC053300Hj[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC053300Hj LONG_CLICK_MSG;
    public static final EnumC053300Hj PROFILE;
    public static final EnumC053300Hj UNKNOWN;
    public static final EnumC053300Hj WELCOME_CAPSULE;

    public static InterfaceC2044707zh<EnumC053300Hj> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC053300Hj enumC053300Hj = new EnumC053300Hj("UNKNOWN", 0);
        UNKNOWN = enumC053300Hj;
        EnumC053300Hj enumC053300Hj2 = new EnumC053300Hj("CLICK_COMMENT_WIDGET", 1);
        CLICK_COMMENT_WIDGET = enumC053300Hj2;
        EnumC053300Hj enumC053300Hj3 = new EnumC053300Hj("CLICK_MSG", 2);
        CLICK_MSG = enumC053300Hj3;
        EnumC053300Hj enumC053300Hj4 = new EnumC053300Hj("PROFILE", 3);
        PROFILE = enumC053300Hj4;
        EnumC053300Hj enumC053300Hj5 = new EnumC053300Hj("COMMENT_COMBO_TRAY", 4);
        COMMENT_COMBO_TRAY = enumC053300Hj5;
        EnumC053300Hj enumC053300Hj6 = new EnumC053300Hj("LONG_CLICK_MSG", 5);
        LONG_CLICK_MSG = enumC053300Hj6;
        EnumC053300Hj enumC053300Hj7 = new EnumC053300Hj("GAME_MODERATOR_CAPSULE", 6);
        GAME_MODERATOR_CAPSULE = enumC053300Hj7;
        EnumC053300Hj enumC053300Hj8 = new EnumC053300Hj("WELCOME_CAPSULE", 7);
        WELCOME_CAPSULE = enumC053300Hj8;
        EnumC053300Hj[] enumC053300HjArr = {enumC053300Hj, enumC053300Hj2, enumC053300Hj3, enumC053300Hj4, enumC053300Hj5, enumC053300Hj6, enumC053300Hj7, enumC053300Hj8};
        LL = enumC053300HjArr;
        LLILLJJLI = new C2254308sP(enumC053300HjArr);
    }

    public static EnumC053300Hj[] values() {
        return (EnumC053300Hj[]) LL.clone();
    }

    public static EnumC053300Hj valueOf(String str) {
        return (EnumC053300Hj) C08FF.LIZ(EnumC053300Hj.class, str);
    }

    public EnumC053300Hj(String str, int i) {
    }
}
