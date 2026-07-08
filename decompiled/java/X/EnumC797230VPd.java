package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0VPd, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes14.dex */
public final class EnumC797230VPd {
    public static final EnumC797230VPd COLUMN_ACTIVITY_STATUS_SETTING;
    public static final EnumC797230VPd COLUMN_AFFINITY_SCORE;
    public static final EnumC797230VPd COLUMN_ALLOW_SINGLE_CHAT_SCREENSHOT;
    public static final EnumC797230VPd COLUMN_CHAT_BOT_INFO;
    public static final EnumC797230VPd COLUMN_CHAT_BUBBLE_ID;
    public static final EnumC797230VPd COLUMN_GROUP_CHAT_PERMISSION_INFO;
    public static final EnumC797230VPd COLUMN_SHARE_FILTER_TYPE;
    public static final EnumC797230VPd COLUMN_UID;
    public static final EnumC797230VPd COLUMN_UNLOCKED_BUBBLE_IDS;
    public static final EnumC797230VPd COLUMN_UPDATE_TIME;
    public static final EnumC797230VPd COLUMN_USER_B2C_ACCOUNT_INFO;
    public static final EnumC797230VPd COLUMN_USER_CAMERA_INFO;
    public static final EnumC797230VPd COLUMN_VOICE_CALL_INFO;
    public static final /* synthetic */ EnumC797230VPd[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public final String key;
    public final String type;

    public static InterfaceC2044707zh<EnumC797230VPd> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC797230VPd enumC797230VPd = new EnumC797230VPd("COLUMN_UID", 0, "UID", "INTEGER PRIMARY KEY NOT NULL");
        COLUMN_UID = enumC797230VPd;
        EnumC797230VPd enumC797230VPd2 = new EnumC797230VPd("COLUMN_SHARE_FILTER_TYPE", 1, "SHARE_FILTER_TYPE", "INTEGER");
        COLUMN_SHARE_FILTER_TYPE = enumC797230VPd2;
        EnumC797230VPd enumC797230VPd3 = new EnumC797230VPd("COLUMN_AFFINITY_SCORE", 2, "AFFINITY_SCORE", "DOUBLE DEFAULT 0");
        COLUMN_AFFINITY_SCORE = enumC797230VPd3;
        EnumC797230VPd enumC797230VPd4 = new EnumC797230VPd("COLUMN_UPDATE_TIME", 3, "UPDATE_TIME", "INTEGER");
        COLUMN_UPDATE_TIME = enumC797230VPd4;
        EnumC797230VPd enumC797230VPd5 = new EnumC797230VPd("COLUMN_USER_B2C_ACCOUNT_INFO", 4, "USER_B2C_ACCOUNT_INFO", "text");
        COLUMN_USER_B2C_ACCOUNT_INFO = enumC797230VPd5;
        EnumC797230VPd enumC797230VPd6 = new EnumC797230VPd("COLUMN_USER_CAMERA_INFO", 5, "CAMERA_INFO", "text");
        COLUMN_USER_CAMERA_INFO = enumC797230VPd6;
        EnumC797230VPd enumC797230VPd7 = new EnumC797230VPd("COLUMN_CHAT_BOT_INFO", 6, "CHAT_BOT_INFO", "text");
        COLUMN_CHAT_BOT_INFO = enumC797230VPd7;
        EnumC797230VPd enumC797230VPd8 = new EnumC797230VPd("COLUMN_ALLOW_SINGLE_CHAT_SCREENSHOT", 7, "ALLOW_SINGLE_CHAT_SCREENSHOT", "INTEGER");
        COLUMN_ALLOW_SINGLE_CHAT_SCREENSHOT = enumC797230VPd8;
        EnumC797230VPd enumC797230VPd9 = new EnumC797230VPd("COLUMN_GROUP_CHAT_PERMISSION_INFO", 8, "GROUP_CHAT_PERMISSION_INFO", "text");
        COLUMN_GROUP_CHAT_PERMISSION_INFO = enumC797230VPd9;
        EnumC797230VPd enumC797230VPd10 = new EnumC797230VPd("COLUMN_ACTIVITY_STATUS_SETTING", 9, "ACTIVITY_STATUS_SETTING", "INTEGER");
        COLUMN_ACTIVITY_STATUS_SETTING = enumC797230VPd10;
        EnumC797230VPd enumC797230VPd11 = new EnumC797230VPd("COLUMN_CHAT_BUBBLE_ID", 10, "CHAT_BUBBLE_ID", "INTEGER");
        COLUMN_CHAT_BUBBLE_ID = enumC797230VPd11;
        EnumC797230VPd enumC797230VPd12 = new EnumC797230VPd("COLUMN_UNLOCKED_BUBBLE_IDS", 11, "UNLOCKED_BUBBLE_IDS", "text");
        COLUMN_UNLOCKED_BUBBLE_IDS = enumC797230VPd12;
        EnumC797230VPd enumC797230VPd13 = new EnumC797230VPd("COLUMN_VOICE_CALL_INFO", 12, "VOICE_CALL_INFO", "text");
        COLUMN_VOICE_CALL_INFO = enumC797230VPd13;
        EnumC797230VPd[] enumC797230VPdArr = {enumC797230VPd, enumC797230VPd2, enumC797230VPd3, enumC797230VPd4, enumC797230VPd5, enumC797230VPd6, enumC797230VPd7, enumC797230VPd8, enumC797230VPd9, enumC797230VPd10, enumC797230VPd11, enumC797230VPd12, enumC797230VPd13};
        LL = enumC797230VPdArr;
        LLILLJJLI = new C2254308sP(enumC797230VPdArr);
    }

    public static EnumC797230VPd[] values() {
        return (EnumC797230VPd[]) LL.clone();
    }

    public static EnumC797230VPd valueOf(String str) {
        return (EnumC797230VPd) C08FF.LIZ(EnumC797230VPd.class, str);
    }

    public EnumC797230VPd(String str, int i, String str2, String str3) {
        this.key = str2;
        this.type = str3;
    }
}
