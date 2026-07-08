package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SDF, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SDF {
    public static final C0SDF FAKE_PLAYER;
    public static final /* synthetic */ C0SDF[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0SDF NONE;
    public static final C0SDF REAL_PLAYER;
    public final boolean LL;

    public static InterfaceC2044707zh<C0SDF> getEntries() {
        return LLILLL;
    }

    static {
        C0SDF c0sdf = new C0SDF("REAL_PLAYER", 0, true);
        REAL_PLAYER = c0sdf;
        C0SDF c0sdf2 = new C0SDF("FAKE_PLAYER", 1, true);
        FAKE_PLAYER = c0sdf2;
        C0SDF c0sdf3 = new C0SDF("NONE", 2, false);
        NONE = c0sdf3;
        C0SDF[] c0sdfArr = {c0sdf, c0sdf2, c0sdf3};
        LLILLJJLI = c0sdfArr;
        LLILLL = new C2254308sP(c0sdfArr);
    }

    public static C0SDF[] values() {
        return (C0SDF[]) LLILLJJLI.clone();
    }

    public final boolean getEnablePlay() {
        return this.LL;
    }

    public static C0SDF valueOf(String str) {
        return (C0SDF) C08FF.LIZ(C0SDF.class, str);
    }

    public C0SDF(String str, int i, boolean z) {
        this.LL = z;
    }
}
