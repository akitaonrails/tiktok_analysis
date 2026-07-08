package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0OPK, reason: invalid class name */
/* JADX INFO: loaded from: classes10.dex */
public final class C0OPK {
    public static final C0OPK DELETE;
    public static final C0OPK INSERT;
    public static final /* synthetic */ C0OPK[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0OPK UPDATE;
    public final String LL;

    public static InterfaceC2044707zh<C0OPK> getEntries() {
        return LLILLL;
    }

    static {
        C0OPK c0opk = new C0OPK("INSERT", 0, "insert");
        INSERT = c0opk;
        C0OPK c0opk2 = new C0OPK("UPDATE", 1, "update");
        UPDATE = c0opk2;
        C0OPK c0opk3 = new C0OPK("DELETE", 2, "delete");
        DELETE = c0opk3;
        C0OPK[] c0opkArr = {c0opk, c0opk2, c0opk3};
        LLILLJJLI = c0opkArr;
        LLILLL = new C2254308sP(c0opkArr);
    }

    public static C0OPK[] values() {
        return (C0OPK[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0OPK valueOf(String str) {
        return (C0OPK) C08FF.LIZ(C0OPK.class, str);
    }

    public C0OPK(String str, int i, String str2) {
        this.LL = str2;
    }
}
