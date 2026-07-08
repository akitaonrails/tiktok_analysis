package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1D6C, reason: invalid class name */
/* JADX INFO: loaded from: classes36.dex */
public final class C1D6C implements C1D61 {
    public static final /* synthetic */ C1D6C[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C1D6C ON_FIRST_DRAW;
    public static final C1D6C ON_LOAD_FAILED;
    public static final C1D6C ON_LOAD_FINISH;
    public static final C1D6C ON_LOAD_START;
    public static final C1D6C ON_RESOURCE_FINISH;
    public static final C1D6C ON_RUNTIME_READY;
    public final String LL = name();

    public static InterfaceC2044707zh<C1D6C> getEntries() {
        return LLILLL;
    }

    static {
        C1D6C c1d6c = new C1D6C("ON_LOAD_START", 0);
        ON_LOAD_START = c1d6c;
        C1D6C c1d6c2 = new C1D6C("ON_LOAD_FAILED", 1);
        ON_LOAD_FAILED = c1d6c2;
        C1D6C c1d6c3 = new C1D6C("ON_LOAD_FINISH", 2);
        ON_LOAD_FINISH = c1d6c3;
        C1D6C c1d6c4 = new C1D6C("ON_RUNTIME_READY", 3);
        ON_RUNTIME_READY = c1d6c4;
        C1D6C c1d6c5 = new C1D6C("ON_FIRST_DRAW", 4);
        ON_FIRST_DRAW = c1d6c5;
        C1D6C c1d6c6 = new C1D6C("ON_RESOURCE_FINISH", 5);
        ON_RESOURCE_FINISH = c1d6c6;
        C1D6C[] c1d6cArr = {c1d6c, c1d6c2, c1d6c3, c1d6c4, c1d6c5, c1d6c6};
        LLILLJJLI = c1d6cArr;
        LLILLL = new C2254308sP(c1d6cArr);
    }

    public static C1D6C[] values() {
        return (C1D6C[]) LLILLJJLI.clone();
    }

    @Override // X.C1D61
    public String getStageName() {
        return this.LL;
    }

    public static C1D6C valueOf(String str) {
        return (C1D6C) C08FF.LIZ(C1D6C.class, str);
    }

    public C1D6C(String str, int i) {
    }
}
