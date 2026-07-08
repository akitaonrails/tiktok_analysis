package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008E, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C008E {
    public static final C008E COMPONENT_TYPE_ERROR;
    public static final C008E ERROR_CODE_ILLEGAL_STEP;
    public static final /* synthetic */ C008E[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<C008E> getEntries() {
        return LLILLL;
    }

    static {
        C008E c008e = new C008E("ERROR_CODE_ILLEGAL_STEP", 0, 1001);
        ERROR_CODE_ILLEGAL_STEP = c008e;
        C008E c008e2 = new C008E("COMPONENT_TYPE_ERROR", 1, 1002);
        COMPONENT_TYPE_ERROR = c008e2;
        C008E[] c008eArr = {c008e, c008e2};
        LLILLJJLI = c008eArr;
        LLILLL = new C2254308sP(c008eArr);
    }

    public static C008E[] values() {
        return (C008E[]) LLILLJJLI.clone();
    }

    public final int getCode() {
        return this.LL;
    }

    public static C008E valueOf(String str) {
        return (C008E) C08FF.LIZ(C008E.class, str);
    }

    public C008E(String str, int i, int i2) {
        this.LL = i2;
    }
}
