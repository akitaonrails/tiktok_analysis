package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06h8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1674806h8 implements InterfaceC1675606hG {
    public static final EnumC1674806h8 AI_GROUP_SHOT_CREATE_GROUP;
    public static final EnumC1674806h8 FAILED_PERMISSION;
    public static final EnumC1674806h8 FAILED_RICH_MEDIA;
    public static final EnumC1674806h8 GROUP_UPDATES;
    public static final /* synthetic */ EnumC1674806h8[] LLILZIL;
    public static final /* synthetic */ C2254308sP LLILZLL;
    public static final EnumC1674806h8 MESSAGE_DELETION;
    public static final EnumC1674806h8 READ_RECEIPTS;
    public static final EnumC1674806h8 RECENT_ACTIVITY_FROM_INBOX;
    public static final EnumC1674806h8 STORY_FRIEND_ANNIVERSARY_FROM_INBOX;
    public static final EnumC1674806h8 STREAK_PET_READY;
    public static final EnumC1674806h8 STREAK_PET_REMOVED;
    public static final EnumC1674806h8 STREAK_UNLOCKED;
    public final String LL;
    public final EnumC1641906bp LLILLJJLI;
    public final String LLILLL;
    public final String LLILZ;

    public EnumC1674806h8() {
        throw null;
    }

    public static InterfaceC2044707zh<EnumC1674806h8> getEntries() {
        return LLILZLL;
    }

    static {
        EnumC1641906bp enumC1641906bp = EnumC1641906bp.MESSAGE;
        EnumC1674806h8 enumC1674806h8 = new EnumC1674806h8("FAILED_PERMISSION", 0, "failed_to_send_due_to_permission", enumC1641906bp, "inline_message");
        FAILED_PERMISSION = enumC1674806h8;
        EnumC1674806h8 enumC1674806h82 = new EnumC1674806h8("FAILED_RICH_MEDIA", 1, "failed_to_send_rich_media_message", enumC1641906bp, "inline_message");
        FAILED_RICH_MEDIA = enumC1674806h82;
        EnumC1674806h8 enumC1674806h83 = new EnumC1674806h8("MESSAGE_DELETION", 2, "message_deleted", enumC1641906bp, "inline_message");
        MESSAGE_DELETION = enumC1674806h83;
        EnumC1674806h8 enumC1674806h84 = new EnumC1674806h8("GROUP_UPDATES", 3, "group_updates", enumC1641906bp, "inline_message");
        GROUP_UPDATES = enumC1674806h84;
        EnumC1674806h8 enumC1674806h85 = new EnumC1674806h8("STREAK_UNLOCKED", 4, "streak_unlocked", enumC1641906bp, "inline_message");
        STREAK_UNLOCKED = enumC1674806h85;
        EnumC1674806h8 enumC1674806h86 = new EnumC1674806h8("STREAK_PET_READY", 5, "streak_pet_is_ready", enumC1641906bp, "inline_message");
        STREAK_PET_READY = enumC1674806h86;
        EnumC1674806h8 enumC1674806h87 = new EnumC1674806h8("STREAK_PET_REMOVED", 6, "streak_pet_is_removed", enumC1641906bp, "inline_message");
        STREAK_PET_REMOVED = enumC1674806h87;
        EnumC1641906bp enumC1641906bp2 = EnumC1641906bp.CHAT_NOTICE;
        EnumC1674806h8 enumC1674806h88 = new EnumC1674806h8("STORY_FRIEND_ANNIVERSARY_FROM_INBOX", 7, "story_friend_anniversary", enumC1641906bp2, "story_friend_anniversary");
        STORY_FRIEND_ANNIVERSARY_FROM_INBOX = enumC1674806h88;
        EnumC1674806h8 enumC1674806h89 = new EnumC1674806h8("READ_RECEIPTS", 8, "read_receipts", enumC1641906bp2, "sheet");
        READ_RECEIPTS = enumC1674806h89;
        EnumC1674806h8 enumC1674806h810 = new EnumC1674806h8("AI_GROUP_SHOT_CREATE_GROUP", 9, "ai_group_shot_create_group", enumC1641906bp2, "card");
        AI_GROUP_SHOT_CREATE_GROUP = enumC1674806h810;
        EnumC1674806h8 enumC1674806h811 = new EnumC1674806h8("RECENT_ACTIVITY_FROM_INBOX", 10, "recent_activity_from_inbox_hint", enumC1641906bp2, "activity");
        RECENT_ACTIVITY_FROM_INBOX = enumC1674806h811;
        EnumC1674806h8[] enumC1674806h8Arr = {enumC1674806h8, enumC1674806h82, enumC1674806h83, enumC1674806h84, enumC1674806h85, enumC1674806h86, enumC1674806h87, enumC1674806h88, enumC1674806h89, enumC1674806h810, enumC1674806h811};
        LLILZIL = enumC1674806h8Arr;
        LLILZLL = new C2254308sP(enumC1674806h8Arr);
    }

    public static EnumC1674806h8[] values() {
        return (EnumC1674806h8[]) LLILZIL.clone();
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

    public static EnumC1674806h8 valueOf(String str) {
        return (EnumC1674806h8) C08FF.LIZ(EnumC1674806h8.class, str);
    }

    public EnumC1674806h8(String str, int i, String str2, EnumC1641906bp enumC1641906bp, String str3) {
        this.LL = str2;
        this.LLILLJJLI = enumC1641906bp;
        this.LLILLL = str3;
        this.LLILZ = "user_triggered_status_change";
    }
}
