package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZMe, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes15.dex */
public final class EnumC898380ZMe {
    public static final EnumC898380ZMe ACTIVITY_STATUS_PUSH_SETTING_CHANGED;
    public static final EnumC898380ZMe ACTIVITY_STATUS_SETTING_CHANGED;
    public static final EnumC898380ZMe APP_TERMINATE;
    public static final EnumC898380ZMe COLD_START;
    public static final EnumC898380ZMe DEBUG_FORCE_REPORT;
    public static final EnumC898380ZMe ENTER_BACKGROUND;
    public static final EnumC898380ZMe ENTER_FOREGROUND;
    public static final /* synthetic */ EnumC898380ZMe[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final EnumC898380ZMe REGULAR_REPORT;
    public static final EnumC898380ZMe SWITCH_ACCOUNT;
    public final String LL;

    public static InterfaceC2044707zh<EnumC898380ZMe> getEntries() {
        return LLILLL;
    }

    static {
        EnumC898380ZMe enumC898380ZMe = new EnumC898380ZMe("REGULAR_REPORT", 0, "regular_report");
        REGULAR_REPORT = enumC898380ZMe;
        EnumC898380ZMe enumC898380ZMe2 = new EnumC898380ZMe("COLD_START", 1, "cold_start");
        COLD_START = enumC898380ZMe2;
        EnumC898380ZMe enumC898380ZMe3 = new EnumC898380ZMe("SWITCH_ACCOUNT", 2, "switch_account");
        SWITCH_ACCOUNT = enumC898380ZMe3;
        EnumC898380ZMe enumC898380ZMe4 = new EnumC898380ZMe("ACTIVITY_STATUS_SETTING_CHANGED", 3, "activity_status_setting_changed");
        ACTIVITY_STATUS_SETTING_CHANGED = enumC898380ZMe4;
        EnumC898380ZMe enumC898380ZMe5 = new EnumC898380ZMe("ACTIVITY_STATUS_PUSH_SETTING_CHANGED", 4, "activity_status_push_setting_changed");
        ACTIVITY_STATUS_PUSH_SETTING_CHANGED = enumC898380ZMe5;
        EnumC898380ZMe enumC898380ZMe6 = new EnumC898380ZMe("APP_TERMINATE", 5, "app_terminate");
        APP_TERMINATE = enumC898380ZMe6;
        EnumC898380ZMe enumC898380ZMe7 = new EnumC898380ZMe("ENTER_FOREGROUND", 6, "enter_foreground");
        ENTER_FOREGROUND = enumC898380ZMe7;
        EnumC898380ZMe enumC898380ZMe8 = new EnumC898380ZMe("ENTER_BACKGROUND", 7, "enter_background");
        ENTER_BACKGROUND = enumC898380ZMe8;
        EnumC898380ZMe enumC898380ZMe9 = new EnumC898380ZMe("DEBUG_FORCE_REPORT", 8, "debug_force_report");
        DEBUG_FORCE_REPORT = enumC898380ZMe9;
        EnumC898380ZMe[] enumC898380ZMeArr = {enumC898380ZMe, enumC898380ZMe2, enumC898380ZMe3, enumC898380ZMe4, enumC898380ZMe5, enumC898380ZMe6, enumC898380ZMe7, enumC898380ZMe8, enumC898380ZMe9};
        LLILLJJLI = enumC898380ZMeArr;
        LLILLL = new C2254308sP(enumC898380ZMeArr);
    }

    public static EnumC898380ZMe[] values() {
        return (EnumC898380ZMe[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static EnumC898380ZMe valueOf(String str) {
        return (EnumC898380ZMe) C08FF.LIZ(EnumC898380ZMe.class, str);
    }

    public EnumC898380ZMe(String str, int i, String str2) {
        this.LL = str2;
    }
}
