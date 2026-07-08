package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Zt0, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC913760Zt0 {
    public static final EnumC913760Zt0 AI_SHOT_GROUP;
    public static final EnumC913760Zt0 CAMPUS_GROUP;
    public static final EnumC913760Zt0 EMPTY;
    public static final EnumC913760Zt0 EXTERNAL_SHARE_GROUP;
    public static final EnumC913760Zt0 FAN_GROUP;
    public static final EnumC913760Zt0 INBOX_BANNER_REC_GROUP;
    public static final EnumC913760Zt0 INCENTIVE_GROUP;
    public static final EnumC913760Zt0 LIVE_GROUP;
    public static final /* synthetic */ EnumC913760Zt0[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC913760Zt0 NORMAL_GROUP_CHAT;
    public static final EnumC913760Zt0 QR_CODE_GROUP;
    public final String LL;

    public static InterfaceC2044707zh<EnumC913760Zt0> getEntries() {
        return LLILLL;
    }

    static {
        EnumC913760Zt0 enumC913760Zt0 = new EnumC913760Zt0("EMPTY", 0, "");
        EMPTY = enumC913760Zt0;
        EnumC913760Zt0 enumC913760Zt02 = new EnumC913760Zt0("NORMAL_GROUP_CHAT", 1, "normal_group_chat");
        NORMAL_GROUP_CHAT = enumC913760Zt02;
        EnumC913760Zt0 enumC913760Zt03 = new EnumC913760Zt0("LIVE_GROUP", 2, "live_group");
        LIVE_GROUP = enumC913760Zt03;
        EnumC913760Zt0 enumC913760Zt04 = new EnumC913760Zt0("QR_CODE_GROUP", 3, "qr_code_group");
        QR_CODE_GROUP = enumC913760Zt04;
        EnumC913760Zt0 enumC913760Zt05 = new EnumC913760Zt0("AI_SHOT_GROUP", 4, "ai_shot_group");
        AI_SHOT_GROUP = enumC913760Zt05;
        EnumC913760Zt0 enumC913760Zt06 = new EnumC913760Zt0("EXTERNAL_SHARE_GROUP", 5, "external_share_group");
        EXTERNAL_SHARE_GROUP = enumC913760Zt06;
        EnumC913760Zt0 enumC913760Zt07 = new EnumC913760Zt0("INCENTIVE_GROUP", 6, "incentive_group");
        INCENTIVE_GROUP = enumC913760Zt07;
        EnumC913760Zt0 enumC913760Zt08 = new EnumC913760Zt0("INBOX_BANNER_REC_GROUP", 7, "inbox_recom_group_banner_group");
        INBOX_BANNER_REC_GROUP = enumC913760Zt08;
        EnumC913760Zt0 enumC913760Zt09 = new EnumC913760Zt0("FAN_GROUP", 8, "fan_group");
        FAN_GROUP = enumC913760Zt09;
        EnumC913760Zt0 enumC913760Zt010 = new EnumC913760Zt0("CAMPUS_GROUP", 9, "campus_group");
        CAMPUS_GROUP = enumC913760Zt010;
        EnumC913760Zt0[] enumC913760Zt0Arr = {enumC913760Zt0, enumC913760Zt02, enumC913760Zt03, enumC913760Zt04, enumC913760Zt05, enumC913760Zt06, enumC913760Zt07, enumC913760Zt08, enumC913760Zt09, enumC913760Zt010};
        LLILLJJLI = enumC913760Zt0Arr;
        LLILLL = new C2254308sP(enumC913760Zt0Arr);
    }

    public static EnumC913760Zt0[] values() {
        return (EnumC913760Zt0[]) LLILLJJLI.clone();
    }

    public final String mapToChatTypeForET() {
        int i = C1229450i6B.LIZ[ordinal()];
        return ((i == 1 || i == 2) ? C0ZY9.PUBLIC_GROUP : C0ZY9.GROUP).getValue();
    }

    public final String mapToType() {
        int i = C1229450i6B.LIZ[ordinal()];
        return i != 1 ? i != 2 ? "group" : this.LL : this.LL;
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC913760Zt0 valueOf(String str) {
        return (EnumC913760Zt0) C08FF.LIZ(EnumC913760Zt0.class, str);
    }

    public EnumC913760Zt0(String str, int i, String str2) {
        this.LL = str2;
    }
}
