package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.06ig, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class EnumC1684406ig {
    public static final EnumC1684406ig CHATROOM;
    public static final EnumC1684406ig INBOX;
    public static final EnumC1684406ig INLINE;
    public static final /* synthetic */ EnumC1684406ig[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<EnumC1684406ig> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC1684406ig enumC1684406ig = new EnumC1684406ig("CHATROOM", 0);
        CHATROOM = enumC1684406ig;
        EnumC1684406ig enumC1684406ig2 = new EnumC1684406ig("INLINE", 1);
        INLINE = enumC1684406ig2;
        EnumC1684406ig enumC1684406ig3 = new EnumC1684406ig("INBOX", 2);
        INBOX = enumC1684406ig3;
        EnumC1684406ig[] enumC1684406igArr = {enumC1684406ig, enumC1684406ig2, enumC1684406ig3};
        LL = enumC1684406igArr;
        LLILLJJLI = new C2254308sP(enumC1684406igArr);
    }

    public static EnumC1684406ig[] values() {
        return (EnumC1684406ig[]) LL.clone();
    }

    public final String getToEnterFromMobValue() {
        int i = C1684306if.LIZ[ordinal()];
        if (i == 1 || i == 2) {
            return "chat";
        }
        if (i == 3) {
            return "click_messaging_settings_option";
        }
        throw new C1954807lC();
    }

    public final String getToEnterMethodMobValue() {
        int i = C1684306if.LIZ[ordinal()];
        if (i == 1) {
            return "aichat";
        }
        if (i == 2) {
            return "ai_inline_message";
        }
        if (i == 3) {
            return "ai_inbox_btn";
        }
        throw new C1954807lC();
    }

    public final boolean isFromBotChat() {
        return this == CHATROOM;
    }

    public static EnumC1684406ig valueOf(String str) {
        return (EnumC1684406ig) C08FF.LIZ(EnumC1684406ig.class, str);
    }

    public EnumC1684406ig(String str, int i) {
    }
}
