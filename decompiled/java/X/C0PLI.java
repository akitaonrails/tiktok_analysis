package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0PLI, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0PLI {
    public static final C0PLI BIG;
    public static final /* synthetic */ C0PLI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0PLI MIDDLE;
    public static final C0PLI SMALL;
    public final int LL;

    public static InterfaceC2044707zh<C0PLI> getEntries() {
        return LLILLL;
    }

    static {
        C0PLI c0pli = new C0PLI("SMALL", 0, 3);
        SMALL = c0pli;
        C0PLI c0pli2 = new C0PLI("MIDDLE", 1, 2);
        MIDDLE = c0pli2;
        C0PLI c0pli3 = new C0PLI("BIG", 2, 1);
        BIG = c0pli3;
        C0PLI[] c0pliArr = {c0pli, c0pli2, c0pli3};
        LLILLJJLI = c0pliArr;
        LLILLL = new C2254308sP(c0pliArr);
    }

    public static C0PLI[] values() {
        return (C0PLI[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C0PLI valueOf(String str) {
        return (C0PLI) C08FF.LIZ(C0PLI.class, str);
    }

    public C0PLI(String str, int i, int i2) {
        this.LL = i2;
    }
}
