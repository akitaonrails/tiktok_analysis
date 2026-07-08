package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0QDJ, reason: invalid class name */
/* JADX INFO: loaded from: classes11.dex */
public final class C0QDJ {
    public static final /* synthetic */ C0QDJ[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;
    public static final C0QDJ MALL_FEED;
    public static final C0QDJ NO_ECOM;
    public static final C0QDJ ORDER_CENTER_IN_MALL;
    public static final C0QDJ ORDER_CENTER_OUT_MALL;
    public static final C0QDJ SHOP_TAB_IN_GENERAL;
    public static final C0QDJ SHOP_TAB_IN_MALL;
    public static final C0QDJ VIDEO_TAB_IN_SIMPLE;

    public static InterfaceC2044707zh<C0QDJ> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0QDJ c0qdj = new C0QDJ("SHOP_TAB_IN_MALL", 0);
        SHOP_TAB_IN_MALL = c0qdj;
        C0QDJ c0qdj2 = new C0QDJ("SHOP_TAB_IN_GENERAL", 1);
        SHOP_TAB_IN_GENERAL = c0qdj2;
        C0QDJ c0qdj3 = new C0QDJ("MALL_FEED", 2);
        MALL_FEED = c0qdj3;
        C0QDJ c0qdj4 = new C0QDJ("ORDER_CENTER_IN_MALL", 3);
        ORDER_CENTER_IN_MALL = c0qdj4;
        C0QDJ c0qdj5 = new C0QDJ("ORDER_CENTER_OUT_MALL", 4);
        ORDER_CENTER_OUT_MALL = c0qdj5;
        C0QDJ c0qdj6 = new C0QDJ("NO_ECOM", 5);
        NO_ECOM = c0qdj6;
        C0QDJ c0qdj7 = new C0QDJ("VIDEO_TAB_IN_SIMPLE", 6);
        VIDEO_TAB_IN_SIMPLE = c0qdj7;
        C0QDJ[] c0qdjArr = {c0qdj, c0qdj2, c0qdj3, c0qdj4, c0qdj5, c0qdj6, c0qdj7};
        LL = c0qdjArr;
        LLILLJJLI = new C2254308sP(c0qdjArr);
    }

    public static C0QDJ[] values() {
        return (C0QDJ[]) LL.clone();
    }

    public static C0QDJ valueOf(String str) {
        return (C0QDJ) C08FF.LIZ(C0QDJ.class, str);
    }

    public C0QDJ(String str, int i) {
    }
}
