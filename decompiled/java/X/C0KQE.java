package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KQE, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KQE {
    public static final C0KQE CANCEL;
    public static final /* synthetic */ C0KQE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0KQE PLAN_CHANGE;
    public static final C0KQE PURCHASES;
    public static final C0KQE RESIGN_UP;
    public static final C0KQE UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<C0KQE> getEntries() {
        return LLILLL;
    }

    static {
        C0KQE c0kqe = new C0KQE("UNKNOWN", 0, -1);
        UNKNOWN = c0kqe;
        C0KQE c0kqe2 = new C0KQE("PURCHASES", 1, 0);
        PURCHASES = c0kqe2;
        C0KQE c0kqe3 = new C0KQE("RESIGN_UP", 2, 1);
        RESIGN_UP = c0kqe3;
        C0KQE c0kqe4 = new C0KQE("PLAN_CHANGE", 3, 2);
        PLAN_CHANGE = c0kqe4;
        C0KQE c0kqe5 = new C0KQE("CANCEL", 4, 3);
        CANCEL = c0kqe5;
        C0KQE[] c0kqeArr = {c0kqe, c0kqe2, c0kqe3, c0kqe4, c0kqe5};
        LLILLJJLI = c0kqeArr;
        LLILLL = new C2254308sP(c0kqeArr);
    }

    public static C0KQE[] values() {
        return (C0KQE[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static C0KQE valueOf(String str) {
        return (C0KQE) C08FF.LIZ(C0KQE.class, str);
    }

    public C0KQE(String str, int i, int i2) {
        this.LL = i2;
    }
}
