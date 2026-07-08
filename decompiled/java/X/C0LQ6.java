package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LQ6, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LQ6 {
    public static final C0LQ6 COMMON_ONLY;
    public static final C0LQ6 GLOBAL;
    public static final /* synthetic */ C0LQ6[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0LQ6 NONE;

    public static InterfaceC2044707zh<C0LQ6> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0LQ6 c0lq6 = new C0LQ6("NONE", 0);
        NONE = c0lq6;
        C0LQ6 c0lq62 = new C0LQ6("GLOBAL", 1);
        GLOBAL = c0lq62;
        C0LQ6 c0lq63 = new C0LQ6("COMMON_ONLY", 2);
        COMMON_ONLY = c0lq63;
        C0LQ6[] c0lq6Arr = {c0lq6, c0lq62, c0lq63};
        LL = c0lq6Arr;
        LLILLJJLI = new C2254308sP(c0lq6Arr);
    }

    public static C0LQ6[] values() {
        return (C0LQ6[]) LL.clone();
    }

    public static C0LQ6 valueOf(String str) {
        return (C0LQ6) C08FF.LIZ(C0LQ6.class, str);
    }

    public C0LQ6(String str, int i) {
    }
}
