package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.043R, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C043R {
    public static final /* synthetic */ C043R[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C043R LOW_STOCK;
    public static final C043R MINIMUM_BUY;
    public static final C043R PROMOTION_LIMIT;
    public final int LL;

    public static InterfaceC2044707zh<C043R> getEntries() {
        return LLILLL;
    }

    static {
        C043R c043r = new C043R("PROMOTION_LIMIT", 0, 1);
        PROMOTION_LIMIT = c043r;
        C043R c043r2 = new C043R("MINIMUM_BUY", 1, 2);
        MINIMUM_BUY = c043r2;
        C043R c043r3 = new C043R("LOW_STOCK", 2, 0);
        LOW_STOCK = c043r3;
        C043R[] c043rArr = {c043r, c043r2, c043r3};
        LLILLJJLI = c043rArr;
        LLILLL = new C2254308sP(c043rArr);
    }

    public static C043R[] values() {
        return (C043R[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C043R valueOf(String str) {
        return (C043R) C08FF.LIZ(C043R.class, str);
    }

    public C043R(String str, int i, int i2) {
        this.LL = i2;
    }
}
