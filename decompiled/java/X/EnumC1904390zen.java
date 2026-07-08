package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0zen, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes29.dex */
public final class EnumC1904390zen {
    public static final EnumC1904390zen FIRST_INBOX_BUBBLE_TIMESTAMP;
    public static final EnumC1904390zen FIRST_INBOX_BUBBLE_TO_TAB_INTERVAL;
    public static final EnumC1904390zen HAS_TAB_DOT;
    public static final EnumC1904390zen LAUNCH_TIMESTAMP;
    public static final EnumC1904390zen LAUNCH_TO_NOTICE_COUNT_INTERVAL;
    public static final EnumC1904390zen LAUNCH_TO_TAB_INTERVAL;
    public static final /* synthetic */ EnumC1904390zen[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final EnumC1904390zen MAIN_ACTIVITY_TIMESTAMP;
    public static final EnumC1904390zen MAIN_ACTIVITY_TO_TAB_INTERVAL;
    public static final EnumC1904390zen NOTICE_COUNT_TIMESTAMP;
    public static final EnumC1904390zen NOTICE_COUNT_TO_TAB_INTERVAL;
    public static final EnumC1904390zen SWITCH_TAB_TIMESTAMP;
    public static final EnumC1904390zen TOTAL_UNREAD_COUNT;
    public final String LL;
    public volatile long LLILLJJLI = -1;

    public static InterfaceC2044707zh<EnumC1904390zen> getEntries() {
        return LLILZ;
    }

    public final synchronized long getEventValue() {
        return this.LLILLJJLI == -1 ? 0L : this.LLILLJJLI;
    }

    public final synchronized void trackTime() {
        setEventValue(System.currentTimeMillis());
    }

    static {
        EnumC1904390zen enumC1904390zen = new EnumC1904390zen("LAUNCH_TIMESTAMP", 0, "inbox_launch_timestamp");
        LAUNCH_TIMESTAMP = enumC1904390zen;
        EnumC1904390zen enumC1904390zen2 = new EnumC1904390zen("MAIN_ACTIVITY_TIMESTAMP", 1, "main_activity_timestamp");
        MAIN_ACTIVITY_TIMESTAMP = enumC1904390zen2;
        EnumC1904390zen enumC1904390zen3 = new EnumC1904390zen("FIRST_INBOX_BUBBLE_TIMESTAMP", 2, "first_inbox_bubble_timestamp");
        FIRST_INBOX_BUBBLE_TIMESTAMP = enumC1904390zen3;
        EnumC1904390zen enumC1904390zen4 = new EnumC1904390zen("NOTICE_COUNT_TIMESTAMP", 3, "inbox_notice_count_timestamp");
        NOTICE_COUNT_TIMESTAMP = enumC1904390zen4;
        EnumC1904390zen enumC1904390zen5 = new EnumC1904390zen("SWITCH_TAB_TIMESTAMP", 4, "inbox_switch_tab_timestamp");
        SWITCH_TAB_TIMESTAMP = enumC1904390zen5;
        EnumC1904390zen enumC1904390zen6 = new EnumC1904390zen("LAUNCH_TO_TAB_INTERVAL", 5, "inbox_launch_to_tab_interval");
        LAUNCH_TO_TAB_INTERVAL = enumC1904390zen6;
        EnumC1904390zen enumC1904390zen7 = new EnumC1904390zen("MAIN_ACTIVITY_TO_TAB_INTERVAL", 6, "inbox_main_activity_to_tab_interval");
        MAIN_ACTIVITY_TO_TAB_INTERVAL = enumC1904390zen7;
        EnumC1904390zen enumC1904390zen8 = new EnumC1904390zen("FIRST_INBOX_BUBBLE_TO_TAB_INTERVAL", 7, "first_inbox_bubble_to_tab_interval");
        FIRST_INBOX_BUBBLE_TO_TAB_INTERVAL = enumC1904390zen8;
        EnumC1904390zen enumC1904390zen9 = new EnumC1904390zen("NOTICE_COUNT_TO_TAB_INTERVAL", 8, "inbox_notice_count_to_tab_interval");
        NOTICE_COUNT_TO_TAB_INTERVAL = enumC1904390zen9;
        EnumC1904390zen enumC1904390zen10 = new EnumC1904390zen("LAUNCH_TO_NOTICE_COUNT_INTERVAL", 9, "inbox_launch_to_notice_count_interval");
        LAUNCH_TO_NOTICE_COUNT_INTERVAL = enumC1904390zen10;
        EnumC1904390zen enumC1904390zen11 = new EnumC1904390zen("TOTAL_UNREAD_COUNT", 10, "inbox_total_unread_count");
        TOTAL_UNREAD_COUNT = enumC1904390zen11;
        EnumC1904390zen enumC1904390zen12 = new EnumC1904390zen("HAS_TAB_DOT", 11, "inbox_has_tab_dot");
        HAS_TAB_DOT = enumC1904390zen12;
        EnumC1904390zen[] enumC1904390zenArr = {enumC1904390zen, enumC1904390zen2, enumC1904390zen3, enumC1904390zen4, enumC1904390zen5, enumC1904390zen6, enumC1904390zen7, enumC1904390zen8, enumC1904390zen9, enumC1904390zen10, enumC1904390zen11, enumC1904390zen12};
        LLILLL = enumC1904390zenArr;
        LLILZ = new C2254308sP(enumC1904390zenArr);
    }

    public static EnumC1904390zen[] values() {
        return (EnumC1904390zen[]) LLILLL.clone();
    }

    public final String getEventKey() {
        return this.LL;
    }

    public static EnumC1904390zen valueOf(String str) {
        return (EnumC1904390zen) C08FF.LIZ(EnumC1904390zen.class, str);
    }

    public final long minus(EnumC1904390zen enumC1904390zen) {
        if (this.LLILLJJLI != -1 && enumC1904390zen.LLILLJJLI != -1) {
            return this.LLILLJJLI - enumC1904390zen.LLILLJJLI;
        }
        return 0L;
    }

    public final synchronized void setEventValue(long j) {
        this.LLILLJJLI = j;
    }

    public EnumC1904390zen(String str, int i, String str2) {
        this.LL = str2;
    }
}
