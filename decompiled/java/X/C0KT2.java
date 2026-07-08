package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0KT2, reason: invalid class name */
/* JADX INFO: loaded from: classes8.dex */
public final class C0KT2 {
    public static final C0KT2 INDEPENDENT_PURCHASE_PAGE;
    public static final C0KT2 JOIN_GUIDE_PAGE;
    public static final /* synthetic */ C0KT2[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0KT2 OTHERS;
    public static final C0KT2 PREFETCH;
    public static final C0KT2 SUPER_FAN_GOAL;
    public static final C0KT2 SUPER_FAN_PRIVILEGE;
    public final String LL;

    public static InterfaceC2044707zh<C0KT2> getEntries() {
        return LLILLL;
    }

    static {
        C0KT2 c0kt2 = new C0KT2("JOIN_GUIDE_PAGE", 0, "join_guide_page");
        JOIN_GUIDE_PAGE = c0kt2;
        C0KT2 c0kt22 = new C0KT2("INDEPENDENT_PURCHASE_PAGE", 1, "superfan_purchase_page");
        INDEPENDENT_PURCHASE_PAGE = c0kt22;
        C0KT2 c0kt23 = new C0KT2("SUPER_FAN_GOAL", 2, "superfan_goal");
        SUPER_FAN_GOAL = c0kt23;
        C0KT2 c0kt24 = new C0KT2("SUPER_FAN_PRIVILEGE", 3, "super_fan_privilege");
        SUPER_FAN_PRIVILEGE = c0kt24;
        C0KT2 c0kt25 = new C0KT2("PREFETCH", 4, "prefetch");
        PREFETCH = c0kt25;
        C0KT2 c0kt26 = new C0KT2("OTHERS", 5, "others");
        OTHERS = c0kt26;
        C0KT2[] c0kt2Arr = {c0kt2, c0kt22, c0kt23, c0kt24, c0kt25, c0kt26};
        LLILLJJLI = c0kt2Arr;
        LLILLL = new C2254308sP(c0kt2Arr);
    }

    public static C0KT2[] values() {
        return (C0KT2[]) LLILLJJLI.clone();
    }

    public final String getValue() {
        return this.LL;
    }

    public static C0KT2 valueOf(String str) {
        return (C0KT2) C08FF.LIZ(C0KT2.class, str);
    }

    public C0KT2(String str, int i, String str2) {
        this.LL = str2;
    }
}
