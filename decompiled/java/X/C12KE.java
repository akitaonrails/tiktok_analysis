package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.12KE, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12KE {
    public static final C12KO Companion;
    public static final C12KE HORIZONTAL;
    public static final /* synthetic */ C12KE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C12KE VERTICAL;
    public final int LL;

    public static InterfaceC2044707zh<C12KE> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.12KO] */
    static {
        C12KE c12ke = new C12KE("VERTICAL", 0, 0);
        VERTICAL = c12ke;
        C12KE c12ke2 = new C12KE("HORIZONTAL", 1, 1);
        HORIZONTAL = c12ke2;
        C12KE[] c12keArr = {c12ke, c12ke2};
        LLILLJJLI = c12keArr;
        LLILLL = new C2254308sP(c12keArr);
        Companion = new Object() { // from class: X.12KO
        };
    }

    public static C12KE[] values() {
        return (C12KE[]) LLILLJJLI.clone();
    }

    public final int getOrientation() {
        return this.LL;
    }

    public static C12KE valueOf(String str) {
        return (C12KE) C08FF.LIZ(C12KE.class, str);
    }

    public C12KE(String str, int i, int i2) {
        this.LL = i2;
    }
}
