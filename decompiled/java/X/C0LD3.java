package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LD3, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LD3 {
    public static final C0LD3 DUAL_BALL;
    public static final C0LD3 DUAL_BALL_WITH_MESSAGE;
    public static final /* synthetic */ C0LD3[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0LD3 OTHER;
    public static final C0LD3 PROGRESS;
    public static final C0LD3 PROGRESS_WITH_MESSAGE;
    public final int LL;

    public static InterfaceC2044707zh<C0LD3> getEntries() {
        return LLILLL;
    }

    static {
        C0LD3 c0ld3 = new C0LD3("OTHER", 0, 0);
        OTHER = c0ld3;
        C0LD3 c0ld32 = new C0LD3("PROGRESS", 1, 1);
        PROGRESS = c0ld32;
        C0LD3 c0ld33 = new C0LD3("PROGRESS_WITH_MESSAGE", 2, 2);
        PROGRESS_WITH_MESSAGE = c0ld33;
        C0LD3 c0ld34 = new C0LD3("DUAL_BALL", 3, 3);
        DUAL_BALL = c0ld34;
        C0LD3 c0ld35 = new C0LD3("DUAL_BALL_WITH_MESSAGE", 4, 4);
        DUAL_BALL_WITH_MESSAGE = c0ld35;
        C0LD3[] c0ld3Arr = {c0ld3, c0ld32, c0ld33, c0ld34, c0ld35};
        LLILLJJLI = c0ld3Arr;
        LLILLL = new C2254308sP(c0ld3Arr);
    }

    public static C0LD3[] values() {
        return (C0LD3[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0LD3 valueOf(String str) {
        return (C0LD3) C08FF.LIZ(C0LD3.class, str);
    }

    public C0LD3(String str, int i, int i2) {
        this.LL = i2;
    }
}
