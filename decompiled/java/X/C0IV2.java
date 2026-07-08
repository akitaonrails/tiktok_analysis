package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0IV2, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0IV2 {
    public static final C0IV2 FOLLOW_PAGE_REFRESH;
    public static final C0IV2 GLOBAL_POLLING;
    public static final C0IV2 INBOX_REFRESH;
    public static final /* synthetic */ C0IV2[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0IV2 LOCAL_CACHE;
    public static final C0IV2 TOPLIVE_POLLING;
    public static final C0IV2 TOPLIVE_PRELOAD;
    public static final C0IV2 UNKNOWN;

    public static InterfaceC2044707zh<C0IV2> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0IV2 c0iv2 = new C0IV2("TOPLIVE_POLLING", 0);
        TOPLIVE_POLLING = c0iv2;
        C0IV2 c0iv22 = new C0IV2("TOPLIVE_PRELOAD", 1);
        TOPLIVE_PRELOAD = c0iv22;
        C0IV2 c0iv23 = new C0IV2("GLOBAL_POLLING", 2);
        GLOBAL_POLLING = c0iv23;
        C0IV2 c0iv24 = new C0IV2("FOLLOW_PAGE_REFRESH", 3);
        FOLLOW_PAGE_REFRESH = c0iv24;
        C0IV2 c0iv25 = new C0IV2("INBOX_REFRESH", 4);
        INBOX_REFRESH = c0iv25;
        C0IV2 c0iv26 = new C0IV2("LOCAL_CACHE", 5);
        LOCAL_CACHE = c0iv26;
        C0IV2 c0iv27 = new C0IV2("UNKNOWN", 6);
        UNKNOWN = c0iv27;
        C0IV2[] c0iv2Arr = {c0iv2, c0iv22, c0iv23, c0iv24, c0iv25, c0iv26, c0iv27};
        LL = c0iv2Arr;
        LLILLJJLI = new C2254308sP(c0iv2Arr);
    }

    public static C0IV2[] values() {
        return (C0IV2[]) LL.clone();
    }

    public static C0IV2 valueOf(String str) {
        return (C0IV2) C08FF.LIZ(C0IV2.class, str);
    }

    public C0IV2(String str, int i) {
    }
}
