package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.03MG, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C03MG {
    public static final C03MG BONUS;
    public static final /* synthetic */ C03MG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C03MG RETENTION_NEWLY_COUPON;
    public final int LL;

    public static InterfaceC2044707zh<C03MG> getEntries() {
        return LLILLL;
    }

    static {
        C03MG c03mg = new C03MG("BONUS", 0, 1);
        BONUS = c03mg;
        C03MG c03mg2 = new C03MG("RETENTION_NEWLY_COUPON", 1, 2);
        RETENTION_NEWLY_COUPON = c03mg2;
        C03MG[] c03mgArr = {c03mg, c03mg2};
        LLILLJJLI = c03mgArr;
        LLILLL = new C2254308sP(c03mgArr);
    }

    public static C03MG[] values() {
        return (C03MG[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C03MG valueOf(String str) {
        return (C03MG) C08FF.LIZ(C03MG.class, str);
    }

    public C03MG(String str, int i, int i2) {
        this.LL = i2;
    }
}
