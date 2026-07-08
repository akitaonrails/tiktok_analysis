package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.043Q, reason: invalid class name */
/* JADX INFO: loaded from: classes2.dex */
public final class C043Q {
    public static final C043Q BUY_STYLE;
    public static final C043Q CART_ICON_STYLE;
    public static final C043Q CART_STYLE;
    public static final C043Q GRAY;
    public static final C043Q ICON_WITH_TEXT;
    public static final /* synthetic */ C043Q[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C043Q RED_STYLE;
    public static final C043Q WHITE_STYLE;
    public final int LL;

    public static InterfaceC2044707zh<C043Q> getEntries() {
        return LLILLL;
    }

    static {
        C043Q c043q = new C043Q("ICON_WITH_TEXT", 0, 1);
        ICON_WITH_TEXT = c043q;
        C043Q c043q2 = new C043Q("CART_STYLE", 1, 2);
        CART_STYLE = c043q2;
        C043Q c043q3 = new C043Q("BUY_STYLE", 2, 3);
        BUY_STYLE = c043q3;
        C043Q c043q4 = new C043Q("GRAY", 3, 4);
        GRAY = c043q4;
        C043Q c043q5 = new C043Q("WHITE_STYLE", 4, 5);
        WHITE_STYLE = c043q5;
        C043Q c043q6 = new C043Q("RED_STYLE", 5, 6);
        RED_STYLE = c043q6;
        C043Q c043q7 = new C043Q("CART_ICON_STYLE", 6, 7);
        CART_ICON_STYLE = c043q7;
        C043Q[] c043qArr = {c043q, c043q2, c043q3, c043q4, c043q5, c043q6, c043q7};
        LLILLJJLI = c043qArr;
        LLILLL = new C2254308sP(c043qArr);
    }

    public static C043Q[] values() {
        return (C043Q[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C043Q valueOf(String str) {
        return (C043Q) C08FF.LIZ(C043Q.class, str);
    }

    public C043Q(String str, int i, int i2) {
        this.LL = i2;
    }
}
