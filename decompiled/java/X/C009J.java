package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.009J, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C009J {
    public static final C009K Companion;
    public static final /* synthetic */ C009J[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C009J NONE;
    public static final C009J REAL_TIME_TRACKING_TYPE_BACKGROUND;
    public static final C009J REAL_TIME_TRACKING_TYPE_FACE;
    public static final C009J REAL_TIME_TRACKING_TYPE_FACEMESH;
    public static final C009J REAL_TIME_TRACKING_TYPE_FOREGROUND;
    public static final C009J REAL_TIME_TRACKING_TYPE_HAND;
    public final String LL;

    public static InterfaceC2044707zh<C009J> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v8, types: [X.009K] */
    static {
        C009J c009j = new C009J("NONE", 0, "");
        NONE = c009j;
        C009J c009j2 = new C009J("REAL_TIME_TRACKING_TYPE_FOREGROUND", 1, "canvas_foreground");
        REAL_TIME_TRACKING_TYPE_FOREGROUND = c009j2;
        C009J c009j3 = new C009J("REAL_TIME_TRACKING_TYPE_BACKGROUND", 2, "canvas_background");
        REAL_TIME_TRACKING_TYPE_BACKGROUND = c009j3;
        C009J c009j4 = new C009J("REAL_TIME_TRACKING_TYPE_HAND", 3, "canvas_hand");
        REAL_TIME_TRACKING_TYPE_HAND = c009j4;
        C009J c009j5 = new C009J("REAL_TIME_TRACKING_TYPE_FACE", 4, "canvas_face");
        REAL_TIME_TRACKING_TYPE_FACE = c009j5;
        C009J c009j6 = new C009J("REAL_TIME_TRACKING_TYPE_FACEMESH", 5, "canvas_facemesh");
        REAL_TIME_TRACKING_TYPE_FACEMESH = c009j6;
        C009J[] c009jArr = {c009j, c009j2, c009j3, c009j4, c009j5, c009j6};
        LLILLJJLI = c009jArr;
        LLILLL = new C2254308sP(c009jArr);
        Companion = new Object() { // from class: X.009K
        };
    }

    public static C009J[] values() {
        return (C009J[]) LLILLJJLI.clone();
    }

    public final String getTypeName() {
        return this.LL;
    }

    public static C009J valueOf(String str) {
        return (C009J) C08FF.LIZ(C009J.class, str);
    }

    public C009J(String str, int i, String str2) {
        this.LL = str2;
    }
}
