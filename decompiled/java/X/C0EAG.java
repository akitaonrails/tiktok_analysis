package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0EAG, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0EAG {
    public static final C0EAG CLOSE_RETOUCH;
    public static final C0EAG ENTER_RETOUCH_PANEL;
    public static final /* synthetic */ C0EAG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0EAG START_RETOUCH;
    public final String LL;

    public static InterfaceC2044707zh<C0EAG> getEntries() {
        return LLILLL;
    }

    static {
        C0EAG c0eag = new C0EAG("START_RETOUCH", 0, "start_retouch");
        START_RETOUCH = c0eag;
        C0EAG c0eag2 = new C0EAG("CLOSE_RETOUCH", 1, "close_retouch");
        CLOSE_RETOUCH = c0eag2;
        C0EAG c0eag3 = new C0EAG("ENTER_RETOUCH_PANEL", 2, "enter_retouch_panel");
        ENTER_RETOUCH_PANEL = c0eag3;
        C0EAG[] c0eagArr = {c0eag, c0eag2, c0eag3};
        LLILLJJLI = c0eagArr;
        LLILLL = new C2254308sP(c0eagArr);
    }

    public static C0EAG[] values() {
        return (C0EAG[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0EAG valueOf(String str) {
        return (C0EAG) C08FF.LIZ(C0EAG.class, str);
    }

    public C0EAG(String str, int i, String str2) {
        this.LL = str2;
    }
}
