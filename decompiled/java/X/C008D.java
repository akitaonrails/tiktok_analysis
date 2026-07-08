package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008D, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C008D {
    public static final C008D BOOT_FINISH_START;
    public static final C008D FETCH_COMBINE_SETTINGS_REQUEST;
    public static final C008D FETCH_COMBINE_TASK_RUN;
    public static final /* synthetic */ C008D[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C008D SETTINGS_COMBINE_API_CREATE;
    public static final C008D SETTINGS_COMBINE_API_FINISH;
    public static final C008D SETTINGS_COMBINE_API_START;
    public static final C008D USE_SETTINGS_COMBINE_API;

    public static InterfaceC2044707zh<C008D> getEntries() {
        return LLILLJJLI;
    }

    static {
        C008D c008d = new C008D("BOOT_FINISH_START", 0);
        BOOT_FINISH_START = c008d;
        C008D c008d2 = new C008D("FETCH_COMBINE_TASK_RUN", 1);
        FETCH_COMBINE_TASK_RUN = c008d2;
        C008D c008d3 = new C008D("USE_SETTINGS_COMBINE_API", 2);
        USE_SETTINGS_COMBINE_API = c008d3;
        C008D c008d4 = new C008D("FETCH_COMBINE_SETTINGS_REQUEST", 3);
        FETCH_COMBINE_SETTINGS_REQUEST = c008d4;
        C008D c008d5 = new C008D("SETTINGS_COMBINE_API_CREATE", 4);
        SETTINGS_COMBINE_API_CREATE = c008d5;
        C008D c008d6 = new C008D("SETTINGS_COMBINE_API_START", 5);
        SETTINGS_COMBINE_API_START = c008d6;
        C008D c008d7 = new C008D("SETTINGS_COMBINE_API_FINISH", 6);
        SETTINGS_COMBINE_API_FINISH = c008d7;
        C008D[] c008dArr = {c008d, c008d2, c008d3, c008d4, c008d5, c008d6, c008d7};
        LL = c008dArr;
        LLILLJJLI = new C2254308sP(c008dArr);
    }

    public static C008D[] values() {
        return (C008D[]) LL.clone();
    }

    public static C008D valueOf(String str) {
        return (C008D) C08FF.LIZ(C008D.class, str);
    }

    public C008D(String str, int i) {
    }
}
