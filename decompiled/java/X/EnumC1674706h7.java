package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06h7, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1674706h7 implements InterfaceC1675606hG {
    public static final EnumC1674706h7 BLOCKED_USER;
    public static final EnumC1674706h7 CHAT_PERMISSION_UNAVAILABLE;
    public static final EnumC1674706h7 COLLABORATIVE_COLLECTION_POP_UP;
    public static final EnumC1674706h7 ENABLE_NUDE_FILTER;
    public static final EnumC1674706h7 FAILED_FEATURE_BAN;
    public static final EnumC1674706h7 FAILED_SENSITIVE_KEYWORD;
    public static final EnumC1674706h7 GROUP_JOIN_REQUEST;
    public static final EnumC1674706h7 GUIDE_TO_REPORT;
    public static final EnumC1674706h7 LINK_AUTO_MESSAGE;
    public static final /* synthetic */ EnumC1674706h7[] LLILZIL;
    public static final /* synthetic */ C2254308sP LLILZLL;
    public static final EnumC1674706h7 MARK_SAFE;
    public static final EnumC1674706h7 MESSAGE_REQUEST;
    public static final EnumC1674706h7 PERMISSION_OFF;
    public static final EnumC1674706h7 SAFETY_SCREENSHOT_NOTICE;
    public static final EnumC1674706h7 SEND_MESSAGE_REQUEST;
    public static final EnumC1674706h7 SENSITIVE_CONTENT;
    public static final EnumC1674706h7 TURN_ON_RESTRICT_SHARING_NOTICE;
    public final String LL;
    public final EnumC1641906bp LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;

    public EnumC1674706h7() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC1674706h7> getEntries() {
        return LLILZLL;
    }

    static {
        EnumC1641906bp enumC1641906bp = EnumC1641906bp.CHAT_NOTICE;
        EnumC1674706h7 enumC1674706h7 = new EnumC1674706h7("GROUP_JOIN_REQUEST", 0, "group_join_request", enumC1641906bp, "card");
        GROUP_JOIN_REQUEST = enumC1674706h7;
        EnumC1674706h7 enumC1674706h72 = new EnumC1674706h7("MESSAGE_REQUEST", 1, "message_request", enumC1641906bp, "card");
        MESSAGE_REQUEST = enumC1674706h72;
        EnumC1674706h7 enumC1674706h73 = new EnumC1674706h7("BLOCKED_USER", 2, "blocked_user", enumC1641906bp, "card");
        BLOCKED_USER = enumC1674706h73;
        EnumC1674706h7 enumC1674706h74 = new EnumC1674706h7("PERMISSION_OFF", 3, "permission_off", enumC1641906bp, "card");
        PERMISSION_OFF = enumC1674706h74;
        EnumC1674706h7 enumC1674706h75 = new EnumC1674706h7("ENABLE_NUDE_FILTER", 4, "enable_nude_filter", enumC1641906bp, "sheet");
        ENABLE_NUDE_FILTER = enumC1674706h75;
        EnumC1641906bp enumC1641906bp2 = EnumC1641906bp.MESSAGE;
        EnumC1674706h7 enumC1674706h76 = new EnumC1674706h7("SENSITIVE_CONTENT", 5, "sensitive_content", enumC1641906bp2, "inline_message");
        SENSITIVE_CONTENT = enumC1674706h76;
        EnumC1674706h7 enumC1674706h77 = new EnumC1674706h7("FAILED_FEATURE_BAN", 6, "failed_to_send_due_to_feature_ban", enumC1641906bp2, "inline_message");
        FAILED_FEATURE_BAN = enumC1674706h77;
        EnumC1674706h7 enumC1674706h78 = new EnumC1674706h7("FAILED_SENSITIVE_KEYWORD", 7, "failed_to_send_due_to_sensitive_keyword", enumC1641906bp2, "inline_message");
        FAILED_SENSITIVE_KEYWORD = enumC1674706h78;
        EnumC1674706h7 enumC1674706h79 = new EnumC1674706h7("LINK_AUTO_MESSAGE", 8, "link_auto_message", enumC1641906bp2, "inline_message");
        LINK_AUTO_MESSAGE = enumC1674706h79;
        EnumC1674706h7 enumC1674706h710 = new EnumC1674706h7("GUIDE_TO_REPORT", 9, "guide_to_report", enumC1641906bp2, "inline_message");
        GUIDE_TO_REPORT = enumC1674706h710;
        EnumC1674706h7 enumC1674706h711 = new EnumC1674706h7("SEND_MESSAGE_REQUEST", 10, "send_message_request", enumC1641906bp, "card");
        SEND_MESSAGE_REQUEST = enumC1674706h711;
        EnumC1674706h7 enumC1674706h712 = new EnumC1674706h7("MARK_SAFE", 11, "mark_safe", enumC1641906bp, "card");
        MARK_SAFE = enumC1674706h712;
        EnumC1674706h7 enumC1674706h713 = new EnumC1674706h7("SAFETY_SCREENSHOT_NOTICE", 12, "alert_someone_take_screenshot_in_conversation", enumC1641906bp2, "inline_message");
        SAFETY_SCREENSHOT_NOTICE = enumC1674706h713;
        EnumC1674706h7 enumC1674706h714 = new EnumC1674706h7("TURN_ON_RESTRICT_SHARING_NOTICE", 13, "risky_content_for_sender_reminder_to_turn_on_restrict_sharing", enumC1641906bp2, "inline_message");
        TURN_ON_RESTRICT_SHARING_NOTICE = enumC1674706h714;
        EnumC1674706h7 enumC1674706h715 = new EnumC1674706h7("COLLABORATIVE_COLLECTION_POP_UP", 14, "collaborative_collection_pop_up", enumC1641906bp, "sheet");
        COLLABORATIVE_COLLECTION_POP_UP = enumC1674706h715;
        EnumC1674706h7 enumC1674706h716 = new EnumC1674706h7("CHAT_PERMISSION_UNAVAILABLE", 15, "chat_unavailable", enumC1641906bp, "card");
        CHAT_PERMISSION_UNAVAILABLE = enumC1674706h716;
        EnumC1674706h7[] enumC1674706h7Arr = {enumC1674706h7, enumC1674706h72, enumC1674706h73, enumC1674706h74, enumC1674706h75, enumC1674706h76, enumC1674706h77, enumC1674706h78, enumC1674706h79, enumC1674706h710, enumC1674706h711, enumC1674706h712, enumC1674706h713, enumC1674706h714, enumC1674706h715, enumC1674706h716};
        LLILZIL = enumC1674706h7Arr;
        LLILZLL = new C2254308sP(enumC1674706h7Arr);
    }

    public static EnumC1674706h7[] values() {
        return (EnumC1674706h7[]) LLILZIL.clone();
    }

    @Override // X.InterfaceC1677406hY
    public String getEventPromptType() {
        return this.LLILZ;
    }

    @Override // X.InterfaceC1677406hY
    public String getPromptId() {
        return this.LL;
    }

    @Override // X.InterfaceC1677406hY
    public EnumC1641906bp getPromptType() {
        return this.LLILLJJLI;
    }

    @Override // X.InterfaceC1677406hY
    public String getUiType() {
        return this.LLILLL;
    }

    public static EnumC1674706h7 valueOf(String str) {
        return (EnumC1674706h7) C08FF.LIZ(EnumC1674706h7.class, str);
    }

    public EnumC1674706h7(String str, int i, String str2, EnumC1641906bp enumC1641906bp, String str3) {
        this.LL = str2;
        this.LLILLJJLI = enumC1641906bp;
        this.LLILLL = str3;
        this.LLILZ = "safety_compliance";
    }
}
