package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0RQ8, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0RQ8 {
    public static final C0RQ8 INIT;
    public static final /* synthetic */ C0RQ8[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0RQ8 PAUSE;
    public static final C0RQ8 RELEASE;
    public static final C0RQ8 RESUME;
    public static final C0RQ8 START;
    public static final C0RQ8 STOP;

    public static InterfaceC2044707zh<C0RQ8> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0RQ8 c0rq8 = new C0RQ8("INIT", 0);
        INIT = c0rq8;
        C0RQ8 c0rq82 = new C0RQ8("START", 1);
        START = c0rq82;
        C0RQ8 c0rq83 = new C0RQ8("PAUSE", 2);
        PAUSE = c0rq83;
        C0RQ8 c0rq84 = new C0RQ8("RESUME", 3);
        RESUME = c0rq84;
        C0RQ8 c0rq85 = new C0RQ8("STOP", 4);
        STOP = c0rq85;
        C0RQ8 c0rq86 = new C0RQ8("RELEASE", 5);
        RELEASE = c0rq86;
        C0RQ8[] c0rq8Arr = {c0rq8, c0rq82, c0rq83, c0rq84, c0rq85, c0rq86};
        LL = c0rq8Arr;
        LLILLJJLI = new C2254308sP(c0rq8Arr);
    }

    public static C0RQ8[] values() {
        return (C0RQ8[]) LL.clone();
    }

    public static C0RQ8 valueOf(String str) {
        return (C0RQ8) C08FF.LIZ(C0RQ8.class, str);
    }

    public C0RQ8(String str, int i) {
    }
}
