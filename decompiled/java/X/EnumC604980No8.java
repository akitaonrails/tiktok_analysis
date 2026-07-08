package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0No8, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class EnumC604980No8 {
    public static final EnumC604980No8 BULLETIN_SETTING_TYPE_AUTO_SHARE_LIVE_EVENT;
    public static final EnumC604980No8 BULLETIN_SETTING_TYPE_AUTO_SHARE_LIVE_ROOM;
    public static final EnumC604980No8 BULLETIN_SETTING_TYPE_AUTO_SHARE_POST;
    public static final EnumC604980No8 BULLETIN_SETTING_TYPE_CHANNEL_ALLOW_DOWNLOAD_VIDEO;
    public static final EnumC604980No8 BULLETIN_SETTING_TYPE_CHANNEL_COMMENT;
    public static final EnumC604980No8 BULLETIN_SETTING_TYPE_CHANNEL_MUTE_IN_INBOX;
    public static final EnumC604980No8 BULLETIN_SETTING_TYPE_CHANNEL_PIN_TOP_INBOX;
    public static final EnumC604980No8 BULLETIN_SETTING_TYPE_CHANNEL_SHOW_IN_PROFILE;
    public static final EnumC604980No8 BULLETIN_SETTING_TYPE_SHOWCASE_SHOW_IN_CHANNEL;
    public static final EnumC604980No8 BULLETIN_SETTING_TYPE_UNKNOWN;
    public static final /* synthetic */ EnumC604980No8[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<EnumC604980No8> getEntries() {
        return LLILLL;
    }

    static {
        EnumC604980No8 enumC604980No8 = new EnumC604980No8("BULLETIN_SETTING_TYPE_UNKNOWN", 0, 0);
        BULLETIN_SETTING_TYPE_UNKNOWN = enumC604980No8;
        EnumC604980No8 enumC604980No82 = new EnumC604980No8("BULLETIN_SETTING_TYPE_CHANNEL_SHOW_IN_PROFILE", 1, 1);
        BULLETIN_SETTING_TYPE_CHANNEL_SHOW_IN_PROFILE = enumC604980No82;
        EnumC604980No8 enumC604980No83 = new EnumC604980No8("BULLETIN_SETTING_TYPE_CHANNEL_PIN_TOP_INBOX", 2, 2);
        BULLETIN_SETTING_TYPE_CHANNEL_PIN_TOP_INBOX = enumC604980No83;
        EnumC604980No8 enumC604980No84 = new EnumC604980No8("BULLETIN_SETTING_TYPE_CHANNEL_MUTE_IN_INBOX", 3, 3);
        BULLETIN_SETTING_TYPE_CHANNEL_MUTE_IN_INBOX = enumC604980No84;
        EnumC604980No8 enumC604980No85 = new EnumC604980No8("BULLETIN_SETTING_TYPE_AUTO_SHARE_POST", 4, 4);
        BULLETIN_SETTING_TYPE_AUTO_SHARE_POST = enumC604980No85;
        EnumC604980No8 enumC604980No86 = new EnumC604980No8("BULLETIN_SETTING_TYPE_AUTO_SHARE_LIVE_EVENT", 5, 5);
        BULLETIN_SETTING_TYPE_AUTO_SHARE_LIVE_EVENT = enumC604980No86;
        EnumC604980No8 enumC604980No87 = new EnumC604980No8("BULLETIN_SETTING_TYPE_AUTO_SHARE_LIVE_ROOM", 6, 6);
        BULLETIN_SETTING_TYPE_AUTO_SHARE_LIVE_ROOM = enumC604980No87;
        EnumC604980No8 enumC604980No88 = new EnumC604980No8("BULLETIN_SETTING_TYPE_SHOWCASE_SHOW_IN_CHANNEL", 7, 7);
        BULLETIN_SETTING_TYPE_SHOWCASE_SHOW_IN_CHANNEL = enumC604980No88;
        EnumC604980No8 enumC604980No89 = new EnumC604980No8("BULLETIN_SETTING_TYPE_CHANNEL_COMMENT", 8, 8);
        BULLETIN_SETTING_TYPE_CHANNEL_COMMENT = enumC604980No89;
        EnumC604980No8 enumC604980No810 = new EnumC604980No8("BULLETIN_SETTING_TYPE_CHANNEL_ALLOW_DOWNLOAD_VIDEO", 9, 9);
        BULLETIN_SETTING_TYPE_CHANNEL_ALLOW_DOWNLOAD_VIDEO = enumC604980No810;
        EnumC604980No8[] enumC604980No8Arr = {enumC604980No8, enumC604980No82, enumC604980No83, enumC604980No84, enumC604980No85, enumC604980No86, enumC604980No87, enumC604980No88, enumC604980No89, enumC604980No810};
        LLILLJJLI = enumC604980No8Arr;
        LLILLL = new C2254308sP(enumC604980No8Arr);
    }

    public static EnumC604980No8[] values() {
        return (EnumC604980No8[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static EnumC604980No8 valueOf(String str) {
        return (EnumC604980No8) C08FF.LIZ(EnumC604980No8.class, str);
    }

    public EnumC604980No8(String str, int i, int i2) {
        this.LL = i2;
    }
}
