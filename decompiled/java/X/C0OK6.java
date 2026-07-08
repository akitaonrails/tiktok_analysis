package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OK6, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OK6 {
    public static final C0OK6 CONTENT;
    public static final C0OK6 INLINE;
    public static final /* synthetic */ C0OK6[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0OK6 TIMESTAMP;
    public static final C0OK6 TIPS;

    public static InterfaceC2044707zh<C0OK6> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0OK6 c0ok6 = new C0OK6("INLINE", 0);
        INLINE = c0ok6;
        C0OK6 c0ok62 = new C0OK6("CONTENT", 1);
        CONTENT = c0ok62;
        C0OK6 c0ok63 = new C0OK6("TIMESTAMP", 2);
        TIMESTAMP = c0ok63;
        C0OK6 c0ok64 = new C0OK6("TIPS", 3);
        TIPS = c0ok64;
        C0OK6[] c0ok6Arr = {c0ok6, c0ok62, c0ok63, c0ok64};
        LL = c0ok6Arr;
        LLILLJJLI = new C2254308sP(c0ok6Arr);
    }

    public static C0OK6[] values() {
        return (C0OK6[]) LL.clone();
    }

    public static C0OK6 valueOf(String str) {
        return (C0OK6) C08FF.LIZ(C0OK6.class, str);
    }

    public C0OK6(String str, int i) {
    }
}
