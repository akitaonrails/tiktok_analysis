package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15CV, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15CV {
    public static final C15CV ACHIEVEMENT;
    public static final C15CV LIVE_JOURNEY;
    public static final /* synthetic */ C15CV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C15CV LOP;
    public static final C15CV STRONG_CONTAINER;
    public static final C15CV WEAK_CONTAINER;
    public final int LL;

    public static InterfaceC2044707zh<C15CV> getEntries() {
        return LLILLL;
    }

    static {
        C15CV c15cv = new C15CV("LIVE_JOURNEY", 0, 0);
        LIVE_JOURNEY = c15cv;
        C15CV c15cv2 = new C15CV("LOP", 1, 1);
        LOP = c15cv2;
        C15CV c15cv3 = new C15CV("ACHIEVEMENT", 2, 2);
        ACHIEVEMENT = c15cv3;
        C15CV c15cv4 = new C15CV("STRONG_CONTAINER", 3, 3);
        STRONG_CONTAINER = c15cv4;
        C15CV c15cv5 = new C15CV("WEAK_CONTAINER", 4, 4);
        WEAK_CONTAINER = c15cv5;
        C15CV[] c15cvArr = {c15cv, c15cv2, c15cv3, c15cv4, c15cv5};
        LLILLJJLI = c15cvArr;
        LLILLL = new C2254308sP(c15cvArr);
    }

    public static C15CV[] values() {
        return (C15CV[]) LLILLJJLI.clone();
    }

    public final int getStage() {
        return this.LL;
    }

    public static C15CV valueOf(String str) {
        return (C15CV) C08FF.LIZ(C15CV.class, str);
    }

    public C15CV(String str, int i, int i2) {
        this.LL = i2;
    }
}
