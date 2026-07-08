package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0bRH, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC973450bRH {
    public static final EnumC973450bRH ANCHOR_NO_COHOST_PERMISSION;
    public static final EnumC973450bRH CANCEL_BY_FIRST_GUIDE;
    public static final EnumC973450bRH COHOST_MODE_SCREEN_SHARE;
    public static final EnumC973450bRH INVITING_OTHER_TO_COHOST;
    public static final EnumC973450bRH IN_PUNISHED;
    public static final /* synthetic */ EnumC973450bRH[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC973450bRH NON_CONNECTION;
    public static final EnumC973450bRH NO_GIFT_PERMISSION;
    public static final EnumC973450bRH PREPARE_CHANNEL_ID_INVALID;
    public static final EnumC973450bRH PREPARE_FAILED;
    public static final EnumC973450bRH QUICK_INVITING;
    public static final EnumC973450bRH RECEIVE_INVITE;
    public static final EnumC973450bRH WAITING_FOR_QUIT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC973450bRH> getEntries() {
        return LLILLL;
    }

    static {
        EnumC973450bRH enumC973450bRH = new EnumC973450bRH("ANCHOR_NO_COHOST_PERMISSION", 0, "anchor_onboard_no_permit");
        ANCHOR_NO_COHOST_PERMISSION = enumC973450bRH;
        EnumC973450bRH enumC973450bRH2 = new EnumC973450bRH("INVITING_OTHER_TO_COHOST", 1, "inviting_others_to_cohost");
        INVITING_OTHER_TO_COHOST = enumC973450bRH2;
        EnumC973450bRH enumC973450bRH3 = new EnumC973450bRH("QUICK_INVITING", 2, "quick_inviting");
        QUICK_INVITING = enumC973450bRH3;
        EnumC973450bRH enumC973450bRH4 = new EnumC973450bRH("CANCEL_BY_FIRST_GUIDE", 3, "cancelled_by_first_guide_panel");
        CANCEL_BY_FIRST_GUIDE = enumC973450bRH4;
        EnumC973450bRH enumC973450bRH5 = new EnumC973450bRH("PREPARE_FAILED", 4, "prepare_failed");
        PREPARE_FAILED = enumC973450bRH5;
        EnumC973450bRH enumC973450bRH6 = new EnumC973450bRH("NO_GIFT_PERMISSION", 5, "no_gift_permission");
        NO_GIFT_PERMISSION = enumC973450bRH6;
        EnumC973450bRH enumC973450bRH7 = new EnumC973450bRH("IN_PUNISHED", 6, "in_punished");
        IN_PUNISHED = enumC973450bRH7;
        EnumC973450bRH enumC973450bRH8 = new EnumC973450bRH("RECEIVE_INVITE", 7, "received_invite");
        RECEIVE_INVITE = enumC973450bRH8;
        EnumC973450bRH enumC973450bRH9 = new EnumC973450bRH("WAITING_FOR_QUIT", 8, "waiting_for_quit");
        WAITING_FOR_QUIT = enumC973450bRH9;
        EnumC973450bRH enumC973450bRH10 = new EnumC973450bRH("COHOST_MODE_SCREEN_SHARE", 9, "cohost_mode_screen_share");
        COHOST_MODE_SCREEN_SHARE = enumC973450bRH10;
        EnumC973450bRH enumC973450bRH11 = new EnumC973450bRH("PREPARE_CHANNEL_ID_INVALID", 10, "prepare_channel_id_invalid");
        PREPARE_CHANNEL_ID_INVALID = enumC973450bRH11;
        EnumC973450bRH enumC973450bRH12 = new EnumC973450bRH("NON_CONNECTION", 11, "non_connection");
        NON_CONNECTION = enumC973450bRH12;
        EnumC973450bRH[] enumC973450bRHArr = {enumC973450bRH, enumC973450bRH2, enumC973450bRH3, enumC973450bRH4, enumC973450bRH5, enumC973450bRH6, enumC973450bRH7, enumC973450bRH8, enumC973450bRH9, enumC973450bRH10, enumC973450bRH11, enumC973450bRH12};
        LLILLJJLI = enumC973450bRHArr;
        LLILLL = new C2254308sP(enumC973450bRHArr);
    }

    public static EnumC973450bRH[] values() {
        return (EnumC973450bRH[]) LLILLJJLI.clone();
    }

    public final String getReason() {
        return this.LL;
    }

    public static EnumC973450bRH valueOf(String str) {
        return (EnumC973450bRH) C08FF.LIZ(EnumC973450bRH.class, str);
    }

    public EnumC973450bRH(String str, int i, String str2) {
        this.LL = str2;
    }
}
