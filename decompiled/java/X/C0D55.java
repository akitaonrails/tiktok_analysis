package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0D55, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0D55 {
    public static final /* synthetic */ C0D55[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0D55 ORDER_CENTER;
    public static final C0D55 THANKYOU_PAGE;
    public final String LL;

    public static InterfaceC2044707zh<C0D55> getEntries() {
        return LLILLL;
    }

    static {
        C0D55 c0d55 = new C0D55("THANKYOU_PAGE", 0, "thankyou_page");
        THANKYOU_PAGE = c0d55;
        C0D55 c0d552 = new C0D55("ORDER_CENTER", 1, "order_center");
        ORDER_CENTER = c0d552;
        C0D55[] c0d55Arr = {c0d55, c0d552};
        LLILLJJLI = c0d55Arr;
        LLILLL = new C2254308sP(c0d55Arr);
    }

    public static C0D55[] values() {
        return (C0D55[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0D55 valueOf(String str) {
        return (C0D55) C08FF.LIZ(C0D55.class, str);
    }

    public C0D55(String str, int i, String str2) {
        this.LL = str2;
    }
}
