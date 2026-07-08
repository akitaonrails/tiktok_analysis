package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0MV4, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0MV4 {
    public static final C0MV4 AUTO_DISMISS;
    public static final C0MV4 CLICK_CLOSE;
    public static final C0MV9 Companion;
    public static final /* synthetic */ C0MV4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0MV4 SWIPE;
    public static final C0MV4 TAP;
    public final String LL;

    public static InterfaceC2044707zh<C0MV4> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.0MV9] */
    static {
        C0MV4 c0mv4 = new C0MV4("TAP", 0, "tap");
        TAP = c0mv4;
        C0MV4 c0mv42 = new C0MV4("SWIPE", 1, "swipe");
        SWIPE = c0mv42;
        C0MV4 c0mv43 = new C0MV4("CLICK_CLOSE", 2, "clickx");
        CLICK_CLOSE = c0mv43;
        C0MV4 c0mv44 = new C0MV4("AUTO_DISMISS", 3, "auto_dismiss");
        AUTO_DISMISS = c0mv44;
        C0MV4[] c0mv4Arr = {c0mv4, c0mv42, c0mv43, c0mv44};
        LLILLJJLI = c0mv4Arr;
        LLILLL = new C2254308sP(c0mv4Arr);
        Companion = new Object() { // from class: X.0MV9
        };
    }

    public static C0MV4[] values() {
        return (C0MV4[]) LLILLJJLI.clone();
    }

    public final boolean isAutoDismiss() {
        return this == AUTO_DISMISS;
    }

    public final String getMobValue() {
        return this.LL;
    }

    public static C0MV4 valueOf(String str) {
        return (C0MV4) C08FF.LIZ(C0MV4.class, str);
    }

    public C0MV4(String str, int i, String str2) {
        this.LL = str2;
    }
}
