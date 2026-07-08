package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15TI, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15TI {
    public static final C15TI CACHE;
    public static final C15TI FAKE_REFRESH;
    public static final C15TI HOT_CACHE;
    public static final C15TI INSERT_CARD;
    public static final /* synthetic */ C15TI[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C15TI LOADMORE;
    public static final C15TI PRELOAD;
    public static final C15TI REFRESH;
    public static final C15TI UG_CARD;
    public static final C15TI UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<C15TI> getEntries() {
        return LLILLL;
    }

    static {
        C15TI c15ti = new C15TI("UNKNOWN", 0, 0);
        UNKNOWN = c15ti;
        C15TI c15ti2 = new C15TI("CACHE", 1, 1);
        CACHE = c15ti2;
        C15TI c15ti3 = new C15TI("REFRESH", 2, 2);
        REFRESH = c15ti3;
        C15TI c15ti4 = new C15TI("PRELOAD", 3, 3);
        PRELOAD = c15ti4;
        C15TI c15ti5 = new C15TI("LOADMORE", 4, 4);
        LOADMORE = c15ti5;
        C15TI c15ti6 = new C15TI("FAKE_REFRESH", 5, 5);
        FAKE_REFRESH = c15ti6;
        C15TI c15ti7 = new C15TI("INSERT_CARD", 6, 6);
        INSERT_CARD = c15ti7;
        C15TI c15ti8 = new C15TI("HOT_CACHE", 7, 7);
        HOT_CACHE = c15ti8;
        C15TI c15ti9 = new C15TI("UG_CARD", 8, 8);
        UG_CARD = c15ti9;
        C15TI[] c15tiArr = {c15ti, c15ti2, c15ti3, c15ti4, c15ti5, c15ti6, c15ti7, c15ti8, c15ti9};
        LLILLJJLI = c15tiArr;
        LLILLL = new C2254308sP(c15tiArr);
    }

    public static C15TI[] values() {
        return (C15TI[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C15TI valueOf(String str) {
        return (C15TI) C08FF.LIZ(C15TI.class, str);
    }

    public C15TI(String str, int i, int i2) {
        this.LL = i2;
    }
}
