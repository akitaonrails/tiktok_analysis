package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0ZHB, reason: invalid class name */
/* JADX INFO: loaded from: classes15.dex */
public final class C0ZHB {
    public static final C0ZHB FIRST_ITEM_FILL_BOTTOM;
    public static final C0ZHB FIRST_ITEM_FILL_TOP;
    public static final C0ZHB LAST_ITEM_FILL_BOTTOM;
    public static final C0ZHB LAST_ITEM_FILL_TOP;
    public static final /* synthetic */ C0ZHB[] LL;
    public static final /* synthetic */ C2254308sP LLILLJJLI;

    public static InterfaceC2044707zh<C0ZHB> getEntries() {
        return LLILLJJLI;
    }

    static {
        C0ZHB c0zhb = new C0ZHB("FIRST_ITEM_FILL_TOP", 0);
        FIRST_ITEM_FILL_TOP = c0zhb;
        C0ZHB c0zhb2 = new C0ZHB("FIRST_ITEM_FILL_BOTTOM", 1);
        FIRST_ITEM_FILL_BOTTOM = c0zhb2;
        C0ZHB c0zhb3 = new C0ZHB("LAST_ITEM_FILL_TOP", 2);
        LAST_ITEM_FILL_TOP = c0zhb3;
        C0ZHB c0zhb4 = new C0ZHB("LAST_ITEM_FILL_BOTTOM", 3);
        LAST_ITEM_FILL_BOTTOM = c0zhb4;
        C0ZHB[] c0zhbArr = {c0zhb, c0zhb2, c0zhb3, c0zhb4};
        LL = c0zhbArr;
        LLILLJJLI = new C2254308sP(c0zhbArr);
    }

    public static C0ZHB[] values() {
        return (C0ZHB[]) LL.clone();
    }

    public static C0ZHB valueOf(String str) {
        return (C0ZHB) C08FF.LIZ(C0ZHB.class, str);
    }

    public C0ZHB(String str, int i) {
    }
}
