package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1D6D, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D6D implements C1D61 {
    public static final /* synthetic */ C1D6D[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C1D6D ON_BEFORE_CONTEXT_CREATE;
    public static final C1D6D ON_BEFORE_VIEW_CREATE;
    public static final C1D6D ON_CONTEXT_CREATE;
    public static final C1D6D ON_DATA_INIT;
    public static final C1D6D ON_DATA_UPDATED;
    public static final C1D6D ON_RELOAD;
    public static final C1D6D ON_REUSE;
    public static final C1D6D ON_VIEW_CREATE;
    public final String LL = name();

    public static InterfaceC2044707zh<C1D6D> getEntries() {
        return LLILLL;
    }

    static {
        C1D6D c1d6d = new C1D6D("ON_BEFORE_CONTEXT_CREATE", 0);
        ON_BEFORE_CONTEXT_CREATE = c1d6d;
        C1D6D c1d6d2 = new C1D6D("ON_CONTEXT_CREATE", 1);
        ON_CONTEXT_CREATE = c1d6d2;
        C1D6D c1d6d3 = new C1D6D("ON_BEFORE_VIEW_CREATE", 2);
        ON_BEFORE_VIEW_CREATE = c1d6d3;
        C1D6D c1d6d4 = new C1D6D("ON_VIEW_CREATE", 3);
        ON_VIEW_CREATE = c1d6d4;
        C1D6D c1d6d5 = new C1D6D("ON_DATA_INIT", 4);
        ON_DATA_INIT = c1d6d5;
        C1D6D c1d6d6 = new C1D6D("ON_DATA_UPDATED", 5);
        ON_DATA_UPDATED = c1d6d6;
        C1D6D c1d6d7 = new C1D6D("ON_RELOAD", 6);
        ON_RELOAD = c1d6d7;
        C1D6D c1d6d8 = new C1D6D("ON_REUSE", 7);
        ON_REUSE = c1d6d8;
        C1D6D[] c1d6dArr = {c1d6d, c1d6d2, c1d6d3, c1d6d4, c1d6d5, c1d6d6, c1d6d7, c1d6d8};
        LLILLJJLI = c1d6dArr;
        LLILLL = new C2254308sP(c1d6dArr);
    }

    public static C1D6D[] values() {
        return (C1D6D[]) LLILLJJLI.clone();
    }

    @Override // X.C1D61
    public String getStageName() {
        return this.LL;
    }

    public static C1D6D valueOf(String str) {
        return (C1D6D) C08FF.LIZ(C1D6D.class, str);
    }

    public C1D6D(String str, int i) {
    }
}
