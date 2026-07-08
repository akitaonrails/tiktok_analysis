package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.10L9, reason: invalid class name */
/* JADX INFO: loaded from: classes29.dex */
public final class C10L9 {
    public static final C10L9 CLICK_NOT_INTERESTED;
    public static final C10L9 CLICK_REFRESH;
    public static final /* synthetic */ C10L9[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C10L9 SHOW;
    public static final C10L9 SWIPE_UP;
    public final String LL;

    public static InterfaceC2044707zh<C10L9> getEntries() {
        return LLILLL;
    }

    static {
        C10L9 c10l9 = new C10L9("SHOW", 0, "show");
        SHOW = c10l9;
        C10L9 c10l92 = new C10L9("CLICK_NOT_INTERESTED", 1, "click_not_interested");
        CLICK_NOT_INTERESTED = c10l92;
        C10L9 c10l93 = new C10L9("CLICK_REFRESH", 2, "click_refresh");
        CLICK_REFRESH = c10l93;
        C10L9 c10l94 = new C10L9("SWIPE_UP", 3, "swipe_up");
        SWIPE_UP = c10l94;
        C10L9[] c10l9Arr = {c10l9, c10l92, c10l93, c10l94};
        LLILLJJLI = c10l9Arr;
        LLILLL = new C2254308sP(c10l9Arr);
    }

    public static C10L9[] values() {
        return (C10L9[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static C10L9 valueOf(String str) {
        return (C10L9) C08FF.LIZ(C10L9.class, str);
    }

    public C10L9(String str, int i, String str2) {
        this.LL = str2;
    }
}
