package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009E, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C009E {
    public static final /* synthetic */ C009E[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C009E PANEL_REQUEST_START;
    public static final C009E START_SESSION;
    public final String LL;

    public static InterfaceC2044707zh<C009E> getEntries() {
        return LLILLL;
    }

    static {
        C009E c009e = new C009E("START_SESSION", 0, "start_session");
        START_SESSION = c009e;
        C009E c009e2 = new C009E("PANEL_REQUEST_START", 1, "panel_request_start");
        PANEL_REQUEST_START = c009e2;
        C009E[] c009eArr = {c009e, c009e2};
        LLILLJJLI = c009eArr;
        LLILLL = new C2254308sP(c009eArr);
    }

    public static C009E[] values() {
        return (C009E[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C009E valueOf(String str) {
        return (C009E) C08FF.LIZ(C009E.class, str);
    }

    public C009E(String str, int i, String str2) {
        this.LL = str2;
    }
}
