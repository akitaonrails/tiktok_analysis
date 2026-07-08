package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00AW, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00AW {
    public static final C00AW DANMAKU;
    public static final C00AW FULLSCREEN;
    public static final /* synthetic */ C00AW[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<C00AW> getEntries() {
        return LLILLL;
    }

    static {
        C00AW c00aw = new C00AW("FULLSCREEN", 0, 100);
        FULLSCREEN = c00aw;
        C00AW c00aw2 = new C00AW("DANMAKU", 1, 200);
        DANMAKU = c00aw2;
        C00AW[] c00awArr = {c00aw, c00aw2};
        LLILLJJLI = c00awArr;
        LLILLL = new C2254308sP(c00awArr);
    }

    public static C00AW[] values() {
        return (C00AW[]) LLILLJJLI.clone();
    }

    public final int getPriority() {
        return this.LL;
    }

    public static C00AW valueOf(String str) {
        return (C00AW) C08FF.LIZ(C00AW.class, str);
    }

    public C00AW(String str, int i, int i2) {
        this.LL = i2;
    }
}
