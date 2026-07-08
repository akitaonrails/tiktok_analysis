package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10Ko, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC19228810Ko {
    public static final EnumC19228810Ko CLICK_CARD;
    public static final EnumC19228810Ko CLICK_CLOSE;
    public static final EnumC19228810Ko CLICK_COVER;
    public static final EnumC19228810Ko CLICK_DISLIKE;
    public static final EnumC19228810Ko CLICK_FOLLOW;
    public static final EnumC19228810Ko CLICK_LONG_PRESS;
    public static final EnumC19228810Ko CLICK_LONG_PRESS_DISLIKE;
    public static final EnumC19228810Ko CLICK_REFRESH;
    public static final EnumC19228810Ko CLICK_UNFOLLOW;
    public static final /* synthetic */ EnumC19228810Ko[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC19228810Ko> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC19228810Ko enumC19228810Ko = new EnumC19228810Ko("CLICK_CARD", 0);
        CLICK_CARD = enumC19228810Ko;
        EnumC19228810Ko enumC19228810Ko2 = new EnumC19228810Ko("CLICK_CLOSE", 1);
        CLICK_CLOSE = enumC19228810Ko2;
        EnumC19228810Ko enumC19228810Ko3 = new EnumC19228810Ko("CLICK_COVER", 2);
        CLICK_COVER = enumC19228810Ko3;
        EnumC19228810Ko enumC19228810Ko4 = new EnumC19228810Ko("CLICK_LONG_PRESS", 3);
        CLICK_LONG_PRESS = enumC19228810Ko4;
        EnumC19228810Ko enumC19228810Ko5 = new EnumC19228810Ko("CLICK_LONG_PRESS_DISLIKE", 4);
        CLICK_LONG_PRESS_DISLIKE = enumC19228810Ko5;
        EnumC19228810Ko enumC19228810Ko6 = new EnumC19228810Ko("CLICK_DISLIKE", 5);
        CLICK_DISLIKE = enumC19228810Ko6;
        EnumC19228810Ko enumC19228810Ko7 = new EnumC19228810Ko("CLICK_FOLLOW", 6);
        CLICK_FOLLOW = enumC19228810Ko7;
        EnumC19228810Ko enumC19228810Ko8 = new EnumC19228810Ko("CLICK_UNFOLLOW", 7);
        CLICK_UNFOLLOW = enumC19228810Ko8;
        EnumC19228810Ko enumC19228810Ko9 = new EnumC19228810Ko("CLICK_REFRESH", 8);
        CLICK_REFRESH = enumC19228810Ko9;
        EnumC19228810Ko[] enumC19228810KoArr = {enumC19228810Ko, enumC19228810Ko2, enumC19228810Ko3, enumC19228810Ko4, enumC19228810Ko5, enumC19228810Ko6, enumC19228810Ko7, enumC19228810Ko8, enumC19228810Ko9};
        LL = enumC19228810KoArr;
        LLILLJJLI = new C2254308sP(enumC19228810KoArr);
    }

    public static EnumC19228810Ko[] values() {
        return (EnumC19228810Ko[]) LL.clone();
    }

    public static EnumC19228810Ko valueOf(String str) {
        return (EnumC19228810Ko) C08FF.LIZ(EnumC19228810Ko.class, str);
    }

    public EnumC19228810Ko(String str, int i) {
    }
}
