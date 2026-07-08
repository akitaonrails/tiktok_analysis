package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0L9C, reason: invalid class name */
/* JADX INFO: loaded from: classes9.dex */
public final class C0L9C {
    public static final /* synthetic */ C0L9C[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0L9C SELECT;
    public static final C0L9C UNSELECT_O;
    public static final C0L9C UNSELECT_X;
    public final String LL;

    public static InterfaceC2044707zh<C0L9C> getEntries() {
        return LLILLL;
    }

    static {
        C0L9C c0l9c = new C0L9C("SELECT", 0, "select");
        SELECT = c0l9c;
        C0L9C c0l9c2 = new C0L9C("UNSELECT_O", 1, "o");
        UNSELECT_O = c0l9c2;
        C0L9C c0l9c3 = new C0L9C("UNSELECT_X", 2, "x");
        UNSELECT_X = c0l9c3;
        C0L9C[] c0l9cArr = {c0l9c, c0l9c2, c0l9c3};
        LLILLJJLI = c0l9cArr;
        LLILLL = new C2254308sP(c0l9cArr);
    }

    public static C0L9C[] values() {
        return (C0L9C[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0L9C valueOf(String str) {
        return (C0L9C) C08FF.LIZ(C0L9C.class, str);
    }

    public C0L9C(String str, int i, String str2) {
        this.LL = str2;
    }
}
