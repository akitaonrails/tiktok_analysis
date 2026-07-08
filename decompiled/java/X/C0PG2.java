package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PG2, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PG2 {
    public static final C0PG2 ABORT_REQUEST;
    public static final C0PG2 INIT;
    public static final /* synthetic */ C0PG2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0PG2 REQUEST_REORDER_TAB_FINISH;
    public static final C0PG2 REQUEST_RETURN;
    public static final C0PG2 RESET;
    public static final C0PG2 RESET_BY_OTHER_TAB;
    public static final C0PG2 SEND_REQUEST_NOW;
    public static final C0PG2 SMART_MODEL_RETURN;
    public final int LL;

    public static InterfaceC2044707zh<C0PG2> getEntries() {
        return LLILLL;
    }

    static {
        C0PG2 c0pg2 = new C0PG2("INIT", 0, -1);
        INIT = c0pg2;
        C0PG2 c0pg22 = new C0PG2("RESET", 1, 0);
        RESET = c0pg22;
        C0PG2 c0pg23 = new C0PG2("SEND_REQUEST_NOW", 2, 1);
        SEND_REQUEST_NOW = c0pg23;
        C0PG2 c0pg24 = new C0PG2("REQUEST_RETURN", 3, 2);
        REQUEST_RETURN = c0pg24;
        C0PG2 c0pg25 = new C0PG2("ABORT_REQUEST", 4, 3);
        ABORT_REQUEST = c0pg25;
        C0PG2 c0pg26 = new C0PG2("RESET_BY_OTHER_TAB", 5, 4);
        RESET_BY_OTHER_TAB = c0pg26;
        C0PG2 c0pg27 = new C0PG2("SMART_MODEL_RETURN", 6, 5);
        SMART_MODEL_RETURN = c0pg27;
        C0PG2 c0pg28 = new C0PG2("REQUEST_REORDER_TAB_FINISH", 7, 6);
        REQUEST_REORDER_TAB_FINISH = c0pg28;
        C0PG2[] c0pg2Arr = {c0pg2, c0pg22, c0pg23, c0pg24, c0pg25, c0pg26, c0pg27, c0pg28};
        LLILLJJLI = c0pg2Arr;
        LLILLL = new C2254308sP(c0pg2Arr);
    }

    public static C0PG2[] values() {
        return (C0PG2[]) LLILLJJLI.clone();
    }

    public final int getState() {
        return this.LL;
    }

    public static C0PG2 valueOf(String str) {
        return (C0PG2) C08FF.LIZ(C0PG2.class, str);
    }

    public C0PG2(String str, int i, int i2) {
        this.LL = i2;
    }
}
