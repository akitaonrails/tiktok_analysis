package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.043T, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C043T {
    public static final C043T BELOW_COUNTER;
    public static final /* synthetic */ C043T[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C043T RIGHT_OF_QUANTITY;
    public final int LL;

    public static InterfaceC2044707zh<C043T> getEntries() {
        return LLILLL;
    }

    static {
        C043T c043t = new C043T("RIGHT_OF_QUANTITY", 0, 0);
        RIGHT_OF_QUANTITY = c043t;
        C043T c043t2 = new C043T("BELOW_COUNTER", 1, 1);
        BELOW_COUNTER = c043t2;
        C043T[] c043tArr = {c043t, c043t2};
        LLILLJJLI = c043tArr;
        LLILLL = new C2254308sP(c043tArr);
    }

    public static C043T[] values() {
        return (C043T[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C043T valueOf(String str) {
        return (C043T) C08FF.LIZ(C043T.class, str);
    }

    public C043T(String str, int i, int i2) {
        this.LL = i2;
    }
}
