package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0E17, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0E17 {
    public static final C0E17 DIRECT_SCROLL;
    public static final /* synthetic */ C0E17[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0E17 NO_SCROLL;
    public static final C0E17 SMOOTH_SCROLL;

    public static InterfaceC2044707zh<C0E17> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0E17 c0e17 = new C0E17("SMOOTH_SCROLL", 0);
        SMOOTH_SCROLL = c0e17;
        C0E17 c0e172 = new C0E17("DIRECT_SCROLL", 1);
        DIRECT_SCROLL = c0e172;
        C0E17 c0e173 = new C0E17("NO_SCROLL", 2);
        NO_SCROLL = c0e173;
        C0E17[] c0e17Arr = {c0e17, c0e172, c0e173};
        LL = c0e17Arr;
        LLILLJJLI = new C2254308sP(c0e17Arr);
    }

    public static C0E17[] values() {
        return (C0E17[]) LL.clone();
    }

    public static C0E17 valueOf(String str) {
        return (C0E17) C08FF.LIZ(C0E17.class, str);
    }

    public C0E17(String str, int i) {
    }
}
