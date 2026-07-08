package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0FS5, reason: invalid class name */
/* JADX INFO: loaded from: classes6.dex */
public final class C0FS5 {
    public static final C0FS5 AUTO;
    public static final /* synthetic */ C0FS5[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0FS5 MANUAL;
    public final String LL;

    public static InterfaceC2044707zh<C0FS5> getEntries() {
        return LLILLL;
    }

    static {
        C0FS5 c0fs5 = new C0FS5("AUTO", 0, "auto");
        AUTO = c0fs5;
        C0FS5 c0fs52 = new C0FS5("MANUAL", 1, "manual");
        MANUAL = c0fs52;
        C0FS5[] c0fs5Arr = {c0fs5, c0fs52};
        LLILLJJLI = c0fs5Arr;
        LLILLL = new C2254308sP(c0fs5Arr);
    }

    public static C0FS5[] values() {
        return (C0FS5[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0FS5 valueOf(String str) {
        return (C0FS5) C08FF.LIZ(C0FS5.class, str);
    }

    public C0FS5(String str, int i, String str2) {
        this.LL = str2;
    }
}
