package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.09YG, reason: invalid class name */
/* JADX INFO: loaded from: classes4.dex */
public final class C09YG {
    public static final /* synthetic */ C09YG[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C09YG TYPE_CLICK;
    public static final C09YG TYPE_DETAIL;
    public static final C09YG TYPE_FULL_LIST_CLICK;
    public static final C09YG TYPE_FULL_LIST_SHOW;
    public static final C09YG TYPE_INFO_CLICK;
    public static final C09YG TYPE_INFO_COLLECT;
    public static final C09YG TYPE_SETTING_PANEL_SHOW;
    public static final C09YG TYPE_SHOW;
    public final int LL;

    public static InterfaceC2044707zh<C09YG> getEntries() {
        return LLILLL;
    }

    static {
        C09YG c09yg = new C09YG("TYPE_CLICK", 0, 1);
        TYPE_CLICK = c09yg;
        C09YG c09yg2 = new C09YG("TYPE_SHOW", 1, 2);
        TYPE_SHOW = c09yg2;
        C09YG c09yg3 = new C09YG("TYPE_DETAIL", 2, 3);
        TYPE_DETAIL = c09yg3;
        C09YG c09yg4 = new C09YG("TYPE_INFO_CLICK", 3, 4);
        TYPE_INFO_CLICK = c09yg4;
        C09YG c09yg5 = new C09YG("TYPE_INFO_COLLECT", 4, 5);
        TYPE_INFO_COLLECT = c09yg5;
        C09YG c09yg6 = new C09YG("TYPE_SETTING_PANEL_SHOW", 5, 6);
        TYPE_SETTING_PANEL_SHOW = c09yg6;
        C09YG c09yg7 = new C09YG("TYPE_FULL_LIST_SHOW", 6, 7);
        TYPE_FULL_LIST_SHOW = c09yg7;
        C09YG c09yg8 = new C09YG("TYPE_FULL_LIST_CLICK", 7, 8);
        TYPE_FULL_LIST_CLICK = c09yg8;
        C09YG[] c09ygArr = {c09yg, c09yg2, c09yg3, c09yg4, c09yg5, c09yg6, c09yg7, c09yg8};
        LLILLJJLI = c09ygArr;
        LLILLL = new C2254308sP(c09ygArr);
    }

    public static C09YG[] values() {
        return (C09YG[]) LLILLJJLI.clone();
    }

    public final int getType() {
        return this.LL;
    }

    public static C09YG valueOf(String str) {
        return (C09YG) C08FF.LIZ(C09YG.class, str);
    }

    public C09YG(String str, int i, int i2) {
        this.LL = i2;
    }
}
