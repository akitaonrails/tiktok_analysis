package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0iuw, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes20.dex */
public final class EnumC1260920iuw {
    public static final EnumC1260920iuw CARD;
    public static final EnumC1260920iuw INBOX_ADD_PHONE_BANNER;
    public static final EnumC1260920iuw INBOX_INTERACTION_MESSAGE;
    public static final EnumC1260920iuw INBOX_NOTICE;
    public static final EnumC1260920iuw ITEM;
    public static final /* synthetic */ EnumC1260920iuw[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC1260920iuw LOGIN;
    public static final EnumC1260920iuw MESSAGE_CARD;
    public static final EnumC1260920iuw POP_UP;
    public static final EnumC1260920iuw PUSH;
    public static final EnumC1260920iuw RELATION_LABEL;
    public static final EnumC1260920iuw SHARE_LINK;
    public static final EnumC1260920iuw STORY;
    public final String LL;

    public static InterfaceC2044707zh<EnumC1260920iuw> getEntries() {
        return LLILLL;
    }

    static {
        EnumC1260920iuw enumC1260920iuw = new EnumC1260920iuw("CARD", 0, "card");
        CARD = enumC1260920iuw;
        EnumC1260920iuw enumC1260920iuw2 = new EnumC1260920iuw("POP_UP", 1, "pop_up");
        POP_UP = enumC1260920iuw2;
        EnumC1260920iuw enumC1260920iuw3 = new EnumC1260920iuw("ITEM", 2, "item");
        ITEM = enumC1260920iuw3;
        EnumC1260920iuw enumC1260920iuw4 = new EnumC1260920iuw("SHARE_LINK", 3, "share_link");
        SHARE_LINK = enumC1260920iuw4;
        EnumC1260920iuw enumC1260920iuw5 = new EnumC1260920iuw("LOGIN", 4, "login");
        LOGIN = enumC1260920iuw5;
        EnumC1260920iuw enumC1260920iuw6 = new EnumC1260920iuw("PUSH", 5, "push");
        PUSH = enumC1260920iuw6;
        EnumC1260920iuw enumC1260920iuw7 = new EnumC1260920iuw("INBOX_NOTICE", 6, "inbox_notice");
        INBOX_NOTICE = enumC1260920iuw7;
        EnumC1260920iuw enumC1260920iuw8 = new EnumC1260920iuw("RELATION_LABEL", 7, "relation_label");
        RELATION_LABEL = enumC1260920iuw8;
        EnumC1260920iuw enumC1260920iuw9 = new EnumC1260920iuw("MESSAGE_CARD", 8, "message_card");
        MESSAGE_CARD = enumC1260920iuw9;
        EnumC1260920iuw enumC1260920iuw10 = new EnumC1260920iuw("INBOX_INTERACTION_MESSAGE", 9, "inbox_interaction_message");
        INBOX_INTERACTION_MESSAGE = enumC1260920iuw10;
        EnumC1260920iuw enumC1260920iuw11 = new EnumC1260920iuw("STORY", 10, "story");
        STORY = enumC1260920iuw11;
        EnumC1260920iuw enumC1260920iuw12 = new EnumC1260920iuw("INBOX_ADD_PHONE_BANNER", 11, "inbox_add_phone_banner");
        INBOX_ADD_PHONE_BANNER = enumC1260920iuw12;
        EnumC1260920iuw[] enumC1260920iuwArr = {enumC1260920iuw, enumC1260920iuw2, enumC1260920iuw3, enumC1260920iuw4, enumC1260920iuw5, enumC1260920iuw6, enumC1260920iuw7, enumC1260920iuw8, enumC1260920iuw9, enumC1260920iuw10, enumC1260920iuw11, enumC1260920iuw12};
        LLILLJJLI = enumC1260920iuwArr;
        LLILLL = new C2254308sP(enumC1260920iuwArr);
    }

    public static EnumC1260920iuw[] values() {
        return (EnumC1260920iuw[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static EnumC1260920iuw valueOf(String str) {
        return (EnumC1260920iuw) C08FF.LIZ(EnumC1260920iuw.class, str);
    }

    public EnumC1260920iuw(String str, int i, String str2) {
        this.LL = str2;
    }
}
