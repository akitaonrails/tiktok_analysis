package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0P35, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0P35 {
    public static final /* synthetic */ C0P35[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0P35 LOAD_LATEST;
    public static final C0P35 LOAD_MORE;
    public static final C0P35 REFRESH;
    public final int LL;

    public static InterfaceC2044707zh<C0P35> getEntries() {
        return LLILLL;
    }

    static {
        C0P35 c0p35 = new C0P35("REFRESH", 0, 0);
        REFRESH = c0p35;
        C0P35 c0p352 = new C0P35("LOAD_MORE", 1, 0);
        LOAD_MORE = c0p352;
        C0P35 c0p353 = new C0P35("LOAD_LATEST", 2, 1);
        LOAD_LATEST = c0p353;
        C0P35[] c0p35Arr = {c0p35, c0p352, c0p353};
        LLILLJJLI = c0p35Arr;
        LLILLL = new C2254308sP(c0p35Arr);
    }

    public static C0P35[] values() {
        return (C0P35[]) LLILLJJLI.clone();
    }

    public final int getSortOrder() {
        return this.LL;
    }

    public static C0P35 valueOf(String str) {
        return (C0P35) C08FF.LIZ(C0P35.class, str);
    }

    public C0P35(String str, int i, int i2) {
        this.LL = i2;
    }
}
