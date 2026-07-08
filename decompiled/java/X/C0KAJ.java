package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KAJ, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KAJ {
    public static final C0KAJ AUTO_CONTROL;
    public static final C0KAJ AUTO_TERMINATE;
    public static final C0KAJ AUTO_TIMEOUT;
    public static final C512820K9g Companion;
    public static final /* synthetic */ C0KAJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0KAJ MANUALLY_CLOSE;
    public static final C0KAJ MANUALLY_ROUTE;
    public static final C0KAJ NON_RESUMABLE;
    public static final C0KAJ REACH_MAX_ACTIVE_COUNT;
    public static final C0KAJ SHORT_REMAIN_TIME;
    public final String LL;

    public static InterfaceC2044707zh<C0KAJ> getEntries() {
        return LLILLL;
    }

    static {
        C0KAJ c0kaj = new C0KAJ("MANUALLY_CLOSE", 0, "manually_close");
        MANUALLY_CLOSE = c0kaj;
        C0KAJ c0kaj2 = new C0KAJ("MANUALLY_ROUTE", 1, "manually_route");
        MANUALLY_ROUTE = c0kaj2;
        C0KAJ c0kaj3 = new C0KAJ("AUTO_TIMEOUT", 2, "auto_overtime");
        AUTO_TIMEOUT = c0kaj3;
        C0KAJ c0kaj4 = new C0KAJ("AUTO_CONTROL", 3, "auto_control");
        AUTO_CONTROL = c0kaj4;
        C0KAJ c0kaj5 = new C0KAJ("AUTO_TERMINATE", 4, "auto_terminate");
        AUTO_TERMINATE = c0kaj5;
        C0KAJ c0kaj6 = new C0KAJ("NON_RESUMABLE", 5, "non_resumed_avoid");
        NON_RESUMABLE = c0kaj6;
        C0KAJ c0kaj7 = new C0KAJ("REACH_MAX_ACTIVE_COUNT", 6, "reach_max_avoid_cnt");
        REACH_MAX_ACTIVE_COUNT = c0kaj7;
        C0KAJ c0kaj8 = new C0KAJ("SHORT_REMAIN_TIME", 7, "short_remain_time");
        SHORT_REMAIN_TIME = c0kaj8;
        C0KAJ[] c0kajArr = {c0kaj, c0kaj2, c0kaj3, c0kaj4, c0kaj5, c0kaj6, c0kaj7, c0kaj8};
        LLILLJJLI = c0kajArr;
        LLILLL = new C2254308sP(c0kajArr);
        Companion = new C512820K9g();
    }

    public static C0KAJ[] values() {
        return (C0KAJ[]) LLILLJJLI.clone();
    }

    public final String getKey() {
        return this.LL;
    }

    public static C0KAJ valueOf(String str) {
        return (C0KAJ) C08FF.LIZ(C0KAJ.class, str);
    }

    public C0KAJ(String str, int i, String str2) {
        this.LL = str2;
    }
}
