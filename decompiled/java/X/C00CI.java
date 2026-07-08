package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.00CI, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C00CI {
    public static final C00CI FPS_SAMPLE;
    public static final /* synthetic */ C00CI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C00CI NONE_SAMPLE;
    public final int LL;

    public static InterfaceC2044707zh<C00CI> getEntries() {
        return LLILLL;
    }

    static {
        C00CI c00ci = new C00CI("NONE_SAMPLE", 0, 0);
        NONE_SAMPLE = c00ci;
        C00CI c00ci2 = new C00CI("FPS_SAMPLE", 1, 1);
        FPS_SAMPLE = c00ci2;
        C00CI[] c00ciArr = {c00ci, c00ci2};
        LLILLJJLI = c00ciArr;
        LLILLL = new C2254308sP(c00ciArr);
    }

    public static C00CI[] values() {
        return (C00CI[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C00CI valueOf(String str) {
        return (C00CI) C08FF.LIZ(C00CI.class, str);
    }

    public C00CI(String str, int i, int i2) {
        this.LL = i2;
    }
}
