package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.008H, reason: invalid class name */
/* JADX INFO: loaded from: classes.dex */
public final class C008H {
    public static final /* synthetic */ C008H[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C008H PRICE;
    public static final C008H SHOP_STATUS_MSG;

    public static InterfaceC2044707zh<C008H> getEntries() {
        return LLILLJJLI;
    }

    static {
        C008H c008h = new C008H("PRICE", 0);
        PRICE = c008h;
        C008H c008h2 = new C008H("SHOP_STATUS_MSG", 1);
        SHOP_STATUS_MSG = c008h2;
        C008H[] c008hArr = {c008h, c008h2};
        LL = c008hArr;
        LLILLJJLI = new C2254308sP(c008hArr);
    }

    public static C008H[] values() {
        return (C008H[]) LL.clone();
    }

    public static C008H valueOf(String str) {
        return (C008H) C08FF.LIZ(C008H.class, str);
    }

    public C008H(String str, int i) {
    }
}
