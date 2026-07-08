package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OK4, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OK4 {
    public static final C0OK4 INLINE_TO_INLINE;
    public static final C0OK4 INLINE_TO_TIMESTAMP;
    public static final C0OK4 LAST_MESSAGE;
    public static final /* synthetic */ C0OK4[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0OK4 NORMAL_TO_INLINE;
    public static final C0OK4 NORMAL_TO_NORMAL;
    public static final C0OK4 NORMAL_TO_NORMAL_CLOSE_TIME;
    public static final C0OK4 NORMAL_TO_TIMESTAMP;
    public static final C0OK4 TIMESTAMP_TO_NORMAL;
    public final int LL;

    public static InterfaceC2044707zh<C0OK4> getEntries() {
        return LLILLL;
    }

    static {
        C0OK4 c0ok4 = new C0OK4("NORMAL_TO_NORMAL", 0, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(14)));
        NORMAL_TO_NORMAL = c0ok4;
        C0OK4 c0ok42 = new C0OK4("NORMAL_TO_NORMAL_CLOSE_TIME", 1, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        NORMAL_TO_NORMAL_CLOSE_TIME = c0ok42;
        C0OK4 c0ok43 = new C0OK4("NORMAL_TO_INLINE", 2, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        NORMAL_TO_INLINE = c0ok43;
        C0OK4 c0ok44 = new C0OK4("NORMAL_TO_TIMESTAMP", 3, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        NORMAL_TO_TIMESTAMP = c0ok44;
        C0OK4 c0ok45 = new C0OK4("INLINE_TO_TIMESTAMP", 4, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
        INLINE_TO_TIMESTAMP = c0ok45;
        C0OK4 c0ok46 = new C0OK4("INLINE_TO_INLINE", 5, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(0)));
        INLINE_TO_INLINE = c0ok46;
        C0OK4 c0ok47 = new C0OK4("TIMESTAMP_TO_NORMAL", 6, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(8)));
        TIMESTAMP_TO_NORMAL = c0ok47;
        C0OK4 c0ok48 = new C0OK4("LAST_MESSAGE", 7, C814420VxA.LIZIZ(C418440Gaw.LIZIZ(16)));
        LAST_MESSAGE = c0ok48;
        C0OK4[] c0ok4Arr = {c0ok4, c0ok42, c0ok43, c0ok44, c0ok45, c0ok46, c0ok47, c0ok48};
        LLILLJJLI = c0ok4Arr;
        LLILLL = new C2254308sP(c0ok4Arr);
    }

    public static C0OK4[] values() {
        return (C0OK4[]) LLILLJJLI.clone();
    }

    public int getPaddingDp() {
        return this.LL;
    }

    public static C0OK4 valueOf(String str) {
        return (C0OK4) C08FF.LIZ(C0OK4.class, str);
    }

    public C0OK4(String str, int i, int i2) {
        this.LL = i2;
    }
}
