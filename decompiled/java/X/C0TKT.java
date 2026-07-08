package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0TKT, reason: invalid class name */
/* JADX INFO: loaded from: classes13.dex */
public final class C0TKT {
    public static final C0TKT AVOID_CONFLICT;
    public static final C0TKT FREQUENCY_CONTROL;
    public static final /* synthetic */ C0TKT[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0TKT WATCH_DURATION_NOT;
    public final String LL;

    public static InterfaceC2044707zh<C0TKT> getEntries() {
        return LLILLL;
    }

    static {
        C0TKT c0tkt = new C0TKT("WATCH_DURATION_NOT", 0, "WATCH_DURATION_NOT");
        WATCH_DURATION_NOT = c0tkt;
        C0TKT c0tkt2 = new C0TKT("FREQUENCY_CONTROL", 1, "FREQUENCY_CONTROL");
        FREQUENCY_CONTROL = c0tkt2;
        C0TKT c0tkt3 = new C0TKT("AVOID_CONFLICT", 2, "AVOID_CONFLICT");
        AVOID_CONFLICT = c0tkt3;
        C0TKT[] c0tktArr = {c0tkt, c0tkt2, c0tkt3};
        LLILLJJLI = c0tktArr;
        LLILLL = new C2254308sP(c0tktArr);
    }

    public static C0TKT[] values() {
        return (C0TKT[]) LLILLJJLI.clone();
    }

    public final String getReason() {
        return this.LL;
    }

    public static C0TKT valueOf(String str) {
        return (C0TKT) C08FF.LIZ(C0TKT.class, str);
    }

    public C0TKT(String str, int i, String str2) {
        this.LL = str2;
    }
}
