package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.15VB, reason: invalid class name */
/* JADX INFO: loaded from: classes32.dex */
public final class C15VB {
    public static final C15VB CACHE;
    public static final C20531215Vm Companion;
    public static final C15VB FAKE_REFRESH;
    public static final C15VB HOT_CACHE;
    public static final C15VB INSERT_CARD;
    public static final /* synthetic */ C15VB[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C15VB LOADMORE;
    public static final C15VB PRELOAD;
    public static final C15VB REFRESH;
    public static final C15VB UG_CARD;
    public static final C15VB UNKNOWN;
    public final int LL;

    public static InterfaceC2044707zh<C15VB> getEntries() {
        return LLILLL;
    }

    /* JADX WARN: Type inference failed for: r0v9, types: [X.15Vm] */
    static {
        C15VB c15vb = new C15VB("UNKNOWN", 0, 0);
        UNKNOWN = c15vb;
        C15VB c15vb2 = new C15VB("CACHE", 1, 1);
        CACHE = c15vb2;
        C15VB c15vb3 = new C15VB("REFRESH", 2, 2);
        REFRESH = c15vb3;
        C15VB c15vb4 = new C15VB("PRELOAD", 3, 3);
        PRELOAD = c15vb4;
        C15VB c15vb5 = new C15VB("LOADMORE", 4, 4);
        LOADMORE = c15vb5;
        C15VB c15vb6 = new C15VB("FAKE_REFRESH", 5, 5);
        FAKE_REFRESH = c15vb6;
        C15VB c15vb7 = new C15VB("INSERT_CARD", 6, 6);
        INSERT_CARD = c15vb7;
        C15VB c15vb8 = new C15VB("HOT_CACHE", 7, 7);
        HOT_CACHE = c15vb8;
        C15VB c15vb9 = new C15VB("UG_CARD", 8, 8);
        UG_CARD = c15vb9;
        C15VB[] c15vbArr = {c15vb, c15vb2, c15vb3, c15vb4, c15vb5, c15vb6, c15vb7, c15vb8, c15vb9};
        LLILLJJLI = c15vbArr;
        LLILLL = new C2254308sP(c15vbArr);
        Companion = new Object() { // from class: X.15Vm
        };
    }

    public static C15VB[] values() {
        return (C15VB[]) LLILLJJLI.clone();
    }

    public final int getValue() {
        return this.LL;
    }

    public static C15VB valueOf(String str) {
        return (C15VB) C08FF.LIZ(C15VB.class, str);
    }

    public C15VB(String str, int i, int i2) {
        this.LL = i2;
    }
}
