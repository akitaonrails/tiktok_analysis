package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZDV, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZDV {
    public static final C0ZDV AUDITING;
    public static final /* synthetic */ C0ZDV[] LLILLL;
    public static final /* synthetic */ C2254308sP LLILZ;
    public static final C0ZDV PASS;
    public static final C0ZDV REJECT;
    public static final C0ZDV SUSPICIOUS;
    public static final C0ZDV UNKNOWN;
    public final int LL;
    public final String LLILLJJLI;

    public static InterfaceC2044707zh<C0ZDV> getEntries() {
        return LLILZ;
    }

    static {
        C0ZDV c0zdv = new C0ZDV("UNKNOWN", 0, 0, "unknown");
        UNKNOWN = c0zdv;
        C0ZDV c0zdv2 = new C0ZDV("AUDITING", 1, 1, "auditing");
        AUDITING = c0zdv2;
        C0ZDV c0zdv3 = new C0ZDV("PASS", 2, 2, "pass");
        PASS = c0zdv3;
        C0ZDV c0zdv4 = new C0ZDV("REJECT", 3, 3, "reject");
        REJECT = c0zdv4;
        C0ZDV c0zdv5 = new C0ZDV("SUSPICIOUS", 4, 4, "suspicious");
        SUSPICIOUS = c0zdv5;
        C0ZDV[] c0zdvArr = {c0zdv, c0zdv2, c0zdv3, c0zdv4, c0zdv5};
        LLILLL = c0zdvArr;
        LLILZ = new C2254308sP(c0zdvArr);
    }

    public static C0ZDV[] values() {
        return (C0ZDV[]) LLILLL.clone();
    }

    public final int getStatus() {
        return this.LL;
    }

    public final String getStatusName() {
        return this.LLILLJJLI;
    }

    public static C0ZDV valueOf(String str) {
        return (C0ZDV) C08FF.LIZ(C0ZDV.class, str);
    }

    public C0ZDV(String str, int i, int i2, String str2) {
        this.LL = i2;
        this.LLILLJJLI = str2;
    }
}
