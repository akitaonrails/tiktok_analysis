package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15WE, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15WE {
    public static final C15WF Companion;
    public static final C15WE FROM_DISKCACHE;
    public static final C15WE FROM_MEMORYCACHE;
    public static final C15WE FROM_NETWORK;
    public static final C15WE FROM_UNKNOW;
    public static final /* synthetic */ C15WE[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public final int LL;

    public static InterfaceC2044707zh<C15WE> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.15WF] */
    static {
        C15WE c15we = new C15WE("FROM_NETWORK", 0, 0);
        FROM_NETWORK = c15we;
        C15WE c15we2 = new C15WE("FROM_DISKCACHE", 1, 2);
        FROM_DISKCACHE = c15we2;
        C15WE c15we3 = new C15WE("FROM_MEMORYCACHE", 2, 1);
        FROM_MEMORYCACHE = c15we3;
        C15WE c15we4 = new C15WE("FROM_UNKNOW", 3, -1);
        FROM_UNKNOW = c15we4;
        C15WE[] c15weArr = {c15we, c15we2, c15we3, c15we4};
        LLILLJJLI = c15weArr;
        LLILLL = new C2254308sP(c15weArr);
        Companion = new Object() { // from class: X.15WF
        };
    }

    public static C15WE[] values() {
        return (C15WE[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C15WE valueOf(String str) {
        return (C15WE) C08FF.LIZ(C15WE.class, str);
    }

    public C15WE(String str, int i, int i2) {
        this.LL = i2;
    }
}
