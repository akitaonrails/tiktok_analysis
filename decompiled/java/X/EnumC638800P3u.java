package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0P3u, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC638800P3u {
    public static final EnumC638800P3u CHAT_INVITE_CARD;
    public static final EnumC638800P3u END_OF_SHARED_CONTENT;
    public static final /* synthetic */ EnumC638800P3u[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC638800P3u REMINDER_CARD;
    public static final EnumC638800P3u SHARED_FEED_ACTION_BAR;
    public static final EnumC638800P3u SHARED_FEED_INLINE_MSG;
    public static final EnumC638800P3u SHARED_FEED_INVITE_CARD;
    public static final EnumC638800P3u SHARED_FEED_MESSAGE;
    public static final EnumC638800P3u SHARED_FEED_TOP_BTN;
    public final String LL;

    public static InterfaceC2044707zh<EnumC638800P3u> getEntries() {
        return LLILLL;
    }

    static {
        EnumC638800P3u enumC638800P3u = new EnumC638800P3u("END_OF_SHARED_CONTENT", 0, "end_of_shared_content");
        END_OF_SHARED_CONTENT = enumC638800P3u;
        EnumC638800P3u enumC638800P3u2 = new EnumC638800P3u("SHARED_FEED_TOP_BTN", 1, "shared_feed_top_btn");
        SHARED_FEED_TOP_BTN = enumC638800P3u2;
        EnumC638800P3u enumC638800P3u3 = new EnumC638800P3u("SHARED_FEED_ACTION_BAR", 2, "shared_feed_action_bar");
        SHARED_FEED_ACTION_BAR = enumC638800P3u3;
        EnumC638800P3u enumC638800P3u4 = new EnumC638800P3u("SHARED_FEED_INVITE_CARD", 3, "shared_feed_invite_card");
        SHARED_FEED_INVITE_CARD = enumC638800P3u4;
        EnumC638800P3u enumC638800P3u5 = new EnumC638800P3u("SHARED_FEED_INLINE_MSG", 4, "shared_feed_inline_msg");
        SHARED_FEED_INLINE_MSG = enumC638800P3u5;
        EnumC638800P3u enumC638800P3u6 = new EnumC638800P3u("SHARED_FEED_MESSAGE", 5, "shared_feed_message");
        SHARED_FEED_MESSAGE = enumC638800P3u6;
        EnumC638800P3u enumC638800P3u7 = new EnumC638800P3u("REMINDER_CARD", 6, "reminder_card");
        REMINDER_CARD = enumC638800P3u7;
        EnumC638800P3u enumC638800P3u8 = new EnumC638800P3u("CHAT_INVITE_CARD", 7, "chat_invite_card");
        CHAT_INVITE_CARD = enumC638800P3u8;
        EnumC638800P3u[] enumC638800P3uArr = {enumC638800P3u, enumC638800P3u2, enumC638800P3u3, enumC638800P3u4, enumC638800P3u5, enumC638800P3u6, enumC638800P3u7, enumC638800P3u8};
        LLILLJJLI = enumC638800P3uArr;
        LLILLL = new C2254308sP(enumC638800P3uArr);
    }

    public static EnumC638800P3u[] values() {
        return (EnumC638800P3u[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC638800P3u valueOf(String str) {
        return (EnumC638800P3u) C08FF.LIZ(EnumC638800P3u.class, str);
    }

    public EnumC638800P3u(String str, int i, String str2) {
        this.LL = str2;
    }
}
