package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.12KQ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12KQ {
    public static final C12KQ HORIZONTAL;
    public static final /* synthetic */ C12KQ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C12KQ RADIAL;
    public static final C12KQ VERTICAL;
    public final int LL;

    public static InterfaceC2044707zh<C12KQ> getEntries() {
        return LLILLL;
    }

    static {
        C12KQ c12kq = new C12KQ("VERTICAL", 0, 0);
        VERTICAL = c12kq;
        C12KQ c12kq2 = new C12KQ("HORIZONTAL", 1, 1);
        HORIZONTAL = c12kq2;
        C12KQ c12kq3 = new C12KQ("RADIAL", 2, 2);
        RADIAL = c12kq3;
        C12KQ[] c12kqArr = {c12kq, c12kq2, c12kq3};
        LLILLJJLI = c12kqArr;
        LLILLL = new C2254308sP(c12kqArr);
    }

    public static C12KQ[] values() {
        return (C12KQ[]) LLILLJJLI.clone();
    }

    public final int getV() {
        return this.LL;
    }

    public static C12KQ valueOf(String str) {
        return (C12KQ) C08FF.LIZ(C12KQ.class, str);
    }

    public C12KQ(String str, int i, int i2) {
        this.LL = i2;
    }
}
