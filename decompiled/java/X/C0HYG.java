package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0HYG, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0HYG {
    public static final C0HYG BACK;
    public static final C0HYG BACK_USE_SWIPE_ANIM;
    public static final C0HYG CLOSE;
    public static final /* synthetic */ C0HYG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0HYG PULL_UP;
    public static final C0HYG REPORT;
    public final String LL;

    public static InterfaceC2044707zh<C0HYG> getEntries() {
        return LLILLL;
    }

    static {
        C0HYG c0hyg = new C0HYG("PULL_UP", 0, "swipe_up");
        PULL_UP = c0hyg;
        C0HYG c0hyg2 = new C0HYG("BACK", 1, "click_back_button");
        BACK = c0hyg2;
        C0HYG c0hyg3 = new C0HYG("BACK_USE_SWIPE_ANIM", 2, "click_back_button");
        BACK_USE_SWIPE_ANIM = c0hyg3;
        C0HYG c0hyg4 = new C0HYG("CLOSE", 3, "close");
        CLOSE = c0hyg4;
        C0HYG c0hyg5 = new C0HYG("REPORT", 4, "report");
        REPORT = c0hyg5;
        C0HYG[] c0hygArr = {c0hyg, c0hyg2, c0hyg3, c0hyg4, c0hyg5};
        LLILLJJLI = c0hygArr;
        LLILLL = new C2254308sP(c0hygArr);
    }

    public static C0HYG[] values() {
        return (C0HYG[]) LLILLJJLI.clone();
    }

    public final String getMobValue() {
        return this.LL;
    }

    public static C0HYG valueOf(String str) {
        return (C0HYG) C08FF.LIZ(C0HYG.class, str);
    }

    public C0HYG(String str, int i, String str2) {
        this.LL = str2;
    }
}
