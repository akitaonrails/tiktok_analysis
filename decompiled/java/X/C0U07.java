package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0U07, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0U07 {
    public static final C0U0H Companion;
    public static final C0U07 LIBRARY;
    public static final /* synthetic */ C0U07[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0U07 QUEUE;
    public static final C0U07 REQUEST;
    public static final C0U07 SEARCH;
    public static final C0U07 UNKNOWN;
    public static final C0U07 VIEWER_SINGS;
    public final long LL;

    public static InterfaceC2044707zh<C0U07> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.0U0H] */
    static {
        C0U07 c0u07 = new C0U07("LIBRARY", 0, 0L);
        LIBRARY = c0u07;
        C0U07 c0u072 = new C0U07("SEARCH", 1, 1L);
        SEARCH = c0u072;
        C0U07 c0u073 = new C0U07("QUEUE", 2, 2L);
        QUEUE = c0u073;
        C0U07 c0u074 = new C0U07("REQUEST", 3, 3L);
        REQUEST = c0u074;
        C0U07 c0u075 = new C0U07("VIEWER_SINGS", 4, 4L);
        VIEWER_SINGS = c0u075;
        C0U07 c0u076 = new C0U07("UNKNOWN", 5, -1L);
        UNKNOWN = c0u076;
        C0U07[] c0u07Arr = {c0u07, c0u072, c0u073, c0u074, c0u075, c0u076};
        LLILLJJLI = c0u07Arr;
        LLILLL = new C2254308sP(c0u07Arr);
        Companion = new Object() { // from class: X.0U0H
        };
    }

    public static C0U07[] values() {
        return (C0U07[]) LLILLJJLI.clone();
    }

    public final long getValue() {
        return this.LL;
    }

    public static C0U07 valueOf(String str) {
        return (C0U07) C08FF.LIZ(C0U07.class, str);
    }

    public C0U07(String str, int i, long j) {
        this.LL = j;
    }
}
