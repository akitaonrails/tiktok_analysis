package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.1AHM, reason: invalid class name */
/* JADX INFO: loaded from: classes34.dex */
public final class C1AHM {
    public static final C1AHQ Companion;
    public static final C1AHM GATED;
    public static final /* synthetic */ C1AHM[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C1AHM PERMISSION;
    public static final C1AHM PRIVATE;
    public static final C1AHM REUSE;
    public static final C1AHM RISK;
    public static final C1AHM TRAFFIC;
    public static final C1AHM UNKNOWN;

    public static InterfaceC2044707zh<C1AHM> getEntries() {
        return LLILLJJLI;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.1AHQ] */
    static {
        C1AHM c1ahm = new C1AHM("TRAFFIC", 0);
        TRAFFIC = c1ahm;
        C1AHM c1ahm2 = new C1AHM("PRIVATE", 1);
        PRIVATE = c1ahm2;
        C1AHM c1ahm3 = new C1AHM("REUSE", 2);
        REUSE = c1ahm3;
        C1AHM c1ahm4 = new C1AHM("RISK", 3);
        RISK = c1ahm4;
        C1AHM c1ahm5 = new C1AHM("GATED", 4);
        GATED = c1ahm5;
        C1AHM c1ahm6 = new C1AHM("UNKNOWN", 5);
        UNKNOWN = c1ahm6;
        C1AHM c1ahm7 = new C1AHM("PERMISSION", 6);
        PERMISSION = c1ahm7;
        C1AHM[] c1ahmArr = {c1ahm, c1ahm2, c1ahm3, c1ahm4, c1ahm5, c1ahm6, c1ahm7};
        LL = c1ahmArr;
        LLILLJJLI = new C2254308sP(c1ahmArr);
        Companion = new Object() { // from class: X.1AHQ
        };
    }

    public static C1AHM[] values() {
        return (C1AHM[]) LL.clone();
    }

    public static C1AHM valueOf(String str) {
        return (C1AHM) C08FF.LIZ(C1AHM.class, str);
    }

    public C1AHM(String str, int i) {
    }
}
