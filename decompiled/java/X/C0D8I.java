package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0D8I, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D8I {
    public static final C0D8I ERROR;
    public static final C0D8I INFO;
    public static final /* synthetic */ C0D8I[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0D8I WARNING;
    public final String LL;

    public static InterfaceC2044707zh<C0D8I> getEntries() {
        return LLILLL;
    }

    static {
        C0D8I c0d8i = new C0D8I("INFO", 0, "info");
        INFO = c0d8i;
        C0D8I c0d8i2 = new C0D8I("WARNING", 1, "warn");
        WARNING = c0d8i2;
        C0D8I c0d8i3 = new C0D8I("ERROR", 2, "error");
        ERROR = c0d8i3;
        C0D8I[] c0d8iArr = {c0d8i, c0d8i2, c0d8i3};
        LLILLJJLI = c0d8iArr;
        LLILLL = new C2254308sP(c0d8iArr);
    }

    public static C0D8I[] values() {
        return (C0D8I[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0D8I valueOf(String str) {
        return (C0D8I) C08FF.LIZ(C0D8I.class, str);
    }

    public C0D8I(String str, int i, String str2) {
        this.LL = str2;
    }
}
