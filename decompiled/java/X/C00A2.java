package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00A2, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00A2 {
    public static final C00A2 DAILY_RECAP;
    public static final C00A2 DEBUG;
    public static final /* synthetic */ C00A2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C00A2 SHORT_WINDOW;

    public static InterfaceC2044707zh<C00A2> getEntries() {
        return LLILLJJLI;
    }

    static {
        C00A2 c00a2 = new C00A2("DAILY_RECAP", 0);
        DAILY_RECAP = c00a2;
        C00A2 c00a22 = new C00A2("SHORT_WINDOW", 1);
        SHORT_WINDOW = c00a22;
        C00A2 c00a23 = new C00A2("DEBUG", 2);
        DEBUG = c00a23;
        C00A2[] c00a2Arr = {c00a2, c00a22, c00a23};
        LL = c00a2Arr;
        LLILLJJLI = new C2254308sP(c00a2Arr);
    }

    public static C00A2[] values() {
        return (C00A2[]) LL.clone();
    }

    public static C00A2 valueOf(String str) {
        return (C00A2) C08FF.LIZ(C00A2.class, str);
    }

    public C00A2(String str, int i) {
    }
}
