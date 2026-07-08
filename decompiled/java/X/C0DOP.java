package X;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: renamed from: X.0DOP, reason: invalid class name */
/* JADX INFO: loaded from: classes5.dex */
public final class C0DOP {
    public static final C0DOP EXPLORE_GROUP_JOIN;
    public static final C0DOP EXPLORE_GROUP_REQUESTED;
    public static final /* synthetic */ C0DOP[] LLILLJJLI;
    public static final /* synthetic */ C2254308sP LLILLL;
    public static final C0DOP MY_GROUP_VIEW;
    public final String LL;

    public static InterfaceC2044707zh<C0DOP> getEntries() {
        return LLILLL;
    }

    static {
        C0DOP c0dop = new C0DOP("MY_GROUP_VIEW", 0, "my_group_view");
        MY_GROUP_VIEW = c0dop;
        C0DOP c0dop2 = new C0DOP("EXPLORE_GROUP_JOIN", 1, "explore_group_join");
        EXPLORE_GROUP_JOIN = c0dop2;
        C0DOP c0dop3 = new C0DOP("EXPLORE_GROUP_REQUESTED", 2, "explore_group_requested");
        EXPLORE_GROUP_REQUESTED = c0dop3;
        C0DOP[] c0dopArr = {c0dop, c0dop2, c0dop3};
        LLILLJJLI = c0dopArr;
        LLILLL = new C2254308sP(c0dopArr);
    }

    public static C0DOP[] values() {
        return (C0DOP[]) LLILLJJLI.clone();
    }

    public final String getParamValue() {
        return this.LL;
    }

    public static C0DOP valueOf(String str) {
        return (C0DOP) C08FF.LIZ(C0DOP.class, str);
    }

    public C0DOP(String str, int i, String str2) {
        this.LL = str2;
    }
}
