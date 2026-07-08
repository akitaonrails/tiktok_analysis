package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15TH, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15TH {
    public static final C15TH COLD_OPEN;
    public static final C15TH INSERT_CARD;
    public static final /* synthetic */ C15TH[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C15TH LOAD_MORE;
    public static final C15TH PRELOAD;
    public static final C15TH PRELOAD_INSERT_CARD;
    public static final C15TH REFRESH;
    public static final C15TH SERVER_UG;
    public final int LL;

    public static InterfaceC2044707zh<C15TH> getEntries() {
        return LLILLL;
    }

    static {
        C15TH c15th = new C15TH("REFRESH", 0, 1);
        REFRESH = c15th;
        C15TH c15th2 = new C15TH("LOAD_MORE", 1, 2);
        LOAD_MORE = c15th2;
        C15TH c15th3 = new C15TH("COLD_OPEN", 2, 4);
        COLD_OPEN = c15th3;
        C15TH c15th4 = new C15TH("PRELOAD", 3, 8);
        PRELOAD = c15th4;
        C15TH c15th5 = new C15TH("INSERT_CARD", 4, 16);
        INSERT_CARD = c15th5;
        C15TH c15th6 = new C15TH("PRELOAD_INSERT_CARD", 5, 32);
        PRELOAD_INSERT_CARD = c15th6;
        C15TH c15th7 = new C15TH("SERVER_UG", 6, 19);
        SERVER_UG = c15th7;
        C15TH[] c15thArr = {c15th, c15th2, c15th3, c15th4, c15th5, c15th6, c15th7};
        LLILLJJLI = c15thArr;
        LLILLL = new C2254308sP(c15thArr);
    }

    public static C15TH[] values() {
        return (C15TH[]) LLILLJJLI.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        StringBuilder sbLIZ = C2188811AlT.LIZ();
        sbLIZ.append("name ");
        sbLIZ.append(name());
        sbLIZ.append(", value: ");
        sbLIZ.append(this.LL);
        return C2188811AlT.LIZIZ(sbLIZ);
    }

    public final int getValue() {
        return this.LL;
    }

    public static C15TH valueOf(String str) {
        return (C15TH) C08FF.LIZ(C15TH.class, str);
    }

    public C15TH(String str, int i, int i2) {
        this.LL = i2;
    }
}
