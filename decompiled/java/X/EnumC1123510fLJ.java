package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fLJ, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1123510fLJ {
    public static final EnumC1123510fLJ CLICK_BACKGROUND;
    public static final EnumC1123510fLJ LEFT_ROOM;
    public static final EnumC1123510fLJ LIMIT_GIFT_SENT;
    public static final /* synthetic */ EnumC1123510fLJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1123510fLJ OTHER;
    public static final EnumC1123510fLJ OVERLAY_WINDOW_SEND;
    public static final EnumC1123510fLJ SEND;
    public static final EnumC1123510fLJ TIME_UP;
    public static final EnumC1123510fLJ USER_CLOSE;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1123510fLJ> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1123510fLJ enumC1123510fLJ = new EnumC1123510fLJ("TIME_UP", 0, "times_up");
        TIME_UP = enumC1123510fLJ;
        EnumC1123510fLJ enumC1123510fLJ2 = new EnumC1123510fLJ("USER_CLOSE", 1, "user_close");
        USER_CLOSE = enumC1123510fLJ2;
        EnumC1123510fLJ enumC1123510fLJ3 = new EnumC1123510fLJ("SEND", 2, "send_click");
        SEND = enumC1123510fLJ3;
        EnumC1123510fLJ enumC1123510fLJ4 = new EnumC1123510fLJ("OVERLAY_WINDOW_SEND", 3, "overlay_window_click_send");
        OVERLAY_WINDOW_SEND = enumC1123510fLJ4;
        EnumC1123510fLJ enumC1123510fLJ5 = new EnumC1123510fLJ("OTHER", 4, "others");
        OTHER = enumC1123510fLJ5;
        EnumC1123510fLJ enumC1123510fLJ6 = new EnumC1123510fLJ("LIMIT_GIFT_SENT", 5, "limit_gift_sent");
        LIMIT_GIFT_SENT = enumC1123510fLJ6;
        EnumC1123510fLJ enumC1123510fLJ7 = new EnumC1123510fLJ("LEFT_ROOM", 6, "left_room");
        LEFT_ROOM = enumC1123510fLJ7;
        EnumC1123510fLJ enumC1123510fLJ8 = new EnumC1123510fLJ("CLICK_BACKGROUND", 7, "click_background");
        CLICK_BACKGROUND = enumC1123510fLJ8;
        EnumC1123510fLJ[] enumC1123510fLJArr = {enumC1123510fLJ, enumC1123510fLJ2, enumC1123510fLJ3, enumC1123510fLJ4, enumC1123510fLJ5, enumC1123510fLJ6, enumC1123510fLJ7, enumC1123510fLJ8};
        LLILLJJLI = enumC1123510fLJArr;
        LLILLL = new C2254308sP(enumC1123510fLJArr);
    }

    public static EnumC1123510fLJ[] values() {
        return (EnumC1123510fLJ[]) LLILLJJLI.clone();
    }

    public final String getDesc$livegift_impl_release() {
        return this.LL;
    }

    public static EnumC1123510fLJ valueOf(String str) {
        return (EnumC1123510fLJ) C08FF.LIZ(EnumC1123510fLJ.class, str);
    }

    public EnumC1123510fLJ(String str, int i, String str2) {
        this.LL = str2;
    }
}
