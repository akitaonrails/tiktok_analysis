package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15MV, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15MV {
    public static final C15MV LIVE;
    public static final /* synthetic */ C15MV[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C15MV OTHER;
    public static final C15MV REGION_UNAVAILABLE;
    public static final C15MV SELLER_DEACTIVE;
    public static final C15MV SOLD_OUT;
    public final int LL;

    public static InterfaceC2044707zh<C15MV> getEntries() {
        return LLILLL;
    }

    static {
        C15MV c15mv = new C15MV("LIVE", 0, 1);
        LIVE = c15mv;
        C15MV c15mv2 = new C15MV("SOLD_OUT", 1, 2);
        SOLD_OUT = c15mv2;
        C15MV c15mv3 = new C15MV("SELLER_DEACTIVE", 2, 3);
        SELLER_DEACTIVE = c15mv3;
        C15MV c15mv4 = new C15MV("REGION_UNAVAILABLE", 3, 4);
        REGION_UNAVAILABLE = c15mv4;
        C15MV c15mv5 = new C15MV("OTHER", 4, 100);
        OTHER = c15mv5;
        C15MV[] c15mvArr = {c15mv, c15mv2, c15mv3, c15mv4, c15mv5};
        LLILLJJLI = c15mvArr;
        LLILLL = new C2254308sP(c15mvArr);
    }

    public static C15MV[] values() {
        return (C15MV[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C15MV valueOf(String str) {
        return (C15MV) C08FF.LIZ(C15MV.class, str);
    }

    public C15MV(String str, int i, int i2) {
        this.LL = i2;
    }
}
