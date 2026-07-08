package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DJ6, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DJ6 {
    public static final C0DJ7 Companion;
    public static final C0DJ6 FIXED;
    public static final /* synthetic */ C0DJ6[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0DJ6 PARAM_BASED;

    public static InterfaceC2044707zh<C0DJ6> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.0DJ7] */
    static {
        C0DJ6 c0dj6 = new C0DJ6("FIXED", 0);
        FIXED = c0dj6;
        C0DJ6 c0dj62 = new C0DJ6("PARAM_BASED", 1);
        PARAM_BASED = c0dj62;
        C0DJ6[] c0dj6Arr = {c0dj6, c0dj62};
        LL = c0dj6Arr;
        LLILLJJLI = new C2254308sP(c0dj6Arr);
        Companion = new Object() { // from class: X.0DJ7
        };
    }

    public static C0DJ6[] values() {
        return (C0DJ6[]) LL.clone();
    }

    public static C0DJ6 valueOf(String str) {
        return (C0DJ6) C08FF.LIZ(C0DJ6.class, str);
    }

    public C0DJ6(String str, int i) {
    }
}
