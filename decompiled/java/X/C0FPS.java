package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0FPS, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FPS {
    public static final C0FPS ECOMMERCE;
    public static final /* synthetic */ C0FPS[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0FPS LONG_VIDEO;
    public static final C0FPS SHORT_VIDEO;
    public static final C0FPS UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<C0FPS> getEntries() {
        return LLILLL;
    }

    static {
        C0FPS c0fps = new C0FPS("UNKNOWN", 0, 0);
        UNKNOWN = c0fps;
        C0FPS c0fps2 = new C0FPS("ECOMMERCE", 1, 3);
        ECOMMERCE = c0fps2;
        C0FPS c0fps3 = new C0FPS("SHORT_VIDEO", 2, 4);
        SHORT_VIDEO = c0fps3;
        C0FPS c0fps4 = new C0FPS("LONG_VIDEO", 3, 5);
        LONG_VIDEO = c0fps4;
        C0FPS[] c0fpsArr = {c0fps, c0fps2, c0fps3, c0fps4};
        LLILLJJLI = c0fpsArr;
        LLILLL = new C2254308sP(c0fpsArr);
    }

    public static C0FPS[] values() {
        return (C0FPS[]) LLILLJJLI.clone();
    }

    public final int getScene() {
        return this.LL;
    }

    public static C0FPS valueOf(String str) {
        return (C0FPS) C08FF.LIZ(C0FPS.class, str);
    }

    public C0FPS(String str, int i, int i2) {
        this.LL = i2;
    }
}
