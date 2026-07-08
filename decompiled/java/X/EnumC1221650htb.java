package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0htb, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1221650htb {
    public static final EnumC1221650htb CLICK_ANCHOR;
    public static final EnumC1221650htb CLICK_DISCARD;
    public static final EnumC1221650htb CLICK_EDIT_PROFILE;
    public static final EnumC1221650htb CLICK_EMPTY_AVATAR;
    public static final EnumC1221650htb CLICK_PHOTO;
    public static final EnumC1221650htb CLICK_REGENERATE;
    public static final EnumC1221650htb CLICK_TAB;
    public static final EnumC1221650htb CREATE_MORE;
    public static final EnumC1221650htb HALF_PAGE;
    public static final /* synthetic */ EnumC1221650htb[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1221650htb> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1221650htb enumC1221650htb = new EnumC1221650htb("CLICK_TAB", 0);
        CLICK_TAB = enumC1221650htb;
        EnumC1221650htb enumC1221650htb2 = new EnumC1221650htb("CLICK_PHOTO", 1);
        CLICK_PHOTO = enumC1221650htb2;
        EnumC1221650htb enumC1221650htb3 = new EnumC1221650htb("CLICK_EMPTY_AVATAR", 2);
        CLICK_EMPTY_AVATAR = enumC1221650htb3;
        EnumC1221650htb enumC1221650htb4 = new EnumC1221650htb("CLICK_EDIT_PROFILE", 3);
        CLICK_EDIT_PROFILE = enumC1221650htb4;
        EnumC1221650htb enumC1221650htb5 = new EnumC1221650htb("CLICK_REGENERATE", 4);
        CLICK_REGENERATE = enumC1221650htb5;
        EnumC1221650htb enumC1221650htb6 = new EnumC1221650htb("CLICK_ANCHOR", 5);
        CLICK_ANCHOR = enumC1221650htb6;
        EnumC1221650htb enumC1221650htb7 = new EnumC1221650htb("CREATE_MORE", 6);
        CREATE_MORE = enumC1221650htb7;
        EnumC1221650htb enumC1221650htb8 = new EnumC1221650htb("CLICK_DISCARD", 7);
        CLICK_DISCARD = enumC1221650htb8;
        EnumC1221650htb enumC1221650htb9 = new EnumC1221650htb("HALF_PAGE", 8);
        HALF_PAGE = enumC1221650htb9;
        EnumC1221650htb[] enumC1221650htbArr = {enumC1221650htb, enumC1221650htb2, enumC1221650htb3, enumC1221650htb4, enumC1221650htb5, enumC1221650htb6, enumC1221650htb7, enumC1221650htb8, enumC1221650htb9};
        LL = enumC1221650htbArr;
        LLILLJJLI = new C2254308sP(enumC1221650htbArr);
    }

    public static EnumC1221650htb[] values() {
        return (EnumC1221650htb[]) LL.clone();
    }

    public static EnumC1221650htb valueOf(String str) {
        return (EnumC1221650htb) C08FF.LIZ(EnumC1221650htb.class, str);
    }

    public EnumC1221650htb(String str, int i) {
    }
}
