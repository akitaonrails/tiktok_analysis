package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0LIV, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0LIV {
    public static final C0LIV AI;
    public static final /* synthetic */ C0LIV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0LIV NLE;

    @C040H
    public final String LL;

    public static InterfaceC2044707zh<C0LIV> getEntries() {
        return LLILLL;
    }

    static {
        C0LIV c0liv = new C0LIV("NLE", 0, "normal");
        NLE = c0liv;
        C0LIV c0liv2 = new C0LIV("AI", 1, "ai");
        AI = c0liv2;
        C0LIV[] c0livArr = {c0liv, c0liv2};
        LLILLJJLI = c0livArr;
        LLILLL = new C2254308sP(c0livArr);
    }

    public static C0LIV[] values() {
        return (C0LIV[]) LLILLJJLI.clone();
    }

    public final String getType() {
        return this.LL;
    }

    public static C0LIV valueOf(String str) {
        return (C0LIV) C08FF.LIZ(C0LIV.class, str);
    }

    public C0LIV(String str, int i, String str2) {
        this.LL = str2;
    }
}
