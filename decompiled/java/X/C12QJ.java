package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.12QJ, reason: invalid class name */
/* JADX INFO: loaded from: classes30.dex */
public final class C12QJ {
    public static final C12QJ CANCEL;
    public static final C12QN Companion;
    public static final /* synthetic */ C12QJ[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C12QJ NONE;
    public static final C12QJ OK;
    public static final C12QJ SETTINGS;
    public final int LL;

    public static InterfaceC2044707zh<C12QJ> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [X.12QN] */
    static {
        C12QJ c12qj = new C12QJ("NONE", 0, 0);
        NONE = c12qj;
        C12QJ c12qj2 = new C12QJ("OK", 1, 1);
        OK = c12qj2;
        C12QJ c12qj3 = new C12QJ("CANCEL", 2, 2);
        CANCEL = c12qj3;
        C12QJ c12qj4 = new C12QJ("SETTINGS", 3, 3);
        SETTINGS = c12qj4;
        C12QJ[] c12qjArr = {c12qj, c12qj2, c12qj3, c12qj4};
        LLILLJJLI = c12qjArr;
        LLILLL = new C2254308sP(c12qjArr);
        Companion = new Object() { // from class: X.12QN
        };
    }

    public static C12QJ[] values() {
        return (C12QJ[]) LLILLJJLI.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        int i = C12QI.LIZ[ordinal()];
        if (i == 1) {
            return "NONE";
        }
        if (i == 2) {
            return "OK";
        }
        if (i == 3) {
            return "CANCEL";
        }
        if (i == 4) {
            return "SETTINGS";
        }
        throw new C1954807lC();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C12QJ valueOf(String str) {
        return (C12QJ) C08FF.LIZ(C12QJ.class, str);
    }

    public C12QJ(String str, int i, int i2) {
        this.LL = i2;
    }
}
