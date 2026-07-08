package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0fbS, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes18.dex */
public final class EnumC1133520fbS {
    public static final EnumC1133520fbS ANCHOR_IS_HISTORY_MESSAGE;
    public static final /* synthetic */ EnumC1133520fbS[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1133520fbS MESSAGE_DISCARDED;
    public static final EnumC1133520fbS PAID_ROOM_BLOCK;
    public static final EnumC1133520fbS SCREEN_CLEAR_MODE;
    public static final EnumC1133520fbS SELF_MESSAGE_DISABLE;
    public static final EnumC1133520fbS SERVER_NO_GIFT_MODEL;
    public static final EnumC1133520fbS STICKER_NO_TRAY;
    public static final EnumC1133520fbS WIDGET_VIEW_NOT_VALID;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1133520fbS> getEntries() {
        return LLILZ;
    }

    static {
        EnumC1133520fbS enumC1133520fbS = new EnumC1133520fbS("SELF_MESSAGE_DISABLE", 0, 1006, "Disable gifts not sent by yourself");
        SELF_MESSAGE_DISABLE = enumC1133520fbS;
        EnumC1133520fbS enumC1133520fbS2 = new EnumC1133520fbS("SERVER_NO_GIFT_MODEL", 1, 1002, "gift model convert fail");
        SERVER_NO_GIFT_MODEL = enumC1133520fbS2;
        EnumC1133520fbS enumC1133520fbS3 = new EnumC1133520fbS("WIDGET_VIEW_NOT_VALID", 2, 1010, "widget_view_not_valid");
        WIDGET_VIEW_NOT_VALID = enumC1133520fbS3;
        EnumC1133520fbS enumC1133520fbS4 = new EnumC1133520fbS("ANCHOR_IS_HISTORY_MESSAGE", 3, 1011, "anchor_is_history_message");
        ANCHOR_IS_HISTORY_MESSAGE = enumC1133520fbS4;
        EnumC1133520fbS enumC1133520fbS5 = new EnumC1133520fbS("STICKER_NO_TRAY", 4, 1008, "No tray for this sticker gift");
        STICKER_NO_TRAY = enumC1133520fbS5;
        EnumC1133520fbS enumC1133520fbS6 = new EnumC1133520fbS("PAID_ROOM_BLOCK", 5, 1004, "paid room block gift play");
        PAID_ROOM_BLOCK = enumC1133520fbS6;
        EnumC1133520fbS enumC1133520fbS7 = new EnumC1133520fbS("SCREEN_CLEAR_MODE", 6, 1001, "Screen clear mode");
        SCREEN_CLEAR_MODE = enumC1133520fbS7;
        EnumC1133520fbS enumC1133520fbS8 = new EnumC1133520fbS("MESSAGE_DISCARDED", 7, 2005, "The gift message is discarded due to gift tray being cleared when the user leaves the LIVE room");
        MESSAGE_DISCARDED = enumC1133520fbS8;
        EnumC1133520fbS[] enumC1133520fbSArr = {enumC1133520fbS, enumC1133520fbS2, enumC1133520fbS3, enumC1133520fbS4, enumC1133520fbS5, enumC1133520fbS6, enumC1133520fbS7, enumC1133520fbS8};
        LLILLL = enumC1133520fbSArr;
        LLILZ = new C2254308sP(enumC1133520fbSArr);
    }

    public static EnumC1133520fbS[] values() {
        return (EnumC1133520fbS[]) LLILLL.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public final String getDesc() {
        return this.LLILLJJLI;
    }

    public static EnumC1133520fbS valueOf(String str) {
        return (EnumC1133520fbS) C08FF.LIZ(EnumC1133520fbS.class, str);
    }

    public EnumC1133520fbS(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
