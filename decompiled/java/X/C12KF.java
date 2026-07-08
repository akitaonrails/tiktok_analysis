package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.12KF, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12KF {
    public static final C12KM Companion;
    public static final C12KF DIMENSION;
    public static final /* synthetic */ C12KF[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C12KF MATCH_PARENT;
    public final int LL;

    public static InterfaceC2044707zh<C12KF> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.12KM] */
    static {
        C12KF c12kf = new C12KF("MATCH_PARENT", 0, 0);
        MATCH_PARENT = c12kf;
        C12KF c12kf2 = new C12KF("DIMENSION", 1, 1);
        DIMENSION = c12kf2;
        C12KF[] c12kfArr = {c12kf, c12kf2};
        LLILLJJLI = c12kfArr;
        LLILLL = new C2254308sP(c12kfArr);
        Companion = new Object() { // from class: X.12KM
        };
    }

    public static C12KF[] values() {
        return (C12KF[]) LLILLJJLI.clone();
    }

    public final int getMode() {
        return this.LL;
    }

    public static C12KF valueOf(String str) {
        return (C12KF) C08FF.LIZ(C12KF.class, str);
    }

    public C12KF(String str, int i, int i2) {
        this.LL = i2;
    }
}
