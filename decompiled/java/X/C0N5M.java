package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0N5M, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0N5M {
    public static final /* synthetic */ C0N5M[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0N5M MUTE;
    public static final C0N5M UNMUTE;
    public final String LL;

    public static InterfaceC2044707zh<C0N5M> getEntries() {
        return LLILLL;
    }

    static {
        C0N5M c0n5m = new C0N5M("MUTE", 0, "mute");
        MUTE = c0n5m;
        C0N5M c0n5m2 = new C0N5M("UNMUTE", 1, "unmute");
        UNMUTE = c0n5m2;
        C0N5M[] c0n5mArr = {c0n5m, c0n5m2};
        LLILLJJLI = c0n5mArr;
        LLILLL = new C2254308sP(c0n5mArr);
    }

    public static C0N5M[] values() {
        return (C0N5M[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0N5M valueOf(String str) {
        return (C0N5M) C08FF.LIZ(C0N5M.class, str);
    }

    public C0N5M(String str, int i, String str2) {
        this.LL = str2;
    }
}
