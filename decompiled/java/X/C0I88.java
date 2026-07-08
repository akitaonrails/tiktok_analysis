package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0I88, reason: invalid class name */
/* JADX INFO: loaded from: classes7.dex */
public final class C0I88 {
    public static final C0I88 EYE_SLASH;
    public static final /* synthetic */ C0I88[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0I88 NONE;
    public static final C0I88 PLAY;

    public static InterfaceC2044707zh<C0I88> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0I88 c0i88 = new C0I88("PLAY", 0);
        PLAY = c0i88;
        C0I88 c0i882 = new C0I88("NONE", 1);
        NONE = c0i882;
        C0I88 c0i883 = new C0I88("EYE_SLASH", 2);
        EYE_SLASH = c0i883;
        C0I88[] c0i88Arr = {c0i88, c0i882, c0i883};
        LL = c0i88Arr;
        LLILLJJLI = new C2254308sP(c0i88Arr);
    }

    public static C0I88[] values() {
        return (C0I88[]) LL.clone();
    }

    public static C0I88 valueOf(String str) {
        return (C0I88) C08FF.LIZ(C0I88.class, str);
    }

    public C0I88(String str, int i) {
    }
}
