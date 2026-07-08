package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0D73, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D73 {
    public static final C0D73 ERROR;
    public static final /* synthetic */ C0D73[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0D73 LOADING;
    public static final C0D73 NO_MORE;

    public static InterfaceC2044707zh<C0D73> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0D73 c0d73 = new C0D73("LOADING", 0);
        LOADING = c0d73;
        C0D73 c0d732 = new C0D73("NO_MORE", 1);
        NO_MORE = c0d732;
        C0D73 c0d733 = new C0D73("ERROR", 2);
        ERROR = c0d733;
        C0D73[] c0d73Arr = {c0d73, c0d732, c0d733};
        LL = c0d73Arr;
        LLILLJJLI = new C2254308sP(c0d73Arr);
    }

    public static C0D73[] values() {
        return (C0D73[]) LL.clone();
    }

    public static C0D73 valueOf(String str) {
        return (C0D73) C08FF.LIZ(C0D73.class, str);
    }

    public C0D73(String str, int i) {
    }
}
