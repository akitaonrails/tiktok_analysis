package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Ya4, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC876540Ya4 {
    public static final /* synthetic */ EnumC876540Ya4[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC876540Ya4 MESSAGE_REQUEST_AGGREGATED;
    public static final EnumC876540Ya4 MIX_LINK;
    public static final EnumC876540Ya4 RESHOW_UNREAD_CONVERSATION;
    public static final EnumC876540Ya4 REVIEW_MSG_RECEIVED_IN_BACKGROUND;
    public static final EnumC876540Ya4 UNKNOWN;
    public static final EnumC876540Ya4 WEB_SOCKET_MSG;
    public static final EnumC876540Ya4 WEB_SOCKET_PROPERTY;
    public static final EnumC876540Ya4 WEB_SOCKET_TIP;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<EnumC876540Ya4> getEntries() {
        return LLILZ;
    }

    static {
        EnumC876540Ya4 enumC876540Ya4 = new EnumC876540Ya4("UNKNOWN", 0, -1, "unknown");
        UNKNOWN = enumC876540Ya4;
        EnumC876540Ya4 enumC876540Ya42 = new EnumC876540Ya4("WEB_SOCKET_MSG", 1, 0, "ws_msg");
        WEB_SOCKET_MSG = enumC876540Ya42;
        EnumC876540Ya4 enumC876540Ya43 = new EnumC876540Ya4("WEB_SOCKET_TIP", 2, 0, "ws_tip");
        WEB_SOCKET_TIP = enumC876540Ya43;
        EnumC876540Ya4 enumC876540Ya44 = new EnumC876540Ya4("WEB_SOCKET_PROPERTY", 3, 0, "ws_property");
        WEB_SOCKET_PROPERTY = enumC876540Ya44;
        EnumC876540Ya4 enumC876540Ya45 = new EnumC876540Ya4("MIX_LINK", 4, 1, "mix_link");
        MIX_LINK = enumC876540Ya45;
        EnumC876540Ya4 enumC876540Ya46 = new EnumC876540Ya4("REVIEW_MSG_RECEIVED_IN_BACKGROUND", 5, 2, "review_db");
        REVIEW_MSG_RECEIVED_IN_BACKGROUND = enumC876540Ya46;
        EnumC876540Ya4 enumC876540Ya47 = new EnumC876540Ya4("RESHOW_UNREAD_CONVERSATION", 6, 3, "reshow_unread_conv");
        RESHOW_UNREAD_CONVERSATION = enumC876540Ya47;
        EnumC876540Ya4 enumC876540Ya48 = new EnumC876540Ya4("MESSAGE_REQUEST_AGGREGATED", 7, 4, "message_request_aggregated");
        MESSAGE_REQUEST_AGGREGATED = enumC876540Ya48;
        EnumC876540Ya4[] enumC876540Ya4Arr = {enumC876540Ya4, enumC876540Ya42, enumC876540Ya43, enumC876540Ya44, enumC876540Ya45, enumC876540Ya46, enumC876540Ya47, enumC876540Ya48};
        LLILLL = enumC876540Ya4Arr;
        LLILZ = new C2254308sP(enumC876540Ya4Arr);
    }

    public static EnumC876540Ya4[] values() {
        return (EnumC876540Ya4[]) LLILLL.clone();
    }

    public final String getMobValue() {
        return this.LLILLJJLI;
    }

    public final int getPriority() {
        return this.LL;
    }

    public static EnumC876540Ya4 valueOf(String str) {
        return (EnumC876540Ya4) C08FF.LIZ(EnumC876540Ya4.class, str);
    }

    public EnumC876540Ya4(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
