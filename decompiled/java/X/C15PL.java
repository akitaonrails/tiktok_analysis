package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15PL, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15PL {
    public static final C15PP Companion;
    public static final C15PL DUAL_SCREEN;
    public static final /* synthetic */ C15PL[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C15PL SINGLE_SCREEN;
    public final int LL;

    public static InterfaceC2044707zh<C15PL> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v4, types: [X.15PP] */
    static {
        C15PL c15pl = new C15PL("SINGLE_SCREEN", 0, 0);
        SINGLE_SCREEN = c15pl;
        C15PL c15pl2 = new C15PL("DUAL_SCREEN", 1, 1);
        DUAL_SCREEN = c15pl2;
        C15PL[] c15plArr = {c15pl, c15pl2};
        LLILLJJLI = c15plArr;
        LLILLL = new C2254308sP(c15plArr);
        Companion = new Object() { // from class: X.15PP
        };
    }

    public static C15PL[] values() {
        return (C15PL[]) LLILLJJLI.clone();
    }

    public final int getId() {
        return this.LL;
    }

    public static C15PL valueOf(String str) {
        return (C15PL) C08FF.LIZ(C15PL.class, str);
    }

    public C15PL(String str, int i, int i2) {
        this.LL = i2;
    }
}
