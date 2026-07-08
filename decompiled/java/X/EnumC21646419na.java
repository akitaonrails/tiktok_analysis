package X;

import com.bytedance.tt.reliability.monitor.catchchecker.TryCatchGuardChecker;

/* JADX INFO: renamed from: X.19na, reason: invalid class name and case insensitive filesystem */
/* JADX INFO: loaded from: classes34.dex */
public enum EnumC21646419na {
    UNKNOWN("-1"),
    COLLECTED("00"),
    PARAMS_INVALID_DROP("01"),
    NOT_INIT_DROP("02"),
    PRE_PROCESS_START("03"),
    CACHED_BEFORE_HANDLE("04"),
    CACHE_DROP_BEFORE_HANDLE("05"),
    DATA_LIST_ADDED("06"),
    PRE_QUEUE_OVERFLOW("07"),
    PRE_EVENT_BLOCKED("08"),
    PRE_PROCESS_END("0F"),
    PROCESS_START("10"),
    TOURIST_BREAK("11"),
    FILTER_EVENT_BLOCKED("12"),
    FILTER_SERVER_BLOCKED("13"),
    FILTER_CUSTOM_BLOCKED("14"),
    FILTER_SAMPLING_DROPPED("15"),
    NO_SESSION_DROP("16"),
    PROCESS_END("1F"),
    DB_SAVE_START("20"),
    HANDLE_REALTIME_START("21"),
    REALTIME_SEND_START("22"),
    REALTIME_SEND_FAILED("23"),
    REALTIME_CRASH_DROP("24"),
    PRIORITY_HANDLE("28"),
    PRIORITY_ACCEPT("29"),
    DB_INSERT_START("2A"),
    DB_SAVE_FAILED("2B"),
    DB_SAVE_END("2F"),
    REPORT_START("30"),
    PACK_END("31"),
    PACK_INSERT_START("34"),
    PACK_INSERT_FAILED("35"),
    PACK_INSERT_END("36"),
    POST_ISOLATE("38"),
    POST_START("3A"),
    POST_FAILED("3B"),
    REPORT_END("3F");

    public final String LL;

    @Override // java.lang.Enum
    public String toString() {
        return this.LL;
    }

    public static EnumC21646419na fromLabel(String str) {
        for (EnumC21646419na enumC21646419na : values()) {
            if (enumC21646419na.LL.equals(str)) {
                return enumC21646419na;
            }
        }
        return UNKNOWN;
    }

    public static EnumC21646419na fromName(String str) {
        try {
            return valueOf(str);
        } catch (IllegalArgumentException e) {
            TryCatchGuardChecker.doCheck(e);
            return UNKNOWN;
        }
    }

    public static EnumC21646419na valueOf(String str) {
        return (EnumC21646419na) C08FF.LIZ(EnumC21646419na.class, str);
    }

    EnumC21646419na(String str) {
        this.LL = str;
    }
}
