package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0L9M, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L9M {
    public static final C0L9M FIRST_GENERATE_AUTOCUT;
    public static final /* synthetic */ C0L9M[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0L9M SWITCH_GENERATE_AUTOCUT;

    @C040H
    public final int LL;

    public static InterfaceC2044707zh<C0L9M> getEntries() {
        return LLILLL;
    }

    static {
        C0L9M c0l9m = new C0L9M("FIRST_GENERATE_AUTOCUT", 0, 1);
        FIRST_GENERATE_AUTOCUT = c0l9m;
        C0L9M c0l9m2 = new C0L9M("SWITCH_GENERATE_AUTOCUT", 1, 2);
        SWITCH_GENERATE_AUTOCUT = c0l9m2;
        C0L9M[] c0l9mArr = {c0l9m, c0l9m2};
        LLILLJJLI = c0l9mArr;
        LLILLL = new C2254308sP(c0l9mArr);
    }

    public static C0L9M[] values() {
        return (C0L9M[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0L9M valueOf(String str) {
        return (C0L9M) C08FF.LIZ(C0L9M.class, str);
    }

    public C0L9M(String str, int i, int i2) {
        this.LL = i2;
    }
}
