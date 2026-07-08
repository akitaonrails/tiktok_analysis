package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0Z3V, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0Z3V {
    public static final C0Z3V DIMENSION_DID;
    public static final C0Z3V DIMENSION_UID;
    public static final /* synthetic */ C0Z3V[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final String LL;

    public static InterfaceC2044707zh<C0Z3V> getEntries() {
        return LLILLL;
    }

    static {
        C0Z3V c0z3v = new C0Z3V("DIMENSION_UID", 0, "uid");
        DIMENSION_UID = c0z3v;
        C0Z3V c0z3v2 = new C0Z3V("DIMENSION_DID", 1, "did");
        DIMENSION_DID = c0z3v2;
        C0Z3V[] c0z3vArr = {c0z3v, c0z3v2};
        LLILLJJLI = c0z3vArr;
        LLILLL = new C2254308sP(c0z3vArr);
    }

    public static C0Z3V[] values() {
        return (C0Z3V[]) LLILLJJLI.clone();
    }

    public final String getTag() {
        return this.LL;
    }

    public static C0Z3V valueOf(String str) {
        return (C0Z3V) C08FF.LIZ(C0Z3V.class, str);
    }

    public C0Z3V(String str, int i, String str2) {
        this.LL = str2;
    }
}
