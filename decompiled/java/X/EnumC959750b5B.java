package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0b5B, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes16.dex */
public final class EnumC959750b5B {
    public static final /* synthetic */ EnumC959750b5B[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final EnumC959750b5B TYPE_AUTO_START_WHEN_END;
    public static final EnumC959750b5B TYPE_AUTO_START_WHEN_USER_LEFT;
    public static final EnumC959750b5B TYPE_AUTO_TEST;
    public static final EnumC959750b5B TYPE_GROUP_CHANNEL_ID_CHANGE;
    public static final EnumC959750b5B TYPE_INVITEE_LIST_DIALOG;
    public static final EnumC959750b5B TYPE_QUICK_BATTLE_BUTTON_CLICK;
    public static final EnumC959750b5B TYPE_RESTART_QUICK_COHOST_OPEN_SUGGESTED_INVITE;
    public static final EnumC959750b5B TYPE_RESTART_QUICK_COHOST_WHEN_CONNECTED;
    public static final EnumC959750b5B TYPE_RETRY_BY_KEEP_ALIVE;
    public static final EnumC959750b5B TYPE_TEAM_PAIR_BUTTON_CLICK;
    public static final EnumC959750b5B TYPE_TEAM_PAIR_SYNC_STATE;

    public static InterfaceC2044707zh<EnumC959750b5B> getEntries() {
        return LLILLJJLI;
    }

    static {
        EnumC959750b5B enumC959750b5B = new EnumC959750b5B("TYPE_INVITEE_LIST_DIALOG", 0);
        TYPE_INVITEE_LIST_DIALOG = enumC959750b5B;
        EnumC959750b5B enumC959750b5B2 = new EnumC959750b5B("TYPE_AUTO_START_WHEN_END", 1);
        TYPE_AUTO_START_WHEN_END = enumC959750b5B2;
        EnumC959750b5B enumC959750b5B3 = new EnumC959750b5B("TYPE_AUTO_START_WHEN_USER_LEFT", 2);
        TYPE_AUTO_START_WHEN_USER_LEFT = enumC959750b5B3;
        EnumC959750b5B enumC959750b5B4 = new EnumC959750b5B("TYPE_RETRY_BY_KEEP_ALIVE", 3);
        TYPE_RETRY_BY_KEEP_ALIVE = enumC959750b5B4;
        EnumC959750b5B enumC959750b5B5 = new EnumC959750b5B("TYPE_AUTO_TEST", 4);
        TYPE_AUTO_TEST = enumC959750b5B5;
        EnumC959750b5B enumC959750b5B6 = new EnumC959750b5B("TYPE_GROUP_CHANNEL_ID_CHANGE", 5);
        TYPE_GROUP_CHANNEL_ID_CHANGE = enumC959750b5B6;
        EnumC959750b5B enumC959750b5B7 = new EnumC959750b5B("TYPE_RESTART_QUICK_COHOST_WHEN_CONNECTED", 6);
        TYPE_RESTART_QUICK_COHOST_WHEN_CONNECTED = enumC959750b5B7;
        EnumC959750b5B enumC959750b5B8 = new EnumC959750b5B("TYPE_TEAM_PAIR_BUTTON_CLICK", 7);
        TYPE_TEAM_PAIR_BUTTON_CLICK = enumC959750b5B8;
        EnumC959750b5B enumC959750b5B9 = new EnumC959750b5B("TYPE_TEAM_PAIR_SYNC_STATE", 8);
        TYPE_TEAM_PAIR_SYNC_STATE = enumC959750b5B9;
        EnumC959750b5B enumC959750b5B10 = new EnumC959750b5B("TYPE_QUICK_BATTLE_BUTTON_CLICK", 9);
        TYPE_QUICK_BATTLE_BUTTON_CLICK = enumC959750b5B10;
        EnumC959750b5B enumC959750b5B11 = new EnumC959750b5B("TYPE_RESTART_QUICK_COHOST_OPEN_SUGGESTED_INVITE", 10);
        TYPE_RESTART_QUICK_COHOST_OPEN_SUGGESTED_INVITE = enumC959750b5B11;
        EnumC959750b5B[] enumC959750b5BArr = {enumC959750b5B, enumC959750b5B2, enumC959750b5B3, enumC959750b5B4, enumC959750b5B5, enumC959750b5B6, enumC959750b5B7, enumC959750b5B8, enumC959750b5B9, enumC959750b5B10, enumC959750b5B11};
        LL = enumC959750b5BArr;
        LLILLJJLI = new C2254308sP(enumC959750b5BArr);
    }

    public static EnumC959750b5B[] values() {
        return (EnumC959750b5B[]) LL.clone();
    }

    public static EnumC959750b5B valueOf(String str) {
        return (EnumC959750b5B) C08FF.LIZ(EnumC959750b5B.class, str);
    }

    public EnumC959750b5B(String str, int i) {
    }
}
