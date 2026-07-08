package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.099S, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C099S {
    public static final /* synthetic */ C099S[] LL;
    public static final /* synthetic */ InterfaceC2044707zh LLILLJJLI;
    public static final C099S COROUTINE_SUSPENDED = new C099S("COROUTINE_SUSPENDED", 0);
    public static final C099S UNDECIDED = new C099S("UNDECIDED", 1);
    public static final C099S RESUMED = new C099S("RESUMED", 2);

    public static final /* synthetic */ C099S[] LIZJ() {
        return new C099S[]{COROUTINE_SUSPENDED, UNDECIDED, RESUMED};
    }

    public static InterfaceC2044707zh<C099S> getEntries() {
        return LLILLJJLI;
    }

    static {
        C099S[] c099sArrLIZJ = LIZJ();
        LL = c099sArrLIZJ;
        LLILLJJLI = new C2254308sP(c099sArrLIZJ);
    }

    public static C099S[] values() {
        return (C099S[]) LL.clone();
    }

    public static C099S valueOf(String str) {
        return (C099S) C08FF.LIZ(C099S.class, str);
    }

    public C099S(String str, int i) {
    }
}
