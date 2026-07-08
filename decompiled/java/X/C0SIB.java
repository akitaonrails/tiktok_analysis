package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0SIB, reason: invalid class name */
/* JADX INFO: loaded from: classes12.dex */
public final class C0SIB {
    public static final /* synthetic */ C0SIB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0SIB ONLINE;
    public static final C0SIB STRENGTHEN;
    public static final C0SIB WEAKEN;
    public final String LL;

    public static InterfaceC2044707zh<C0SIB> getEntries() {
        return LLILLL;
    }

    static {
        C0SIB c0sib = new C0SIB("STRENGTHEN", 0, "strengthen");
        STRENGTHEN = c0sib;
        C0SIB c0sib2 = new C0SIB("ONLINE", 1, "online");
        ONLINE = c0sib2;
        C0SIB c0sib3 = new C0SIB("WEAKEN", 2, "weaken");
        WEAKEN = c0sib3;
        C0SIB[] c0sibArr = {c0sib, c0sib2, c0sib3};
        LLILLJJLI = c0sibArr;
        LLILLL = new C2254308sP(c0sibArr);
    }

    public static C0SIB[] values() {
        return (C0SIB[]) LLILLJJLI.clone();
    }

    public final String getEtUITypeV1() {
        return this.LL;
    }

    public static C0SIB valueOf(String str) {
        return (C0SIB) C08FF.LIZ(C0SIB.class, str);
    }

    public C0SIB(String str, int i, String str2) {
        this.LL = str2;
    }
}
