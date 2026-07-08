package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06mK, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1707006mK {
    public static final EnumC1707006mK CLICK_CLOSE_BTN;
    public static final EnumC1707006mK CLICK_STICKER;
    public static final EnumC1707006mK LEFT_CHAT_WITH_PRESHOWN;
    public static final /* synthetic */ EnumC1707006mK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1707006mK NON_SCORE_UPDATING_ACTION;
    public static final EnumC1707006mK SEND_MSG;
    public static final EnumC1707006mK TRIGGER_TYPING_RECOMMENDATION;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1707006mK> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1707006mK enumC1707006mK = new EnumC1707006mK("CLICK_STICKER", 0, "clicked_preshown_sticker_item");
        CLICK_STICKER = enumC1707006mK;
        EnumC1707006mK enumC1707006mK2 = new EnumC1707006mK("LEFT_CHAT_WITH_PRESHOWN", 1, "left_chat_page_without_dismissing_preshown_stickers");
        LEFT_CHAT_WITH_PRESHOWN = enumC1707006mK2;
        EnumC1707006mK enumC1707006mK3 = new EnumC1707006mK("CLICK_CLOSE_BTN", 2, "clicked_preshown_sticker_dismiss");
        CLICK_CLOSE_BTN = enumC1707006mK3;
        EnumC1707006mK enumC1707006mK4 = new EnumC1707006mK("SEND_MSG", 3, "user_sends_message_in_chat");
        SEND_MSG = enumC1707006mK4;
        EnumC1707006mK enumC1707006mK5 = new EnumC1707006mK("TRIGGER_TYPING_RECOMMENDATION", 4, "user_triggers_typing_recommendation");
        TRIGGER_TYPING_RECOMMENDATION = enumC1707006mK5;
        EnumC1707006mK enumC1707006mK6 = new EnumC1707006mK("NON_SCORE_UPDATING_ACTION", 5, "non_score_updating_action");
        NON_SCORE_UPDATING_ACTION = enumC1707006mK6;
        EnumC1707006mK[] enumC1707006mKArr = {enumC1707006mK, enumC1707006mK2, enumC1707006mK3, enumC1707006mK4, enumC1707006mK5, enumC1707006mK6};
        LLILLJJLI = enumC1707006mKArr;
        LLILLL = new C2254308sP(enumC1707006mKArr);
    }

    public static EnumC1707006mK[] values() {
        return (EnumC1707006mK[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public static EnumC1707006mK valueOf(String str) {
        return (EnumC1707006mK) C08FF.LIZ(EnumC1707006mK.class, str);
    }

    public EnumC1707006mK(String str, int i, String str2) {
        this.LL = str2;
    }
}
